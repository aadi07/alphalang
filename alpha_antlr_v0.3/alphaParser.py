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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31")
        buf.write("Z\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2")
        buf.write("\3\2\5\2\21\n\2\3\2\3\2\5\2\25\n\2\7\2\27\n\2\f\2\16\2")
        buf.write("\32\13\2\3\3\3\3\3\3\3\4\3\4\7\4!\n\4\f\4\16\4$\13\4\3")
        buf.write("\4\5\4\'\n\4\3\5\3\5\3\5\3\5\5\5-\n\5\3\5\3\5\3\5\5\5")
        buf.write("\62\n\5\5\5\64\n\5\6\5\66\n\5\r\5\16\5\67\3\6\3\6\3\6")
        buf.write("\3\6\5\6>\n\6\3\6\3\6\3\6\5\6C\n\6\5\6E\n\6\6\6G\n\6\r")
        buf.write("\6\16\6H\3\7\3\7\5\7M\n\7\3\7\3\7\3\7\5\7R\n\7\5\7T\n")
        buf.write("\7\6\7V\n\7\r\7\16\7W\3\7\2\2\b\2\4\6\b\n\f\2\3\4\2\n")
        buf.write("\13\16\16\2d\2\30\3\2\2\2\4\33\3\2\2\2\6\36\3\2\2\2\b")
        buf.write("(\3\2\2\2\n9\3\2\2\2\fJ\3\2\2\2\16\21\5\4\3\2\17\21\5")
        buf.write("\6\4\2\20\16\3\2\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\24")
        buf.write("\7\3\2\2\23\25\7\31\2\2\24\23\3\2\2\2\24\25\3\2\2\2\25")
        buf.write("\27\3\2\2\2\26\20\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2")
        buf.write("\30\31\3\2\2\2\31\3\3\2\2\2\32\30\3\2\2\2\33\34\7\4\2")
        buf.write("\2\34\35\t\2\2\2\35\5\3\2\2\2\36\"\5\b\5\2\37!\5\n\6\2")
        buf.write(" \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#&\3\2\2\2")
        buf.write("$\"\3\2\2\2%\'\5\f\7\2&%\3\2\2\2&\'\3\2\2\2\'\7\3\2\2")
        buf.write("\2()\7\5\2\2)*\7\13\2\2*,\7\6\2\2+-\7\31\2\2,+\3\2\2\2")
        buf.write(",-\3\2\2\2-\65\3\2\2\2.\63\5\4\3\2/\61\7\7\2\2\60\62\7")
        buf.write("\31\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63/")
        buf.write("\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65.\3\2\2\2\66\67")
        buf.write("\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\t\3\2\2\29:\7\b\2")
        buf.write("\2:;\7\13\2\2;=\7\6\2\2<>\7\31\2\2=<\3\2\2\2=>\3\2\2\2")
        buf.write(">F\3\2\2\2?D\5\4\3\2@B\7\7\2\2AC\7\31\2\2BA\3\2\2\2BC")
        buf.write("\3\2\2\2CE\3\2\2\2D@\3\2\2\2DE\3\2\2\2EG\3\2\2\2F?\3\2")
        buf.write("\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\13\3\2\2\2JL\7\t\2")
        buf.write("\2KM\7\31\2\2LK\3\2\2\2LM\3\2\2\2MU\3\2\2\2NS\5\4\3\2")
        buf.write("OQ\7\7\2\2PR\7\31\2\2QP\3\2\2\2QR\3\2\2\2RT\3\2\2\2SO")
        buf.write("\3\2\2\2ST\3\2\2\2TV\3\2\2\2UN\3\2\2\2VW\3\2\2\2WU\3\2")
        buf.write("\2\2WX\3\2\2\2X\r\3\2\2\2\23\20\24\30\"&,\61\63\67=BD")
        buf.write("HLQSW")
        return buf.getvalue()


