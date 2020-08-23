# Generated from ../../alpha_lang/alpha_antlr_v0.4/alpha.g4 by ANTLR 4.8
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


    # Enter a parse tree produced by alphaParser#exit.
    def enterExit(self, ctx:alphaParser.ExitContext):
        pass

    # Exit a parse tree produced by alphaParser#exit.
    def exitExit(self, ctx:alphaParser.ExitContext):
        pass


    # Enter a parse tree produced by alphaParser#call.
    def enterCall(self, ctx:alphaParser.CallContext):
        pass

    # Exit a parse tree produced by alphaParser#call.
    def exitCall(self, ctx:alphaParser.CallContext):
        pass


    # Enter a parse tree produced by alphaParser#define.
    def enterDefine(self, ctx:alphaParser.DefineContext):
        pass

    # Exit a parse tree produced by alphaParser#define.
    def exitDefine(self, ctx:alphaParser.DefineContext):
        pass


    # Enter a parse tree produced by alphaParser#returnStmt.
    def enterReturnStmt(self, ctx:alphaParser.ReturnStmtContext):
        pass

    # Exit a parse tree produced by alphaParser#returnStmt.
    def exitReturnStmt(self, ctx:alphaParser.ReturnStmtContext):
        pass


    # Enter a parse tree produced by alphaParser#show.
    def enterShow(self, ctx:alphaParser.ShowContext):
        pass

    # Exit a parse tree produced by alphaParser#show.
    def exitShow(self, ctx:alphaParser.ShowContext):
        pass


    # Enter a parse tree produced by alphaParser#ifStmt.
    def enterIfStmt(self, ctx:alphaParser.IfStmtContext):
        pass

    # Exit a parse tree produced by alphaParser#ifStmt.
    def exitIfStmt(self, ctx:alphaParser.IfStmtContext):
        pass


    # Enter a parse tree produced by alphaParser#elifStmt.
    def enterElifStmt(self, ctx:alphaParser.ElifStmtContext):
        pass

    # Exit a parse tree produced by alphaParser#elifStmt.
    def exitElifStmt(self, ctx:alphaParser.ElifStmtContext):
        pass


    # Enter a parse tree produced by alphaParser#elseStmt.
    def enterElseStmt(self, ctx:alphaParser.ElseStmtContext):
        pass

    # Exit a parse tree produced by alphaParser#elseStmt.
    def exitElseStmt(self, ctx:alphaParser.ElseStmtContext):
        pass


    # Enter a parse tree produced by alphaParser#ifBlock.
    def enterIfBlock(self, ctx:alphaParser.IfBlockContext):
        pass

    # Exit a parse tree produced by alphaParser#ifBlock.
    def exitIfBlock(self, ctx:alphaParser.IfBlockContext):
        pass


    # Enter a parse tree produced by alphaParser#assign.
    def enterAssign(self, ctx:alphaParser.AssignContext):
        pass

    # Exit a parse tree produced by alphaParser#assign.
    def exitAssign(self, ctx:alphaParser.AssignContext):
        pass


    # Enter a parse tree produced by alphaParser#forLoop.
    def enterForLoop(self, ctx:alphaParser.ForLoopContext):
        pass

    # Exit a parse tree produced by alphaParser#forLoop.
    def exitForLoop(self, ctx:alphaParser.ForLoopContext):
        pass


    # Enter a parse tree produced by alphaParser#whileLoop.
    def enterWhileLoop(self, ctx:alphaParser.WhileLoopContext):
        pass

    # Exit a parse tree produced by alphaParser#whileLoop.
    def exitWhileLoop(self, ctx:alphaParser.WhileLoopContext):
        pass


    # Enter a parse tree produced by alphaParser#append.
    def enterAppend(self, ctx:alphaParser.AppendContext):
        pass

    # Exit a parse tree produced by alphaParser#append.
    def exitAppend(self, ctx:alphaParser.AppendContext):
        pass


    # Enter a parse tree produced by alphaParser#removeVal.
    def enterRemoveVal(self, ctx:alphaParser.RemoveValContext):
        pass

    # Exit a parse tree produced by alphaParser#removeVal.
    def exitRemoveVal(self, ctx:alphaParser.RemoveValContext):
        pass


    # Enter a parse tree produced by alphaParser#removeAll.
    def enterRemoveAll(self, ctx:alphaParser.RemoveAllContext):
        pass

    # Exit a parse tree produced by alphaParser#removeAll.
    def exitRemoveAll(self, ctx:alphaParser.RemoveAllContext):
        pass


    # Enter a parse tree produced by alphaParser#removePos.
    def enterRemovePos(self, ctx:alphaParser.RemovePosContext):
        pass

    # Exit a parse tree produced by alphaParser#removePos.
    def exitRemovePos(self, ctx:alphaParser.RemovePosContext):
        pass



del alphaParser