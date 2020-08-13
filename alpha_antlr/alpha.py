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
        typ = full[4].getText()
        if typ == '.':
            self.variables[var_name] = str(value)

        elif full[5].getText()[-1] == 'r':
            self.variables[var_name] = int(value)

        else:
            self.variables[var_name] = float(value)


def main():
    if len(sys.argv) == 2:
        ipt = FileStream(sys.argv[1])
    else:
        ipt = StdinStream()
    lexer = alphaLexer(ipt)
    stream = CommonTokenStream(lexer)
    parser = alphaParser(stream)
    tree = parser.r()
    printer = alphaPrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)


def convert(value, variables):
    x = [i.getText() for i in value.getChildren()]
    value = ''
    if x[0][0].isdigit() or x[0][0] == '.' or (x[0][0] == 't' and type(variables[x[0][x[0].index('"') + 1: -1]]) != str):
        for i in x:
            if i in ['times', '*', 'multiplied by']:
                value += '*'

            elif i in ['plus', '+']:
                value += '+'

            elif i in ['minus', '-']:
                value += '-'

            elif i in ['divided by', 'by', '/']:
                value += '/'

            elif i[0] != 't':
                value += i

            else:
                value += str(variables[i[i.index('"') + 1: -1]])

        value = eval(value)

    else:
        for i in x[::4]:
            value += i[1: -
                       1] if i[0] == '"' else variables[i[i.index('"') + 1: -1]]

    return value


if __name__ == '__main__':
    main()
