from antlr4 import *
from alphaLexer import alphaLexer
from alphaListener import alphaListener
from alphaParser import alphaParser
import sys

OP_MAP = {
    ' times': ' *',
    ' plus': ' +',
    ' minus': ' -',
    ' by': ' /',
    ' raise': ' **',
    ' ^': ' **',
    'true': 'True',
    'false': 'False',
    ' true': ' True',
    ' false': ' False',
}


class alphaConcreteListener(alphaListener):
    def __init__(self):
        self.if_true = True
        self.if_was_true = False

    def enterShow(self, ctx):
        if self.if_true and not self.if_was_true:
            value = [i for i in ctx.getChildren()][1].getText()
            printable, t = self.convert(value)
            print(f"{printable} : {t}")

    def enterIfStmt(self, ctx):
        x, _ = self.convert(list(ctx.getChildren())[1].getText())
        self.if_true = x == "true"

    def exitIfBlock(self, ctx):
        self.if_was_true = False

    def enterElifStmt(self, ctx):
        x, _ = self.convert(list(ctx.getChildren())[1].getText())
        self.if_true = x == "true" and not self.if_was_true

    def exitIfStmt(self, ctx):
        if self.if_true:
            self.if_was_true = True
        self.if_true = True

    def exitElifStmt(self, ctx):
        if self.if_true:
            self.if_was_true = True
        self.if_true = True

    def convert(self, value):
        if value[0] == '"' and '"' not in value[1:-1]:
            return value[1:-1], "String"

        elif value == 'true' or value == 'false':
            return value, "Boolean"

        else:
            value = value.replace('is equal to', '==').replace('is not equal to', '!=').replace('is greater than or equal to', '>=').replace(
                'is less than or equal to', '<=').replace('is less than', '<').replace('is greater than', '>')
            value += ' '
            equation = ""
            cur = ''
            max_precision = 0
            cur_presc = 0
            counting_decimals = False

            for i in value:
                if i == ' ':
                    cur = OP_MAP.get(cur, cur)

                    equation += cur
                    cur = ''
                    counting_decimals = False
                    max_precision = max(cur_presc, max_precision)
                    cur_presc = 0

                elif i == '.':
                    counting_decimals = True

                elif counting_decimals:
                    cur_presc += 1

                cur += i

            value = eval(equation)

            if type(value) == str:
                return value, "String"

            elif type(value) == bool:
                return str(value).lower(), "Boolean"

            else:
                value = round(value, max_precision)

                if type(value) == int or value.is_integer():
                    return int(value), "Integer"

                else:
                    return value, "Float"


def main(code=""):
    if len(sys.argv) == 2:
        ipt = FileStream(sys.argv[1])

    elif code != '':
        ipt = InputStream(code)

    else:
        ipt = StdinStream()

    lexer = alphaLexer(ipt)
    stream = CommonTokenStream(lexer)
    parser = alphaParser(stream)
    tree = parser.prog()
    listener = alphaConcreteListener()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)


if __name__ == '__main__':
    main()
