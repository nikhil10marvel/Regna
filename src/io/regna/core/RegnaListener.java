// Generated from Z:/Java/ideaspace/Regna/src\Regna.g4 by ANTLR 4.7
package io.regna.core;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegnaParser}.
 */
public interface RegnaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegnaParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(RegnaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(RegnaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#mid}.
	 * @param ctx the parse tree
	 */
	void enterMid(RegnaParser.MidContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#mid}.
	 * @param ctx the parse tree
	 */
	void exitMid(RegnaParser.MidContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#call_mid}.
	 * @param ctx the parse tree
	 */
	void enterCall_mid(RegnaParser.Call_midContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#call_mid}.
	 * @param ctx the parse tree
	 */
	void exitCall_mid(RegnaParser.Call_midContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#arid}.
	 * @param ctx the parse tree
	 */
	void enterArid(RegnaParser.AridContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#arid}.
	 * @param ctx the parse tree
	 */
	void exitArid(RegnaParser.AridContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#type_id}.
	 * @param ctx the parse tree
	 */
	void enterType_id(RegnaParser.Type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#type_id}.
	 * @param ctx the parse tree
	 */
	void exitType_id(RegnaParser.Type_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#ret_type}.
	 * @param ctx the parse tree
	 */
	void enterRet_type(RegnaParser.Ret_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#ret_type}.
	 * @param ctx the parse tree
	 */
	void exitRet_type(RegnaParser.Ret_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(RegnaParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(RegnaParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(RegnaParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(RegnaParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RegnaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RegnaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(RegnaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(RegnaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#field_param}.
	 * @param ctx the parse tree
	 */
	void enterField_param(RegnaParser.Field_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#field_param}.
	 * @param ctx the parse tree
	 */
	void exitField_param(RegnaParser.Field_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#box_types}.
	 * @param ctx the parse tree
	 */
	void enterBox_types(RegnaParser.Box_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#box_types}.
	 * @param ctx the parse tree
	 */
	void exitBox_types(RegnaParser.Box_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RegnaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RegnaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#vartype}.
	 * @param ctx the parse tree
	 */
	void enterVartype(RegnaParser.VartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#vartype}.
	 * @param ctx the parse tree
	 */
	void exitVartype(RegnaParser.VartypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#vardef_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVardef_stmt(RegnaParser.Vardef_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#vardef_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVardef_stmt(RegnaParser.Vardef_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#localvar_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLocalvar_stmt(RegnaParser.Localvar_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#localvar_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLocalvar_stmt(RegnaParser.Localvar_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(RegnaParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(RegnaParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#construct_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConstruct_stmt(RegnaParser.Construct_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#construct_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConstruct_stmt(RegnaParser.Construct_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#attrvaldef}.
	 * @param ctx the parse tree
	 */
	void enterAttrvaldef(RegnaParser.AttrvaldefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#attrvaldef}.
	 * @param ctx the parse tree
	 */
	void exitAttrvaldef(RegnaParser.AttrvaldefContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#attrdef_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttrdef_stmt(RegnaParser.Attrdef_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#attrdef_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttrdef_stmt(RegnaParser.Attrdef_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#static_attrdef}.
	 * @param ctx the parse tree
	 */
	void enterStatic_attrdef(RegnaParser.Static_attrdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#static_attrdef}.
	 * @param ctx the parse tree
	 */
	void exitStatic_attrdef(RegnaParser.Static_attrdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#require}.
	 * @param ctx the parse tree
	 */
	void enterRequire(RegnaParser.RequireContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#require}.
	 * @param ctx the parse tree
	 */
	void exitRequire(RegnaParser.RequireContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#call_params}.
	 * @param ctx the parse tree
	 */
	void enterCall_params(RegnaParser.Call_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#call_params}.
	 * @param ctx the parse tree
	 */
	void exitCall_params(RegnaParser.Call_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#membercall_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMembercall_stmt(RegnaParser.Membercall_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#membercall_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMembercall_stmt(RegnaParser.Membercall_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#internal_call}.
	 * @param ctx the parse tree
	 */
	void enterInternal_call(RegnaParser.Internal_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#internal_call}.
	 * @param ctx the parse tree
	 */
	void exitInternal_call(RegnaParser.Internal_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#member_rule}.
	 * @param ctx the parse tree
	 */
	void enterMember_rule(RegnaParser.Member_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#member_rule}.
	 * @param ctx the parse tree
	 */
	void exitMember_rule(RegnaParser.Member_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body(RegnaParser.Struct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body(RegnaParser.Struct_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#struct_stmt}.
	 * @param ctx the parse tree
	 */
	void enterStruct_stmt(RegnaParser.Struct_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#struct_stmt}.
	 * @param ctx the parse tree
	 */
	void exitStruct_stmt(RegnaParser.Struct_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#struct_param}.
	 * @param ctx the parse tree
	 */
	void enterStruct_param(RegnaParser.Struct_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#struct_param}.
	 * @param ctx the parse tree
	 */
	void exitStruct_param(RegnaParser.Struct_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#struct_init_stmt}.
	 * @param ctx the parse tree
	 */
	void enterStruct_init_stmt(RegnaParser.Struct_init_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#struct_init_stmt}.
	 * @param ctx the parse tree
	 */
	void exitStruct_init_stmt(RegnaParser.Struct_init_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#struct_val}.
	 * @param ctx the parse tree
	 */
	void enterStruct_val(RegnaParser.Struct_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#struct_val}.
	 * @param ctx the parse tree
	 */
	void exitStruct_val(RegnaParser.Struct_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#struct_set_stmt}.
	 * @param ctx the parse tree
	 */
	void enterStruct_set_stmt(RegnaParser.Struct_set_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#struct_set_stmt}.
	 * @param ctx the parse tree
	 */
	void exitStruct_set_stmt(RegnaParser.Struct_set_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(RegnaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(RegnaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#requireList}.
	 * @param ctx the parse tree
	 */
	void enterRequireList(RegnaParser.RequireListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#requireList}.
	 * @param ctx the parse tree
	 */
	void exitRequireList(RegnaParser.RequireListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(RegnaParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(RegnaParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParam(RegnaParser.FormalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParam(RegnaParser.FormalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParamList(RegnaParser.FormalParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParamList(RegnaParser.FormalParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#staticformalFunction}.
	 * @param ctx the parse tree
	 */
	void enterStaticformalFunction(RegnaParser.StaticformalFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#staticformalFunction}.
	 * @param ctx the parse tree
	 */
	void exitStaticformalFunction(RegnaParser.StaticformalFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(RegnaParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(RegnaParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(RegnaParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(RegnaParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#functionList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionList(RegnaParser.FunctionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#functionList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionList(RegnaParser.FunctionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(RegnaParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(RegnaParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(RegnaParser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(RegnaParser.ModuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(RegnaParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(RegnaParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegnaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RegnaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegnaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RegnaParser.ProgramContext ctx);
}