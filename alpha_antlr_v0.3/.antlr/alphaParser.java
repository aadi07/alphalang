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
			setState(49);
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
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(44);
					match(WS);
					}
				}

				}
				}
				setState(51);
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
			setState(52);
			match(T__1);
			setState(53);
			match(STRING);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(54);
				match(T__2);
				setState(55);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(56);
					match(T__3);
					setState(57);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(62);
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
			setState(65);
			match(T__4);
			setState(66);
			match(STRING);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(67);
				match(T__2);
				setState(68);
				match(STRING);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(69);
					match(T__3);
					setState(70);
					match(STRING);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(78);
			match(T__5);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(79);
				match(WS);
				}
			}

			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(82);
					show();
					}
					break;
				case T__13:
					{
					setState(83);
					assign();
					}
					break;
				case T__16:
					{
					setState(84);
					append();
					}
					break;
				case T__17:
					{
					setState(85);
					removeVal();
					}
					break;
				case T__19:
					{
					setState(86);
					removeAll();
					}
					break;
				case T__21:
					{
					setState(87);
					removePos();
					}
					break;
				case T__9:
					{
					setState(88);
					ifBlock();
					}
					break;
				case T__15:
					{
					setState(89);
					whileLoop();
					}
					break;
				case T__1:
					{
					setState(90);
					call();
					}
					break;
				case T__7:
					{
					setState(91);
					returnStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(94);
					match(T__6);
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(95);
						match(WS);
						}
					}

					}
				}

				}
				}
				setState(102); 
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
			setState(104);
			match(T__7);
			setState(105);
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
			setState(107);
			match(T__8);
			setState(108);
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
			setState(110);
			match(T__9);
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(112);
			match(T__10);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(113);
				match(WS);
				}
			}

			setState(131); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(123);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(116);
						show();
						}
						break;
					case T__13:
						{
						setState(117);
						assign();
						}
						break;
					case T__16:
						{
						setState(118);
						append();
						}
						break;
					case T__17:
						{
						setState(119);
						removeVal();
						}
						break;
					case T__19:
						{
						setState(120);
						removeAll();
						}
						break;
					case T__21:
						{
						setState(121);
						removePos();
						}
						break;
					case T__1:
						{
						setState(122);
						call();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(125);
						match(T__6);
						setState(127);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(126);
							match(WS);
							}
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
				setState(133); 
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
			setState(135);
			match(T__11);
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(137);
			match(T__10);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(138);
				match(WS);
				}
			}

			setState(156); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(148);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(141);
						show();
						}
						break;
					case T__13:
						{
						setState(142);
						assign();
						}
						break;
					case T__16:
						{
						setState(143);
						append();
						}
						break;
					case T__17:
						{
						setState(144);
						removeVal();
						}
						break;
					case T__19:
						{
						setState(145);
						removeAll();
						}
						break;
					case T__21:
						{
						setState(146);
						removePos();
						}
						break;
					case T__1:
						{
						setState(147);
						call();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(154);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(150);
						match(T__6);
						setState(152);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(151);
							match(WS);
							}
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
				setState(158); 
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
			setState(160);
			match(T__12);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(161);
				match(WS);
				}
			}

			setState(179); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(164);
						show();
						}
						break;
					case T__13:
						{
						setState(165);
						assign();
						}
						break;
					case T__16:
						{
						setState(166);
						append();
						}
						break;
					case T__17:
						{
						setState(167);
						removeVal();
						}
						break;
					case T__19:
						{
						setState(168);
						removeAll();
						}
						break;
					case T__21:
						{
						setState(169);
						removePos();
						}
						break;
					case T__1:
						{
						setState(170);
						call();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(173);
						match(T__6);
						setState(175);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(174);
							match(WS);
							}
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
			setState(183);
			ifStmt();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(184);
				elifStmt();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(190);
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
			setState(193);
			match(T__13);
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT) | (1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL) | (1L << LIST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(195);
			match(T__14);
			setState(196);
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
			setState(198);
			match(T__15);
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==REFERENCE || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(200);
			match(T__10);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(201);
				match(WS);
				}
			}

			setState(219); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(211);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(204);
						show();
						}
						break;
					case T__13:
						{
						setState(205);
						assign();
						}
						break;
					case T__16:
						{
						setState(206);
						append();
						}
						break;
					case T__17:
						{
						setState(207);
						removeVal();
						}
						break;
					case T__19:
						{
						setState(208);
						removeAll();
						}
						break;
					case T__21:
						{
						setState(209);
						removePos();
						}
						break;
					case T__1:
						{
						setState(210);
						call();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(213);
						match(T__6);
						setState(215);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(214);
							match(WS);
							}
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
				setState(221); 
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
			setState(223);
			match(T__16);
			setState(224);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
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
			setState(228);
			match(T__17);
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(230);
			match(T__18);
			setState(231);
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
			setState(233);
			match(T__19);
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REFERENCE) | (1L << MATH) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(235);
			match(T__20);
			setState(236);
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
			setState(238);
			match(T__21);
			setState(239);
			match(MATH);
			setState(240);
			match(T__18);
			setState(241);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2,\n\2\3\2\3\2\5\2\60\n\2\7\2\62\n\2\f\2\16"+
		"\2\65\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\5\3B\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\5\4O\n\4\3\4\3\4\5\4S\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\4\3\4\5\4c\n\4\5"+
		"\4e\n\4\6\4g\n\4\r\4\16\4h\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7"+
		"u\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7~\n\7\3\7\3\7\5\7\u0082\n\7\5\7\u0084"+
		"\n\7\6\7\u0086\n\7\r\7\16\7\u0087\3\b\3\b\3\b\3\b\5\b\u008e\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u0097\n\b\3\b\3\b\5\b\u009b\n\b\5\b\u009d\n"+
		"\b\6\b\u009f\n\b\r\b\16\b\u00a0\3\t\3\t\5\t\u00a5\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00ae\n\t\3\t\3\t\5\t\u00b2\n\t\5\t\u00b4\n\t\6\t\u00b6"+
		"\n\t\r\t\16\t\u00b7\3\n\3\n\7\n\u00bc\n\n\f\n\16\n\u00bf\13\n\3\n\5\n"+
		"\u00c2\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00cd\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d6\n\f\3\f\3\f\5\f\u00da\n\f\5\f\u00dc"+
		"\n\f\6\f\u00de\n\f\r\f\16\f\u00df\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\2\2\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\7\7\2\31\31\33\33\36\36\"\""+
		"$$\6\2\32\33\36\36\"\"$$\4\2\32\32\"\"\6\2\31\33\36\36\"\"$$\5\2\32\33"+
		"\36\36\"\"\2\u012d\2\63\3\2\2\2\4\66\3\2\2\2\6C\3\2\2\2\bj\3\2\2\2\nm"+
		"\3\2\2\2\fp\3\2\2\2\16\u0089\3\2\2\2\20\u00a2\3\2\2\2\22\u00b9\3\2\2\2"+
		"\24\u00c3\3\2\2\2\26\u00c8\3\2\2\2\30\u00e1\3\2\2\2\32\u00e6\3\2\2\2\34"+
		"\u00eb\3\2\2\2\36\u00f0\3\2\2\2 ,\5\n\6\2!,\5\22\n\2\",\5\24\13\2#,\5"+
		"\26\f\2$,\5\30\r\2%,\5\32\16\2&,\5\34\17\2\',\5\36\20\2(,\5\6\4\2),\5"+
		"\4\3\2*,\5\b\5\2+ \3\2\2\2+!\3\2\2\2+\"\3\2\2\2+#\3\2\2\2+$\3\2\2\2+%"+
		"\3\2\2\2+&\3\2\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,-\3\2\2\2"+
		"-/\7\3\2\2.\60\7&\2\2/.\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61+\3\2\2\2"+
		"\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2"+
		"\66\67\7\4\2\2\67A\7\36\2\289\7\5\2\29>\t\2\2\2:;\7\6\2\2;=\t\2\2\2<:"+
		"\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2A8\3\2\2\2A"+
		"B\3\2\2\2B\5\3\2\2\2CD\7\7\2\2DN\7\36\2\2EF\7\5\2\2FK\7\36\2\2GH\7\6\2"+
		"\2HJ\7\36\2\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2"+
		"\2\2NE\3\2\2\2NO\3\2\2\2OP\3\2\2\2PR\7\b\2\2QS\7&\2\2RQ\3\2\2\2RS\3\2"+
		"\2\2Sf\3\2\2\2T_\5\n\6\2U_\5\24\13\2V_\5\30\r\2W_\5\32\16\2X_\5\34\17"+
		"\2Y_\5\36\20\2Z_\5\22\n\2[_\5\26\f\2\\_\5\4\3\2]_\5\b\5\2^T\3\2\2\2^U"+
		"\3\2\2\2^V\3\2\2\2^W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^"+
		"\\\3\2\2\2^]\3\2\2\2_d\3\2\2\2`b\7\t\2\2ac\7&\2\2ba\3\2\2\2bc\3\2\2\2"+
		"ce\3\2\2\2d`\3\2\2\2de\3\2\2\2eg\3\2\2\2f^\3\2\2\2gh\3\2\2\2hf\3\2\2\2"+
		"hi\3\2\2\2i\7\3\2\2\2jk\7\n\2\2kl\t\3\2\2l\t\3\2\2\2mn\7\13\2\2no\t\3"+
		"\2\2o\13\3\2\2\2pq\7\f\2\2qr\t\4\2\2rt\7\r\2\2su\7&\2\2ts\3\2\2\2tu\3"+
		"\2\2\2u\u0085\3\2\2\2v~\5\n\6\2w~\5\24\13\2x~\5\30\r\2y~\5\32\16\2z~\5"+
		"\34\17\2{~\5\36\20\2|~\5\4\3\2}v\3\2\2\2}w\3\2\2\2}x\3\2\2\2}y\3\2\2\2"+
		"}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\u0083\3\2\2\2\177\u0081\7\t\2\2\u0080"+
		"\u0082\7&\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2"+
		"\2\2\u0083\177\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085}"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\r\3\2\2\2\u0089\u008a\7\16\2\2\u008a\u008b\t\4\2\2\u008b\u008d\7\r\2"+
		"\2\u008c\u008e\7&\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u009e"+
		"\3\2\2\2\u008f\u0097\5\n\6\2\u0090\u0097\5\24\13\2\u0091\u0097\5\30\r"+
		"\2\u0092\u0097\5\32\16\2\u0093\u0097\5\34\17\2\u0094\u0097\5\36\20\2\u0095"+
		"\u0097\5\4\3\2\u0096\u008f\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0091\3\2"+
		"\2\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009c\3\2\2\2\u0098\u009a\7\t\2\2\u0099\u009b\7&"+
		"\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u0098\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u0096\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\17\3\2\2\2\u00a2\u00a4\7\17\2\2\u00a3\u00a5\7&\2\2\u00a4\u00a3\3\2\2"+
		"\2\u00a4\u00a5\3\2\2\2\u00a5\u00b5\3\2\2\2\u00a6\u00ae\5\n\6\2\u00a7\u00ae"+
		"\5\24\13\2\u00a8\u00ae\5\30\r\2\u00a9\u00ae\5\32\16\2\u00aa\u00ae\5\34"+
		"\17\2\u00ab\u00ae\5\36\20\2\u00ac\u00ae\5\4\3\2\u00ad\u00a6\3\2\2\2\u00ad"+
		"\u00a7\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b3\3\2\2\2\u00af"+
		"\u00b1\7\t\2\2\u00b0\u00b2\7&\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\21\3\2\2\2\u00b9\u00bd\5\f\7\2\u00ba\u00bc"+
		"\5\16\b\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2"+
		"\5\20\t\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\23\3\2\2\2\u00c3"+
		"\u00c4\7\20\2\2\u00c4\u00c5\t\5\2\2\u00c5\u00c6\7\21\2\2\u00c6\u00c7\7"+
		"\36\2\2\u00c7\25\3\2\2\2\u00c8\u00c9\7\22\2\2\u00c9\u00ca\t\4\2\2\u00ca"+
		"\u00cc\7\r\2\2\u00cb\u00cd\7&\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00dd\3\2\2\2\u00ce\u00d6\5\n\6\2\u00cf\u00d6\5\24\13\2\u00d0"+
		"\u00d6\5\30\r\2\u00d1\u00d6\5\32\16\2\u00d2\u00d6\5\34\17\2\u00d3\u00d6"+
		"\5\36\20\2\u00d4\u00d6\5\4\3\2\u00d5\u00ce\3\2\2\2\u00d5\u00cf\3\2\2\2"+
		"\u00d5\u00d0\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00db\3\2\2\2\u00d7\u00d9\7\t\2\2\u00d8"+
		"\u00da\7&\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00d7\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00d5\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\27\3\2\2\2\u00e1\u00e2\7\23\2\2\u00e2\u00e3\t\6\2\2\u00e3\u00e4"+
		"\7\21\2\2\u00e4\u00e5\7\36\2\2\u00e5\31\3\2\2\2\u00e6\u00e7\7\24\2\2\u00e7"+
		"\u00e8\t\6\2\2\u00e8\u00e9\7\25\2\2\u00e9\u00ea\7\36\2\2\u00ea\33\3\2"+
		"\2\2\u00eb\u00ec\7\26\2\2\u00ec\u00ed\t\6\2\2\u00ed\u00ee\7\27\2\2\u00ee"+
		"\u00ef\7\36\2\2\u00ef\35\3\2\2\2\u00f0\u00f1\7\30\2\2\u00f1\u00f2\7\33"+
		"\2\2\u00f2\u00f3\7\25\2\2\u00f3\u00f4\7\36\2\2\u00f4\37\3\2\2\2$+/\63"+
		">AKNR^bdht}\u0081\u0083\u0087\u008d\u0096\u009a\u009c\u00a0\u00a4\u00ad"+
		"\u00b1\u00b3\u00b7\u00bd\u00c1\u00cc\u00d5\u00d9\u00db\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}