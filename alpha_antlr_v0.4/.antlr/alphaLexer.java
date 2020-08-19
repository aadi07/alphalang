// Generated from /Users/aadi/projects/alpha_lang/alpha_antlr_v0.4/alpha.g4 by ANTLR 4.8
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, NONE=26, INPUT=27, REFERENCE=28, MATH=29, STRING=30, BOOL=31, 
		LIST=32, WS=33, COMMENT=34;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"NONE", "INPUT", "REFERENCE", "MATH", "INTEGER", "FLOAT", "STRING", "STRING_FACTOR", 
			"LITERAL_STRING", "STRING_LITERAL", "BOOL", "BOOL_LITERAL", "LIST", "AND", 
			"OR", "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "POWER", "MODULO", "WS", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'Exit'", "'Call '", "' on '", "'and'", "'Define '", "' as:'", 
			"','", "'Return '", "'Return'", "'Print '", "'Print'", "'If '", "':'", 
			"'otherwise if '", "'otherwise:'", "'Assign '", "' to '", "'While '", 
			"'Append '", "'Remove '", "' from '", "'Remove all '", "'s from '", "'Remove position '", 
			"'None'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NONE", "INPUT", "REFERENCE", "MATH", "STRING", "BOOL", "LIST", 
			"WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u04b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u012b\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0137\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0141\n\35\5"+
		"\35\u0143\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u015a\n\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u016a\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0180\n\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01ad"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u01bb\n\35\7\35\u01bd\n\35\f\35\16\35\u01c0\13\35\5\35\u01c2\n\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u01d7\n\35\5\35\u01d9\n\35\3\36\3\36\3\36\5"+
		"\36\u01de\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0207\n\36\5\36\u0209\n\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0211"+
		"\n\36\3\36\3\36\3\36\5\36\u0216\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u023f\n\36\5\36\u0241\n\36\7\36\u0243\n\36\f"+
		"\36\16\36\u0246\13\36\3\37\5\37\u0249\n\37\3\37\6\37\u024c\n\37\r\37\16"+
		"\37\u024d\3 \5 \u0251\n \3 \7 \u0254\n \f \16 \u0257\13 \3 \3 \6 \u025b"+
		"\n \r \16 \u025c\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u0287\n!\5!\u0289\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\5!\u02b4\n!\5!\u02b6\n!\7!\u02b8\n!\f!\16!\u02bb\13!\3\"\3\"\3"+
		"\"\3\"\5\"\u02c1\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u02c8\n\"\3#\3#\7#\u02cc"+
		"\n#\f#\16#\u02cf\13#\3#\3#\3$\3$\5$\u02d5\n$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u02ff\n%\5%\u0301\n%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\5%\u0323\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\5%\u034d\n%\5%\u034f\n%\7%\u0351\n%\f%\16%\u0354\13%\3&\3&\3&\3&\5&"+
		"\u035a\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0384"+
		"\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\5&\u03fd\n&\3&\3&\3&\5&\u0402\n&\3\'\3\'\3\'\3\'\5\'\u0408"+
		"\n\'\3\'\3\'\7\'\u040c\n\'\f\'\16\'\u040f\13\'\5\'\u0411\n\'\3\'\3\'\3"+
		"\'\3\'\5\'\u0417\n\'\7\'\u0419\n\'\f\'\16\'\u041c\13\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0428\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0451\n\'\5"+
		"\'\u0453\n\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\5*\u0469\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0475\n+\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\5,\u0481\n,\3-\3-\3-\3-\3-\3-\3-\5-\u048a\n-\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0496\n.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u04a0"+
		"\n/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u04ae"+
		"\n\61\f\61\16\61\u04b1\13\61\3\61\3\61\3\61\3\61\3\u04af\2\62\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2?\2A "+
		"C\2E\2G\2I!K\2M\"O\2Q\2S\2U\2W\2Y\2[\2]\2_#a$\3\2\5\3\2\62;\3\2$$\5\2"+
		"\13\f\17\17\"\"\2\u0519\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2A\3\2\2\2\2I\3\2\2\2\2M\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7j\3\2\2\2\tp\3\2\2\2\13u\3\2\2\2"+
		"\ry\3\2\2\2\17\u0081\3\2\2\2\21\u0086\3\2\2\2\23\u0088\3\2\2\2\25\u0090"+
		"\3\2\2\2\27\u0097\3\2\2\2\31\u009e\3\2\2\2\33\u00a4\3\2\2\2\35\u00a8\3"+
		"\2\2\2\37\u00aa\3\2\2\2!\u00b8\3\2\2\2#\u00c3\3\2\2\2%\u00cb\3\2\2\2\'"+
		"\u00d0\3\2\2\2)\u00d7\3\2\2\2+\u00df\3\2\2\2-\u00e7\3\2\2\2/\u00ee\3\2"+
		"\2\2\61\u00fa\3\2\2\2\63\u0102\3\2\2\2\65\u0113\3\2\2\2\67\u012a\3\2\2"+
		"\29\u01d8\3\2\2\2;\u01dd\3\2\2\2=\u0248\3\2\2\2?\u0250\3\2\2\2A\u025e"+
		"\3\2\2\2C\u02c7\3\2\2\2E\u02c9\3\2\2\2G\u02d4\3\2\2\2I\u02d6\3\2\2\2K"+
		"\u0359\3\2\2\2M\u0427\3\2\2\2O\u0454\3\2\2\2Q\u045a\3\2\2\2S\u0468\3\2"+
		"\2\2U\u0474\3\2\2\2W\u0480\3\2\2\2Y\u0489\3\2\2\2[\u0495\3\2\2\2]\u049f"+
		"\3\2\2\2_\u04a1\3\2\2\2a\u04a5\3\2\2\2cd\7\60\2\2d\4\3\2\2\2ef\7G\2\2"+
		"fg\7z\2\2gh\7k\2\2hi\7v\2\2i\6\3\2\2\2jk\7E\2\2kl\7c\2\2lm\7n\2\2mn\7"+
		"n\2\2no\7\"\2\2o\b\3\2\2\2pq\7\"\2\2qr\7q\2\2rs\7p\2\2st\7\"\2\2t\n\3"+
		"\2\2\2uv\7c\2\2vw\7p\2\2wx\7f\2\2x\f\3\2\2\2yz\7F\2\2z{\7g\2\2{|\7h\2"+
		"\2|}\7k\2\2}~\7p\2\2~\177\7g\2\2\177\u0080\7\"\2\2\u0080\16\3\2\2\2\u0081"+
		"\u0082\7\"\2\2\u0082\u0083\7c\2\2\u0083\u0084\7u\2\2\u0084\u0085\7<\2"+
		"\2\u0085\20\3\2\2\2\u0086\u0087\7.\2\2\u0087\22\3\2\2\2\u0088\u0089\7"+
		"T\2\2\u0089\u008a\7g\2\2\u008a\u008b\7v\2\2\u008b\u008c\7w\2\2\u008c\u008d"+
		"\7t\2\2\u008d\u008e\7p\2\2\u008e\u008f\7\"\2\2\u008f\24\3\2\2\2\u0090"+
		"\u0091\7T\2\2\u0091\u0092\7g\2\2\u0092\u0093\7v\2\2\u0093\u0094\7w\2\2"+
		"\u0094\u0095\7t\2\2\u0095\u0096\7p\2\2\u0096\26\3\2\2\2\u0097\u0098\7"+
		"R\2\2\u0098\u0099\7t\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c"+
		"\7v\2\2\u009c\u009d\7\"\2\2\u009d\30\3\2\2\2\u009e\u009f\7R\2\2\u009f"+
		"\u00a0\7t\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7v\2\2"+
		"\u00a3\32\3\2\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7"+
		"\"\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7<\2\2\u00a9\36\3\2\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7t\2\2\u00af\u00b0\7y\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7u\2\2"+
		"\u00b2\u00b3\7g\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6"+
		"\7h\2\2\u00b6\u00b7\7\"\2\2\u00b7 \3\2\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba"+
		"\7v\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7t\2\2\u00bd"+
		"\u00be\7y\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7g\2\2"+
		"\u00c1\u00c2\7<\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7C\2\2\u00c4\u00c5\7u"+
		"\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7i\2\2\u00c8\u00c9"+
		"\7p\2\2\u00c9\u00ca\7\"\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7\"\2\2\u00cc\u00cd"+
		"\7v\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7\"\2\2\u00cf&\3\2\2\2\u00d0\u00d1"+
		"\7Y\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7n\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\u00d6\7\"\2\2\u00d6(\3\2\2\2\u00d7\u00d8\7C\2\2\u00d8"+
		"\u00d9\7r\2\2\u00d9\u00da\7r\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7p\2\2"+
		"\u00dc\u00dd\7f\2\2\u00dd\u00de\7\"\2\2\u00de*\3\2\2\2\u00df\u00e0\7T"+
		"\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4"+
		"\7x\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7\"\2\2\u00e6,\3\2\2\2\u00e7\u00e8"+
		"\7\"\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7q\2\2\u00eb"+
		"\u00ec\7o\2\2\u00ec\u00ed\7\"\2\2\u00ed.\3\2\2\2\u00ee\u00ef\7T\2\2\u00ef"+
		"\u00f0\7g\2\2\u00f0\u00f1\7o\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7x\2\2"+
		"\u00f3\u00f4\7g\2\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7"+
		"\7n\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7\"\2\2\u00f9\60\3\2\2\2\u00fa"+
		"\u00fb\7u\2\2\u00fb\u00fc\7\"\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7t\2"+
		"\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7\"\2\2\u0101\62"+
		"\3\2\2\2\u0102\u0103\7T\2\2\u0103\u0104\7g\2\2\u0104\u0105\7o\2\2\u0105"+
		"\u0106\7q\2\2\u0106\u0107\7x\2\2\u0107\u0108\7g\2\2\u0108\u0109\7\"\2"+
		"\2\u0109\u010a\7r\2\2\u010a\u010b\7q\2\2\u010b\u010c\7u\2\2\u010c\u010d"+
		"\7k\2\2\u010d\u010e\7v\2\2\u010e\u010f\7k\2\2\u010f\u0110\7q\2\2\u0110"+
		"\u0111\7p\2\2\u0111\u0112\7\"\2\2\u0112\64\3\2\2\2\u0113\u0114\7P\2\2"+
		"\u0114\u0115\7q\2\2\u0115\u0116\7p\2\2\u0116\u0117\7g\2\2\u0117\66\3\2"+
		"\2\2\u0118\u0119\7k\2\2\u0119\u011a\7p\2\2\u011a\u011b\7r\2\2\u011b\u011c"+
		"\7w\2\2\u011c\u012b\7v\2\2\u011d\u011e\5A!\2\u011e\u011f\7)\2\2\u011f"+
		"\u0120\7u\2\2\u0120\u0121\7\"\2\2\u0121\u0122\7t\2\2\u0122\u0123\7g\2"+
		"\2\u0123\u0124\7u\2\2\u0124\u0125\7r\2\2\u0125\u0126\7q\2\2\u0126\u0127"+
		"\7p\2\2\u0127\u0128\7u\2\2\u0128\u0129\7g\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0118\3\2\2\2\u012a\u011d\3\2\2\2\u012b8\3\2\2\2\u012c\u012d\5E#\2\u012d"+
		"\u012e\7)\2\2\u012e\u012f\7u\2\2\u012f\u0142\3\2\2\2\u0130\u0136\7\"\2"+
		"\2\u0131\u0137\5=\37\2\u0132\u0133\7*\2\2\u0133\u0134\59\35\2\u0134\u0135"+
		"\7+\2\2\u0135\u0137\3\2\2\2\u0136\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u0137"+
		"\u0140\3\2\2\2\u0138\u0139\7v\2\2\u0139\u0141\7j\2\2\u013a\u013b\7p\2"+
		"\2\u013b\u0141\7f\2\2\u013c\u013d\7u\2\2\u013d\u0141\7v\2\2\u013e\u013f"+
		"\7t\2\2\u013f\u0141\7f\2\2\u0140\u0138\3\2\2\2\u0140\u013a\3\2\2\2\u0140"+
		"\u013c\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0130\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\"\2\2\u0145"+
		"\u0146\7x\2\2\u0146\u0147\7c\2\2\u0147\u0148\7n\2\2\u0148\u0149\7w\2\2"+
		"\u0149\u014a\7g\2\2\u014a\u01d9\3\2\2\2\u014b\u014c\5E#\2\u014c\u014d"+
		"\7)\2\2\u014d\u014e\7u\2\2\u014e\u014f\7\"\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0159\5=\37\2\u0151\u0152\7v\2\2\u0152\u015a\7j\2\2\u0153\u0154\7p\2"+
		"\2\u0154\u015a\7f\2\2\u0155\u0156\7u\2\2\u0156\u015a\7v\2\2\u0157\u0158"+
		"\7t\2\2\u0158\u015a\7f\2\2\u0159\u0151\3\2\2\2\u0159\u0153\3\2\2\2\u0159"+
		"\u0155\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7\""+
		"\2\2\u015c\u015d\7v\2\2\u015d\u015e\7q\2\2\u015e\u015f\7\"\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0169\5=\37\2\u0161\u0162\7v\2\2\u0162\u016a\7j\2\2\u0163"+
		"\u0164\7p\2\2\u0164\u016a\7f\2\2\u0165\u0166\7u\2\2\u0166\u016a\7v\2\2"+
		"\u0167\u0168\7t\2\2\u0168\u016a\7f\2\2\u0169\u0161\3\2\2\2\u0169\u0163"+
		"\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\7\"\2\2\u016c\u016d\7x\2\2\u016d\u016e\7c\2\2\u016e\u016f\7n\2"+
		"\2\u016f\u0170\7w\2\2\u0170\u0171\7g\2\2\u0171\u0172\7u\2\2\u0172\u01d9"+
		"\3\2\2\2\u0173\u0174\5E#\2\u0174\u0175\7)\2\2\u0175\u0176\7u\2\2\u0176"+
		"\u017f\3\2\2\2\u0177\u0178\7\"\2\2\u0178\u0179\7n\2\2\u0179\u017a\7k\2"+
		"\2\u017a\u017b\7v\2\2\u017b\u017c\7g\2\2\u017c\u017d\7t\2\2\u017d\u017e"+
		"\7c\2\2\u017e\u0180\7n\2\2\u017f\u0177\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\7\"\2\2\u0182\u0183\7n\2\2\u0183\u0184\7g\2"+
		"\2\u0184\u0185\7p\2\2\u0185\u0186\7i\2\2\u0186\u0187\7v\2\2\u0187\u0188"+
		"\7j\2\2\u0188\u01d9\3\2\2\2\u0189\u018a\7v\2\2\u018a\u018b\7j\2\2\u018b"+
		"\u018c\7g\2\2\u018c\u018d\7\"\2\2\u018d\u018e\7t\2\2\u018e\u018f\7g\2"+
		"\2\u018f\u0190\7u\2\2\u0190\u0191\7w\2\2\u0191\u0192\7n\2\2\u0192\u0193"+
		"\7v\2\2\u0193\u0194\7\"\2\2\u0194\u0195\7q\2\2\u0195\u0196\7h\2\2\u0196"+
		"\u0197\7\"\2\2\u0197\u0198\7e\2\2\u0198\u0199\7c\2\2\u0199\u019a\7n\2"+
		"\2\u019a\u019b\7n\2\2\u019b\u019c\7k\2\2\u019c\u019d\7p\2\2\u019d\u019e"+
		"\7i\2\2\u019e\u019f\7\"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01c1\5A!\2\u01a1"+
		"\u01a2\7\"\2\2\u01a2\u01a3\7q\2\2\u01a3\u01a4\7p\2\2\u01a4\u01a5\7\"\2"+
		"\2\u01a5\u01ac\3\2\2\2\u01a6\u01ad\5I%\2\u01a7\u01ad\5A!\2\u01a8\u01ad"+
		"\5;\36\2\u01a9\u01ad\5M\'\2\u01aa\u01ad\5\67\34\2\u01ab\u01ad\59\35\2"+
		"\u01ac\u01a6\3\2\2\2\u01ac\u01a7\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ac\u01a9"+
		"\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01be\3\2\2\2\u01ae"+
		"\u01af\7\"\2\2\u01af\u01b0\7c\2\2\u01b0\u01b1\7p\2\2\u01b1\u01b2\7f\2"+
		"\2\u01b2\u01b3\7\"\2\2\u01b3\u01ba\3\2\2\2\u01b4\u01bb\5I%\2\u01b5\u01bb"+
		"\5A!\2\u01b6\u01bb\5;\36\2\u01b7\u01bb\5M\'\2\u01b8\u01bb\5\67\34\2\u01b9"+
		"\u01bb\59\35\2\u01ba\u01b4\3\2\2\2\u01ba\u01b5\3\2\2\2\u01ba\u01b6\3\2"+
		"\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb"+
		"\u01bd\3\2\2\2\u01bc\u01ae\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1"+
		"\u01a1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01d9\3\2\2\2\u01c3\u01c4\7v"+
		"\2\2\u01c4\u01c5\7j\2\2\u01c5\u01c6\7g\2\2\u01c6\u01c7\7\"\2\2\u01c7\u01c8"+
		"\7v\2\2\u01c8\u01c9\7{\2\2\u01c9\u01ca\7r\2\2\u01ca\u01cb\7g\2\2\u01cb"+
		"\u01cc\7\"\2\2\u01cc\u01cd\7q\2\2\u01cd\u01ce\7h\2\2\u01ce\u01cf\7\"\2"+
		"\2\u01cf\u01d6\3\2\2\2\u01d0\u01d7\5I%\2\u01d1\u01d7\5A!\2\u01d2\u01d7"+
		"\5;\36\2\u01d3\u01d7\5M\'\2\u01d4\u01d7\5\67\34\2\u01d5\u01d7\59\35\2"+
		"\u01d6\u01d0\3\2\2\2\u01d6\u01d1\3\2\2\2\u01d6\u01d2\3\2\2\2\u01d6\u01d3"+
		"\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8"+
		"\u012c\3\2\2\2\u01d8\u014b\3\2\2\2\u01d8\u0173\3\2\2\2\u01d8\u0189\3\2"+
		"\2\2\u01d8\u01c3\3\2\2\2\u01d9:\3\2\2\2\u01da\u01de\5=\37\2\u01db\u01de"+
		"\5? \2\u01dc\u01de\59\35\2\u01dd\u01da\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd"+
		"\u01dc\3\2\2\2\u01de\u0208\3\2\2\2\u01df\u01e0\7\"\2\2\u01e0\u01e1\7c"+
		"\2\2\u01e1\u01e2\7u\2\2\u01e2\u01e3\7\"\2\2\u01e3\u0206\3\2\2\2\u01e4"+
		"\u01e5\7c\2\2\u01e5\u01e6\7\"\2\2\u01e6\u01e7\7u\2\2\u01e7\u01e8\7v\2"+
		"\2\u01e8\u01e9\7t\2\2\u01e9\u01ea\7k\2\2\u01ea\u01eb\7p\2\2\u01eb\u0207"+
		"\7i\2\2\u01ec\u01ed\7c\2\2\u01ed\u01ee\7p\2\2\u01ee\u01ef\7\"\2\2\u01ef"+
		"\u01f0\7k\2\2\u01f0\u01f1\7p\2\2\u01f1\u01f2\7v\2\2\u01f2\u01f3\7g\2\2"+
		"\u01f3\u01f4\7i\2\2\u01f4\u01f5\7g\2\2\u01f5\u0207\7t\2\2\u01f6\u01f7"+
		"\7c\2\2\u01f7\u01f8\7\"\2\2\u01f8\u01f9\7h\2\2\u01f9\u01fa\7n\2\2\u01fa"+
		"\u01fb\7q\2\2\u01fb\u01fc\7c\2\2\u01fc\u0207\7v\2\2\u01fd\u01fe\7c\2\2"+
		"\u01fe\u01ff\7\"\2\2\u01ff\u0200\7d\2\2\u0200\u0201\7q\2\2\u0201\u0202"+
		"\7q\2\2\u0202\u0203\7n\2\2\u0203\u0204\7g\2\2\u0204\u0205\7c\2\2\u0205"+
		"\u0207\7p\2\2\u0206\u01e4\3\2\2\2\u0206\u01ec\3\2\2\2\u0206\u01f6\3\2"+
		"\2\2\u0206\u01fd\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u01df\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u0244\3\2\2\2\u020a\u0211\5S*\2\u020b\u0211\5U+\2"+
		"\u020c\u0211\5W,\2\u020d\u0211\5Y-\2\u020e\u0211\5[.\2\u020f\u0211\5]"+
		"/\2\u0210\u020a\3\2\2\2\u0210\u020b\3\2\2\2\u0210\u020c\3\2\2\2\u0210"+
		"\u020d\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211\u0215\3\2"+
		"\2\2\u0212\u0216\5=\37\2\u0213\u0216\5? \2\u0214\u0216\59\35\2\u0215\u0212"+
		"\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216\u0240\3\2\2\2\u0217"+
		"\u0218\7\"\2\2\u0218\u0219\7c\2\2\u0219\u021a\7u\2\2\u021a\u021b\7\"\2"+
		"\2\u021b\u023e\3\2\2\2\u021c\u021d\7c\2\2\u021d\u021e\7\"\2\2\u021e\u021f"+
		"\7u\2\2\u021f\u0220\7v\2\2\u0220\u0221\7t\2\2\u0221\u0222\7k\2\2\u0222"+
		"\u0223\7p\2\2\u0223\u023f\7i\2\2\u0224\u0225\7c\2\2\u0225\u0226\7p\2\2"+
		"\u0226\u0227\7\"\2\2\u0227\u0228\7k\2\2\u0228\u0229\7p\2\2\u0229\u022a"+
		"\7v\2\2\u022a\u022b\7g\2\2\u022b\u022c\7i\2\2\u022c\u022d\7g\2\2\u022d"+
		"\u023f\7t\2\2\u022e\u022f\7c\2\2\u022f\u0230\7\"\2\2\u0230\u0231\7h\2"+
		"\2\u0231\u0232\7n\2\2\u0232\u0233\7q\2\2\u0233\u0234\7c\2\2\u0234\u023f"+
		"\7v\2\2\u0235\u0236\7c\2\2\u0236\u0237\7\"\2\2\u0237\u0238\7d\2\2\u0238"+
		"\u0239\7q\2\2\u0239\u023a\7q\2\2\u023a\u023b\7n\2\2\u023b\u023c\7g\2\2"+
		"\u023c\u023d\7c\2\2\u023d\u023f\7p\2\2\u023e\u021c\3\2\2\2\u023e\u0224"+
		"\3\2\2\2\u023e\u022e\3\2\2\2\u023e\u0235\3\2\2\2\u023f\u0241\3\2\2\2\u0240"+
		"\u0217\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0210\3\2"+
		"\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"<\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0249\7/\2\2\u0248\u0247\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u024c\t\2\2\2\u024b\u024a\3\2"+
		"\2\2\u024c\u024d\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		">\3\2\2\2\u024f\u0251\7/\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0255\3\2\2\2\u0252\u0254\t\2\2\2\u0253\u0252\3\2\2\2\u0254\u0257\3\2"+
		"\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257"+
		"\u0255\3\2\2\2\u0258\u025a\7\60\2\2\u0259\u025b\t\2\2\2\u025a\u0259\3"+
		"\2\2\2\u025b\u025c\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"@\3\2\2\2\u025e\u0288\5C\"\2\u025f\u0260\7\"\2\2\u0260\u0261\7c\2\2\u0261"+
		"\u0262\7u\2\2\u0262\u0263\7\"\2\2\u0263\u0286\3\2\2\2\u0264\u0265\7c\2"+
		"\2\u0265\u0266\7\"\2\2\u0266\u0267\7u\2\2\u0267\u0268\7v\2\2\u0268\u0269"+
		"\7t\2\2\u0269\u026a\7k\2\2\u026a\u026b\7p\2\2\u026b\u0287\7i\2\2\u026c"+
		"\u026d\7c\2\2\u026d\u026e\7p\2\2\u026e\u026f\7\"\2\2\u026f\u0270\7k\2"+
		"\2\u0270\u0271\7p\2\2\u0271\u0272\7v\2\2\u0272\u0273\7g\2\2\u0273\u0274"+
		"\7i\2\2\u0274\u0275\7g\2\2\u0275\u0287\7t\2\2\u0276\u0277\7c\2\2\u0277"+
		"\u0278\7\"\2\2\u0278\u0279\7h\2\2\u0279\u027a\7n\2\2\u027a\u027b\7q\2"+
		"\2\u027b\u027c\7c\2\2\u027c\u0287\7v\2\2\u027d\u027e\7c\2\2\u027e\u027f"+
		"\7\"\2\2\u027f\u0280\7d\2\2\u0280\u0281\7q\2\2\u0281\u0282\7q\2\2\u0282"+
		"\u0283\7n\2\2\u0283\u0284\7g\2\2\u0284\u0285\7c\2\2\u0285\u0287\7p\2\2"+
		"\u0286\u0264\3\2\2\2\u0286\u026c\3\2\2\2\u0286\u0276\3\2\2\2\u0286\u027d"+
		"\3\2\2\2\u0287\u0289\3\2\2\2\u0288\u025f\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u02b9\3\2\2\2\u028a\u028b\5S*\2\u028b\u02b5\5C\"\2\u028c\u028d\7\"\2"+
		"\2\u028d\u028e\7c\2\2\u028e\u028f\7u\2\2\u028f\u0290\7\"\2\2\u0290\u02b3"+
		"\3\2\2\2\u0291\u0292\7c\2\2\u0292\u0293\7\"\2\2\u0293\u0294\7u\2\2\u0294"+
		"\u0295\7v\2\2\u0295\u0296\7t\2\2\u0296\u0297\7k\2\2\u0297\u0298\7p\2\2"+
		"\u0298\u02b4\7i\2\2\u0299\u029a\7c\2\2\u029a\u029b\7p\2\2\u029b\u029c"+
		"\7\"\2\2\u029c\u029d\7k\2\2\u029d\u029e\7p\2\2\u029e\u029f\7v\2\2\u029f"+
		"\u02a0\7g\2\2\u02a0\u02a1\7i\2\2\u02a1\u02a2\7g\2\2\u02a2\u02b4\7t\2\2"+
		"\u02a3\u02a4\7c\2\2\u02a4\u02a5\7\"\2\2\u02a5\u02a6\7h\2\2\u02a6\u02a7"+
		"\7n\2\2\u02a7\u02a8\7q\2\2\u02a8\u02a9\7c\2\2\u02a9\u02b4\7v\2\2\u02aa"+
		"\u02ab\7c\2\2\u02ab\u02ac\7\"\2\2\u02ac\u02ad\7d\2\2\u02ad\u02ae\7q\2"+
		"\2\u02ae\u02af\7q\2\2\u02af\u02b0\7n\2\2\u02b0\u02b1\7g\2\2\u02b1\u02b2"+
		"\7c\2\2\u02b2\u02b4\7p\2\2\u02b3\u0291\3\2\2\2\u02b3\u0299\3\2\2\2\u02b3"+
		"\u02a3\3\2\2\2\u02b3\u02aa\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u028c\3\2"+
		"\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u028a\3\2\2\2\u02b8"+
		"\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02baB\3\2\2\2"+
		"\u02bb\u02b9\3\2\2\2\u02bc\u02c0\5G$\2\u02bd\u02be\5W,\2\u02be\u02bf\5"+
		";\36\2\u02bf\u02c1\3\2\2\2\u02c0\u02bd\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c8\3\2\2\2\u02c2\u02c3\5;\36\2\u02c3\u02c4\5W,\2\u02c4\u02c5\3\2\2"+
		"\2\u02c5\u02c6\5G$\2\u02c6\u02c8\3\2\2\2\u02c7\u02bc\3\2\2\2\u02c7\u02c2"+
		"\3\2\2\2\u02c8D\3\2\2\2\u02c9\u02cd\7$\2\2\u02ca\u02cc\n\3\2\2\u02cb\u02ca"+
		"\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02d0\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d1\7$\2\2\u02d1F\3\2\2\2\u02d2"+
		"\u02d5\5E#\2\u02d3\u02d5\59\35\2\u02d4\u02d2\3\2\2\2\u02d4\u02d3\3\2\2"+
		"\2\u02d5H\3\2\2\2\u02d6\u0300\5K&\2\u02d7\u02d8\7\"\2\2\u02d8\u02d9\7"+
		"c\2\2\u02d9\u02da\7u\2\2\u02da\u02db\7\"\2\2\u02db\u02fe\3\2\2\2\u02dc"+
		"\u02dd\7c\2\2\u02dd\u02de\7\"\2\2\u02de\u02df\7u\2\2\u02df\u02e0\7v\2"+
		"\2\u02e0\u02e1\7t\2\2\u02e1\u02e2\7k\2\2\u02e2\u02e3\7p\2\2\u02e3\u02ff"+
		"\7i\2\2\u02e4\u02e5\7c\2\2\u02e5\u02e6\7p\2\2\u02e6\u02e7\7\"\2\2\u02e7"+
		"\u02e8\7k\2\2\u02e8\u02e9\7p\2\2\u02e9\u02ea\7v\2\2\u02ea\u02eb\7g\2\2"+
		"\u02eb\u02ec\7i\2\2\u02ec\u02ed\7g\2\2\u02ed\u02ff\7t\2\2\u02ee\u02ef"+
		"\7c\2\2\u02ef\u02f0\7\"\2\2\u02f0\u02f1\7h\2\2\u02f1\u02f2\7n\2\2\u02f2"+
		"\u02f3\7q\2\2\u02f3\u02f4\7c\2\2\u02f4\u02ff\7v\2\2\u02f5\u02f6\7c\2\2"+
		"\u02f6\u02f7\7\"\2\2\u02f7\u02f8\7d\2\2\u02f8\u02f9\7q\2\2\u02f9\u02fa"+
		"\7q\2\2\u02fa\u02fb\7n\2\2\u02fb\u02fc\7g\2\2\u02fc\u02fd\7c\2\2\u02fd"+
		"\u02ff\7p\2\2\u02fe\u02dc\3\2\2\2\u02fe\u02e4\3\2\2\2\u02fe\u02ee\3\2"+
		"\2\2\u02fe\u02f5\3\2\2\2\u02ff\u0301\3\2\2\2\u0300\u02d7\3\2\2\2\u0300"+
		"\u0301\3\2\2\2\u0301\u0352\3\2\2\2\u0302\u0323\5O(\2\u0303\u0323\5Q)\2"+
		"\u0304\u0305\7\"\2\2\u0305\u0306\7k\2\2\u0306\u0307\7u\2\2\u0307\u0308"+
		"\7\"\2\2\u0308\u0309\7g\2\2\u0309\u030a\7s\2\2\u030a\u030b\7w\2\2\u030b"+
		"\u030c\7c\2\2\u030c\u030d\7n\2\2\u030d\u030e\7\"\2\2\u030e\u030f\7v\2"+
		"\2\u030f\u0310\7q\2\2\u0310\u0323\7\"\2\2\u0311\u0312\7\"\2\2\u0312\u0313"+
		"\7k\2\2\u0313\u0314\7u\2\2\u0314\u0315\7\"\2\2\u0315\u0316\7p\2\2\u0316"+
		"\u0317\7q\2\2\u0317\u0318\7v\2\2\u0318\u0319\7\"\2\2\u0319\u031a\7g\2"+
		"\2\u031a\u031b\7s\2\2\u031b\u031c\7w\2\2\u031c\u031d\7c\2\2\u031d\u031e"+
		"\7n\2\2\u031e\u031f\7\"\2\2\u031f\u0320\7v\2\2\u0320\u0321\7q\2\2\u0321"+
		"\u0323\7\"\2\2\u0322\u0302\3\2\2\2\u0322\u0303\3\2\2\2\u0322\u0304\3\2"+
		"\2\2\u0322\u0311\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u034e\5K&\2\u0325\u0326"+
		"\7\"\2\2\u0326\u0327\7c\2\2\u0327\u0328\7u\2\2\u0328\u0329\7\"\2\2\u0329"+
		"\u034c\3\2\2\2\u032a\u032b\7c\2\2\u032b\u032c\7\"\2\2\u032c\u032d\7u\2"+
		"\2\u032d\u032e\7v\2\2\u032e\u032f\7t\2\2\u032f\u0330\7k\2\2\u0330\u0331"+
		"\7p\2\2\u0331\u034d\7i\2\2\u0332\u0333\7c\2\2\u0333\u0334\7p\2\2\u0334"+
		"\u0335\7\"\2\2\u0335\u0336\7k\2\2\u0336\u0337\7p\2\2\u0337\u0338\7v\2"+
		"\2\u0338\u0339\7g\2\2\u0339\u033a\7i\2\2\u033a\u033b\7g\2\2\u033b\u034d"+
		"\7t\2\2\u033c\u033d\7c\2\2\u033d\u033e\7\"\2\2\u033e\u033f\7h\2\2\u033f"+
		"\u0340\7n\2\2\u0340\u0341\7q\2\2\u0341\u0342\7c\2\2\u0342\u034d\7v\2\2"+
		"\u0343\u0344\7c\2\2\u0344\u0345\7\"\2\2\u0345\u0346\7d\2\2\u0346\u0347"+
		"\7q\2\2\u0347\u0348\7q\2\2\u0348\u0349\7n\2\2\u0349\u034a\7g\2\2\u034a"+
		"\u034b\7c\2\2\u034b\u034d\7p\2\2\u034c\u032a\3\2\2\2\u034c\u0332\3\2\2"+
		"\2\u034c\u033c\3\2\2\2\u034c\u0343\3\2\2\2\u034d\u034f\3\2\2\2\u034e\u0325"+
		"\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u0322\3\2\2\2\u0351"+
		"\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353J\3\2\2\2"+
		"\u0354\u0352\3\2\2\2\u0355\u0356\7p\2\2\u0356\u0357\7q\2\2\u0357\u0358"+
		"\7v\2\2\u0358\u035a\7\"\2\2\u0359\u0355\3\2\2\2\u0359\u035a\3\2\2\2\u035a"+
		"\u0401\3\2\2\2\u035b\u035c\7V\2\2\u035c\u035d\7t\2\2\u035d\u035e\7w\2"+
		"\2\u035e\u0402\7g\2\2\u035f\u0360\7H\2\2\u0360\u0361\7c\2\2\u0361\u0362"+
		"\7n\2\2\u0362\u0363\7u\2\2\u0363\u0402\7g\2\2\u0364\u0383\5A!\2\u0365"+
		"\u0366\7\"\2\2\u0366\u0367\7k\2\2\u0367\u0368\7u\2\2\u0368\u0369\7\"\2"+
		"\2\u0369\u036a\7g\2\2\u036a\u036b\7s\2\2\u036b\u036c\7w\2\2\u036c\u036d"+
		"\7c\2\2\u036d\u036e\7n\2\2\u036e\u036f\7\"\2\2\u036f\u0370\7v\2\2\u0370"+
		"\u0371\7q\2\2\u0371\u0384\7\"\2\2\u0372\u0373\7\"\2\2\u0373\u0374\7k\2"+
		"\2\u0374\u0375\7u\2\2\u0375\u0376\7\"\2\2\u0376\u0377\7p\2\2\u0377\u0378"+
		"\7q\2\2\u0378\u0379\7v\2\2\u0379\u037a\7\"\2\2\u037a\u037b\7g\2\2\u037b"+
		"\u037c\7s\2\2\u037c\u037d\7w\2\2\u037d\u037e\7c\2\2\u037e\u037f\7n\2\2"+
		"\u037f\u0380\7\"\2\2\u0380\u0381\7v\2\2\u0381\u0382\7q\2\2\u0382\u0384"+
		"\7\"\2\2\u0383\u0365\3\2\2\2\u0383\u0372\3\2\2\2\u0384\u0385\3\2\2\2\u0385"+
		"\u0386\5A!\2\u0386\u0402\3\2\2\2\u0387\u03fc\5;\36\2\u0388\u0389\7\"\2"+
		"\2\u0389\u038a\7k\2\2\u038a\u038b\7u\2\2\u038b\u038c\7\"\2\2\u038c\u038d"+
		"\7g\2\2\u038d\u038e\7s\2\2\u038e\u038f\7w\2\2\u038f\u0390\7c\2\2\u0390"+
		"\u0391\7n\2\2\u0391\u0392\7\"\2\2\u0392\u0393\7v\2\2\u0393\u0394\7q\2"+
		"\2\u0394\u03fd\7\"\2\2\u0395\u0396\7\"\2\2\u0396\u0397\7k\2\2\u0397\u0398"+
		"\7u\2\2\u0398\u0399\7\"\2\2\u0399\u039a\7p\2\2\u039a\u039b\7q\2\2\u039b"+
		"\u039c\7v\2\2\u039c\u039d\7\"\2\2\u039d\u039e\7g\2\2\u039e\u039f\7s\2"+
		"\2\u039f\u03a0\7w\2\2\u03a0\u03a1\7c\2\2\u03a1\u03a2\7n\2\2\u03a2\u03a3"+
		"\7\"\2\2\u03a3\u03a4\7v\2\2\u03a4\u03a5\7q\2\2\u03a5\u03fd\7\"\2\2\u03a6"+
		"\u03a7\7\"\2\2\u03a7\u03a8\7k\2\2\u03a8\u03a9\7u\2\2\u03a9\u03aa\7\"\2"+
		"\2\u03aa\u03ab\7n\2\2\u03ab\u03ac\7g\2\2\u03ac\u03ad\7u\2\2\u03ad\u03ae"+
		"\7u\2\2\u03ae\u03af\7\"\2\2\u03af\u03b0\7v\2\2\u03b0\u03b1\7j\2\2\u03b1"+
		"\u03b2\7c\2\2\u03b2\u03b3\7p\2\2\u03b3\u03fd\7\"\2\2\u03b4\u03b5\7\"\2"+
		"\2\u03b5\u03b6\7k\2\2\u03b6\u03b7\7u\2\2\u03b7\u03b8\7\"\2\2\u03b8\u03b9"+
		"\7i\2\2\u03b9\u03ba\7t\2\2\u03ba\u03bb\7g\2\2\u03bb\u03bc\7c\2\2\u03bc"+
		"\u03bd\7v\2\2\u03bd\u03be\7g\2\2\u03be\u03bf\7t\2\2\u03bf\u03c0\7\"\2"+
		"\2\u03c0\u03c1\7v\2\2\u03c1\u03c2\7j\2\2\u03c2\u03c3\7c\2\2\u03c3\u03c4"+
		"\7p\2\2\u03c4\u03fd\7\"\2\2\u03c5\u03c6\7\"\2\2\u03c6\u03c7\7k\2\2\u03c7"+
		"\u03c8\7u\2\2\u03c8\u03c9\7\"\2\2\u03c9\u03ca\7i\2\2\u03ca\u03cb\7t\2"+
		"\2\u03cb\u03cc\7g\2\2\u03cc\u03cd\7c\2\2\u03cd\u03ce\7v\2\2\u03ce\u03cf"+
		"\7g\2\2\u03cf\u03d0\7t\2\2\u03d0\u03d1\7\"\2\2\u03d1\u03d2\7v\2\2\u03d2"+
		"\u03d3\7j\2\2\u03d3\u03d4\7c\2\2\u03d4\u03d5\7p\2\2\u03d5\u03d6\7\"\2"+
		"\2\u03d6\u03d7\7q\2\2\u03d7\u03d8\7t\2\2\u03d8\u03d9\7\"\2\2\u03d9\u03da"+
		"\7g\2\2\u03da\u03db\7s\2\2\u03db\u03dc\7w\2\2\u03dc\u03dd\7c\2\2\u03dd"+
		"\u03de\7n\2\2\u03de\u03df\7\"\2\2\u03df\u03e0\7v\2\2\u03e0\u03e1\7q\2"+
		"\2\u03e1\u03fd\7\"\2\2\u03e2\u03e3\7\"\2\2\u03e3\u03e4\7k\2\2\u03e4\u03e5"+
		"\7u\2\2\u03e5\u03e6\7\"\2\2\u03e6\u03e7\7n\2\2\u03e7\u03e8\7g\2\2\u03e8"+
		"\u03e9\7u\2\2\u03e9\u03ea\7u\2\2\u03ea\u03eb\7\"\2\2\u03eb\u03ec\7v\2"+
		"\2\u03ec\u03ed\7j\2\2\u03ed\u03ee\7c\2\2\u03ee\u03ef\7p\2\2\u03ef\u03f0"+
		"\7\"\2\2\u03f0\u03f1\7q\2\2\u03f1\u03f2\7t\2\2\u03f2\u03f3\7\"\2\2\u03f3"+
		"\u03f4\7g\2\2\u03f4\u03f5\7s\2\2\u03f5\u03f6\7w\2\2\u03f6\u03f7\7c\2\2"+
		"\u03f7\u03f8\7n\2\2\u03f8\u03f9\7\"\2\2\u03f9\u03fa\7v\2\2\u03fa\u03fb"+
		"\7q\2\2\u03fb\u03fd\7\"\2\2\u03fc\u0388\3\2\2\2\u03fc\u0395\3\2\2\2\u03fc"+
		"\u03a6\3\2\2\2\u03fc\u03b4\3\2\2\2\u03fc\u03c5\3\2\2\2\u03fc\u03e2\3\2"+
		"\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\5;\36\2\u03ff\u0402\3\2\2\2\u0400"+
		"\u0402\59\35\2\u0401\u035b\3\2\2\2\u0401\u035f\3\2\2\2\u0401\u0364\3\2"+
		"\2\2\u0401\u0387\3\2\2\2\u0401\u0400\3\2\2\2\u0402L\3\2\2\2\u0403\u0408"+
		"\5A!\2\u0404\u0408\5I%\2\u0405\u0408\59\35\2\u0406\u0408\5;\36\2\u0407"+
		"\u0403\3\2\2\2\u0407\u0404\3\2\2\2\u0407\u0405\3\2\2\2\u0407\u0406\3\2"+
		"\2\2\u0408\u041a\3\2\2\2\u0409\u040d\7.\2\2\u040a\u040c\5_\60\2\u040b"+
		"\u040a\3\2\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2"+
		"\2\2\u040e\u0411\3\2\2\2\u040f\u040d\3\2\2\2\u0410\u0409\3\2\2\2\u0410"+
		"\u0411\3\2\2\2\u0411\u0416\3\2\2\2\u0412\u0417\5A!\2\u0413\u0417\5I%\2"+
		"\u0414\u0417\59\35\2\u0415\u0417\5;\36\2\u0416\u0412\3\2\2\2\u0416\u0413"+
		"\3\2\2\2\u0416\u0414\3\2\2\2\u0416\u0415\3\2\2\2\u0417\u0419\3\2\2\2\u0418"+
		"\u0410\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2"+
		"\2\2\u041b\u0428\3\2\2\2\u041c\u041a\3\2\2\2\u041d\u041e\7c\2\2\u041e"+
		"\u041f\7\"\2\2\u041f\u0420\7p\2\2\u0420\u0421\7g\2\2\u0421\u0422\7y\2"+
		"\2\u0422\u0423\7\"\2\2\u0423\u0424\7n\2\2\u0424\u0425\7k\2\2\u0425\u0426"+
		"\7u\2\2\u0426\u0428\7v\2\2\u0427\u0407\3\2\2\2\u0427\u041d\3\2\2\2\u0428"+
		"\u0452\3\2\2\2\u0429\u042a\7\"\2\2\u042a\u042b\7c\2\2\u042b\u042c\7u\2"+
		"\2\u042c\u042d\7\"\2\2\u042d\u0450\3\2\2\2\u042e\u042f\7c\2\2\u042f\u0430"+
		"\7\"\2\2\u0430\u0431\7u\2\2\u0431\u0432\7v\2\2\u0432\u0433\7t\2\2\u0433"+
		"\u0434\7k\2\2\u0434\u0435\7p\2\2\u0435\u0451\7i\2\2\u0436\u0437\7c\2\2"+
		"\u0437\u0438\7p\2\2\u0438\u0439\7\"\2\2\u0439\u043a\7k\2\2\u043a\u043b"+
		"\7p\2\2\u043b\u043c\7v\2\2\u043c\u043d\7g\2\2\u043d\u043e\7i\2\2\u043e"+
		"\u043f\7g\2\2\u043f\u0451\7t\2\2\u0440\u0441\7c\2\2\u0441\u0442\7\"\2"+
		"\2\u0442\u0443\7h\2\2\u0443\u0444\7n\2\2\u0444\u0445\7q\2\2\u0445\u0446"+
		"\7c\2\2\u0446\u0451\7v\2\2\u0447\u0448\7c\2\2\u0448\u0449\7\"\2\2\u0449"+
		"\u044a\7d\2\2\u044a\u044b\7q\2\2\u044b\u044c\7q\2\2\u044c\u044d\7n\2\2"+
		"\u044d\u044e\7g\2\2\u044e\u044f\7c\2\2\u044f\u0451\7p\2\2\u0450\u042e"+
		"\3\2\2\2\u0450\u0436\3\2\2\2\u0450\u0440\3\2\2\2\u0450\u0447\3\2\2\2\u0451"+
		"\u0453\3\2\2\2\u0452\u0429\3\2\2\2\u0452\u0453\3\2\2\2\u0453N\3\2\2\2"+
		"\u0454\u0455\7\"\2\2\u0455\u0456\7c\2\2\u0456\u0457\7p\2\2\u0457\u0458"+
		"\7f\2\2\u0458\u0459\7\"\2\2\u0459P\3\2\2\2\u045a\u045b\7\"\2\2\u045b\u045c"+
		"\7q\2\2\u045c\u045d\7t\2\2\u045d\u045e\7\"\2\2\u045eR\3\2\2\2\u045f\u0460"+
		"\7\"\2\2\u0460\u0461\7-\2\2\u0461\u0469\7\"\2\2\u0462\u0463\7\"\2\2\u0463"+
		"\u0464\7r\2\2\u0464\u0465\7n\2\2\u0465\u0466\7w\2\2\u0466\u0467\7u\2\2"+
		"\u0467\u0469\7\"\2\2\u0468\u045f\3\2\2\2\u0468\u0462\3\2\2\2\u0469T\3"+
		"\2\2\2\u046a\u046b\7\"\2\2\u046b\u046c\7/\2\2\u046c\u0475\7\"\2\2\u046d"+
		"\u046e\7\"\2\2\u046e\u046f\7o\2\2\u046f\u0470\7k\2\2\u0470\u0471\7p\2"+
		"\2\u0471\u0472\7w\2\2\u0472\u0473\7u\2\2\u0473\u0475\7\"\2\2\u0474\u046a"+
		"\3\2\2\2\u0474\u046d\3\2\2\2\u0475V\3\2\2\2\u0476\u0477\7\"\2\2\u0477"+
		"\u0478\7,\2\2\u0478\u0481\7\"\2\2\u0479\u047a\7\"\2\2\u047a\u047b\7v\2"+
		"\2\u047b\u047c\7k\2\2\u047c\u047d\7o\2\2\u047d\u047e\7g\2\2\u047e\u047f"+
		"\7u\2\2\u047f\u0481\7\"\2\2\u0480\u0476\3\2\2\2\u0480\u0479\3\2\2\2\u0481"+
		"X\3\2\2\2\u0482\u0483\7\"\2\2\u0483\u0484\7\61\2\2\u0484\u048a\7\"\2\2"+
		"\u0485\u0486\7\"\2\2\u0486\u0487\7d\2\2\u0487\u0488\7{\2\2\u0488\u048a"+
		"\7\"\2\2\u0489\u0482\3\2\2\2\u0489\u0485\3\2\2\2\u048aZ\3\2\2\2\u048b"+
		"\u048c\7\"\2\2\u048c\u048d\7`\2\2\u048d\u0496\7\"\2\2\u048e\u048f\7\""+
		"\2\2\u048f\u0490\7t\2\2\u0490\u0491\7c\2\2\u0491\u0492\7k\2\2\u0492\u0493"+
		"\7u\2\2\u0493\u0494\7g\2\2\u0494\u0496\7\"\2\2\u0495\u048b\3\2\2\2\u0495"+
		"\u048e\3\2\2\2\u0496\\\3\2\2\2\u0497\u0498\7\"\2\2\u0498\u0499\7\'\2\2"+
		"\u0499\u04a0\7\"\2\2\u049a\u049b\7\"\2\2\u049b\u049c\7o\2\2\u049c\u049d"+
		"\7q\2\2\u049d\u049e\7f\2\2\u049e\u04a0\7\"\2\2\u049f\u0497\3\2\2\2\u049f"+
		"\u049a\3\2\2\2\u04a0^\3\2\2\2\u04a1\u04a2\t\4\2\2\u04a2\u04a3\3\2\2\2"+
		"\u04a3\u04a4\b\60\2\2\u04a4`\3\2\2\2\u04a5\u04a6\7P\2\2\u04a6\u04a7\7"+
		"q\2\2\u04a7\u04a8\7v\2\2\u04a8\u04a9\7g\2\2\u04a9\u04aa\7<\2\2\u04aa\u04ab"+
		"\7\"\2\2\u04ab\u04af\3\2\2\2\u04ac\u04ae\13\2\2\2\u04ad\u04ac\3\2\2\2"+
		"\u04ae\u04b1\3\2\2\2\u04af\u04b0\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0\u04b2"+
		"\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2\u04b3\7\f\2\2\u04b3\u04b4\3\2\2\2\u04b4"+
		"\u04b5\b\61\2\2\u04b5b\3\2\2\2?\2\u012a\u0136\u0140\u0142\u0159\u0169"+
		"\u017f\u01ac\u01ba\u01be\u01c1\u01d6\u01d8\u01dd\u0206\u0208\u0210\u0215"+
		"\u023e\u0240\u0244\u0248\u024d\u0250\u0255\u025c\u0286\u0288\u02b3\u02b5"+
		"\u02b9\u02c0\u02c7\u02cd\u02d4\u02fe\u0300\u0322\u034c\u034e\u0352\u0359"+
		"\u0383\u03fc\u0401\u0407\u040d\u0410\u0416\u041a\u0427\u0450\u0452\u0468"+
		"\u0474\u0480\u0489\u0495\u049f\u04af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}