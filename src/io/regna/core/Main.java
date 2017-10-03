package io.regna.core;

public class Main {

    public float VERSION_ID = 23.5f;

    public static void main(String[] args) {
        // Create the Compiler and parse the file
        ParserPool.enter(args[0]);
        ParserPool.generate();
//        ParserFacade facade = new ParserFacade(args[0]);
//        facade.generate();  // Generate .class file
//        try {
//            RStruct struct = RStruct.deserialize(Files.readAllBytes(Paths.get("test.bin")));
//            System.out.println(struct.getvalue("PI"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
