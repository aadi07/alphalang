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


    # Enter a parse tree produced by alphaParser#define.
    def enterDefine(self, ctx:alphaParser.DefineContext):
        pass

    # Exit a parse tree produced by alphaParser#define.
    def exitDefine(self, ctx:alphaParser.DefineContext):
        pass


    # Enter a parse tree produced by alphaParser#func_nr_call.
    def enterFunc_nr_call(self, ctx:alphaParser.Func_nr_callContext):
        pass

    # Exit a parse tree produced by alphaParser#func_nr_call.
    def exitFunc_nr_call(self, ctx:alphaParser.Func_nr_callContext):
        pass


    # Enter a parse tree produced by alphaParser#func_r_call.
    def enterFunc_r_call(self, ctx:alphaParser.Func_r_callContext):
        pass

    # Exit a parse tree produced by alphaParser#func_r_call.
    def exitFunc_r_call(self, ctx:alphaParser.Func_r_callContext):
        pass


    # Enter a parse tree produced by alphaParser#func_head.
    def enterFunc_head(self, ctx:alphaParser.Func_headContext):
        pass

    # Exit a parse tree produced by alphaParser#func_head.
    def exitFunc_head(self, ctx:alphaParser.Func_headContext):
        pass


    # Enter a parse tree produced by alphaParser#func_body.
    def enterFunc_body(self, ctx:alphaParser.Func_bodyContext):
        pass

    # Exit a parse tree produced by alphaParser#func_body.
    def exitFunc_body(self, ctx:alphaParser.Func_bodyContext):
        pass


    # Enter a parse tree produced by alphaParser#func_assign.
    def enterFunc_assign(self, ctx:alphaParser.Func_assignContext):
        pass

    # Exit a parse tree produced by alphaParser#func_assign.
    def exitFunc_assign(self, ctx:alphaParser.Func_assignContext):
        pass


    # Enter a parse tree produced by alphaParser#func_show.
    def enterFunc_show(self, ctx:alphaParser.Func_showContext):
        pass

    # Exit a parse tree produced by alphaParser#func_show.
    def exitFunc_show(self, ctx:alphaParser.Func_showContext):
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



del alphaParser