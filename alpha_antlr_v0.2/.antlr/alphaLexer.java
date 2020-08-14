// Generated from /Users/aadi/projects/alpha_lang/alpha_antlr_v0.2/alpha.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alphaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		STRING=18, NUMBER=19, PLUS=20, MINUS=21, TIMES=22, DIVIDE=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"STRING", "NUMBER", "PLUS", "MINUS", "TIMES", "DIVIDE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'Assign '", "' to '", "' as '", "'an integer'", "'a float'", 
			"'a string'", "'Print '", "'Define '", "' on '", "' as:'", "','", "'Call '", 
			"'Return '", "' and '", "'the value of '", "'the result of calling '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "STRING", "NUMBER", "PLUS", "MINUS", 
			"TIMES", "DIVIDE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public alphaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "alpha.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0121\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\6\23\u00ba\n\23\r\23\16"+
		"\23\u00bb\3\23\3\23\3\24\7\24\u00c1\n\24\f\24\16\24\u00c4\13\24\3\24\3"+
		"\24\6\24\u00c8\n\24\r\24\16\24\u00c9\3\24\6\24\u00cd\n\24\r\24\16\24\u00ce"+
		"\5\24\u00d1\n\24\3\25\5\25\u00d4\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u00db"+
		"\n\25\3\25\5\25\u00de\n\25\3\26\5\26\u00e1\n\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u00e9\n\26\3\26\5\26\u00ec\n\26\3\27\5\27\u00ef\n\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0104\n\27\3\27\5\27\u0107\n\27\3\30\5\30\u010a"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0119\n\30\3\30\5\30\u011c\n\30\3\31\3\31\3\31\3\31\2\2\32\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\5\3\2$$\3\2\62;\5\2\13\f\17"+
		"\17\"\"\2\u0133\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7=\3\2\2\2\tB\3"+
		"\2\2\2\13G\3\2\2\2\rR\3\2\2\2\17Z\3\2\2\2\21c\3\2\2\2\23j\3\2\2\2\25r"+
		"\3\2\2\2\27w\3\2\2\2\31|\3\2\2\2\33~\3\2\2\2\35\u0084\3\2\2\2\37\u008c"+
		"\3\2\2\2!\u0092\3\2\2\2#\u00a0\3\2\2\2%\u00b7\3\2\2\2\'\u00d0\3\2\2\2"+
		")\u00d3\3\2\2\2+\u00e0\3\2\2\2-\u00ee\3\2\2\2/\u0109\3\2\2\2\61\u011d"+
		"\3\2\2\2\63\64\7\60\2\2\64\4\3\2\2\2\65\66\7C\2\2\66\67\7u\2\2\678\7u"+
		"\2\289\7k\2\29:\7i\2\2:;\7p\2\2;<\7\"\2\2<\6\3\2\2\2=>\7\"\2\2>?\7v\2"+
		"\2?@\7q\2\2@A\7\"\2\2A\b\3\2\2\2BC\7\"\2\2CD\7c\2\2DE\7u\2\2EF\7\"\2\2"+
		"F\n\3\2\2\2GH\7c\2\2HI\7p\2\2IJ\7\"\2\2JK\7k\2\2KL\7p\2\2LM\7v\2\2MN\7"+
		"g\2\2NO\7i\2\2OP\7g\2\2PQ\7t\2\2Q\f\3\2\2\2RS\7c\2\2ST\7\"\2\2TU\7h\2"+
		"\2UV\7n\2\2VW\7q\2\2WX\7c\2\2XY\7v\2\2Y\16\3\2\2\2Z[\7c\2\2[\\\7\"\2\2"+
		"\\]\7u\2\2]^\7v\2\2^_\7t\2\2_`\7k\2\2`a\7p\2\2ab\7i\2\2b\20\3\2\2\2cd"+
		"\7R\2\2de\7t\2\2ef\7k\2\2fg\7p\2\2gh\7v\2\2hi\7\"\2\2i\22\3\2\2\2jk\7"+
		"F\2\2kl\7g\2\2lm\7h\2\2mn\7k\2\2no\7p\2\2op\7g\2\2pq\7\"\2\2q\24\3\2\2"+
		"\2rs\7\"\2\2st\7q\2\2tu\7p\2\2uv\7\"\2\2v\26\3\2\2\2wx\7\"\2\2xy\7c\2"+
		"\2yz\7u\2\2z{\7<\2\2{\30\3\2\2\2|}\7.\2\2}\32\3\2\2\2~\177\7E\2\2\177"+
		"\u0080\7c\2\2\u0080\u0081\7n\2\2\u0081\u0082\7n\2\2\u0082\u0083\7\"\2"+
		"\2\u0083\34\3\2\2\2\u0084\u0085\7T\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7v\2\2\u0087\u0088\7w\2\2\u0088\u0089\7t\2\2\u0089\u008a\7p\2\2\u008a"+
		"\u008b\7\"\2\2\u008b\36\3\2\2\2\u008c\u008d\7\"\2\2\u008d\u008e\7c\2\2"+
		"\u008e\u008f\7p\2\2\u008f\u0090\7f\2\2\u0090\u0091\7\"\2\2\u0091 \3\2"+
		"\2\2\u0092\u0093\7v\2\2\u0093\u0094\7j\2\2\u0094\u0095\7g\2\2\u0095\u0096"+
		"\7\"\2\2\u0096\u0097\7x\2\2\u0097\u0098\7c\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7w\2\2\u009a\u009b\7g\2\2\u009b\u009c\7\"\2\2\u009c\u009d\7q\2"+
		"\2\u009d\u009e\7h\2\2\u009e\u009f\7\"\2\2\u009f\"\3\2\2\2\u00a0\u00a1"+
		"\7v\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7\"\2\2\u00a4"+
		"\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7w\2\2"+
		"\u00a8\u00a9\7n\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac"+
		"\7q\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\7e\2\2\u00af"+
		"\u00b0\7c\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7k\2\2"+
		"\u00b3\u00b4\7p\2\2\u00b4\u00b5\7i\2\2\u00b5\u00b6\7\"\2\2\u00b6$\3\2"+
		"\2\2\u00b7\u00b9\7$\2\2\u00b8\u00ba\n\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\7$\2\2\u00be&\3\2\2\2\u00bf\u00c1\t\3\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\7\60\2\2\u00c6\u00c8\t"+
		"\3\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00d1\3\2\2\2\u00cb\u00cd\t\3\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00c2\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1(\3\2\2\2"+
		"\u00d2\u00d4\5\61\31\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00da"+
		"\3\2\2\2\u00d5\u00db\7-\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8\7n\2\2\u00d8"+
		"\u00d9\7w\2\2\u00d9\u00db\7u\2\2\u00da\u00d5\3\2\2\2\u00da\u00d6\3\2\2"+
		"\2\u00db\u00dd\3\2\2\2\u00dc\u00de\5\61\31\2\u00dd\u00dc\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de*\3\2\2\2\u00df\u00e1\5\61\31\2\u00e0\u00df\3\2\2"+
		"\2\u00e0\u00e1\3\2\2\2\u00e1\u00e8\3\2\2\2\u00e2\u00e9\7/\2\2\u00e3\u00e4"+
		"\7o\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7w\2\2\u00e7"+
		"\u00e9\7u\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9\u00eb\3\2"+
		"\2\2\u00ea\u00ec\5\61\31\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		",\3\2\2\2\u00ed\u00ef\5\61\31\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2"+
		"\2\u00ef\u0103\3\2\2\2\u00f0\u0104\7,\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3"+
		"\7k\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7g\2\2\u00f5\u0104\7u\2\2\u00f6"+
		"\u00f7\7o\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7v\2\2"+
		"\u00fa\u00fb\7k\2\2\u00fb\u00fc\7r\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe"+
		"\7k\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7f\2\2\u0100\u0101\7\"\2\2\u0101"+
		"\u0102\7d\2\2\u0102\u0104\7{\2\2\u0103\u00f0\3\2\2\2\u0103\u00f1\3\2\2"+
		"\2\u0103\u00f6\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0107\5\61\31\2\u0106"+
		"\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107.\3\2\2\2\u0108\u010a\5\61\31"+
		"\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0118\3\2\2\2\u010b\u0119"+
		"\7\61\2\2\u010c\u010d\7f\2\2\u010d\u010e\7k\2\2\u010e\u010f\7x\2\2\u010f"+
		"\u0110\7k\2\2\u0110\u0111\7f\2\2\u0111\u0112\7g\2\2\u0112\u0113\7f\2\2"+
		"\u0113\u0114\7\"\2\2\u0114\u0115\7d\2\2\u0115\u0119\7{\2\2\u0116\u0117"+
		"\7d\2\2\u0117\u0119\7{\2\2\u0118\u010b\3\2\2\2\u0118\u010c\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u011c\5\61\31\2\u011b\u011a\3"+
		"\2\2\2\u011b\u011c\3\2\2\2\u011c\60\3\2\2\2\u011d\u011e\t\4\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\b\31\2\2\u0120\62\3\2\2\2\24\2\u00bb\u00c2"+
		"\u00c9\u00ce\u00d0\u00d3\u00da\u00dd\u00e0\u00e8\u00eb\u00ee\u0103\u0106"+
		"\u0109\u0118\u011b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}