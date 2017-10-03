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
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            INTEGER = 18, MODULE_DEC = 19, LBRC = 20, RBRC = 21, LPRM = 22, RPRM = 23, PARAM_SEPERATOR = 24,
            PARAM_TYPE_DEF = 25, VAR_DEC = 26, EQUALS = 27, PKGID = 28, EOS = 29, CMTCH = 30,
            MCOMO = 31, MCOMC = 32, LSQB = 33, RSQB = 34, ARRDEF = 35, DIMENJOIN = 36, L_VOID = 37,
            FUNC_DEF = 38, CONSTRUCT_DEF = 39, PRINT = 40, REQUIRE = 41, STATICFUNC = 42, MEMBER_CT = 43,
            MEMBER_T = 44, CONSTRUCTOR = 45, ATTRIBUTE_DEF = 46, Const = 47, TRANSIENT = 48,
            STATICATTRIBUTE = 49, STRUCT_DEF = 50, STRUCT_T = 51, CHAR_ID = 52, INT_ID = 53,
            DBL_id = 54, FLT_ID = 55, BYTE = 56, SERIALIZABLE = 57, COMPILER_INSTR = 58, IF = 59,
            ELSE = 60, ELIF = 61, WHILE = 62, FOR = 63, RETURN = 64, Compiler_Compile_CMD = 65,
            Compiler_cpextend_CMD = 66, ArrayLiteral = 67, GT = 68, LT = 69, GTE = 70, LTE = 71,
            EQ = 72, AND = 73, OR = 74, NOT = 75, SIMP_CHAR = 76, SIMP_CHARS = 77, BASE_CHARACTER = 78,
            BASE_CHARACTERS = 79, AR_CHARS = 80, CHRCT = 81, BlankLiteral = 82, StringLiteral = 83,
            MIDARRAYLITERAL = 84, LINE_COMMENT = 85, MULTI_COMMENT = 86, WS = 87;
    public static final int
            RULE_id = 0, RULE_mid = 1, RULE_call_mid = 2, RULE_arid = 3, RULE_type_id = 4,
            RULE_ret_type = 5, RULE_add = 6, RULE_mult = 7, RULE_expr = 8, RULE_value = 9,
            RULE_varaddinc_stmt = 10, RULE_varsubinc_stmt = 11, RULE_varmulinc_stmt = 12,
            RULE_vardivinc_stmt = 13, RULE_greaterthan = 14, RULE_lesserthan = 15,
            RULE_greaterthanE = 16, RULE_lesserthanE = 17, RULE_notequalto = 18, RULE_equalto = 19,
            RULE_false_con = 20, RULE_true_con = 21, RULE_boolval = 22, RULE_notboolval = 23,
            RULE_logicexpr = 24, RULE_enclosed_boolval = 25, RULE_andboolexpr = 26,
            RULE_orboolexpr = 27, RULE_boolexpr = 28, RULE_boolparseexpr = 29, RULE_array_reference = 30,
            RULE_new_reference = 31, RULE_array_set_stmt = 32, RULE_array_def_stmt = 33,
            RULE_array_inst = 34, RULE_field_param = 35, RULE_box_types = 36, RULE_type = 37,
            RULE_vartype = 38, RULE_vardef_stmt = 39, RULE_localvar_stmt = 40, RULE_print_stmt = 41,
            RULE_construct_stmt = 42, RULE_construct_call = 43, RULE_attrvaldef = 44,
            RULE_attrdef_stmt = 45, RULE_static_attrdef = 46, RULE_require = 47, RULE_call_params = 48,
            RULE_membercall_stmt = 49, RULE_internal_call = 50, RULE_member_rule = 51,
            RULE_cast_type = 52, RULE_struct_body = 53, RULE_struct_stmt = 54, RULE_struct_param = 55,
            RULE_struct_init_stmt = 56, RULE_extract_type = 57, RULE_struct_val = 58,
            RULE_struct_set_stmt = 59, RULE_return_stmt = 60, RULE_elseif_block = 61,
            RULE_else_block = 62, RULE_if_block = 63, RULE_while_block = 64, RULE_block = 65,
            RULE_stmt = 66, RULE_compiler_compile_instruction = 67, RULE_compiler_cp_instruction = 68,
            RULE_compiler_instruction = 69, RULE_requireList = 70, RULE_stmtList = 71,
            RULE_formalParam = 72, RULE_formalParamList = 73, RULE_staticformalFunction = 74,
            RULE_func = 75, RULE_constructor = 76, RULE_functionList = 77, RULE_attributes = 78,
            RULE_moduleBody = 79, RULE_module = 80, RULE_program = 81;
    public static final String[] ruleNames = {
            "id", "mid", "call_mid", "arid", "type_id", "ret_type", "add", "mult",
            "expr", "value", "varaddinc_stmt", "varsubinc_stmt", "varmulinc_stmt",
            "vardivinc_stmt", "greaterthan", "lesserthan", "greaterthanE", "lesserthanE",
            "notequalto", "equalto", "false_con", "true_con", "boolval", "notboolval",
            "logicexpr", "enclosed_boolval", "andboolexpr", "orboolexpr", "boolexpr",
            "boolparseexpr", "array_reference", "new_reference", "array_set_stmt",
            "array_def_stmt", "array_inst", "field_param", "box_types", "type", "vartype",
            "vardef_stmt", "localvar_stmt", "print_stmt", "construct_stmt", "construct_call",
            "attrvaldef", "attrdef_stmt", "static_attrdef", "require", "call_params",
            "membercall_stmt", "internal_call", "member_rule", "cast_type", "struct_body",
            "struct_stmt", "struct_param", "struct_init_stmt", "extract_type", "struct_val",
            "struct_set_stmt", "return_stmt", "elseif_block", "else_block", "if_block",
            "while_block", "block", "stmt", "compiler_compile_instruction", "compiler_cp_instruction",
            "compiler_instruction", "requireList", "stmtList", "formalParam", "formalParamList",
            "staticformalFunction", "func", "constructor", "functionList", "attributes",
            "moduleBody", "module", "program"
    };

	private static final String[] _LITERAL_NAMES = {
            null, "'+'", "'-'", "'*'", "'/'", "'+='", "'-='", "'*='", "'/='", "'!'",
            "'FALSE'", "'False'", "'false'", "'TRUE'", "'True'", "'true'", "'$'",
            "'init'", null, "'module'", "'{'", "'}'", "'('", "')'", "','", "':'",
            null, "'='", "'pkg'", "';'", "'##'", "'#['", "']#'", "'['", "']'", "'[]'",
            "']['", "'void'", "'def'", "'construct'", null, null, "'stfc'", "'->'",
            "'=>'", null, null, null, null, "'stval'", "'structdef'", "'struct'",
            "'char'", "'int'", "'double'", "'float'", "'byte'", "'serializable'",
            "'#'", "'if'", "'else'", "'elif'", null, null, "'return'", null, null,
            null, "'>'", "'<'", "'>='", "'<='", "'=='"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, "INTEGER", "MODULE_DEC", "LBRC", "RBRC",
            "LPRM", "RPRM", "PARAM_SEPERATOR", "PARAM_TYPE_DEF", "VAR_DEC", "EQUALS",
            "PKGID", "EOS", "CMTCH", "MCOMO", "MCOMC", "LSQB", "RSQB", "ARRDEF", "DIMENJOIN",
            "L_VOID", "FUNC_DEF", "CONSTRUCT_DEF", "PRINT", "REQUIRE", "STATICFUNC",
            "MEMBER_CT", "MEMBER_T", "CONSTRUCTOR", "ATTRIBUTE_DEF", "Const", "TRANSIENT",
            "STATICATTRIBUTE", "STRUCT_DEF", "STRUCT_T", "CHAR_ID", "INT_ID", "DBL_id",
            "FLT_ID", "BYTE", "SERIALIZABLE", "COMPILER_INSTR", "IF", "ELSE", "ELIF",
            "WHILE", "FOR", "RETURN", "Compiler_Compile_CMD", "Compiler_cpextend_CMD",
            "ArrayLiteral", "GT", "LT", "GTE", "LTE", "EQ", "AND", "OR", "NOT", "SIMP_CHAR",
            "SIMP_CHARS", "BASE_CHARACTER", "BASE_CHARACTERS", "AR_CHARS", "CHRCT",
            "BlankLiteral", "StringLiteral", "MIDARRAYLITERAL", "LINE_COMMENT", "MULTI_COMMENT",
            "WS"
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
                setState(164);
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
                setState(166);
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
                setState(168);
                mid();
                setState(169);
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

        public TerminalNode ArrayLiteral() {
            return getToken(RegnaParser.ArrayLiteral, 0);
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
                setState(175);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
			case SIMP_CHARS:
				{
                    setState(171);
                    match(SIMP_CHARS);
                }
				break;
			case AR_CHARS:
				{
                    setState(172);
                    match(AR_CHARS);
                }
				break;
			case CHAR_ID:
			case INT_ID:
			case DBL_id:
			case FLT_ID:
			case BYTE:
				{
                    setState(173);
                    type_id(0);
                }
            break;
                case ArrayLiteral: {
                    setState(174);
                    match(ArrayLiteral);
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
		public TerminalNode DBL_id() { return getToken(RegnaParser.DBL_id, 0); }
		public TerminalNode FLT_ID() { return getToken(RegnaParser.FLT_ID, 0); }
		public TerminalNode BYTE() { return getToken(RegnaParser.BYTE, 0); }

        public Type_idContext type_id() {
            return getRuleContext(Type_idContext.class, 0);
        }

        public TerminalNode ARRDEF() {
            return getToken(RegnaParser.ARRDEF, 0);
        }

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
        return type_id(0);
    }

    private Type_idContext type_id(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        Type_idContext _localctx = new Type_idContext(_ctx, _parentState);
        Type_idContext _prevctx = _localctx;
        int _startState = 8;
        enterRecursionRule(_localctx, 8, RULE_type_id, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(183);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case CHAR_ID: {
                        setState(178);
                        match(CHAR_ID);
                    }
                    break;
                    case INT_ID: {
                        setState(179);
                        match(INT_ID);
                    }
                    break;
                    case DBL_id: {
                        setState(180);
                        match(DBL_id);
                    }
                    break;
                    case FLT_ID: {
                        setState(181);
                        match(FLT_ID);
                    }
                    break;
                    case BYTE: {
                        setState(182);
                        match(BYTE);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(189);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new Type_idContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_type_id);
                                setState(185);
                                if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(186);
                                match(ARRDEF);
                            }
                        }
                    }
                    setState(191);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
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
            setState(195);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
			case CHAR_ID:
			case INT_ID:
			case DBL_id:
			case FLT_ID:
			case BYTE:
				enterOuterAlt(_localctx, 1);
				{
                    setState(192);
                    type_id(0);
                }
            break;
			case SIMP_CHARS:
				enterOuterAlt(_localctx, 2);
				{
                    setState(193);
                    id();
                }
				break;
			case L_VOID:
				enterOuterAlt(_localctx, 3);
				{
                    setState(194);
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
                setState(197);
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
                setState(199);
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
                setState(206);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
			case T__0:
			case T__1:
				{
                    setState(202);
                    add();
                    setState(203);
                    value();
                }
				break;
			case INTEGER:
                case LPRM:
                case SIMP_CHARS:
                case BASE_CHARACTERS: {
                    setState(205);
                    value();
                }
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
                setState(218);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
                        setState(216);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                            case 1: {
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(208);
                            if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                            setState(209);
                            mult();
                            setState(210);
                            expr(4);
                            }
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
                            setState(212);
                            if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                            setState(213);
                            add();
                            setState(214);
                            expr(3);
                        }
						break;
					}
                    }
                }
                    setState(220);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
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

        public MidContext mid() {
            return getRuleContext(MidContext.class, 0);
        }

        public TerminalNode INTEGER() {
            return getToken(RegnaParser.INTEGER, 0);
        }

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
            setState(228);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(221);
                    id();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(222);
                    mid();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(223);
                    match(INTEGER);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(224);
                    match(LPRM);
                    setState(225);
                    expr(0);
                    setState(226);
                    match(RPRM);
                }
                break;
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

    public static class Varaddinc_stmtContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode EOS() {
            return getToken(RegnaParser.EOS, 0);
        }

        public Varaddinc_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varaddinc_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterVaraddinc_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitVaraddinc_stmt(this);
        }
    }

    public final Varaddinc_stmtContext varaddinc_stmt() throws RecognitionException {
        Varaddinc_stmtContext _localctx = new Varaddinc_stmtContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_varaddinc_stmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(230);
                id();
                setState(231);
                match(T__4);
                setState(232);
                type();
                setState(233);
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

    public static class Varsubinc_stmtContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode EOS() {
            return getToken(RegnaParser.EOS, 0);
        }

        public Varsubinc_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varsubinc_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterVarsubinc_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitVarsubinc_stmt(this);
        }
    }

    public final Varsubinc_stmtContext varsubinc_stmt() throws RecognitionException {
        Varsubinc_stmtContext _localctx = new Varsubinc_stmtContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_varsubinc_stmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(235);
                id();
                setState(236);
                match(T__5);
                setState(237);
                type();
                setState(238);
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

    public static class Varmulinc_stmtContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode EOS() {
            return getToken(RegnaParser.EOS, 0);
        }

        public Varmulinc_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varmulinc_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterVarmulinc_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitVarmulinc_stmt(this);
        }
    }

    public final Varmulinc_stmtContext varmulinc_stmt() throws RecognitionException {
        Varmulinc_stmtContext _localctx = new Varmulinc_stmtContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_varmulinc_stmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(240);
                id();
                setState(241);
                match(T__6);
                setState(242);
                type();
                setState(243);
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

    public static class Vardivinc_stmtContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode EOS() {
            return getToken(RegnaParser.EOS, 0);
        }

        public Vardivinc_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_vardivinc_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterVardivinc_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitVardivinc_stmt(this);
        }
    }

    public final Vardivinc_stmtContext vardivinc_stmt() throws RecognitionException {
        Vardivinc_stmtContext _localctx = new Vardivinc_stmtContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_vardivinc_stmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(245);
                id();
                setState(246);
                match(T__7);
                setState(247);
                type();
                setState(248);
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

    public static class GreaterthanContext extends ParserRuleContext {
        public List<TypeContext> type() {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i) {
            return getRuleContext(TypeContext.class, i);
        }

        public TerminalNode GT() {
            return getToken(RegnaParser.GT, 0);
        }

        public GreaterthanContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_greaterthan;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterGreaterthan(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitGreaterthan(this);
        }
    }

    public final GreaterthanContext greaterthan() throws RecognitionException {
        GreaterthanContext _localctx = new GreaterthanContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_greaterthan);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(250);
                type();
                setState(251);
                match(GT);
                setState(252);
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

    public static class LesserthanContext extends ParserRuleContext {
        public List<TypeContext> type() {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i) {
            return getRuleContext(TypeContext.class, i);
        }

        public TerminalNode LT() {
            return getToken(RegnaParser.LT, 0);
        }

        public LesserthanContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lesserthan;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterLesserthan(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitLesserthan(this);
        }
    }

    public final LesserthanContext lesserthan() throws RecognitionException {
        LesserthanContext _localctx = new LesserthanContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_lesserthan);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(254);
                type();
                setState(255);
                match(LT);
                setState(256);
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

    public static class GreaterthanEContext extends ParserRuleContext {
        public List<TypeContext> type() {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i) {
            return getRuleContext(TypeContext.class, i);
        }

        public TerminalNode GTE() {
            return getToken(RegnaParser.GTE, 0);
        }

        public GreaterthanEContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_greaterthanE;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterGreaterthanE(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitGreaterthanE(this);
        }
    }

    public final GreaterthanEContext greaterthanE() throws RecognitionException {
        GreaterthanEContext _localctx = new GreaterthanEContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_greaterthanE);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(258);
                type();
                setState(259);
                match(GTE);
                setState(260);
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

    public static class LesserthanEContext extends ParserRuleContext {
        public List<TypeContext> type() {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i) {
            return getRuleContext(TypeContext.class, i);
        }

        public TerminalNode LTE() {
            return getToken(RegnaParser.LTE, 0);
        }

        public LesserthanEContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lesserthanE;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterLesserthanE(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitLesserthanE(this);
        }
    }

    public final LesserthanEContext lesserthanE() throws RecognitionException {
        LesserthanEContext _localctx = new LesserthanEContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_lesserthanE);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(262);
                type();
                setState(263);
                match(LTE);
                setState(264);
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

    public static class NotequaltoContext extends ParserRuleContext {
        public List<TypeContext> type() {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i) {
            return getRuleContext(TypeContext.class, i);
        }

        public TerminalNode EQUALS() {
            return getToken(RegnaParser.EQUALS, 0);
        }

        public NotequaltoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_notequalto;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterNotequalto(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitNotequalto(this);
        }
    }

    public final NotequaltoContext notequalto() throws RecognitionException {
        NotequaltoContext _localctx = new NotequaltoContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_notequalto);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(266);
                type();
                setState(267);
                match(T__8);
                setState(268);
                match(EQUALS);
                setState(269);
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

    public static class EqualtoContext extends ParserRuleContext {
        public List<TypeContext> type() {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i) {
            return getRuleContext(TypeContext.class, i);
        }

        public TerminalNode EQ() {
            return getToken(RegnaParser.EQ, 0);
        }

        public EqualtoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_equalto;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterEqualto(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitEqualto(this);
        }
    }

    public final EqualtoContext equalto() throws RecognitionException {
        EqualtoContext _localctx = new EqualtoContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_equalto);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(271);
                type();
                setState(272);
                match(EQ);
                setState(273);
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

    public static class False_conContext extends ParserRuleContext {
        public False_conContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_false_con;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterFalse_con(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitFalse_con(this);
        }
    }

    public final False_conContext false_con() throws RecognitionException {
        False_conContext _localctx = new False_conContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_false_con);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(275);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
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

    public static class True_conContext extends ParserRuleContext {
        public True_conContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_true_con;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterTrue_con(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitTrue_con(this);
        }
    }

    public final True_conContext true_con() throws RecognitionException {
        True_conContext _localctx = new True_conContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_true_con);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(277);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
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

    public static class BoolvalContext extends ParserRuleContext {
        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public GreaterthanContext greaterthan() {
            return getRuleContext(GreaterthanContext.class, 0);
        }

        public LesserthanContext lesserthan() {
            return getRuleContext(LesserthanContext.class, 0);
        }

        public GreaterthanEContext greaterthanE() {
            return getRuleContext(GreaterthanEContext.class, 0);
        }

        public LesserthanEContext lesserthanE() {
            return getRuleContext(LesserthanEContext.class, 0);
        }

        public EqualtoContext equalto() {
            return getRuleContext(EqualtoContext.class, 0);
        }

        public NotequaltoContext notequalto() {
            return getRuleContext(NotequaltoContext.class, 0);
        }

        public False_conContext false_con() {
            return getRuleContext(False_conContext.class, 0);
        }

        public True_conContext true_con() {
            return getRuleContext(True_conContext.class, 0);
        }

        public BoolvalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_boolval;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterBoolval(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitBoolval(this);
        }
    }

    public final BoolvalContext boolval() throws RecognitionException {
        BoolvalContext _localctx = new BoolvalContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_boolval);
        try {
            setState(288);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(279);
                    type();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(280);
                    greaterthan();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(281);
                    lesserthan();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(282);
                    greaterthanE();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(283);
                    lesserthanE();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(284);
                    equalto();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(285);
                    notequalto();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(286);
                    false_con();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(287);
                    true_con();
                }
                break;
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

    public static class NotboolvalContext extends ParserRuleContext {
        public TerminalNode NOT() {
            return getToken(RegnaParser.NOT, 0);
        }

        public TerminalNode LPRM() {
            return getToken(RegnaParser.LPRM, 0);
        }

        public BoolvalContext boolval() {
            return getRuleContext(BoolvalContext.class, 0);
        }

        public TerminalNode RPRM() {
            return getToken(RegnaParser.RPRM, 0);
        }

        public NotboolvalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_notboolval;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterNotboolval(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitNotboolval(this);
        }
    }

    public final NotboolvalContext notboolval() throws RecognitionException {
        NotboolvalContext _localctx = new NotboolvalContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_notboolval);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(290);
                match(NOT);
                setState(291);
                match(LPRM);
                setState(292);
                boolval();
                setState(293);
                match(RPRM);
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

    public static class LogicexprContext extends ParserRuleContext {
        public BoolvalContext boolval() {
            return getRuleContext(BoolvalContext.class, 0);
        }

        public NotboolvalContext notboolval() {
            return getRuleContext(NotboolvalContext.class, 0);
        }

        public AndboolexprContext andboolexpr() {
            return getRuleContext(AndboolexprContext.class, 0);
        }

        public OrboolexprContext orboolexpr() {
            return getRuleContext(OrboolexprContext.class, 0);
        }

        public LogicexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_logicexpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterLogicexpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitLogicexpr(this);
        }
    }

    public final LogicexprContext logicexpr() throws RecognitionException {
        LogicexprContext _localctx = new LogicexprContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_logicexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(299);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
                    case 1: {
                        setState(295);
                        boolval();
                    }
                    break;
                    case 2: {
                        setState(296);
                        notboolval();
                    }
                    break;
                    case 3: {
                        setState(297);
                        andboolexpr();
                    }
                    break;
                    case 4: {
                        setState(298);
                        orboolexpr();
                    }
                    break;
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

    public static class Enclosed_boolvalContext extends ParserRuleContext {
        public TerminalNode LPRM() {
            return getToken(RegnaParser.LPRM, 0);
        }

        public BoolvalContext boolval() {
            return getRuleContext(BoolvalContext.class, 0);
        }

        public TerminalNode RPRM() {
            return getToken(RegnaParser.RPRM, 0);
        }

        public Enclosed_boolvalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enclosed_boolval;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterEnclosed_boolval(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitEnclosed_boolval(this);
        }
    }

    public final Enclosed_boolvalContext enclosed_boolval() throws RecognitionException {
        Enclosed_boolvalContext _localctx = new Enclosed_boolvalContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_enclosed_boolval);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(301);
                match(LPRM);
                setState(302);
                boolval();
                setState(303);
                match(RPRM);
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

    public static class AndboolexprContext extends ParserRuleContext {
        public List<TerminalNode> LPRM() {
            return getTokens(RegnaParser.LPRM);
        }

        public TerminalNode LPRM(int i) {
            return getToken(RegnaParser.LPRM, i);
        }

        public List<LogicexprContext> logicexpr() {
            return getRuleContexts(LogicexprContext.class);
        }

        public LogicexprContext logicexpr(int i) {
            return getRuleContext(LogicexprContext.class, i);
        }

        public List<TerminalNode> RPRM() {
            return getTokens(RegnaParser.RPRM);
        }

        public TerminalNode RPRM(int i) {
            return getToken(RegnaParser.RPRM, i);
        }

        public TerminalNode AND() {
            return getToken(RegnaParser.AND, 0);
        }

        public AndboolexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_andboolexpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterAndboolexpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitAndboolexpr(this);
        }
    }

    public final AndboolexprContext andboolexpr() throws RecognitionException {
        AndboolexprContext _localctx = new AndboolexprContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_andboolexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(305);
                match(LPRM);
                setState(306);
                logicexpr();
                setState(307);
                match(RPRM);
                setState(308);
                match(AND);
                setState(309);
                match(LPRM);
                setState(310);
                logicexpr();
                setState(311);
                match(RPRM);
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

    public static class OrboolexprContext extends ParserRuleContext {
        public List<TerminalNode> LPRM() {
            return getTokens(RegnaParser.LPRM);
        }

        public TerminalNode LPRM(int i) {
            return getToken(RegnaParser.LPRM, i);
        }

        public List<LogicexprContext> logicexpr() {
            return getRuleContexts(LogicexprContext.class);
        }

        public LogicexprContext logicexpr(int i) {
            return getRuleContext(LogicexprContext.class, i);
        }

        public List<TerminalNode> RPRM() {
            return getTokens(RegnaParser.RPRM);
        }

        public TerminalNode RPRM(int i) {
            return getToken(RegnaParser.RPRM, i);
        }

        public TerminalNode OR() {
            return getToken(RegnaParser.OR, 0);
        }

        public OrboolexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_orboolexpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterOrboolexpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitOrboolexpr(this);
        }
    }

    public final OrboolexprContext orboolexpr() throws RecognitionException {
        OrboolexprContext _localctx = new OrboolexprContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_orboolexpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(313);
                match(LPRM);
                setState(314);
                logicexpr();
                setState(315);
                match(RPRM);
                setState(316);
                match(OR);
                setState(317);
                match(LPRM);
                setState(318);
                logicexpr();
                setState(319);
                match(RPRM);
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

    public static class BoolexprContext extends ParserRuleContext {
        public BoolvalContext boolval() {
            return getRuleContext(BoolvalContext.class, 0);
        }

        public AndboolexprContext andboolexpr() {
            return getRuleContext(AndboolexprContext.class, 0);
        }

        public OrboolexprContext orboolexpr() {
            return getRuleContext(OrboolexprContext.class, 0);
        }

        public Enclosed_boolvalContext enclosed_boolval() {
            return getRuleContext(Enclosed_boolvalContext.class, 0);
        }

        public BoolexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_boolexpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterBoolexpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitBoolexpr(this);
        }
    }

    public final BoolexprContext boolexpr() throws RecognitionException {
        BoolexprContext _localctx = new BoolexprContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_boolexpr);
        try {
            setState(325);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(321);
                    boolval();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(322);
                    andboolexpr();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(323);
                    orboolexpr();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(324);
                    enclosed_boolval();
                }
                break;
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

    public static class BoolparseexprContext extends ParserRuleContext {
        public BoolexprContext boolexpr() {
            return getRuleContext(BoolexprContext.class, 0);
        }

        public TerminalNode NOT() {
            return getToken(RegnaParser.NOT, 0);
        }

        public BoolparseexprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_boolparseexpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterBoolparseexpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitBoolparseexpr(this);
        }
    }

    public final BoolparseexprContext boolparseexpr() throws RecognitionException {
        BoolparseexprContext _localctx = new BoolparseexprContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_boolparseexpr);
        try {
            setState(330);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__0:
                case T__1:
                case T__9:
                case T__10:
                case T__11:
                case T__12:
                case T__13:
                case T__14:
                case INTEGER:
                case LPRM:
                case STRUCT_T:
                case CHAR_ID:
                case INT_ID:
                case DBL_id:
                case FLT_ID:
                case BYTE:
                case ArrayLiteral:
                case SIMP_CHARS:
                case BASE_CHARACTERS:
                case CHRCT:
                case BlankLiteral:
                case StringLiteral:
                case MIDARRAYLITERAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(327);
                    boolexpr();
                }
                break;
                case NOT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(328);
                    match(NOT);
                    setState(329);
                    boolexpr();
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

    public static class Array_referenceContext extends ParserRuleContext {
        public MidContext mid() {
            return getRuleContext(MidContext.class, 0);
        }

        public List<TypeContext> type() {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i) {
            return getRuleContext(TypeContext.class, i);
        }

        public Array_referenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array_reference;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterArray_reference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitArray_reference(this);
        }
    }

    public final Array_referenceContext array_reference() throws RecognitionException {
        Array_referenceContext _localctx = new Array_referenceContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_array_reference);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(332);
                mid();
                setState(333);
                match(LSQB);
                setState(337);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(334);
                            type();
                            setState(335);
                            _la = _input.LA(1);
                            if (!(_la == RSQB || _la == DIMENJOIN)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                        }
                    }
                    setState(339);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << LPRM) | (1L << STRUCT_T) | (1L << CHAR_ID) | (1L << INT_ID) | (1L << DBL_id) | (1L << FLT_ID) | (1L << BYTE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ArrayLiteral - 67)) | (1L << (SIMP_CHARS - 67)) | (1L << (BASE_CHARACTERS - 67)) | (1L << (CHRCT - 67)) | (1L << (BlankLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (MIDARRAYLITERAL - 67)))) != 0));
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

    public static class New_referenceContext extends ParserRuleContext {
        public MidContext mid() {
            return getRuleContext(MidContext.class, 0);
        }

        public TerminalNode LPRM() {
            return getToken(RegnaParser.LPRM, 0);
        }

        public List<TypeContext> type() {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i) {
            return getRuleContext(TypeContext.class, i);
        }

        public TerminalNode RPRM() {
            return getToken(RegnaParser.RPRM, 0);
        }

        public List<TerminalNode> PARAM_SEPERATOR() {
            return getTokens(RegnaParser.PARAM_SEPERATOR);
        }

        public TerminalNode PARAM_SEPERATOR(int i) {
            return getToken(RegnaParser.PARAM_SEPERATOR, i);
        }

        public New_referenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_new_reference;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterNew_reference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitNew_reference(this);
        }
    }

    public final New_referenceContext new_reference() throws RecognitionException {
        New_referenceContext _localctx = new New_referenceContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_new_reference);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(341);
                mid();
                setState(342);
                match(T__15);
                setState(343);
                match(LPRM);
                setState(344);
                type();
                setState(349);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == PARAM_SEPERATOR) {
                    {
                        {
                            setState(345);
                            match(PARAM_SEPERATOR);
                            setState(346);
                            type();
                        }
                    }
                    setState(351);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(352);
                match(RPRM);
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

    public static class Array_set_stmtContext extends ParserRuleContext {
        public TerminalNode VAR_DEC() {
            return getToken(RegnaParser.VAR_DEC, 0);
        }

        public TerminalNode EQUALS() {
            return getToken(RegnaParser.EQUALS, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode EOS() {
            return getToken(RegnaParser.EOS, 0);
        }

        public Array_referenceContext array_reference() {
            return getRuleContext(Array_referenceContext.class, 0);
        }

        public New_referenceContext new_reference() {
            return getRuleContext(New_referenceContext.class, 0);
        }

        public Array_set_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array_set_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterArray_set_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitArray_set_stmt(this);
        }
    }

    public final Array_set_stmtContext array_set_stmt() throws RecognitionException {
        Array_set_stmtContext _localctx = new Array_set_stmtContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_array_set_stmt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(354);
                match(VAR_DEC);
                setState(357);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                    case 1: {
                        setState(355);
                        array_reference();
                    }
                    break;
                    case 2: {
                        setState(356);
                        new_reference();
                    }
                    break;
                }
                setState(359);
                match(EQUALS);
                setState(360);
                type();
                setState(361);
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

    public static class Array_def_stmtContext extends ParserRuleContext {
        public TerminalNode ATTRIBUTE_DEF() {
            return getToken(RegnaParser.ATTRIBUTE_DEF, 0);
        }

        public VartypeContext vartype() {
            return getRuleContext(VartypeContext.class, 0);
        }

        public TerminalNode ArrayLiteral() {
            return getToken(RegnaParser.ArrayLiteral, 0);
        }

        public TerminalNode EOS() {
            return getToken(RegnaParser.EOS, 0);
        }

        public TerminalNode Const() {
            return getToken(RegnaParser.Const, 0);
        }

        public AttrvaldefContext attrvaldef() {
            return getRuleContext(AttrvaldefContext.class, 0);
        }

        public Array_def_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array_def_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterArray_def_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitArray_def_stmt(this);
        }
    }

    public final Array_def_stmtContext array_def_stmt() throws RecognitionException {
        Array_def_stmtContext _localctx = new Array_def_stmtContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_array_def_stmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(363);
                match(ATTRIBUTE_DEF);
                setState(365);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Const) {
                    {
                        setState(364);
                        match(Const);
                    }
                }

                setState(367);
                vartype();
                setState(368);
                match(ArrayLiteral);
                setState(370);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EQUALS) {
                    {
                        setState(369);
                        attrvaldef();
                    }
                }

                setState(372);
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

    public static class Array_instContext extends ParserRuleContext {
        public TerminalNode MEMBER_CT() {
            return getToken(RegnaParser.MEMBER_CT, 0);
        }

        public TerminalNode CONSTRUCTOR() {
            return getToken(RegnaParser.CONSTRUCTOR, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public Box_typesContext box_types() {
            return getRuleContext(Box_typesContext.class, 0);
        }

        public Type_idContext type_id() {
            return getRuleContext(Type_idContext.class, 0);
        }

        public Array_instContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array_inst;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterArray_inst(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitArray_inst(this);
        }
    }

    public final Array_instContext array_inst() throws RecognitionException {
        Array_instContext _localctx = new Array_instContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_array_inst);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(376);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case ArrayLiteral:
                    case SIMP_CHARS:
                    case BASE_CHARACTERS:
                    case StringLiteral:
                    case MIDARRAYLITERAL: {
                        setState(374);
                        box_types();
                    }
                    break;
                    case CHAR_ID:
                    case INT_ID:
                    case DBL_id:
                    case FLT_ID:
                    case BYTE: {
                        setState(375);
                        type_id(0);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(378);
                match(MEMBER_CT);
                setState(379);
                match(CONSTRUCTOR);
                setState(380);
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
        enterRule(_localctx, 70, RULE_field_param);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(382);
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

        public TerminalNode ArrayLiteral() {
            return getToken(RegnaParser.ArrayLiteral, 0);
        }

        public TerminalNode MIDARRAYLITERAL() {
            return getToken(RegnaParser.MIDARRAYLITERAL, 0);
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
        enterRule(_localctx, 72, RULE_box_types);
        try {
            setState(390);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
				{
                    setState(384);
                    match(StringLiteral);
                }
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(385);
                    id();
                }
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(386);
                    mid();
                }
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
                    setState(387);
                    call_mid();
                }
				break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(388);
                    match(ArrayLiteral);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(389);
                    match(MIDARRAYLITERAL);
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

        public New_referenceContext new_reference() {
            return getRuleContext(New_referenceContext.class, 0);
        }

        public Array_instContext array_inst() {
            return getRuleContext(Array_instContext.class, 0);
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
        enterRule(_localctx, 74, RULE_type);
        try {
            setState(407);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
				{
                    setState(392);
                    match(CHRCT);
                }
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(393);
                    match(INTEGER);
                }
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(394);
                    match(StringLiteral);
                }
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
                    setState(395);
                    match(BlankLiteral);
                }
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
                    setState(396);
                    id();
                }
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
                    setState(397);
                    expr(0);
                }
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
                    setState(398);
                    member_rule();
                }
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
                    setState(399);
                    internal_call();
                }
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
                    setState(400);
                    mid();
                }
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
                    setState(401);
                    call_mid();
                }
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
                    setState(402);
                    struct_val();
                }
				break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(403);
                    cast_type();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(404);
                    construct_call();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(405);
                    new_reference();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(406);
                    array_inst();
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
        enterRule(_localctx, 76, RULE_vartype);
        try {
            setState(412);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
				{
                    setState(409);
                    type_id(0);
                }
                break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(410);
                    id();
                }
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(411);
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
        enterRule(_localctx, 78, RULE_vardef_stmt);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(414);
                match(VAR_DEC);
                setState(415);
                id();
                setState(416);
                match(EQUALS);
                setState(417);
                type();
                setState(418);
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
        enterRule(_localctx, 80, RULE_localvar_stmt);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(420);
                match(ATTRIBUTE_DEF);
                setState(422);
                _errHandler.sync(this);
                _la = _input.LA(1);
			if (_la==Const) {
				{
                    setState(421);
                    match(Const);
                }
			}

                setState(424);
                vartype();
                setState(425);
                id();
                setState(427);
                _errHandler.sync(this);
                _la = _input.LA(1);
			if (_la==EQUALS) {
				{
                    setState(426);
                    attrvaldef();
                }
			}

                setState(429);
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
        enterRule(_localctx, 82, RULE_print_stmt);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(431);
                match(PRINT);
                setState(432);
                type();
                setState(433);
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
        enterRule(_localctx, 84, RULE_construct_stmt);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(435);
                box_types();
                setState(436);
                match(MEMBER_CT);
                setState(437);
                match(CONSTRUCTOR);
                setState(438);
                call_params();
                setState(439);
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
        enterRule(_localctx, 86, RULE_construct_call);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(441);
                box_types();
                setState(442);
                match(MEMBER_CT);
                setState(443);
                match(CONSTRUCTOR);
                setState(444);
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
        enterRule(_localctx, 88, RULE_attrvaldef);
        try {
            enterOuterAlt(_localctx, 1);
			{
			{
                setState(446);
                match(EQUALS);
                setState(447);
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
        enterRule(_localctx, 90, RULE_attrdef_stmt);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(449);
                match(ATTRIBUTE_DEF);
                setState(451);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                    case 1: {
                    setState(450);
                    field_param();
                    }
				break;
			}
                setState(454);
                _errHandler.sync(this);
                _la = _input.LA(1);
			if (_la==Const || _la==TRANSIENT) {
				{
                    setState(453);
                    field_param();
                }
			}

                setState(456);
                vartype();
                setState(457);
                id();
                setState(459);
                _errHandler.sync(this);
                _la = _input.LA(1);
			if (_la==EQUALS) {
				{
                    setState(458);
                    attrvaldef();
                }
			}

                setState(461);
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
        enterRule(_localctx, 92, RULE_static_attrdef);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(463);
                match(STATICATTRIBUTE);
                setState(465);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
                    case 1: {
                    setState(464);
                    field_param();
                    }
				break;
			}
                setState(468);
                _errHandler.sync(this);
                _la = _input.LA(1);
			if (_la==Const || _la==TRANSIENT) {
				{
                    setState(467);
                    field_param();
                }
			}

                setState(470);
                vartype();
                setState(471);
                id();
                setState(473);
                _errHandler.sync(this);
                _la = _input.LA(1);
			if (_la==EQUALS) {
				{
                    setState(472);
                    attrvaldef();
                }
			}

                setState(475);
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
        enterRule(_localctx, 94, RULE_require);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(477);
                match(REQUIRE);
                setState(478);
                mid();
                setState(479);
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
        enterRule(_localctx, 96, RULE_call_params);
        int _la;
        try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(481);
                match(LPRM);
                setState(483);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << LPRM) | (1L << STRUCT_T) | (1L << CHAR_ID) | (1L << INT_ID) | (1L << DBL_id) | (1L << FLT_ID) | (1L << BYTE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ArrayLiteral - 67)) | (1L << (SIMP_CHARS - 67)) | (1L << (BASE_CHARACTERS - 67)) | (1L << (CHRCT - 67)) | (1L << (BlankLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (MIDARRAYLITERAL - 67)))) != 0)) {
                    {
                        setState(482);
                        type();
                    }
			}

                setState(489);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if ( _alt==1+1 ) {
					{
					{
                        setState(485);
                        match(PARAM_SEPERATOR);
                        {
                        setState(486);
                        type();
                    }
                    }
                    }
                }
                    setState(491);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
                }
                setState(492);
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
        enterRule(_localctx, 98, RULE_membercall_stmt);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(494);
                type();
                setState(495);
                match(MEMBER_CT);
                setState(496);
                id();
                setState(497);
                call_params();
                setState(498);
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
        enterRule(_localctx, 100, RULE_internal_call);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(500);
                box_types();
                setState(501);
                match(MEMBER_CT);
                setState(502);
                id();
                setState(503);
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
        enterRule(_localctx, 102, RULE_member_rule);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(505);
                mid();
                setState(506);
                match(MEMBER_T);
                setState(507);
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
        enterRule(_localctx, 104, RULE_cast_type);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(509);
                match(LPRM);
                setState(510);
                extract_type();
                setState(511);
                match(RPRM);
                setState(512);
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
        enterRule(_localctx, 106, RULE_struct_body);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(514);
                type_id(0);
                setState(515);
                id();
                setState(520);
                _errHandler.sync(this);
                _la = _input.LA(1);
			do {
				{
				{
                    setState(516);
                    match(PARAM_SEPERATOR);
                    setState(517);
                    type_id(0);
                    setState(518);
                    id();
                }
				}
                setState(522);
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
        enterRule(_localctx, 108, RULE_struct_stmt);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(524);
                match(STRUCT_DEF);
                setState(525);
                id();
                setState(526);
                match(LBRC);
                setState(528);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_ID) | (1L << INT_ID) | (1L << DBL_id) | (1L << FLT_ID) | (1L << BYTE))) != 0)) {
                    {
                        setState(527);
                        struct_body();
                    }
			}

                setState(530);
                match(RBRC);
                setState(531);
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
        enterRule(_localctx, 110, RULE_struct_param);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(533);
                id();
                setState(534);
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
        enterRule(_localctx, 112, RULE_struct_init_stmt);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(536);
                match(STRUCT_T);
                setState(537);
                mid();
                setState(538);
                match(T__16);
                setState(539);
                id();
                setState(540);
                match(LBRC);
                setState(551);
                _errHandler.sync(this);
                _la = _input.LA(1);
			while (_la==SIMP_CHARS) {
				{
				{
                    setState(541);
                    struct_param();
                    setState(546);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
				while (_la==PARAM_SEPERATOR) {
					{
					{
                        setState(542);
                        match(PARAM_SEPERATOR);
                        setState(543);
                        struct_param();
                    }
					}
                    setState(548);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
				}
				}
				}
                setState(553);
                _errHandler.sync(this);
                _la = _input.LA(1);
			}
                setState(554);
                match(RBRC);
                setState(555);
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
        enterRule(_localctx, 114, RULE_extract_type);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(559);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case SIMP_CHARS:
                    case BASE_CHARACTERS: {
                        setState(557);
                        mid();
                    }
                    break;
                    case CHAR_ID:
                    case INT_ID:
                    case DBL_id:
                    case FLT_ID:
                    case BYTE: {
                        setState(558);
                        type_id(0);
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
        enterRule(_localctx, 116, RULE_struct_val);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(561);
                match(STRUCT_T);
                setState(562);
                mid();
                setState(563);
                match(MEMBER_T);
                setState(565);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                    case 1: {
                        setState(564);
                        extract_type();
                    }
                    break;
                }
                setState(567);
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
        enterRule(_localctx, 118, RULE_struct_set_stmt);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(569);
                match(STRUCT_T);
                setState(570);
                match(VAR_DEC);
                setState(571);
                mid();
                setState(572);
                id();
                setState(573);
                match(EQUALS);
                setState(574);
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

    public static class Return_stmtContext extends ParserRuleContext {
        public TerminalNode RETURN() {
            return getToken(RegnaParser.RETURN, 0);
        }

        public TerminalNode EOS() {
            return getToken(RegnaParser.EOS, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public Return_stmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_return_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterReturn_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitReturn_stmt(this);
        }
    }

    public final Return_stmtContext return_stmt() throws RecognitionException {
        Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_return_stmt);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(576);
                match(RETURN);
                setState(578);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << LPRM) | (1L << STRUCT_T) | (1L << CHAR_ID) | (1L << INT_ID) | (1L << DBL_id) | (1L << FLT_ID) | (1L << BYTE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ArrayLiteral - 67)) | (1L << (SIMP_CHARS - 67)) | (1L << (BASE_CHARACTERS - 67)) | (1L << (CHRCT - 67)) | (1L << (BlankLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (MIDARRAYLITERAL - 67)))) != 0)) {
                    {
                        setState(577);
                        type();
                    }
                }

                setState(580);
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

    public static class Elseif_blockContext extends ParserRuleContext {
        public TerminalNode ELIF() {
            return getToken(RegnaParser.ELIF, 0);
        }

        public BoolparseexprContext boolparseexpr() {
            return getRuleContext(BoolparseexprContext.class, 0);
        }

        public TerminalNode LBRC() {
            return getToken(RegnaParser.LBRC, 0);
        }

        public TerminalNode RBRC() {
            return getToken(RegnaParser.RBRC, 0);
        }

        public StmtListContext stmtList() {
            return getRuleContext(StmtListContext.class, 0);
        }

        public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseif_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterElseif_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitElseif_block(this);
        }
    }

    public final Elseif_blockContext elseif_block() throws RecognitionException {
        Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_elseif_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(582);
                match(ELIF);
                setState(583);
                boolparseexpr();
                setState(584);
                match(LBRC);
                setState(586);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << LPRM) | (1L << VAR_DEC) | (1L << PRINT) | (1L << ATTRIBUTE_DEF) | (1L << STRUCT_DEF) | (1L << STRUCT_T) | (1L << CHAR_ID) | (1L << INT_ID) | (1L << DBL_id) | (1L << FLT_ID) | (1L << BYTE) | (1L << IF) | (1L << WHILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RETURN - 64)) | (1L << (ArrayLiteral - 64)) | (1L << (SIMP_CHARS - 64)) | (1L << (BASE_CHARACTERS - 64)) | (1L << (CHRCT - 64)) | (1L << (BlankLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (MIDARRAYLITERAL - 64)))) != 0)) {
                    {
                        setState(585);
                        stmtList();
                    }
                }

                setState(588);
                match(RBRC);
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

    public static class Else_blockContext extends ParserRuleContext {
        public TerminalNode ELSE() {
            return getToken(RegnaParser.ELSE, 0);
        }

        public TerminalNode LBRC() {
            return getToken(RegnaParser.LBRC, 0);
        }

        public StmtListContext stmtList() {
            return getRuleContext(StmtListContext.class, 0);
        }

        public TerminalNode RBRC() {
            return getToken(RegnaParser.RBRC, 0);
        }

        public Else_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_else_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterElse_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitElse_block(this);
        }
    }

    public final Else_blockContext else_block() throws RecognitionException {
        Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_else_block);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(590);
                match(ELSE);
                setState(591);
                match(LBRC);
                setState(592);
                stmtList();
                setState(593);
                match(RBRC);
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

    public static class If_blockContext extends ParserRuleContext {
        public TerminalNode IF() {
            return getToken(RegnaParser.IF, 0);
        }

        public BoolparseexprContext boolparseexpr() {
            return getRuleContext(BoolparseexprContext.class, 0);
        }

        public TerminalNode LBRC() {
            return getToken(RegnaParser.LBRC, 0);
        }

        public TerminalNode RBRC() {
            return getToken(RegnaParser.RBRC, 0);
        }

        public StmtListContext stmtList() {
            return getRuleContext(StmtListContext.class, 0);
        }

        public List<Elseif_blockContext> elseif_block() {
            return getRuleContexts(Elseif_blockContext.class);
        }

        public Elseif_blockContext elseif_block(int i) {
            return getRuleContext(Elseif_blockContext.class, i);
        }

        public Else_blockContext else_block() {
            return getRuleContext(Else_blockContext.class, 0);
        }

        public If_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterIf_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitIf_block(this);
        }
    }

    public final If_blockContext if_block() throws RecognitionException {
        If_blockContext _localctx = new If_blockContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_if_block);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(595);
                match(IF);
                setState(596);
                boolparseexpr();
                setState(597);
                match(LBRC);
                setState(599);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << LPRM) | (1L << VAR_DEC) | (1L << PRINT) | (1L << ATTRIBUTE_DEF) | (1L << STRUCT_DEF) | (1L << STRUCT_T) | (1L << CHAR_ID) | (1L << INT_ID) | (1L << DBL_id) | (1L << FLT_ID) | (1L << BYTE) | (1L << IF) | (1L << WHILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RETURN - 64)) | (1L << (ArrayLiteral - 64)) | (1L << (SIMP_CHARS - 64)) | (1L << (BASE_CHARACTERS - 64)) | (1L << (CHRCT - 64)) | (1L << (BlankLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (MIDARRAYLITERAL - 64)))) != 0)) {
                    {
                        setState(598);
                        stmtList();
                    }
                }

                setState(601);
                match(RBRC);
                setState(605);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(602);
                                elseif_block();
                            }
                        }
                    }
                    setState(607);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
                }
                setState(609);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ELSE) {
                    {
                        setState(608);
                        else_block();
                    }
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

    public static class While_blockContext extends ParserRuleContext {
        public TerminalNode WHILE() {
            return getToken(RegnaParser.WHILE, 0);
        }

        public BoolparseexprContext boolparseexpr() {
            return getRuleContext(BoolparseexprContext.class, 0);
        }

        public TerminalNode LBRC() {
            return getToken(RegnaParser.LBRC, 0);
        }

        public TerminalNode RBRC() {
            return getToken(RegnaParser.RBRC, 0);
        }

        public StmtListContext stmtList() {
            return getRuleContext(StmtListContext.class, 0);
        }

        public While_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_while_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterWhile_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitWhile_block(this);
        }
    }

    public final While_blockContext while_block() throws RecognitionException {
        While_blockContext _localctx = new While_blockContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_while_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(611);
                match(WHILE);
                setState(612);
                boolparseexpr();
                setState(613);
                match(LBRC);
                setState(615);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << LPRM) | (1L << VAR_DEC) | (1L << PRINT) | (1L << ATTRIBUTE_DEF) | (1L << STRUCT_DEF) | (1L << STRUCT_T) | (1L << CHAR_ID) | (1L << INT_ID) | (1L << DBL_id) | (1L << FLT_ID) | (1L << BYTE) | (1L << IF) | (1L << WHILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RETURN - 64)) | (1L << (ArrayLiteral - 64)) | (1L << (SIMP_CHARS - 64)) | (1L << (BASE_CHARACTERS - 64)) | (1L << (CHRCT - 64)) | (1L << (BlankLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (MIDARRAYLITERAL - 64)))) != 0)) {
                    {
                        setState(614);
                        stmtList();
                    }
                }

                setState(617);
                match(RBRC);
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

    public static class BlockContext extends ParserRuleContext {
        public If_blockContext if_block() {
            return getRuleContext(If_blockContext.class, 0);
        }

        public While_blockContext while_block() {
            return getRuleContext(While_blockContext.class, 0);
        }

        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof RegnaListener) ((RegnaListener) listener).exitBlock(this);
        }
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_block);
        try {
            setState(621);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case IF:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(619);
                    if_block();
                }
                break;
                case WHILE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(620);
                    while_block();
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

        public Return_stmtContext return_stmt() {
            return getRuleContext(Return_stmtContext.class, 0);
        }

        public Varaddinc_stmtContext varaddinc_stmt() {
            return getRuleContext(Varaddinc_stmtContext.class, 0);
        }

        public Varsubinc_stmtContext varsubinc_stmt() {
            return getRuleContext(Varsubinc_stmtContext.class, 0);
        }

        public Varmulinc_stmtContext varmulinc_stmt() {
            return getRuleContext(Varmulinc_stmtContext.class, 0);
        }

        public Vardivinc_stmtContext vardivinc_stmt() {
            return getRuleContext(Vardivinc_stmtContext.class, 0);
        }

        public Array_set_stmtContext array_set_stmt() {
            return getRuleContext(Array_set_stmtContext.class, 0);
        }

        public Array_def_stmtContext array_def_stmt() {
            return getRuleContext(Array_def_stmtContext.class, 0);
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
        enterRule(_localctx, 132, RULE_stmt);
        try {
            setState(638);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 44, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
				{
                    setState(623);
                    vardef_stmt();
                }
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(624);
                    print_stmt();
                }
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
                    setState(625);
                    localvar_stmt();
                }
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
                    setState(626);
                    membercall_stmt();
                }
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
                    setState(627);
                    construct_stmt();
                }
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
                    setState(628);
                    struct_init_stmt();
                }
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
                    setState(629);
                    struct_stmt();
                }
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
                    setState(630);
                    struct_set_stmt();
                }
				break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(631);
                    return_stmt();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(632);
                    varaddinc_stmt();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(633);
                    varsubinc_stmt();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(634);
                    varmulinc_stmt();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(635);
                    vardivinc_stmt();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(636);
                    array_set_stmt();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(637);
                    array_def_stmt();
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
        enterRule(_localctx, 134, RULE_compiler_compile_instruction);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(640);
                match(Compiler_Compile_CMD);
                setState(641);
                match(StringLiteral);
                setState(642);
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
        enterRule(_localctx, 136, RULE_compiler_cp_instruction);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(644);
                match(Compiler_cpextend_CMD);
                setState(645);
                match(StringLiteral);
                setState(646);
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
        enterRule(_localctx, 138, RULE_compiler_instruction);
        try {
            setState(650);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Compiler_Compile_CMD:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(648);
                    compiler_compile_instruction();
                }
                break;
                case Compiler_cpextend_CMD:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(649);
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
        enterRule(_localctx, 140, RULE_requireList);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(654);
                _errHandler.sync(this);
                _la = _input.LA(1);
			do {
				{
                    setState(654);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case REQUIRE: {
                            setState(652);
                            require();
                        }
                        break;
                        case Compiler_Compile_CMD:
                        case Compiler_cpextend_CMD: {
                            setState(653);
                            compiler_instruction();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                setState(656);
                _errHandler.sync(this);
                _la = _input.LA(1);
            }
            while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (REQUIRE - 41)) | (1L << (Compiler_Compile_CMD - 41)) | (1L << (Compiler_cpextend_CMD - 41)))) != 0));
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

        public List<BlockContext> block() {
            return getRuleContexts(BlockContext.class);
        }

        public BlockContext block(int i) {
            return getRuleContext(BlockContext.class, i);
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
        enterRule(_localctx, 142, RULE_stmtList);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(660);
                _errHandler.sync(this);
                _la = _input.LA(1);
			do {
				{
                    setState(660);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case T__0:
                        case T__1:
                        case INTEGER:
                        case LPRM:
                        case VAR_DEC:
                        case PRINT:
                        case ATTRIBUTE_DEF:
                        case STRUCT_DEF:
                        case STRUCT_T:
                        case CHAR_ID:
                        case INT_ID:
                        case DBL_id:
                        case FLT_ID:
                        case BYTE:
                        case RETURN:
                        case ArrayLiteral:
                        case SIMP_CHARS:
                        case BASE_CHARACTERS:
                        case CHRCT:
                        case BlankLiteral:
                        case StringLiteral:
                        case MIDARRAYLITERAL: {
                            setState(658);
                            stmt();
                        }
                        break;
                        case IF:
                        case WHILE: {
                            setState(659);
                            block();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                setState(662);
                _errHandler.sync(this);
                _la = _input.LA(1);
            }
            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << LPRM) | (1L << VAR_DEC) | (1L << PRINT) | (1L << ATTRIBUTE_DEF) | (1L << STRUCT_DEF) | (1L << STRUCT_T) | (1L << CHAR_ID) | (1L << INT_ID) | (1L << DBL_id) | (1L << FLT_ID) | (1L << BYTE) | (1L << IF) | (1L << WHILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RETURN - 64)) | (1L << (ArrayLiteral - 64)) | (1L << (SIMP_CHARS - 64)) | (1L << (BASE_CHARACTERS - 64)) | (1L << (CHRCT - 64)) | (1L << (BlankLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (MIDARRAYLITERAL - 64)))) != 0));
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
        enterRule(_localctx, 144, RULE_formalParam);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(664);
                id();
                setState(665);
                match(PARAM_TYPE_DEF);
                setState(666);
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
        enterRule(_localctx, 146, RULE_formalParamList);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(668);
                match(LPRM);
                setState(669);
                formalParam();
                setState(674);
                _errHandler.sync(this);
                _la = _input.LA(1);
			while (_la==PARAM_SEPERATOR) {
				{
				{
                    setState(670);
                    match(PARAM_SEPERATOR);
                    setState(671);
                    formalParam();
                }
				}
                setState(676);
                _errHandler.sync(this);
                _la = _input.LA(1);
			}
                setState(677);
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
        enterRule(_localctx, 148, RULE_staticformalFunction);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(679);
                match(STATICFUNC);
                setState(680);
                ret_type();
                setState(681);
                id();
                setState(683);
                _errHandler.sync(this);
                _la = _input.LA(1);
			if (_la==LPRM) {
				{
                    setState(682);
                    formalParamList();
                }
			}

                setState(685);
                match(LBRC);
                setState(687);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << LPRM) | (1L << VAR_DEC) | (1L << PRINT) | (1L << ATTRIBUTE_DEF) | (1L << STRUCT_DEF) | (1L << STRUCT_T) | (1L << CHAR_ID) | (1L << INT_ID) | (1L << DBL_id) | (1L << FLT_ID) | (1L << BYTE) | (1L << IF) | (1L << WHILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RETURN - 64)) | (1L << (ArrayLiteral - 64)) | (1L << (SIMP_CHARS - 64)) | (1L << (BASE_CHARACTERS - 64)) | (1L << (CHRCT - 64)) | (1L << (BlankLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (MIDARRAYLITERAL - 64)))) != 0)) {
                    {
                        setState(686);
                        stmtList();
                    }
			}

                setState(689);
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
        enterRule(_localctx, 150, RULE_func);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(691);
                match(FUNC_DEF);
                setState(692);
                ret_type();
                setState(693);
                id();
                setState(695);
                _errHandler.sync(this);
                _la = _input.LA(1);
			if (_la==LPRM) {
				{
                    setState(694);
                    formalParamList();
                }
			}

                setState(697);
                match(LBRC);
                setState(699);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << LPRM) | (1L << VAR_DEC) | (1L << PRINT) | (1L << ATTRIBUTE_DEF) | (1L << STRUCT_DEF) | (1L << STRUCT_T) | (1L << CHAR_ID) | (1L << INT_ID) | (1L << DBL_id) | (1L << FLT_ID) | (1L << BYTE) | (1L << IF) | (1L << WHILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RETURN - 64)) | (1L << (ArrayLiteral - 64)) | (1L << (SIMP_CHARS - 64)) | (1L << (BASE_CHARACTERS - 64)) | (1L << (CHRCT - 64)) | (1L << (BlankLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (MIDARRAYLITERAL - 64)))) != 0)) {
                    {
                        setState(698);
                        stmtList();
                    }
			}

                setState(701);
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
        enterRule(_localctx, 152, RULE_constructor);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(703);
                match(CONSTRUCT_DEF);
                setState(705);
                _errHandler.sync(this);
                _la = _input.LA(1);
			if (_la==LPRM) {
				{
                    setState(704);
                    formalParamList();
                }
			}

                setState(707);
                match(LBRC);
                setState(709);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << LPRM) | (1L << VAR_DEC) | (1L << PRINT) | (1L << ATTRIBUTE_DEF) | (1L << STRUCT_DEF) | (1L << STRUCT_T) | (1L << CHAR_ID) | (1L << INT_ID) | (1L << DBL_id) | (1L << FLT_ID) | (1L << BYTE) | (1L << IF) | (1L << WHILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RETURN - 64)) | (1L << (ArrayLiteral - 64)) | (1L << (SIMP_CHARS - 64)) | (1L << (BASE_CHARACTERS - 64)) | (1L << (CHRCT - 64)) | (1L << (BlankLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (MIDARRAYLITERAL - 64)))) != 0)) {
                    {
                        setState(708);
                        stmtList();
                    }
			}

                setState(711);
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
        enterRule(_localctx, 154, RULE_functionList);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(715);
                _errHandler.sync(this);
                _la = _input.LA(1);
			do {
				{
                    setState(715);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
				case FUNC_DEF:
					{
                        setState(713);
                        func();
                    }
					break;
				case STATICFUNC:
					{
                        setState(714);
                        staticformalFunction();
                    }
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
                setState(717);
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
        enterRule(_localctx, 156, RULE_attributes);
        try {
            int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(723);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 60, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if ( _alt==1+1 ) {
					{
                        setState(721);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
					case ATTRIBUTE_DEF:
						{
                            setState(719);
                            attrdef_stmt();
                        }
						break;
					case STATICATTRIBUTE:
						{
                            setState(720);
                            static_attrdef();
                        }
						break;
					default:
						throw new NoViableAltException(this);
					}
                    }
                }
                    setState(725);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 60, _ctx);
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
        enterRule(_localctx, 158, RULE_moduleBody);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(726);
                attributes();
                setState(728);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == CONSTRUCT_DEF) {
                    {
                        setState(727);
                        constructor();
                    }
                }

                setState(731);
                _errHandler.sync(this);
                _la = _input.LA(1);
			if (_la==FUNC_DEF || _la==STATICFUNC) {
				{
                    setState(730);
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
        enterRule(_localctx, 160, RULE_module);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(733);
                match(MODULE_DEC);
                setState(734);
                id();
                setState(735);
                match(PKGID);
                setState(736);
                mid();
                setState(738);
                _errHandler.sync(this);
                _la = _input.LA(1);
			if (_la==SERIALIZABLE) {
				{
                    setState(737);
                    match(SERIALIZABLE);
                }
			}

                setState(740);
                match(LBRC);
                setState(741);
                moduleBody();
                setState(742);
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
        enterRule(_localctx, 162, RULE_program);
        int _la;
        try {
			enterOuterAlt(_localctx, 1);
			{
                setState(745);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (REQUIRE - 41)) | (1L << (Compiler_Compile_CMD - 41)) | (1L << (Compiler_cpextend_CMD - 41)))) != 0)) {
                    {
                        setState(744);
                        requireList();
                    }
			}

                setState(748);
                _errHandler.sync(this);
                _la = _input.LA(1);
			do {
				{
				{
                    setState(747);
                    module();
                }
				}
                setState(750);
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
            case 4:
                return type_id_sempred((Type_idContext) _localctx, predIndex);
            case 8:
                return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}

    private boolean type_id_sempred(Type_idContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
            return precpred(_ctx, 1);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 1:
                return precpred(_ctx, 3);
            case 2:
                return precpred(_ctx, 2);
        }
		return true;
	}

	public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u02f3\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3" +
                    "\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u00b2\n\5\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\5\6\u00ba\n\6\3\6\3\6\7\6\u00be\n\6\f\6\16\6\u00c1\13\6\3\7\3\7" +
                    "\3\7\5\7\u00c6\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00d1\n\n\3" +
                    "\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00db\n\n\f\n\16\n\u00de\13\n\3\13" +
                    "\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e7\n\13\3\f\3\f\3\f\3\f\3\f\3\r" +
                    "\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20" +
                    "\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23" +
                    "\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27" +
                    "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0123\n\30\3\31\3\31" +
                    "\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u012e\n\32\3\33\3\33\3\33\3\33" +
                    "\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35" +
                    "\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0148\n\36\3\37\3\37\3\37\5\37\u014d" +
                    "\n\37\3 \3 \3 \3 \3 \6 \u0154\n \r \16 \u0155\3!\3!\3!\3!\3!\3!\7!\u015e" +
                    "\n!\f!\16!\u0161\13!\3!\3!\3\"\3\"\3\"\5\"\u0168\n\"\3\"\3\"\3\"\3\"\3" +
                    "#\3#\5#\u0170\n#\3#\3#\3#\5#\u0175\n#\3#\3#\3$\3$\5$\u017b\n$\3$\3$\3" +
                    "$\3$\3%\3%\3&\3&\3&\3&\3&\3&\5&\u0189\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3" +
                    "\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u019a\n\'\3(\3(\3(\5(\u019f\n(\3)\3" +
                    ")\3)\3)\3)\3)\3*\3*\5*\u01a9\n*\3*\3*\3*\5*\u01ae\n*\3*\3*\3+\3+\3+\3" +
                    "+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\5/\u01c6\n/\3/\5/\u01c9" +
                    "\n/\3/\3/\3/\5/\u01ce\n/\3/\3/\3\60\3\60\5\60\u01d4\n\60\3\60\5\60\u01d7" +
                    "\n\60\3\60\3\60\3\60\5\60\u01dc\n\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62" +
                    "\3\62\5\62\u01e6\n\62\3\62\3\62\7\62\u01ea\n\62\f\62\16\62\u01ed\13\62" +
                    "\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65" +
                    "\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67" +
                    "\6\67\u020b\n\67\r\67\16\67\u020c\38\38\38\38\58\u0213\n8\38\38\38\39" +
                    "\39\39\3:\3:\3:\3:\3:\3:\3:\3:\7:\u0223\n:\f:\16:\u0226\13:\7:\u0228\n" +
                    ":\f:\16:\u022b\13:\3:\3:\3:\3;\3;\5;\u0232\n;\3<\3<\3<\3<\5<\u0238\n<" +
                    "\3<\3<\3=\3=\3=\3=\3=\3=\3=\3>\3>\5>\u0245\n>\3>\3>\3?\3?\3?\3?\5?\u024d" +
                    "\n?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\5A\u025a\nA\3A\3A\7A\u025e\nA\fA" +
                    "\16A\u0261\13A\3A\5A\u0264\nA\3B\3B\3B\3B\5B\u026a\nB\3B\3B\3C\3C\5C\u0270" +
                    "\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0281\nD\3E\3E\3E" +
                    "\3E\3F\3F\3F\3F\3G\3G\5G\u028d\nG\3H\3H\6H\u0291\nH\rH\16H\u0292\3I\3" +
                    "I\6I\u0297\nI\rI\16I\u0298\3J\3J\3J\3J\3K\3K\3K\3K\7K\u02a3\nK\fK\16K" +
                    "\u02a6\13K\3K\3K\3L\3L\3L\3L\5L\u02ae\nL\3L\3L\5L\u02b2\nL\3L\3L\3M\3" +
                    "M\3M\3M\5M\u02ba\nM\3M\3M\5M\u02be\nM\3M\3M\3N\3N\5N\u02c4\nN\3N\3N\5" +
                    "N\u02c8\nN\3N\3N\3O\3O\6O\u02ce\nO\rO\16O\u02cf\3P\3P\7P\u02d4\nP\fP\16" +
                    "P\u02d7\13P\3Q\3Q\5Q\u02db\nQ\3Q\5Q\u02de\nQ\3R\3R\3R\3R\3R\5R\u02e5\n" +
                    "R\3R\3R\3R\3R\3S\5S\u02ec\nS\3S\6S\u02ef\nS\rS\16S\u02f0\3S\5\u01eb\u025f" +
                    "\u02d5\4\n\22T\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64" +
                    "\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088" +
                    "\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0" +
                    "\u00a2\u00a4\2\t\4\2OOQQ\3\2\3\4\3\2\5\6\3\2\f\16\3\2\17\21\4\2$$&&\3" +
                    "\2\61\62\2\u0314\2\u00a6\3\2\2\2\4\u00a8\3\2\2\2\6\u00aa\3\2\2\2\b\u00b1" +
                    "\3\2\2\2\n\u00b9\3\2\2\2\f\u00c5\3\2\2\2\16\u00c7\3\2\2\2\20\u00c9\3\2" +
                    "\2\2\22\u00d0\3\2\2\2\24\u00e6\3\2\2\2\26\u00e8\3\2\2\2\30\u00ed\3\2\2" +
                    "\2\32\u00f2\3\2\2\2\34\u00f7\3\2\2\2\36\u00fc\3\2\2\2 \u0100\3\2\2\2\"" +
                    "\u0104\3\2\2\2$\u0108\3\2\2\2&\u010c\3\2\2\2(\u0111\3\2\2\2*\u0115\3\2" +
                    "\2\2,\u0117\3\2\2\2.\u0122\3\2\2\2\60\u0124\3\2\2\2\62\u012d\3\2\2\2\64" +
                    "\u012f\3\2\2\2\66\u0133\3\2\2\28\u013b\3\2\2\2:\u0147\3\2\2\2<\u014c\3" +
                    "\2\2\2>\u014e\3\2\2\2@\u0157\3\2\2\2B\u0164\3\2\2\2D\u016d\3\2\2\2F\u017a" +
                    "\3\2\2\2H\u0180\3\2\2\2J\u0188\3\2\2\2L\u0199\3\2\2\2N\u019e\3\2\2\2P" +
                    "\u01a0\3\2\2\2R\u01a6\3\2\2\2T\u01b1\3\2\2\2V\u01b5\3\2\2\2X\u01bb\3\2" +
                    "\2\2Z\u01c0\3\2\2\2\\\u01c3\3\2\2\2^\u01d1\3\2\2\2`\u01df\3\2\2\2b\u01e3" +
                    "\3\2\2\2d\u01f0\3\2\2\2f\u01f6\3\2\2\2h\u01fb\3\2\2\2j\u01ff\3\2\2\2l" +
                    "\u0204\3\2\2\2n\u020e\3\2\2\2p\u0217\3\2\2\2r\u021a\3\2\2\2t\u0231\3\2" +
                    "\2\2v\u0233\3\2\2\2x\u023b\3\2\2\2z\u0242\3\2\2\2|\u0248\3\2\2\2~\u0250" +
                    "\3\2\2\2\u0080\u0255\3\2\2\2\u0082\u0265\3\2\2\2\u0084\u026f\3\2\2\2\u0086" +
                    "\u0280\3\2\2\2\u0088\u0282\3\2\2\2\u008a\u0286\3\2\2\2\u008c\u028c\3\2" +
                    "\2\2\u008e\u0290\3\2\2\2\u0090\u0296\3\2\2\2\u0092\u029a\3\2\2\2\u0094" +
                    "\u029e\3\2\2\2\u0096\u02a9\3\2\2\2\u0098\u02b5\3\2\2\2\u009a\u02c1\3\2" +
                    "\2\2\u009c\u02cd\3\2\2\2\u009e\u02d5\3\2\2\2\u00a0\u02d8\3\2\2\2\u00a2" +
                    "\u02df\3\2\2\2\u00a4\u02eb\3\2\2\2\u00a6\u00a7\7O\2\2\u00a7\3\3\2\2\2" +
                    "\u00a8\u00a9\t\2\2\2\u00a9\5\3\2\2\2\u00aa\u00ab\5\4\3\2\u00ab\u00ac\5" +
                    "b\62\2\u00ac\7\3\2\2\2\u00ad\u00b2\7O\2\2\u00ae\u00b2\7R\2\2\u00af\u00b2" +
                    "\5\n\6\2\u00b0\u00b2\7E\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1" +
                    "\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\t\3\2\2\2\u00b3\u00b4\b\6\1\2" +
                    "\u00b4\u00ba\7\66\2\2\u00b5\u00ba\7\67\2\2\u00b6\u00ba\78\2\2\u00b7\u00ba" +
                    "\79\2\2\u00b8\u00ba\7:\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9" +
                    "\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bf\3\2" +
                    "\2\2\u00bb\u00bc\f\3\2\2\u00bc\u00be\7%\2\2\u00bd\u00bb\3\2\2\2\u00be" +
                    "\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\13\3\2\2" +
                    "\2\u00c1\u00bf\3\2\2\2\u00c2\u00c6\5\n\6\2\u00c3\u00c6\5\2\2\2\u00c4\u00c6" +
                    "\7\'\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6" +
                    "\r\3\2\2\2\u00c7\u00c8\t\3\2\2\u00c8\17\3\2\2\2\u00c9\u00ca\t\4\2\2\u00ca" +
                    "\21\3\2\2\2\u00cb\u00cc\b\n\1\2\u00cc\u00cd\5\16\b\2\u00cd\u00ce\5\24" +
                    "\13\2\u00ce\u00d1\3\2\2\2\u00cf\u00d1\5\24\13\2\u00d0\u00cb\3\2\2\2\u00d0" +
                    "\u00cf\3\2\2\2\u00d1\u00dc\3\2\2\2\u00d2\u00d3\f\5\2\2\u00d3\u00d4\5\20" +
                    "\t\2\u00d4\u00d5\5\22\n\6\u00d5\u00db\3\2\2\2\u00d6\u00d7\f\4\2\2\u00d7" +
                    "\u00d8\5\16\b\2\u00d8\u00d9\5\22\n\5\u00d9\u00db\3\2\2\2\u00da\u00d2\3" +
                    "\2\2\2\u00da\u00d6\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc" +
                    "\u00dd\3\2\2\2\u00dd\23\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e7\5\2\2" +
                    "\2\u00e0\u00e7\5\4\3\2\u00e1\u00e7\7\24\2\2\u00e2\u00e3\7\30\2\2\u00e3" +
                    "\u00e4\5\22\n\2\u00e4\u00e5\7\31\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00df\3" +
                    "\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7" +
                    "\25\3\2\2\2\u00e8\u00e9\5\2\2\2\u00e9\u00ea\7\7\2\2\u00ea\u00eb\5L\'\2" +
                    "\u00eb\u00ec\7\37\2\2\u00ec\27\3\2\2\2\u00ed\u00ee\5\2\2\2\u00ee\u00ef" +
                    "\7\b\2\2\u00ef\u00f0\5L\'\2\u00f0\u00f1\7\37\2\2\u00f1\31\3\2\2\2\u00f2" +
                    "\u00f3\5\2\2\2\u00f3\u00f4\7\t\2\2\u00f4\u00f5\5L\'\2\u00f5\u00f6\7\37" +
                    "\2\2\u00f6\33\3\2\2\2\u00f7\u00f8\5\2\2\2\u00f8\u00f9\7\n\2\2\u00f9\u00fa" +
                    "\5L\'\2\u00fa\u00fb\7\37\2\2\u00fb\35\3\2\2\2\u00fc\u00fd\5L\'\2\u00fd" +
                    "\u00fe\7F\2\2\u00fe\u00ff\5L\'\2\u00ff\37\3\2\2\2\u0100\u0101\5L\'\2\u0101" +
                    "\u0102\7G\2\2\u0102\u0103\5L\'\2\u0103!\3\2\2\2\u0104\u0105\5L\'\2\u0105" +
                    "\u0106\7H\2\2\u0106\u0107\5L\'\2\u0107#\3\2\2\2\u0108\u0109\5L\'\2\u0109" +
                    "\u010a\7I\2\2\u010a\u010b\5L\'\2\u010b%\3\2\2\2\u010c\u010d\5L\'\2\u010d" +
                    "\u010e\7\13\2\2\u010e\u010f\7\35\2\2\u010f\u0110\5L\'\2\u0110\'\3\2\2" +
                    "\2\u0111\u0112\5L\'\2\u0112\u0113\7J\2\2\u0113\u0114\5L\'\2\u0114)\3\2" +
                    "\2\2\u0115\u0116\t\5\2\2\u0116+\3\2\2\2\u0117\u0118\t\6\2\2\u0118-\3\2" +
                    "\2\2\u0119\u0123\5L\'\2\u011a\u0123\5\36\20\2\u011b\u0123\5 \21\2\u011c" +
                    "\u0123\5\"\22\2\u011d\u0123\5$\23\2\u011e\u0123\5(\25\2\u011f\u0123\5" +
                    "&\24\2\u0120\u0123\5*\26\2\u0121\u0123\5,\27\2\u0122\u0119\3\2\2\2\u0122" +
                    "\u011a\3\2\2\2\u0122\u011b\3\2\2\2\u0122\u011c\3\2\2\2\u0122\u011d\3\2" +
                    "\2\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122" +
                    "\u0121\3\2\2\2\u0123/\3\2\2\2\u0124\u0125\7M\2\2\u0125\u0126\7\30\2\2" +
                    "\u0126\u0127\5.\30\2\u0127\u0128\7\31\2\2\u0128\61\3\2\2\2\u0129\u012e" +
                    "\5.\30\2\u012a\u012e\5\60\31\2\u012b\u012e\5\66\34\2\u012c\u012e\58\35" +
                    "\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c" +
                    "\3\2\2\2\u012e\63\3\2\2\2\u012f\u0130\7\30\2\2\u0130\u0131\5.\30\2\u0131" +
                    "\u0132\7\31\2\2\u0132\65\3\2\2\2\u0133\u0134\7\30\2\2\u0134\u0135\5\62" +
                    "\32\2\u0135\u0136\7\31\2\2\u0136\u0137\7K\2\2\u0137\u0138\7\30\2\2\u0138" +
                    "\u0139\5\62\32\2\u0139\u013a\7\31\2\2\u013a\67\3\2\2\2\u013b\u013c\7\30" +
                    "\2\2\u013c\u013d\5\62\32\2\u013d\u013e\7\31\2\2\u013e\u013f\7L\2\2\u013f" +
                    "\u0140\7\30\2\2\u0140\u0141\5\62\32\2\u0141\u0142\7\31\2\2\u01429\3\2" +
                    "\2\2\u0143\u0148\5.\30\2\u0144\u0148\5\66\34\2\u0145\u0148\58\35\2\u0146" +
                    "\u0148\5\64\33\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3" +
                    "\2\2\2\u0147\u0146\3\2\2\2\u0148;\3\2\2\2\u0149\u014d\5:\36\2\u014a\u014b" +
                    "\7M\2\2\u014b\u014d\5:\36\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014d" +
                    "=\3\2\2\2\u014e\u014f\5\4\3\2\u014f\u0153\7#\2\2\u0150\u0151\5L\'\2\u0151" +
                    "\u0152\t\7\2\2\u0152\u0154\3\2\2\2\u0153\u0150\3\2\2\2\u0154\u0155\3\2" +
                    "\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156?\3\2\2\2\u0157\u0158" +
                    "\5\4\3\2\u0158\u0159\7\22\2\2\u0159\u015a\7\30\2\2\u015a\u015f\5L\'\2" +
                    "\u015b\u015c\7\32\2\2\u015c\u015e\5L\'\2\u015d\u015b\3\2\2\2\u015e\u0161" +
                    "\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161" +
                    "\u015f\3\2\2\2\u0162\u0163\7\31\2\2\u0163A\3\2\2\2\u0164\u0167\7\34\2" +
                    "\2\u0165\u0168\5> \2\u0166\u0168\5@!\2\u0167\u0165\3\2\2\2\u0167\u0166" +
                    "\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7\35\2\2\u016a\u016b\5L\'\2\u016b" +
                    "\u016c\7\37\2\2\u016cC\3\2\2\2\u016d\u016f\7\60\2\2\u016e\u0170\7\61\2" +
                    "\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172" +
                    "\5N(\2\u0172\u0174\7E\2\2\u0173\u0175\5Z.\2\u0174\u0173\3\2\2\2\u0174" +
                    "\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7\37\2\2\u0177E\3\2\2\2" +
                    "\u0178\u017b\5J&\2\u0179\u017b\5\n\6\2\u017a\u0178\3\2\2\2\u017a\u0179" +
                    "\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7-\2\2\u017d\u017e\7/\2\2\u017e" +
                    "\u017f\5L\'\2\u017fG\3\2\2\2\u0180\u0181\t\b\2\2\u0181I\3\2\2\2\u0182" +
                    "\u0189\7U\2\2\u0183\u0189\5\2\2\2\u0184\u0189\5\4\3\2\u0185\u0189\5\6" +
                    "\4\2\u0186\u0189\7E\2\2\u0187\u0189\7V\2\2\u0188\u0182\3\2\2\2\u0188\u0183" +
                    "\3\2\2\2\u0188\u0184\3\2\2\2\u0188\u0185\3\2\2\2\u0188\u0186\3\2\2\2\u0188" +
                    "\u0187\3\2\2\2\u0189K\3\2\2\2\u018a\u019a\7S\2\2\u018b\u019a\7\24\2\2" +
                    "\u018c\u019a\7U\2\2\u018d\u019a\7T\2\2\u018e\u019a\5\2\2\2\u018f\u019a" +
                    "\5\22\n\2\u0190\u019a\5h\65\2\u0191\u019a\5f\64\2\u0192\u019a\5\4\3\2" +
                    "\u0193\u019a\5\6\4\2\u0194\u019a\5v<\2\u0195\u019a\5j\66\2\u0196\u019a" +
                    "\5X-\2\u0197\u019a\5@!\2\u0198\u019a\5F$\2\u0199\u018a\3\2\2\2\u0199\u018b" +
                    "\3\2\2\2\u0199\u018c\3\2\2\2\u0199\u018d\3\2\2\2\u0199\u018e\3\2\2\2\u0199" +
                    "\u018f\3\2\2\2\u0199\u0190\3\2\2\2\u0199\u0191\3\2\2\2\u0199\u0192\3\2" +
                    "\2\2\u0199\u0193\3\2\2\2\u0199\u0194\3\2\2\2\u0199\u0195\3\2\2\2\u0199" +
                    "\u0196\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019aM\3\2\2\2" +
                    "\u019b\u019f\5\n\6\2\u019c\u019f\5\2\2\2\u019d\u019f\5\4\3\2\u019e\u019b" +
                    "\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019fO\3\2\2\2\u01a0" +
                    "\u01a1\7\34\2\2\u01a1\u01a2\5\2\2\2\u01a2\u01a3\7\35\2\2\u01a3\u01a4\5" +
                    "L\'\2\u01a4\u01a5\7\37\2\2\u01a5Q\3\2\2\2\u01a6\u01a8\7\60\2\2\u01a7\u01a9" +
                    "\7\61\2\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2" +
                    "\u01aa\u01ab\5N(\2\u01ab\u01ad\5\2\2\2\u01ac\u01ae\5Z.\2\u01ad\u01ac\3" +
                    "\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\7\37\2\2\u01b0" +
                    "S\3\2\2\2\u01b1\u01b2\7*\2\2\u01b2\u01b3\5L\'\2\u01b3\u01b4\7\37\2\2\u01b4" +
                    "U\3\2\2\2\u01b5\u01b6\5J&\2\u01b6\u01b7\7-\2\2\u01b7\u01b8\7/\2\2\u01b8" +
                    "\u01b9\5b\62\2\u01b9\u01ba\7\37\2\2\u01baW\3\2\2\2\u01bb\u01bc\5J&\2\u01bc" +
                    "\u01bd\7-\2\2\u01bd\u01be\7/\2\2\u01be\u01bf\5b\62\2\u01bfY\3\2\2\2\u01c0" +
                    "\u01c1\7\35\2\2\u01c1\u01c2\5L\'\2\u01c2[\3\2\2\2\u01c3\u01c5\7\60\2\2" +
                    "\u01c4\u01c6\5H%\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8" +
                    "\3\2\2\2\u01c7\u01c9\5H%\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9" +
                    "\u01ca\3\2\2\2\u01ca\u01cb\5N(\2\u01cb\u01cd\5\2\2\2\u01cc\u01ce\5Z.\2" +
                    "\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0" +
                    "\7\37\2\2\u01d0]\3\2\2\2\u01d1\u01d3\7\63\2\2\u01d2\u01d4\5H%\2\u01d3" +
                    "\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d7\5H" +
                    "%\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8" +
                    "\u01d9\5N(\2\u01d9\u01db\5\2\2\2\u01da\u01dc\5Z.\2\u01db\u01da\3\2\2\2" +
                    "\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\7\37\2\2\u01de_\3" +
                    "\2\2\2\u01df\u01e0\7+\2\2\u01e0\u01e1\5\4\3\2\u01e1\u01e2\7\37\2\2\u01e2" +
                    "a\3\2\2\2\u01e3\u01e5\7\30\2\2\u01e4\u01e6\5L\'\2\u01e5\u01e4\3\2\2\2" +
                    "\u01e5\u01e6\3\2\2\2\u01e6\u01eb\3\2\2\2\u01e7\u01e8\7\32\2\2\u01e8\u01ea" +
                    "\5L\'\2\u01e9\u01e7\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01ec\3\2\2\2\u01eb" +
                    "\u01e9\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7\31" +
                    "\2\2\u01efc\3\2\2\2\u01f0\u01f1\5L\'\2\u01f1\u01f2\7-\2\2\u01f2\u01f3" +
                    "\5\2\2\2\u01f3\u01f4\5b\62\2\u01f4\u01f5\7\37\2\2\u01f5e\3\2\2\2\u01f6" +
                    "\u01f7\5J&\2\u01f7\u01f8\7-\2\2\u01f8\u01f9\5\2\2\2\u01f9\u01fa\5b\62" +
                    "\2\u01fag\3\2\2\2\u01fb\u01fc\5\4\3\2\u01fc\u01fd\7.\2\2\u01fd\u01fe\5" +
                    "\2\2\2\u01fei\3\2\2\2\u01ff\u0200\7\30\2\2\u0200\u0201\5t;\2\u0201\u0202" +
                    "\7\31\2\2\u0202\u0203\5L\'\2\u0203k\3\2\2\2\u0204\u0205\5\n\6\2\u0205" +
                    "\u020a\5\2\2\2\u0206\u0207\7\32\2\2\u0207\u0208\5\n\6\2\u0208\u0209\5" +
                    "\2\2\2\u0209\u020b\3\2\2\2\u020a\u0206\3\2\2\2\u020b\u020c\3\2\2\2\u020c" +
                    "\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020dm\3\2\2\2\u020e\u020f\7\64\2\2" +
                    "\u020f\u0210\5\2\2\2\u0210\u0212\7\26\2\2\u0211\u0213\5l\67\2\u0212\u0211" +
                    "\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\7\27\2\2" +
                    "\u0215\u0216\7\37\2\2\u0216o\3\2\2\2\u0217\u0218\5\2\2\2\u0218\u0219\5" +
                    "L\'\2\u0219q\3\2\2\2\u021a\u021b\7\65\2\2\u021b\u021c\5\4\3\2\u021c\u021d" +
                    "\7\23\2\2\u021d\u021e\5\2\2\2\u021e\u0229\7\26\2\2\u021f\u0224\5p9\2\u0220" +
                    "\u0221\7\32\2\2\u0221\u0223\5p9\2\u0222\u0220\3\2\2\2\u0223\u0226\3\2" +
                    "\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0228\3\2\2\2\u0226" +
                    "\u0224\3\2\2\2\u0227\u021f\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2" +
                    "\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c" +
                    "\u022d\7\27\2\2\u022d\u022e\7\37\2\2\u022es\3\2\2\2\u022f\u0232\5\4\3" +
                    "\2\u0230\u0232\5\n\6\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232u" +
                    "\3\2\2\2\u0233\u0234\7\65\2\2\u0234\u0235\5\4\3\2\u0235\u0237\7.\2\2\u0236" +
                    "\u0238\5t;\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2" +
                    "\2\u0239\u023a\5\2\2\2\u023aw\3\2\2\2\u023b\u023c\7\65\2\2\u023c\u023d" +
                    "\7\34\2\2\u023d\u023e\5\4\3\2\u023e\u023f\5\2\2\2\u023f\u0240\7\35\2\2" +
                    "\u0240\u0241\5L\'\2\u0241y\3\2\2\2\u0242\u0244\7B\2\2\u0243\u0245\5L\'" +
                    "\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247" +
                    "\7\37\2\2\u0247{\3\2\2\2\u0248\u0249\7?\2\2\u0249\u024a\5<\37\2\u024a" +
                    "\u024c\7\26\2\2\u024b\u024d\5\u0090I\2\u024c\u024b\3\2\2\2\u024c\u024d" +
                    "\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\7\27\2\2\u024f}\3\2\2\2\u0250" +
                    "\u0251\7>\2\2\u0251\u0252\7\26\2\2\u0252\u0253\5\u0090I\2\u0253\u0254" +
                    "\7\27\2\2\u0254\177\3\2\2\2\u0255\u0256\7=\2\2\u0256\u0257\5<\37\2\u0257" +
                    "\u0259\7\26\2\2\u0258\u025a\5\u0090I\2\u0259\u0258\3\2\2\2\u0259\u025a" +
                    "\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025f\7\27\2\2\u025c\u025e\5|?\2\u025d" +
                    "\u025c\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u0260\3\2\2\2\u025f\u025d\3\2" +
                    "\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0264\5~@\2\u0263\u0262" +
                    "\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0081\3\2\2\2\u0265\u0266\7@\2\2\u0266" +
                    "\u0267\5<\37\2\u0267\u0269\7\26\2\2\u0268\u026a\5\u0090I\2\u0269\u0268" +
                    "\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\7\27\2\2" +
                    "\u026c\u0083\3\2\2\2\u026d\u0270\5\u0080A\2\u026e\u0270\5\u0082B\2\u026f" +
                    "\u026d\3\2\2\2\u026f\u026e\3\2\2\2\u0270\u0085\3\2\2\2\u0271\u0281\5P" +
                    ")\2\u0272\u0281\5T+\2\u0273\u0281\5R*\2\u0274\u0281\5d\63\2\u0275\u0281" +
                    "\5V,\2\u0276\u0281\5r:\2\u0277\u0281\5n8\2\u0278\u0281\5x=\2\u0279\u0281" +
                    "\5z>\2\u027a\u0281\5\26\f\2\u027b\u0281\5\30\r\2\u027c\u0281\5\32\16\2" +
                    "\u027d\u0281\5\34\17\2\u027e\u0281\5B\"\2\u027f\u0281\5D#\2\u0280\u0271" +
                    "\3\2\2\2\u0280\u0272\3\2\2\2\u0280\u0273\3\2\2\2\u0280\u0274\3\2\2\2\u0280" +
                    "\u0275\3\2\2\2\u0280\u0276\3\2\2\2\u0280\u0277\3\2\2\2\u0280\u0278\3\2" +
                    "\2\2\u0280\u0279\3\2\2\2\u0280\u027a\3\2\2\2\u0280\u027b\3\2\2\2\u0280" +
                    "\u027c\3\2\2\2\u0280\u027d\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u027f\3\2" +
                    "\2\2\u0281\u0087\3\2\2\2\u0282\u0283\7C\2\2\u0283\u0284\7U\2\2\u0284\u0285" +
                    "\7\37\2\2\u0285\u0089\3\2\2\2\u0286\u0287\7D\2\2\u0287\u0288\7U\2\2\u0288" +
                    "\u0289\7\37\2\2\u0289\u008b\3\2\2\2\u028a\u028d\5\u0088E\2\u028b\u028d" +
                    "\5\u008aF\2\u028c\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028d\u008d\3\2\2" +
                    "\2\u028e\u0291\5`\61\2\u028f\u0291\5\u008cG\2\u0290\u028e\3\2\2\2\u0290" +
                    "\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2" +
                    "\2\2\u0293\u008f\3\2\2\2\u0294\u0297\5\u0086D\2\u0295\u0297\5\u0084C\2" +
                    "\u0296\u0294\3\2\2\2\u0296\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0296" +
                    "\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u0091\3\2\2\2\u029a\u029b\5\2\2\2\u029b" +
                    "\u029c\7\33\2\2\u029c\u029d\5\b\5\2\u029d\u0093\3\2\2\2\u029e\u029f\7" +
                    "\30\2\2\u029f\u02a4\5\u0092J\2\u02a0\u02a1\7\32\2\2\u02a1\u02a3\5\u0092" +
                    "J\2\u02a2\u02a0\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4" +
                    "\u02a5\3\2\2\2\u02a5\u02a7\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\7\31" +
                    "\2\2\u02a8\u0095\3\2\2\2\u02a9\u02aa\7,\2\2\u02aa\u02ab\5\f\7\2\u02ab" +
                    "\u02ad\5\2\2\2\u02ac\u02ae\5\u0094K\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae" +
                    "\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\7\26\2\2\u02b0\u02b2\5\u0090" +
                    "I\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3" +
                    "\u02b4\7\27\2\2\u02b4\u0097\3\2\2\2\u02b5\u02b6\7(\2\2\u02b6\u02b7\5\f" +
                    "\7\2\u02b7\u02b9\5\2\2\2\u02b8\u02ba\5\u0094K\2\u02b9\u02b8\3\2\2\2\u02b9" +
                    "\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\7\26\2\2\u02bc\u02be\5" +
                    "\u0090I\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2\2\2" +
                    "\u02bf\u02c0\7\27\2\2\u02c0\u0099\3\2\2\2\u02c1\u02c3\7)\2\2\u02c2\u02c4" +
                    "\5\u0094K\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2\2" +
                    "\2\u02c5\u02c7\7\26\2\2\u02c6\u02c8\5\u0090I\2\u02c7\u02c6\3\2\2\2\u02c7" +
                    "\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\7\27\2\2\u02ca\u009b\3" +
                    "\2\2\2\u02cb\u02ce\5\u0098M\2\u02cc\u02ce\5\u0096L\2\u02cd\u02cb\3\2\2" +
                    "\2\u02cd\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0" +
                    "\3\2\2\2\u02d0\u009d\3\2\2\2\u02d1\u02d4\5\\/\2\u02d2\u02d4\5^\60\2\u02d3" +
                    "\u02d1\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d6\3\2" +
                    "\2\2\u02d5\u02d3\3\2\2\2\u02d6\u009f\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8" +
                    "\u02da\5\u009eP\2\u02d9\u02db\5\u009aN\2\u02da\u02d9\3\2\2\2\u02da\u02db" +
                    "\3\2\2\2\u02db\u02dd\3\2\2\2\u02dc\u02de\5\u009cO\2\u02dd\u02dc\3\2\2" +
                    "\2\u02dd\u02de\3\2\2\2\u02de\u00a1\3\2\2\2\u02df\u02e0\7\25\2\2\u02e0" +
                    "\u02e1\5\2\2\2\u02e1\u02e2\7\36\2\2\u02e2\u02e4\5\4\3\2\u02e3\u02e5\7" +
                    ";\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6" +
                    "\u02e7\7\26\2\2\u02e7\u02e8\5\u00a0Q\2\u02e8\u02e9\7\27\2\2\u02e9\u00a3" +
                    "\3\2\2\2\u02ea\u02ec\5\u008eH\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2" +
                    "\2\u02ec\u02ee\3\2\2\2\u02ed\u02ef\5\u00a2R\2\u02ee\u02ed\3\2\2\2\u02ef" +
                    "\u02f0\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u00a5\3\2" +
                    "\2\2D\u00b1\u00b9\u00bf\u00c5\u00d0\u00da\u00dc\u00e6\u0122\u012d\u0147" +
                    "\u014c\u0155\u015f\u0167\u016f\u0174\u017a\u0188\u0199\u019e\u01a8\u01ad" +
                    "\u01c5\u01c8\u01cd\u01d3\u01d6\u01db\u01e5\u01eb\u020c\u0212\u0224\u0229" +
                    "\u0231\u0237\u0244\u024c\u0259\u025f\u0263\u0269\u026f\u0280\u028c\u0290" +
                    "\u0292\u0296\u0298\u02a4\u02ad\u02b1\u02b9\u02bd\u02c3\u02c7\u02cd\u02cf" +
                    "\u02d3\u02d5\u02da\u02dd\u02e4\u02eb\u02f0";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}