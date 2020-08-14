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


    # Enter a parse tree produced by alphaParser#returnFunc.
    def enterReturnFunc(self, ctx:alphaParser.ReturnFuncContext):
        pass

    # Exit a parse tree produced by alphaParser#returnFunc.
    def exitReturnFunc(self, ctx:alphaParser.ReturnFuncContext):
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


    # Enter a parse tree produced by alphaParser#func.
    def enterFunc(self, ctx:alphaParser.FuncContext):
        pass

    # Exit a parse tree produced by alphaParser#func.
    def exitFunc(self, ctx:alphaParser.FuncContext):
        pass


    # Enter a parse tree produced by alphaParser#call.
    def enterCall(self, ctx:alphaParser.CallContext):
        pass

    # Exit a parse tree produced by alphaParser#call.
    def exitCall(self, ctx:alphaParser.CallContext):
        pass


    # Enter a parse tree produced by alphaParser#returnVal.
    def enterReturnVal(self, ctx:alphaParser.ReturnValContext):
        pass

    # Exit a parse tree produced by alphaParser#returnVal.
    def exitReturnVal(self, ctx:alphaParser.ReturnValContext):
        pass


    # Enter a parse tree produced by alphaParser#value.
    def enterValue(self, ctx:alphaParser.ValueContext):
        pass

    # Exit a parse tree produced by alphaParser#value.
    def exitValue(self, ctx:alphaParser.ValueContext):
        pass


    # Enter a parse tree produced by alphaParser#args.
    def enterArgs(self, ctx:alphaParser.ArgsContext):
        pass

    # Exit a parse tree produced by alphaParser#args.
    def exitArgs(self, ctx:alphaParser.ArgsContext):
        pass


    # Enter a parse tree produced by alphaParser#reference.
    def enterReference(self, ctx:alphaParser.ReferenceContext):
        pass

    # Exit a parse tree produced by alphaParser#reference.
    def exitReference(self, ctx:alphaParser.ReferenceContext):
        pass


    # Enter a parse tree produced by alphaParser#returnCall.
    def enterReturnCall(self, ctx:alphaParser.ReturnCallContext):
        pass

    # Exit a parse tree produced by alphaParser#returnCall.
    def exitReturnCall(self, ctx:alphaParser.ReturnCallContext):
        pass



del alphaParser