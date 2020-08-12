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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, REFERENCE=6, STRING=7, NUMBER=8, 
		PLUS=9, MINUS=10, TIMES=11, DIVIDE=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "REFERENCE", "STRING", "NUMBER", 
			"PLUS", "MINUS", "TIMES", "DIVIDE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Assign '", "' to '", "'.'", "' '", "'Print '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "REFERENCE", "STRING", "NUMBER", 
			"PLUS", "MINUS", "TIMES", "DIVIDE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\6\bH\n"+
		"\b\r\b\16\bI\3\b\3\b\3\t\6\tO\n\t\r\t\16\tP\3\t\6\tT\n\t\r\t\16\tU\3\t"+
		"\3\t\6\tZ\n\t\r\t\16\t[\5\t^\n\t\3\n\3\n\3\n\3\n\3\n\5\ne\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13m\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0082\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0091\n\r\3\16\6\16\u0094\n\16"+
		"\r\16\16\16\u0095\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\3\2\5\4\2$$^^\3\2\62;\5\2\13\f\17\17\"\""+
		"\2\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5%\3\2\2\2\7*\3\2\2\2"+
		"\t,\3\2\2\2\13.\3\2\2\2\r\65\3\2\2\2\17E\3\2\2\2\21]\3\2\2\2\23d\3\2\2"+
		"\2\25l\3\2\2\2\27\u0081\3\2\2\2\31\u0090\3\2\2\2\33\u0093\3\2\2\2\35\36"+
		"\7C\2\2\36\37\7u\2\2\37 \7u\2\2 !\7k\2\2!\"\7i\2\2\"#\7p\2\2#$\7\"\2\2"+
		"$\4\3\2\2\2%&\7\"\2\2&\'\7v\2\2\'(\7q\2\2()\7\"\2\2)\6\3\2\2\2*+\7\60"+
		"\2\2+\b\3\2\2\2,-\7\"\2\2-\n\3\2\2\2./\7R\2\2/\60\7t\2\2\60\61\7k\2\2"+
		"\61\62\7p\2\2\62\63\7v\2\2\63\64\7\"\2\2\64\f\3\2\2\2\65\66\7v\2\2\66"+
		"\67\7j\2\2\678\7g\2\289\7\"\2\29:\7x\2\2:;\7c\2\2;<\7n\2\2<=\7w\2\2=>"+
		"\7g\2\2>?\7\"\2\2?@\7q\2\2@A\7h\2\2AB\7\"\2\2BC\3\2\2\2CD\5\17\b\2D\16"+
		"\3\2\2\2EG\7$\2\2FH\n\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK"+
		"\3\2\2\2KL\7$\2\2L\20\3\2\2\2MO\t\3\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2"+
		"PQ\3\2\2\2Q^\3\2\2\2RT\t\3\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"VW\3\2\2\2WY\7\60\2\2XZ\t\3\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\^\3\2\2\2]N\3\2\2\2]S\3\2\2\2^\22\3\2\2\2_e\7-\2\2`a\7r\2\2ab\7n\2"+
		"\2bc\7w\2\2ce\7u\2\2d_\3\2\2\2d`\3\2\2\2e\24\3\2\2\2fm\7/\2\2gh\7o\2\2"+
		"hi\7k\2\2ij\7p\2\2jk\7w\2\2km\7u\2\2lf\3\2\2\2lg\3\2\2\2m\26\3\2\2\2n"+
		"\u0082\7,\2\2op\7v\2\2pq\7k\2\2qr\7o\2\2rs\7g\2\2s\u0082\7u\2\2tu\7o\2"+
		"\2uv\7w\2\2vw\7n\2\2wx\7v\2\2xy\7k\2\2yz\7r\2\2z{\7n\2\2{|\7k\2\2|}\7"+
		"g\2\2}~\7f\2\2~\177\7\"\2\2\177\u0080\7d\2\2\u0080\u0082\7{\2\2\u0081"+
		"n\3\2\2\2\u0081o\3\2\2\2\u0081t\3\2\2\2\u0082\30\3\2\2\2\u0083\u0091\7"+
		"\61\2\2\u0084\u0085\7d\2\2\u0085\u0091\7{\2\2\u0086\u0087\7f\2\2\u0087"+
		"\u0088\7k\2\2\u0088\u0089\7x\2\2\u0089\u008a\7k\2\2\u008a\u008b\7f\2\2"+
		"\u008b\u008c\7g\2\2\u008c\u008d\7f\2\2\u008d\u008e\7\"\2\2\u008e\u008f"+
		"\7d\2\2\u008f\u0091\7{\2\2\u0090\u0083\3\2\2\2\u0090\u0084\3\2\2\2\u0090"+
		"\u0086\3\2\2\2\u0091\32\3\2\2\2\u0092\u0094\t\4\2\2\u0093\u0092\3\2\2"+
		"\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\b\16\2\2\u0098\34\3\2\2\2\r\2IPU[]dl\u0081\u0090"+
		"\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}