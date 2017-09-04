package io.regna.core;

import io.regna.internal.RStruct;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public float VERSION_ID = 23.5f;

    public static void main(String[] args) {
        // Create the Compiler and parse the file
        //ParserFacade facade = new ParserFacade(args[0]);
        //facade.generate();  // Generate .class file
        try {
            RStruct struct = RStruct.deserialize(Files.readAllBytes(Paths.get("test.bin")));
            System.out.println(struct.getvalue("PI"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
