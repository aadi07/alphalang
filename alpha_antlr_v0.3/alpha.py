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
    def enterShow(self, ctx):
        x = [i for i in ctx.getChildren()][1].getText()
        if x[0] == '"' and '"' not in x[1:-1]:
            print(x[1:-1], ": String")

        elif x == 'true' or x == 'false':
            print(x, ": Boolean")

        else:
            x = x.replace('is equal to', '==').replace('is not equal to', '!=').replace('is greater than or equal to', '>=').replace(
                'is less than or equal to', '<=').replace('is less than', '<').replace('is greater than', '>')
            x += ' '
            equation = ""
            cur = ''
            max_precision = 0
            cur_presc = 0
            counting_decimals = False

            for i in x:
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
                print(value, ": String")

            elif type(value) == bool:
                print(str(value).lower(), ": Boolean")

            else:
                value = round(value, max_precision)

                if type(value) == int or value.is_integer():
                    print(int(value), ": Integer")

                else:
                    print(value, ": Float")


def main():
    if len(sys.argv) == 2:
        ipt = FileStream(sys.argv[1])

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
