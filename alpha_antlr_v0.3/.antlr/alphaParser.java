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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, REFERENCE=11, MATH=12, INTEGER=13, FLOAT=14, STRING=15, STRING_FACTOR=16, 
		STRING_LITERAL=17, BOOL=18, BOOL_LITERAL=19, AND=20, OR=21, ADD=22, SUBTRACT=23, 
		MULTIPLY=24, DIVIDE=25, POWER=26, WS=27;
	public static final int
		RULE_prog = 0, RULE_show = 1, RULE_ifStmt = 2, RULE_elifStmt = 3, RULE_elseStmt = 4, 
		RULE_ifBlock = 5, RULE_assign = 6, RULE_whileLoop = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "show", "ifStmt", "elifStmt", "elseStmt", "ifBlock", "assign", 
			"whileLoop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'Print '", "'If '", "':'", "','", "'otherwise if '", "'otherwise:'", 
			"'Assign '", "' to '", "'While '", null, null, null, null, null, null, 
			null, null, null, "' and '", "' or '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "REFERENCE", 
			"MATH", "INTEGER", "FLOAT", "STRING", "STRING_FACTOR", "STRING_LITERAL", 
			"BOOL", "BOOL_LITERAL", "AND", "OR", "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", 
			"POWER", "WS"
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
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<WhileLoopContext> whileLoop() {
			return getRuleContexts(WhileLoopContext.class);
		}
		public WhileLoopContext whileLoop(int i) {
			return getRuleContext(WhileLoopContext.class,i);
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
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__9))) != 0)) {
				{
				{
				setState(20);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(16);
					show();
					}
					break;
				case T__2:
					{
					setState(17);
					ifBlock();
					}
					break;
				case T__7:
					{
					setState(18);
					assign();
					}
					break;
				case T__9:
					{
					setState(19);
					whileLoop();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(22);
				match(T__0);
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(23);
					match(WS);
					}
				}

				}
				}
				setState(30);
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
		public TerminalNode REFERENCE() { return getToken(alphaParser.REFERENCE, 0); }
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
			setState(31);
			match(T__1);
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(alphaParser.BOOL, 0); }
		public TerminalNode REFERENCE() { return getToken(alphaParser.REFERENCE, 0); }
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
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__2);
			setState(35);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(36);
			match(T__3);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(37);
				match(WS);
				}
			}

			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(40);
					show();
					}
					break;
				case T__7:
					{
					setState(41);
					assign();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(44);
					match(T__4);
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(45);
						match(WS);
						}
					}

					}
				}

				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==T__7 );
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
		public TerminalNode REFERENCE() { return getToken(alphaParser.REFERENCE, 0); }
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
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public ElifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStmt; }
	}

	public final ElifStmtContext elifStmt() throws RecognitionException {
		ElifStmtContext _localctx = new ElifStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__5);
			setState(55);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(56);
			match(T__3);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(57);
				match(WS);
				}
			}

			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(60);
					show();
					}
					break;
				case T__7:
					{
					setState(61);
					assign();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(64);
					match(T__4);
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(65);
						match(WS);
						}
					}

					}
				}

				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==T__7 );
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
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__6);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(75);
				match(WS);
				}
			}

			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(78);
					show();
					}
					break;
				case T__7:
					{
					setState(79);
					assign();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(82);
					match(T__4);
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(83);
						match(WS);
						}
					}

					}
				}

				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==T__7 );
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
		enterRule(_localctx, 10, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			ifStmt();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(93);
				elifStmt();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(99);
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

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(alphaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(alphaParser.STRING, i);
		}
		public TerminalNode MATH() { return getToken(alphaParser.MATH, 0); }
		public TerminalNode BOOL() { return getToken(alphaParser.BOOL, 0); }
		public TerminalNode REFERENCE() { return getToken(alphaParser.REFERENCE, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__7);
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(104);
			match(T__8);
			setState(105);
			match(STRING);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(alphaParser.BOOL, 0); }
		public TerminalNode REFERENCE() { return getToken(alphaParser.REFERENCE, 0); }
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
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__9);
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(109);
			match(T__3);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(110);
				match(WS);
				}
			}

			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(113);
					show();
					}
					break;
				case T__7:
					{
					setState(114);
					assign();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(117);
					match(T__4);
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(118);
						match(WS);
						}
					}

					}
				}

				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==T__7 );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3"+
		"\2\5\2\27\n\2\3\2\3\2\5\2\33\n\2\7\2\35\n\2\f\2\16\2 \13\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\5\4)\n\4\3\4\3\4\5\4-\n\4\3\4\3\4\5\4\61\n\4\5\4\63\n"+
		"\4\6\4\65\n\4\r\4\16\4\66\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\5\5A\n\5\3"+
		"\5\3\5\5\5E\n\5\5\5G\n\5\6\5I\n\5\r\5\16\5J\3\6\3\6\5\6O\n\6\3\6\3\6\5"+
		"\6S\n\6\3\6\3\6\5\6W\n\6\5\6Y\n\6\6\6[\n\6\r\6\16\6\\\3\7\3\7\7\7a\n\7"+
		"\f\7\16\7d\13\7\3\7\5\7g\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tr"+
		"\n\t\3\t\3\t\5\tv\n\t\3\t\3\t\5\tz\n\t\5\t|\n\t\6\t~\n\t\r\t\16\t\177"+
		"\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\5\2\r\16\21\21\24\24\4\2\r\r\24\24\2"+
		"\u0094\2\36\3\2\2\2\4!\3\2\2\2\6$\3\2\2\2\b8\3\2\2\2\nL\3\2\2\2\f^\3\2"+
		"\2\2\16h\3\2\2\2\20m\3\2\2\2\22\27\5\4\3\2\23\27\5\f\7\2\24\27\5\16\b"+
		"\2\25\27\5\20\t\2\26\22\3\2\2\2\26\23\3\2\2\2\26\24\3\2\2\2\26\25\3\2"+
		"\2\2\27\30\3\2\2\2\30\32\7\3\2\2\31\33\7\35\2\2\32\31\3\2\2\2\32\33\3"+
		"\2\2\2\33\35\3\2\2\2\34\26\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2"+
		"\2\2\37\3\3\2\2\2 \36\3\2\2\2!\"\7\4\2\2\"#\t\2\2\2#\5\3\2\2\2$%\7\5\2"+
		"\2%&\t\3\2\2&(\7\6\2\2\')\7\35\2\2(\'\3\2\2\2()\3\2\2\2)\64\3\2\2\2*-"+
		"\5\4\3\2+-\5\16\b\2,*\3\2\2\2,+\3\2\2\2-\62\3\2\2\2.\60\7\7\2\2/\61\7"+
		"\35\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62.\3\2\2\2\62\63\3\2"+
		"\2\2\63\65\3\2\2\2\64,\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2"+
		"\2\67\7\3\2\2\289\7\b\2\29:\t\3\2\2:<\7\6\2\2;=\7\35\2\2<;\3\2\2\2<=\3"+
		"\2\2\2=H\3\2\2\2>A\5\4\3\2?A\5\16\b\2@>\3\2\2\2@?\3\2\2\2AF\3\2\2\2BD"+
		"\7\7\2\2CE\7\35\2\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FB\3\2\2\2FG\3\2\2\2"+
		"GI\3\2\2\2H@\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LN\7\t\2"+
		"\2MO\7\35\2\2NM\3\2\2\2NO\3\2\2\2OZ\3\2\2\2PS\5\4\3\2QS\5\16\b\2RP\3\2"+
		"\2\2RQ\3\2\2\2SX\3\2\2\2TV\7\7\2\2UW\7\35\2\2VU\3\2\2\2VW\3\2\2\2WY\3"+
		"\2\2\2XT\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZR\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\"+
		"]\3\2\2\2]\13\3\2\2\2^b\5\6\4\2_a\5\b\5\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2"+
		"\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2eg\5\n\6\2fe\3\2\2\2fg\3\2\2\2g\r\3\2"+
		"\2\2hi\7\n\2\2ij\t\2\2\2jk\7\13\2\2kl\7\21\2\2l\17\3\2\2\2mn\7\f\2\2n"+
		"o\t\3\2\2oq\7\6\2\2pr\7\35\2\2qp\3\2\2\2qr\3\2\2\2r}\3\2\2\2sv\5\4\3\2"+
		"tv\5\16\b\2us\3\2\2\2ut\3\2\2\2v{\3\2\2\2wy\7\7\2\2xz\7\35\2\2yx\3\2\2"+
		"\2yz\3\2\2\2z|\3\2\2\2{w\3\2\2\2{|\3\2\2\2|~\3\2\2\2}u\3\2\2\2~\177\3"+
		"\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\21\3\2\2\2\33\26\32\36(,\60"+
		"\62\66<@DFJNRVX\\bfquy{\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}