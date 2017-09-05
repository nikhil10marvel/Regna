package io.regna.core;

import javassist.ClassPool;

import java.io.File;
import java.util.ArrayList;

public class ParserPool extends Thread {

    private static ClassPool cp = ClassPool.getDefault();
    private static ArrayList<ParserFacade> parsers = new ArrayList<>();

    public static ClassPool getClassPool() {
        return cp;
    }

    public static ParserFacade enter(String filename) {
        ParserFacade parserFacade = new ParserFacade(filename);
        parsers.add(parserFacade);
        return parserFacade;
    }


    public static ParserFacade enter(File file) {
        ParserFacade parserFacade = new ParserFacade(file);
        parsers.add(parserFacade);
        return parserFacade;
    }

    public static void generate() {
        System.out.println("Generating Bytecode");
        parsers.forEach((parserFacade -> parserFacade.generate()));
    }

}
