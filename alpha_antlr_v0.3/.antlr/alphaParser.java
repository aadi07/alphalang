// Generated from /Users/aadi/projects/alpha_lang/alpha_antlr_v0.3/alpha.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alphaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, MATH=8, BOOL=9, 
		INTEGER=10, FLOAT=11, STRING=12, STRING_FACTOR=13, STRING_LITERAL=14, 
		BOOL_LITERAL=15, AND=16, OR=17, ADD=18, SUBTRACT=19, MULTIPLY=20, DIVIDE=21, 
		POWER=22, WS=23;
	public static final int
		RULE_prog = 0, RULE_show = 1, RULE_ifBlock = 2, RULE_ifStmt = 3, RULE_elifStmt = 4, 
		RULE_elseStmt = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "show", "ifBlock", "ifStmt", "elifStmt", "elseStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'Print '", "'If '", "':'", "','", "'otherwise if '", "'otherwise:'", 
			null, null, null, null, null, null, null, null, "' and '", "' or '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "MATH", "BOOL", "INTEGER", 
			"FLOAT", "STRING", "STRING_FACTOR", "STRING_LITERAL", "BOOL_LITERAL", 
			"AND", "OR", "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "POWER", "WS"
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

	@Override
	public String getGrammarFileName() { return "alpha.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public alphaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<ShowContext> show() {
			return getRuleContexts(ShowContext.class);
		}
		public ShowContext show(int i) {
			return getRuleContext(ShowContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(alphaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(alphaParser.WS, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__2) {
				{
				{
				setState(14);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(12);
					show();
					}
					break;
				case T__2:
					{
					setState(13);
					ifBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(16);
				match(T__0);
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(17);
					match(WS);
					}
				}

				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(alphaParser.STRING, 0); }
		public TerminalNode MATH() { return getToken(alphaParser.MATH, 0); }
		public TerminalNode BOOL() { return getToken(alphaParser.BOOL, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__1);
			setState(26);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATH) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
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

	public static class IfBlockContext extends ParserRuleContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public List<ElifStmtContext> elifStmt() {
			return getRuleContexts(ElifStmtContext.class);
		}
		public ElifStmtContext elifStmt(int i) {
			return getRuleContext(ElifStmtContext.class,i);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			ifStmt();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(29);
				elifStmt();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(35);
				elseStmt();
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(alphaParser.BOOL, 0); }
		public List<TerminalNode> WS() { return getTokens(alphaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(alphaParser.WS, i);
		}
		public List<ShowContext> show() {
			return getRuleContexts(ShowContext.class);
		}
		public ShowContext show(int i) {
			return getRuleContext(ShowContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__2);
			setState(39);
			match(BOOL);
			setState(40);
			match(T__3);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(41);
				match(WS);
				}
			}

			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				show();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(45);
					match(T__4);
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(46);
						match(WS);
						}
					}

					}
				}

				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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

	public static class ElifStmtContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(alphaParser.BOOL, 0); }
		public List<TerminalNode> WS() { return getTokens(alphaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(alphaParser.WS, i);
		}
		public List<ShowContext> show() {
			return getRuleContexts(ShowContext.class);
		}
		public ShowContext show(int i) {
			return getRuleContext(ShowContext.class,i);
		}
		public ElifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStmt; }
	}

	public final ElifStmtContext elifStmt() throws RecognitionException {
		ElifStmtContext _localctx = new ElifStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__5);
			setState(56);
			match(BOOL);
			setState(57);
			match(T__3);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(58);
				match(WS);
				}
			}

			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				show();
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(62);
					match(T__4);
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(63);
						match(WS);
						}
					}

					}
				}

				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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

	public static class ElseStmtContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(alphaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(alphaParser.WS, i);
		}
		public List<ShowContext> show() {
			return getRuleContexts(ShowContext.class);
		}
		public ShowContext show(int i) {
			return getRuleContext(ShowContext.class,i);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__6);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(73);
				match(WS);
				}
			}

			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				show();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(77);
					match(T__4);
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(78);
						match(WS);
						}
					}

					}
				}

				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31Z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\5\2\21\n\2\3\2\3\2\5\2\25\n"+
		"\2\7\2\27\n\2\f\2\16\2\32\13\2\3\3\3\3\3\3\3\4\3\4\7\4!\n\4\f\4\16\4$"+
		"\13\4\3\4\5\4\'\n\4\3\5\3\5\3\5\3\5\5\5-\n\5\3\5\3\5\3\5\5\5\62\n\5\5"+
		"\5\64\n\5\6\5\66\n\5\r\5\16\5\67\3\6\3\6\3\6\3\6\5\6>\n\6\3\6\3\6\3\6"+
		"\5\6C\n\6\5\6E\n\6\6\6G\n\6\r\6\16\6H\3\7\3\7\5\7M\n\7\3\7\3\7\3\7\5\7"+
		"R\n\7\5\7T\n\7\6\7V\n\7\r\7\16\7W\3\7\2\2\b\2\4\6\b\n\f\2\3\4\2\n\13\16"+
		"\16\2d\2\30\3\2\2\2\4\33\3\2\2\2\6\36\3\2\2\2\b(\3\2\2\2\n9\3\2\2\2\f"+
		"J\3\2\2\2\16\21\5\4\3\2\17\21\5\6\4\2\20\16\3\2\2\2\20\17\3\2\2\2\21\22"+
		"\3\2\2\2\22\24\7\3\2\2\23\25\7\31\2\2\24\23\3\2\2\2\24\25\3\2\2\2\25\27"+
		"\3\2\2\2\26\20\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3"+
		"\3\2\2\2\32\30\3\2\2\2\33\34\7\4\2\2\34\35\t\2\2\2\35\5\3\2\2\2\36\"\5"+
		"\b\5\2\37!\5\n\6\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#&\3\2\2"+
		"\2$\"\3\2\2\2%\'\5\f\7\2&%\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2()\7\5\2\2)*"+
		"\7\13\2\2*,\7\6\2\2+-\7\31\2\2,+\3\2\2\2,-\3\2\2\2-\65\3\2\2\2.\63\5\4"+
		"\3\2/\61\7\7\2\2\60\62\7\31\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\64\3\2"+
		"\2\2\63/\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65.\3\2\2\2\66\67\3\2\2\2"+
		"\67\65\3\2\2\2\678\3\2\2\28\t\3\2\2\29:\7\b\2\2:;\7\13\2\2;=\7\6\2\2<"+
		">\7\31\2\2=<\3\2\2\2=>\3\2\2\2>F\3\2\2\2?D\5\4\3\2@B\7\7\2\2AC\7\31\2"+
		"\2BA\3\2\2\2BC\3\2\2\2CE\3\2\2\2D@\3\2\2\2DE\3\2\2\2EG\3\2\2\2F?\3\2\2"+
		"\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\13\3\2\2\2JL\7\t\2\2KM\7\31\2\2LK\3"+
		"\2\2\2LM\3\2\2\2MU\3\2\2\2NS\5\4\3\2OQ\7\7\2\2PR\7\31\2\2QP\3\2\2\2QR"+
		"\3\2\2\2RT\3\2\2\2SO\3\2\2\2ST\3\2\2\2TV\3\2\2\2UN\3\2\2\2VW\3\2\2\2W"+
		"U\3\2\2\2WX\3\2\2\2X\r\3\2\2\2\23\20\24\30\"&,\61\63\67=BDHLQSW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}