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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, NONE=24, INPUT=25, 
		REFERENCE=26, MATH=27, INTEGER=28, FLOAT=29, STRING=30, STRING_FACTOR=31, 
		LITERAL_STRING=32, STRING_LITERAL=33, BOOL=34, BOOL_LITERAL=35, LIST=36, 
		ARGS=37, WS=38, COMMENT=39;
	public static final int
		RULE_prog = 0, RULE_exit = 1, RULE_call = 2, RULE_define = 3, RULE_returnStmt = 4, 
		RULE_show = 5, RULE_ifStmt = 6, RULE_elifStmt = 7, RULE_elseStmt = 8, 
		RULE_ifBlock = 9, RULE_assign = 10, RULE_whileLoop = 11, RULE_append = 12, 
		RULE_removeVal = 13, RULE_removeAll = 14, RULE_removePos = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "exit", "call", "define", "returnStmt", "show", "ifStmt", "elifStmt", 
			"elseStmt", "ifBlock", "assign", "whileLoop", "append", "removeVal", 
			"removeAll", "removePos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'Exit'", "'Call '", "' on '", "'and'", "'Define '", "' as:'", 
			"','", "'Return '", "'Print '", "'If '", "':'", "'otherwise if '", "'otherwise:'", 
			"'Assign '", "' to '", "'While '", "'Append '", "'Remove '", "' from '", 
			"'Remove all '", "'s from '", "'Remove position '", "'None'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NONE", "INPUT", "REFERENCE", "MATH", "INTEGER", "FLOAT", "STRING", "STRING_FACTOR", 
			"LITERAL_STRING", "STRING_LITERAL", "BOOL", "BOOL_LITERAL", "LIST", "ARGS", 
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__22))) != 0)) {
				{
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(32);
					show();
					}
					break;
				case T__10:
					{
					setState(33);
					ifBlock();
					}
					break;
				case T__14:
					{
					setState(34);
					assign();
					}
					break;
				case T__16:
					{
					setState(35);
					whileLoop();
					}
					break;
				case T__17:
					{
					setState(36);
					append();
					}
					break;
				case T__18:
					{
					setState(37);
					removeVal();
					}
					break;
				case T__20:
					{
					setState(38);
					removeAll();
					}
					break;
				case T__22:
					{
					setState(39);
					removePos();
					}
					break;
				case T__5:
					{
					setState(40);
					define();
					}
					break;
				case T__2:
					{
					setState(41);
					call();
					}
					break;
				case T__8:
					{
					setState(42);
					returnStmt();
					}
					break;
				case T__1:
					{
					setState(43);
					exit();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(46);
				match(T__0);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(47);
					match(WS);
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(57);
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
			setState(58);
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
			setState(60);
			match(T__2);
			setState(61);
			match(STRING);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(62);
				match(T__3);
				setState(63);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(64);
					match(T__4);
					setState(65);
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
					setState(70);
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
			setState(73);
			match(T__5);
			setState(74);
			match(STRING);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(75);
				match(T__3);
				setState(76);
				match(STRING);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(77);
					match(T__4);
					setState(78);
					match(STRING);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(86);
			match(T__6);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(87);
				match(WS);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(93);
					show();
					}
					break;
				case T__14:
					{
					setState(94);
					assign();
					}
					break;
				case T__17:
					{
					setState(95);
					append();
					}
					break;
				case T__18:
					{
					setState(96);
					removeVal();
					}
					break;
				case T__20:
					{
					setState(97);
					removeAll();
					}
					break;
				case T__22:
					{
					setState(98);
					removePos();
					}
					break;
				case T__10:
					{
					setState(99);
					ifBlock();
					}
					break;
				case T__16:
					{
					setState(100);
					whileLoop();
					}
					break;
				case T__2:
					{
					setState(101);
					call();
					}
					break;
				case T__8:
					{
					setState(102);
					returnStmt();
					}
					break;
				case T__1:
					{
					setState(103);
					exit();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(106);
					match(T__7);
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(107);
						match(WS);
						}
						}
						setState(112);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__22))) != 0) );
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
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__8);
			setState(120);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__9);
			setState(123);
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
			setState(125);
			match(T__10);
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			match(T__11);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(128);
				match(WS);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(144);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__9:
						{
						setState(134);
						show();
						}
						break;
					case T__14:
						{
						setState(135);
						assign();
						}
						break;
					case T__17:
						{
						setState(136);
						append();
						}
						break;
					case T__18:
						{
						setState(137);
						removeVal();
						}
						break;
					case T__20:
						{
						setState(138);
						removeAll();
						}
						break;
					case T__10:
						{
						setState(139);
						ifBlock();
						}
						break;
					case T__22:
						{
						setState(140);
						removePos();
						}
						break;
					case T__2:
						{
						setState(141);
						call();
						}
						break;
					case T__8:
						{
						setState(142);
						returnStmt();
						}
						break;
					case T__1:
						{
						setState(143);
						exit();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(146);
						match(T__7);
						setState(150);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(147);
							match(WS);
							}
							}
							setState(152);
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
				setState(157); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			setState(159);
			match(T__12);
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(161);
			match(T__11);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(162);
				match(WS);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(178);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__9:
						{
						setState(168);
						show();
						}
						break;
					case T__14:
						{
						setState(169);
						assign();
						}
						break;
					case T__17:
						{
						setState(170);
						append();
						}
						break;
					case T__18:
						{
						setState(171);
						removeVal();
						}
						break;
					case T__20:
						{
						setState(172);
						removeAll();
						}
						break;
					case T__22:
						{
						setState(173);
						removePos();
						}
						break;
					case T__2:
						{
						setState(174);
						call();
						}
						break;
					case T__8:
						{
						setState(175);
						returnStmt();
						}
						break;
					case T__10:
						{
						setState(176);
						ifBlock();
						}
						break;
					case T__1:
						{
						setState(177);
						exit();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(180);
						match(T__7);
						setState(184);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(181);
							match(WS);
							}
							}
							setState(186);
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
				setState(191); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
			setState(193);
			match(T__13);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(194);
				match(WS);
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(210);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__9:
						{
						setState(200);
						show();
						}
						break;
					case T__14:
						{
						setState(201);
						assign();
						}
						break;
					case T__17:
						{
						setState(202);
						append();
						}
						break;
					case T__18:
						{
						setState(203);
						removeVal();
						}
						break;
					case T__20:
						{
						setState(204);
						removeAll();
						}
						break;
					case T__22:
						{
						setState(205);
						removePos();
						}
						break;
					case T__2:
						{
						setState(206);
						call();
						}
						break;
					case T__10:
						{
						setState(207);
						ifBlock();
						}
						break;
					case T__8:
						{
						setState(208);
						returnStmt();
						}
						break;
					case T__1:
						{
						setState(209);
						exit();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(212);
						match(T__7);
						setState(216);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(213);
							match(WS);
							}
							}
							setState(218);
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
				setState(223); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(225);
			ifStmt();
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					elifStmt();
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(232);
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
			setState(235);
			match(T__14);
			setState(236);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(237);
			match(T__15);
			setState(238);
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
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileLoop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__16);
			setState(241);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(242);
			match(T__11);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(243);
				match(WS);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(259);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__9:
						{
						setState(249);
						show();
						}
						break;
					case T__14:
						{
						setState(250);
						assign();
						}
						break;
					case T__17:
						{
						setState(251);
						append();
						}
						break;
					case T__18:
						{
						setState(252);
						removeVal();
						}
						break;
					case T__20:
						{
						setState(253);
						removeAll();
						}
						break;
					case T__22:
						{
						setState(254);
						removePos();
						}
						break;
					case T__2:
						{
						setState(255);
						call();
						}
						break;
					case T__8:
						{
						setState(256);
						returnStmt();
						}
						break;
					case T__10:
						{
						setState(257);
						ifBlock();
						}
						break;
					case T__1:
						{
						setState(258);
						exit();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(268);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(261);
						match(T__7);
						setState(265);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(262);
							match(WS);
							}
							}
							setState(267);
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
				setState(272); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_append);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__17);
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(276);
			match(T__15);
			setState(277);
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
		public RemoveValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeVal; }
	}

	public final RemoveValContext removeVal() throws RecognitionException {
		RemoveValContext _localctx = new RemoveValContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_removeVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__18);
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(281);
			match(T__19);
			setState(282);
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
		public RemoveAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeAll; }
	}

	public final RemoveAllContext removeAll() throws RecognitionException {
		RemoveAllContext _localctx = new RemoveAllContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_removeAll);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__20);
			setState(285);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(286);
			match(T__21);
			setState(287);
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
		enterRule(_localctx, 30, RULE_removePos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__22);
			setState(290);
			match(MATH);
			setState(291);
			match(T__19);
			setState(292);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2/\n\2\3\2\3\2\7\2\63\n\2\f\2"+
		"\16\2\66\13\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4E\n\4\f\4\16\4H\13\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5R\n\5\f\5"+
		"\16\5U\13\5\5\5W\n\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\5\3\5\7\5o\n\5\f\5\16\5r\13\5\5"+
		"\5t\n\5\6\5v\n\5\r\5\16\5w\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b"+
		"\u0084\n\b\f\b\16\b\u0087\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0093\n\b\3\b\3\b\7\b\u0097\n\b\f\b\16\b\u009a\13\b\5\b\u009c\n\b"+
		"\6\b\u009e\n\b\r\b\16\b\u009f\3\t\3\t\3\t\3\t\7\t\u00a6\n\t\f\t\16\t\u00a9"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\t\3\t\7"+
		"\t\u00b9\n\t\f\t\16\t\u00bc\13\t\5\t\u00be\n\t\6\t\u00c0\n\t\r\t\16\t"+
		"\u00c1\3\n\3\n\7\n\u00c6\n\n\f\n\16\n\u00c9\13\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00d5\n\n\3\n\3\n\7\n\u00d9\n\n\f\n\16\n\u00dc"+
		"\13\n\5\n\u00de\n\n\6\n\u00e0\n\n\r\n\16\n\u00e1\3\13\3\13\7\13\u00e6"+
		"\n\13\f\13\16\13\u00e9\13\13\3\13\5\13\u00ec\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\7\r\u00f7\n\r\f\r\16\r\u00fa\13\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0106\n\r\3\r\3\r\7\r\u010a\n\r\f\r\16\r\u010d"+
		"\13\r\5\r\u010f\n\r\6\r\u0111\n\r\r\r\16\r\u0112\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\7\6\2\33"+
		"\35  $$&&\6\2\34\35  $$&&\7\2\32\32\34\35  $$&&\4\2\34\34$$\5\2\34\35"+
		"  $$\2\u016d\29\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\bK\3\2\2\2\ny\3\2\2\2\f"+
		"|\3\2\2\2\16\177\3\2\2\2\20\u00a1\3\2\2\2\22\u00c3\3\2\2\2\24\u00e3\3"+
		"\2\2\2\26\u00ed\3\2\2\2\30\u00f2\3\2\2\2\32\u0114\3\2\2\2\34\u0119\3\2"+
		"\2\2\36\u011e\3\2\2\2 \u0123\3\2\2\2\"/\5\f\7\2#/\5\24\13\2$/\5\26\f\2"+
		"%/\5\30\r\2&/\5\32\16\2\'/\5\34\17\2(/\5\36\20\2)/\5 \21\2*/\5\b\5\2+"+
		"/\5\6\4\2,/\5\n\6\2-/\5\4\3\2.\"\3\2\2\2.#\3\2\2\2.$\3\2\2\2.%\3\2\2\2"+
		".&\3\2\2\2.\'\3\2\2\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2"+
		"\2.-\3\2\2\2/\60\3\2\2\2\60\64\7\3\2\2\61\63\7(\2\2\62\61\3\2\2\2\63\66"+
		"\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\67.\3\2"+
		"\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;9\3\2\2\2<=\7\4\2\2=\5"+
		"\3\2\2\2>?\7\5\2\2?I\7 \2\2@A\7\6\2\2AF\t\2\2\2BC\7\7\2\2CE\t\2\2\2DB"+
		"\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GJ\3\2\2\2HF\3\2\2\2I@\3\2\2\2I"+
		"J\3\2\2\2J\7\3\2\2\2KL\7\b\2\2LV\7 \2\2MN\7\6\2\2NS\7 \2\2OP\7\7\2\2P"+
		"R\7 \2\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2US\3\2\2\2V"+
		"M\3\2\2\2VW\3\2\2\2WX\3\2\2\2X\\\7\t\2\2Y[\7(\2\2ZY\3\2\2\2[^\3\2\2\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]u\3\2\2\2^\\\3\2\2\2_k\5\f\7\2`k\5\26\f\2ak\5\32"+
		"\16\2bk\5\34\17\2ck\5\36\20\2dk\5 \21\2ek\5\24\13\2fk\5\30\r\2gk\5\6\4"+
		"\2hk\5\n\6\2ik\5\4\3\2j_\3\2\2\2j`\3\2\2\2ja\3\2\2\2jb\3\2\2\2jc\3\2\2"+
		"\2jd\3\2\2\2je\3\2\2\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2ks\3\2\2"+
		"\2lp\7\n\2\2mo\7(\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2"+
		"\2rp\3\2\2\2sl\3\2\2\2st\3\2\2\2tv\3\2\2\2uj\3\2\2\2vw\3\2\2\2wu\3\2\2"+
		"\2wx\3\2\2\2x\t\3\2\2\2yz\7\13\2\2z{\t\3\2\2{\13\3\2\2\2|}\7\f\2\2}~\t"+
		"\4\2\2~\r\3\2\2\2\177\u0080\7\r\2\2\u0080\u0081\t\5\2\2\u0081\u0085\7"+
		"\16\2\2\u0082\u0084\7(\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u009d\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0093\5\f\7\2\u0089\u0093\5\26\f\2\u008a\u0093\5\32\16\2\u008b"+
		"\u0093\5\34\17\2\u008c\u0093\5\36\20\2\u008d\u0093\5\24\13\2\u008e\u0093"+
		"\5 \21\2\u008f\u0093\5\6\4\2\u0090\u0093\5\n\6\2\u0091\u0093\5\4\3\2\u0092"+
		"\u0088\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008b\3\2"+
		"\2\2\u0092\u008c\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092"+
		"\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u009b\3\2"+
		"\2\2\u0094\u0098\7\n\2\2\u0095\u0097\7(\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u0094\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u0092\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\17\3\2\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00a3"+
		"\t\5\2\2\u00a3\u00a7\7\16\2\2\u00a4\u00a6\7(\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00bf\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00b5\5\f\7\2\u00ab\u00b5\5\26\f\2\u00ac"+
		"\u00b5\5\32\16\2\u00ad\u00b5\5\34\17\2\u00ae\u00b5\5\36\20\2\u00af\u00b5"+
		"\5 \21\2\u00b0\u00b5\5\6\4\2\u00b1\u00b5\5\n\6\2\u00b2\u00b5\5\24\13\2"+
		"\u00b3\u00b5\5\4\3\2\u00b4\u00aa\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00ac"+
		"\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4"+
		"\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2"+
		"\2\2\u00b5\u00bd\3\2\2\2\u00b6\u00ba\7\n\2\2\u00b7\u00b9\7(\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b4\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\21\3\2\2\2\u00c3\u00c7"+
		"\7\20\2\2\u00c4\u00c6\7(\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00df\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00d5\5\f\7\2\u00cb\u00d5\5\26\f\2\u00cc\u00d5\5\32\16\2\u00cd"+
		"\u00d5\5\34\17\2\u00ce\u00d5\5\36\20\2\u00cf\u00d5\5 \21\2\u00d0\u00d5"+
		"\5\6\4\2\u00d1\u00d5\5\24\13\2\u00d2\u00d5\5\n\6\2\u00d3\u00d5\5\4\3\2"+
		"\u00d4\u00ca\3\2\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00cd"+
		"\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4"+
		"\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00dd\3\2"+
		"\2\2\u00d6\u00da\7\n\2\2\u00d7\u00d9\7(\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00d4\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\23\3\2\2\2\u00e3\u00e7\5\16\b\2\u00e4\u00e6"+
		"\5\20\t\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ec"+
		"\5\22\n\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\25\3\2\2\2\u00ed"+
		"\u00ee\7\21\2\2\u00ee\u00ef\t\2\2\2\u00ef\u00f0\7\22\2\2\u00f0\u00f1\7"+
		" \2\2\u00f1\27\3\2\2\2\u00f2\u00f3\7\23\2\2\u00f3\u00f4\t\5\2\2\u00f4"+
		"\u00f8\7\16\2\2\u00f5\u00f7\7(\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0110\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u0106\5\f\7\2\u00fc\u0106\5\26\f\2\u00fd\u0106\5"+
		"\32\16\2\u00fe\u0106\5\34\17\2\u00ff\u0106\5\36\20\2\u0100\u0106\5 \21"+
		"\2\u0101\u0106\5\6\4\2\u0102\u0106\5\n\6\2\u0103\u0106\5\24\13\2\u0104"+
		"\u0106\5\4\3\2\u0105\u00fb\3\2\2\2\u0105\u00fc\3\2\2\2\u0105\u00fd\3\2"+
		"\2\2\u0105\u00fe\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0100\3\2\2\2\u0105"+
		"\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2"+
		"\2\2\u0106\u010e\3\2\2\2\u0107\u010b\7\n\2\2\u0108\u010a\7(\2\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0107\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u0105\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\31\3\2\2\2\u0114\u0115"+
		"\7\24\2\2\u0115\u0116\t\6\2\2\u0116\u0117\7\22\2\2\u0117\u0118\7 \2\2"+
		"\u0118\33\3\2\2\2\u0119\u011a\7\25\2\2\u011a\u011b\t\6\2\2\u011b\u011c"+
		"\7\26\2\2\u011c\u011d\7 \2\2\u011d\35\3\2\2\2\u011e\u011f\7\27\2\2\u011f"+
		"\u0120\t\6\2\2\u0120\u0121\7\30\2\2\u0121\u0122\7 \2\2\u0122\37\3\2\2"+
		"\2\u0123\u0124\7\31\2\2\u0124\u0125\7\35\2\2\u0125\u0126\7\26\2\2\u0126"+
		"\u0127\7 \2\2\u0127!\3\2\2\2$.\649FISV\\jpsw\u0085\u0092\u0098\u009b\u009f"+
		"\u00a7\u00b4\u00ba\u00bd\u00c1\u00c7\u00d4\u00da\u00dd\u00e1\u00e7\u00eb"+
		"\u00f8\u0105\u010b\u010e\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}