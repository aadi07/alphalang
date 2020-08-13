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
		T__9=10, T__10=11, T__11=12, T__12=13, REFERENCE=14, STRING=15, NUMBER=16, 
		PLUS=17, MINUS=18, TIMES=19, DIVIDE=20, WS=21;
	public static final int
		RULE_r = 0, RULE_assign = 1, RULE_show = 2, RULE_define = 3, RULE_func_head = 4, 
		RULE_args = 5, RULE_func_body = 6, RULE_func_assign = 7, RULE_func_show = 8, 
		RULE_value = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "assign", "show", "define", "func_head", "args", "func_body", "func_assign", 
			"func_show", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "' '", "'Assign '", "' to '", "' as a'", "'n integer'", 
			"' float'", "'Print '", "'Define '", "' on'", "' as:'", "' and'", "', '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "REFERENCE", "STRING", "NUMBER", "PLUS", "MINUS", "TIMES", 
			"DIVIDE", "WS"
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

	public static class RContext extends ParserRuleContext {
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
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(20);
					assign();
					}
					break;
				case T__7:
					{
					setState(21);
					show();
					}
					break;
				case T__8:
					{
					setState(22);
					define();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(25);
				match(T__0);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(26);
					match(T__1);
					}
				}

				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8))) != 0) );
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
			setState(33);
			match(T__2);
			setState(34);
			value();
			setState(35);
			match(T__3);
			setState(36);
			value();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(37);
				match(T__4);
				setState(38);
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
			setState(41);
			match(T__7);
			setState(42);
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
			setState(44);
			func_head();
			setState(45);
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
		enterRule(_localctx, 8, RULE_func_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__8);
			setState(48);
			value();
			setState(49);
			match(T__9);
			setState(50);
			args();
			setState(51);
			match(T__10);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(52);
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
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__1);
			setState(56);
			value();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(57);
				match(T__11);
				setState(58);
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
		enterRule(_localctx, 12, RULE_func_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(65);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__2:
						{
						setState(61);
						func_assign();
						}
						break;
					case T__7:
						{
						setState(62);
						func_show();
						}
						break;
					case REFERENCE:
					case STRING:
					case NUMBER:
						{
						setState(63);
						value();
						}
						break;
					case T__8:
						{
						setState(64);
						define();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(67);
						match(T__12);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 14, RULE_func_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__2);
			setState(75);
			value();
			setState(76);
			match(T__3);
			setState(77);
			value();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(78);
				match(T__4);
				setState(79);
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
		enterRule(_localctx, 16, RULE_func_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__7);
			setState(83);
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
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REFERENCE:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==REFERENCE || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==PLUS) {
					{
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(86);
						match(T__1);
						}
					}

					setState(89);
					match(PLUS);
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(90);
						match(T__1);
						}
					}

					setState(93);
					value();
					}
				}

				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(NUMBER);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE))) != 0)) {
					{
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(97);
						match(T__1);
						}
					}

					setState(100);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(101);
						match(T__1);
						}
					}

					setState(104);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27p\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\5\2\32\n\2\3\2\3\2\5\2\36\n\2\6\2 \n\2\r\2\16\2!\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\68\n\6\3\7\3\7\3\7\3\7\5\7>\n\7\3\b\3\b\3\b\3\b\5\bD\n\b\3\b\5\b"+
		"G\n\b\6\bI\n\b\r\b\16\bJ\3\t\3\t\3\t\3\t\3\t\3\t\5\tS\n\t\3\n\3\n\3\n"+
		"\3\13\3\13\5\13Z\n\13\3\13\3\13\5\13^\n\13\3\13\5\13a\n\13\3\13\3\13\5"+
		"\13e\n\13\3\13\3\13\5\13i\n\13\3\13\5\13l\n\13\5\13n\n\13\3\13\2\2\f\2"+
		"\4\6\b\n\f\16\20\22\24\2\5\3\2\b\t\3\2\20\21\3\2\23\26\2y\2\37\3\2\2\2"+
		"\4#\3\2\2\2\6+\3\2\2\2\b.\3\2\2\2\n\61\3\2\2\2\f9\3\2\2\2\16H\3\2\2\2"+
		"\20L\3\2\2\2\22T\3\2\2\2\24m\3\2\2\2\26\32\5\4\3\2\27\32\5\6\4\2\30\32"+
		"\5\b\5\2\31\26\3\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32\33\3\2\2\2\33\35"+
		"\7\3\2\2\34\36\7\4\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\31\3"+
		"\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#$\7\5\2\2$%\5\24\13"+
		"\2%&\7\6\2\2&)\5\24\13\2\'(\7\7\2\2(*\t\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5"+
		"\3\2\2\2+,\7\n\2\2,-\5\24\13\2-\7\3\2\2\2./\5\n\6\2/\60\5\16\b\2\60\t"+
		"\3\2\2\2\61\62\7\13\2\2\62\63\5\24\13\2\63\64\7\f\2\2\64\65\5\f\7\2\65"+
		"\67\7\r\2\2\668\7\4\2\2\67\66\3\2\2\2\678\3\2\2\28\13\3\2\2\29:\7\4\2"+
		"\2:=\5\24\13\2;<\7\16\2\2<>\5\f\7\2=;\3\2\2\2=>\3\2\2\2>\r\3\2\2\2?D\5"+
		"\20\t\2@D\5\22\n\2AD\5\24\13\2BD\5\b\5\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2"+
		"CB\3\2\2\2DF\3\2\2\2EG\7\17\2\2FE\3\2\2\2FG\3\2\2\2GI\3\2\2\2HC\3\2\2"+
		"\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\17\3\2\2\2LM\7\5\2\2MN\5\24\13\2NO\7"+
		"\6\2\2OR\5\24\13\2PQ\7\7\2\2QS\t\2\2\2RP\3\2\2\2RS\3\2\2\2S\21\3\2\2\2"+
		"TU\7\n\2\2UV\5\24\13\2V\23\3\2\2\2W`\t\3\2\2XZ\7\4\2\2YX\3\2\2\2YZ\3\2"+
		"\2\2Z[\3\2\2\2[]\7\23\2\2\\^\7\4\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_a"+
		"\5\24\13\2`Y\3\2\2\2`a\3\2\2\2an\3\2\2\2bk\7\22\2\2ce\7\4\2\2dc\3\2\2"+
		"\2de\3\2\2\2ef\3\2\2\2fh\t\4\2\2gi\7\4\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2"+
		"\2jl\5\24\13\2kd\3\2\2\2kl\3\2\2\2ln\3\2\2\2mW\3\2\2\2mb\3\2\2\2n\25\3"+
		"\2\2\2\23\31\35!)\67=CFJRY]`dhkm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}