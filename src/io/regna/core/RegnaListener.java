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
     * Enter a parse tree produced by {@link RegnaParser#varaddinc_stmt}.
     * @param ctx the parse tree
     */
    void enterVaraddinc_stmt(RegnaParser.Varaddinc_stmtContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#varaddinc_stmt}.
     *
     * @param ctx the parse tree
     */
    void exitVaraddinc_stmt(RegnaParser.Varaddinc_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#varsubinc_stmt}.
     *
     * @param ctx the parse tree
     */
    void enterVarsubinc_stmt(RegnaParser.Varsubinc_stmtContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#varsubinc_stmt}.
     *
     * @param ctx the parse tree
     */
    void exitVarsubinc_stmt(RegnaParser.Varsubinc_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#varmulinc_stmt}.
     *
     * @param ctx the parse tree
     */
    void enterVarmulinc_stmt(RegnaParser.Varmulinc_stmtContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#varmulinc_stmt}.
     *
     * @param ctx the parse tree
     */
    void exitVarmulinc_stmt(RegnaParser.Varmulinc_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#vardivinc_stmt}.
     *
     * @param ctx the parse tree
     */
    void enterVardivinc_stmt(RegnaParser.Vardivinc_stmtContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#vardivinc_stmt}.
     *
     * @param ctx the parse tree
     */
    void exitVardivinc_stmt(RegnaParser.Vardivinc_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#greaterthan}.
     *
     * @param ctx the parse tree
     */
    void enterGreaterthan(RegnaParser.GreaterthanContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#greaterthan}.
     *
     * @param ctx the parse tree
     */
    void exitGreaterthan(RegnaParser.GreaterthanContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#lesserthan}.
     *
     * @param ctx the parse tree
     */
    void enterLesserthan(RegnaParser.LesserthanContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#lesserthan}.
     *
     * @param ctx the parse tree
     */
    void exitLesserthan(RegnaParser.LesserthanContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#greaterthanE}.
     *
     * @param ctx the parse tree
     */
    void enterGreaterthanE(RegnaParser.GreaterthanEContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#greaterthanE}.
     *
     * @param ctx the parse tree
     */
    void exitGreaterthanE(RegnaParser.GreaterthanEContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#lesserthanE}.
     *
     * @param ctx the parse tree
     */
    void enterLesserthanE(RegnaParser.LesserthanEContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#lesserthanE}.
     *
     * @param ctx the parse tree
     */
    void exitLesserthanE(RegnaParser.LesserthanEContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#notequalto}.
     *
     * @param ctx the parse tree
     */
    void enterNotequalto(RegnaParser.NotequaltoContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#notequalto}.
     *
     * @param ctx the parse tree
     */
    void exitNotequalto(RegnaParser.NotequaltoContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#equalto}.
     *
     * @param ctx the parse tree
     */
    void enterEqualto(RegnaParser.EqualtoContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#equalto}.
     *
     * @param ctx the parse tree
     */
    void exitEqualto(RegnaParser.EqualtoContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#false_con}.
     *
     * @param ctx the parse tree
     */
    void enterFalse_con(RegnaParser.False_conContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#false_con}.
     *
     * @param ctx the parse tree
     */
    void exitFalse_con(RegnaParser.False_conContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#true_con}.
     *
     * @param ctx the parse tree
     */
    void enterTrue_con(RegnaParser.True_conContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#true_con}.
     *
     * @param ctx the parse tree
     */
    void exitTrue_con(RegnaParser.True_conContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#boolval}.
     *
     * @param ctx the parse tree
     */
    void enterBoolval(RegnaParser.BoolvalContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#boolval}.
     *
     * @param ctx the parse tree
     */
    void exitBoolval(RegnaParser.BoolvalContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#notboolval}.
     *
     * @param ctx the parse tree
     */
    void enterNotboolval(RegnaParser.NotboolvalContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#notboolval}.
     *
     * @param ctx the parse tree
     */
    void exitNotboolval(RegnaParser.NotboolvalContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#logicexpr}.
     *
     * @param ctx the parse tree
     */
    void enterLogicexpr(RegnaParser.LogicexprContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#logicexpr}.
     *
     * @param ctx the parse tree
     */
    void exitLogicexpr(RegnaParser.LogicexprContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#enclosed_boolval}.
     *
     * @param ctx the parse tree
     */
    void enterEnclosed_boolval(RegnaParser.Enclosed_boolvalContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#enclosed_boolval}.
     *
     * @param ctx the parse tree
     */
    void exitEnclosed_boolval(RegnaParser.Enclosed_boolvalContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#andboolexpr}.
     *
     * @param ctx the parse tree
     */
    void enterAndboolexpr(RegnaParser.AndboolexprContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#andboolexpr}.
     *
     * @param ctx the parse tree
     */
    void exitAndboolexpr(RegnaParser.AndboolexprContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#orboolexpr}.
     *
     * @param ctx the parse tree
     */
    void enterOrboolexpr(RegnaParser.OrboolexprContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#orboolexpr}.
     *
     * @param ctx the parse tree
     */
    void exitOrboolexpr(RegnaParser.OrboolexprContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#boolexpr}.
     *
     * @param ctx the parse tree
     */
    void enterBoolexpr(RegnaParser.BoolexprContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#boolexpr}.
     *
     * @param ctx the parse tree
     */
    void exitBoolexpr(RegnaParser.BoolexprContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#boolparseexpr}.
     *
     * @param ctx the parse tree
     */
    void enterBoolparseexpr(RegnaParser.BoolparseexprContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#boolparseexpr}.
     *
     * @param ctx the parse tree
     */
    void exitBoolparseexpr(RegnaParser.BoolparseexprContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#array_reference}.
     *
     * @param ctx the parse tree
     */
    void enterArray_reference(RegnaParser.Array_referenceContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#array_reference}.
     *
     * @param ctx the parse tree
     */
    void exitArray_reference(RegnaParser.Array_referenceContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#new_reference}.
     *
     * @param ctx the parse tree
     */
    void enterNew_reference(RegnaParser.New_referenceContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#new_reference}.
     *
     * @param ctx the parse tree
     */
    void exitNew_reference(RegnaParser.New_referenceContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#array_set_stmt}.
     *
     * @param ctx the parse tree
     */
    void enterArray_set_stmt(RegnaParser.Array_set_stmtContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#array_set_stmt}.
     *
     * @param ctx the parse tree
     */
    void exitArray_set_stmt(RegnaParser.Array_set_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#array_def_stmt}.
     *
     * @param ctx the parse tree
     */
    void enterArray_def_stmt(RegnaParser.Array_def_stmtContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#array_def_stmt}.
     *
     * @param ctx the parse tree
     */
    void exitArray_def_stmt(RegnaParser.Array_def_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#array_inst}.
     *
     * @param ctx the parse tree
     */
    void enterArray_inst(RegnaParser.Array_instContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#array_inst}.
     *
     * @param ctx the parse tree
     */
    void exitArray_inst(RegnaParser.Array_instContext ctx);

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
     *
     * @param ctx the parse tree
     */
    void enterPrint_stmt(RegnaParser.Print_stmtContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#print_stmt}.
     *
     * @param ctx the parse tree
     */
    void exitPrint_stmt(RegnaParser.Print_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#construct_stmt}.
     *
     * @param ctx the parse tree
     */
    void enterConstruct_stmt(RegnaParser.Construct_stmtContext ctx);

    /**
	 * Exit a parse tree produced by {@link RegnaParser#construct_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConstruct_stmt(RegnaParser.Construct_stmtContext ctx);
	/**
     * Enter a parse tree produced by {@link RegnaParser#construct_call}.
     * @param ctx the parse tree
     */
    void enterConstruct_call(RegnaParser.Construct_callContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#construct_call}.
     *
     * @param ctx the parse tree
     */
    void exitConstruct_call(RegnaParser.Construct_callContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#attrvaldef}.
     *
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
     *
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
     * Enter a parse tree produced by {@link RegnaParser#cast_type}.
     *
     * @param ctx the parse tree
     */
    void enterCast_type(RegnaParser.Cast_typeContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#cast_type}.
     *
     * @param ctx the parse tree
     */
    void exitCast_type(RegnaParser.Cast_typeContext ctx);

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
     *
     * @param ctx the parse tree
     */
    void enterStruct_param(RegnaParser.Struct_paramContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#struct_param}.
     *
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
     * Enter a parse tree produced by {@link RegnaParser#extract_type}.
     * @param ctx the parse tree
     */
    void enterExtract_type(RegnaParser.Extract_typeContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#extract_type}.
     *
     * @param ctx the parse tree
     */
    void exitExtract_type(RegnaParser.Extract_typeContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#struct_val}.
     *
     * @param ctx the parse tree
     */
    void enterStruct_val(RegnaParser.Struct_valContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#struct_val}.
     *
     * @param ctx the parse tree
     */
    void exitStruct_val(RegnaParser.Struct_valContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#struct_set_stmt}.
     *
     * @param ctx the parse tree
     */
    void enterStruct_set_stmt(RegnaParser.Struct_set_stmtContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#struct_set_stmt}.
     *
     * @param ctx the parse tree
     */
    void exitStruct_set_stmt(RegnaParser.Struct_set_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#return_stmt}.
     *
     * @param ctx the parse tree
     */
    void enterReturn_stmt(RegnaParser.Return_stmtContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#return_stmt}.
     *
     * @param ctx the parse tree
     */
    void exitReturn_stmt(RegnaParser.Return_stmtContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#elseif_block}.
     *
     * @param ctx the parse tree
     */
    void enterElseif_block(RegnaParser.Elseif_blockContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#elseif_block}.
     *
     * @param ctx the parse tree
     */
    void exitElseif_block(RegnaParser.Elseif_blockContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#else_block}.
     *
     * @param ctx the parse tree
     */
    void enterElse_block(RegnaParser.Else_blockContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#else_block}.
     *
     * @param ctx the parse tree
     */
    void exitElse_block(RegnaParser.Else_blockContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#if_block}.
     *
     * @param ctx the parse tree
     */
    void enterIf_block(RegnaParser.If_blockContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#if_block}.
     *
     * @param ctx the parse tree
     */
    void exitIf_block(RegnaParser.If_blockContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#while_block}.
     *
     * @param ctx the parse tree
     */
    void enterWhile_block(RegnaParser.While_blockContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#while_block}.
     *
     * @param ctx the parse tree
     */
    void exitWhile_block(RegnaParser.While_blockContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(RegnaParser.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(RegnaParser.BlockContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterStmt(RegnaParser.StmtContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitStmt(RegnaParser.StmtContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#compiler_compile_instruction}.
     *
     * @param ctx the parse tree
     */
    void enterCompiler_compile_instruction(RegnaParser.Compiler_compile_instructionContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#compiler_compile_instruction}.
     * @param ctx the parse tree
     */
    void exitCompiler_compile_instruction(RegnaParser.Compiler_compile_instructionContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#compiler_cp_instruction}.
     *
     * @param ctx the parse tree
     */
    void enterCompiler_cp_instruction(RegnaParser.Compiler_cp_instructionContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#compiler_cp_instruction}.
     *
     * @param ctx the parse tree
     */
    void exitCompiler_cp_instruction(RegnaParser.Compiler_cp_instructionContext ctx);

    /**
     * Enter a parse tree produced by {@link RegnaParser#compiler_instruction}.
     *
     * @param ctx the parse tree
     */
    void enterCompiler_instruction(RegnaParser.Compiler_instructionContext ctx);

    /**
     * Exit a parse tree produced by {@link RegnaParser#compiler_instruction}.
     *
     * @param ctx the parse tree
     */
    void exitCompiler_instruction(RegnaParser.Compiler_instructionContext ctx);

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