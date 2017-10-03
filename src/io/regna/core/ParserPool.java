package io.regna.core;

import javassist.ClassPool;
import javassist.NotFoundException;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Logger;

public class ParserPool extends Thread {

    private static ClassPool cp = ClassPool.getDefault();
    private static HashMap<String, ParserFacade> parsers = new HashMap<>();
    public static boolean runtime_loaded = false;
    public static String[] strings;

    public static ClassPool getClassPool() {
        return cp;
    }

    static {
        // Insert runtime jar
        String runtime_jar_path = System.getProperty("lib.rt");
        try {
            if (!(runtime_jar_path == null || runtime_jar_path.equals("none"))) {
                cp.insertClassPath(runtime_jar_path);
                runtime_loaded = true;
            }
        } catch (NotFoundException e) {
            Logger.getLogger("runtime[rt]").severe("Runtime Library" + runtime_jar_path + "not found!");
        }
    }

    public static ParserFacade enter(String filename) {
        String sys_path = getSysPath(new File(filename));
        ParserFacade parserFacade = !parsers.containsKey(sys_path) ? new ParserFacade(filename) : null;
        if (parserFacade == null) {
            Logger.getGlobal().warning("File: " + filename + " has already been compiled!");
            return null;
        }
        if (runtime_loaded) parserFacade.require("io.regna.rt.Core");
        return parsers.put(sys_path, parserFacade);
    }


    public static ParserFacade enter(File file) {
        ParserFacade parserFacade = !parsers.containsKey(getSysPath(file)) ? new ParserFacade(file) : null;
        if (parserFacade == null) {
            Logger.getGlobal().warning("File: " + file.getAbsolutePath() + " has already been compiled!");
            return null;
        }
        return parserFacade;
    }

    public static void generate() {
        System.out.println("Generating Bytecode");
        parsers.forEach((file, parser) -> parser.generate());
    }

    public static String getSysPath(File f) {
        try {
            return f.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
