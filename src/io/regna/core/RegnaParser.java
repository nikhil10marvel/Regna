// Generated from Z:/Java/ideaspace/Regna/src\Regna.g4 by ANTLR 4.7
package io.regna.core;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegnaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, MODULE_DEC = 6, LBRC = 7, RBRC = 8,
			LPRM = 9, RPRM = 10, PARAM_SEPERATOR = 11, PARAM_TYPE_DEF = 12, VAR_DEC = 13, EQUALS = 14,
			PKGID = 15, EOS = 16, CMTCH = 17, MCOMO = 18, MCOMC = 19, L_VOID = 20, FUNC_DEF = 21,
			CONSTRUCT_DEF = 22, PRINT = 23, REQUIRE = 24, STATICFUNC = 25, MEMBER_CT = 26, MEMBER_T = 27,
			CONSTRUCTOR = 28, ATTRIBUTE_DEF = 29, Const = 30, TRANSIENT = 31, STATICATTRIBUTE = 32,
			STRUCT_DEF = 33, STRUCT_T = 34, CHAR_ID = 35, INT_ID = 36, STR_ID = 37, DBL_id = 38,
			FLT_ID = 39, BYTE = 40, SERIALIZABLE = 41, COMPILER_INSTR = 42, Compiler_Compile_CMD = 43,
			Compiler_cpextend_CMD = 44, INTEGER = 45, SIMP_CHAR = 46, SIMP_CHARS = 47, BASE_CHARACTER = 48,
			BASE_CHARACTERS = 49, AR_CHARS = 50, CHRCT = 51, BlankLiteral = 52, StringLiteral = 53,
			LINE_COMMENT = 54, MULTI_COMMENT = 55, WS = 56;
	public static final int
			RULE_id = 0, RULE_mid = 1, RULE_call_mid = 2, RULE_arid = 3, RULE_type_id = 4,
			RULE_ret_type = 5, RULE_add = 6, RULE_mult = 7, RULE_expr = 8, RULE_value = 9,
			RULE_field_param = 10, RULE_box_types = 11, RULE_type = 12, RULE_vartype = 13,
			RULE_vardef_stmt = 14, RULE_localvar_stmt = 15, RULE_print_stmt = 16,
			RULE_construct_stmt = 17, RULE_construct_call = 18, RULE_attrvaldef = 19,
			RULE_attrdef_stmt = 20, RULE_static_attrdef = 21, RULE_require = 22, RULE_call_params = 23,
			RULE_membercall_stmt = 24, RULE_internal_call = 25, RULE_member_rule = 26,
			RULE_cast_type = 27, RULE_struct_body = 28, RULE_struct_stmt = 29, RULE_struct_param = 30,
			RULE_struct_init_stmt = 31, RULE_extract_type = 32, RULE_struct_val = 33,
			RULE_struct_set_stmt = 34, RULE_stmt = 35, RULE_compiler_compile_instruction = 36,
			RULE_compiler_cp_instruction = 37, RULE_compiler_instruction = 38, RULE_requireList = 39,
			RULE_stmtList = 40, RULE_formalParam = 41, RULE_formalParamList = 42,
			RULE_staticformalFunction = 43, RULE_func = 44, RULE_constructor = 45,
			RULE_functionList = 46, RULE_attributes = 47, RULE_moduleBody = 48, RULE_module = 49,
			RULE_program = 50;
	public static final String[] ruleNames = {
			"id", "mid", "call_mid", "arid", "type_id", "ret_type", "add", "mult",
			"expr", "value", "field_param", "box_types", "type", "vartype", "vardef_stmt",
			"localvar_stmt", "print_stmt", "construct_stmt", "construct_call", "attrvaldef",
			"attrdef_stmt", "static_attrdef", "require", "call_params", "membercall_stmt",
			"internal_call", "member_rule", "cast_type", "struct_body", "struct_stmt",
			"struct_param", "struct_init_stmt", "extract_type", "struct_val", "struct_set_stmt",
			"stmt", "compiler_compile_instruction", "compiler_cp_instruction", "compiler_instruction",
			"requireList", "stmtList", "formalParam", "formalParamList", "staticformalFunction",
			"func", "constructor", "functionList", "attributes", "moduleBody", "module",
			"program"
	};

	private static final String[] _LITERAL_NAMES = {
			null, "'+'", "'-'", "'*'", "'/'", "'init'", "'module'", "'{'", "'}'",
			"'('", "')'", "','", "':'", null, "'='", "'pkg'", "';'", "'##'", "'#['",
			"']#'", "'void'", "'def'", "'construct'", null, null, "'stfc'", "'->'",
			"'=>'", null, null, null, null, "'stval'", "'structdef'", "'struct'",
			"'char'", "'int'", "'String'", "'double'", "'float'", "'byte'", "'serializable'",
			"'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
			null, null, null, null, null, null, "MODULE_DEC", "LBRC", "RBRC", "LPRM",
			"RPRM", "PARAM_SEPERATOR", "PARAM_TYPE_DEF", "VAR_DEC", "EQUALS", "PKGID",
			"EOS", "CMTCH", "MCOMO", "MCOMC", "L_VOID", "FUNC_DEF", "CONSTRUCT_DEF",
			"PRINT", "REQUIRE", "STATICFUNC", "MEMBER_CT", "MEMBER_T", "CONSTRUCTOR",
			"ATTRIBUTE_DEF", "Const", "TRANSIENT", "STATICATTRIBUTE", "STRUCT_DEF",
			"STRUCT_T", "CHAR_ID", "INT_ID", "STR_ID", "DBL_id", "FLT_ID", "BYTE",
			"SERIALIZABLE", "COMPILER_INSTR", "Compiler_Compile_CMD", "Compiler_cpextend_CMD",
			"INTEGER", "SIMP_CHAR", "SIMP_CHARS", "BASE_CHARACTER", "BASE_CHARACTERS",
			"AR_CHARS", "CHRCT", "BlankLiteral", "StringLiteral", "LINE_COMMENT",
			"MULTI_COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Regna.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegnaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IdContext extends ParserRuleContext {
		public TerminalNode SIMP_CHARS() { return getToken(RegnaParser.SIMP_CHARS, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(102);
			match(SIMP_CHARS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MidContext extends ParserRuleContext {
		public TerminalNode BASE_CHARACTERS() { return getToken(RegnaParser.BASE_CHARACTERS, 0); }
		public TerminalNode SIMP_CHARS() { return getToken(RegnaParser.SIMP_CHARS, 0); }
		public MidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterMid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitMid(this);
		}
	}

	public final MidContext mid() throws RecognitionException {
		MidContext _localctx = new MidContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(104);
			_la = _input.LA(1);
			if ( !(_la==SIMP_CHARS || _la==BASE_CHARACTERS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_midContext extends ParserRuleContext {
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public Call_midContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_mid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterCall_mid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitCall_mid(this);
		}
	}

	public final Call_midContext call_mid() throws RecognitionException {
		Call_midContext _localctx = new Call_midContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_call_mid);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(106);
			mid();
				setState(107);
			call_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AridContext extends ParserRuleContext {
		public TerminalNode SIMP_CHARS() { return getToken(RegnaParser.SIMP_CHARS, 0); }
		public TerminalNode AR_CHARS() { return getToken(RegnaParser.AR_CHARS, 0); }
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public AridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterArid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitArid(this);
		}
	}

	public final AridContext arid() throws RecognitionException {
		AridContext _localctx = new AridContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arid);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMP_CHARS:
				{
					setState(109);
				match(SIMP_CHARS);
				}
				break;
			case AR_CHARS:
				{
					setState(110);
				match(AR_CHARS);
				}
				break;
			case CHAR_ID:
			case INT_ID:
			case STR_ID:
			case DBL_id:
			case FLT_ID:
			case BYTE:
				{
					setState(111);
				type_id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_idContext extends ParserRuleContext {
		public TerminalNode CHAR_ID() { return getToken(RegnaParser.CHAR_ID, 0); }
		public TerminalNode INT_ID() { return getToken(RegnaParser.INT_ID, 0); }
		public TerminalNode STR_ID() { return getToken(RegnaParser.STR_ID, 0); }
		public TerminalNode DBL_id() { return getToken(RegnaParser.DBL_id, 0); }
		public TerminalNode FLT_ID() { return getToken(RegnaParser.FLT_ID, 0); }
		public TerminalNode BYTE() { return getToken(RegnaParser.BYTE, 0); }
		public Type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterType_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitType_id(this);
		}
	}

	public final Type_idContext type_id() throws RecognitionException {
		Type_idContext _localctx = new Type_idContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << DBL_id) | (1L << FLT_ID) | (1L << BYTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ret_typeContext extends ParserRuleContext {
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode L_VOID() { return getToken(RegnaParser.L_VOID, 0); }
		public Ret_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterRet_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitRet_type(this);
		}
	}

	public final Ret_typeContext ret_type() throws RecognitionException {
		Ret_typeContext _localctx = new Ret_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ret_type);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR_ID:
			case INT_ID:
			case STR_ID:
			case DBL_id:
			case FLT_ID:
			case BYTE:
				enterOuterAlt(_localctx, 1);
				{
					setState(116);
				type_id();
				}
				break;
			case SIMP_CHARS:
				enterOuterAlt(_localctx, 2);
				{
					setState(117);
				id();
				}
				break;
			case L_VOID:
				enterOuterAlt(_localctx, 3);
				{
					setState(118);
				match(L_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(121);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(123);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				{
					setState(126);
				add();
					setState(127);
				value();
				}
				break;
			case LPRM:
			case INTEGER:
			case SIMP_CHARS:
				{
					setState(129);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
				setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
						setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
							setState(132);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
							setState(133);
						mult();
							setState(134);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
							setState(136);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
							setState(137);
						add();
							setState(138);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(RegnaParser.INTEGER, 0); }
		public TerminalNode LPRM() { return getToken(RegnaParser.LPRM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPRM() { return getToken(RegnaParser.RPRM, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMP_CHARS:
				enterOuterAlt(_localctx, 1);
				{
					setState(145);
				id();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
					setState(146);
				match(INTEGER);
				}
				break;
			case LPRM:
				enterOuterAlt(_localctx, 3);
				{
					setState(147);
				match(LPRM);
					setState(148);
				expr(0);
					setState(149);
				match(RPRM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_paramContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(RegnaParser.Const, 0); }
		public TerminalNode TRANSIENT() { return getToken(RegnaParser.TRANSIENT, 0); }
		public Field_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterField_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitField_param(this);
		}
	}

	public final Field_paramContext field_param() throws RecognitionException {
		Field_paramContext _localctx = new Field_paramContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(153);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==TRANSIENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Box_typesContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(RegnaParser.StringLiteral, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public Call_midContext call_mid() {
			return getRuleContext(Call_midContext.class,0);
		}
		public Box_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_box_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterBox_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitBox_types(this);
		}
	}

	public final Box_typesContext box_types() throws RecognitionException {
		Box_typesContext _localctx = new Box_typesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_box_types);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(155);
				match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(156);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(157);
				mid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(158);
				call_mid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode CHRCT() { return getToken(RegnaParser.CHRCT, 0); }
		public TerminalNode INTEGER() { return getToken(RegnaParser.INTEGER, 0); }
		public TerminalNode StringLiteral() { return getToken(RegnaParser.StringLiteral, 0); }
		public TerminalNode BlankLiteral() { return getToken(RegnaParser.BlankLiteral, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Member_ruleContext member_rule() {
			return getRuleContext(Member_ruleContext.class,0);
		}
		public Internal_callContext internal_call() {
			return getRuleContext(Internal_callContext.class,0);
		}
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public Call_midContext call_mid() {
			return getRuleContext(Call_midContext.class,0);
		}
		public Struct_valContext struct_val() {
			return getRuleContext(Struct_valContext.class,0);
		}
		public Cast_typeContext cast_type() {
			return getRuleContext(Cast_typeContext.class, 0);
		}
		public Construct_callContext construct_call() {
			return getRuleContext(Construct_callContext.class, 0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(161);
				match(CHRCT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(162);
				match(INTEGER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(163);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(164);
				match(BlankLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(165);
				id();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(166);
				expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(167);
				member_rule();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(168);
				internal_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
					setState(169);
				mid();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
					setState(170);
				call_mid();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
					setState(171);
				struct_val();
				}
				break;
				case 12:
					enterOuterAlt(_localctx, 12);
				{
					setState(172);
					cast_type();
				}
				break;
				case 13:
					enterOuterAlt(_localctx, 13);
				{
					setState(173);
					construct_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VartypeContext extends ParserRuleContext {
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public VartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vartype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterVartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitVartype(this);
		}
	}

	public final VartypeContext vartype() throws RecognitionException {
		VartypeContext _localctx = new VartypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vartype);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(176);
				type_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(177);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(178);
				mid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vardef_stmtContext extends ParserRuleContext {
		public TerminalNode VAR_DEC() { return getToken(RegnaParser.VAR_DEC, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(RegnaParser.EQUALS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOS() { return getToken(RegnaParser.EOS, 0); }
		public Vardef_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterVardef_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitVardef_stmt(this);
		}
	}

	public final Vardef_stmtContext vardef_stmt() throws RecognitionException {
		Vardef_stmtContext _localctx = new Vardef_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vardef_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(181);
			match(VAR_DEC);
				setState(182);
			id();
				setState(183);
			match(EQUALS);
				setState(184);
			type();
				setState(185);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Localvar_stmtContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE_DEF() { return getToken(RegnaParser.ATTRIBUTE_DEF, 0); }
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EOS() { return getToken(RegnaParser.EOS, 0); }
		public TerminalNode Const() { return getToken(RegnaParser.Const, 0); }
		public AttrvaldefContext attrvaldef() {
			return getRuleContext(AttrvaldefContext.class,0);
		}
		public Localvar_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localvar_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterLocalvar_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitLocalvar_stmt(this);
		}
	}

	public final Localvar_stmtContext localvar_stmt() throws RecognitionException {
		Localvar_stmtContext _localctx = new Localvar_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_localvar_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(187);
			match(ATTRIBUTE_DEF);
				setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
					setState(188);
				match(Const);
				}
			}

				setState(191);
			vartype();
				setState(192);
			id();
				setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
					setState(193);
				attrvaldef();
				}
			}

				setState(196);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(RegnaParser.PRINT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOS() { return getToken(RegnaParser.EOS, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitPrint_stmt(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(198);
			match(PRINT);
				setState(199);
			type();
				setState(200);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Construct_stmtContext extends ParserRuleContext {
		public Box_typesContext box_types() {
			return getRuleContext(Box_typesContext.class,0);
		}
		public TerminalNode MEMBER_CT() { return getToken(RegnaParser.MEMBER_CT, 0); }
		public TerminalNode CONSTRUCTOR() { return getToken(RegnaParser.CONSTRUCTOR, 0); }
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public TerminalNode EOS() { return getToken(RegnaParser.EOS, 0); }
		public Construct_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construct_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterConstruct_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitConstruct_stmt(this);
		}
	}

	public final Construct_stmtContext construct_stmt() throws RecognitionException {
		Construct_stmtContext _localctx = new Construct_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_construct_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(202);
			box_types();
				setState(203);
			match(MEMBER_CT);
				setState(204);
			match(CONSTRUCTOR);
				setState(205);
			call_params();
				setState(206);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Construct_callContext extends ParserRuleContext {
		public Box_typesContext box_types() {
			return getRuleContext(Box_typesContext.class, 0);
		}

		public TerminalNode MEMBER_CT() {
			return getToken(RegnaParser.MEMBER_CT, 0);
		}

		public TerminalNode CONSTRUCTOR() {
			return getToken(RegnaParser.CONSTRUCTOR, 0);
		}
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class, 0);
		}
		public Construct_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_construct_call;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RegnaListener) ((RegnaListener) listener).enterConstruct_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RegnaListener) ((RegnaListener) listener).exitConstruct_call(this);
		}
	}

	public final Construct_callContext construct_call() throws RecognitionException {
		Construct_callContext _localctx = new Construct_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_construct_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(208);
				box_types();
				setState(209);
				match(MEMBER_CT);
				setState(210);
				match(CONSTRUCTOR);
				setState(211);
				call_params();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrvaldefContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(RegnaParser.EQUALS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttrvaldefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrvaldef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterAttrvaldef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitAttrvaldef(this);
		}
	}

	public final AttrvaldefContext attrvaldef() throws RecognitionException {
		AttrvaldefContext _localctx = new AttrvaldefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attrvaldef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
				setState(213);
			match(EQUALS);
				setState(214);
			type();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attrdef_stmtContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE_DEF() { return getToken(RegnaParser.ATTRIBUTE_DEF, 0); }
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EOS() { return getToken(RegnaParser.EOS, 0); }
		public List<Field_paramContext> field_param() {
			return getRuleContexts(Field_paramContext.class);
		}
		public Field_paramContext field_param(int i) {
			return getRuleContext(Field_paramContext.class,i);
		}
		public AttrvaldefContext attrvaldef() {
			return getRuleContext(AttrvaldefContext.class,0);
		}
		public Attrdef_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrdef_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterAttrdef_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitAttrdef_stmt(this);
		}
	}

	public final Attrdef_stmtContext attrdef_stmt() throws RecognitionException {
		Attrdef_stmtContext _localctx = new Attrdef_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_attrdef_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(216);
			match(ATTRIBUTE_DEF);
				setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
					setState(217);
				field_param();
				}
				break;
			}
				setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const || _la==TRANSIENT) {
				{
					setState(220);
				field_param();
				}
			}

				setState(223);
			vartype();
				setState(224);
			id();
				setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
					setState(225);
				attrvaldef();
				}
			}

				setState(228);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_attrdefContext extends ParserRuleContext {
		public TerminalNode STATICATTRIBUTE() { return getToken(RegnaParser.STATICATTRIBUTE, 0); }
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EOS() { return getToken(RegnaParser.EOS, 0); }
		public List<Field_paramContext> field_param() {
			return getRuleContexts(Field_paramContext.class);
		}
		public Field_paramContext field_param(int i) {
			return getRuleContext(Field_paramContext.class,i);
		}
		public AttrvaldefContext attrvaldef() {
			return getRuleContext(AttrvaldefContext.class,0);
		}
		public Static_attrdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_attrdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterStatic_attrdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitStatic_attrdef(this);
		}
	}

	public final Static_attrdefContext static_attrdef() throws RecognitionException {
		Static_attrdefContext _localctx = new Static_attrdefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_static_attrdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(230);
			match(STATICATTRIBUTE);
				setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
					setState(231);
				field_param();
				}
				break;
			}
				setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const || _la==TRANSIENT) {
				{
					setState(234);
				field_param();
				}
			}

				setState(237);
			vartype();
				setState(238);
			id();
				setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
					setState(239);
				attrvaldef();
				}
			}

				setState(242);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequireContext extends ParserRuleContext {
		public TerminalNode REQUIRE() { return getToken(RegnaParser.REQUIRE, 0); }
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TerminalNode EOS() { return getToken(RegnaParser.EOS, 0); }
		public RequireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_require; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterRequire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitRequire(this);
		}
	}

	public final RequireContext require() throws RecognitionException {
		RequireContext _localctx = new RequireContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_require);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(244);
			match(REQUIRE);
				setState(245);
			mid();
				setState(246);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_paramsContext extends ParserRuleContext {
		public TerminalNode LPRM() { return getToken(RegnaParser.LPRM, 0); }
		public TerminalNode RPRM() { return getToken(RegnaParser.RPRM, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> PARAM_SEPERATOR() { return getTokens(RegnaParser.PARAM_SEPERATOR); }
		public TerminalNode PARAM_SEPERATOR(int i) {
			return getToken(RegnaParser.PARAM_SEPERATOR, i);
		}
		public Call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterCall_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitCall_params(this);
		}
	}

	public final Call_paramsContext call_params() throws RecognitionException {
		Call_paramsContext _localctx = new Call_paramsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_call_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(248);
			match(LPRM);
				setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LPRM) | (1L << STRUCT_T) | (1L << INTEGER) | (1L << SIMP_CHARS) | (1L << BASE_CHARACTERS) | (1L << CHRCT) | (1L << BlankLiteral) | (1L << StringLiteral))) != 0)) {
				{
					setState(249);
				type();
				}
			}

				setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
						setState(252);
					match(PARAM_SEPERATOR);
					{
						setState(253);
						type();
					}
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
				setState(259);
			match(RPRM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Membercall_stmtContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode MEMBER_CT() { return getToken(RegnaParser.MEMBER_CT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public TerminalNode EOS() { return getToken(RegnaParser.EOS, 0); }
		public Membercall_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membercall_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterMembercall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitMembercall_stmt(this);
		}
	}

	public final Membercall_stmtContext membercall_stmt() throws RecognitionException {
		Membercall_stmtContext _localctx = new Membercall_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_membercall_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(261);
			type();
				setState(262);
			match(MEMBER_CT);
				setState(263);
			id();
				setState(264);
			call_params();
				setState(265);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Internal_callContext extends ParserRuleContext {
		public Box_typesContext box_types() {
			return getRuleContext(Box_typesContext.class,0);
		}
		public TerminalNode MEMBER_CT() { return getToken(RegnaParser.MEMBER_CT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public Internal_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internal_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterInternal_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitInternal_call(this);
		}
	}

	public final Internal_callContext internal_call() throws RecognitionException {
		Internal_callContext _localctx = new Internal_callContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_internal_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(267);
			box_types();
				setState(268);
			match(MEMBER_CT);
				setState(269);
			id();
				setState(270);
			call_params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_ruleContext extends ParserRuleContext {
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TerminalNode MEMBER_T() { return getToken(RegnaParser.MEMBER_T, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Member_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterMember_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitMember_rule(this);
		}
	}

	public final Member_ruleContext member_rule() throws RecognitionException {
		Member_ruleContext _localctx = new Member_ruleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_member_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(272);
			mid();
				setState(273);
			match(MEMBER_T);
				setState(274);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_typeContext extends ParserRuleContext {
		public TerminalNode LPRM() {
			return getToken(RegnaParser.LPRM, 0);
		}
		public Extract_typeContext extract_type() {
			return getRuleContext(Extract_typeContext.class, 0);
		}

		public TerminalNode RPRM() {
			return getToken(RegnaParser.RPRM, 0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}
		public Cast_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_cast_type;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RegnaListener) ((RegnaListener) listener).enterCast_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RegnaListener) ((RegnaListener) listener).exitCast_type(this);
		}
	}

	public final Cast_typeContext cast_type() throws RecognitionException {
		Cast_typeContext _localctx = new Cast_typeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cast_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(276);
				match(LPRM);
				setState(277);
				extract_type();
				setState(278);
				match(RPRM);
				setState(279);
				type();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_bodyContext extends ParserRuleContext {
		public List<Type_idContext> type_id() {
			return getRuleContexts(Type_idContext.class);
		}
		public Type_idContext type_id(int i) {
			return getRuleContext(Type_idContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> PARAM_SEPERATOR() { return getTokens(RegnaParser.PARAM_SEPERATOR); }
		public TerminalNode PARAM_SEPERATOR(int i) {
			return getToken(RegnaParser.PARAM_SEPERATOR, i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitStruct_body(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(281);
			type_id();
				setState(282);
			id();
				setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
					setState(283);
				match(PARAM_SEPERATOR);
					setState(284);
				type_id();
					setState(285);
				id();
				}
				}
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PARAM_SEPERATOR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_stmtContext extends ParserRuleContext {
		public TerminalNode STRUCT_DEF() { return getToken(RegnaParser.STRUCT_DEF, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(RegnaParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(RegnaParser.RBRC, 0); }
		public TerminalNode EOS() { return getToken(RegnaParser.EOS, 0); }
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public Struct_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterStruct_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitStruct_stmt(this);
		}
	}

	public final Struct_stmtContext struct_stmt() throws RecognitionException {
		Struct_stmtContext _localctx = new Struct_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_struct_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(291);
			match(STRUCT_DEF);
				setState(292);
			id();
				setState(293);
			match(LBRC);
				setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_ID) | (1L << INT_ID) | (1L << STR_ID) | (1L << DBL_id) | (1L << FLT_ID) | (1L << BYTE))) != 0)) {
				{
					setState(294);
				struct_body();
				}
			}

				setState(297);
			match(RBRC);
				setState(298);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_paramContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Struct_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterStruct_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitStruct_param(this);
		}
	}

	public final Struct_paramContext struct_param() throws RecognitionException {
		Struct_paramContext _localctx = new Struct_paramContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_struct_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(300);
			id();
				setState(301);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_init_stmtContext extends ParserRuleContext {
		public TerminalNode STRUCT_T() { return getToken(RegnaParser.STRUCT_T, 0); }
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(RegnaParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(RegnaParser.RBRC, 0); }
		public TerminalNode EOS() { return getToken(RegnaParser.EOS, 0); }
		public List<Struct_paramContext> struct_param() {
			return getRuleContexts(Struct_paramContext.class);
		}
		public Struct_paramContext struct_param(int i) {
			return getRuleContext(Struct_paramContext.class,i);
		}
		public List<TerminalNode> PARAM_SEPERATOR() { return getTokens(RegnaParser.PARAM_SEPERATOR); }
		public TerminalNode PARAM_SEPERATOR(int i) {
			return getToken(RegnaParser.PARAM_SEPERATOR, i);
		}
		public Struct_init_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_init_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterStruct_init_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitStruct_init_stmt(this);
		}
	}

	public final Struct_init_stmtContext struct_init_stmt() throws RecognitionException {
		Struct_init_stmtContext _localctx = new Struct_init_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_struct_init_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(303);
			match(STRUCT_T);
				setState(304);
			mid();
				setState(305);
				match(T__4);
				setState(306);
			id();
				setState(307);
			match(LBRC);
				setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIMP_CHARS) {
				{
				{
					setState(308);
				struct_param();
					setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAM_SEPERATOR) {
					{
					{
						setState(309);
					match(PARAM_SEPERATOR);
						setState(310);
					struct_param();
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				setState(321);
			match(RBRC);
				setState(322);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extract_typeContext extends ParserRuleContext {
		public MidContext mid() {
			return getRuleContext(MidContext.class, 0);
		}
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class, 0);
		}
		public Extract_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_extract_type;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RegnaListener) ((RegnaListener) listener).enterExtract_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RegnaListener) ((RegnaListener) listener).exitExtract_type(this);
		}
	}

	public final Extract_typeContext extract_type() throws RecognitionException {
		Extract_typeContext _localctx = new Extract_typeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_extract_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(326);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case SIMP_CHARS:
					case BASE_CHARACTERS: {
						setState(324);
						mid();
					}
					break;
					case CHAR_ID:
					case INT_ID:
					case STR_ID:
					case DBL_id:
					case FLT_ID:
					case BYTE: {
						setState(325);
						type_id();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_valContext extends ParserRuleContext {
		public TerminalNode STRUCT_T() { return getToken(RegnaParser.STRUCT_T, 0); }
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TerminalNode MEMBER_T() { return getToken(RegnaParser.MEMBER_T, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Extract_typeContext extract_type() {
			return getRuleContext(Extract_typeContext.class, 0);
		}
		public Struct_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterStruct_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitStruct_val(this);
		}
	}

	public final Struct_valContext struct_val() throws RecognitionException {
		Struct_valContext _localctx = new Struct_valContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_struct_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(328);
			match(STRUCT_T);
				setState(329);
			mid();
				setState(330);
			match(MEMBER_T);
				setState(332);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
					case 1: {
						setState(331);
						extract_type();
					}
					break;
				}
				setState(334);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_set_stmtContext extends ParserRuleContext {
		public TerminalNode STRUCT_T() { return getToken(RegnaParser.STRUCT_T, 0); }
		public TerminalNode VAR_DEC() { return getToken(RegnaParser.VAR_DEC, 0); }
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(RegnaParser.EQUALS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Struct_set_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_set_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterStruct_set_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitStruct_set_stmt(this);
		}
	}

	public final Struct_set_stmtContext struct_set_stmt() throws RecognitionException {
		Struct_set_stmtContext _localctx = new Struct_set_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_struct_set_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(336);
			match(STRUCT_T);
				setState(337);
			match(VAR_DEC);
				setState(338);
			mid();
				setState(339);
			id();
				setState(340);
			match(EQUALS);
				setState(341);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Vardef_stmtContext vardef_stmt() {
			return getRuleContext(Vardef_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Localvar_stmtContext localvar_stmt() {
			return getRuleContext(Localvar_stmtContext.class,0);
		}
		public Membercall_stmtContext membercall_stmt() {
			return getRuleContext(Membercall_stmtContext.class,0);
		}
		public Construct_stmtContext construct_stmt() {
			return getRuleContext(Construct_stmtContext.class,0);
		}
		public Struct_init_stmtContext struct_init_stmt() {
			return getRuleContext(Struct_init_stmtContext.class,0);
		}
		public Struct_stmtContext struct_stmt() {
			return getRuleContext(Struct_stmtContext.class,0);
		}
		public Struct_set_stmtContext struct_set_stmt() {
			return getRuleContext(Struct_set_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_stmt);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(343);
				vardef_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(344);
				print_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(345);
				localvar_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(346);
				membercall_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(347);
				construct_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(348);
				struct_init_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(349);
				struct_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(350);
				struct_set_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compiler_compile_instructionContext extends ParserRuleContext {
		public TerminalNode Compiler_Compile_CMD() {
			return getToken(RegnaParser.Compiler_Compile_CMD, 0);
		}

		public TerminalNode StringLiteral() {
			return getToken(RegnaParser.StringLiteral, 0);
		}

		public TerminalNode EOS() {
			return getToken(RegnaParser.EOS, 0);
		}
		public Compiler_compile_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compiler_compile_instruction;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RegnaListener) ((RegnaListener) listener).enterCompiler_compile_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RegnaListener) ((RegnaListener) listener).exitCompiler_compile_instruction(this);
		}
	}

	public final Compiler_compile_instructionContext compiler_compile_instruction() throws RecognitionException {
		Compiler_compile_instructionContext _localctx = new Compiler_compile_instructionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_compiler_compile_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(353);
				match(Compiler_Compile_CMD);
				setState(354);
				match(StringLiteral);
				setState(355);
				match(EOS);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compiler_cp_instructionContext extends ParserRuleContext {
		public TerminalNode Compiler_cpextend_CMD() {
			return getToken(RegnaParser.Compiler_cpextend_CMD, 0);
		}

		public TerminalNode StringLiteral() {
			return getToken(RegnaParser.StringLiteral, 0);
		}

		public TerminalNode EOS() {
			return getToken(RegnaParser.EOS, 0);
		}
		public Compiler_cp_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compiler_cp_instruction;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RegnaListener) ((RegnaListener) listener).enterCompiler_cp_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RegnaListener) ((RegnaListener) listener).exitCompiler_cp_instruction(this);
		}
	}

	public final Compiler_cp_instructionContext compiler_cp_instruction() throws RecognitionException {
		Compiler_cp_instructionContext _localctx = new Compiler_cp_instructionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_compiler_cp_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(357);
				match(Compiler_cpextend_CMD);
				setState(358);
				match(StringLiteral);
				setState(359);
				match(EOS);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compiler_instructionContext extends ParserRuleContext {
		public Compiler_compile_instructionContext compiler_compile_instruction() {
			return getRuleContext(Compiler_compile_instructionContext.class, 0);
		}
		public Compiler_cp_instructionContext compiler_cp_instruction() {
			return getRuleContext(Compiler_cp_instructionContext.class, 0);
		}
		public Compiler_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compiler_instruction;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof RegnaListener) ((RegnaListener) listener).enterCompiler_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof RegnaListener) ((RegnaListener) listener).exitCompiler_instruction(this);
		}
	}

	public final Compiler_instructionContext compiler_instruction() throws RecognitionException {
		Compiler_instructionContext _localctx = new Compiler_instructionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_compiler_instruction);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Compiler_Compile_CMD:
					enterOuterAlt(_localctx, 1);
				{
					setState(361);
					compiler_compile_instruction();
				}
				break;
				case Compiler_cpextend_CMD:
					enterOuterAlt(_localctx, 2);
				{
					setState(362);
					compiler_cp_instruction();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequireListContext extends ParserRuleContext {
		public List<RequireContext> require() {
			return getRuleContexts(RequireContext.class);
		}
		public RequireContext require(int i) {
			return getRuleContext(RequireContext.class,i);
		}
		public List<Compiler_instructionContext> compiler_instruction() {
			return getRuleContexts(Compiler_instructionContext.class);
		}
		public Compiler_instructionContext compiler_instruction(int i) {
			return getRuleContext(Compiler_instructionContext.class, i);
		}
		public RequireListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requireList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterRequireList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitRequireList(this);
		}
	}

	public final RequireListContext requireList() throws RecognitionException {
		RequireListContext _localctx = new RequireListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_requireList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
					setState(367);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case REQUIRE: {
							setState(365);
							require();
						}
						break;
						case Compiler_Compile_CMD:
						case Compiler_cpextend_CMD: {
							setState(366);
							compiler_instruction();
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
				}
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REQUIRE) | (1L << Compiler_Compile_CMD) | (1L << Compiler_cpextend_CMD))) != 0));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtListContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitStmtList(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_stmtList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
					setState(371);
				stmt();
				}
				}
				setState(374); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LPRM) | (1L << VAR_DEC) | (1L << PRINT) | (1L << ATTRIBUTE_DEF) | (1L << STRUCT_DEF) | (1L << STRUCT_T) | (1L << INTEGER) | (1L << SIMP_CHARS) | (1L << BASE_CHARACTERS) | (1L << CHRCT) | (1L << BlankLiteral) | (1L << StringLiteral))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParamContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PARAM_TYPE_DEF() { return getToken(RegnaParser.PARAM_TYPE_DEF, 0); }
		public AridContext arid() {
			return getRuleContext(AridContext.class,0);
		}
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterFormalParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitFormalParam(this);
		}
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_formalParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(376);
			id();
				setState(377);
			match(PARAM_TYPE_DEF);
				setState(378);
			arid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParamListContext extends ParserRuleContext {
		public TerminalNode LPRM() { return getToken(RegnaParser.LPRM, 0); }
		public List<FormalParamContext> formalParam() {
			return getRuleContexts(FormalParamContext.class);
		}
		public FormalParamContext formalParam(int i) {
			return getRuleContext(FormalParamContext.class,i);
		}
		public TerminalNode RPRM() { return getToken(RegnaParser.RPRM, 0); }
		public List<TerminalNode> PARAM_SEPERATOR() { return getTokens(RegnaParser.PARAM_SEPERATOR); }
		public TerminalNode PARAM_SEPERATOR(int i) {
			return getToken(RegnaParser.PARAM_SEPERATOR, i);
		}
		public FormalParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterFormalParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitFormalParamList(this);
		}
	}

	public final FormalParamListContext formalParamList() throws RecognitionException {
		FormalParamListContext _localctx = new FormalParamListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_formalParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(380);
			match(LPRM);
				setState(381);
			formalParam();
				setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARAM_SEPERATOR) {
				{
				{
					setState(382);
				match(PARAM_SEPERATOR);
					setState(383);
				formalParam();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
				setState(389);
			match(RPRM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticformalFunctionContext extends ParserRuleContext {
		public TerminalNode STATICFUNC() { return getToken(RegnaParser.STATICFUNC, 0); }
		public Ret_typeContext ret_type() {
			return getRuleContext(Ret_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(RegnaParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(RegnaParser.RBRC, 0); }
		public FormalParamListContext formalParamList() {
			return getRuleContext(FormalParamListContext.class,0);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public StaticformalFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticformalFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterStaticformalFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitStaticformalFunction(this);
		}
	}

	public final StaticformalFunctionContext staticformalFunction() throws RecognitionException {
		StaticformalFunctionContext _localctx = new StaticformalFunctionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_staticformalFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(391);
			match(STATICFUNC);
				setState(392);
			ret_type();
				setState(393);
			id();
				setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPRM) {
				{
					setState(394);
				formalParamList();
				}
			}

				setState(397);
			match(LBRC);
				setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LPRM) | (1L << VAR_DEC) | (1L << PRINT) | (1L << ATTRIBUTE_DEF) | (1L << STRUCT_DEF) | (1L << STRUCT_T) | (1L << INTEGER) | (1L << SIMP_CHARS) | (1L << BASE_CHARACTERS) | (1L << CHRCT) | (1L << BlankLiteral) | (1L << StringLiteral))) != 0)) {
				{
					setState(398);
				stmtList();
				}
			}

				setState(401);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNC_DEF() { return getToken(RegnaParser.FUNC_DEF, 0); }
		public Ret_typeContext ret_type() {
			return getRuleContext(Ret_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(RegnaParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(RegnaParser.RBRC, 0); }
		public FormalParamListContext formalParamList() {
			return getRuleContext(FormalParamListContext.class,0);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(403);
			match(FUNC_DEF);
				setState(404);
			ret_type();
				setState(405);
			id();
				setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPRM) {
				{
					setState(406);
				formalParamList();
				}
			}

				setState(409);
			match(LBRC);
				setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LPRM) | (1L << VAR_DEC) | (1L << PRINT) | (1L << ATTRIBUTE_DEF) | (1L << STRUCT_DEF) | (1L << STRUCT_T) | (1L << INTEGER) | (1L << SIMP_CHARS) | (1L << BASE_CHARACTERS) | (1L << CHRCT) | (1L << BlankLiteral) | (1L << StringLiteral))) != 0)) {
				{
					setState(410);
				stmtList();
				}
			}

				setState(413);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCT_DEF() { return getToken(RegnaParser.CONSTRUCT_DEF, 0); }
		public TerminalNode LBRC() { return getToken(RegnaParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(RegnaParser.RBRC, 0); }
		public FormalParamListContext formalParamList() {
			return getRuleContext(FormalParamListContext.class,0);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(415);
			match(CONSTRUCT_DEF);
				setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPRM) {
				{
					setState(416);
				formalParamList();
				}
			}

				setState(419);
			match(LBRC);
				setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LPRM) | (1L << VAR_DEC) | (1L << PRINT) | (1L << ATTRIBUTE_DEF) | (1L << STRUCT_DEF) | (1L << STRUCT_T) | (1L << INTEGER) | (1L << SIMP_CHARS) | (1L << BASE_CHARACTERS) | (1L << CHRCT) | (1L << BlankLiteral) | (1L << StringLiteral))) != 0)) {
				{
					setState(420);
				stmtList();
				}
			}

				setState(423);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionListContext extends ParserRuleContext {
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<StaticformalFunctionContext> staticformalFunction() {
			return getRuleContexts(StaticformalFunctionContext.class);
		}
		public StaticformalFunctionContext staticformalFunction(int i) {
			return getRuleContext(StaticformalFunctionContext.class,i);
		}
		public FunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterFunctionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitFunctionList(this);
		}
	}

	public final FunctionListContext functionList() throws RecognitionException {
		FunctionListContext _localctx = new FunctionListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
					setState(427);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC_DEF:
					{
						setState(425);
					func();
					}
					break;
				case STATICFUNC:
					{
						setState(426);
					staticformalFunction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(429); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC_DEF || _la==STATICFUNC );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<Attrdef_stmtContext> attrdef_stmt() {
			return getRuleContexts(Attrdef_stmtContext.class);
		}
		public Attrdef_stmtContext attrdef_stmt(int i) {
			return getRuleContext(Attrdef_stmtContext.class,i);
		}
		public List<Static_attrdefContext> static_attrdef() {
			return getRuleContexts(Static_attrdefContext.class);
		}
		public Static_attrdefContext static_attrdef(int i) {
			return getRuleContext(Static_attrdefContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(435);
			_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
						setState(433);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ATTRIBUTE_DEF:
						{
							setState(431);
						attrdef_stmt();
						}
						break;
					case STATICATTRIBUTE:
						{
							setState(432);
						static_attrdef();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBodyContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public FunctionListContext functionList() {
			return getRuleContext(FunctionListContext.class,0);
		}
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterModuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitModuleBody(this);
		}
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_moduleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(438);
			attributes();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == CONSTRUCT_DEF) {
					{
						setState(439);
						constructor();
					}
				}

				setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNC_DEF || _la==STATICFUNC) {
				{
					setState(442);
				functionList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE_DEC() { return getToken(RegnaParser.MODULE_DEC, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PKGID() { return getToken(RegnaParser.PKGID, 0); }
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(RegnaParser.LBRC, 0); }
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public TerminalNode RBRC() { return getToken(RegnaParser.RBRC, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(RegnaParser.SERIALIZABLE, 0); }
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(445);
			match(MODULE_DEC);
				setState(446);
			id();
				setState(447);
			match(PKGID);
				setState(448);
			mid();
				setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SERIALIZABLE) {
				{
					setState(449);
				match(SERIALIZABLE);
				}
			}

				setState(452);
			match(LBRC);
				setState(453);
			moduleBody();
				setState(454);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public RequireListContext requireList() {
			return getRuleContext(RequireListContext.class,0);
		}
		public List<ModuleContext> module() {
			return getRuleContexts(ModuleContext.class);
		}
		public ModuleContext module(int i) {
			return getRuleContext(ModuleContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegnaListener ) ((RegnaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REQUIRE) | (1L << Compiler_Compile_CMD) | (1L << Compiler_cpextend_CMD))) != 0)) {
				{
					setState(456);
				requireList();
				}
			}

				setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
					setState(459);
				module();
				}
				}
				setState(462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MODULE_DEC );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01d3\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
					",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
					"\64\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\3\7\3\7\3" +
					"\7\5\7z\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0085\n\n\3\n\3\n" +
					"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008f\n\n\f\n\16\n\u0092\13\n\3\13\3\13\3" +
					"\13\3\13\3\13\3\13\5\13\u009a\n\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00a2\n" +
					"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5" +
					"\16\u00b1\n\16\3\17\3\17\3\17\5\17\u00b6\n\17\3\20\3\20\3\20\3\20\3\20" +
					"\3\20\3\21\3\21\5\21\u00c0\n\21\3\21\3\21\3\21\5\21\u00c5\n\21\3\21\3" +
					"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3" +
					"\24\3\24\3\25\3\25\3\25\3\26\3\26\5\26\u00dd\n\26\3\26\5\26\u00e0\n\26" +
					"\3\26\3\26\3\26\5\26\u00e5\n\26\3\26\3\26\3\27\3\27\5\27\u00eb\n\27\3" +
					"\27\5\27\u00ee\n\27\3\27\3\27\3\27\5\27\u00f3\n\27\3\27\3\27\3\30\3\30" +
					"\3\30\3\30\3\31\3\31\5\31\u00fd\n\31\3\31\3\31\7\31\u0101\n\31\f\31\16" +
					"\31\u0104\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33" +
					"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36" +
					"\3\36\3\36\3\36\6\36\u0122\n\36\r\36\16\36\u0123\3\37\3\37\3\37\3\37\5" +
					"\37\u012a\n\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\7!\u013a" +
					"\n!\f!\16!\u013d\13!\7!\u013f\n!\f!\16!\u0142\13!\3!\3!\3!\3\"\3\"\5\"" +
					"\u0149\n\"\3#\3#\3#\3#\5#\u014f\n#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3" +
					"%\3%\3%\3%\3%\3%\5%\u0162\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\5(\u016e" +
					"\n(\3)\3)\6)\u0172\n)\r)\16)\u0173\3*\6*\u0177\n*\r*\16*\u0178\3+\3+\3" +
					"+\3+\3,\3,\3,\3,\7,\u0183\n,\f,\16,\u0186\13,\3,\3,\3-\3-\3-\3-\5-\u018e" +
					"\n-\3-\3-\5-\u0192\n-\3-\3-\3.\3.\3.\3.\5.\u019a\n.\3.\3.\5.\u019e\n." +
					"\3.\3.\3/\3/\5/\u01a4\n/\3/\3/\5/\u01a8\n/\3/\3/\3\60\3\60\6\60\u01ae" +
					"\n\60\r\60\16\60\u01af\3\61\3\61\7\61\u01b4\n\61\f\61\16\61\u01b7\13\61" +
					"\3\62\3\62\5\62\u01bb\n\62\3\62\5\62\u01be\n\62\3\63\3\63\3\63\3\63\3" +
					"\63\5\63\u01c5\n\63\3\63\3\63\3\63\3\63\3\64\5\64\u01cc\n\64\3\64\6\64" +
					"\u01cf\n\64\r\64\16\64\u01d0\3\64\4\u0102\u01b5\3\22\65\2\4\6\b\n\f\16" +
					"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd" +
					"f\2\7\4\2\61\61\63\63\3\2%*\3\2\3\4\3\2\5\6\3\2 !\2\u01e4\2h\3\2\2\2\4" +
					"j\3\2\2\2\6l\3\2\2\2\br\3\2\2\2\nt\3\2\2\2\fy\3\2\2\2\16{\3\2\2\2\20}" +
					"\3\2\2\2\22\u0084\3\2\2\2\24\u0099\3\2\2\2\26\u009b\3\2\2\2\30\u00a1\3" +
					"\2\2\2\32\u00b0\3\2\2\2\34\u00b5\3\2\2\2\36\u00b7\3\2\2\2 \u00bd\3\2\2" +
					"\2\"\u00c8\3\2\2\2$\u00cc\3\2\2\2&\u00d2\3\2\2\2(\u00d7\3\2\2\2*\u00da" +
					"\3\2\2\2,\u00e8\3\2\2\2.\u00f6\3\2\2\2\60\u00fa\3\2\2\2\62\u0107\3\2\2" +
					"\2\64\u010d\3\2\2\2\66\u0112\3\2\2\28\u0116\3\2\2\2:\u011b\3\2\2\2<\u0125" +
					"\3\2\2\2>\u012e\3\2\2\2@\u0131\3\2\2\2B\u0148\3\2\2\2D\u014a\3\2\2\2F" +
					"\u0152\3\2\2\2H\u0161\3\2\2\2J\u0163\3\2\2\2L\u0167\3\2\2\2N\u016d\3\2" +
					"\2\2P\u0171\3\2\2\2R\u0176\3\2\2\2T\u017a\3\2\2\2V\u017e\3\2\2\2X\u0189" +
					"\3\2\2\2Z\u0195\3\2\2\2\\\u01a1\3\2\2\2^\u01ad\3\2\2\2`\u01b5\3\2\2\2" +
					"b\u01b8\3\2\2\2d\u01bf\3\2\2\2f\u01cb\3\2\2\2hi\7\61\2\2i\3\3\2\2\2jk" +
					"\t\2\2\2k\5\3\2\2\2lm\5\4\3\2mn\5\60\31\2n\7\3\2\2\2os\7\61\2\2ps\7\64" +
					"\2\2qs\5\n\6\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\t\3\2\2\2tu\t\3\2\2u\13" +
					"\3\2\2\2vz\5\n\6\2wz\5\2\2\2xz\7\26\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2" +
					"z\r\3\2\2\2{|\t\4\2\2|\17\3\2\2\2}~\t\5\2\2~\21\3\2\2\2\177\u0080\b\n" +
					"\1\2\u0080\u0081\5\16\b\2\u0081\u0082\5\24\13\2\u0082\u0085\3\2\2\2\u0083" +
					"\u0085\5\24\13\2\u0084\177\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0090\3\2" +
					"\2\2\u0086\u0087\f\5\2\2\u0087\u0088\5\20\t\2\u0088\u0089\5\22\n\6\u0089" +
					"\u008f\3\2\2\2\u008a\u008b\f\4\2\2\u008b\u008c\5\16\b\2\u008c\u008d\5" +
					"\22\n\5\u008d\u008f\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u008a\3\2\2\2\u008f" +
					"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\23\3\2\2" +
					"\2\u0092\u0090\3\2\2\2\u0093\u009a\5\2\2\2\u0094\u009a\7/\2\2\u0095\u0096" +
					"\7\13\2\2\u0096\u0097\5\22\n\2\u0097\u0098\7\f\2\2\u0098\u009a\3\2\2\2" +
					"\u0099\u0093\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u009a\25" +
					"\3\2\2\2\u009b\u009c\t\6\2\2\u009c\27\3\2\2\2\u009d\u00a2\7\67\2\2\u009e" +
					"\u00a2\5\2\2\2\u009f\u00a2\5\4\3\2\u00a0\u00a2\5\6\4\2\u00a1\u009d\3\2" +
					"\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2" +
					"\31\3\2\2\2\u00a3\u00b1\7\65\2\2\u00a4\u00b1\7/\2\2\u00a5\u00b1\7\67\2" +
					"\2\u00a6\u00b1\7\66\2\2\u00a7\u00b1\5\2\2\2\u00a8\u00b1\5\22\n\2\u00a9" +
					"\u00b1\5\66\34\2\u00aa\u00b1\5\64\33\2\u00ab\u00b1\5\4\3\2\u00ac\u00b1" +
					"\5\6\4\2\u00ad\u00b1\5D#\2\u00ae\u00b1\58\35\2\u00af\u00b1\5&\24\2\u00b0" +
					"\u00a3\3\2\2\2\u00b0\u00a4\3\2\2\2\u00b0\u00a5\3\2\2\2\u00b0\u00a6\3\2" +
					"\2\2\u00b0\u00a7\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0" +
					"\u00aa\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2" +
					"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\33\3\2\2\2\u00b2\u00b6" +
					"\5\n\6\2\u00b3\u00b6\5\2\2\2\u00b4\u00b6\5\4\3\2\u00b5\u00b2\3\2\2\2\u00b5" +
					"\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\7\17\2" +
					"\2\u00b8\u00b9\5\2\2\2\u00b9\u00ba\7\20\2\2\u00ba\u00bb\5\32\16\2\u00bb" +
					"\u00bc\7\22\2\2\u00bc\37\3\2\2\2\u00bd\u00bf\7\37\2\2\u00be\u00c0\7 \2" +
					"\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2" +
					"\5\34\17\2\u00c2\u00c4\5\2\2\2\u00c3\u00c5\5(\25\2\u00c4\u00c3\3\2\2\2" +
					"\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\22\2\2\u00c7!\3" +
					"\2\2\2\u00c8\u00c9\7\31\2\2\u00c9\u00ca\5\32\16\2\u00ca\u00cb\7\22\2\2" +
					"\u00cb#\3\2\2\2\u00cc\u00cd\5\30\r\2\u00cd\u00ce\7\34\2\2\u00ce\u00cf" +
					"\7\36\2\2\u00cf\u00d0\5\60\31\2\u00d0\u00d1\7\22\2\2\u00d1%\3\2\2\2\u00d2" +
					"\u00d3\5\30\r\2\u00d3\u00d4\7\34\2\2\u00d4\u00d5\7\36\2\2\u00d5\u00d6" +
					"\5\60\31\2\u00d6\'\3\2\2\2\u00d7\u00d8\7\20\2\2\u00d8\u00d9\5\32\16\2" +
					"\u00d9)\3\2\2\2\u00da\u00dc\7\37\2\2\u00db\u00dd\5\26\f\2\u00dc\u00db" +
					"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00e0\5\26\f\2" +
					"\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2" +
					"\5\34\17\2\u00e2\u00e4\5\2\2\2\u00e3\u00e5\5(\25\2\u00e4\u00e3\3\2\2\2" +
					"\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\22\2\2\u00e7+\3" +
					"\2\2\2\u00e8\u00ea\7\"\2\2\u00e9\u00eb\5\26\f\2\u00ea\u00e9\3\2\2\2\u00ea" +
					"\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ee\5\26\f\2\u00ed\u00ec\3" +
					"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\5\34\17\2\u00f0" +
					"\u00f2\5\2\2\2\u00f1\u00f3\5(\25\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2" +
					"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7\22\2\2\u00f5-\3\2\2\2\u00f6\u00f7" +
					"\7\32\2\2\u00f7\u00f8\5\4\3\2\u00f8\u00f9\7\22\2\2\u00f9/\3\2\2\2\u00fa" +
					"\u00fc\7\13\2\2\u00fb\u00fd\5\32\16\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd" +
					"\3\2\2\2\u00fd\u0102\3\2\2\2\u00fe\u00ff\7\r\2\2\u00ff\u0101\5\32\16\2" +
					"\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0103\3\2\2\2\u0102\u0100" +
					"\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7\f\2\2\u0106" +
					"\61\3\2\2\2\u0107\u0108\5\32\16\2\u0108\u0109\7\34\2\2\u0109\u010a\5\2" +
					"\2\2\u010a\u010b\5\60\31\2\u010b\u010c\7\22\2\2\u010c\63\3\2\2\2\u010d" +
					"\u010e\5\30\r\2\u010e\u010f\7\34\2\2\u010f\u0110\5\2\2\2\u0110\u0111\5" +
					"\60\31\2\u0111\65\3\2\2\2\u0112\u0113\5\4\3\2\u0113\u0114\7\35\2\2\u0114" +
					"\u0115\5\2\2\2\u0115\67\3\2\2\2\u0116\u0117\7\13\2\2\u0117\u0118\5B\"" +
					"\2\u0118\u0119\7\f\2\2\u0119\u011a\5\32\16\2\u011a9\3\2\2\2\u011b\u011c" +
					"\5\n\6\2\u011c\u0121\5\2\2\2\u011d\u011e\7\r\2\2\u011e\u011f\5\n\6\2\u011f" +
					"\u0120\5\2\2\2\u0120\u0122\3\2\2\2\u0121\u011d\3\2\2\2\u0122\u0123\3\2" +
					"\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124;\3\2\2\2\u0125\u0126" +
					"\7#\2\2\u0126\u0127\5\2\2\2\u0127\u0129\7\t\2\2\u0128\u012a\5:\36\2\u0129" +
					"\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\n" +
					"\2\2\u012c\u012d\7\22\2\2\u012d=\3\2\2\2\u012e\u012f\5\2\2\2\u012f\u0130" +
					"\5\32\16\2\u0130?\3\2\2\2\u0131\u0132\7$\2\2\u0132\u0133\5\4\3\2\u0133" +
					"\u0134\7\7\2\2\u0134\u0135\5\2\2\2\u0135\u0140\7\t\2\2\u0136\u013b\5>" +
					" \2\u0137\u0138\7\r\2\2\u0138\u013a\5> \2\u0139\u0137\3\2\2\2\u013a\u013d" +
					"\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d" +
					"\u013b\3\2\2\2\u013e\u0136\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2" +
					"\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143" +
					"\u0144\7\n\2\2\u0144\u0145\7\22\2\2\u0145A\3\2\2\2\u0146\u0149\5\4\3\2" +
					"\u0147\u0149\5\n\6\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149C\3" +
					"\2\2\2\u014a\u014b\7$\2\2\u014b\u014c\5\4\3\2\u014c\u014e\7\35\2\2\u014d" +
					"\u014f\5B\"\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2" +
					"\2\2\u0150\u0151\5\2\2\2\u0151E\3\2\2\2\u0152\u0153\7$\2\2\u0153\u0154" +
					"\7\17\2\2\u0154\u0155\5\4\3\2\u0155\u0156\5\2\2\2\u0156\u0157\7\20\2\2" +
					"\u0157\u0158\5\32\16\2\u0158G\3\2\2\2\u0159\u0162\5\36\20\2\u015a\u0162" +
					"\5\"\22\2\u015b\u0162\5 \21\2\u015c\u0162\5\62\32\2\u015d\u0162\5$\23" +
					"\2\u015e\u0162\5@!\2\u015f\u0162\5<\37\2\u0160\u0162\5F$\2\u0161\u0159" +
					"\3\2\2\2\u0161\u015a\3\2\2\2\u0161\u015b\3\2\2\2\u0161\u015c\3\2\2\2\u0161" +
					"\u015d\3\2\2\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2" +
					"\2\2\u0162I\3\2\2\2\u0163\u0164\7-\2\2\u0164\u0165\7\67\2\2\u0165\u0166" +
					"\7\22\2\2\u0166K\3\2\2\2\u0167\u0168\7.\2\2\u0168\u0169\7\67\2\2\u0169" +
					"\u016a\7\22\2\2\u016aM\3\2\2\2\u016b\u016e\5J&\2\u016c\u016e\5L\'\2\u016d" +
					"\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016eO\3\2\2\2\u016f\u0172\5.\30\2" +
					"\u0170\u0172\5N(\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0173" +
					"\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174Q\3\2\2\2\u0175" +
					"\u0177\5H%\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2" +
					"\2\u0178\u0179\3\2\2\2\u0179S\3\2\2\2\u017a\u017b\5\2\2\2\u017b\u017c" +
					"\7\16\2\2\u017c\u017d\5\b\5\2\u017dU\3\2\2\2\u017e\u017f\7\13\2\2\u017f" +
					"\u0184\5T+\2\u0180\u0181\7\r\2\2\u0181\u0183\5T+\2\u0182\u0180\3\2\2\2" +
					"\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187" +
					"\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7\f\2\2\u0188W\3\2\2\2\u0189" +
					"\u018a\7\33\2\2\u018a\u018b\5\f\7\2\u018b\u018d\5\2\2\2\u018c\u018e\5" +
					"V,\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f" +
					"\u0191\7\t\2\2\u0190\u0192\5R*\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2" +
					"\2\u0192\u0193\3\2\2\2\u0193\u0194\7\n\2\2\u0194Y\3\2\2\2\u0195\u0196" +
					"\7\27\2\2\u0196\u0197\5\f\7\2\u0197\u0199\5\2\2\2\u0198\u019a\5V,\2\u0199" +
					"\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\7\t" +
					"\2\2\u019c\u019e\5R*\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f" +
					"\3\2\2\2\u019f\u01a0\7\n\2\2\u01a0[\3\2\2\2\u01a1\u01a3\7\30\2\2\u01a2" +
					"\u01a4\5V,\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2" +
					"\2\u01a5\u01a7\7\t\2\2\u01a6\u01a8\5R*\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8" +
					"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7\n\2\2\u01aa]\3\2\2\2\u01ab" +
					"\u01ae\5Z.\2\u01ac\u01ae\5X-\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2" +
					"\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0_\3" +
					"\2\2\2\u01b1\u01b4\5*\26\2\u01b2\u01b4\5,\27\2\u01b3\u01b1\3\2\2\2\u01b3" +
					"\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b5\u01b3\3\2" +
					"\2\2\u01b6a\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ba\5`\61\2\u01b9\u01bb" +
					"\5\\/\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc" +
					"\u01be\5^\60\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01bec\3\2\2\2" +
					"\u01bf\u01c0\7\b\2\2\u01c0\u01c1\5\2\2\2\u01c1\u01c2\7\21\2\2\u01c2\u01c4" +
					"\5\4\3\2\u01c3\u01c5\7+\2\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5" +
					"\u01c6\3\2\2\2\u01c6\u01c7\7\t\2\2\u01c7\u01c8\5b\62\2\u01c8\u01c9\7\n" +
					"\2\2\u01c9e\3\2\2\2\u01ca\u01cc\5P)\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc" +
					"\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cf\5d\63\2\u01ce\u01cd\3\2\2\2\u01cf" +
					"\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1g\3\2\2\2" +
					"\60ry\u0084\u008e\u0090\u0099\u00a1\u00b0\u00b5\u00bf\u00c4\u00dc\u00df" +
					"\u00e4\u00ea\u00ed\u00f2\u00fc\u0102\u0123\u0129\u013b\u0140\u0148\u014e" +
					"\u0161\u016d\u0171\u0173\u0178\u0184\u018d\u0191\u0199\u019d\u01a3\u01a7" +
					"\u01ad\u01af\u01b3\u01b5\u01ba\u01bd\u01c4\u01cb\u01d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}