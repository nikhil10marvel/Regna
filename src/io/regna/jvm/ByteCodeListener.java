package io.regna.jvm;

import io.regna.core.RegnaBaseListener;
import io.regna.core.RegnaCompilationException;
import io.regna.core.RegnaParser;
import javassist.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Main class to Compile Regna code to java bytecode that can be executed by the JVM
 */
public class ByteCodeListener extends RegnaBaseListener {

    private CtClass module;

    ClassPool cp = ClassPool.getDefault();
    MethodBuilder methodBuilder;
    String module_name;

    ArrayList<String> interfaces = new ArrayList<>();

    /** The Constant Logger */
    public static final Logger LOG = Logger.getLogger(ByteCodeListener.class.toGenericString());

    /**
     * Constructor Sets up the Logger
     */
    public ByteCodeListener(){
        LOG.fine("Compiler Ready!");
        LOG.fine("Loading Default Modules...");
        cp.importPackage("io.regna.internal");
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
            System.out.println("Generating ByteCode");
            return module.toBytecode();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (CannotCompileException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Save the bytecode into a class in the specified DIRECTORY
     * @param dir
     */
    public void save(String dir){
        File f = new File(dir,module_name + ".class");
        if(!f.exists()) try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.write(Paths.get(f.getAbsolutePath()), to_bytes());
            System.out.println("SAVING TO FILE " + f.getAbsolutePath());
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
        if(ctx.StringLiteral() != null) return ctx.StringLiteral().getText();
        else if(ctx.CHRCT() != null) return ctx.CHRCT().getText();
        else if(ctx.INTEGER() != null) return ctx.INTEGER().getText();
        else if(ctx.member_rule() != null) return convertMemberCall(ctx.member_rule());
        else if(ctx.internal_call() != null) return convertInternalCall(ctx.internal_call());
        else if(ctx.expr() != null) return convertExpr(ctx.expr().getText());
        else if(ctx.id() != null) return ctx.id().getText();
        else if(ctx.mid() != null) return ctx.mid().getText();
        else if(ctx.internal_call() != null) return convertInternalCall(ctx.internal_call());
        else if(ctx.call_mid() != null) return ctx.call_mid().getText();
        else if(ctx.StringLiteral() != null) return getTerminalText(ctx.StringLiteral());
        else if(ctx.BlankLiteral() != null) return getTerminalText(ctx.BlankLiteral());
        else if(ctx.struct_val() != null) return convertStructVal(ctx.struct_val());
        else return null;
    }

    private String convertStructVal(RegnaParser.Struct_valContext ctx){
        return ctx.mid().getText() + ".getvalue(\"" + ctx.id().getText() + "\")";
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
        int start_index = 0;
        int end_index = ret.length();
        if(ret.charAt(0) == '('){
            start_index = 1;
            if(ret.charAt(ret.length() - 1) == ')'){
                end_index = ret.length() - 2;
            }
        }
        ret = expr.substring(start_index, end_index);
        return ret;
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
    public void enterStmtList(RegnaParser.StmtListContext ctx) {
        ctx.stmt().stream().forEach((stmt) -> {
            stmt.enterRule(this);
        });
        super.enterStmtList(ctx);
    }

    @Override
    public void exitStmtList(RegnaParser.StmtListContext ctx) {
        ctx.stmt().stream().forEach((stmt) -> {
            stmt.exitRule(this);
        });
        super.exitStmtList(ctx);
    }

    @Override
    public void enterModuleBody(RegnaParser.ModuleBodyContext ctx) {
        //System.out.println("Entering constructor");
        //ctx.constructor().enterRule(this);
        //ctx.constructor().exitRule(this);
        super.enterModuleBody(ctx);
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
        if(ctx != null) return ctx.getText();
        else return "";
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
        ctx.struct_param().forEach((param) -> {
            methodBuilder.registerCommand(ctx.id().getText() + ".value(\"" + param.id().getText() + "\"," + getTypeText(param.type()) + ");");
        });
        super.enterStruct_init_stmt(ctx);
    }

    private String getTerminalText(TerminalNode terminalNode){
        if(terminalNode != null){
            return terminalNode.getText() + " ";
        } else return "";
    }
}
