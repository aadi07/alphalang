// Generated from /Users/aadi/projects/alpha_lang/alpha_antlr_v0.1/alpha.g4 by ANTLR 4.8
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, REFERENCE=17, 
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
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "REFERENCE", 
			"STRING", "NUMBER", "PLUS", "MINUS", "TIMES", "DIVIDE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "' '", "'Assign '", "' to '", "' as a'", "'n integer'", 
			"' float'", "' string'", "'Print '", "'Call '", "' on'", "'the result of calling '", 
			"'Define '", "' as:'", "','", "' and '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "REFERENCE", "STRING", "NUMBER", "PLUS", 
			"MINUS", "TIMES", "DIVIDE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0124\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cc\n\22"+
		"\5\22\u00ce\n\22\3\23\3\23\6\23\u00d2\n\23\r\23\16\23\u00d3\3\23\3\23"+
		"\3\24\7\24\u00d9\n\24\f\24\16\24\u00dc\13\24\3\24\3\24\6\24\u00e0\n\24"+
		"\r\24\16\24\u00e1\3\24\6\24\u00e5\n\24\r\24\16\24\u00e6\5\24\u00e9\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00f0\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00f8\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010d\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u011c\n\30\3\31"+
		"\6\31\u011f\n\31\r\31\16\31\u0120\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\3\2\5\3\2$$\3\2\62;\5\2\13\f\17\17\"\"\2\u0132"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t?\3\2\2\2\13D"+
		"\3\2\2\2\rJ\3\2\2\2\17T\3\2\2\2\21[\3\2\2\2\23c\3\2\2\2\25j\3\2\2\2\27"+
		"p\3\2\2\2\31t\3\2\2\2\33\u008b\3\2\2\2\35\u0093\3\2\2\2\37\u0098\3\2\2"+
		"\2!\u009a\3\2\2\2#\u00a0\3\2\2\2%\u00cf\3\2\2\2\'\u00e8\3\2\2\2)\u00ef"+
		"\3\2\2\2+\u00f7\3\2\2\2-\u010c\3\2\2\2/\u011b\3\2\2\2\61\u011e\3\2\2\2"+
		"\63\64\7\60\2\2\64\4\3\2\2\2\65\66\7\"\2\2\66\6\3\2\2\2\678\7C\2\289\7"+
		"u\2\29:\7u\2\2:;\7k\2\2;<\7i\2\2<=\7p\2\2=>\7\"\2\2>\b\3\2\2\2?@\7\"\2"+
		"\2@A\7v\2\2AB\7q\2\2BC\7\"\2\2C\n\3\2\2\2DE\7\"\2\2EF\7c\2\2FG\7u\2\2"+
		"GH\7\"\2\2HI\7c\2\2I\f\3\2\2\2JK\7p\2\2KL\7\"\2\2LM\7k\2\2MN\7p\2\2NO"+
		"\7v\2\2OP\7g\2\2PQ\7i\2\2QR\7g\2\2RS\7t\2\2S\16\3\2\2\2TU\7\"\2\2UV\7"+
		"h\2\2VW\7n\2\2WX\7q\2\2XY\7c\2\2YZ\7v\2\2Z\20\3\2\2\2[\\\7\"\2\2\\]\7"+
		"u\2\2]^\7v\2\2^_\7t\2\2_`\7k\2\2`a\7p\2\2ab\7i\2\2b\22\3\2\2\2cd\7R\2"+
		"\2de\7t\2\2ef\7k\2\2fg\7p\2\2gh\7v\2\2hi\7\"\2\2i\24\3\2\2\2jk\7E\2\2"+
		"kl\7c\2\2lm\7n\2\2mn\7n\2\2no\7\"\2\2o\26\3\2\2\2pq\7\"\2\2qr\7q\2\2r"+
		"s\7p\2\2s\30\3\2\2\2tu\7v\2\2uv\7j\2\2vw\7g\2\2wx\7\"\2\2xy\7t\2\2yz\7"+
		"g\2\2z{\7u\2\2{|\7w\2\2|}\7n\2\2}~\7v\2\2~\177\7\"\2\2\177\u0080\7q\2"+
		"\2\u0080\u0081\7h\2\2\u0081\u0082\7\"\2\2\u0082\u0083\7e\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7n\2\2\u0085\u0086\7n\2\2\u0086\u0087\7k\2\2\u0087"+
		"\u0088\7p\2\2\u0088\u0089\7i\2\2\u0089\u008a\7\"\2\2\u008a\32\3\2\2\2"+
		"\u008b\u008c\7F\2\2\u008c\u008d\7g\2\2\u008d\u008e\7h\2\2\u008e\u008f"+
		"\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091\7g\2\2\u0091\u0092\7\"\2\2\u0092"+
		"\34\3\2\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7c\2\2\u0095\u0096\7u\2\2"+
		"\u0096\u0097\7<\2\2\u0097\36\3\2\2\2\u0098\u0099\7.\2\2\u0099 \3\2\2\2"+
		"\u009a\u009b\7\"\2\2\u009b\u009c\7c\2\2\u009c\u009d\7p\2\2\u009d\u009e"+
		"\7f\2\2\u009e\u009f\7\"\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2"+
		"\7j\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5\7x\2\2\u00a5"+
		"\u00a6\7c\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7g\2\2"+
		"\u00a9\u00aa\7\"\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad"+
		"\7\"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00cd\5%\23\2\u00af\u00b0\7\"\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\7c\2"+
		"\2\u00b4\u00cb\3\2\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7i\2\2\u00bc\u00bd\7g\2\2\u00bd\u00cc\7t\2\2\u00be\u00bf\7\"\2"+
		"\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3"+
		"\7c\2\2\u00c3\u00cc\7v\2\2\u00c4\u00c5\7\"\2\2\u00c5\u00c6\7u\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7p\2\2"+
		"\u00ca\u00cc\7i\2\2\u00cb\u00b5\3\2\2\2\u00cb\u00be\3\2\2\2\u00cb\u00c4"+
		"\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00af\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"$\3\2\2\2\u00cf\u00d1\7$\2\2\u00d0\u00d2\n\2\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\7$\2\2\u00d6&\3\2\2\2\u00d7\u00d9\t\3\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\7\60\2\2\u00de\u00e0\t"+
		"\3\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e9\3\2\2\2\u00e3\u00e5\t\3\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00da\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9(\3\2\2\2"+
		"\u00ea\u00f0\7-\2\2\u00eb\u00ec\7r\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee"+
		"\7w\2\2\u00ee\u00f0\7u\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0"+
		"*\3\2\2\2\u00f1\u00f8\7/\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4\7k\2\2\u00f4"+
		"\u00f5\7p\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f8\7u\2\2\u00f7\u00f1\3\2\2"+
		"\2\u00f7\u00f2\3\2\2\2\u00f8,\3\2\2\2\u00f9\u010d\7,\2\2\u00fa\u00fb\7"+
		"v\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7o\2\2\u00fd\u00fe\7g\2\2\u00fe\u010d"+
		"\7u\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7w\2\2\u0101\u0102\7n\2\2\u0102"+
		"\u0103\7v\2\2\u0103\u0104\7k\2\2\u0104\u0105\7r\2\2\u0105\u0106\7n\2\2"+
		"\u0106\u0107\7k\2\2\u0107\u0108\7g\2\2\u0108\u0109\7f\2\2\u0109\u010a"+
		"\7\"\2\2\u010a\u010b\7d\2\2\u010b\u010d\7{\2\2\u010c\u00f9\3\2\2\2\u010c"+
		"\u00fa\3\2\2\2\u010c\u00ff\3\2\2\2\u010d.\3\2\2\2\u010e\u011c\7\61\2\2"+
		"\u010f\u0110\7d\2\2\u0110\u011c\7{\2\2\u0111\u0112\7f\2\2\u0112\u0113"+
		"\7k\2\2\u0113\u0114\7x\2\2\u0114\u0115\7k\2\2\u0115\u0116\7f\2\2\u0116"+
		"\u0117\7g\2\2\u0117\u0118\7f\2\2\u0118\u0119\7\"\2\2\u0119\u011a\7d\2"+
		"\2\u011a\u011c\7{\2\2\u011b\u010e\3\2\2\2\u011b\u010f\3\2\2\2\u011b\u0111"+
		"\3\2\2\2\u011c\60\3\2\2\2\u011d\u011f\t\4\2\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0123\b\31\2\2\u0123\62\3\2\2\2\17\2\u00cb\u00cd\u00d3\u00da"+
		"\u00e1\u00e6\u00e8\u00ef\u00f7\u010c\u011b\u0120\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}