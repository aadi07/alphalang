# Generated from alpha.g4 by ANTLR 4.8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16")
        buf.write("i\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3\2")
        buf.write("\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3")
        buf.write("\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b")
        buf.write("\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3")
        buf.write("\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\6\nM\n\n\r\n\16\nN\3\n")
        buf.write("\3\n\3\13\6\13T\n\13\r\13\16\13U\3\f\6\fY\n\f\r\f\16\f")
        buf.write("Z\3\f\3\f\6\f_\n\f\r\f\16\f`\3\r\6\rd\n\r\r\r\16\re\3")
        buf.write("\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13")
        buf.write("\25\f\27\r\31\16\3\2\5\4\2$$^^\3\2\62;\5\2\13\f\17\17")
        buf.write("\"\"\2m\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2")
        buf.write("\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2")
        buf.write("\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3")
        buf.write("\33\3\2\2\2\5#\3\2\2\2\7(\3\2\2\2\t*\3\2\2\2\13,\3\2\2")
        buf.write("\2\r\63\3\2\2\2\17\65\3\2\2\2\21:\3\2\2\2\23J\3\2\2\2")
        buf.write("\25S\3\2\2\2\27X\3\2\2\2\31c\3\2\2\2\33\34\7C\2\2\34\35")
        buf.write("\7u\2\2\35\36\7u\2\2\36\37\7k\2\2\37 \7i\2\2 !\7p\2\2")
        buf.write("!\"\7\"\2\2\"\4\3\2\2\2#$\7\"\2\2$%\7v\2\2%&\7q\2\2&\'")
        buf.write("\7\"\2\2\'\6\3\2\2\2()\7\60\2\2)\b\3\2\2\2*+\7\"\2\2+")
        buf.write("\n\3\2\2\2,-\7R\2\2-.\7t\2\2./\7k\2\2/\60\7p\2\2\60\61")
        buf.write("\7v\2\2\61\62\7\"\2\2\62\f\3\2\2\2\63\64\7-\2\2\64\16")
        buf.write("\3\2\2\2\65\66\7r\2\2\66\67\7n\2\2\678\7w\2\289\7u\2\2")
        buf.write("9\20\3\2\2\2:;\7v\2\2;<\7j\2\2<=\7g\2\2=>\7\"\2\2>?\7")
        buf.write("x\2\2?@\7c\2\2@A\7n\2\2AB\7w\2\2BC\7g\2\2CD\7\"\2\2DE")
        buf.write("\7q\2\2EF\7h\2\2FG\7\"\2\2GH\3\2\2\2HI\5\23\n\2I\22\3")
        buf.write("\2\2\2JL\7$\2\2KM\n\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2")
        buf.write("\2NO\3\2\2\2OP\3\2\2\2PQ\7$\2\2Q\24\3\2\2\2RT\t\3\2\2")
        buf.write("SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\26\3\2\2\2W")
        buf.write("Y\t\3\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3")
        buf.write("\2\2\2\\^\7\60\2\2]_\t\3\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2")
        buf.write("\2\2`a\3\2\2\2a\30\3\2\2\2bd\t\4\2\2cb\3\2\2\2de\3\2\2")
        buf.write("\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\b\r\2\2h\32\3\2\2\2")
        buf.write("\b\2NUZ`e\3\b\2\2")
        return buf.getvalue()


class alphaLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    REFERENCE = 8
    STRING = 9
    INTEGER = 10
    FLOAT = 11
    WS = 12

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'Assign '", "' to '", "'.'", "' '", "'Print '", "'+'", "'plus'" ]

    symbolicNames = [ "<INVALID>",
            "REFERENCE", "STRING", "INTEGER", "FLOAT", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "REFERENCE", "STRING", "INTEGER", "FLOAT", "WS" ]

    grammarFileName = "alpha.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


