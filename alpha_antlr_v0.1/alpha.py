from antlr4 import *
from alphaLexer import alphaLexer
from alphaListener import alphaListener
from alphaParser import alphaParser
from io import StringIO
import sys


class alphaPrintListener(alphaListener):
    def __init__(self, variables={}, functions={}):
        self.variables = variables
        self.functions = functions

    def enterShow(self, ctx):
        print(convert([i for i in ctx.getChildren()][1], self.variables))

    def enterAssign(self, ctx):
        full = [i for i in ctx.getChildren()]
        value = convert(full[1], self.variables)
        var_name = convert(full[3], self.variables)

        try:
            type_id = full[5].getText()[-1]
            if type_id == 'r':
                self.variables[var_name] = int(value)

            elif type_id == 't':
                self.variables[var_name] = float(value)

            elif type_id == 'g':
                self.variables[var_name] = str(value)

        except IndexError:
            self.variables[var_name] = value

    def enterDefine(self, ctx):
        full = [i for i in ctx.getChildren()]
        header = [i for i in full[0].getChildren()]
        body = [i.getText() for i in full[1].getChildren()][::2]
        func_name = convert(header[1], self.variables)
        arguments = tuple([convert(i, self.variables)
                           for i in [i for i in header[3].getChildren()][1::2]])
        self.functions[(func_name, len(arguments))] = [
            arguments, '. '.join(body) + '.']

    def enterFunc_nr_call(self, ctx):
        full = [i for i in ctx.getChildren()]
        name = convert(full[1], self.variables)
        arguments = tuple([convert(i, self.variables)
                           for i in [i for i in full[3].getChildren()][1::2]])

        arg_names, code = self.functions[(name, len(arguments))]
        arg_vars = self.variables.copy()
        arg_vars.update({arg_names[i]: arguments[i]
                         for i in range(len(arguments))})
        lexer = alphaLexer(InputStream(code))
        stream = CommonTokenStream(lexer)
        parser = alphaParser(stream)
        tree = parser.prog()
        printer = alphaPrintListener(
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
    printer = alphaPrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)


def convert(value, variables):
    x = []
    for i in value.getChildren():
        v = i.getText().strip()
        if v != '':
            x.append(v)

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
                cur_val = variables[i[i.index('"') + 1: -1]]
                if type(cur_val) == str:
                    print("TypeError")
                    exit()

                else:
                    value += str(cur_val)

        value = eval(value)

    else:
        try:
            for i in x[::2]:
                if i[0] == '"':
                    value += i[1: -1]

                elif i[0] == 't':
                    value += variables[i[i.index('"') + 1: -1]]

                else:
                    value += i

        except TypeError:
            print("TypeError")
            exit()

    return value


if __name__ == '__main__':
    main()
