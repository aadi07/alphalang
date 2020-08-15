// Generated from /Users/aadi/projects/alpha_lang/alpha_antlr_v0.3/alpha.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, MATH=3, BOOL=4, INTEGER=5, FLOAT=6, STRING=7, STRING_FACTOR=8, 
		STRING_LITERAL=9, BOOL_LITERAL=10, AND=11, OR=12, ADD=13, SUBTRACT=14, 
		MULTIPLY=15, DIVIDE=16, POWER=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "MATH", "BOOL", "INTEGER", "FLOAT", "STRING", "STRING_FACTOR", 
			"STRING_LITERAL", "BOOL_LITERAL", "AND", "OR", "ADD", "SUBTRACT", "MULTIPLY", 
			"DIVIDE", "POWER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'Print '", null, null, null, null, null, null, null, null, 
			"' and '", "' or '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "MATH", "BOOL", "INTEGER", "FLOAT", "STRING", "STRING_FACTOR", 
			"STRING_LITERAL", "BOOL_LITERAL", "AND", "OR", "ADD", "SUBTRACT", "MULTIPLY", 
			"DIVIDE", "POWER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0173\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\63\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4:\n\4\3\4\3\4\5\4>\n\4\7\4@\n\4\f\4\16\4C\13\4"+
		"\3\5\3\5\3\5\5\5H\n\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\6\6\6R\n\6\r\6"+
		"\16\6S\3\7\7\7W\n\7\f\7\16\7Z\13\7\3\7\3\7\6\7^\n\7\r\7\16\7_\3\b\3\b"+
		"\3\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\t\3\t\3\t\3\t\5\to\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\tv\n\t\3\n\3\n\6\nz\n\n\r\n\16\n{\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\5\13\u0084\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00ae\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0127"+
		"\n\13\3\13\3\13\5\13\u012b\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0141\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u014d\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0159\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0162\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u016e\n\22\3\23\3\23\3\23\3\23\2\2\24\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\3\2\5\3\2\62;\3\2$$\5\2\13\f\17\17\"\"\2\u0191\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\3\'\3\2\2\2\5)\3\2\2\2\7\62\3\2\2\2\tD\3\2\2\2\13Q\3\2\2\2\rX\3\2"+
		"\2\2\17a\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25\u0083\3\2\2\2\27\u012c\3\2"+
		"\2\2\31\u0132\3\2\2\2\33\u0140\3\2\2\2\35\u014c\3\2\2\2\37\u0158\3\2\2"+
		"\2!\u0161\3\2\2\2#\u016d\3\2\2\2%\u016f\3\2\2\2\'(\7\60\2\2(\4\3\2\2\2"+
		")*\7R\2\2*+\7t\2\2+,\7k\2\2,-\7p\2\2-.\7v\2\2./\7\"\2\2/\6\3\2\2\2\60"+
		"\63\5\13\6\2\61\63\5\r\7\2\62\60\3\2\2\2\62\61\3\2\2\2\63A\3\2\2\2\64"+
		":\5\33\16\2\65:\5\35\17\2\66:\5\37\20\2\67:\5!\21\28:\5#\22\29\64\3\2"+
		"\2\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:=\3\2\2\2;>\5\13\6"+
		"\2<>\5\r\7\2=;\3\2\2\2=<\3\2\2\2>@\3\2\2\2?9\3\2\2\2@C\3\2\2\2A?\3\2\2"+
		"\2AB\3\2\2\2B\b\3\2\2\2CA\3\2\2\2DM\5\25\13\2EH\5\27\f\2FH\5\31\r\2GE"+
		"\3\2\2\2GF\3\2\2\2HI\3\2\2\2IJ\5\25\13\2JL\3\2\2\2KG\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2N\n\3\2\2\2OM\3\2\2\2PR\t\2\2\2QP\3\2\2\2RS\3\2\2"+
		"\2SQ\3\2\2\2ST\3\2\2\2T\f\3\2\2\2UW\t\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2"+
		"\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[]\7\60\2\2\\^\t\2\2\2]\\\3\2\2\2^_"+
		"\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\16\3\2\2\2ag\5\21\t\2bc\5\33\16\2cd\5\21"+
		"\t\2df\3\2\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\20\3\2\2\2ig\3"+
		"\2\2\2jn\5\23\n\2kl\5\37\20\2lm\5\7\4\2mo\3\2\2\2nk\3\2\2\2no\3\2\2\2"+
		"ov\3\2\2\2pq\5\7\4\2qr\5\37\20\2rs\3\2\2\2st\5\23\n\2tv\3\2\2\2uj\3\2"+
		"\2\2up\3\2\2\2v\22\3\2\2\2wy\7$\2\2xz\n\3\2\2yx\3\2\2\2z{\3\2\2\2{y\3"+
		"\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7$\2\2~\24\3\2\2\2\177\u0080\7p\2\2\u0080"+
		"\u0081\7q\2\2\u0081\u0082\7v\2\2\u0082\u0084\7\"\2\2\u0083\177\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u012a\3\2\2\2\u0085\u0086\7v\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\7w\2\2\u0088\u012b\7g\2\2\u0089\u008a\7h\2\2\u008a"+
		"\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d\u012b\7g\2\2"+
		"\u008e\u00ad\5\17\b\2\u008f\u0090\7\"\2\2\u0090\u0091\7k\2\2\u0091\u0092"+
		"\7u\2\2\u0092\u0093\7\"\2\2\u0093\u0094\7g\2\2\u0094\u0095\7s\2\2\u0095"+
		"\u0096\7w\2\2\u0096\u0097\7c\2\2\u0097\u0098\7n\2\2\u0098\u0099\7\"\2"+
		"\2\u0099\u009a\7v\2\2\u009a\u009b\7q\2\2\u009b\u00ae\7\"\2\2\u009c\u009d"+
		"\7\"\2\2\u009d\u009e\7k\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7\"\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7\"\2"+
		"\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7s\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8"+
		"\7c\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\7v\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\u00ae\7\"\2\2\u00ad\u008f\3\2\2\2\u00ad\u009c\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\5\17\b\2\u00b0\u012b\3\2\2\2\u00b1"+
		"\u0126\5\7\4\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7u\2"+
		"\2\u00b5\u00b6\7\"\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7s\2\2\u00b8\u00b9"+
		"\7w\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7\"\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd\u00be\7q\2\2\u00be\u0127\7\"\2\2\u00bf\u00c0\7\"\2"+
		"\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7\"\2\2\u00c3\u00c4"+
		"\7p\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7\"\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7s\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7c\2\2"+
		"\u00cb\u00cc\7n\2\2\u00cc\u00cd\7\"\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf"+
		"\7q\2\2\u00cf\u0127\7\"\2\2\u00d0\u00d1\7\"\2\2\u00d1\u00d2\7k\2\2\u00d2"+
		"\u00d3\7u\2\2\u00d3\u00d4\7\"\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7g\2"+
		"\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7\"\2\2\u00d9\u00da"+
		"\7v\2\2\u00da\u00db\7j\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7p\2\2\u00dd"+
		"\u0127\7\"\2\2\u00de\u00df\7\"\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7u\2"+
		"\2\u00e1\u00e2\7\"\2\2\u00e2\u00e3\7i\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5"+
		"\7g\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7g\2\2\u00e8"+
		"\u00e9\7t\2\2\u00e9\u00ea\7\"\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7j\2"+
		"\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7p\2\2\u00ee\u0127\7\"\2\2\u00ef\u00f0"+
		"\7\"\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7\"\2\2\u00f3"+
		"\u00f4\7i\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7c\2\2"+
		"\u00f7\u00f8\7v\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb"+
		"\7\"\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7j\2\2\u00fd\u00fe\7c\2\2\u00fe"+
		"\u00ff\7p\2\2\u00ff\u0100\7\"\2\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2"+
		"\2\u0102\u0103\7\"\2\2\u0103\u0104\7g\2\2\u0104\u0105\7s\2\2\u0105\u0106"+
		"\7w\2\2\u0106\u0107\7c\2\2\u0107\u0108\7n\2\2\u0108\u0109\7\"\2\2\u0109"+
		"\u010a\7v\2\2\u010a\u010b\7q\2\2\u010b\u0127\7\"\2\2\u010c\u010d\7\"\2"+
		"\2\u010d\u010e\7k\2\2\u010e\u010f\7u\2\2\u010f\u0110\7\"\2\2\u0110\u0111"+
		"\7n\2\2\u0111\u0112\7g\2\2\u0112\u0113\7u\2\2\u0113\u0114\7u\2\2\u0114"+
		"\u0115\7\"\2\2\u0115\u0116\7v\2\2\u0116\u0117\7j\2\2\u0117\u0118\7c\2"+
		"\2\u0118\u0119\7p\2\2\u0119\u011a\7\"\2\2\u011a\u011b\7q\2\2\u011b\u011c"+
		"\7t\2\2\u011c\u011d\7\"\2\2\u011d\u011e\7g\2\2\u011e\u011f\7s\2\2\u011f"+
		"\u0120\7w\2\2\u0120\u0121\7c\2\2\u0121\u0122\7n\2\2\u0122\u0123\7\"\2"+
		"\2\u0123\u0124\7v\2\2\u0124\u0125\7q\2\2\u0125\u0127\7\"\2\2\u0126\u00b2"+
		"\3\2\2\2\u0126\u00bf\3\2\2\2\u0126\u00d0\3\2\2\2\u0126\u00de\3\2\2\2\u0126"+
		"\u00ef\3\2\2\2\u0126\u010c\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5\7"+
		"\4\2\u0129\u012b\3\2\2\2\u012a\u0085\3\2\2\2\u012a\u0089\3\2\2\2\u012a"+
		"\u008e\3\2\2\2\u012a\u00b1\3\2\2\2\u012b\26\3\2\2\2\u012c\u012d\7\"\2"+
		"\2\u012d\u012e\7c\2\2\u012e\u012f\7p\2\2\u012f\u0130\7f\2\2\u0130\u0131"+
		"\7\"\2\2\u0131\30\3\2\2\2\u0132\u0133\7\"\2\2\u0133\u0134\7q\2\2\u0134"+
		"\u0135\7t\2\2\u0135\u0136\7\"\2\2\u0136\32\3\2\2\2\u0137\u0138\7\"\2\2"+
		"\u0138\u0139\7-\2\2\u0139\u0141\7\"\2\2\u013a\u013b\7\"\2\2\u013b\u013c"+
		"\7r\2\2\u013c\u013d\7n\2\2\u013d\u013e\7w\2\2\u013e\u013f\7u\2\2\u013f"+
		"\u0141\7\"\2\2\u0140\u0137\3\2\2\2\u0140\u013a\3\2\2\2\u0141\34\3\2\2"+
		"\2\u0142\u0143\7\"\2\2\u0143\u0144\7/\2\2\u0144\u014d\7\"\2\2\u0145\u0146"+
		"\7\"\2\2\u0146\u0147\7o\2\2\u0147\u0148\7k\2\2\u0148\u0149\7p\2\2\u0149"+
		"\u014a\7w\2\2\u014a\u014b\7u\2\2\u014b\u014d\7\"\2\2\u014c\u0142\3\2\2"+
		"\2\u014c\u0145\3\2\2\2\u014d\36\3\2\2\2\u014e\u014f\7\"\2\2\u014f\u0150"+
		"\7,\2\2\u0150\u0159\7\"\2\2\u0151\u0152\7\"\2\2\u0152\u0153\7v\2\2\u0153"+
		"\u0154\7k\2\2\u0154\u0155\7o\2\2\u0155\u0156\7g\2\2\u0156\u0157\7u\2\2"+
		"\u0157\u0159\7\"\2\2\u0158\u014e\3\2\2\2\u0158\u0151\3\2\2\2\u0159 \3"+
		"\2\2\2\u015a\u015b\7\"\2\2\u015b\u015c\7\61\2\2\u015c\u0162\7\"\2\2\u015d"+
		"\u015e\7\"\2\2\u015e\u015f\7d\2\2\u015f\u0160\7{\2\2\u0160\u0162\7\"\2"+
		"\2\u0161\u015a\3\2\2\2\u0161\u015d\3\2\2\2\u0162\"\3\2\2\2\u0163\u0164"+
		"\7\"\2\2\u0164\u0165\7`\2\2\u0165\u016e\7\"\2\2\u0166\u0167\7\"\2\2\u0167"+
		"\u0168\7t\2\2\u0168\u0169\7c\2\2\u0169\u016a\7k\2\2\u016a\u016b\7u\2\2"+
		"\u016b\u016c\7g\2\2\u016c\u016e\7\"\2\2\u016d\u0163\3\2\2\2\u016d\u0166"+
		"\3\2\2\2\u016e$\3\2\2\2\u016f\u0170\t\4\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0172\b\23\2\2\u0172&\3\2\2\2\31\2\629=AGMSX_gnu{\u0083\u00ad\u0126\u012a"+
		"\u0140\u014c\u0158\u0161\u016d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}