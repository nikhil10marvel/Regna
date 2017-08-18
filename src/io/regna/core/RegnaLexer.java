// Generated from Z:/Java/ideaspace/Regna/src\Regna.g4 by ANTLR 4.7
package io.regna.core;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegnaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MODULE_DEC=5, LBRC=6, RBRC=7, LPRM=8, 
		RPRM=9, PARAM_SEPERATOR=10, PARAM_TYPE_DEF=11, VAR_DEC=12, EQUALS=13, 
		PKGID=14, EOS=15, CMTCH=16, MCOMO=17, MCOMC=18, L_VOID=19, FUNC_DEF=20, 
		CONSTRUCT_DEF=21, PRINT=22, REQUIRE=23, STATICFUNC=24, MEMBER_CT=25, MEMBER_T=26, 
		CONSTRUCTOR=27, ATTRIBUTE_DEF=28, Const=29, TRANSIENT=30, STATICATTRIBUTE=31, 
		STRUCT_DEF=32, STRUCT_T=33, CHAR_ID=34, INT_ID=35, STR_ID=36, DBL_id=37, 
		FLT_ID=38, BYTE=39, SERIALIZABLE=40, INTEGER=41, SIMP_CHAR=42, SIMP_CHARS=43, 
		BASE_CHARACTER=44, BASE_CHARACTERS=45, AR_CHARS=46, CHRCT=47, BlankLiteral=48, 
		StringLiteral=49, LINE_COMMENT=50, MULTI_COMMENT=51, WS=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "LETTER", "DIGIT", "SYMBOL", "ArrayOp", 
		"MODULE_DEC", "LBRC", "RBRC", "LPRM", "RPRM", "PARAM_SEPERATOR", "PARAM_TYPE_DEF", 
		"VAR_DEC", "EQUALS", "PKGID", "EOS", "CMTCH", "MCOMO", "MCOMC", "L_VOID", 
		"FUNC_DEF", "CONSTRUCT_DEF", "PRINT", "REQUIRE", "STATICFUNC", "MEMBER_CT", 
		"MEMBER_T", "CONSTRUCTOR", "ATTRIBUTE_DEF", "Const", "TRANSIENT", "STATICATTRIBUTE", 
		"STRUCT_DEF", "STRUCT_T", "CHAR_ID", "INT_ID", "STR_ID", "DBL_id", "FLT_ID", 
		"BYTE", "SERIALIZABLE", "INTEGER", "SIMP_CHAR", "SIMP_CHARS", "BASE_CHARACTER", 
		"BASE_CHARACTERS", "AR_CHARS", "CHRCT", "BlankLiteral", "StringLiteral", 
		"LINE_COMMENT", "MULTI_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'module'", "'{'", "'}'", "'('", "')'", 
		"','", "':'", null, "'='", "'pkg'", "';'", "'##'", "'#['", "']#'", "'void'", 
		"'def'", "'construct'", null, null, "'stfc'", "'->'", "'=>'", "'init'", 
		null, null, null, "'stval'", "'structdef'", "'struct'", "'char'", "'int'", 
		"'String'", "'double'", "'float'", "'byte'", "'serializable'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "MODULE_DEC", "LBRC", "RBRC", "LPRM", "RPRM", 
		"PARAM_SEPERATOR", "PARAM_TYPE_DEF", "VAR_DEC", "EQUALS", "PKGID", "EOS", 
		"CMTCH", "MCOMO", "MCOMC", "L_VOID", "FUNC_DEF", "CONSTRUCT_DEF", "PRINT", 
		"REQUIRE", "STATICFUNC", "MEMBER_CT", "MEMBER_T", "CONSTRUCTOR", "ATTRIBUTE_DEF", 
		"Const", "TRANSIENT", "STATICATTRIBUTE", "STRUCT_DEF", "STRUCT_T", "CHAR_ID", 
		"INT_ID", "STR_ID", "DBL_id", "FLT_ID", "BYTE", "SERIALIZABLE", "INTEGER", 
		"SIMP_CHAR", "SIMP_CHARS", "BASE_CHARACTER", "BASE_CHARACTERS", "AR_CHARS", 
		"CHRCT", "BlankLiteral", "StringLiteral", "LINE_COMMENT", "MULTI_COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u01ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u009d\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00cd\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u00dd\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u00f5\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u0101\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\5#\u0119\n#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)"+
		"\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,"+
		"\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\6.\u0162\n.\r.\16.\u0163"+
		"\3/\3/\5/\u0168\n/\3\60\3\60\3\60\6\60\u016d\n\60\r\60\16\60\u016e\3\61"+
		"\3\61\5\61\u0173\n\61\3\62\3\62\6\62\u0177\n\62\r\62\16\62\u0178\3\63"+
		"\3\63\6\63\u017d\n\63\r\63\16\63\u017e\3\64\3\64\5\64\u0183\n\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\66\3\66\6\66\u018c\n\66\r\66\16\66\u018d\3\66\3"+
		"\66\5\66\u0192\n\66\3\67\3\67\7\67\u0196\n\67\f\67\16\67\u0199\13\67\3"+
		"\67\3\67\38\38\78\u019f\n8\f8\168\u01a2\138\38\38\38\38\39\39\39\39\4"+
		"\u018d\u01a0\2:\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\7\25\b\27\t\31\n"+
		"\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67"+
		"\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e\60g\61"+
		"i\62k\63m\64o\65q\66\3\2\b\4\2C\\c|\3\2\62;\7\2&&/\60BB^^aa\5\2]]__aa"+
		"\4\2\f\f\17\17\6\2\13\f\17\17\"\"cd\2\u01ba\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\ty\3\2\2\2\13{\3\2"+
		"\2\2\r}\3\2\2\2\17\177\3\2\2\2\21\u0081\3\2\2\2\23\u0083\3\2\2\2\25\u008a"+
		"\3\2\2\2\27\u008c\3\2\2\2\31\u008e\3\2\2\2\33\u0090\3\2\2\2\35\u0092\3"+
		"\2\2\2\37\u0094\3\2\2\2!\u009c\3\2\2\2#\u009e\3\2\2\2%\u00a0\3\2\2\2\'"+
		"\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00a9\3\2\2\2-\u00ac\3\2\2\2/\u00af\3\2"+
		"\2\2\61\u00b4\3\2\2\2\63\u00b8\3\2\2\2\65\u00cc\3\2\2\2\67\u00dc\3\2\2"+
		"\29\u00de\3\2\2\2;\u00e3\3\2\2\2=\u00e6\3\2\2\2?\u00e9\3\2\2\2A\u00f4"+
		"\3\2\2\2C\u0100\3\2\2\2E\u0118\3\2\2\2G\u011a\3\2\2\2I\u0120\3\2\2\2K"+
		"\u012a\3\2\2\2M\u0131\3\2\2\2O\u0136\3\2\2\2Q\u013a\3\2\2\2S\u0141\3\2"+
		"\2\2U\u0148\3\2\2\2W\u014e\3\2\2\2Y\u0153\3\2\2\2[\u0161\3\2\2\2]\u0167"+
		"\3\2\2\2_\u0169\3\2\2\2a\u0172\3\2\2\2c\u0174\3\2\2\2e\u017c\3\2\2\2g"+
		"\u0180\3\2\2\2i\u0186\3\2\2\2k\u0191\3\2\2\2m\u0193\3\2\2\2o\u019c\3\2"+
		"\2\2q\u01a7\3\2\2\2st\7-\2\2t\4\3\2\2\2uv\7/\2\2v\6\3\2\2\2wx\7,\2\2x"+
		"\b\3\2\2\2yz\7\61\2\2z\n\3\2\2\2{|\t\2\2\2|\f\3\2\2\2}~\t\3\2\2~\16\3"+
		"\2\2\2\177\u0080\t\4\2\2\u0080\20\3\2\2\2\u0081\u0082\t\5\2\2\u0082\22"+
		"\3\2\2\2\u0083\u0084\7o\2\2\u0084\u0085\7q\2\2\u0085\u0086\7f\2\2\u0086"+
		"\u0087\7w\2\2\u0087\u0088\7n\2\2\u0088\u0089\7g\2\2\u0089\24\3\2\2\2\u008a"+
		"\u008b\7}\2\2\u008b\26\3\2\2\2\u008c\u008d\7\177\2\2\u008d\30\3\2\2\2"+
		"\u008e\u008f\7*\2\2\u008f\32\3\2\2\2\u0090\u0091\7+\2\2\u0091\34\3\2\2"+
		"\2\u0092\u0093\7.\2\2\u0093\36\3\2\2\2\u0094\u0095\7<\2\2\u0095 \3\2\2"+
		"\2\u0096\u0097\7n\2\2\u0097\u0098\7g\2\2\u0098\u009d\7v\2\2\u0099\u009a"+
		"\7N\2\2\u009a\u009b\7G\2\2\u009b\u009d\7V\2\2\u009c\u0096\3\2\2\2\u009c"+
		"\u0099\3\2\2\2\u009d\"\3\2\2\2\u009e\u009f\7?\2\2\u009f$\3\2\2\2\u00a0"+
		"\u00a1\7r\2\2\u00a1\u00a2\7m\2\2\u00a2\u00a3\7i\2\2\u00a3&\3\2\2\2\u00a4"+
		"\u00a5\7=\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7%\2\2\u00a7\u00a8\7%\2\2\u00a8"+
		"*\3\2\2\2\u00a9\u00aa\7%\2\2\u00aa\u00ab\7]\2\2\u00ab,\3\2\2\2\u00ac\u00ad"+
		"\7_\2\2\u00ad\u00ae\7%\2\2\u00ae.\3\2\2\2\u00af\u00b0\7x\2\2\u00b0\u00b1"+
		"\7q\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7f\2\2\u00b3\60\3\2\2\2\u00b4\u00b5"+
		"\7f\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7h\2\2\u00b7\62\3\2\2\2\u00b8\u00b9"+
		"\7e\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7u\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7e\2\2"+
		"\u00c0\u00c1\7v\2\2\u00c1\64\3\2\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7"+
		"t\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6\u00cd\7v\2\2\u00c7\u00c8"+
		"\7R\2\2\u00c8\u00c9\7T\2\2\u00c9\u00ca\7K\2\2\u00ca\u00cb\7P\2\2\u00cb"+
		"\u00cd\7V\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd\66\3\2\2\2"+
		"\u00ce\u00cf\7t\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7s\2\2\u00d1\u00d2"+
		"\7w\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7t\2\2\u00d4\u00dd\7g\2\2\u00d5"+
		"\u00d6\7T\2\2\u00d6\u00d7\7G\2\2\u00d7\u00d8\7S\2\2\u00d8\u00d9\7W\2\2"+
		"\u00d9\u00da\7K\2\2\u00da\u00db\7T\2\2\u00db\u00dd\7G\2\2\u00dc\u00ce"+
		"\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dd8\3\2\2\2\u00de\u00df\7u\2\2\u00df\u00e0"+
		"\7v\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7e\2\2\u00e2:\3\2\2\2\u00e3\u00e4"+
		"\7/\2\2\u00e4\u00e5\7@\2\2\u00e5<\3\2\2\2\u00e6\u00e7\7?\2\2\u00e7\u00e8"+
		"\7@\2\2\u00e8>\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec"+
		"\7k\2\2\u00ec\u00ed\7v\2\2\u00ed@\3\2\2\2\u00ee\u00ef\7x\2\2\u00ef\u00f0"+
		"\7c\2\2\u00f0\u00f5\7n\2\2\u00f1\u00f2\7X\2\2\u00f2\u00f3\7C\2\2\u00f3"+
		"\u00f5\7N\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5B\3\2\2\2\u00f6"+
		"\u00f7\7e\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7u\2\2"+
		"\u00fa\u0101\7v\2\2\u00fb\u00fc\7E\2\2\u00fc\u00fd\7Q\2\2\u00fd\u00fe"+
		"\7P\2\2\u00fe\u00ff\7U\2\2\u00ff\u0101\7V\2\2\u0100\u00f6\3\2\2\2\u0100"+
		"\u00fb\3\2\2\2\u0101D\3\2\2\2\u0102\u0103\7v\2\2\u0103\u0104\7t\2\2\u0104"+
		"\u0105\7p\2\2\u0105\u0119\7u\2\2\u0106\u0107\7v\2\2\u0107\u0108\7t\2\2"+
		"\u0108\u0109\7c\2\2\u0109\u010a\7p\2\2\u010a\u010b\7u\2\2\u010b\u010c"+
		"\7k\2\2\u010c\u010d\7g\2\2\u010d\u010e\7p\2\2\u010e\u0119\7v\2\2\u010f"+
		"\u0110\7V\2\2\u0110\u0111\7T\2\2\u0111\u0112\7C\2\2\u0112\u0113\7P\2\2"+
		"\u0113\u0114\7U\2\2\u0114\u0115\7K\2\2\u0115\u0116\7G\2\2\u0116\u0117"+
		"\7P\2\2\u0117\u0119\7V\2\2\u0118\u0102\3\2\2\2\u0118\u0106\3\2\2\2\u0118"+
		"\u010f\3\2\2\2\u0119F\3\2\2\2\u011a\u011b\7u\2\2\u011b\u011c\7v\2\2\u011c"+
		"\u011d\7x\2\2\u011d\u011e\7c\2\2\u011e\u011f\7n\2\2\u011fH\3\2\2\2\u0120"+
		"\u0121\7u\2\2\u0121\u0122\7v\2\2\u0122\u0123\7t\2\2\u0123\u0124\7w\2\2"+
		"\u0124\u0125\7e\2\2\u0125\u0126\7v\2\2\u0126\u0127\7f\2\2\u0127\u0128"+
		"\7g\2\2\u0128\u0129\7h\2\2\u0129J\3\2\2\2\u012a\u012b\7u\2\2\u012b\u012c"+
		"\7v\2\2\u012c\u012d\7t\2\2\u012d\u012e\7w\2\2\u012e\u012f\7e\2\2\u012f"+
		"\u0130\7v\2\2\u0130L\3\2\2\2\u0131\u0132\7e\2\2\u0132\u0133\7j\2\2\u0133"+
		"\u0134\7c\2\2\u0134\u0135\7t\2\2\u0135N\3\2\2\2\u0136\u0137\7k\2\2\u0137"+
		"\u0138\7p\2\2\u0138\u0139\7v\2\2\u0139P\3\2\2\2\u013a\u013b\7U\2\2\u013b"+
		"\u013c\7v\2\2\u013c\u013d\7t\2\2\u013d\u013e\7k\2\2\u013e\u013f\7p\2\2"+
		"\u013f\u0140\7i\2\2\u0140R\3\2\2\2\u0141\u0142\7f\2\2\u0142\u0143\7q\2"+
		"\2\u0143\u0144\7w\2\2\u0144\u0145\7d\2\2\u0145\u0146\7n\2\2\u0146\u0147"+
		"\7g\2\2\u0147T\3\2\2\2\u0148\u0149\7h\2\2\u0149\u014a\7n\2\2\u014a\u014b"+
		"\7q\2\2\u014b\u014c\7c\2\2\u014c\u014d\7v\2\2\u014dV\3\2\2\2\u014e\u014f"+
		"\7d\2\2\u014f\u0150\7{\2\2\u0150\u0151\7v\2\2\u0151\u0152\7g\2\2\u0152"+
		"X\3\2\2\2\u0153\u0154\7u\2\2\u0154\u0155\7g\2\2\u0155\u0156\7t\2\2\u0156"+
		"\u0157\7k\2\2\u0157\u0158\7c\2\2\u0158\u0159\7n\2\2\u0159\u015a\7k\2\2"+
		"\u015a\u015b\7|\2\2\u015b\u015c\7c\2\2\u015c\u015d\7d\2\2\u015d\u015e"+
		"\7n\2\2\u015e\u015f\7g\2\2\u015fZ\3\2\2\2\u0160\u0162\5\r\7\2\u0161\u0160"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\\\3\2\2\2\u0165\u0168\5\13\6\2\u0166\u0168\7a\2\2\u0167\u0165\3\2\2\2"+
		"\u0167\u0166\3\2\2\2\u0168^\3\2\2\2\u0169\u016c\5\13\6\2\u016a\u016d\5"+
		"]/\2\u016b\u016d\5\r\7\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f`\3\2\2\2"+
		"\u0170\u0173\5]/\2\u0171\u0173\5\17\b\2\u0172\u0170\3\2\2\2\u0172\u0171"+
		"\3\2\2\2\u0173b\3\2\2\2\u0174\u0176\5\13\6\2\u0175\u0177\5a\61\2\u0176"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179d\3\2\2\2\u017a\u017d\5]/\2\u017b\u017d\5\21\t\2\u017c\u017a"+
		"\3\2\2\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017ff\3\2\2\2\u0180\u0182\7)\2\2\u0181\u0183\13\2\2\2"+
		"\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185"+
		"\7)\2\2\u0185h\3\2\2\2\u0186\u0187\7$\2\2\u0187\u0188\7$\2\2\u0188j\3"+
		"\2\2\2\u0189\u018b\7$\2\2\u018a\u018c\13\2\2\2\u018b\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0192\7$\2\2\u0190\u0192\5i\65\2\u0191\u0189\3\2\2\2\u0191"+
		"\u0190\3\2\2\2\u0192l\3\2\2\2\u0193\u0197\5)\25\2\u0194\u0196\n\6\2\2"+
		"\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\b\67\2\2"+
		"\u019bn\3\2\2\2\u019c\u01a0\5+\26\2\u019d\u019f\13\2\2\2\u019e\u019d\3"+
		"\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1"+
		"\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\5-\27\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a6\b8\2\2\u01a6p\3\2\2\2\u01a7\u01a8\t\7\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\u01aa\b9\3\2\u01aar\3\2\2\2\26\2\u009c\u00cc\u00dc\u00f4"+
		"\u0100\u0118\u0163\u0167\u016c\u016e\u0172\u0178\u017c\u017e\u0182\u018d"+
		"\u0191\u0197\u01a0\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}