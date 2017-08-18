// Generated from Z:/Java/ideaspace/Regna/src\Regna.g4 by ANTLR 4.7
package io.regna.core;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegnaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MODULE_DEC=5, LBRC=6, RBRC=7, LPRM=8, 
		RPRM=9, PARAM_SEPERATOR=10, PARAM_TYPE_DEF=11, VAR_DEC=12, EQUALS=13, 
		PKGID=14, EOS=15, CMTCH=16, MCOMO=17, MCOMC=18, FUNC_DEF=19, PRINT=20, 
		BASE_CHARACTER=21, SIMP_CHAR=22, SIMP_CHARS=23, BASE_CHARACTERS=24, CHRCT=25, 
		StringLiteral=26, INTEGER=27, LINE_COMMENT=28, MULTI_COMMENT=29, WS=30;
	public static final int
		RULE_expr = 0, RULE_value = 1, RULE_add = 2, RULE_mult = 3, RULE_mid = 4, 
		RULE_id = 5, RULE_vardef_stmt = 6, RULE_print_stmt = 7, RULE_stmt = 8, 
		RULE_stmtList = 9, RULE_formalParam = 10, RULE_formalParamList = 11, RULE_func = 12, 
		RULE_module = 13, RULE_program = 14;
	public static final String[] ruleNames = {
		"expr", "value", "add", "mult", "mid", "id", "vardef_stmt", "print_stmt", 
		"stmt", "stmtList", "formalParam", "formalParamList", "func", "module", 
		"program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'module'", "'{'", "'}'", "'('", "')'", 
		"','", "':'", "'let'", "'='", "'pkg'", "';'", "'##'", "'#['", "']#'", 
		"'def'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "MODULE_DEC", "LBRC", "RBRC", "LPRM", "RPRM", 
		"PARAM_SEPERATOR", "PARAM_TYPE_DEF", "VAR_DEC", "EQUALS", "PKGID", "EOS", 
		"CMTCH", "MCOMO", "MCOMC", "FUNC_DEF", "PRINT", "BASE_CHARACTER", "SIMP_CHAR", 
		"SIMP_CHARS", "BASE_CHARACTERS", "CHRCT", "StringLiteral", "INTEGER", 
		"LINE_COMMENT", "MULTI_COMMENT", "WS"
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
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				{
				setState(31);
				add();
				setState(32);
				value();
				}
				break;
			case LPRM:
			case SIMP_CHARS:
			case INTEGER:
				{
				setState(34);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(37);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(38);
						mult();
						setState(39);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(41);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(42);
						add();
						setState(43);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		enterRule(_localctx, 2, RULE_value);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMP_CHARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				id();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(INTEGER);
				}
				break;
			case LPRM:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(LPRM);
				setState(53);
				expr(0);
				setState(54);
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
		enterRule(_localctx, 4, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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
		enterRule(_localctx, 6, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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

	public static class MidContext extends ParserRuleContext {
		public TerminalNode BASE_CHARACTERS() { return getToken(RegnaParser.BASE_CHARACTERS, 0); }
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
		enterRule(_localctx, 8, RULE_mid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(BASE_CHARACTERS);
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
		enterRule(_localctx, 10, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
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

	public static class Vardef_stmtContext extends ParserRuleContext {
		public TerminalNode VAR_DEC() { return getToken(RegnaParser.VAR_DEC, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(RegnaParser.EQUALS, 0); }
		public TerminalNode EOS() { return getToken(RegnaParser.EOS, 0); }
		public TerminalNode INTEGER() { return getToken(RegnaParser.INTEGER, 0); }
		public TerminalNode CHRCT() { return getToken(RegnaParser.CHRCT, 0); }
		public TerminalNode StringLiteral() { return getToken(RegnaParser.StringLiteral, 0); }
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
		enterRule(_localctx, 12, RULE_vardef_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(VAR_DEC);
			setState(67);
			id();
			setState(68);
			match(EQUALS);
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMP_CHARS:
				{
				setState(69);
				id();
				}
				break;
			case INTEGER:
				{
				setState(70);
				match(INTEGER);
				}
				break;
			case CHRCT:
				{
				setState(71);
				match(CHRCT);
				}
				break;
			case StringLiteral:
				{
				setState(72);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(75);
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
		public TerminalNode EOS() { return getToken(RegnaParser.EOS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(RegnaParser.INTEGER, 0); }
		public TerminalNode CHRCT() { return getToken(RegnaParser.CHRCT, 0); }
		public TerminalNode StringLiteral() { return getToken(RegnaParser.StringLiteral, 0); }
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
		enterRule(_localctx, 14, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(PRINT);
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMP_CHARS:
				{
				setState(78);
				id();
				}
				break;
			case INTEGER:
				{
				setState(79);
				match(INTEGER);
				}
				break;
			case CHRCT:
				{
				setState(80);
				match(CHRCT);
				}
				break;
			case StringLiteral:
				{
				setState(81);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(84);
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

	public static class StmtContext extends ParserRuleContext {
		public Vardef_stmtContext vardef_stmt() {
			return getRuleContext(Vardef_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
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
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				vardef_stmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				print_stmt();
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
		enterRule(_localctx, 18, RULE_stmtList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				stmt();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR_DEC || _la==PRINT );
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode PARAM_TYPE_DEF() { return getToken(RegnaParser.PARAM_TYPE_DEF, 0); }
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
		enterRule(_localctx, 20, RULE_formalParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			id();
			setState(96);
			match(PARAM_TYPE_DEF);
			setState(97);
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
		enterRule(_localctx, 22, RULE_formalParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(LPRM);
			setState(100);
			formalParam();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARAM_SEPERATOR) {
				{
				{
				setState(101);
				match(PARAM_SEPERATOR);
				setState(102);
				formalParam();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNC_DEF() { return getToken(RegnaParser.FUNC_DEF, 0); }
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
		enterRule(_localctx, 24, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FUNC_DEF);
			setState(111);
			id();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPRM) {
				{
				setState(112);
				formalParamList();
				}
			}

			setState(115);
			match(LBRC);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_DEC || _la==PRINT) {
				{
				setState(116);
				stmtList();
				}
			}

			setState(119);
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
		public TerminalNode RBRC() { return getToken(RegnaParser.RBRC, 0); }
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
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
		enterRule(_localctx, 26, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(MODULE_DEC);
			setState(122);
			id();
			setState(123);
			match(PKGID);
			setState(124);
			mid();
			setState(125);
			match(LBRC);
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				func();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC_DEF );
			setState(131);
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
		enterRule(_localctx, 28, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133);
				module();
				}
				}
				setState(136); 
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
		case 0:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u008d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\5\2&\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2\63\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bL\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tU\n\t"+
		"\3\t\3\t\3\n\3\n\5\n[\n\n\3\13\6\13^\n\13\r\13\16\13_\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\7\rj\n\r\f\r\16\rm\13\r\3\r\3\r\3\16\3\16\3\16\5\16t"+
		"\n\16\3\16\3\16\5\16x\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\6\17"+
		"\u0082\n\17\r\17\16\17\u0083\3\17\3\17\3\20\6\20\u0089\n\20\r\20\16\20"+
		"\u008a\3\20\2\3\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\4\3\2\3"+
		"\4\3\2\5\6\2\u008f\2%\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\n@\3\2"+
		"\2\2\fB\3\2\2\2\16D\3\2\2\2\20O\3\2\2\2\22Z\3\2\2\2\24]\3\2\2\2\26a\3"+
		"\2\2\2\30e\3\2\2\2\32p\3\2\2\2\34{\3\2\2\2\36\u0088\3\2\2\2 !\b\2\1\2"+
		"!\"\5\6\4\2\"#\5\4\3\2#&\3\2\2\2$&\5\4\3\2% \3\2\2\2%$\3\2\2\2&\61\3\2"+
		"\2\2\'(\f\5\2\2()\5\b\5\2)*\5\2\2\6*\60\3\2\2\2+,\f\4\2\2,-\5\6\4\2-."+
		"\5\2\2\5.\60\3\2\2\2/\'\3\2\2\2/+\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\64;\5\f\7\2\65;\7\35\2\2\66\67"+
		"\7\n\2\2\678\5\2\2\289\7\13\2\29;\3\2\2\2:\64\3\2\2\2:\65\3\2\2\2:\66"+
		"\3\2\2\2;\5\3\2\2\2<=\t\2\2\2=\7\3\2\2\2>?\t\3\2\2?\t\3\2\2\2@A\7\32\2"+
		"\2A\13\3\2\2\2BC\7\31\2\2C\r\3\2\2\2DE\7\16\2\2EF\5\f\7\2FK\7\17\2\2G"+
		"L\5\f\7\2HL\7\35\2\2IL\7\33\2\2JL\7\34\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2"+
		"\2KJ\3\2\2\2LM\3\2\2\2MN\7\21\2\2N\17\3\2\2\2OT\7\26\2\2PU\5\f\7\2QU\7"+
		"\35\2\2RU\7\33\2\2SU\7\34\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2"+
		"UV\3\2\2\2VW\7\21\2\2W\21\3\2\2\2X[\5\16\b\2Y[\5\20\t\2ZX\3\2\2\2ZY\3"+
		"\2\2\2[\23\3\2\2\2\\^\5\22\n\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2"+
		"\2`\25\3\2\2\2ab\5\f\7\2bc\7\r\2\2cd\5\f\7\2d\27\3\2\2\2ef\7\n\2\2fk\5"+
		"\26\f\2gh\7\f\2\2hj\5\26\f\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l"+
		"n\3\2\2\2mk\3\2\2\2no\7\13\2\2o\31\3\2\2\2pq\7\25\2\2qs\5\f\7\2rt\5\30"+
		"\r\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\7\b\2\2vx\5\24\13\2wv\3\2\2\2wx\3"+
		"\2\2\2xy\3\2\2\2yz\7\t\2\2z\33\3\2\2\2{|\7\7\2\2|}\5\f\7\2}~\7\20\2\2"+
		"~\177\5\n\6\2\177\u0081\7\b\2\2\u0080\u0082\5\32\16\2\u0081\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\7\t\2\2\u0086\35\3\2\2\2\u0087\u0089\5\34\17"+
		"\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\37\3\2\2\2\17%/\61:KTZ_ksw\u0083\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}