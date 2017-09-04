package io.regna.internal;

import util.CommonUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import java.util.logging.Logger;

@SuppressWarnings("unused")
public final class RStruct implements Serializable {

    private ByteArrayOutputStream internal_bytes = new ByteArrayOutputStream();
    private ByteArrayOutputStream external_bytes = new ByteArrayOutputStream();
    private DataOutputStream internal;
    private DataOutputStream external;
    protected HashMap<String, Object> values;
    private byte[] header;
    protected transient RStructDef structDef;
    protected StructHeader structHeader;
    public static final Logger LOG = Logger.getLogger("struct");
    private static final byte[] unique_byte_maigc = {(byte)0x7A, (byte)0x20, (byte)0x17, (byte)0x24};
    protected static final byte[] string_magic = "regna_struct".getBytes(StandardCharsets.ISO_8859_1);
    protected static final byte[] magic;
    private static int offset = 0;


    static {
        magic = CommonUtils.arrayMerge(string_magic, unique_byte_maigc);
    }

    private RStruct(StructHeader structHeader, HashMap<String, Object> values, byte[] header) {
        this.structHeader = structHeader;
        internal = new DataOutputStream(internal_bytes);
        external = new DataOutputStream(external_bytes);
        writeMagic();
    }

    public RStruct(RStructDef structDef){
        this.structDef = structDef;
        values = new HashMap<>();
        structHeader = new StructHeader(structDef);
        internal = new DataOutputStream(internal_bytes);
        external = new DataOutputStream(external_bytes);
        writeMagic();
    }

    public void prepare(){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(baos);
            oos.writeObject(structHeader);
            oos.close();
            baos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        header = baos.toByteArray();
        //System.out.println("Header bytes:"+ Arrays.toString(header));
    }