class alphaParser ( Parser ):

    grammarFileName = "alpha.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'.'", "'Print '", "'If '", "':'", "','", 
                     "'otherwise if '", "'otherwise:'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "' and '", "' or '" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "MATH", "BOOL", "INTEGER", "FLOAT", "STRING", "STRING_FACTOR", 
                      "STRING_LITERAL", "BOOL_LITERAL", "AND", "OR", "ADD", 
                      "SUBTRACT", "MULTIPLY", "DIVIDE", "POWER", "WS" ]

    RULE_prog = 0
    RULE_show = 1
    RULE_ifBlock = 2
    RULE_ifStmt = 3
    RULE_elifStmt = 4
    RULE_elseStmt = 5

    ruleNames =  [ "prog", "show", "ifBlock", "ifStmt", "elifStmt", "elseStmt" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    MATH=8
    BOOL=9
    INTEGER=10
    FLOAT=11
    STRING=12
    STRING_FACTOR=13
    STRING_LITERAL=14
    BOOL_LITERAL=15
    AND=16
    OR=17
    ADD=18
    SUBTRACT=19
    MULTIPLY=20
    DIVIDE=21
    POWER=22
    WS=23

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


        def ifBlock(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.IfBlockContext)
            else:
                return self.getTypedRuleContext(alphaParser.IfBlockContext,i)


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
            self.state = 22
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==alphaParser.T__1 or _la==alphaParser.T__2:
                self.state = 14
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [alphaParser.T__1]:
                    self.state = 12
                    self.show()
                    pass
                elif token in [alphaParser.T__2]:
                    self.state = 13
                    self.ifBlock()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 16
                self.match(alphaParser.T__0)
                self.state = 18
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==alphaParser.WS:
                    self.state = 17
                    self.match(alphaParser.WS)


                self.state = 24
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
            self.state = 25
            self.match(alphaParser.T__1)
            self.state = 26
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


    class IfBlockContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ifStmt(self):
            return self.getTypedRuleContext(alphaParser.IfStmtContext,0)


        def elifStmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.ElifStmtContext)
            else:
                return self.getTypedRuleContext(alphaParser.ElifStmtContext,i)


        def elseStmt(self):
            return self.getTypedRuleContext(alphaParser.ElseStmtContext,0)


        def getRuleIndex(self):
            return alphaParser.RULE_ifBlock

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfBlock" ):
                listener.enterIfBlock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfBlock" ):
                listener.exitIfBlock(self)




    def ifBlock(self):

        localctx = alphaParser.IfBlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_ifBlock)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 28
            self.ifStmt()
            self.state = 32
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==alphaParser.T__5:
                self.state = 29
                self.elifStmt()
                self.state = 34
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 36
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==alphaParser.T__6:
                self.state = 35
                self.elseStmt()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IfStmtContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BOOL(self):
            return self.getToken(alphaParser.BOOL, 0)

        def WS(self, i:int=None):
            if i is None:
                return self.getTokens(alphaParser.WS)
            else:
                return self.getToken(alphaParser.WS, i)

        def show(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.ShowContext)
            else:
                return self.getTypedRuleContext(alphaParser.ShowContext,i)


        def getRuleIndex(self):
            return alphaParser.RULE_ifStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfStmt" ):
                listener.enterIfStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfStmt" ):
                listener.exitIfStmt(self)




    def ifStmt(self):

        localctx = alphaParser.IfStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_ifStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 38
            self.match(alphaParser.T__2)
            self.state = 39
            self.match(alphaParser.BOOL)
            self.state = 40
            self.match(alphaParser.T__3)
            self.state = 42
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==alphaParser.WS:
                self.state = 41
                self.match(alphaParser.WS)


            self.state = 51 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 44
                self.show()
                self.state = 49
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==alphaParser.T__4:
                    self.state = 45
                    self.match(alphaParser.T__4)
                    self.state = 47
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==alphaParser.WS:
                        self.state = 46
                        self.match(alphaParser.WS)




                self.state = 53 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==alphaParser.T__1):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElifStmtContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BOOL(self):
            return self.getToken(alphaParser.BOOL, 0)

        def WS(self, i:int=None):
            if i is None:
                return self.getTokens(alphaParser.WS)
            else:
                return self.getToken(alphaParser.WS, i)

        def show(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.ShowContext)
            else:
                return self.getTypedRuleContext(alphaParser.ShowContext,i)


        def getRuleIndex(self):
            return alphaParser.RULE_elifStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElifStmt" ):
                listener.enterElifStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElifStmt" ):
                listener.exitElifStmt(self)




    def elifStmt(self):

        localctx = alphaParser.ElifStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_elifStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 55
            self.match(alphaParser.T__5)
            self.state = 56
            self.match(alphaParser.BOOL)
            self.state = 57
            self.match(alphaParser.T__3)
            self.state = 59
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==alphaParser.WS:
                self.state = 58
                self.match(alphaParser.WS)


            self.state = 68 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 61
                self.show()
                self.state = 66
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==alphaParser.T__4:
                    self.state = 62
                    self.match(alphaParser.T__4)
                    self.state = 64
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==alphaParser.WS:
                        self.state = 63
                        self.match(alphaParser.WS)




                self.state = 70 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==alphaParser.T__1):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElseStmtContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WS(self, i:int=None):
            if i is None:
                return self.getTokens(alphaParser.WS)
            else:
                return self.getToken(alphaParser.WS, i)

        def show(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(alphaParser.ShowContext)
            else:
                return self.getTypedRuleContext(alphaParser.ShowContext,i)


        def getRuleIndex(self):
            return alphaParser.RULE_elseStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElseStmt" ):
                listener.enterElseStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElseStmt" ):
                listener.exitElseStmt(self)




    def elseStmt(self):

        localctx = alphaParser.ElseStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_elseStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            self.match(alphaParser.T__6)
            self.state = 74
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==alphaParser.WS:
                self.state = 73
                self.match(alphaParser.WS)


            self.state = 83 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 76
                self.show()
                self.state = 81
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==alphaParser.T__4:
                    self.state = 77
                    self.match(alphaParser.T__4)
                    self.state = 79
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==alphaParser.WS:
                        self.state = 78
                        self.match(alphaParser.WS)




                self.state = 85 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==alphaParser.T__1):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





