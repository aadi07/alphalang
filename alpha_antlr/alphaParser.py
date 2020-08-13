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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22")
        buf.write(";\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\6\2\r\n\2\r")
        buf.write("\2\16\2\16\3\3\3\3\3\3\3\3\3\3\3\3\5\3\27\n\3\3\3\3\3")
        buf.write("\5\3\33\n\3\3\4\3\4\3\4\3\4\5\4!\n\4\3\5\3\5\5\5%\n\5")
        buf.write("\3\5\3\5\5\5)\n\5\3\5\5\5,\n\5\3\5\3\5\5\5\60\n\5\3\5")
        buf.write("\3\5\5\5\64\n\5\3\5\5\5\67\n\5\5\59\n\5\3\5\2\2\6\2\4")
        buf.write("\6\b\2\5\3\2\6\7\3\2\13\f\3\2\16\21\2B\2\f\3\2\2\2\4\20")
        buf.write("\3\2\2\2\6\34\3\2\2\2\b8\3\2\2\2\n\r\5\4\3\2\13\r\5\6")
        buf.write("\4\2\f\n\3\2\2\2\f\13\3\2\2\2\r\16\3\2\2\2\16\f\3\2\2")
        buf.write("\2\16\17\3\2\2\2\17\3\3\2\2\2\20\21\7\3\2\2\21\22\5\b")
        buf.write("\5\2\22\23\7\4\2\2\23\26\5\b\5\2\24\25\7\5\2\2\25\27\t")
        buf.write("\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\32")
        buf.write("\7\b\2\2\31\33\7\t\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33")
        buf.write("\5\3\2\2\2\34\35\7\n\2\2\35\36\5\b\5\2\36 \7\b\2\2\37")
        buf.write("!\7\t\2\2 \37\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\"+\t\3\2\2")
        buf.write("#%\7\t\2\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2\2&(\7\16\2\2\'")
        buf.write(")\7\t\2\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*,\5\b\5\2+$\3")
        buf.write("\2\2\2+,\3\2\2\2,9\3\2\2\2-\66\7\r\2\2.\60\7\t\2\2/.\3")
        buf.write("\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\63\t\4\2\2\62\64\7")
        buf.write("\t\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\67")
        buf.write("\5\b\5\2\66/\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\"\3\2")
        buf.write("\2\28-\3\2\2\29\t\3\2\2\2\16\f\16\26\32 $(+/\63\668")
        return buf.getvalue()


class alphaParser ( Parser ):

    grammarFileName = "alpha.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'Assign '", "' to '", "' as a'", "'n integer'", 
                     "' float'", "'.'", "' '", "'Print '" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "REFERENCE", "STRING", "NUMBER", "PLUS", 
                      "MINUS", "TIMES", "DIVIDE", "WS" ]

    RULE_r = 0
    RULE_assign = 1
    RULE_show = 2
    RULE_value = 3

    ruleNames =  [ "r", "assign", "show", "value" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    REFERENCE=9
    STRING=10
    NUMBER=11
    PLUS=12
    MINUS=13
    TIMES=14
    DIVIDE=15
    WS=16

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RContext(ParserRuleContext):

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


        def getRuleIndex(self):
            return alphaParser.RULE_r

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterR" ):
                listener.enterR(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitR" ):
                listener.exitR(self)




    def r(self):

        localctx = alphaParser.RContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_r)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 10 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 10
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [alphaParser.T__0]:
                    self.state = 8
                    self.assign()
                    pass
                elif token in [alphaParser.T__7]:
                    self.state = 9
                    self.show()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 12 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==alphaParser.T__0 or _la==alphaParser.T__7):
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
            self.state = 14
            self.match(alphaParser.T__0)
            self.state = 15
            self.value()
            self.state = 16
            self.match(alphaParser.T__1)
            self.state = 17
            self.value()
            self.state = 20
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==alphaParser.T__2:
                self.state = 18
                self.match(alphaParser.T__2)
                self.state = 19
                _la = self._input.LA(1)
                if not(_la==alphaParser.T__3 or _la==alphaParser.T__4):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()


            self.state = 22
            self.match(alphaParser.T__5)
            self.state = 24
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==alphaParser.T__6:
                self.state = 23
                self.match(alphaParser.T__6)


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
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 26
            self.match(alphaParser.T__7)
            self.state = 27
            self.value()
            self.state = 28
            self.match(alphaParser.T__5)
            self.state = 30
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==alphaParser.T__6:
                self.state = 29
                self.match(alphaParser.T__6)


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

        def STRING(self):
            return self.getToken(alphaParser.STRING, 0)

        def REFERENCE(self):
            return self.getToken(alphaParser.REFERENCE, 0)

        def PLUS(self):
            return self.getToken(alphaParser.PLUS, 0)

        def value(self):
            return self.getTypedRuleContext(alphaParser.ValueContext,0)


        def NUMBER(self):
            return self.getToken(alphaParser.NUMBER, 0)

        def MINUS(self):
            return self.getToken(alphaParser.MINUS, 0)

        def TIMES(self):
            return self.getToken(alphaParser.TIMES, 0)

        def DIVIDE(self):
            return self.getToken(alphaParser.DIVIDE, 0)

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
        self.enterRule(localctx, 6, self.RULE_value)
        self._la = 0 # Token type
        try:
            self.state = 54
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [alphaParser.REFERENCE, alphaParser.STRING]:
                self.enterOuterAlt(localctx, 1)
                self.state = 32
                _la = self._input.LA(1)
                if not(_la==alphaParser.REFERENCE or _la==alphaParser.STRING):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 41
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==alphaParser.T__6 or _la==alphaParser.PLUS:
                    self.state = 34
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==alphaParser.T__6:
                        self.state = 33
                        self.match(alphaParser.T__6)


                    self.state = 36
                    self.match(alphaParser.PLUS)
                    self.state = 38
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==alphaParser.T__6:
                        self.state = 37
                        self.match(alphaParser.T__6)


                    self.state = 40
                    self.value()


                pass
            elif token in [alphaParser.NUMBER]:
                self.enterOuterAlt(localctx, 2)
                self.state = 43
                self.match(alphaParser.NUMBER)
                self.state = 52
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << alphaParser.T__6) | (1 << alphaParser.PLUS) | (1 << alphaParser.MINUS) | (1 << alphaParser.TIMES) | (1 << alphaParser.DIVIDE))) != 0):
                    self.state = 45
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==alphaParser.T__6:
                        self.state = 44
                        self.match(alphaParser.T__6)


                    self.state = 47
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << alphaParser.PLUS) | (1 << alphaParser.MINUS) | (1 << alphaParser.TIMES) | (1 << alphaParser.DIVIDE))) != 0)):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 49
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==alphaParser.T__6:
                        self.state = 48
                        self.match(alphaParser.T__6)


                    self.state = 51
                    self.value()


                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





