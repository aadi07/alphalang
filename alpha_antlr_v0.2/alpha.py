from antlr4 import *
from alphaLexer import alphaLexer
from alphaListener import alphaListener
from alphaParser import alphaParser
import sys

returnedVal = None


class alphaConcreteListener(alphaListener):
    def __init__(self, variables={}, functions={}):
        self.variables = variables
        self.functions = functions
        self.in_func = False

    def enterShow(self, ctx):
        if not self.in_func:
            values = list(ctx.getChildren())
            print(self.convert(values[1]))

    def enterAssign(self, ctx):
        if not self.in_func:
            full = list(ctx.getChildren())
            value = self.convert(full[1])
            name = self.convert(full[3])
            self.variables[name] = value

    def enterFunc(self, ctx):
        self.in_func = True
        full = list(ctx.getChildren())
        name = self.convert(full[1])
        if full[2].getText() == ' on ':
            args = [self.convert(i)
                    for i in list(full[3].getChildren())[::2]]
            code = [i.getText() for i in full[5::2]]

        else:
            args = []
            code = [i.getText() for i in full[3::2]]

        self.functions[(name, len(args))] = (args, '. '.join(code) + '.')

    def exitFunc(self, ctx):
        self.in_func = False

    def enterReturnVal(self, ctx):
        if not self.in_func:
            global returnedVal
            returnedVal = self.convert(list(ctx.getChildren())[1])

    def enterCall(self, ctx):
        if not self.in_func:
            full = list(ctx.getChildren())
            name = self.convert(full[1])
            if len(full) > 2:
                args = [self.convert(i)
                        for i in list(full[3].getChildren())[::2]]
                arg_names, code = self.functions[name, len(args)]
                arg_vars = self.variables.copy()
                arg_vars.update({arg_names[i]: args[i]
                                 for i in range(len(args))})

            else:
                arg_vars = {}
                _, code = self.functions[name, 0]

            lexer = alphaLexer(InputStream(code))
            stream = CommonTokenStream(lexer)
            parser = alphaParser(stream)
            tree = parser.prog()
            listener = alphaConcreteListener(
                variables=arg_vars, functions=self.functions)
            walker = ParseTreeWalker()
            walker.walk(listener, tree)

    def convert(self, value):
        x = list(value.getChildren())

        total = ""

        is_math = False

        for i in x:
            text = i.getText().strip()
            identifier = text[0]
            if identifier == '"':
                total += text[1:-1]

            elif identifier == 't':
                func_or_ref = text[4]
                if func_or_ref == 'v':
                    var = self.variables[list(i.getChildren())[
                        1].getText()[1:-1]]
                    if type(var) != str:
                        is_math = True

                    total += str(var)

                elif func_or_ref == 'r':
                    if not self.in_func:
                        full = list(i.getChildren())
                        name = self.convert(full[1])
                        if len(full) > 4:
                            args = [self.convert(i)
                                    for i in list(full[3].getChildren())[::2]]
                            arg_names, code = self.functions[name, len(args)]
                            arg_vars = self.variables.copy()
                            arg_vars.update({arg_names[i]: args[i]
                                             for i in range(len(args))})

                        else:
                            arg_vars = {}
                            _, code = self.functions[name, 0]

                        lexer = alphaLexer(InputStream(code))
                        stream = CommonTokenStream(lexer)
                        parser = alphaParser(stream)
                        tree = parser.returnFunc()
                        listener = alphaConcreteListener(
                            variables=arg_vars, functions=self.functions)
                        walker = ParseTreeWalker()
                        walker.walk(listener, tree)

                        if type(returnedVal) != str:
                            is_math = True

                        total += str(returnedVal)

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
