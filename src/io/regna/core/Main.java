package io.regna.core;

public class Main {

    public float VERSION_ID = 23.5f;

    public static void main(String[] args) {
        // Create the Compiler and parse the file
        ParserFacade facade = new ParserFacade(args[0]);
        facade.generate();  // Generate .class file
    }
}
