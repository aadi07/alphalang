// Generated from /Users/aadi/projects/alpha_lang/alpha_antlr/alpha.g4 by ANTLR 4.8
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, REFERENCE=16, 
		STRING=17, NUMBER=18, PLUS=19, MINUS=20, TIMES=21, DIVIDE=22, WS=23;
	public static final int
		RULE_prog = 0, RULE_assign = 1, RULE_show = 2, RULE_define = 3, RULE_func_nr_call = 4, 
		RULE_func_r_call = 5, RULE_func_head = 6, RULE_func_body = 7, RULE_func_assign = 8, 
		RULE_func_show = 9, RULE_value = 10, RULE_args = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "assign", "show", "define", "func_nr_call", "func_r_call", "func_head", 
			"func_body", "func_assign", "func_show", "value", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "' '", "'Assign '", "' to '", "' as a'", "'n integer'", 
			"' float'", "'Print '", "'Call '", "' on'", "'the result of calling '", 
			"'Define '", "' as:'", "', '", "' and'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "REFERENCE", "STRING", "NUMBER", "PLUS", "MINUS", 
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
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public List<Func_nr_callContext> func_nr_call() {
			return getRuleContexts(Func_nr_callContext.class);
		}
		public Func_nr_callContext func_nr_call(int i) {
			return getRuleContext(Func_nr_callContext.class,i);
		}
		public List<Func_r_callContext> func_r_call() {
			return getRuleContexts(Func_r_callContext.class);
		}
		public Func_r_callContext func_r_call(int i) {
			return getRuleContext(Func_r_callContext.class,i);
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
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(24);
					assign();
					}
					break;
				case T__7:
					{
					setState(25);
					show();
					}
					break;
				case T__11:
					{
					setState(26);
					define();
					}
					break;
				case T__8:
					{
					setState(27);
					func_nr_call();
					}
					break;
				case T__10:
					{
					setState(28);
					func_r_call();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(31);
				match(T__0);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(32);
					match(T__1);
					}
				}

				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11))) != 0) );
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
		enterRule(_localctx, 2, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__2);
			setState(40);
			value();
			setState(41);
			match(T__3);
			setState(42);
			value();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(43);
				match(T__4);
				setState(44);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__6) ) {
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
		enterRule(_localctx, 4, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__7);
			setState(48);
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

	public static class DefineContext extends ParserRuleContext {
		public Func_headContext func_head() {
			return getRuleContext(Func_headContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			func_head();
			setState(51);
			func_body();
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

	public static class Func_nr_callContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Func_nr_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_nr_call; }
	}

	public final Func_nr_callContext func_nr_call() throws RecognitionException {
		Func_nr_callContext _localctx = new Func_nr_callContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_nr_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__8);
			setState(54);
			value();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(55);
				match(T__9);
				setState(56);
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

	public static class Func_r_callContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Func_r_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_r_call; }
	}

	public final Func_r_callContext func_r_call() throws RecognitionException {
		Func_r_callContext _localctx = new Func_r_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_r_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__10);
			setState(60);
			value();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(61);
				match(T__9);
				setState(62);
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

	public static class Func_headContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Func_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_head; }
	}

	public final Func_headContext func_head() throws RecognitionException {
		Func_headContext _localctx = new Func_headContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__11);
			setState(66);
			value();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(67);
				match(T__9);
				setState(68);
				args();
				}
			}

			setState(71);
			match(T__12);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(72);
				match(T__1);
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

	public static class Func_bodyContext extends ParserRuleContext {
		public List<Func_assignContext> func_assign() {
			return getRuleContexts(Func_assignContext.class);
		}
		public Func_assignContext func_assign(int i) {
			return getRuleContext(Func_assignContext.class,i);
		}
		public List<Func_showContext> func_show() {
			return getRuleContexts(Func_showContext.class);
		}
		public Func_showContext func_show(int i) {
			return getRuleContext(Func_showContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(79);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(75);
						func_assign();
						}
						break;
					case T__7:
						{
						setState(76);
						func_show();
						}
						break;
					case REFERENCE:
					case STRING:
					case NUMBER:
						{
						setState(77);
						value();
						}
						break;
					case T__11:
						{
						setState(78);
						define();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(81);
						match(T__13);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Func_assignContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Func_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_assign; }
	}

	public final Func_assignContext func_assign() throws RecognitionException {
		Func_assignContext _localctx = new Func_assignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__2);
			setState(89);
			value();
			setState(90);
			match(T__3);
			setState(91);
			value();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(92);
				match(T__4);
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__6) ) {
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

	public static class Func_showContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Func_showContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_show; }
	}

	public final Func_showContext func_show() throws RecognitionException {
		Func_showContext _localctx = new Func_showContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__7);
			setState(97);
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
		public TerminalNode STRING() { return getToken(alphaParser.STRING, 0); }
		public TerminalNode REFERENCE() { return getToken(alphaParser.REFERENCE, 0); }
		public TerminalNode PLUS() { return getToken(alphaParser.PLUS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(alphaParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(alphaParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(alphaParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(alphaParser.DIVIDE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REFERENCE:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				_la = _input.LA(1);
				if ( !(_la==REFERENCE || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==PLUS) {
					{
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(100);
						match(T__1);
						}
					}

					setState(103);
					match(PLUS);
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(104);
						match(T__1);
						}
					}

					setState(107);
					value();
					}
				}

				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(NUMBER);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE))) != 0)) {
					{
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(111);
						match(T__1);
						}
					}

					setState(114);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(115);
						match(T__1);
						}
					}

					setState(118);
					value();
					}
				}

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

	public static class ArgsContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__1);
			setState(124);
			value();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(125);
				match(T__14);
				setState(126);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\2\3\2\5\2$\n\2\6"+
		"\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\5\6<\n\6\3\7\3\7\3\7\3\7\5\7B\n\7\3\b\3\b\3\b"+
		"\3\b\5\bH\n\b\3\b\3\b\5\bL\n\b\3\t\3\t\3\t\3\t\5\tR\n\t\3\t\5\tU\n\t\6"+
		"\tW\n\t\r\t\16\tX\3\n\3\n\3\n\3\n\3\n\3\n\5\na\n\n\3\13\3\13\3\13\3\f"+
		"\3\f\5\fh\n\f\3\f\3\f\5\fl\n\f\3\f\5\fo\n\f\3\f\3\f\5\fs\n\f\3\f\3\f\5"+
		"\fw\n\f\3\f\5\fz\n\f\5\f|\n\f\3\r\3\r\3\r\3\r\5\r\u0082\n\r\3\r\2\2\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\5\3\2\b\t\3\2\22\23\3\2\25\30\2\u0090"+
		"\2%\3\2\2\2\4)\3\2\2\2\6\61\3\2\2\2\b\64\3\2\2\2\n\67\3\2\2\2\f=\3\2\2"+
		"\2\16C\3\2\2\2\20V\3\2\2\2\22Z\3\2\2\2\24b\3\2\2\2\26{\3\2\2\2\30}\3\2"+
		"\2\2\32 \5\4\3\2\33 \5\6\4\2\34 \5\b\5\2\35 \5\n\6\2\36 \5\f\7\2\37\32"+
		"\3\2\2\2\37\33\3\2\2\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 !\3\2"+
		"\2\2!#\7\3\2\2\"$\7\4\2\2#\"\3\2\2\2#$\3\2\2\2$&\3\2\2\2%\37\3\2\2\2&"+
		"\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)*\7\5\2\2*+\5\26\f\2+,\7\6"+
		"\2\2,/\5\26\f\2-.\7\7\2\2.\60\t\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2"+
		"\2\61\62\7\n\2\2\62\63\5\26\f\2\63\7\3\2\2\2\64\65\5\16\b\2\65\66\5\20"+
		"\t\2\66\t\3\2\2\2\678\7\13\2\28;\5\26\f\29:\7\f\2\2:<\5\30\r\2;9\3\2\2"+
		"\2;<\3\2\2\2<\13\3\2\2\2=>\7\r\2\2>A\5\26\f\2?@\7\f\2\2@B\5\30\r\2A?\3"+
		"\2\2\2AB\3\2\2\2B\r\3\2\2\2CD\7\16\2\2DG\5\26\f\2EF\7\f\2\2FH\5\30\r\2"+
		"GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IK\7\17\2\2JL\7\4\2\2KJ\3\2\2\2KL\3\2\2"+
		"\2L\17\3\2\2\2MR\5\22\n\2NR\5\24\13\2OR\5\26\f\2PR\5\b\5\2QM\3\2\2\2Q"+
		"N\3\2\2\2QO\3\2\2\2QP\3\2\2\2RT\3\2\2\2SU\7\20\2\2TS\3\2\2\2TU\3\2\2\2"+
		"UW\3\2\2\2VQ\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\21\3\2\2\2Z[\7\5\2"+
		"\2[\\\5\26\f\2\\]\7\6\2\2]`\5\26\f\2^_\7\7\2\2_a\t\2\2\2`^\3\2\2\2`a\3"+
		"\2\2\2a\23\3\2\2\2bc\7\n\2\2cd\5\26\f\2d\25\3\2\2\2en\t\3\2\2fh\7\4\2"+
		"\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\7\25\2\2jl\7\4\2\2kj\3\2\2\2kl\3\2"+
		"\2\2lm\3\2\2\2mo\5\26\f\2ng\3\2\2\2no\3\2\2\2o|\3\2\2\2py\7\24\2\2qs\7"+
		"\4\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tv\t\4\2\2uw\7\4\2\2vu\3\2\2\2vw\3"+
		"\2\2\2wx\3\2\2\2xz\5\26\f\2yr\3\2\2\2yz\3\2\2\2z|\3\2\2\2{e\3\2\2\2{p"+
		"\3\2\2\2|\27\3\2\2\2}~\7\4\2\2~\u0081\5\26\f\2\177\u0080\7\21\2\2\u0080"+
		"\u0082\5\30\r\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\31\3\2\2\2"+
		"\26\37#\'/;AGKQTX`gknrvy{\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}