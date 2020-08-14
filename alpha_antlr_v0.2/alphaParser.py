# Generated from alpha.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30")
        buf.write("f\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\3\2\3\2\3\2\3\2\5\2\27\n\2\3\2\3\2\5\2\33")
        buf.write("\n\2\6\2\35\n\2\r\2\16\2\36\3\3\3\3\3\3\3\3\3\3\3\3\5")
        buf.write("\3\'\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\62\n")
        buf.write("\5\3\5\3\5\3\5\3\5\5\58\n\5\3\5\3\5\5\5<\n\5\5\5>\n\5")
        buf.write("\6\5@\n\5\r\5\16\5A\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7K\n")
        buf.write("\7\3\7\5\7N\n\7\3\7\3\7\5\7R\n\7\3\7\5\7U\n\7\6\7W\n\7")
        buf.write("\r\7\16\7X\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\3\t\3\t")
        buf.write("\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\3\2\7\t\3\2\24\27")
        buf.write("\2q\2\34\3\2\2\2\4 \3\2\2\2\6(\3\2\2\2\b+\3\2\2\2\nC\3")
        buf.write("\2\2\2\fV\3\2\2\2\16Z\3\2\2\2\20b\3\2\2\2\22\27\5\4\3")
        buf.write("\2\23\27\5\6\4\2\24\27\5\b\5\2\25\27\5\n\6\2\26\22\3\2")
        buf.write("\2\2\26\23\3\2\2\2\26\24\3\2\2\2\26\25\3\2\2\2\27\30\3")
        buf.write("\2\2\2\30\32\7\3\2\2\31\33\7\30\2\2\32\31\3\2\2\2\32\33")
        buf.write("\3\2\2\2\33\35\3\2\2\2\34\26\3\2\2\2\35\36\3\2\2\2\36")
        buf.write("\34\3\2\2\2\36\37\3\2\2\2\37\3\3\2\2\2 !\7\4\2\2!\"\5")
        buf.write("\f\7\2\"#\7\5\2\2#&\5\f\7\2$%\7\6\2\2%\'\t\2\2\2&$\3\2")
        buf.write("\2\2&\'\3\2\2\2\'\5\3\2\2\2()\7\n\2\2)*\5\f\7\2*\7\3\2")
        buf.write("\2\2+,\7\13\2\2,-\5\f\7\2-.\7\f\2\2./\5\16\b\2/\61\7\r")
        buf.write("\2\2\60\62\7\30\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62?\3")
        buf.write("\2\2\2\638\5\4\3\2\648\5\6\4\2\658\5\b\5\2\668\5\n\6\2")
        buf.write("\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2")
        buf.write("\28=\3\2\2\29;\7\16\2\2:<\7\30\2\2;:\3\2\2\2;<\3\2\2\2")
        buf.write("<>\3\2\2\2=9\3\2\2\2=>\3\2\2\2>@\3\2\2\2?\67\3\2\2\2@")
        buf.write("A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\t\3\2\2\2CD\7\17\2\2DE")
        buf.write("\5\f\7\2EF\7\f\2\2FG\5\16\b\2G\13\3\2\2\2HK\7\22\2\2I")
        buf.write("K\5\20\t\2JH\3\2\2\2JI\3\2\2\2KM\3\2\2\2LN\7\24\2\2ML")
        buf.write("\3\2\2\2MN\3\2\2\2NW\3\2\2\2OR\7\23\2\2PR\5\20\t\2QO\3")
        buf.write("\2\2\2QP\3\2\2\2RT\3\2\2\2SU\t\3\2\2TS\3\2\2\2TU\3\2\2")
        buf.write("\2UW\3\2\2\2VJ\3\2\2\2VQ\3\2\2\2WX\3\2\2\2XV\3\2\2\2X")
        buf.write("Y\3\2\2\2Y\r\3\2\2\2Z_\5\f\7\2[\\\7\20\2\2\\^\5\f\7\2")
        buf.write("][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\17\3\2\2\2a")
        buf.write("_\3\2\2\2bc\7\21\2\2cd\7\22\2\2d\21\3\2\2\2\22\26\32\36")
        buf.write("&\61\67;=AJMQTVX_")
        return buf.getvalue()


