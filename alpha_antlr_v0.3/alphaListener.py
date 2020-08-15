# Generated from alpha.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .alphaParser import alphaParser
else:
    from alphaParser import alphaParser

# This class defines a complete listener for a parse tree produced by alphaParser.
class alphaListener(ParseTreeListener):

    # Enter a parse tree produced by alphaParser#prog.
    def enterProg(self, ctx:alphaParser.ProgContext):
        pass

    # Exit a parse tree produced by alphaParser#prog.
    def exitProg(self, ctx:alphaParser.ProgContext):
        pass


    # Enter a parse tree produced by alphaParser#show.
    def enterShow(self, ctx:alphaParser.ShowContext):
        pass

    # Exit a parse tree produced by alphaParser#show.
    def exitShow(self, ctx:alphaParser.ShowContext):
        pass



del alphaParser