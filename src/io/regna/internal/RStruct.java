package io.regna.internal;

import util.CommonUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.UUID;
import java.util.logging.Logger;

@SuppressWarnings("unused")
public class RStruct implements Serializable{

    private ByteArrayOutputStream internal_bytes = new ByteArrayOutputStream();
    private ByteArrayOutputStream external_bytes = new ByteArrayOutputStream();
    private DataOutputStream internal;
    private DataOutputStream external;
    protected HashMap<String, Object> values;
    protected transient final RStructDef structDef;
    protected final StructHeader structHeader;
    public static final Logger LOG = Logger.getLogger("struct");
    private static final byte[] unique_byte_maigc = {(byte)0x7A, (byte)0x20, (byte)0x17, (byte)0x24};
    protected static final byte[] string_magic = "RGN_STRUCT".getBytes(StandardCharsets.ISO_8859_1);
    protected final byte[] magic;


    public RStruct(RStructDef structDef){
        this.structDef = structDef;
        values = new HashMap<>();
        structHeader = new StructHeader(structDef);
        internal = new DataOutputStream(internal_bytes);
        external = new DataOutputStream(external_bytes);
        magic = CommonUtils.arrayMerge(string_magic, unique_byte_maigc);
        writeMagic();
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

    public Object getvalue(String name){
        Class<?> clazz = null;
        try {
            clazz = Class.forName(structHeader.getType(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Class in structdef is not loaded properly", e);
        }
        return getvalue(name, clazz);
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

    public void serialize(){
        values.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey());
            putname(entry.getKey());
            byteObject(entry.getValue());
        });
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(baos);
            oos.writeObject(structDef);
            oos.close();
            baos.close();
            //System.out.println(Arrays.toString(magic));
            external.writeInt(baos.size());
            external.write(baos.toByteArray());
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
            Files.write(Paths.get("test.struct"), external_bytes.toByteArray());
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

}
