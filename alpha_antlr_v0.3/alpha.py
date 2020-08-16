from antlr4 import *
from alphaLexer import alphaLexer
from alphaListener import alphaListener
from alphaParser import alphaParser
import sys
import re

code = '''
Assign 10 to "count".
While the value of "count" is greater than 0:
    Print the value of "count",
    Assign the value of "count" - 1 to "count".
'''

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

real_variables = {}


class alphaConcreteListener(alphaListener):
    def __init__(self, variables={}, affect_global=True):
        self.if_true = True
        self.if_was_true = False
        self.variables = variables
        self.affect_global = True
        self.in_while = False

    def enterShow(self, ctx):
        if not self.in_while and self.if_true and not self.if_was_true:
            value = [i for i in ctx.getChildren()][1].getText()
            printable, t = self.convert(value)
            print(f"{printable} : {t}")

    def enterAssign(self, ctx):
        if self.affect_global:
            global real_variables
        if not self.in_while and self.if_true and not self.if_was_true:
            full = [i.getText() for i in ctx.getChildren()]
            value, t = self.convert(full[1])
            name, _ = self.convert(full[3])
            if t == "Boolean":
                if self.affect_global:
                    real_variables[name] = value == "true"

                self.variables[name] = value == "true"

            else:
                if self.affect_global:
                    real_variables[name] = value

                self.variables[name] = value

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

    def enterWhileLoop(self, ctx):
        full = [i.getText() for i in ctx.getChildren()]

        while self.convert(full[1])[0] == "true":
            lexer = alphaLexer(InputStream('. '.join(full[3::2]) + '.'))
            stream = CommonTokenStream(lexer)
            parser = alphaParser(stream)
            tree = parser.prog()
            listener = alphaConcreteListener(variables=self.variables)
            walker = ParseTreeWalker()
            walker.walk(listener, tree)

            self.variables = real_variables

        self.in_while = True

    def exitWhileLoop(self, ctx):
        self.in_while = False

    def convert(self, value):
        def ref(obj):
            value = self.variables[obj.group(1)]
            if type(value) == bool:
                return str(value).lower()

            elif type(value) != str:
                return str(value)

            else:
                return '"' + str(value) + '"'

        if value[0] == '"' and '"' not in value[1:-1]:
            return value[1:-1], "String"

        elif value == 'true' or value == 'false':
            return value, "Boolean"

        else:
            value = value.replace('is equal to', '==').replace('is not equal to', '!=').replace('is greater than or equal to', '>=').replace(
                'is less than or equal to', '<=').replace('is less than', '<').replace('is greater than', '>')
            value += ' '
            value = re.sub(
                r'the value of "([^"]+)"', ref, value)

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

                if type(value) == int or max_precision == 0:
                    return int(value), "Integer"

                else:
                    return value, "Float"


def main(code=""):
    if code != '':
        ipt = InputStream(code)

    elif len(sys.argv) == 2:
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
