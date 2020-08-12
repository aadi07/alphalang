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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16")
        buf.write("*\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\6\2\r\n\2\r")
        buf.write("\2\16\2\16\3\3\3\3\3\3\3\3\3\3\3\3\5\3\27\n\3\3\4\3\4")
        buf.write("\3\4\3\4\5\4\35\n\4\3\5\3\5\5\5!\n\5\3\5\3\5\5\5%\n\5")
        buf.write("\3\5\5\5(\n\5\3\5\2\2\6\2\4\6\b\2\4\3\2\n\13\3\2\b\t\2")
        buf.write(",\2\f\3\2\2\2\4\20\3\2\2\2\6\30\3\2\2\2\b\36\3\2\2\2\n")
        buf.write("\r\5\4\3\2\13\r\5\6\4\2\f\n\3\2\2\2\f\13\3\2\2\2\r\16")
        buf.write("\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2\2\17\3\3\2\2\2\20\21")
        buf.write("\7\3\2\2\21\22\5\b\5\2\22\23\7\4\2\2\23\24\5\b\5\2\24")
        buf.write("\26\7\5\2\2\25\27\7\6\2\2\26\25\3\2\2\2\26\27\3\2\2\2")
        buf.write("\27\5\3\2\2\2\30\31\7\7\2\2\31\32\5\b\5\2\32\34\7\5\2")
        buf.write("\2\33\35\7\6\2\2\34\33\3\2\2\2\34\35\3\2\2\2\35\7\3\2")
        buf.write("\2\2\36\'\t\2\2\2\37!\7\6\2\2 \37\3\2\2\2 !\3\2\2\2!\"")
        buf.write("\3\2\2\2\"$\t\3\2\2#%\7\6\2\2$#\3\2\2\2$%\3\2\2\2%&\3")
        buf.write("\2\2\2&(\5\b\5\2\' \3\2\2\2\'(\3\2\2\2(\t\3\2\2\2\t\f")
        buf.write("\16\26\34 $\'")
        return buf.getvalue()


class alphaParser ( Parser ):

    grammarFileName = "alpha.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'Assign '", "' to '", "'.'", "' '", "'Print '", 
                     "'+'", "'plus'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "REFERENCE", "STRING", "INTEGER", "FLOAT", "WS" ]

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
    REFERENCE=8
    STRING=9
    INTEGER=10
    FLOAT=11
    WS=12

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
                elif token in [alphaParser.T__4]:
                    self.state = 9
                    self.show()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 12 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==alphaParser.T__0 or _la==alphaParser.T__4):
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
            self.state = 18
            self.match(alphaParser.T__2)
            self.state = 20
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==alphaParser.T__3:
                self.state = 19
                self.match(alphaParser.T__3)


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
            self.state = 22
            self.match(alphaParser.T__4)
            self.state = 23
            self.value()
            self.state = 24
            self.match(alphaParser.T__2)
            self.state = 26
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==alphaParser.T__3:
                self.state = 25
                self.match(alphaParser.T__3)


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

        def value(self):
            return self.getTypedRuleContext(alphaParser.ValueContext,0)


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
            self.enterOuterAlt(localctx, 1)
            self.state = 28
            _la = self._input.LA(1)
            if not(_la==alphaParser.REFERENCE or _la==alphaParser.STRING):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 37
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << alphaParser.T__3) | (1 << alphaParser.T__5) | (1 << alphaParser.T__6))) != 0):
                self.state = 30
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==alphaParser.T__3:
                    self.state = 29
                    self.match(alphaParser.T__3)


                self.state = 32
                _la = self._input.LA(1)
                if not(_la==alphaParser.T__5 or _la==alphaParser.T__6):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 34
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==alphaParser.T__3:
                    self.state = 33
                    self.match(alphaParser.T__3)


                self.state = 36
                self.value()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





