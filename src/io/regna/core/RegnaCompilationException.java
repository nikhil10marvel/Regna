package io.regna.core;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class RegnaCompilationException extends RuntimeException{

    public final int line;
    public final int pos_inline;
    public final String error;
    public final String actual_line;

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * Message, the detail message is "The compiler encountered an error". The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     *
     * @param line The line number of the error
     * @param pos_inline The character position where the error has occurred
     * @param error The compiler error message
     * @param actual_line The actual line in String form, can be retrieved from {@link ParserRuleContext} with {@link #getLineFromRule(ParserRuleContext, TokenStream)} method
     */
    public RegnaCompilationException(int line, int pos_inline, String error, String actual_line) {
        super("The compiler encountered an error");
        this.line = line;
        this.pos_inline = pos_inline;
        this.error = error;
        this.actual_line = actual_line;
    }

    public static String getLineFromRule(ParserRuleContext ctx, TokenStream stream){
        int a,b;
        a = ctx.start.getStartIndex();
        b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        return stream.getText(interval);
    }

    public static String getLineFromRule(ParserRuleContext ctx, CharStream stream){
        int a,b;
        a = ctx.start.getStartIndex();
        b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a,b);
        return stream.getText(interval);
    }

    public static String getLinefromLineNumber(int line_num, String filename) {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            return lines.skip(line_num).findFirst().get();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }

    @Override
    public String getLocalizedMessage() {
        return error + System.lineSeparator() + super.getLocalizedMessage();
    }

    @Override
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override
    public void printStackTrace(PrintStream s) {
        String standard_msg = "A Compilation Error at " + line + ":" + pos_inline + " due to ";
        s.println(standard_msg + error);
        s.println(actual_line);
        int n = pos_inline - 1;
        String spaces;
        StringBuilder sb = new StringBuilder();
        //System.out.println(n);
        for(int x = 0; x < n; x++){
            sb.append(" ");
        }
        spaces = sb.toString();
        s.println(spaces + "^");
        s.println();
        super.printStackTrace(s);
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        String standard_msg = "A Compilation Error at " + line + ":" + pos_inline + " due to ";
        s.println(standard_msg + error);
        s.println(actual_line);
        int n = actual_line.length() - pos_inline;
        String spaces;
        StringBuilder sb = new StringBuilder();
        for(int x = 0; x <= n; x++){
            sb.append(" ");
        }
        spaces = sb.toString();
        s.println(spaces + "^");
        s.println();
        super.printStackTrace(s);
    }
}
