from antlr4 import *
from alphaLexer import alphaLexer
from alphaListener import alphaListener
from alphaParser import alphaParser
import sys


class alphaPrintListener(alphaListener):
    def __init__(self):
        self.variables = {}


    def enterShow(self, ctx):
        print(convert([i for i in ctx.getChildren()][1], self.variables))


    def enterAssign(self, ctx):
        full = [i for i in ctx.getChildren()]
        value = convert(full[1], self.variables)
        var_name = convert(full[3], self.variables)
        self.variables[var_name] = value

def main():
    lexer = alphaLexer(FileStream(sys.argv[1]))
    stream = CommonTokenStream(lexer)
    parser = alphaParser(stream)
    tree = parser.r()
    printer = alphaPrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)


def convert(value, variables):
    x = [i.getText() for i in value.getChildren()][::4]
    total = ""
    
    for i in x:
        identifier = i[0]
        if identifier == 't':
            total += variables[i[i.index('"') + 1:-1]]

        elif identifier == '':
            total += i[1:-1]
    
    return total


if __name__ == '__main__':
    main()