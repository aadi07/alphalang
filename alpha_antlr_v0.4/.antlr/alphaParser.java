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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, INPUT=23, REFERENCE=24, 
		MATH=25, INTEGER=26, FLOAT=27, STRING=28, STRING_FACTOR=29, LITERAL_STRING=30, 
		STRING_LITERAL=31, BOOL=32, BOOL_LITERAL=33, LIST=34, ARGS=35, WS=36, 
		COMMENT=37;
	public static final int
		RULE_prog = 0, RULE_call = 1, RULE_define = 2, RULE_returnStmt = 3, RULE_show = 4, 
		RULE_ifStmt = 5, RULE_elifStmt = 6, RULE_elseStmt = 7, RULE_ifBlock = 8, 
		RULE_assign = 9, RULE_whileLoop = 10, RULE_append = 11, RULE_removeVal = 12, 
		RULE_removeAll = 13, RULE_removePos = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "call", "define", "returnStmt", "show", "ifStmt", "elifStmt", 
			"elseStmt", "ifBlock", "assign", "whileLoop", "append", "removeVal", 
			"removeAll", "removePos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'Call '", "' on '", "'and'", "'Define '", "' as:'", "','", 
			"'Return '", "'Print '", "'If '", "':'", "'otherwise if '", "'otherwise:'", 
			"'Assign '", "' to '", "'While '", "'Append '", "'Remove '", "' from '", 
			"'Remove all '", "'s from '", "'Remove position '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "INPUT", 
			"REFERENCE", "MATH", "INTEGER", "FLOAT", "STRING", "STRING_FACTOR", "LITERAL_STRING", 
			"STRING_LITERAL", "BOOL", "BOOL_LITERAL", "LIST", "ARGS", "WS", "COMMENT"
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21))) != 0)) {
				{
				{
				setState(41);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(30);
					show();
					}
					break;
				case T__9:
					{
					setState(31);
					ifBlock();
					}
					break;
				case T__13:
					{
					setState(32);
					assign();
					}
					break;
				case T__15:
					{
					setState(33);
					whileLoop();
					}
					break;
				case T__16:
					{
					setState(34);
					append();
					}
					break;
				case T__17:
					{
					setState(35);
					removeVal();
					}
					break;
				case T__19:
					{
					setState(36);
					removeAll();
					}
					break;
				case T__21:
					{
					setState(37);
					removePos();
					}
					break;
				case T__4:
					{
					setState(38);
					define();
					}
					break;
				case T__1:
					{
					setState(39);
					call();
					}
					break;
				case T__7:
					{
					setState(40);
					returnStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43);
				match(T__0);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(44);
					match(WS);
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(54);
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
		enterRule(_localctx, 2, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__1);
			setState(56);
			match(STRING);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(57);
				match(T__2);
				setState(58);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(59);
					match(T__3);
					setState(60);
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
					setState(65);
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
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__4);
			setState(69);
			match(STRING);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(70);
				match(T__2);
				setState(71);
				match(STRING);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(72);
					match(T__3);
					setState(73);
					match(STRING);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(81);
			match(T__5);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(82);
				match(WS);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(88);
					show();
					}
					break;
				case T__13:
					{
					setState(89);
					assign();
					}
					break;
				case T__16:
					{
					setState(90);
					append();
					}
					break;
				case T__17:
					{
					setState(91);
					removeVal();
					}
					break;
				case T__19:
					{
					setState(92);
					removeAll();
					}
					break;
				case T__21:
					{
					setState(93);
					removePos();
					}
					break;
				case T__9:
					{
					setState(94);
					ifBlock();
					}
					break;
				case T__15:
					{
					setState(95);
					whileLoop();
					}
					break;
				case T__1:
					{
					setState(96);
					call();
					}
					break;
				case T__7:
					{
					setState(97);
					returnStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(100);
					match(T__6);
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(101);
						match(WS);
						}
						}
						setState(106);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21))) != 0) );
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
		enterRule(_localctx, 6, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__7);
			setState(114);
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
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__8);
			setState(117);
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
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__9);
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(121);
			match(T__10);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(122);
				match(WS);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(136);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(128);
						show();
						}
						break;
					case T__13:
						{
						setState(129);
						assign();
						}
						break;
					case T__16:
						{
						setState(130);
						append();
						}
						break;
					case T__17:
						{
						setState(131);
						removeVal();
						}
						break;
					case T__19:
						{
						setState(132);
						removeAll();
						}
						break;
					case T__21:
						{
						setState(133);
						removePos();
						}
						break;
					case T__1:
						{
						setState(134);
						call();
						}
						break;
					case T__7:
						{
						setState(135);
						returnStmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(138);
						match(T__6);
						setState(142);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(139);
							match(WS);
							}
							}
							setState(144);
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
				setState(149); 
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
		public ElifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStmt; }
	}

	public final ElifStmtContext elifStmt() throws RecognitionException {
		ElifStmtContext _localctx = new ElifStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elifStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__11);
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(153);
			match(T__10);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(154);
				match(WS);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(168);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(160);
						show();
						}
						break;
					case T__13:
						{
						setState(161);
						assign();
						}
						break;
					case T__16:
						{
						setState(162);
						append();
						}
						break;
					case T__17:
						{
						setState(163);
						removeVal();
						}
						break;
					case T__19:
						{
						setState(164);
						removeAll();
						}
						break;
					case T__21:
						{
						setState(165);
						removePos();
						}
						break;
					case T__1:
						{
						setState(166);
						call();
						}
						break;
					case T__7:
						{
						setState(167);
						returnStmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(170);
						match(T__6);
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
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(181); 
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
		public List<ReturnStmtContext> returnStmt() {
			return getRuleContexts(ReturnStmtContext.class);
		}
		public ReturnStmtContext returnStmt(int i) {
			return getRuleContext(ReturnStmtContext.class,i);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__12);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(184);
				match(WS);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(198);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(190);
						show();
						}
						break;
					case T__13:
						{
						setState(191);
						assign();
						}
						break;
					case T__16:
						{
						setState(192);
						append();
						}
						break;
					case T__17:
						{
						setState(193);
						removeVal();
						}
						break;
					case T__19:
						{
						setState(194);
						removeAll();
						}
						break;
					case T__21:
						{
						setState(195);
						removePos();
						}
						break;
					case T__1:
						{
						setState(196);
						call();
						}
						break;
					case T__7:
						{
						setState(197);
						returnStmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(200);
						match(T__6);
						setState(204);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(201);
							match(WS);
							}
							}
							setState(206);
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
				setState(211); 
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
		enterRule(_localctx, 16, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			ifStmt();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(214);
				elifStmt();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(220);
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
		public TerminalNode LIST() { return getToken(alphaParser.LIST, 0); }
		public TerminalNode INPUT() { return getToken(alphaParser.INPUT, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__13);
			setState(224);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(225);
			match(T__14);
			setState(226);
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
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileLoop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__15);
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(230);
			match(T__10);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(231);
				match(WS);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(245);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(237);
						show();
						}
						break;
					case T__13:
						{
						setState(238);
						assign();
						}
						break;
					case T__16:
						{
						setState(239);
						append();
						}
						break;
					case T__17:
						{
						setState(240);
						removeVal();
						}
						break;
					case T__19:
						{
						setState(241);
						removeAll();
						}
						break;
					case T__21:
						{
						setState(242);
						removePos();
						}
						break;
					case T__1:
						{
						setState(243);
						call();
						}
						break;
					case T__7:
						{
						setState(244);
						returnStmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(247);
						match(T__6);
						setState(251);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(248);
							match(WS);
							}
							}
							setState(253);
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
				setState(258); 
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
		enterRule(_localctx, 22, RULE_append);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__16);
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(262);
			match(T__14);
			setState(263);
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
		enterRule(_localctx, 24, RULE_removeVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__17);
			setState(266);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(267);
			match(T__18);
			setState(268);
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
		enterRule(_localctx, 26, RULE_removeAll);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__19);
			setState(271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(272);
			match(T__20);
			setState(273);
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
		enterRule(_localctx, 28, RULE_removePos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__21);
			setState(276);
			match(MATH);
			setState(277);
			match(T__18);
			setState(278);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2,\n\2\3\2\3\2\7\2\60\n\2\f\2\16\2\63\13\2"+
		"\7\2\65\n\2\f\2\16\28\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3\16\3C"+
		"\13\3\5\3E\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\5\4R\n"+
		"\4\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4e\n\4\3\4\3\4\7\4i\n\4\f\4\16\4l\13\4\5\4n\n\4\6\4p\n\4\r\4\16"+
		"\4q\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7~\n\7\f\7\16\7\u0081\13"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008b\n\7\3\7\3\7\7\7\u008f\n\7"+
		"\f\7\16\7\u0092\13\7\5\7\u0094\n\7\6\7\u0096\n\7\r\7\16\7\u0097\3\b\3"+
		"\b\3\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00ab\n\b\3\b\3\b\7\b\u00af\n\b\f\b\16\b\u00b2\13\b\5\b\u00b4"+
		"\n\b\6\b\u00b6\n\b\r\b\16\b\u00b7\3\t\3\t\7\t\u00bc\n\t\f\t\16\t\u00bf"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c9\n\t\3\t\3\t\7\t\u00cd"+
		"\n\t\f\t\16\t\u00d0\13\t\5\t\u00d2\n\t\6\t\u00d4\n\t\r\t\16\t\u00d5\3"+
		"\n\3\n\7\n\u00da\n\n\f\n\16\n\u00dd\13\n\3\n\5\n\u00e0\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00eb\n\f\f\f\16\f\u00ee\13\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f8\n\f\3\f\3\f\7\f\u00fc\n\f\f\f\16"+
		"\f\u00ff\13\f\5\f\u0101\n\f\6\f\u0103\n\f\r\f\16\f\u0104\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\6\6\2"+
		"\31\33\36\36\"\"$$\6\2\32\33\36\36\"\"$$\4\2\32\32\"\"\5\2\32\33\36\36"+
		"\"\"\2\u0156\2\66\3\2\2\2\49\3\2\2\2\6F\3\2\2\2\bs\3\2\2\2\nv\3\2\2\2"+
		"\fy\3\2\2\2\16\u0099\3\2\2\2\20\u00b9\3\2\2\2\22\u00d7\3\2\2\2\24\u00e1"+
		"\3\2\2\2\26\u00e6\3\2\2\2\30\u0106\3\2\2\2\32\u010b\3\2\2\2\34\u0110\3"+
		"\2\2\2\36\u0115\3\2\2\2 ,\5\n\6\2!,\5\22\n\2\",\5\24\13\2#,\5\26\f\2$"+
		",\5\30\r\2%,\5\32\16\2&,\5\34\17\2\',\5\36\20\2(,\5\6\4\2),\5\4\3\2*,"+
		"\5\b\5\2+ \3\2\2\2+!\3\2\2\2+\"\3\2\2\2+#\3\2\2\2+$\3\2\2\2+%\3\2\2\2"+
		"+&\3\2\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,-\3\2\2\2-\61\7\3"+
		"\2\2.\60\7&\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65"+
		"\3\2\2\2\63\61\3\2\2\2\64+\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2"+
		"\2\2\67\3\3\2\2\28\66\3\2\2\29:\7\4\2\2:D\7\36\2\2;<\7\5\2\2<A\t\2\2\2"+
		"=>\7\6\2\2>@\t\2\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BE\3\2\2\2"+
		"CA\3\2\2\2D;\3\2\2\2DE\3\2\2\2E\5\3\2\2\2FG\7\7\2\2GQ\7\36\2\2HI\7\5\2"+
		"\2IN\7\36\2\2JK\7\6\2\2KM\7\36\2\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2"+
		"\2\2OR\3\2\2\2PN\3\2\2\2QH\3\2\2\2QR\3\2\2\2RS\3\2\2\2SW\7\b\2\2TV\7&"+
		"\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2Xo\3\2\2\2YW\3\2\2\2Ze\5\n"+
		"\6\2[e\5\24\13\2\\e\5\30\r\2]e\5\32\16\2^e\5\34\17\2_e\5\36\20\2`e\5\22"+
		"\n\2ae\5\26\f\2be\5\4\3\2ce\5\b\5\2dZ\3\2\2\2d[\3\2\2\2d\\\3\2\2\2d]\3"+
		"\2\2\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2em\3"+
		"\2\2\2fj\7\t\2\2gi\7&\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3"+
		"\2\2\2lj\3\2\2\2mf\3\2\2\2mn\3\2\2\2np\3\2\2\2od\3\2\2\2pq\3\2\2\2qo\3"+
		"\2\2\2qr\3\2\2\2r\7\3\2\2\2st\7\n\2\2tu\t\3\2\2u\t\3\2\2\2vw\7\13\2\2"+
		"wx\t\3\2\2x\13\3\2\2\2yz\7\f\2\2z{\t\4\2\2{\177\7\r\2\2|~\7&\2\2}|\3\2"+
		"\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0095\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0082\u008b\5\n\6\2\u0083\u008b\5\24\13\2\u0084\u008b"+
		"\5\30\r\2\u0085\u008b\5\32\16\2\u0086\u008b\5\34\17\2\u0087\u008b\5\36"+
		"\20\2\u0088\u008b\5\4\3\2\u0089\u008b\5\b\5\2\u008a\u0082\3\2\2\2\u008a"+
		"\u0083\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2"+
		"\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u0093\3\2\2\2\u008c\u0090\7\t\2\2\u008d\u008f\7&\2\2\u008e\u008d\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u008c\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u008a\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\r\3\2\2\2\u0099\u009a\7\16\2"+
		"\2\u009a\u009b\t\4\2\2\u009b\u009f\7\r\2\2\u009c\u009e\7&\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00b5\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00ab\5\n\6\2\u00a3\u00ab\5\24"+
		"\13\2\u00a4\u00ab\5\30\r\2\u00a5\u00ab\5\32\16\2\u00a6\u00ab\5\34\17\2"+
		"\u00a7\u00ab\5\36\20\2\u00a8\u00ab\5\4\3\2\u00a9\u00ab\5\b\5\2\u00aa\u00a2"+
		"\3\2\2\2\u00aa\u00a3\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa"+
		"\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2"+
		"\2\2\u00ab\u00b3\3\2\2\2\u00ac\u00b0\7\t\2\2\u00ad\u00af\7&\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00aa\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\17\3\2\2\2\u00b9\u00bd"+
		"\7\17\2\2\u00ba\u00bc\7&\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00d3\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c9\5\n\6\2\u00c1\u00c9\5\24\13\2\u00c2\u00c9\5\30\r\2\u00c3"+
		"\u00c9\5\32\16\2\u00c4\u00c9\5\34\17\2\u00c5\u00c9\5\36\20\2\u00c6\u00c9"+
		"\5\4\3\2\u00c7\u00c9\5\b\5\2\u00c8\u00c0\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c8"+
		"\u00c2\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00d1\3\2\2\2\u00ca"+
		"\u00ce\7\t\2\2\u00cb\u00cd\7&\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00c8\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\21\3\2\2\2\u00d7\u00db\5\f\7\2\u00d8\u00da\5\16\b"+
		"\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\5\20\t\2"+
		"\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\23\3\2\2\2\u00e1\u00e2"+
		"\7\20\2\2\u00e2\u00e3\t\2\2\2\u00e3\u00e4\7\21\2\2\u00e4\u00e5\7\36\2"+
		"\2\u00e5\25\3\2\2\2\u00e6\u00e7\7\22\2\2\u00e7\u00e8\t\4\2\2\u00e8\u00ec"+
		"\7\r\2\2\u00e9\u00eb\7&\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u0102\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ef\u00f8\5\n\6\2\u00f0\u00f8\5\24\13\2\u00f1\u00f8\5\30\r\2\u00f2"+
		"\u00f8\5\32\16\2\u00f3\u00f8\5\34\17\2\u00f4\u00f8\5\36\20\2\u00f5\u00f8"+
		"\5\4\3\2\u00f6\u00f8\5\b\5\2\u00f7\u00ef\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7"+
		"\u00f1\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u0100\3\2\2\2\u00f9"+
		"\u00fd\7\t\2\2\u00fa\u00fc\7&\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u00f9\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2"+
		"\2\2\u0102\u00f7\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\27\3\2\2\2\u0106\u0107\7\23\2\2\u0107\u0108\t\5\2"+
		"\2\u0108\u0109\7\21\2\2\u0109\u010a\7\36\2\2\u010a\31\3\2\2\2\u010b\u010c"+
		"\7\24\2\2\u010c\u010d\t\5\2\2\u010d\u010e\7\25\2\2\u010e\u010f\7\36\2"+
		"\2\u010f\33\3\2\2\2\u0110\u0111\7\26\2\2\u0111\u0112\t\5\2\2\u0112\u0113"+
		"\7\27\2\2\u0113\u0114\7\36\2\2\u0114\35\3\2\2\2\u0115\u0116\7\30\2\2\u0116"+
		"\u0117\7\33\2\2\u0117\u0118\7\25\2\2\u0118\u0119\7\36\2\2\u0119\37\3\2"+
		"\2\2$+\61\66ADNQWdjmq\177\u008a\u0090\u0093\u0097\u009f\u00aa\u00b0\u00b3"+
		"\u00b7\u00bd\u00c8\u00ce\u00d1\u00d5\u00db\u00df\u00ec\u00f7\u00fd\u0100"+
		"\u0104";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}