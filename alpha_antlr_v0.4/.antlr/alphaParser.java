// Generated from /Users/aadi/projects/alpha_lang/alpha_antlr_v0.4/alpha.g4 by ANTLR 4.8
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, NONE=28, INPUT=29, REFERENCE=30, MATH=31, 
		STRING=32, BOOL=33, LIST=34, WS=35, COMMENT=36;
	public static final int
		RULE_prog = 0, RULE_exit = 1, RULE_call = 2, RULE_define = 3, RULE_returnStmt = 4, 
		RULE_show = 5, RULE_ifStmt = 6, RULE_elifStmt = 7, RULE_elseStmt = 8, 
		RULE_ifBlock = 9, RULE_assign = 10, RULE_forLoop = 11, RULE_whileLoop = 12, 
		RULE_append = 13, RULE_removeVal = 14, RULE_removeAll = 15, RULE_removePos = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "exit", "call", "define", "returnStmt", "show", "ifStmt", "elifStmt", 
			"elseStmt", "ifBlock", "assign", "forLoop", "whileLoop", "append", "removeVal", 
			"removeAll", "removePos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'Exit'", "'Call '", "' on '", "'and'", "'Define '", "' as:'", 
			"','", "'Return '", "'Return'", "'Print '", "'Print'", "'If '", "':'", 
			"'otherwise if '", "'otherwise:'", "'Assign '", "' to '", "'For '", "' in '", 
			"'While '", "'Append '", "'Remove '", "' from '", "'Remove all '", "'s from '", 
			"'Remove position '", "'None'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NONE", "INPUT", "REFERENCE", "MATH", "STRING", 
			"BOOL", "LIST", "WS", "COMMENT"
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
		public List<AppendContext> append() {
			return getRuleContexts(AppendContext.class);
		}
		public AppendContext append(int i) {
			return getRuleContext(AppendContext.class,i);
		}
		public List<RemoveValContext> removeVal() {
			return getRuleContexts(RemoveValContext.class);
		}
		public RemoveValContext removeVal(int i) {
			return getRuleContext(RemoveValContext.class,i);
		}
		public List<RemoveAllContext> removeAll() {
			return getRuleContexts(RemoveAllContext.class);
		}
		public RemoveAllContext removeAll(int i) {
			return getRuleContext(RemoveAllContext.class,i);
		}
		public List<RemovePosContext> removePos() {
			return getRuleContexts(RemovePosContext.class);
		}
		public RemovePosContext removePos(int i) {
			return getRuleContext(RemovePosContext.class,i);
		}
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<ReturnStmtContext> returnStmt() {
			return getRuleContexts(ReturnStmtContext.class);
		}
		public ReturnStmtContext returnStmt(int i) {
			return getRuleContext(ReturnStmtContext.class,i);
		}
		public List<ExitContext> exit() {
			return getRuleContexts(ExitContext.class);
		}
		public ExitContext exit(int i) {
			return getRuleContext(ExitContext.class,i);
		}
		public List<ForLoopContext> forLoop() {
			return getRuleContexts(ForLoopContext.class);
		}
		public ForLoopContext forLoop(int i) {
			return getRuleContext(ForLoopContext.class,i);
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__26))) != 0)) {
				{
				{
				setState(47);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
				case T__11:
					{
					setState(34);
					show();
					}
					break;
				case T__12:
					{
					setState(35);
					ifBlock();
					}
					break;
				case T__16:
					{
					setState(36);
					assign();
					}
					break;
				case T__20:
					{
					setState(37);
					whileLoop();
					}
					break;
				case T__21:
					{
					setState(38);
					append();
					}
					break;
				case T__22:
					{
					setState(39);
					removeVal();
					}
					break;
				case T__24:
					{
					setState(40);
					removeAll();
					}
					break;
				case T__26:
					{
					setState(41);
					removePos();
					}
					break;
				case T__5:
					{
					setState(42);
					define();
					}
					break;
				case T__2:
					{
					setState(43);
					call();
					}
					break;
				case T__8:
				case T__9:
					{
					setState(44);
					returnStmt();
					}
					break;
				case T__1:
					{
					setState(45);
					exit();
					}
					break;
				case T__18:
					{
					setState(46);
					forLoop();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(49);
				match(T__0);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(50);
					match(WS);
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(60);
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

	public static class ExitContext extends ParserRuleContext {
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__1);
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

	public static class CallContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(alphaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(alphaParser.STRING, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(alphaParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(alphaParser.BOOL, i);
		}
		public List<TerminalNode> MATH() { return getTokens(alphaParser.MATH); }
		public TerminalNode MATH(int i) {
			return getToken(alphaParser.MATH, i);
		}
		public List<TerminalNode> LIST() { return getTokens(alphaParser.LIST); }
		public TerminalNode LIST(int i) {
			return getToken(alphaParser.LIST, i);
		}
		public List<TerminalNode> INPUT() { return getTokens(alphaParser.INPUT); }
		public TerminalNode INPUT(int i) {
			return getToken(alphaParser.INPUT, i);
		}
		public List<TerminalNode> REFERENCE() { return getTokens(alphaParser.REFERENCE); }
		public TerminalNode REFERENCE(int i) {
			return getToken(alphaParser.REFERENCE, i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__2);
			setState(64);
			match(STRING);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(65);
				match(T__3);
				setState(66);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(67);
					match(T__4);
					setState(68);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class DefineContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(alphaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(alphaParser.STRING, i);
		}
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
		public List<AppendContext> append() {
			return getRuleContexts(AppendContext.class);
		}
		public AppendContext append(int i) {
			return getRuleContext(AppendContext.class,i);
		}
		public List<RemoveValContext> removeVal() {
			return getRuleContexts(RemoveValContext.class);
		}
		public RemoveValContext removeVal(int i) {
			return getRuleContext(RemoveValContext.class,i);
		}
		public List<RemoveAllContext> removeAll() {
			return getRuleContexts(RemoveAllContext.class);
		}
		public RemoveAllContext removeAll(int i) {
			return getRuleContext(RemoveAllContext.class,i);
		}
		public List<RemovePosContext> removePos() {
			return getRuleContexts(RemovePosContext.class);
		}
		public RemovePosContext removePos(int i) {
			return getRuleContext(RemovePosContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<WhileLoopContext> whileLoop() {
			return getRuleContexts(WhileLoopContext.class);
		}
		public WhileLoopContext whileLoop(int i) {
			return getRuleContext(WhileLoopContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<ReturnStmtContext> returnStmt() {
			return getRuleContexts(ReturnStmtContext.class);
		}
		public ReturnStmtContext returnStmt(int i) {
			return getRuleContext(ReturnStmtContext.class,i);
		}
		public List<ExitContext> exit() {
			return getRuleContexts(ExitContext.class);
		}
		public ExitContext exit(int i) {
			return getRuleContext(ExitContext.class,i);
		}
		public List<ForLoopContext> forLoop() {
			return getRuleContexts(ForLoopContext.class);
		}
		public ForLoopContext forLoop(int i) {
			return getRuleContext(ForLoopContext.class,i);
		}
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__5);
			setState(77);
			match(STRING);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(78);
				match(T__3);
				setState(79);
				match(STRING);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(80);
					match(T__4);
					setState(81);
					match(STRING);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(89);
			match(T__6);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(90);
				match(WS);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
				case T__11:
					{
					setState(96);
					show();
					}
					break;
				case T__16:
					{
					setState(97);
					assign();
					}
					break;
				case T__21:
					{
					setState(98);
					append();
					}
					break;
				case T__22:
					{
					setState(99);
					removeVal();
					}
					break;
				case T__24:
					{
					setState(100);
					removeAll();
					}
					break;
				case T__26:
					{
					setState(101);
					removePos();
					}
					break;
				case T__12:
					{
					setState(102);
					ifBlock();
					}
					break;
				case T__20:
					{
					setState(103);
					whileLoop();
					}
					break;
				case T__2:
					{
					setState(104);
					call();
					}
					break;
				case T__8:
				case T__9:
					{
					setState(105);
					returnStmt();
					}
					break;
				case T__1:
					{
					setState(106);
					exit();
					}
					break;
				case T__18:
					{
					setState(107);
					forLoop();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(110);
					match(T__7);
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(111);
						match(WS);
						}
						}
						setState(116);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__26))) != 0) );
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(alphaParser.STRING, 0); }
		public TerminalNode MATH() { return getToken(alphaParser.MATH, 0); }
		public TerminalNode BOOL() { return getToken(alphaParser.BOOL, 0); }
		public TerminalNode REFERENCE() { return getToken(alphaParser.REFERENCE, 0); }
		public TerminalNode LIST() { return getToken(alphaParser.LIST, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnStmt);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__8);
				setState(124);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode LIST() { return getToken(alphaParser.LIST, 0); }
		public TerminalNode NONE() { return getToken(alphaParser.NONE, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_show);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__10);
				setState(129);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public List<AppendContext> append() {
			return getRuleContexts(AppendContext.class);
		}
		public AppendContext append(int i) {
			return getRuleContext(AppendContext.class,i);
		}
		public List<RemoveValContext> removeVal() {
			return getRuleContexts(RemoveValContext.class);
		}
		public RemoveValContext removeVal(int i) {
			return getRuleContext(RemoveValContext.class,i);
		}
		public List<RemoveAllContext> removeAll() {
			return getRuleContexts(RemoveAllContext.class);
		}
		public RemoveAllContext removeAll(int i) {
			return getRuleContext(RemoveAllContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<RemovePosContext> removePos() {
			return getRuleContexts(RemovePosContext.class);
		}
		public RemovePosContext removePos(int i) {
			return getRuleContext(RemovePosContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<ReturnStmtContext> returnStmt() {
			return getRuleContexts(ReturnStmtContext.class);
		}
		public ReturnStmtContext returnStmt(int i) {
			return getRuleContext(ReturnStmtContext.class,i);
		}
		public List<ExitContext> exit() {
			return getRuleContexts(ExitContext.class);
		}
		public ExitContext exit(int i) {
			return getRuleContext(ExitContext.class,i);
		}
		public List<ForLoopContext> forLoop() {
			return getRuleContexts(ForLoopContext.class);
		}
		public ForLoopContext forLoop(int i) {
			return getRuleContext(ForLoopContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__12);
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			match(T__13);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(136);
				match(WS);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(153);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__10:
					case T__11:
						{
						setState(142);
						show();
						}
						break;
					case T__16:
						{
						setState(143);
						assign();
						}
						break;
					case T__21:
						{
						setState(144);
						append();
						}
						break;
					case T__22:
						{
						setState(145);
						removeVal();
						}
						break;
					case T__24:
						{
						setState(146);
						removeAll();
						}
						break;
					case T__12:
						{
						setState(147);
						ifBlock();
						}
						break;
					case T__26:
						{
						setState(148);
						removePos();
						}
						break;
					case T__2:
						{
						setState(149);
						call();
						}
						break;
					case T__8:
					case T__9:
						{
						setState(150);
						returnStmt();
						}
						break;
					case T__1:
						{
						setState(151);
						exit();
						}
						break;
					case T__18:
						{
						setState(152);
						forLoop();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(155);
						match(T__7);
						setState(159);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(156);
							match(WS);
							}
							}
							setState(161);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(166); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public List<AppendContext> append() {
			return getRuleContexts(AppendContext.class);
		}
		public AppendContext append(int i) {
			return getRuleContext(AppendContext.class,i);
		}
		public List<RemoveValContext> removeVal() {
			return getRuleContexts(RemoveValContext.class);
		}
		public RemoveValContext removeVal(int i) {
			return getRuleContext(RemoveValContext.class,i);
		}
		public List<RemoveAllContext> removeAll() {
			return getRuleContexts(RemoveAllContext.class);
		}
		public RemoveAllContext removeAll(int i) {
			return getRuleContext(RemoveAllContext.class,i);
		}
		public List<RemovePosContext> removePos() {
			return getRuleContexts(RemovePosContext.class);
		}
		public RemovePosContext removePos(int i) {
			return getRuleContext(RemovePosContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<ReturnStmtContext> returnStmt() {
			return getRuleContexts(ReturnStmtContext.class);
		}
		public ReturnStmtContext returnStmt(int i) {
			return getRuleContext(ReturnStmtContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<ExitContext> exit() {
			return getRuleContexts(ExitContext.class);
		}
		public ExitContext exit(int i) {
			return getRuleContext(ExitContext.class,i);
		}
		public List<ForLoopContext> forLoop() {
			return getRuleContexts(ForLoopContext.class);
		}
		public ForLoopContext forLoop(int i) {
			return getRuleContext(ForLoopContext.class,i);
		}
		public ElifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStmt; }
	}

	public final ElifStmtContext elifStmt() throws RecognitionException {
		ElifStmtContext _localctx = new ElifStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elifStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__14);
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(170);
			match(T__13);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(171);
				match(WS);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(188);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__10:
					case T__11:
						{
						setState(177);
						show();
						}
						break;
					case T__16:
						{
						setState(178);
						assign();
						}
						break;
					case T__21:
						{
						setState(179);
						append();
						}
						break;
					case T__22:
						{
						setState(180);
						removeVal();
						}
						break;
					case T__24:
						{
						setState(181);
						removeAll();
						}
						break;
					case T__26:
						{
						setState(182);
						removePos();
						}
						break;
					case T__2:
						{
						setState(183);
						call();
						}
						break;
					case T__8:
					case T__9:
						{
						setState(184);
						returnStmt();
						}
						break;
					case T__12:
						{
						setState(185);
						ifBlock();
						}
						break;
					case T__1:
						{
						setState(186);
						exit();
						}
						break;
					case T__18:
						{
						setState(187);
						forLoop();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(190);
						match(T__7);
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(191);
							match(WS);
							}
							}
							setState(196);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(201); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public List<AppendContext> append() {
			return getRuleContexts(AppendContext.class);
		}
		public AppendContext append(int i) {
			return getRuleContext(AppendContext.class,i);
		}
		public List<RemoveValContext> removeVal() {
			return getRuleContexts(RemoveValContext.class);
		}
		public RemoveValContext removeVal(int i) {
			return getRuleContext(RemoveValContext.class,i);
		}
		public List<RemoveAllContext> removeAll() {
			return getRuleContexts(RemoveAllContext.class);
		}
		public RemoveAllContext removeAll(int i) {
			return getRuleContext(RemoveAllContext.class,i);
		}
		public List<RemovePosContext> removePos() {
			return getRuleContexts(RemovePosContext.class);
		}
		public RemovePosContext removePos(int i) {
			return getRuleContext(RemovePosContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<ReturnStmtContext> returnStmt() {
			return getRuleContexts(ReturnStmtContext.class);
		}
		public ReturnStmtContext returnStmt(int i) {
			return getRuleContext(ReturnStmtContext.class,i);
		}
		public List<ExitContext> exit() {
			return getRuleContexts(ExitContext.class);
		}
		public ExitContext exit(int i) {
			return getRuleContext(ExitContext.class,i);
		}
		public List<ForLoopContext> forLoop() {
			return getRuleContexts(ForLoopContext.class);
		}
		public ForLoopContext forLoop(int i) {
			return getRuleContext(ForLoopContext.class,i);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__15);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(204);
				match(WS);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(221);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__10:
					case T__11:
						{
						setState(210);
						show();
						}
						break;
					case T__16:
						{
						setState(211);
						assign();
						}
						break;
					case T__21:
						{
						setState(212);
						append();
						}
						break;
					case T__22:
						{
						setState(213);
						removeVal();
						}
						break;
					case T__24:
						{
						setState(214);
						removeAll();
						}
						break;
					case T__26:
						{
						setState(215);
						removePos();
						}
						break;
					case T__2:
						{
						setState(216);
						call();
						}
						break;
					case T__12:
						{
						setState(217);
						ifBlock();
						}
						break;
					case T__8:
					case T__9:
						{
						setState(218);
						returnStmt();
						}
						break;
					case T__1:
						{
						setState(219);
						exit();
						}
						break;
					case T__18:
						{
						setState(220);
						forLoop();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(223);
						match(T__7);
						setState(227);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(224);
							match(WS);
							}
							}
							setState(229);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(234); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 18, RULE_ifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			ifStmt();
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					elifStmt();
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(243);
				elseStmt();
				}
				break;
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
		public TerminalNode LIST() { return getToken(alphaParser.LIST, 0); }
		public TerminalNode INPUT() { return getToken(alphaParser.INPUT, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__16);
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(248);
			match(T__17);
			setState(249);
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(alphaParser.STRING, 0); }
		public TerminalNode LIST() { return getToken(alphaParser.LIST, 0); }
		public TerminalNode REFERENCE() { return getToken(alphaParser.REFERENCE, 0); }
		public TerminalNode INPUT() { return getToken(alphaParser.INPUT, 0); }
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
		public List<AppendContext> append() {
			return getRuleContexts(AppendContext.class);
		}
		public AppendContext append(int i) {
			return getRuleContext(AppendContext.class,i);
		}
		public List<RemoveValContext> removeVal() {
			return getRuleContexts(RemoveValContext.class);
		}
		public RemoveValContext removeVal(int i) {
			return getRuleContext(RemoveValContext.class,i);
		}
		public List<RemoveAllContext> removeAll() {
			return getRuleContexts(RemoveAllContext.class);
		}
		public RemoveAllContext removeAll(int i) {
			return getRuleContext(RemoveAllContext.class,i);
		}
		public List<RemovePosContext> removePos() {
			return getRuleContexts(RemovePosContext.class);
		}
		public RemovePosContext removePos(int i) {
			return getRuleContext(RemovePosContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<ReturnStmtContext> returnStmt() {
			return getRuleContexts(ReturnStmtContext.class);
		}
		public ReturnStmtContext returnStmt(int i) {
			return getRuleContext(ReturnStmtContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<ExitContext> exit() {
			return getRuleContexts(ExitContext.class);
		}
		public ExitContext exit(int i) {
			return getRuleContext(ExitContext.class,i);
		}
		public List<ForLoopContext> forLoop() {
			return getRuleContexts(ForLoopContext.class);
		}
		public ForLoopContext forLoop(int i) {
			return getRuleContext(ForLoopContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forLoop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__18);
			setState(252);
			match(STRING);
			setState(253);
			match(T__19);
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << REFERENCE) | (1L << LIST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(255);
			match(T__13);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(256);
				match(WS);
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(273);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__10:
					case T__11:
						{
						setState(262);
						show();
						}
						break;
					case T__16:
						{
						setState(263);
						assign();
						}
						break;
					case T__21:
						{
						setState(264);
						append();
						}
						break;
					case T__22:
						{
						setState(265);
						removeVal();
						}
						break;
					case T__24:
						{
						setState(266);
						removeAll();
						}
						break;
					case T__26:
						{
						setState(267);
						removePos();
						}
						break;
					case T__2:
						{
						setState(268);
						call();
						}
						break;
					case T__8:
					case T__9:
						{
						setState(269);
						returnStmt();
						}
						break;
					case T__12:
						{
						setState(270);
						ifBlock();
						}
						break;
					case T__1:
						{
						setState(271);
						exit();
						}
						break;
					case T__18:
						{
						setState(272);
						forLoop();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(275);
						match(T__7);
						setState(279);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(276);
							match(WS);
							}
							}
							setState(281);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(286); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public List<AppendContext> append() {
			return getRuleContexts(AppendContext.class);
		}
		public AppendContext append(int i) {
			return getRuleContext(AppendContext.class,i);
		}
		public List<RemoveValContext> removeVal() {
			return getRuleContexts(RemoveValContext.class);
		}
		public RemoveValContext removeVal(int i) {
			return getRuleContext(RemoveValContext.class,i);
		}
		public List<RemoveAllContext> removeAll() {
			return getRuleContexts(RemoveAllContext.class);
		}
		public RemoveAllContext removeAll(int i) {
			return getRuleContext(RemoveAllContext.class,i);
		}
		public List<RemovePosContext> removePos() {
			return getRuleContexts(RemovePosContext.class);
		}
		public RemovePosContext removePos(int i) {
			return getRuleContext(RemovePosContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<ReturnStmtContext> returnStmt() {
			return getRuleContexts(ReturnStmtContext.class);
		}
		public ReturnStmtContext returnStmt(int i) {
			return getRuleContext(ReturnStmtContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<ExitContext> exit() {
			return getRuleContexts(ExitContext.class);
		}
		public ExitContext exit(int i) {
			return getRuleContext(ExitContext.class,i);
		}
		public List<ForLoopContext> forLoop() {
			return getRuleContexts(ForLoopContext.class);
		}
		public ForLoopContext forLoop(int i) {
			return getRuleContext(ForLoopContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileLoop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__20);
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(290);
			match(T__13);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(291);
				match(WS);
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(308);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__10:
					case T__11:
						{
						setState(297);
						show();
						}
						break;
					case T__16:
						{
						setState(298);
						assign();
						}
						break;
					case T__21:
						{
						setState(299);
						append();
						}
						break;
					case T__22:
						{
						setState(300);
						removeVal();
						}
						break;
					case T__24:
						{
						setState(301);
						removeAll();
						}
						break;
					case T__26:
						{
						setState(302);
						removePos();
						}
						break;
					case T__2:
						{
						setState(303);
						call();
						}
						break;
					case T__8:
					case T__9:
						{
						setState(304);
						returnStmt();
						}
						break;
					case T__12:
						{
						setState(305);
						ifBlock();
						}
						break;
					case T__1:
						{
						setState(306);
						exit();
						}
						break;
					case T__18:
						{
						setState(307);
						forLoop();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(310);
						match(T__7);
						setState(314);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(311);
							match(WS);
							}
							}
							setState(316);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(321); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AppendContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(alphaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(alphaParser.STRING, i);
		}
		public TerminalNode MATH() { return getToken(alphaParser.MATH, 0); }
		public TerminalNode BOOL() { return getToken(alphaParser.BOOL, 0); }
		public TerminalNode REFERENCE() { return getToken(alphaParser.REFERENCE, 0); }
		public TerminalNode LIST() { return getToken(alphaParser.LIST, 0); }
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_append);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__21);
			setState(324);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(325);
			match(T__17);
			setState(326);
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

	public static class RemoveValContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(alphaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(alphaParser.STRING, i);
		}
		public TerminalNode MATH() { return getToken(alphaParser.MATH, 0); }
		public TerminalNode BOOL() { return getToken(alphaParser.BOOL, 0); }
		public TerminalNode REFERENCE() { return getToken(alphaParser.REFERENCE, 0); }
		public TerminalNode LIST() { return getToken(alphaParser.LIST, 0); }
		public RemoveValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeVal; }
	}

	public final RemoveValContext removeVal() throws RecognitionException {
		RemoveValContext _localctx = new RemoveValContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_removeVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__22);
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(330);
			match(T__23);
			setState(331);
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

	public static class RemoveAllContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(alphaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(alphaParser.STRING, i);
		}
		public TerminalNode MATH() { return getToken(alphaParser.MATH, 0); }
		public TerminalNode BOOL() { return getToken(alphaParser.BOOL, 0); }
		public TerminalNode REFERENCE() { return getToken(alphaParser.REFERENCE, 0); }
		public TerminalNode LIST() { return getToken(alphaParser.LIST, 0); }
		public RemoveAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeAll; }
	}

	public final RemoveAllContext removeAll() throws RecognitionException {
		RemoveAllContext _localctx = new RemoveAllContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_removeAll);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__24);
			setState(334);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(335);
			match(T__25);
			setState(336);
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

	public static class RemovePosContext extends ParserRuleContext {
		public TerminalNode MATH() { return getToken(alphaParser.MATH, 0); }
		public TerminalNode STRING() { return getToken(alphaParser.STRING, 0); }
		public RemovePosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removePos; }
	}

	public final RemovePosContext removePos() throws RecognitionException {
		RemovePosContext _localctx = new RemovePosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_removePos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__26);
			setState(339);
			match(MATH);
			setState(340);
			match(T__23);
			setState(341);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u015a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\62\n\2\3\2\3"+
		"\2\7\2\66\n\2\f\2\16\29\13\2\7\2;\n\2\f\2\16\2>\13\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\5\4M\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5U\n\5\f\5\16\5X\13\5\5\5Z\n\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\5\3\5\7\5s\n"+
		"\5\f\5\16\5v\13\5\5\5x\n\5\6\5z\n\5\r\5\16\5{\3\6\3\6\3\6\5\6\u0081\n"+
		"\6\3\7\3\7\3\7\5\7\u0086\n\7\3\b\3\b\3\b\3\b\7\b\u008c\n\b\f\b\16\b\u008f"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009c\n\b\3\b\3"+
		"\b\7\b\u00a0\n\b\f\b\16\b\u00a3\13\b\5\b\u00a5\n\b\6\b\u00a7\n\b\r\b\16"+
		"\b\u00a8\3\t\3\t\3\t\3\t\7\t\u00af\n\t\f\t\16\t\u00b2\13\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bf\n\t\3\t\3\t\7\t\u00c3\n\t\f"+
		"\t\16\t\u00c6\13\t\5\t\u00c8\n\t\6\t\u00ca\n\t\r\t\16\t\u00cb\3\n\3\n"+
		"\7\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00e0\n\n\3\n\3\n\7\n\u00e4\n\n\f\n\16\n\u00e7\13\n\5\n\u00e9"+
		"\n\n\6\n\u00eb\n\n\r\n\16\n\u00ec\3\13\3\13\7\13\u00f1\n\13\f\13\16\13"+
		"\u00f4\13\13\3\13\5\13\u00f7\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u0104\n\r\f\r\16\r\u0107\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0114\n\r\3\r\3\r\7\r\u0118\n\r\f\r\16\r\u011b\13"+
		"\r\5\r\u011d\n\r\6\r\u011f\n\r\r\r\16\r\u0120\3\16\3\16\3\16\3\16\7\16"+
		"\u0127\n\16\f\16\16\16\u012a\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0137\n\16\3\16\3\16\7\16\u013b\n\16\f\16\16"+
		"\16\u013e\13\16\5\16\u0140\n\16\6\16\u0142\n\16\r\16\16\16\u0143\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\7\3\2\37$\3\2 $\4\2\36\36 $\4\2  ##\4\2\37 $$\2\u01b3\2<\3"+
		"\2\2\2\4?\3\2\2\2\6A\3\2\2\2\bN\3\2\2\2\n\u0080\3\2\2\2\f\u0085\3\2\2"+
		"\2\16\u0087\3\2\2\2\20\u00aa\3\2\2\2\22\u00cd\3\2\2\2\24\u00ee\3\2\2\2"+
		"\26\u00f8\3\2\2\2\30\u00fd\3\2\2\2\32\u0122\3\2\2\2\34\u0145\3\2\2\2\36"+
		"\u014a\3\2\2\2 \u014f\3\2\2\2\"\u0154\3\2\2\2$\62\5\f\7\2%\62\5\24\13"+
		"\2&\62\5\26\f\2\'\62\5\32\16\2(\62\5\34\17\2)\62\5\36\20\2*\62\5 \21\2"+
		"+\62\5\"\22\2,\62\5\b\5\2-\62\5\6\4\2.\62\5\n\6\2/\62\5\4\3\2\60\62\5"+
		"\30\r\2\61$\3\2\2\2\61%\3\2\2\2\61&\3\2\2\2\61\'\3\2\2\2\61(\3\2\2\2\61"+
		")\3\2\2\2\61*\3\2\2\2\61+\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2"+
		"\61/\3\2\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\67\7\3\2\2\64\66\7%\2\2\65"+
		"\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\29\67\3\2\2"+
		"\2:\61\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\3\3\2\2\2><\3\2\2\2?@\7"+
		"\4\2\2@\5\3\2\2\2AB\7\5\2\2BL\7\"\2\2CD\7\6\2\2DI\t\2\2\2EF\7\7\2\2FH"+
		"\t\2\2\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2L"+
		"C\3\2\2\2LM\3\2\2\2M\7\3\2\2\2NO\7\b\2\2OY\7\"\2\2PQ\7\6\2\2QV\7\"\2\2"+
		"RS\7\7\2\2SU\7\"\2\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2"+
		"XV\3\2\2\2YP\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[_\7\t\2\2\\^\7%\2\2]\\\3\2\2"+
		"\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`y\3\2\2\2a_\3\2\2\2bo\5\f\7\2co\5\26"+
		"\f\2do\5\34\17\2eo\5\36\20\2fo\5 \21\2go\5\"\22\2ho\5\24\13\2io\5\32\16"+
		"\2jo\5\6\4\2ko\5\n\6\2lo\5\4\3\2mo\5\30\r\2nb\3\2\2\2nc\3\2\2\2nd\3\2"+
		"\2\2ne\3\2\2\2nf\3\2\2\2ng\3\2\2\2nh\3\2\2\2ni\3\2\2\2nj\3\2\2\2nk\3\2"+
		"\2\2nl\3\2\2\2nm\3\2\2\2ow\3\2\2\2pt\7\n\2\2qs\7%\2\2rq\3\2\2\2sv\3\2"+
		"\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wp\3\2\2\2wx\3\2\2\2xz\3\2"+
		"\2\2yn\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\t\3\2\2\2}~\7\13\2\2~\u0081"+
		"\t\3\2\2\177\u0081\7\f\2\2\u0080}\3\2\2\2\u0080\177\3\2\2\2\u0081\13\3"+
		"\2\2\2\u0082\u0083\7\r\2\2\u0083\u0086\t\4\2\2\u0084\u0086\7\16\2\2\u0085"+
		"\u0082\3\2\2\2\u0085\u0084\3\2\2\2\u0086\r\3\2\2\2\u0087\u0088\7\17\2"+
		"\2\u0088\u0089\t\5\2\2\u0089\u008d\7\20\2\2\u008a\u008c\7%\2\2\u008b\u008a"+
		"\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u00a6\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u009c\5\f\7\2\u0091\u009c\5\26"+
		"\f\2\u0092\u009c\5\34\17\2\u0093\u009c\5\36\20\2\u0094\u009c\5 \21\2\u0095"+
		"\u009c\5\24\13\2\u0096\u009c\5\"\22\2\u0097\u009c\5\6\4\2\u0098\u009c"+
		"\5\n\6\2\u0099\u009c\5\4\3\2\u009a\u009c\5\30\r\2\u009b\u0090\3\2\2\2"+
		"\u009b\u0091\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0094"+
		"\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009b"+
		"\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u00a4\3\2"+
		"\2\2\u009d\u00a1\7\n\2\2\u009e\u00a0\7%\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u009b\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00ab\7\21\2\2\u00ab\u00ac"+
		"\t\5\2\2\u00ac\u00b0\7\20\2\2\u00ad\u00af\7%\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00c9\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00bf\5\f\7\2\u00b4\u00bf\5\26\f\2\u00b5"+
		"\u00bf\5\34\17\2\u00b6\u00bf\5\36\20\2\u00b7\u00bf\5 \21\2\u00b8\u00bf"+
		"\5\"\22\2\u00b9\u00bf\5\6\4\2\u00ba\u00bf\5\n\6\2\u00bb\u00bf\5\24\13"+
		"\2\u00bc\u00bf\5\4\3\2\u00bd\u00bf\5\30\r\2\u00be\u00b3\3\2\2\2\u00be"+
		"\u00b4\3\2\2\2\u00be\u00b5\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00b7\3\2"+
		"\2\2\u00be\u00b8\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00be"+
		"\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c7\3\2"+
		"\2\2\u00c0\u00c4\7\n\2\2\u00c1\u00c3\7%\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00be\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\21\3\2\2\2\u00cd\u00d1\7\22\2\2\u00ce\u00d0"+
		"\7%\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00ea\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00e0\5\f"+
		"\7\2\u00d5\u00e0\5\26\f\2\u00d6\u00e0\5\34\17\2\u00d7\u00e0\5\36\20\2"+
		"\u00d8\u00e0\5 \21\2\u00d9\u00e0\5\"\22\2\u00da\u00e0\5\6\4\2\u00db\u00e0"+
		"\5\24\13\2\u00dc\u00e0\5\n\6\2\u00dd\u00e0\5\4\3\2\u00de\u00e0\5\30\r"+
		"\2\u00df\u00d4\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d7"+
		"\3\2\2\2\u00df\u00d8\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00da\3\2\2\2\u00df"+
		"\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2"+
		"\2\2\u00e0\u00e8\3\2\2\2\u00e1\u00e5\7\n\2\2\u00e2\u00e4\7%\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00df\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\23\3\2\2\2\u00ee\u00f2"+
		"\5\16\b\2\u00ef\u00f1\5\20\t\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00f7\5\22\n\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2"+
		"\u00f7\25\3\2\2\2\u00f8\u00f9\7\23\2\2\u00f9\u00fa\t\2\2\2\u00fa\u00fb"+
		"\7\24\2\2\u00fb\u00fc\7\"\2\2\u00fc\27\3\2\2\2\u00fd\u00fe\7\25\2\2\u00fe"+
		"\u00ff\7\"\2\2\u00ff\u0100\7\26\2\2\u0100\u0101\t\6\2\2\u0101\u0105\7"+
		"\20\2\2\u0102\u0104\7%\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u011e\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u0114\5\f\7\2\u0109\u0114\5\26\f\2\u010a\u0114\5\34\17\2\u010b"+
		"\u0114\5\36\20\2\u010c\u0114\5 \21\2\u010d\u0114\5\"\22\2\u010e\u0114"+
		"\5\6\4\2\u010f\u0114\5\n\6\2\u0110\u0114\5\24\13\2\u0111\u0114\5\4\3\2"+
		"\u0112\u0114\5\30\r\2\u0113\u0108\3\2\2\2\u0113\u0109\3\2\2\2\u0113\u010a"+
		"\3\2\2\2\u0113\u010b\3\2\2\2\u0113\u010c\3\2\2\2\u0113\u010d\3\2\2\2\u0113"+
		"\u010e\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0112\3\2\2\2\u0114\u011c\3\2\2\2\u0115\u0119\7\n\2\2\u0116"+
		"\u0118\7%\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u0115\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0113\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\31\3\2\2\2\u0122\u0123\7\27\2\2\u0123\u0124\t\5\2\2\u0124\u0128\7\20"+
		"\2\2\u0125\u0127\7%\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0141\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u0137\5\f\7\2\u012c\u0137\5\26\f\2\u012d\u0137\5\34\17\2\u012e"+
		"\u0137\5\36\20\2\u012f\u0137\5 \21\2\u0130\u0137\5\"\22\2\u0131\u0137"+
		"\5\6\4\2\u0132\u0137\5\n\6\2\u0133\u0137\5\24\13\2\u0134\u0137\5\4\3\2"+
		"\u0135\u0137\5\30\r\2\u0136\u012b\3\2\2\2\u0136\u012c\3\2\2\2\u0136\u012d"+
		"\3\2\2\2\u0136\u012e\3\2\2\2\u0136\u012f\3\2\2\2\u0136\u0130\3\2\2\2\u0136"+
		"\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0135\3\2\2\2\u0137\u013f\3\2\2\2\u0138\u013c\7\n\2\2\u0139"+
		"\u013b\7%\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0138\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0136\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\33\3\2\2\2\u0145\u0146\7\30\2\2\u0146\u0147\t\3\2\2\u0147\u0148\7\24"+
		"\2\2\u0148\u0149\7\"\2\2\u0149\35\3\2\2\2\u014a\u014b\7\31\2\2\u014b\u014c"+
		"\t\3\2\2\u014c\u014d\7\32\2\2\u014d\u014e\7\"\2\2\u014e\37\3\2\2\2\u014f"+
		"\u0150\7\33\2\2\u0150\u0151\t\3\2\2\u0151\u0152\7\34\2\2\u0152\u0153\7"+
		"\"\2\2\u0153!\3\2\2\2\u0154\u0155\7\35\2\2\u0155\u0156\7!\2\2\u0156\u0157"+
		"\7\32\2\2\u0157\u0158\7\"\2\2\u0158#\3\2\2\2+\61\67<ILVY_ntw{\u0080\u0085"+
		"\u008d\u009b\u00a1\u00a4\u00a8\u00b0\u00be\u00c4\u00c7\u00cb\u00d1\u00df"+
		"\u00e5\u00e8\u00ec\u00f2\u00f6\u0105\u0113\u0119\u011c\u0120\u0128\u0136"+
		"\u013c\u013f\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}