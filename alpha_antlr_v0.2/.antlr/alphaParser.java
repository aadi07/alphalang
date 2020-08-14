// Generated from /Users/aadi/projects/alpha_lang/alpha_antlr_v0.2/alpha.g4 by ANTLR 4.8
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
		STRING=18, NUMBER=19, PLUS=20, MINUS=21, TIMES=22, DIVIDE=23, WS=24;
	public static final int
		RULE_prog = 0, RULE_returnFunc = 1, RULE_assign = 2, RULE_show = 3, RULE_func = 4, 
		RULE_call = 5, RULE_returnVal = 6, RULE_value = 7, RULE_args = 8, RULE_reference = 9, 
		RULE_returnCall = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "returnFunc", "assign", "show", "func", "call", "returnVal", 
			"value", "args", "reference", "returnCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'Assign '", "' to '", "' as '", "'an integer'", "'a float'", 
			"'a string'", "'Print '", "'Define '", "' on '", "' as:'", "','", "'Call '", 
			"'Return '", "' and '", "'the value of '", "'the result of calling '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "STRING", "NUMBER", "PLUS", "MINUS", 
			"TIMES", "DIVIDE", "WS"
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
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<ShowContext> show() {
			return getRuleContexts(ShowContext.class);
		}
		public ShowContext show(int i) {
			return getRuleContext(ShowContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
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
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(22);
					assign();
					}
					break;
				case T__7:
					{
					setState(23);
					show();
					}
					break;
				case T__8:
					{
					setState(24);
					func();
					}
					break;
				case T__12:
					{
					setState(25);
					call();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(28);
				match(T__0);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(29);
					match(WS);
					}
				}

				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__12))) != 0) );
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

	public static class ReturnFuncContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<ShowContext> show() {
			return getRuleContexts(ShowContext.class);
		}
		public ShowContext show(int i) {
			return getRuleContext(ShowContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<ReturnValContext> returnVal() {
			return getRuleContexts(ReturnValContext.class);
		}
		public ReturnValContext returnVal(int i) {
			return getRuleContext(ReturnValContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(alphaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(alphaParser.WS, i);
		}
		public ReturnFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFunc; }
	}

	public final ReturnFuncContext returnFunc() throws RecognitionException {
		ReturnFuncContext _localctx = new ReturnFuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_returnFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(36);
					assign();
					}
					break;
				case T__7:
					{
					setState(37);
					show();
					}
					break;
				case T__8:
					{
					setState(38);
					func();
					}
					break;
				case T__12:
					{
					setState(39);
					call();
					}
					break;
				case T__13:
					{
					setState(40);
					returnVal();
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
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << T__13))) != 0) );
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__1);
			setState(52);
			value();
			setState(53);
			match(T__2);
			setState(54);
			value();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(55);
				match(T__3);
				setState(56);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class ShowContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__7);
			setState(60);
			value();
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

	public static class FuncContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(alphaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(alphaParser.WS, i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<ShowContext> show() {
			return getRuleContexts(ShowContext.class);
		}
		public ShowContext show(int i) {
			return getRuleContext(ShowContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<ReturnValContext> returnVal() {
			return getRuleContexts(ReturnValContext.class);
		}
		public ReturnValContext returnVal(int i) {
			return getRuleContext(ReturnValContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__8);
			setState(63);
			value();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(64);
				match(T__9);
				setState(65);
				args();
				}
			}

			setState(68);
			match(T__10);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(69);
				match(WS);
				}
			}

			setState(85); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(77);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(72);
						assign();
						}
						break;
					case T__7:
						{
						setState(73);
						show();
						}
						break;
					case T__8:
						{
						setState(74);
						func();
						}
						break;
					case T__12:
						{
						setState(75);
						call();
						}
						break;
					case T__13:
						{
						setState(76);
						returnVal();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(79);
						match(T__11);
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(80);
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
				setState(87); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class CallContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__12);
			setState(90);
			value();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(91);
				match(T__9);
				setState(92);
				args();
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

	public static class ReturnValContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReturnValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnVal; }
	}

	public final ReturnValContext returnVal() throws RecognitionException {
		ReturnValContext _localctx = new ReturnValContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__13);
			setState(96);
			value();
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

	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(alphaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(alphaParser.STRING, i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<ReturnCallContext> returnCall() {
			return getRuleContexts(ReturnCallContext.class);
		}
		public ReturnCallContext returnCall(int i) {
			return getRuleContext(ReturnCallContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(alphaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(alphaParser.NUMBER, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(alphaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(alphaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(alphaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(alphaParser.MINUS, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(alphaParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(alphaParser.TIMES, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(alphaParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(alphaParser.DIVIDE, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(101);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STRING:
							{
							setState(98);
							match(STRING);
							}
							break;
						case T__15:
							{
							setState(99);
							reference();
							}
							break;
						case T__16:
							{
							setState(100);
							returnCall();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(104);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(103);
							match(PLUS);
							}
							break;
						}
						}
						break;
					case 2:
						{
						setState(109);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NUMBER:
							{
							setState(106);
							match(NUMBER);
							}
							break;
						case T__15:
							{
							setState(107);
							reference();
							}
							break;
						case T__16:
							{
							setState(108);
							returnCall();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(112);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(111);
							_la = _input.LA(1);
							if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE))) != 0)) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						}
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(116); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			value();
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					match(T__14);
					setState(120);
					value();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class ReferenceContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode WS() { return getToken(alphaParser.WS, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__15);
			setState(127);
			value();
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(128);
				match(T__11);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(129);
					match(WS);
					}
				}

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

	public static class ReturnCallContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode WS() { return getToken(alphaParser.WS, 0); }
		public ReturnCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnCall; }
	}

	public final ReturnCallContext returnCall() throws RecognitionException {
		ReturnCallContext _localctx = new ReturnCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__16);
			setState(135);
			value();
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(136);
				match(T__9);
				setState(137);
				args();
				}
				break;
			}
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(140);
				match(T__11);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(141);
					match(WS);
					}
				}

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0095\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\5\2\35\n\2\3\2\3\2\5\2!\n\2\6\2#\n\2\r\2"+
		"\16\2$\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\3\3\3\5\3\60\n\3\6\3\62\n\3\r\3"+
		"\16\3\63\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\5\6E\n\6\3\6\3\6\5\6I\n\6\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\6\3\6\5\6T\n"+
		"\6\5\6V\n\6\6\6X\n\6\r\6\16\6Y\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\5\th\n\t\3\t\5\tk\n\t\3\t\3\t\3\t\5\tp\n\t\3\t\5\ts\n\t\6\t"+
		"u\n\t\r\t\16\tv\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\13\3\13\3\13"+
		"\3\13\5\13\u0085\n\13\5\13\u0087\n\13\3\f\3\f\3\f\3\f\5\f\u008d\n\f\3"+
		"\f\3\f\5\f\u0091\n\f\5\f\u0093\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26"+
		"\2\4\3\2\7\t\3\2\26\31\2\u00ad\2\"\3\2\2\2\4\61\3\2\2\2\6\65\3\2\2\2\b"+
		"=\3\2\2\2\n@\3\2\2\2\f[\3\2\2\2\16a\3\2\2\2\20t\3\2\2\2\22x\3\2\2\2\24"+
		"\u0080\3\2\2\2\26\u0088\3\2\2\2\30\35\5\6\4\2\31\35\5\b\5\2\32\35\5\n"+
		"\6\2\33\35\5\f\7\2\34\30\3\2\2\2\34\31\3\2\2\2\34\32\3\2\2\2\34\33\3\2"+
		"\2\2\35\36\3\2\2\2\36 \7\3\2\2\37!\7\32\2\2 \37\3\2\2\2 !\3\2\2\2!#\3"+
		"\2\2\2\"\34\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&,\5\6\4"+
		"\2\',\5\b\5\2(,\5\n\6\2),\5\f\7\2*,\5\16\b\2+&\3\2\2\2+\'\3\2\2\2+(\3"+
		"\2\2\2+)\3\2\2\2+*\3\2\2\2,-\3\2\2\2-/\7\3\2\2.\60\7\32\2\2/.\3\2\2\2"+
		"/\60\3\2\2\2\60\62\3\2\2\2\61+\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63"+
		"\64\3\2\2\2\64\5\3\2\2\2\65\66\7\4\2\2\66\67\5\20\t\2\678\7\5\2\28;\5"+
		"\20\t\29:\7\6\2\2:<\t\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=>\7\n\2\2>"+
		"?\5\20\t\2?\t\3\2\2\2@A\7\13\2\2AD\5\20\t\2BC\7\f\2\2CE\5\22\n\2DB\3\2"+
		"\2\2DE\3\2\2\2EF\3\2\2\2FH\7\r\2\2GI\7\32\2\2HG\3\2\2\2HI\3\2\2\2IW\3"+
		"\2\2\2JP\5\6\4\2KP\5\b\5\2LP\5\n\6\2MP\5\f\7\2NP\5\16\b\2OJ\3\2\2\2OK"+
		"\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2PU\3\2\2\2QS\7\16\2\2RT\7\32\2\2"+
		"SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UQ\3\2\2\2UV\3\2\2\2VX\3\2\2\2WO\3\2\2\2"+
		"XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\13\3\2\2\2[\\\7\17\2\2\\_\5\20\t\2]^\7"+
		"\f\2\2^`\5\22\n\2_]\3\2\2\2_`\3\2\2\2`\r\3\2\2\2ab\7\20\2\2bc\5\20\t\2"+
		"c\17\3\2\2\2dh\7\24\2\2eh\5\24\13\2fh\5\26\f\2gd\3\2\2\2ge\3\2\2\2gf\3"+
		"\2\2\2hj\3\2\2\2ik\7\26\2\2ji\3\2\2\2jk\3\2\2\2ku\3\2\2\2lp\7\25\2\2m"+
		"p\5\24\13\2np\5\26\f\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2pr\3\2\2\2qs\t\3\2"+
		"\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tg\3\2\2\2to\3\2\2\2uv\3\2\2\2vt\3\2\2"+
		"\2vw\3\2\2\2w\21\3\2\2\2x}\5\20\t\2yz\7\21\2\2z|\5\20\t\2{y\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\23\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\22"+
		"\2\2\u0081\u0086\5\20\t\2\u0082\u0084\7\16\2\2\u0083\u0085\7\32\2\2\u0084"+
		"\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0082\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\25\3\2\2\2\u0088\u0089\7\23\2\2\u0089\u008c"+
		"\5\20\t\2\u008a\u008b\7\f\2\2\u008b\u008d\5\22\n\2\u008c\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u0092\3\2\2\2\u008e\u0090\7\16\2\2\u008f\u0091"+
		"\7\32\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2"+
		"\u0092\u008e\3\2\2\2\u0092\u0093\3\2\2\2\u0093\27\3\2\2\2\34\34 $+/\63"+
		";DHOSUY_gjortv}\u0084\u0086\u008c\u0090\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}