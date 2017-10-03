package io.regna.core;

import io.regna.jvm.ByteCodeListener;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.IOException;

public class ParserFacade {

    RegnaLexer lexer;
    RegnaParser parser;
    ByteCodeListener listener;
    public CommonTokenStream tokenStream;


    public ParserFacade(File file) {
        try {
            lexer = new RegnaLexer(new ANTLRFileStream(file.getAbsolutePath()));
            tokenStream = new CommonTokenStream(lexer);
            parser = new RegnaParser(tokenStream);
            parser.setBuildParseTree(true);
            listener = new ByteCodeListener(file.getAbsolutePath(), tokenStream);
            RegnaParser.ProgramContext programContext = parser.program();
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            parseTreeWalker.walk(listener, programContext);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ParserFacade(String file) {
        try {
            lexer = new RegnaLexer(new ANTLRFileStream(file));
            tokenStream = new CommonTokenStream(lexer);
            parser = new RegnaParser(tokenStream);
            parser.setBuildParseTree(true);
            listener = new ByteCodeListener(file, tokenStream);
            RegnaParser.ProgramContext programContext = parser.program();
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            parseTreeWalker.walk(listener, programContext);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void require(String module) {
        listener.require(module);
    }

    public void generate(){
        listener.save(System.getProperty("output.bin"));
    }

    public static class SimpleRegna extends RegnaBaseListener {

        @Override
        public void enterModule(RegnaParser.ModuleContext ctx) {
            System.out.println(ctx.children.get(5).getChild(1).getText());
            super.enterModule(ctx);
        }

        @Override
        public void enterPrint_stmt(RegnaParser.Print_stmtContext ctx) {
            System.out.println(ctx.type().StringLiteral());
            super.enterPrint_stmt(ctx);
        }

        @Override
        public void enterVardef_stmt(RegnaParser.Vardef_stmtContext ctx) {
            System.out.println("Setting var " + ctx.id().getText());
            super.enterVardef_stmt(ctx);
        }

        @Override
        public void enterConstructor(RegnaParser.ConstructorContext ctx) {
            System.out.println("Invoking constructor");
            ctx.stmtList().stmt().stream().forEach((stmt) -> {
                stmt.enterRule(this);
                stmt.exitRule(this);
            });
//            super.enterConstructor(ctx);
        }

        @Override
        public void exitConstructor(RegnaParser.ConstructorContext ctx) {
            System.out.println("Exiting Constructor");
            super.exitConstructor(ctx);
        }

        @Override
        public void visitTerminal(TerminalNode node) {
            super.visitTerminal(node);
        }
    }

}
