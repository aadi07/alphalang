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
        self.if_is_true

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

        self.functions[name, len(args)] = (args, '. '.join(code) + '.')

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
        is_bool = False

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

            elif text.isnumeric() or identifier == '.':
                total += text
                if is_math == False:
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

            else:
                if text == 'and' or text == 'or':
                    total += ' ' + text + ' '

                if text != '+' and text != 'plus':
                    total += str(self.bool_convert(i))
                    is_bool = True

        if is_math or is_bool:
            total = eval(total)

        return total

    def bool_convert(self, value):
        x = list(value.getChildren())

        val_1 = self.convert(x[0])
        val_2 = self.convert(x[2])

        is_math = type(val_1) != str or type(val_2) != str

        op = x[1].getText().strip()

        if is_math:
            total = str(val_1)

        else:
            total = '"' + str(val_1) + '"'

        if op in ['is equal to', 'equals']:
            total += ' == '

        elif op in ['is not equal to', 'isn\'t equal to']:
            total += ' != '

        elif is_math:
            if op == 'is greater than':
                total += ' > '

            elif op == 'is less than':
                total += ' < '

            elif op in ['is atleast', 'is at least', 'is greater than or equal to', 'is not less than']:
                total += ' >= '

            elif op in ['is atmost', 'is at most', 'is less than or equal to', 'is not greater than']:
                total += ' <= '

        if is_math:
            total += str(val_2)

        else:
            total = '"' + str(val_2) + '"'

        return eval(total)


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
