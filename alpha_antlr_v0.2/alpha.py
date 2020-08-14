from antlr4 import *
from alphaLexer import alphaLexer
from alphaListener import alphaListener
from alphaParser import alphaParser
import sys


class alphaConcreteListener(alphaListener):
    def __init__(self, variables={}, functions={}):
        self.variables = variables
        self.functions = functions
        self.in_func = False

    def enterShow(self, ctx):
        if not self.in_func:
            values = list(ctx.getChildren())
            print(convert(values[1], self.variables))

    def enterAssign(self, ctx):
        if not self.in_func:
            full = list(ctx.getChildren())
            value = convert(full[1], self.variables)
            name = convert(full[3], self.variables)
            self.variables[name] = value

    def enterFunc(self, ctx):
        if not self.in_func:
            self.in_func = True
            full = list(ctx.getChildren())
            name = convert(full[1], self.variables)
            args = [convert(i, self.variables)
                    for i in list(full[3].getChildren())[::2]]
            code = [i.getText() for i in full[5::2]]
            self.functions[(name, len(args))] = (args, '. '.join(code) + '.')

    def exitFunc(self, ctx):
        self.in_func = False

    def enterCall(self, ctx):
        if not self.in_func:
            full = list(ctx.getChildren())
            name = convert(full[1], self.variables)
            args = [convert(i, self.variables)
                    for i in list(full[3].getChildren())[::2]]
            arg_names, code = self.functions[(name, len(args))]
            arg_vars = self.variables.copy()
            arg_vars.update({arg_names[i]: args[i] for i in range(len(args))})
            lexer = alphaLexer(InputStream(code))
            stream = CommonTokenStream(lexer)
            parser = alphaParser(stream)
            tree = parser.prog()
            printer = alphaConcreteListener(
                variables=arg_vars, functions=self.functions)
            walker = ParseTreeWalker()
            walker.walk(printer, tree)


def main():
    if len(sys.argv) == 2:
        ipt = FileStream(sys.argv[1])

    else:
        ipt = StdinStream()

    lexer = alphaLexer(ipt)
    stream = CommonTokenStream(lexer)
    parser = alphaParser(stream)
    tree = parser.prog()
    printer = alphaConcreteListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)


def convert(value, variables):
    x = list(value.getChildren())

    total = ""

    is_math = False

    for i in x:
        identifier = i.getText()[0]
        text = i.getText().strip()
        if identifier == '"':
            total += text[1:-1]

        elif identifier == 't':
            var = variables[list(i.getChildren())[1].getText()[1:-1]]
            if type(var) != str:
                is_math = True

            total += str(var)

        elif identifier.isdigit() or identifier == '.':
            total += text
            is_math = True

        elif is_math:
            if text in ['plus', '+']:
                total += '+'

            elif text in ['minus', '-']:
                total += '-'

            elif text in ['times', '*', 'multiplied by']:
                total += '*'

            elif text in ['divided by', 'by', '/']:
                total += '/'

    if is_math:
        total = eval(total)

    return total


if __name__ == '__main__':
    main()
