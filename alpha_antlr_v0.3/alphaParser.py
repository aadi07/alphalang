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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24")
        buf.write("\24\4\2\t\2\4\3\t\3\3\2\3\2\3\2\5\2\n\n\2\7\2\f\n\2\f")
        buf.write("\2\16\2\17\13\2\3\3\3\3\3\3\3\3\2\2\4\2\4\2\3\4\2\5\6")
        buf.write("\t\t\2\23\2\r\3\2\2\2\4\20\3\2\2\2\6\7\5\4\3\2\7\t\7\3")
        buf.write("\2\2\b\n\7\24\2\2\t\b\3\2\2\2\t\n\3\2\2\2\n\f\3\2\2\2")
        buf.write("\13\6\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16")
        buf.write("\3\3\2\2\2\17\r\3\2\2\2\20\21\7\4\2\2\21\22\t\2\2\2\22")
        buf.write("\5\3\2\2\2\4\t\r")
        return buf.getvalue()


class alphaParser ( Parser ):

    grammarFileName = "alpha.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'.'", "'Print '", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "' and '", "' or '" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "MATH", "BOOL", 
                      "INTEGER", "FLOAT", "STRING", "STRING_FACTOR", "STRING_LITERAL", 
                      "BOOL_LITERAL", "AND", "OR", "ADD", "SUBTRACT", "MULTIPLY", 
                      "DIVIDE", "POWER", "WS" ]

    RULE_prog = 0
    RULE_show = 1

    ruleNames =  [ "prog", "show" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    MATH=3
    BOOL=4
    INTEGER=5
    FLOAT=6
    STRING=7
    STRING_FACTOR=8
    STRING_LITERAL=9
    BOOL_LITERAL=10
    AND=11
    OR=12
    ADD=13
    SUBTRACT=14
    MULTIPLY=15
    DIVIDE=16
    POWER=17
    WS=18

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def show(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.ShowContext)
            else:
                return self.getTypedRuleContext(alphaParser.ShowContext,i)


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
            self.state = 11
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==alphaParser.T__1:
                self.state = 4
                self.show()
                self.state = 5
                self.match(alphaParser.T__0)
                self.state = 7
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==alphaParser.WS:
                    self.state = 6
                    self.match(alphaParser.WS)


                self.state = 13
                self._errHandler.sync(self)
                _la = self._input.LA(1)

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

        def STRING(self):
            return self.getToken(alphaParser.STRING, 0)

        def MATH(self):
            return self.getToken(alphaParser.MATH, 0)

        def BOOL(self):
            return self.getToken(alphaParser.BOOL, 0)

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
        self.enterRule(localctx, 2, self.RULE_show)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 14
            self.match(alphaParser.T__1)
            self.state = 15
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << alphaParser.MATH) | (1 << alphaParser.BOOL) | (1 << alphaParser.STRING))) != 0)):
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





