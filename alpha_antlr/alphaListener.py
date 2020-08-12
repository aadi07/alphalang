# Generated from alpha.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .alphaParser import alphaParser
else:
    from alphaParser import alphaParser

# This class defines a complete listener for a parse tree produced by alphaParser.
class alphaListener(ParseTreeListener):

    # Enter a parse tree produced by alphaParser#r.
    def enterR(self, ctx:alphaParser.RContext):
        pass

    # Exit a parse tree produced by alphaParser#r.
    def exitR(self, ctx:alphaParser.RContext):
        pass


    # Enter a parse tree produced by alphaParser#assign.
    def enterAssign(self, ctx:alphaParser.AssignContext):
        pass

    # Exit a parse tree produced by alphaParser#assign.
    def exitAssign(self, ctx:alphaParser.AssignContext):
        pass


    # Enter a parse tree produced by alphaParser#show.
    def enterShow(self, ctx:alphaParser.ShowContext):
        pass

    # Exit a parse tree produced by alphaParser#show.
    def exitShow(self, ctx:alphaParser.ShowContext):
        pass


    # Enter a parse tree produced by alphaParser#value.
    def enterValue(self, ctx:alphaParser.ValueContext):
        pass

    # Exit a parse tree produced by alphaParser#value.
    def exitValue(self, ctx:alphaParser.ValueContext):
        pass



del alphaParser