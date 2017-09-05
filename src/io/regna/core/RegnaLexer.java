// Generated from Z:/Java/ideaspace/Regna/src\Regna.g4 by ANTLR 4.7
package io.regna.core;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegnaLexer extends Lexer {
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
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "T__4", "LETTER", "DIGIT", "SYMBOL", "ArrayOp",
            "MODULE_DEC", "LBRC", "RBRC", "LPRM", "RPRM", "PARAM_SEPERATOR", "PARAM_TYPE_DEF",
            "VAR_DEC", "EQUALS", "PKGID", "EOS", "CMTCH", "MCOMO", "MCOMC", "L_VOID",
            "FUNC_DEF", "CONSTRUCT_DEF", "PRINT", "REQUIRE", "STATICFUNC", "MEMBER_CT",
            "MEMBER_T", "CONSTRUCTOR", "ATTRIBUTE_DEF", "Const", "TRANSIENT", "STATICATTRIBUTE",
            "STRUCT_DEF", "STRUCT_T", "CHAR_ID", "INT_ID", "STR_ID", "DBL_id", "FLT_ID",
            "BYTE", "SERIALIZABLE", "COMPILER_INSTR", "Compiler_Compile_CMD", "Compiler_cpextend_CMD",
            "INTEGER", "SIMP_CHAR", "SIMP_CHARS", "BASE_CHARACTER", "BASE_CHARACTERS",
            "AR_CHARS", "CHRCT", "BlankLiteral", "StringLiteral", "LINE_COMMENT",
            "MULTI_COMMENT", "WS"
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


	public RegnaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Regna.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01d1\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3" +
                    "\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16" +
                    "\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22" +
                    "\u00aa\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27" +
                    "\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32" +
                    "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34" +
                    "\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00da\n\34\3\35\3\35\3\35\3\35\3\35" +
                    "\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00ea\n\35\3\36\3\36" +
                    "\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u00fe" +
                    "\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0106\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3" +
                    "#\5#\u0112\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3" +
                    "$\3$\3$\3$\5$\u012a\n$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3" +
                    "&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3" +
                    "*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3" +
                    ".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3" +
                    "\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\6\62\u0187" +
                    "\n\62\r\62\16\62\u0188\3\63\3\63\5\63\u018d\n\63\3\64\3\64\3\64\6\64\u0192" +
                    "\n\64\r\64\16\64\u0193\3\65\3\65\5\65\u0198\n\65\3\66\3\66\3\66\6\66\u019d" +
                    "\n\66\r\66\16\66\u019e\3\67\3\67\6\67\u01a3\n\67\r\67\16\67\u01a4\38\3" +
                    "8\58\u01a9\n8\38\38\39\39\39\3:\3:\6:\u01b2\n:\r:\16:\u01b3\3:\3:\5:\u01b8" +
                    "\n:\3;\3;\7;\u01bc\n;\f;\16;\u01bf\13;\3;\3;\3<\3<\7<\u01c5\n<\f<\16<" +
                    "\u01c8\13<\3<\3<\3<\3<\3=\3=\3=\3=\4\u01b3\u01c6\2>\3\3\5\4\7\5\t\6\13" +
                    "\7\r\2\17\2\21\2\23\2\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21" +
                    ")\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I" +
                    "\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e\60g\61i\62k\63m\64o\65q\66s\67u8w9y:\3" +
                    "\2\b\4\2C\\c|\3\2\62;\7\2&&/\60BB^^aa\5\2]]__aa\4\2\f\f\17\17\6\2\13\f" +
                    "\17\17\"\"cd\2\u01e2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2" +
                    "\13\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3" +
                    "\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3" +
                    "\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65" +
                    "\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3" +
                    "\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2" +
                    "\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2" +
                    "[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3" +
                    "\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2" +
                    "\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7\177\3\2\2" +
                    "\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r\u0088\3\2\2\2\17\u008a\3\2\2\2\21" +
                    "\u008c\3\2\2\2\23\u008e\3\2\2\2\25\u0090\3\2\2\2\27\u0097\3\2\2\2\31\u0099" +
                    "\3\2\2\2\33\u009b\3\2\2\2\35\u009d\3\2\2\2\37\u009f\3\2\2\2!\u00a1\3\2" +
                    "\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2\'\u00ad\3\2\2\2)\u00b1\3\2\2\2+\u00b3" +
                    "\3\2\2\2-\u00b6\3\2\2\2/\u00b9\3\2\2\2\61\u00bc\3\2\2\2\63\u00c1\3\2\2" +
                    "\2\65\u00c5\3\2\2\2\67\u00d9\3\2\2\29\u00e9\3\2\2\2;\u00eb\3\2\2\2=\u00f0" +
                    "\3\2\2\2?\u00f3\3\2\2\2A\u00fd\3\2\2\2C\u0105\3\2\2\2E\u0111\3\2\2\2G" +
                    "\u0129\3\2\2\2I\u012b\3\2\2\2K\u0131\3\2\2\2M\u013b\3\2\2\2O\u0142\3\2" +
                    "\2\2Q\u0147\3\2\2\2S\u014b\3\2\2\2U\u0152\3\2\2\2W\u0159\3\2\2\2Y\u015f" +
                    "\3\2\2\2[\u0164\3\2\2\2]\u0171\3\2\2\2_\u0173\3\2\2\2a\u017c\3\2\2\2c" +
                    "\u0186\3\2\2\2e\u018c\3\2\2\2g\u018e\3\2\2\2i\u0197\3\2\2\2k\u0199\3\2" +
                    "\2\2m\u01a2\3\2\2\2o\u01a6\3\2\2\2q\u01ac\3\2\2\2s\u01b7\3\2\2\2u\u01b9" +
                    "\3\2\2\2w\u01c2\3\2\2\2y\u01cd\3\2\2\2{|\7-\2\2|\4\3\2\2\2}~\7/\2\2~\6" +
                    "\3\2\2\2\177\u0080\7,\2\2\u0080\b\3\2\2\2\u0081\u0082\7\61\2\2\u0082\n" +
                    "\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7k\2\2\u0086" +
                    "\u0087\7v\2\2\u0087\f\3\2\2\2\u0088\u0089\t\2\2\2\u0089\16\3\2\2\2\u008a" +
                    "\u008b\t\3\2\2\u008b\20\3\2\2\2\u008c\u008d\t\4\2\2\u008d\22\3\2\2\2\u008e" +
                    "\u008f\t\5\2\2\u008f\24\3\2\2\2\u0090\u0091\7o\2\2\u0091\u0092\7q\2\2" +
                    "\u0092\u0093\7f\2\2\u0093\u0094\7w\2\2\u0094\u0095\7n\2\2\u0095\u0096" +
                    "\7g\2\2\u0096\26\3\2\2\2\u0097\u0098\7}\2\2\u0098\30\3\2\2\2\u0099\u009a" +
                    "\7\177\2\2\u009a\32\3\2\2\2\u009b\u009c\7*\2\2\u009c\34\3\2\2\2\u009d" +
                    "\u009e\7+\2\2\u009e\36\3\2\2\2\u009f\u00a0\7.\2\2\u00a0 \3\2\2\2\u00a1" +
                    "\u00a2\7<\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7g\2\2\u00a5" +
                    "\u00aa\7v\2\2\u00a6\u00a7\7N\2\2\u00a7\u00a8\7G\2\2\u00a8\u00aa\7V\2\2" +
                    "\u00a9\u00a3\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7" +
                    "?\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7m\2\2\u00af\u00b0" +
                    "\7i\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2*\3\2\2\2\u00b3\u00b4\7" +
                    "%\2\2\u00b4\u00b5\7%\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7%\2\2\u00b7\u00b8" +
                    "\7]\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7_\2\2\u00ba\u00bb\7%\2\2\u00bb\60" +
                    "\3\2\2\2\u00bc\u00bd\7x\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7k\2\2\u00bf" +
                    "\u00c0\7f\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7g\2\2\u00c3" +
                    "\u00c4\7h\2\2\u00c4\64\3\2\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7q\2\2\u00c7" +
                    "\u00c8\7p\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7t\2\2" +
                    "\u00cb\u00cc\7w\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce\7v\2\2\u00ce\66\3\2" +
                    "\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3" +
                    "\7p\2\2\u00d3\u00da\7v\2\2\u00d4\u00d5\7R\2\2\u00d5\u00d6\7T\2\2\u00d6" +
                    "\u00d7\7K\2\2\u00d7\u00d8\7P\2\2\u00d8\u00da\7V\2\2\u00d9\u00cf\3\2\2" +
                    "\2\u00d9\u00d4\3\2\2\2\u00da8\3\2\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7" +
                    "g\2\2\u00dd\u00de\7s\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1" +
                    "\7t\2\2\u00e1\u00ea\7g\2\2\u00e2\u00e3\7T\2\2\u00e3\u00e4\7G\2\2\u00e4" +
                    "\u00e5\7S\2\2\u00e5\u00e6\7W\2\2\u00e6\u00e7\7K\2\2\u00e7\u00e8\7T\2\2" +
                    "\u00e8\u00ea\7G\2\2\u00e9\u00db\3\2\2\2\u00e9\u00e2\3\2\2\2\u00ea:\3\2" +
                    "\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef" +
                    "\7e\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7/\2\2\u00f1\u00f2\7@\2\2\u00f2>\3" +
                    "\2\2\2\u00f3\u00f4\7?\2\2\u00f4\u00f5\7@\2\2\u00f5@\3\2\2\2\u00f6\u00f7" +
                    "\7k\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fe\7v\2\2\u00fa" +
                    "\u00fb\7p\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fe\7y\2\2\u00fd\u00f6\3\2\2" +
                    "\2\u00fd\u00fa\3\2\2\2\u00feB\3\2\2\2\u00ff\u0100\7x\2\2\u0100\u0101\7" +
                    "c\2\2\u0101\u0106\7n\2\2\u0102\u0103\7X\2\2\u0103\u0104\7C\2\2\u0104\u0106" +
                    "\7N\2\2\u0105\u00ff\3\2\2\2\u0105\u0102\3\2\2\2\u0106D\3\2\2\2\u0107\u0108" +
                    "\7e\2\2\u0108\u0109\7q\2\2\u0109\u010a\7p\2\2\u010a\u010b\7u\2\2\u010b" +
                    "\u0112\7v\2\2\u010c\u010d\7E\2\2\u010d\u010e\7Q\2\2\u010e\u010f\7P\2\2" +
                    "\u010f\u0110\7U\2\2\u0110\u0112\7V\2\2\u0111\u0107\3\2\2\2\u0111\u010c" +
                    "\3\2\2\2\u0112F\3\2\2\2\u0113\u0114\7v\2\2\u0114\u0115\7t\2\2\u0115\u0116" +
                    "\7p\2\2\u0116\u012a\7u\2\2\u0117\u0118\7v\2\2\u0118\u0119\7t\2\2\u0119" +
                    "\u011a\7c\2\2\u011a\u011b\7p\2\2\u011b\u011c\7u\2\2\u011c\u011d\7k\2\2" +
                    "\u011d\u011e\7g\2\2\u011e\u011f\7p\2\2\u011f\u012a\7v\2\2\u0120\u0121" +
                    "\7V\2\2\u0121\u0122\7T\2\2\u0122\u0123\7C\2\2\u0123\u0124\7P\2\2\u0124" +
                    "\u0125\7U\2\2\u0125\u0126\7K\2\2\u0126\u0127\7G\2\2\u0127\u0128\7P\2\2" +
                    "\u0128\u012a\7V\2\2\u0129\u0113\3\2\2\2\u0129\u0117\3\2\2\2\u0129\u0120" +
                    "\3\2\2\2\u012aH\3\2\2\2\u012b\u012c\7u\2\2\u012c\u012d\7v\2\2\u012d\u012e" +
                    "\7x\2\2\u012e\u012f\7c\2\2\u012f\u0130\7n\2\2\u0130J\3\2\2\2\u0131\u0132" +
                    "\7u\2\2\u0132\u0133\7v\2\2\u0133\u0134\7t\2\2\u0134\u0135\7w\2\2\u0135" +
                    "\u0136\7e\2\2\u0136\u0137\7v\2\2\u0137\u0138\7f\2\2\u0138\u0139\7g\2\2" +
                    "\u0139\u013a\7h\2\2\u013aL\3\2\2\2\u013b\u013c\7u\2\2\u013c\u013d\7v\2" +
                    "\2\u013d\u013e\7t\2\2\u013e\u013f\7w\2\2\u013f\u0140\7e\2\2\u0140\u0141" +
                    "\7v\2\2\u0141N\3\2\2\2\u0142\u0143\7e\2\2\u0143\u0144\7j\2\2\u0144\u0145" +
                    "\7c\2\2\u0145\u0146\7t\2\2\u0146P\3\2\2\2\u0147\u0148\7k\2\2\u0148\u0149" +
                    "\7p\2\2\u0149\u014a\7v\2\2\u014aR\3\2\2\2\u014b\u014c\7U\2\2\u014c\u014d" +
                    "\7v\2\2\u014d\u014e\7t\2\2\u014e\u014f\7k\2\2\u014f\u0150\7p\2\2\u0150" +
                    "\u0151\7i\2\2\u0151T\3\2\2\2\u0152\u0153\7f\2\2\u0153\u0154\7q\2\2\u0154" +
                    "\u0155\7w\2\2\u0155\u0156\7d\2\2\u0156\u0157\7n\2\2\u0157\u0158\7g\2\2" +
                    "\u0158V\3\2\2\2\u0159\u015a\7h\2\2\u015a\u015b\7n\2\2\u015b\u015c\7q\2" +
                    "\2\u015c\u015d\7c\2\2\u015d\u015e\7v\2\2\u015eX\3\2\2\2\u015f\u0160\7" +
                    "d\2\2\u0160\u0161\7{\2\2\u0161\u0162\7v\2\2\u0162\u0163\7g\2\2\u0163Z" +
                    "\3\2\2\2\u0164\u0165\7u\2\2\u0165\u0166\7g\2\2\u0166\u0167\7t\2\2\u0167" +
                    "\u0168\7k\2\2\u0168\u0169\7c\2\2\u0169\u016a\7n\2\2\u016a\u016b\7k\2\2" +
                    "\u016b\u016c\7|\2\2\u016c\u016d\7c\2\2\u016d\u016e\7d\2\2\u016e\u016f" +
                    "\7n\2\2\u016f\u0170\7g\2\2\u0170\\\3\2\2\2\u0171\u0172\7B\2\2\u0172^\3" +
                    "\2\2\2\u0173\u0174\5]/\2\u0174\u0175\7e\2\2\u0175\u0176\7q\2\2\u0176\u0177" +
                    "\7o\2\2\u0177\u0178\7r\2\2\u0178\u0179\7k\2\2\u0179\u017a\7n\2\2\u017a" +
                    "\u017b\7g\2\2\u017b`\3\2\2\2\u017c\u017d\5]/\2\u017d\u017e\7k\2\2\u017e" +
                    "\u017f\7p\2\2\u017f\u0180\7e\2\2\u0180\u0181\7n\2\2\u0181\u0182\7w\2\2" +
                    "\u0182\u0183\7f\2\2\u0183\u0184\7g\2\2\u0184b\3\2\2\2\u0185\u0187\5\17" +
                    "\b\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188" +
                    "\u0189\3\2\2\2\u0189d\3\2\2\2\u018a\u018d\5\r\7\2\u018b\u018d\7a\2\2\u018c" +
                    "\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018df\3\2\2\2\u018e\u0191\5\r\7\2" +
                    "\u018f\u0192\5e\63\2\u0190\u0192\5\17\b\2\u0191\u018f\3\2\2\2\u0191\u0190" +
                    "\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194" +
                    "h\3\2\2\2\u0195\u0198\5e\63\2\u0196\u0198\5\21\t\2\u0197\u0195\3\2\2\2" +
                    "\u0197\u0196\3\2\2\2\u0198j\3\2\2\2\u0199\u019c\5\r\7\2\u019a\u019d\5" +
                    "i\65\2\u019b\u019d\5\17\b\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d" +
                    "\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019fl\3\2\2\2" +
                    "\u01a0\u01a3\5e\63\2\u01a1\u01a3\5\23\n\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1" +
                    "\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5" +
                    "n\3\2\2\2\u01a6\u01a8\7)\2\2\u01a7\u01a9\13\2\2\2\u01a8\u01a7\3\2\2\2" +
                    "\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\7)\2\2\u01abp\3\2" +
                    "\2\2\u01ac\u01ad\7$\2\2\u01ad\u01ae\7$\2\2\u01aer\3\2\2\2\u01af\u01b1" +
                    "\7$\2\2\u01b0\u01b2\13\2\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3" +
                    "\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b8\7$" +
                    "\2\2\u01b6\u01b8\5q9\2\u01b7\u01af\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8t" +
                    "\3\2\2\2\u01b9\u01bd\5+\26\2\u01ba\u01bc\n\6\2\2\u01bb\u01ba\3\2\2\2\u01bc" +
                    "\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2" +
                    "\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\b;\2\2\u01c1v\3\2\2\2\u01c2\u01c6" +
                    "\5-\27\2\u01c3\u01c5\13\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2" +
                    "\u01c6\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6" +
                    "\3\2\2\2\u01c9\u01ca\5/\30\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\b<\2\2\u01cc" +
                    "x\3\2\2\2\u01cd\u01ce\t\7\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\b=\3\2\u01d0" +
                    "z\3\2\2\2\30\2\u00a9\u00d9\u00e9\u00fd\u0105\u0111\u0129\u0188\u018c\u0191" +
                    "\u0193\u0197\u019c\u019e\u01a2\u01a4\u01a8\u01b3\u01b7\u01bd\u01c6\4\2" +
                    "\3\2\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}