// Generated from Z:/Java/ideaspace/Regna/src\Regna.g4 by ANTLR 4.7
package io.regna.core;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegnaParser}.
 */
public interface RegnaListener extends ParseTreeListener {
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