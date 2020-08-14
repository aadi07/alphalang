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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, STRING=16, 
		NUMBER=17, PLUS=18, MINUS=19, TIMES=20, DIVIDE=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "STRING", "NUMBER", 
			"PLUS", "MINUS", "TIMES", "DIVIDE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'Assign '", "' to '", "' as '", "'an integer'", "'a float'", 
			"'a string'", "'Print '", "'Define '", "' on '", "' as:'", "','", "'Call '", 
			"' and '", "'the value of '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "STRING", "NUMBER", "PLUS", "MINUS", "TIMES", 
			"DIVIDE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00fe\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\6\21\u0097\n\21\r\21\16\21\u0098\3\21\3\21\3\22\7\22\u009e"+
		"\n\22\f\22\16\22\u00a1\13\22\3\22\3\22\6\22\u00a5\n\22\r\22\16\22\u00a6"+
		"\3\22\6\22\u00aa\n\22\r\22\16\22\u00ab\5\22\u00ae\n\22\3\23\5\23\u00b1"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b8\n\23\3\23\5\23\u00bb\n\23\3"+
		"\24\5\24\u00be\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c6\n\24\3\24"+
		"\5\24\u00c9\n\24\3\25\5\25\u00cc\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e1"+
		"\n\25\3\25\5\25\u00e4\n\25\3\26\5\26\u00e7\n\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f6\n\26\3\26\5\26"+
		"\u00f9\n\26\3\27\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"\3\2\5\3\2$$\3\2\62;\5\2\13\f\17\17\"\"\2\u0110\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\79\3\2"+
		"\2\2\t>\3\2\2\2\13C\3\2\2\2\rN\3\2\2\2\17V\3\2\2\2\21_\3\2\2\2\23f\3\2"+
		"\2\2\25n\3\2\2\2\27s\3\2\2\2\31x\3\2\2\2\33z\3\2\2\2\35\u0080\3\2\2\2"+
		"\37\u0086\3\2\2\2!\u0094\3\2\2\2#\u00ad\3\2\2\2%\u00b0\3\2\2\2\'\u00bd"+
		"\3\2\2\2)\u00cb\3\2\2\2+\u00e6\3\2\2\2-\u00fa\3\2\2\2/\60\7\60\2\2\60"+
		"\4\3\2\2\2\61\62\7C\2\2\62\63\7u\2\2\63\64\7u\2\2\64\65\7k\2\2\65\66\7"+
		"i\2\2\66\67\7p\2\2\678\7\"\2\28\6\3\2\2\29:\7\"\2\2:;\7v\2\2;<\7q\2\2"+
		"<=\7\"\2\2=\b\3\2\2\2>?\7\"\2\2?@\7c\2\2@A\7u\2\2AB\7\"\2\2B\n\3\2\2\2"+
		"CD\7c\2\2DE\7p\2\2EF\7\"\2\2FG\7k\2\2GH\7p\2\2HI\7v\2\2IJ\7g\2\2JK\7i"+
		"\2\2KL\7g\2\2LM\7t\2\2M\f\3\2\2\2NO\7c\2\2OP\7\"\2\2PQ\7h\2\2QR\7n\2\2"+
		"RS\7q\2\2ST\7c\2\2TU\7v\2\2U\16\3\2\2\2VW\7c\2\2WX\7\"\2\2XY\7u\2\2YZ"+
		"\7v\2\2Z[\7t\2\2[\\\7k\2\2\\]\7p\2\2]^\7i\2\2^\20\3\2\2\2_`\7R\2\2`a\7"+
		"t\2\2ab\7k\2\2bc\7p\2\2cd\7v\2\2de\7\"\2\2e\22\3\2\2\2fg\7F\2\2gh\7g\2"+
		"\2hi\7h\2\2ij\7k\2\2jk\7p\2\2kl\7g\2\2lm\7\"\2\2m\24\3\2\2\2no\7\"\2\2"+
		"op\7q\2\2pq\7p\2\2qr\7\"\2\2r\26\3\2\2\2st\7\"\2\2tu\7c\2\2uv\7u\2\2v"+
		"w\7<\2\2w\30\3\2\2\2xy\7.\2\2y\32\3\2\2\2z{\7E\2\2{|\7c\2\2|}\7n\2\2}"+
		"~\7n\2\2~\177\7\"\2\2\177\34\3\2\2\2\u0080\u0081\7\"\2\2\u0081\u0082\7"+
		"c\2\2\u0082\u0083\7p\2\2\u0083\u0084\7f\2\2\u0084\u0085\7\"\2\2\u0085"+
		"\36\3\2\2\2\u0086\u0087\7v\2\2\u0087\u0088\7j\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u008a\7\"\2\2\u008a\u008b\7x\2\2\u008b\u008c\7c\2\2\u008c\u008d\7n\2"+
		"\2\u008d\u008e\7w\2\2\u008e\u008f\7g\2\2\u008f\u0090\7\"\2\2\u0090\u0091"+
		"\7q\2\2\u0091\u0092\7h\2\2\u0092\u0093\7\"\2\2\u0093 \3\2\2\2\u0094\u0096"+
		"\7$\2\2\u0095\u0097\n\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7$"+
		"\2\2\u009b\"\3\2\2\2\u009c\u009e\t\3\2\2\u009d\u009c\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a4\7\60\2\2\u00a3\u00a5\t\3\2\2\u00a4\u00a3\3"+
		"\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00ae\3\2\2\2\u00a8\u00aa\t\3\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u009f\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae$\3\2\2\2\u00af\u00b1\5-\27\2"+
		"\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b7\3\2\2\2\u00b2\u00b8"+
		"\7-\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7w\2\2\u00b6"+
		"\u00b8\7u\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\u00ba\3\2"+
		"\2\2\u00b9\u00bb\5-\27\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"&\3\2\2\2\u00bc\u00be\5-\27\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2"+
		"\u00be\u00c5\3\2\2\2\u00bf\u00c6\7/\2\2\u00c0\u00c1\7o\2\2\u00c1\u00c2"+
		"\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c6\7u\2\2\u00c5"+
		"\u00bf\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c9\5-"+
		"\27\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9(\3\2\2\2\u00ca\u00cc"+
		"\5-\27\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00e0\3\2\2\2\u00cd"+
		"\u00e1\7,\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7o\2\2"+
		"\u00d1\u00d2\7g\2\2\u00d2\u00e1\7u\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5"+
		"\7w\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7k\2\2\u00d8"+
		"\u00d9\7r\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7g\2\2"+
		"\u00dc\u00dd\7f\2\2\u00dd\u00de\7\"\2\2\u00de\u00df\7d\2\2\u00df\u00e1"+
		"\7{\2\2\u00e0\u00cd\3\2\2\2\u00e0\u00ce\3\2\2\2\u00e0\u00d3\3\2\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00e4\5-\27\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4*\3\2\2\2\u00e5\u00e7\5-\27\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00f5\3\2\2\2\u00e8\u00f6\7\61\2\2\u00e9\u00ea\7f\2\2\u00ea"+
		"\u00eb\7k\2\2\u00eb\u00ec\7x\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7f\2\2"+
		"\u00ee\u00ef\7g\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7\"\2\2\u00f1\u00f2"+
		"\7d\2\2\u00f2\u00f6\7{\2\2\u00f3\u00f4\7d\2\2\u00f4\u00f6\7{\2\2\u00f5"+
		"\u00e8\3\2\2\2\u00f5\u00e9\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00f9\5-\27\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		",\3\2\2\2\u00fa\u00fb\t\4\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\b\27\2\2"+
		"\u00fd.\3\2\2\2\24\2\u0098\u009f\u00a6\u00ab\u00ad\u00b0\u00b7\u00ba\u00bd"+
		"\u00c5\u00c8\u00cb\u00e0\u00e3\u00e6\u00f5\u00f8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}