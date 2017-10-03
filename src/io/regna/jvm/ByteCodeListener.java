package io.regna.jvm;

import io.regna.core.ParserPool;
import io.regna.core.RegnaBaseListener;
import io.regna.core.RegnaCompilationException;
import io.regna.core.RegnaParser;
import javassist.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Main class to Compile Regna code to java bytecode that can be executed by the JVM
 */
public class ByteCodeListener extends RegnaBaseListener {

    private CtClass module;

    private ClassPool cp = ParserPool.getClassPool();
    private MethodBuilder methodBuilder;
    private String module_name;
    private final String filename;
    private final CommonTokenStream tokenStream;

    private ArrayList<String> interfaces = new ArrayList<>();

    /** The Constant Logger */
    public static final Logger LOG = Logger.getLogger(ByteCodeListener.class.toGenericString());

    /**
     * Constructor Sets up the Logger
     */
    public ByteCodeListener(String filename, CommonTokenStream tokenStream) {
        LOG.fine("Compiler Ready!");
        LOG.fine("Loading Default Modules...");
        cp.importPackage("io.regna.internal");
        this.tokenStream = tokenStream;
        this.filename = filename;
    }

    /**
     * Add a method
     * The functionality of the method is determined by the underlying
     * bytecode
     * @param code The source code for the method
     */
    public void method(String code){
        try {
            //System.out.println(code + System.lineSeparator() + System.lineSeparator());
            module.addMethod(CtNewMethod.make(code, module));
            //System.out.println("Added method");
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
    }

    /**
     * Define an attribute or field to the module
     * Note that the attribute will not be initialized
     * @param attribute The name of the Field or Attribute
     * @param TYPE The type of attribute
     */
    public void defattr(String attribute, CtClass TYPE){
        try {
            module.addField(new CtField(TYPE, attribute, module));
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
    }

    /**
     * Initialize a an attribute
     * @param code The java source for initializing the variable
     */
    public void allocate(String code){
        try {
            module.addField(CtField.make(code, module));
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
    }

    /**
     * Return the bytecode module as a usable java class
     * @return the Class
     */
    public Class asClass(){
        try {
            return module.toClass();
        } catch (CannotCompileException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get the bytecode of the currently generated Module
     * @return bytecode
     */
    public byte[] to_bytes(){
        try {
            //System.out.println("Generating ByteCode");
            return module.toBytecode();
        } catch (IOException | CannotCompileException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Save the bytecode into a class in the specified DIRECTORY
     * @param dir The Directory to save to
     */
    public void save(String dir){
        String dirs = dir + File.separator + module.getPackageName().replaceAll(Pattern.quote("."), Matcher.quoteReplacement(File.separator));
        File f = new File(dirs, module_name + ".class");
        if(!f.exists()) try {
            if (!f.getParentFile().exists()) f.getParentFile().mkdirs();
            final boolean newFile = f.createNewFile();
            System.out.println(!newFile ? "File not created" : "");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.write(Paths.get(f.getAbsolutePath()), to_bytes());
            //System.out.println("SAVING TO FILE " + f.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void enterModule(RegnaParser.ModuleContext ctx) {
        System.out.println("Compiling module " + ctx.id().getText());
        module = cp.makeClass(ctx.mid().getText() + "." + ctx.id().getText());
        module_name = ctx.id().getText();
        if(ctx.SERIALIZABLE() != null) interfaces.add("java.io.Serializable");
        //System.out.println("Looking into module");
        //ctx.moduleBody().enterRule(this);
        //ctx.moduleBody().exitRule(this);
        super.enterModule(ctx);
    }

    @Override
    public void enterConstructor(RegnaParser.ConstructorContext ctx) {
        methodBuilder = new MethodBuilder(ctx.formalParamList());
        ctx.stmtList().enterRule(this);
        ctx.stmtList().exitRule(this);
        super.enterConstructor(ctx);
    }

    @Override
    public void enterPrint_stmt(RegnaParser.Print_stmtContext ctx) {
//        System.out.println(getTypeText(ctx.type()));
        methodBuilder.registerCommand("System.out.println(" + getTypeText(ctx.type()) + ");");
        //System.out.println("System.out.println(" + ctx.type().StringLiteral().getText() + ");");
        super.enterPrint_stmt(ctx);
    }

    private String getTypeText(RegnaParser.TypeContext ctx){
        //System.out.println(ctx);
        if(ctx.StringLiteral() != null) return ctx.StringLiteral().getText();
        else if(ctx.CHRCT() != null) return ctx.CHRCT().getText();
        else if(ctx.INTEGER() != null) return ctx.INTEGER().getText();
        else if(ctx.member_rule() != null) return convertMemberCall(ctx.member_rule());
        else if(ctx.internal_call() != null) return convertInternalCall(ctx.internal_call());
        else if(ctx.expr() != null) return convertExpr(ctx.expr().getText());
        else if(ctx.id() != null) return ctx.id().getText();
        else if(ctx.mid() != null) return ctx.mid().getText();
        else if (ctx.struct_val() != null) return convertStructVal(ctx.struct_val());
        else if(ctx.internal_call() != null) return convertInternalCall(ctx.internal_call());
        else if(ctx.call_mid() != null) return ctx.call_mid().getText();
        else if (ctx.StringLiteral() != null) return ctx.StringLiteral().getText();
        else if (ctx.BlankLiteral() != null) return ctx.BlankLiteral().getText();
        else if (ctx.cast_type() != null) return convertCasting(ctx.cast_type());
        else if (ctx.construct_call() != null) return convertConstructionStmt(ctx.construct_call());
        else if (ctx.new_reference() != null) return convertNewRef(ctx.new_reference());
        else if (ctx.array_inst() != null) return convertArrayInst(ctx.array_inst());
        else return null;
    }

    private String convertArrayInst(RegnaParser.Array_instContext ctx) {
        if (ctx.box_types() != null) {
            return "new " + ctx.box_types().getText() + "[" + getTypeText(ctx.type()) + "]";
        } else {
            //System.out.println("new " + ctx.type_id().getText() + "[" + getTypeText(ctx.type()) + "]");
            return "new " + ctx.type_id().getText() + "[" + getTypeText(ctx.type()) + "]";
        }
    }

    @Override
    public void enterArray_set_stmt(RegnaParser.Array_set_stmtContext ctx) {
        String line = convertNewRef(ctx.new_reference()) + "=" + getTypeText(ctx.type());
//        System.out.println(line);
        methodBuilder.registerCommand(line + ";");
        super.enterArray_set_stmt(ctx);
    }

    private String convertStructVal(RegnaParser.Struct_valContext ctx){
        if (ctx.extract_type() != null) {
            //System.out.println("(" + ctx.extract_type().getText() + ")" + ctx.mid().getText() + ".getvalue(\"" + ctx.id().getText() + "\")");
            return "(" + ctx.extract_type().getText() + ")" + ctx.mid().getText() + ".getvalue(\"" + ctx.id().getText() + "\")";
        } else {
            //System.out.println(ctx.mid().getText() + ".getvalue(\"" + ctx.id().getText() + "\")");
            return ctx.mid().getText() + ".getvalue(\"" + ctx.id().getText() + "\")";
        }
    }

    private String convertCasting(RegnaParser.Cast_typeContext ctx) {
        return "(" + ctx.extract_type().getText() + ")" + getTypeText(ctx.type());
    }

    private String convertMemberCall(RegnaParser.Member_ruleContext ctx){
        return ctx.mid().getText() + "." + ctx.id().getText();
    }

    private String convertInternalCall(RegnaParser.Internal_callContext ctx){
        return ctx.box_types().getText() + "." + ctx.id().getText() + convertParam(ctx.call_params());
    }

    private String convertParam(RegnaParser.Call_paramsContext ctx){
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        int x = 0;
        for (RegnaParser.TypeContext typ : ctx.type()){
            if(x > 0) builder.append(",");
            builder.append(getTypeText(typ));
            x++;
        }
        builder.append(")");
        return builder.toString();
    }

    private String convertExpr(String expr){
        String ret = expr;
        //System.out.println(ret);
        int start_index = 0;
        int end_index = ret.length();
        //if(ret.charAt(0) == '('){
        //    start_index = 1;
        //    if(ret.charAt(ret.length() - 1) == ')'){
        //        end_index = ret.length() - 2;
        //    }
        //}
        ret = expr.substring(start_index, end_index);
        //System.out.println(ret);
        return ret;
    }

    @Override
    public void enterVaraddinc_stmt(RegnaParser.Varaddinc_stmtContext ctx) {
        methodBuilder.registerCommand(ctx.id().getText() + "+=" + getTypeText(ctx.type()));
        super.enterVaraddinc_stmt(ctx);
    }

    @Override
    public void enterVarsubinc_stmt(RegnaParser.Varsubinc_stmtContext ctx) {
        methodBuilder.registerCommand(ctx.id().getText() + "-=" + getTypeText(ctx.type()));
        super.enterVarsubinc_stmt(ctx);
    }

    @Override
    public void enterVarmulinc_stmt(RegnaParser.Varmulinc_stmtContext ctx) {
        methodBuilder.registerCommand(ctx.id().getText() + "*=" + getTypeText(ctx.type()));
        super.enterVarmulinc_stmt(ctx);
    }

    @Override
    public void enterVardivinc_stmt(RegnaParser.Vardivinc_stmtContext ctx) {
        methodBuilder.registerCommand(ctx.id().getText() + "/=" + getTypeText(ctx.type()));
        super.enterVardivinc_stmt(ctx);
    }

    @Override
    public void enterLocalvar_stmt(RegnaParser.Localvar_stmtContext ctx) {
        String cnst = "";
        if(ctx.Const() != null) cnst = "final";
        /* String internal_def = cnst + ctx.vartype().getText() + " " + ctx.id().getText() + " " +convertAttrDef(ctx.attrvaldef());
         * System.out.println(internal_def);
         * methodBuilder.registerCommand(internal_def + ";");
         */
        String line = RegnaCompilationException.getLineFromRule(ctx, ctx.start.getInputStream());
        if(cnst.equals("final") && convertAttrDef(ctx.attrvaldef()).isEmpty()) throw new RegnaCompilationException(ctx.start.getLine(), line.length(), "Attribute value expected, found EOS", line);
        //if(convertFieldDesc(ctx.field_param(1)).equals("final ") && convertAttrDef(ctx.attrvaldef()).isEmpty()) throw new RegnaCompilationException(ctx.start.getLine(), line.length(), "Attribute value expected, found EOS", line);
        //methodBuilder.registerVar(ctx.vartype().getText(), ctx.id().getText(), convertAttrDef(ctx.attrvaldef()), cnst, ctx);
        methodBuilder.registerVar(ctx.vartype().getText(), ctx.id().getText(), convertAttrDef(ctx.attrvaldef()), cnst, ctx);
        super.enterLocalvar_stmt(ctx);
    }

    @Override
    public void enterReturn_stmt(RegnaParser.Return_stmtContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("return ");
        if (ctx.type() != null) sb.append(getTypeText(ctx.type()));
        sb.append(";");
        //System.out.println(sb.toString());
        methodBuilder.registerCommand(sb.toString());
        super.enterReturn_stmt(ctx);
    }

    @Override
    public void enterStmtList(RegnaParser.StmtListContext ctx) {
        ctx.stmt().forEach((stmt) -> stmt.enterRule(this));
        super.enterStmtList(ctx);
    }

    @Override
    public void exitStmtList(RegnaParser.StmtListContext ctx) {
        ctx.stmt().forEach((stmt) -> stmt.exitRule(this));
        super.exitStmtList(ctx);
    }

    @Override
    public void enterModuleBody(RegnaParser.ModuleBodyContext ctx) {
        //System.out.println("Entering constructor");
        //ctx.constructor().enterRule(this);
        //ctx.constructor().exitRule(this);
        super.enterModuleBody(ctx);
    }

    private String convertConstructionStmt(RegnaParser.Construct_stmtContext ctx) {
        //System.out.println("new " + ctx.box_types().getText() + " " + convertParam(ctx.call_params()));
        return "new " + ctx.box_types().getText() + " " + convertParam(ctx.call_params());
    }

    private String convertConstructionStmt(RegnaParser.Construct_callContext ctx) {
        //System.out.println("new " + ctx.box_types().getText() + " " + convertParam(ctx.call_params()));
        return "new " + ctx.box_types().getText() + " " + convertParam(ctx.call_params());
    }

    @Override
    public void enterConstruct_stmt(RegnaParser.Construct_stmtContext ctx) {
        methodBuilder.registerCommand(convertConstructionStmt(ctx) + ";");
        super.enterConstruct_stmt(ctx);
    }

    @Override
    public void exitConstructor(RegnaParser.ConstructorContext ctx) {
        try {
            //System.out.println("public " + module.getName() + "() { " + method_builder.toString() + " }");
            module.addConstructor(CtNewConstructor.make(methodBuilder.asMethodDef("public " + module_name), module));
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterCompiler_cp_instruction(RegnaParser.Compiler_cp_instructionContext ctx) {
        try {
            cp.insertClassPath(ctx.StringLiteral().getText().substring(1, ctx.StringLiteral().getText().length() - 1));
        } catch (NotFoundException e) {
            throw new RuntimeException("Class " + ctx.StringLiteral().getText() + " does not exist or the system is unable to find it.");
        }
        super.enterCompiler_cp_instruction(ctx);
    }

    @Override
    public void enterFunc(RegnaParser.FuncContext ctx) {
        methodBuilder = new MethodBuilder(ctx.formalParamList());
        //System.out.println(ctx.id().getText());
        //ctx.stmtList().enterRule(this);
        super.enterFunc(ctx);
    }

    @Override
    public void exitFunc(RegnaParser.FuncContext ctx) {
        String mtd = methodBuilder.asMethodDef("public " + ctx.ret_type().getText() + " " + ctx.id().getText());
        //System.out.println(mtd);
        method(mtd);
        super.exitFunc(ctx);
    }

    @Override
    public void enterStaticformalFunction(RegnaParser.StaticformalFunctionContext ctx) {
        methodBuilder = new MethodBuilder(ctx.formalParamList());
        super.enterStaticformalFunction(ctx);
    }

    @Override
    public void exitStaticformalFunction(RegnaParser.StaticformalFunctionContext ctx) {
        String mtd = methodBuilder.asMethodDef("public static " + ctx.ret_type().getText() + " " + ctx.id().getText());
        method(mtd);
        super.exitStaticformalFunction(ctx);
    }

    @Override
    public void enterMembercall_stmt(RegnaParser.Membercall_stmtContext ctx) {
        String cmd = ctx.type().getText() + "." + ctx.id().getText() + convertParam(ctx.call_params()) + ";";
        //System.out.println(cmd);
        methodBuilder.registerCommand(cmd);
        super.enterMembercall_stmt(ctx);
    }

    @Override
    public void enterVardef_stmt(RegnaParser.Vardef_stmtContext ctx) {
        String cmd = ctx.id().getText() + " = " + getTypeText(ctx.type()) + ";";
        //System.out.println(cmd);
        methodBuilder.registerCommand(cmd);
        super.enterVardef_stmt(ctx);
    }

    private String convertFieldDesc(RegnaParser.Field_paramContext ctx){
        if(ctx != null){
            if(ctx.Const() != null) return "final ";
            if(ctx.TRANSIENT() != null) return "transient ";
            else return null;
        } else return "";
    }

    private String convertAttrDef(RegnaParser.AttrvaldefContext ctx){
        if (ctx != null) return "=" + getTypeText(ctx.type());
        else return "";
    }

    private String convertLogicExpr(RegnaParser.LogicexprContext ctx) {
        if (ctx.boolval() != null) {
            return convertBoolVal(ctx.boolval());
        } else if (ctx.andboolexpr() != null) {
            return convertAndExpr(ctx.andboolexpr());
        } else if (ctx.orboolexpr() != null) {
            return convertOrExpr(ctx.orboolexpr());
        } else if (ctx.notboolval() != null) {
            return "!(" + convertBoolVal(ctx.notboolval().boolval()) + ")";
        } else {
            throw new RuntimeException("Invalid Logic Expression!");
        }
    }

    private String convertAndExpr(RegnaParser.AndboolexprContext ctx) {
        return "(" + convertLogicExpr(ctx.logicexpr(0)) + ")&&(" + convertLogicExpr(ctx.logicexpr(1)) + ")";
    }

    private String convertOrExpr(RegnaParser.OrboolexprContext ctx) {
        return "(" + convertLogicExpr(ctx.logicexpr(0)) + ")||(" + convertLogicExpr(ctx.logicexpr(1)) + ")";
    }

    private String convertEnclosedBoolVal(RegnaParser.Enclosed_boolvalContext ctx) {
        return "(" + convertBoolVal(ctx.boolval()) + ")";
    }

    private String convertNewRef(RegnaParser.New_referenceContext ctx) {
        StringBuilder sb = new StringBuilder(ctx.mid().getText());
        for (RegnaParser.TypeContext type : ctx.type()) {
            sb.append('[');
            sb.append(getTypeText(type));
            sb.append(']');
        }
        return sb.toString();
    }

    private String convertBoolVal(RegnaParser.BoolvalContext ctx) {
        if (ctx.equalto() != null) {
            RegnaParser.EqualtoContext eqctx = ctx.equalto();
            String ret = getTypeText(eqctx.type(0)) + "==" + getTypeText(eqctx.type(1));
            //System.out.println(ret);
            return ret;
        } else if (ctx.greaterthan() != null) {
            RegnaParser.GreaterthanContext gtctx = ctx.greaterthan();
            return getTypeText(gtctx.type(0)) + ">" + getTypeText(gtctx.type(1));
        } else if (ctx.lesserthan() != null) {
            RegnaParser.LesserthanContext ltctx = ctx.lesserthan();
            return getTypeText(ltctx.type(0)) + "<" + getTypeText(ltctx.type(1));
        } else if (ctx.greaterthanE() != null) {
            RegnaParser.GreaterthanEContext gtectx = ctx.greaterthanE();
            return getTypeText(gtectx.type(0)) + ">=" + getTypeText(gtectx.type(1));
        } else if (ctx.lesserthanE() != null) {
            RegnaParser.LesserthanEContext ltectx = ctx.lesserthanE();
            return getTypeText(ltectx.type(0)) + "<=" + getTypeText(ltectx.type(1));
        } else if (ctx.notequalto() != null) {
            return getTypeText(ctx.notequalto().type(0)) + "!=" + getTypeText(ctx.notequalto().type(1));
        } else if (ctx.false_con() != null) {
            return "false";
        } else if (ctx.true_con() != null) {
            return "true";
        } else if (ctx.type() != null) {
            return getTypeText(ctx.type());
        } else {
            throw new IllegalArgumentException();
        }
    }

    private String convertBoolExpr(RegnaParser.BoolexprContext ctx) {
        StringBuilder builder = new StringBuilder();
        if (ctx.andboolexpr() != null) {
            builder.append(convertAndExpr(ctx.andboolexpr()));
        } else if (ctx.orboolexpr() != null) {
            builder.append(convertOrExpr(ctx.orboolexpr()));
        } else if (ctx.boolval() != null) {
            builder.append(convertBoolVal(ctx.boolval()));
        } else if (ctx.enclosed_boolval() != null) {
            builder.append(convertEnclosedBoolVal(ctx.enclosed_boolval()));
        }
        return builder.toString();
    }

    public String convertBoolparseexpr(RegnaParser.BoolparseexprContext ctx) {
        if ((ctx.NOT() != null) && (ctx.boolexpr() != null)) {
            String gen = "!" + convertBoolExpr(ctx.boolexpr());
            //System.out.println(gen);
            return gen;
        } else {
            String gen = convertBoolExpr(ctx.boolexpr());
            //System.out.println(gen);
            return gen;
        }
    }

//    @Override
//    public void enterBoolparseexpr(RegnaParser.BoolparseexprContext ctx) {
//        if((ctx.NOT() != null) && (ctx.boolexpr() != null)){
//            String gen = "!" + convertBoolExpr(ctx.boolexpr());
//            //System.out.println(gen);
//        } else {
//            String gen = convertBoolExpr(ctx.boolexpr());
//            //System.out.println(gen);
//        }
//        super.enterBoolparseexpr(ctx);
//    }

    @Override
    public void enterIf_block(RegnaParser.If_blockContext ctx) {
        methodBuilder.registerCommand("if(" + convertBoolparseexpr(ctx.boolparseexpr()) + "){");
        super.enterIf_block(ctx);
    }

    @Override
    public void exitIf_block(RegnaParser.If_blockContext ctx) {
        methodBuilder.registerCommand("}");
        super.exitIf_block(ctx);
    }

    @Override
    public void enterElseif_block(RegnaParser.Elseif_blockContext ctx) {
        methodBuilder.registerCommand("else if(" + convertBoolparseexpr(ctx.boolparseexpr()) + "){");
        super.enterElseif_block(ctx);
    }

    @Override
    public void exitElseif_block(RegnaParser.Elseif_blockContext ctx) {
        methodBuilder.registerCommand("}");
        super.exitElseif_block(ctx);
    }

    @Override
    public void enterElse_block(RegnaParser.Else_blockContext ctx) {
        methodBuilder.registerCommand("else{");
        super.enterElse_block(ctx);
    }

    @Override
    public void exitElse_block(RegnaParser.Else_blockContext ctx) {
        methodBuilder.registerCommand("}");
        super.exitElse_block(ctx);
    }

    @Override
    public void enterWhile_block(RegnaParser.While_blockContext ctx) {
        methodBuilder.registerCommand("while(" + convertBoolparseexpr(ctx.boolparseexpr()) + "){");
        //System.out.println("while(" + convertBoolparseexpr(ctx.boolparseexpr()) + "){");
        super.enterWhile_block(ctx);
    }

    @Override
    public void exitWhile_block(RegnaParser.While_blockContext ctx) {
        methodBuilder.registerCommand("}");
        super.exitWhile_block(ctx);
    }

    @Override
    public void enterAttrdef_stmt(RegnaParser.Attrdef_stmtContext ctx) {
        String attrdef = "public " + convertFieldDesc(ctx.field_param(0)) + convertFieldDesc(ctx.field_param(1)) + ctx.vartype().getText() + " " + ctx.id().getText() + " " + convertAttrDef(ctx.attrvaldef()) + ";";
//        System.out.println(convertAttrDef(ctx.attrvaldef()));
        String line = RegnaCompilationException.getLineFromRule(ctx, ctx.start.getInputStream());
        if(convertFieldDesc(ctx.field_param(0)).equals("final ") && convertAttrDef(ctx.attrvaldef()).isEmpty()) throw new RegnaCompilationException(ctx.start.getLine(), line.length(), "Attribute value expected, found EOS", line);
        if(convertFieldDesc(ctx.field_param(1)).equals("final ") && convertAttrDef(ctx.attrvaldef()).isEmpty()) throw new RegnaCompilationException(ctx.start.getLine(), line.length(), "Attribute value expected, found EOS", line);
        allocate(attrdef);
        super.enterAttrdef_stmt(ctx);
    }

    @Override
    public void enterStatic_attrdef(RegnaParser.Static_attrdefContext ctx) {
        String static_Def = "public static " + convertFieldDesc(ctx.field_param(0)) + convertFieldDesc(ctx.field_param(1)) + ctx.vartype().getText() + " " + ctx.id().getText() + " " + convertAttrDef(ctx.attrvaldef())  + ";";
        //System.out.println(static_Def);
        String line = RegnaCompilationException.getLineFromRule(ctx, ctx.start.getInputStream());
        if(convertFieldDesc(ctx.field_param(0)).equals("final ") && convertAttrDef(ctx.attrvaldef()).isEmpty()) throw new RegnaCompilationException(ctx.start.getLine(), line.length(), "Attribute value expected, found EOS", line);
        if(convertFieldDesc(ctx.field_param(1)).equals("final ") && convertAttrDef(ctx.attrvaldef()).isEmpty()) throw new RegnaCompilationException(ctx.start.getLine(), line.length(), "Attribute value expected, found EOS", line);
        allocate(static_Def);
        super.enterStatic_attrdef(ctx);
    }

    @Override
    public void enterRequire(RegnaParser.RequireContext ctx) {
        cp.importPackage(ctx.mid().getText());
        super.enterRequire(ctx);
    }

    @Override
    public void enterCompiler_compile_instruction(RegnaParser.Compiler_compile_instructionContext ctx) {
        String filename = ctx.StringLiteral().getText().substring(1, ctx.StringLiteral().getText().length() - 1);
        ParserPool.enter(filename);
        //System.out.println(filename);
        super.enterCompiler_compile_instruction(ctx);
    }

    @Override
    public void enterStruct_stmt(RegnaParser.Struct_stmtContext ctx) {
//        System.out.println();
        String struct_name = ctx.id().getText();
        allocate("public static RStructDef " + struct_name + " = new RStructDef(\"" + struct_name + "\")" + ";"); // Allocate field of type RStructDef
        for(int x = 0; x < ctx.struct_body().id().size(); x++){
            String type = ctx.struct_body().type_id(x).getText();
            String name = ctx.struct_body().id(x).getText();
            //System.out.println("Var " + type + " " + name);
            methodBuilder.registerCommand(struct_name + ".registerObject(\"" + name + "\",\"" + type + "\")" + ";");
        }
        super.enterStruct_stmt(ctx);
    }

    @Override
    public void enterStruct_init_stmt(RegnaParser.Struct_init_stmtContext ctx) {
        methodBuilder.registerCommand(ctx.id().getText() + " = new RStruct(" + ctx.mid().getText() + ");");
        ctx.struct_param().forEach((param) -> methodBuilder.registerCommand(ctx.id().getText() + ".value(\"" + param.id().getText() + "\"," + getTypeText(param.type()) + ");"));
        super.enterStruct_init_stmt(ctx);
    }

    @Override
    public void enterArray_def_stmt(RegnaParser.Array_def_stmtContext ctx) {
        String string = ctx.ArrayLiteral().getText();
        int first_index = string.indexOf('[');
        String name = string.substring(0, first_index);
        String dimensions = string.substring(first_index, string.length());
        if (ctx.Const() != null) {
            if (ctx.attrvaldef() == null) {
                String line = RegnaCompilationException.getLinefromLineNumber(ctx.start.getLine() - 1, filename);
                //System.out.println(line);
                throw new RegnaCompilationException(ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine(), "Definition Expected, found ';'", line);
            }
            //System.out.println("final " + ctx.vartype().getText() + dimensions + " " + name + convertAttrDef(ctx.attrvaldef()) + ";");
            methodBuilder.registerCommand("final " + ctx.vartype().getText() + dimensions + " " + name + convertAttrDef(ctx.attrvaldef()) + ";");
        } else {
            methodBuilder.registerCommand(ctx.vartype().getText() + dimensions + " " + name + convertAttrDef(ctx.attrvaldef()) + ";");
        }
        super.enterArray_def_stmt(ctx);
    }

    private String getTerminalText(TerminalNode terminalNode){
        if(terminalNode != null){
            return terminalNode.getText() + " ";
        } else return "";
    }

    public void require(String clazz) {
        cp.importPackage(clazz);
    }
}
