package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CommonUtils {

    @Deprecated
    public static <T> void arrayMerge(T[] array1, T[] array2, T[] tomergeinto) {
        ArrayList<T> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, array1);
        Collections.addAll(arrayList, array2);
        arrayList.toArray(tomergeinto);
    }

    @Deprecated
    public static void arrayMerge(byte[] array1, byte[] array2, byte[] tomergeinto) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, toByteBoxing(array1));
        Collections.addAll(arrayList, toByteBoxing(array2));
        arrayList.toArray(toByteBoxing(tomergeinto));
    }

    public static Byte[] toByteBoxing(byte[] bytes){
        Byte[] Bytes = new Byte[bytes.length];
        Arrays.setAll(Bytes, n -> bytes[n]);
        return Bytes;
    }

    public static byte[] toByteUnboxing(Byte[] boxed){
        byte[] bytes = new byte[boxed.length];

        for(int i = 0; i < boxed.length; i++) {
            bytes[i] = boxed[i];
        }

        return bytes;
    }

    public static byte[] arrayMerge(byte[] one, byte[] two){
        byte[] c = new byte[one.length + two.length];
        System.arraycopy(one, 0, c, 0, one.length);
        System.arraycopy(two, 0, c, one.length, two.length);
        return c;
    }

}
