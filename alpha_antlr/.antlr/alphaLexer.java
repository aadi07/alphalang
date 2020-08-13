// Generated from /Users/aadi/projects/alpha_lang/alpha_antlr/alpha.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, REFERENCE=9, 
		STRING=10, NUMBER=11, PLUS=12, MINUS=13, TIMES=14, DIVIDE=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "REFERENCE", 
			"STRING", "NUMBER", "PLUS", "MINUS", "TIMES", "DIVIDE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Assign '", "' to '", "' as a'", "'n integer'", "' float'", "'.'", 
			"' '", "'Print '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "REFERENCE", "STRING", 
			"NUMBER", "PLUS", "MINUS", "TIMES", "DIVIDE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00b7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\6\13e\n\13\r\13\16\13f"+
		"\3\13\3\13\3\f\7\fl\n\f\f\f\16\fo\13\f\3\f\3\f\6\fs\n\f\r\f\16\ft\3\f"+
		"\6\fx\n\f\r\f\16\fy\5\f|\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0083\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u008b\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00a0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00af\n\20\3\21\6\21\u00b2\n\21\r\21\16\21\u00b3\3\21\3\21"+
		"\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22\3\2\5\4\2$$^^\3\2\62;\5\2\13\f\17\17\"\"\2\u00c2\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2"+
		"\5+\3\2\2\2\7\60\3\2\2\2\t\66\3\2\2\2\13@\3\2\2\2\rG\3\2\2\2\17I\3\2\2"+
		"\2\21K\3\2\2\2\23R\3\2\2\2\25b\3\2\2\2\27{\3\2\2\2\31\u0082\3\2\2\2\33"+
		"\u008a\3\2\2\2\35\u009f\3\2\2\2\37\u00ae\3\2\2\2!\u00b1\3\2\2\2#$\7C\2"+
		"\2$%\7u\2\2%&\7u\2\2&\'\7k\2\2\'(\7i\2\2()\7p\2\2)*\7\"\2\2*\4\3\2\2\2"+
		"+,\7\"\2\2,-\7v\2\2-.\7q\2\2./\7\"\2\2/\6\3\2\2\2\60\61\7\"\2\2\61\62"+
		"\7c\2\2\62\63\7u\2\2\63\64\7\"\2\2\64\65\7c\2\2\65\b\3\2\2\2\66\67\7p"+
		"\2\2\678\7\"\2\289\7k\2\29:\7p\2\2:;\7v\2\2;<\7g\2\2<=\7i\2\2=>\7g\2\2"+
		">?\7t\2\2?\n\3\2\2\2@A\7\"\2\2AB\7h\2\2BC\7n\2\2CD\7q\2\2DE\7c\2\2EF\7"+
		"v\2\2F\f\3\2\2\2GH\7\60\2\2H\16\3\2\2\2IJ\7\"\2\2J\20\3\2\2\2KL\7R\2\2"+
		"LM\7t\2\2MN\7k\2\2NO\7p\2\2OP\7v\2\2PQ\7\"\2\2Q\22\3\2\2\2RS\7v\2\2ST"+
		"\7j\2\2TU\7g\2\2UV\7\"\2\2VW\7x\2\2WX\7c\2\2XY\7n\2\2YZ\7w\2\2Z[\7g\2"+
		"\2[\\\7\"\2\2\\]\7q\2\2]^\7h\2\2^_\7\"\2\2_`\3\2\2\2`a\5\25\13\2a\24\3"+
		"\2\2\2bd\7$\2\2ce\n\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3"+
		"\2\2\2hi\7$\2\2i\26\3\2\2\2jl\t\3\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn"+
		"\3\2\2\2np\3\2\2\2om\3\2\2\2pr\7\60\2\2qs\t\3\2\2rq\3\2\2\2st\3\2\2\2"+
		"tr\3\2\2\2tu\3\2\2\2u|\3\2\2\2vx\t\3\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2"+
		"yz\3\2\2\2z|\3\2\2\2{m\3\2\2\2{w\3\2\2\2|\30\3\2\2\2}\u0083\7-\2\2~\177"+
		"\7r\2\2\177\u0080\7n\2\2\u0080\u0081\7w\2\2\u0081\u0083\7u\2\2\u0082}"+
		"\3\2\2\2\u0082~\3\2\2\2\u0083\32\3\2\2\2\u0084\u008b\7/\2\2\u0085\u0086"+
		"\7o\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7w\2\2\u0089"+
		"\u008b\7u\2\2\u008a\u0084\3\2\2\2\u008a\u0085\3\2\2\2\u008b\34\3\2\2\2"+
		"\u008c\u00a0\7,\2\2\u008d\u008e\7v\2\2\u008e\u008f\7k\2\2\u008f\u0090"+
		"\7o\2\2\u0090\u0091\7g\2\2\u0091\u00a0\7u\2\2\u0092\u0093\7o\2\2\u0093"+
		"\u0094\7w\2\2\u0094\u0095\7n\2\2\u0095\u0096\7v\2\2\u0096\u0097\7k\2\2"+
		"\u0097\u0098\7r\2\2\u0098\u0099\7n\2\2\u0099\u009a\7k\2\2\u009a\u009b"+
		"\7g\2\2\u009b\u009c\7f\2\2\u009c\u009d\7\"\2\2\u009d\u009e\7d\2\2\u009e"+
		"\u00a0\7{\2\2\u009f\u008c\3\2\2\2\u009f\u008d\3\2\2\2\u009f\u0092\3\2"+
		"\2\2\u00a0\36\3\2\2\2\u00a1\u00af\7\61\2\2\u00a2\u00a3\7d\2\2\u00a3\u00af"+
		"\7{\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7x\2\2\u00a7"+
		"\u00a8\7k\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7f\2\2"+
		"\u00ab\u00ac\7\"\2\2\u00ac\u00ad\7d\2\2\u00ad\u00af\7{\2\2\u00ae\u00a1"+
		"\3\2\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00a4\3\2\2\2\u00af \3\2\2\2\u00b0"+
		"\u00b2\t\4\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\21\2\2\u00b6"+
		"\"\3\2\2\2\r\2fmty{\u0082\u008a\u009f\u00ae\u00b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}