class alphaParser ( Parser ):

    grammarFileName = "alpha.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'.'", "'Assign '", "' to '", "' as '", 
                     "'an integer'", "'a float'", "'a string'", "'Print '", 
                     "'Define '", "' on '", "' as:'", "','", "'Call '", 
                     "' and '", "'the value of '" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "STRING", "NUMBER", "PLUS", "MINUS", "TIMES", "DIVIDE", 
                      "WS" ]

    RULE_prog = 0
    RULE_assign = 1
    RULE_show = 2
    RULE_func = 3
    RULE_call = 4
    RULE_value = 5
    RULE_args = 6
    RULE_reference = 7

    ruleNames =  [ "prog", "assign", "show", "func", "call", "value", "args", 
                   "reference" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    STRING=16
    NUMBER=17
    PLUS=18
    MINUS=19
    TIMES=20
    DIVIDE=21
    WS=22

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assign(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.AssignContext)
            else:
                return self.getTypedRuleContext(alphaParser.AssignContext,i)


        def show(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.ShowContext)
            else:
                return self.getTypedRuleContext(alphaParser.ShowContext,i)


        def func(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.FuncContext)
            else:
                return self.getTypedRuleContext(alphaParser.FuncContext,i)


        def call(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.CallContext)
            else:
                return self.getTypedRuleContext(alphaParser.CallContext,i)


        def WS(self, i:int=None):
            if i is None:
                return self.getTokens(alphaParser.WS)
            else:
                return self.getToken(alphaParser.WS, i)

        def getRuleIndex(self):
            return alphaParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)




    def prog(self):

        localctx = alphaParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 26 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 20
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [alphaParser.T__1]:
                    self.state = 16
                    self.assign()
                    pass
                elif token in [alphaParser.T__7]:
                    self.state = 17
                    self.show()
                    pass
                elif token in [alphaParser.T__8]:
                    self.state = 18
                    self.func()
                    pass
                elif token in [alphaParser.T__12]:
                    self.state = 19
                    self.call()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 22
                self.match(alphaParser.T__0)
                self.state = 24
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==alphaParser.WS:
                    self.state = 23
                    self.match(alphaParser.WS)


                self.state = 28 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << alphaParser.T__1) | (1 << alphaParser.T__7) | (1 << alphaParser.T__8) | (1 << alphaParser.T__12))) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.ValueContext)
            else:
                return self.getTypedRuleContext(alphaParser.ValueContext,i)


        def getRuleIndex(self):
            return alphaParser.RULE_assign

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssign" ):
                listener.enterAssign(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssign" ):
                listener.exitAssign(self)




    def assign(self):

        localctx = alphaParser.AssignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_assign)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 30
            self.match(alphaParser.T__1)
            self.state = 31
            self.value()
            self.state = 32
            self.match(alphaParser.T__2)
            self.state = 33
            self.value()
            self.state = 36
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==alphaParser.T__3:
                self.state = 34
                self.match(alphaParser.T__3)
                self.state = 35
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << alphaParser.T__4) | (1 << alphaParser.T__5) | (1 << alphaParser.T__6))) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ShowContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def value(self):
            return self.getTypedRuleContext(alphaParser.ValueContext,0)


        def getRuleIndex(self):
            return alphaParser.RULE_show

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterShow" ):
                listener.enterShow(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitShow" ):
                listener.exitShow(self)




    def show(self):

        localctx = alphaParser.ShowContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_show)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 38
            self.match(alphaParser.T__7)
            self.state = 39
            self.value()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FuncContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def value(self):
            return self.getTypedRuleContext(alphaParser.ValueContext,0)


        def args(self):
            return self.getTypedRuleContext(alphaParser.ArgsContext,0)


        def WS(self, i:int=None):
            if i is None:
                return self.getTokens(alphaParser.WS)
            else:
                return self.getToken(alphaParser.WS, i)

        def assign(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.AssignContext)
            else:
                return self.getTypedRuleContext(alphaParser.AssignContext,i)


        def show(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.ShowContext)
            else:
                return self.getTypedRuleContext(alphaParser.ShowContext,i)


        def func(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.FuncContext)
            else:
                return self.getTypedRuleContext(alphaParser.FuncContext,i)


        def call(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.CallContext)
            else:
                return self.getTypedRuleContext(alphaParser.CallContext,i)


        def getRuleIndex(self):
            return alphaParser.RULE_func

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunc" ):
                listener.enterFunc(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunc" ):
                listener.exitFunc(self)




    def func(self):

        localctx = alphaParser.FuncContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_func)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 41
            self.match(alphaParser.T__8)
            self.state = 42
            self.value()
            self.state = 43
            self.match(alphaParser.T__9)
            self.state = 44
            self.args()
            self.state = 45
            self.match(alphaParser.T__10)
            self.state = 47
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==alphaParser.WS:
                self.state = 46
                self.match(alphaParser.WS)


            self.state = 61 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 53
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [alphaParser.T__1]:
                        self.state = 49
                        self.assign()
                        pass
                    elif token in [alphaParser.T__7]:
                        self.state = 50
                        self.show()
                        pass
                    elif token in [alphaParser.T__8]:
                        self.state = 51
                        self.func()
                        pass
                    elif token in [alphaParser.T__12]:
                        self.state = 52
                        self.call()
                        pass
                    else:
                        raise NoViableAltException(self)

                    self.state = 59
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
                    if la_ == 1:
                        self.state = 55
                        self.match(alphaParser.T__11)
                        self.state = 57
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
                        if _la==alphaParser.WS:
                            self.state = 56
                            self.match(alphaParser.WS)





                else:
                    raise NoViableAltException(self)
                self.state = 63 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,8,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CallContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def value(self):
            return self.getTypedRuleContext(alphaParser.ValueContext,0)


        def args(self):
            return self.getTypedRuleContext(alphaParser.ArgsContext,0)


        def getRuleIndex(self):
            return alphaParser.RULE_call

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCall" ):
                listener.enterCall(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCall" ):
                listener.exitCall(self)




    def call(self):

        localctx = alphaParser.CallContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_call)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 65
            self.match(alphaParser.T__12)
            self.state = 66
            self.value()
            self.state = 67
            self.match(alphaParser.T__9)
            self.state = 68
            self.args()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ValueContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self, i:int=None):
            if i is None:
                return self.getTokens(alphaParser.STRING)
            else:
                return self.getToken(alphaParser.STRING, i)

        def reference(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.ReferenceContext)
            else:
                return self.getTypedRuleContext(alphaParser.ReferenceContext,i)


        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(alphaParser.NUMBER)
            else:
                return self.getToken(alphaParser.NUMBER, i)

        def PLUS(self, i:int=None):
            if i is None:
                return self.getTokens(alphaParser.PLUS)
            else:
                return self.getToken(alphaParser.PLUS, i)

        def MINUS(self, i:int=None):
            if i is None:
                return self.getTokens(alphaParser.MINUS)
            else:
                return self.getToken(alphaParser.MINUS, i)

        def TIMES(self, i:int=None):
            if i is None:
                return self.getTokens(alphaParser.TIMES)
            else:
                return self.getToken(alphaParser.TIMES, i)

        def DIVIDE(self, i:int=None):
            if i is None:
                return self.getTokens(alphaParser.DIVIDE)
            else:
                return self.getToken(alphaParser.DIVIDE, i)

        def getRuleIndex(self):
            return alphaParser.RULE_value

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValue" ):
                listener.enterValue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValue" ):
                listener.exitValue(self)




    def value(self):

        localctx = alphaParser.ValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_value)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 84 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 84
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,13,self._ctx)
                if la_ == 1:
                    self.state = 72
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [alphaParser.STRING]:
                        self.state = 70
                        self.match(alphaParser.STRING)
                        pass
                    elif token in [alphaParser.T__14]:
                        self.state = 71
                        self.reference()
                        pass
                    else:
                        raise NoViableAltException(self)

                    self.state = 75
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==alphaParser.PLUS:
                        self.state = 74
                        self.match(alphaParser.PLUS)


                    pass

                elif la_ == 2:
                    self.state = 79
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [alphaParser.NUMBER]:
                        self.state = 77
                        self.match(alphaParser.NUMBER)
                        pass
                    elif token in [alphaParser.T__14]:
                        self.state = 78
                        self.reference()
                        pass
                    else:
                        raise NoViableAltException(self)

                    self.state = 82
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << alphaParser.PLUS) | (1 << alphaParser.MINUS) | (1 << alphaParser.TIMES) | (1 << alphaParser.DIVIDE))) != 0):
                        self.state = 81
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << alphaParser.PLUS) | (1 << alphaParser.MINUS) | (1 << alphaParser.TIMES) | (1 << alphaParser.DIVIDE))) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()


                    pass


                self.state = 86 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << alphaParser.T__14) | (1 << alphaParser.STRING) | (1 << alphaParser.NUMBER))) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.ValueContext)
            else:
                return self.getTypedRuleContext(alphaParser.ValueContext,i)


        def getRuleIndex(self):
            return alphaParser.RULE_args

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgs" ):
                listener.enterArgs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgs" ):
                listener.exitArgs(self)




    def args(self):

        localctx = alphaParser.ArgsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_args)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 88
            self.value()
            self.state = 93
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==alphaParser.T__13:
                self.state = 89
                self.match(alphaParser.T__13)
                self.state = 90
                self.value()
                self.state = 95
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ReferenceContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(alphaParser.STRING, 0)

        def getRuleIndex(self):
            return alphaParser.RULE_reference

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterReference" ):
                listener.enterReference(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitReference" ):
                listener.exitReference(self)




    def reference(self):

        localctx = alphaParser.ReferenceContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_reference)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 96
            self.match(alphaParser.T__14)
            self.state = 97
            self.match(alphaParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