    private void writeMagic(){
        try {
            external.write(magic, 0, magic.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Set the data of a value
     * @param name The name of the value
     * @param object The value
     */
    public void value(String name, Object object){
        if(structHeader.lookup(name)){
            values.put(name, object);
        } else throw new RuntimeException("Value " + name + " is not defined in struct " + structDef.name);
    }

    public void value(String name, boolean num){
        value(name, (Object)num);
    }

    public void value(String name, float num){
        value(name, (Object)num);
    }

    public void value(String name, byte num){
        value(name, (Object)num);
    }

    public void value(String name, double num){
        value(name, (Object)num);
    }

    public void value(String name, char num){
        value(name, (Object)num);
    }

    public void value(String name, int num){
        value(name, (Object)num);
    }

    public <T> T getvalue(String name, Class<T> clazz){
        return clazz.cast(values.get(name));
    }

    @Deprecated
    public Object getvalueO(String name) {
        Class<?> clazz;
        try {
            clazz = Class.forName(convertToWrapper(structHeader.getType(name)));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Class in Structure Definition is not loaded properly", e);
        }
        return getvalue(name, clazz);
    }

    public Object getvalue(String name) {
        return values.get(name);
    }

    public static class StructHeader  implements Serializable{

        public HashMap<String, String> vars;
        public String Meta;

        public StructHeader(RStructDef structDef){
            vars = structDef.complete_register;
            Meta = new UUID(System.currentTimeMillis(), System.nanoTime()).toString();
        }

        public boolean lookup(String name){
            return vars.containsKey(name);
        }
        public String getType(String name) {
            return vars.get(name);
        }

    }

    private static String convertToWrapper(String toconv) {
        switch (toconv) {

            case "float":
                return "Float";

            case "boolean":
                return "Boolean";

            case "byte":
                return "Byte";

            case "short":
                return "Short";

            case "int":
                return "Integer";

            default:
                return toconv;
        }
    }

    public void serialize(){
        values.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey());
            putname(entry.getKey());
            byteObject(entry.getValue());
        });
        try {
            //System.out.println(Arrays.toString(magic));
            if(header == null) throw new RuntimeException("Struct header " + structDef.name + " wasn't constructed on instantiation");
            external.writeInt(header.length);
            external.write(header);
            byte[] internal_data = internal_bytes.toByteArray();
            external.writeInt(internal_data.length);
            external.write(internal_data);
            internal_bytes.close();
            external_bytes.close();
            internal.close();
            external.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.write(Paths.get("test.bin"), external_bytes.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void byteObject(Object value){
        try{
            if(value instanceof Integer) internal.writeInt((int)value);
            else if(value instanceof Double) internal.writeDouble((double)value);
            else if(value instanceof Float) internal.writeFloat((float)value);
            else if(value instanceof Boolean) internal.writeInt((boolean)value ? 0 : 1);
            else if(value instanceof Long) internal.writeLong((long)value);
            else if(value instanceof Short) internal.writeShort((short) value);
            else if(value instanceof Byte) internal.write((byte) value);
            else if (value instanceof String) internal.writeUTF((String) value);
            else if(value instanceof Serializable) putObject(value);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    private void putname(String name) {
        byte[] bytes = name.getBytes(StandardCharsets.ISO_8859_1);
        try {
            internal.writeInt(bytes.length);
            internal.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void putObject(Object src){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(src);
            oos.close();
            baos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] data = baos.toByteArray();
        try {
            internal.writeInt(data.length);
            internal.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] readbytes(int length, DataInputStream dataInputStream) {
        byte[] ret = new byte[length];
        try {
            dataInputStream.readFully(ret, offset, length - offset);
            offset += length;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }

    public static int readints(DataInputStream dataInputStream) {
        try {
            int num = dataInputStream.readInt();
            offset += 4;
            return num;
        } catch (IOException e) {
            return 0;
        }
    }

    public static byte[] readarbbytes(DataInputStream dataInputStream) {
        byte[] data = null;
        try {
            int length = readints(dataInputStream);
            System.out.println(length);
            data = new byte[length];
            //System.out.println(data.length - offset > length ? "true" : "false");
            System.out.println(offset);
            dataInputStream.readFully(data, offset, length - offset);
            offset += length;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static float readfloats(DataInputStream dataInputStream) {
        try {
            return dataInputStream.readFloat();
        } catch (IOException e) {
            return 0f;
        }
    }

    public static boolean readboolean(DataInputStream dataInputStream) {
        try {
            return dataInputStream.readBoolean();
        } catch (IOException e) {
            return false;
        }
    }

    private static void updateValues(DataInputStream dataInputStream, String name, StructHeader structHeader, HashMap<String, Object> values) {
        if (structHeader.lookup(name)) {
            String type = convertToWrapper(structHeader.getType(name));
            switch (type) {
                case "Integer":
                    int value = readints(dataInputStream);
                    values.put(name, value);
                    break;

                case "Float":
                    float floatvalue = readfloats(dataInputStream);
                    values.put(name, floatvalue);
                    break;

                case "Boolean":
                    boolean boolvalue = readboolean(dataInputStream);
                    values.put(name, boolvalue);
                    break;

                case "Byte":
                    byte bytevalue = readbytes(1, dataInputStream)[0];
                    values.put(name, bytevalue);
                    break;
            }
        } else
            throw new RuntimeException("Invalid Binary Struct Serialization. ERROR: Header doesn't contain variable defined");
    }

    public static RStruct deserialize(byte[] data) {
        DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(data));
        byte[] magic_bytes = readbytes(magic.length, inputStream);
        System.out.println(Arrays.toString(magic_bytes));
        System.out.println(Arrays.toString(magic));
        if (magic_bytes.equals(magic)) throw new RuntimeException("Invalid struct header/magic");
        byte[] headerBytes = readarbbytes(inputStream);
        System.out.println(Arrays.toString(headerBytes));
        StructHeader headerObj = null;
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(headerBytes))) {
            headerObj = (StructHeader) ois.readObject();
            headerObj.vars.forEach((varname, vartype) -> {
                System.out.println(varname + " " + vartype);
            });
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        HashMap<String, Object> values = new HashMap<>();
        for (int x = 0; x < headerObj.vars.size(); x++) {
            String name = new String(readarbbytes(inputStream));
            System.out.println(name);
            updateValues(inputStream, name, headerObj, values);
        }
        return new RStruct(headerObj, values, headerBytes);
    }

}
