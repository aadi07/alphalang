from antlr4 import *
from alphaLexer import alphaLexer
from alphaListener import alphaListener
from alphaParser import alphaParser
from sys import argv
from re import sub


CODE = '''
'''

OP_MAP = {
    ' times': ' *',
    ' plus': ' +',
    ' minus': ' -',
    ' by': ' /',
    ' raise': ' **',
    ' ^': ' **',
    ' mod': ' %'
}

global_variables = {}
return_value = None


class alphaConcreteListener(alphaListener):
    def __init__(self, variables={}, functions={}, affect_global=True):
        self.if_true = True
        self.if_was_true = False
        self.variables = variables
        self.functions = functions
        self.affect_global = True
        self.in_while = False
        self.in_func = False

    def convert(self, value):
        def ref(obj):
            value = self.variables[obj.group(1)]
            if type(value) != str:
                return str(value)

            else:
                return '"' + str(value) + '"'

        def lref(obj):
            value = self.variables[obj.group(1)]
            index = int(obj.group(2)) - 1
            if index >= 0:
                if type(value) != str:
                    return str(value[index])

                else:
                    return '"' + str(value[index]) + '"'

            else:
                print(
                    "Index Error: We use 1 based indexing, you have tried to access a value at index 0 or lower")
                exit()

        def slicer(obj):
            value = self.variables[obj.group(1)]
            start = int(obj.group(2)) - 1
            end = int(obj.group(4)) - 1
            if start >= 0 and end >= 0:
                if type(value) != str:
                    return str(value[start:end])

                else:
                    return '"' + str(value[start:end]) + '"'

            else:
                print(
                    "Index Error: We use 1 based indexing, you have tried to access a slice including index 0 or lower")
                exit()

        def repl_stuff(s):
            return s.replace('is equal to', '==').replace('is not equal to', '!=').replace('is greater than or equal to', '>=').replace(
                'is less than or equal to', '<=').replace('is less than', '<').replace('is greater than', '>')

        if value[0] == '"' and '"' not in value[1:-1]:
            return value[1:-1]

        elif value == 'True' or value == 'False':
            return value == 'True'

        elif value[:len('the result of calling')] == 'the result of calling':
            if " on " in value:
                on_idx = value.index(" on ")
                name = value[23:on_idx-1]
                args = [self.convert(i)
                        for i in value[on_idx + 4:].split(' and ')]

            else:
                name = value[23:-1]
                args = []

            tree, arg_names = self.functions[name, len(args)]
            arg_vars = self.variables.copy()
            arg_vars.update({arg_names[i]: args[i] for i in range(len(args))})
            walker = ParseTreeWalker()
            listener = alphaConcreteListener(
                variables=arg_vars, functions=self.functions, affect_global=False)

            walker.walk(listener, tree)

            return return_value

        else:
            value = sub(r'"([^"]+)"\'s value', ref, value)
            value = sub(
                r'"([^"]+)"\'s (\d+)(st|nd|rd|th) value', lref, value)
            value = sub(
                r'"([^"]+)"\'s (\d+)(st|nd|rd|th) to (\d+)(st|nd|rd|th) values', slicer, value)
            value = sub(
                r'"([^"]+)"\'s length', lambda obj: str(len(self.variables[obj.group(1)])), value)
            value = sub(
                r'"([^"]+)"\'s literal length', lambda obj: str(len(obj.group(1))), value)
            try:
                if value[0] == '[' and value[-1] == ']':
                    return eval(value)

                elif ',' in value:
                    quote_mode = False
                    elems = []
                    cur = ""
                    for i in value:
                        if i == ',' and not quote_mode:
                            elems.append(cur)
                            cur = ""

                        else:
                            if i == '"':
                                quote_mode = not quote_mode

                            cur += i

                    elems.append(cur)
                    if len(elems) <= 1:
                        print(10 / 0)
                    return [self.convert(i.strip()) for i in elems]

                elif value.lower() == 'a new list':
                    return []

                else:
                    print(10 / 0)

            except:
                new_value = ''
                cur = ''
                quote_mode = False
                for i in value:
                    if i == '"':
                        quote_mode = not quote_mode
                        cur += '"'
                        if quote_mode:
                            new_value += repl_stuff(cur)

                        else:
                            new_value += cur

                        cur = ""

                    else:
                        cur += i

                value = new_value + repl_stuff(cur) + ' '
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

                if type(value) == str or type(value) == bool:
                    return value

                else:
                    value = round(value, max_precision)

                    if type(value) == int or max_precision == 0:
                        return int(value)

                    else:
                        return value

    def is_safe(self):
        return not self.in_while and self.if_true and not self.if_was_true and not self.in_func

    def enterShow(self, ctx):
        if self.is_safe():
            value = list(ctx.getChildren())[1].getText()
            printable = self.convert(value)
            print(printable)

    def enterIfStmt(self, ctx):
        if self.is_safe():
            self.if_true = self.convert(list(ctx.getChildren())[1].getText())

    def exitIfStmt(self, ctx):
        if self.if_true:
            self.if_was_true = True
        self.if_true = True

    def enterElifStmt(self, ctx):
        if self.is_safe():
            self.if_true = self.convert(list(ctx.getChildren())[
                1].getText()) and not self.if_was_true

    def exitElifStmt(self, ctx):
        if self.if_true:
            self.if_was_true = True
        self.if_true = True

    def exitIfBlock(self, ctx):
        self.if_was_true = False

    def enterAssign(self, ctx):
        if self.affect_global:
            global global_variables
        if self.is_safe():
            full = [i.getText() for i in ctx.getChildren()]
            if full[1] == "input":
                value = self.convert(input())

            elif full[1][-9:] == "'s answer":
                value = input(full[1][1: full[1][1:].index('"')+1])

            else:
                value = self.convert(full[1])

            name = self.convert(full[3])

            if self.affect_global:
                global_variables[name] = value

            self.variables[name] = value

    def enterWhileLoop(self, ctx):
        full = [i.getText() for i in ctx.getChildren()]
        lexer = alphaLexer(InputStream('. '.join(full[3::2]) + '.'))
        stream = CommonTokenStream(lexer)
        parser = alphaParser(stream)
        tree = parser.prog()
        walker = ParseTreeWalker()
        listener = alphaConcreteListener(variables=self.variables)
        while self.convert(full[1]):
            walker.walk(listener, tree)

            self.variables = global_variables

        self.in_while = True

    def exitWhileLoop(self, ctx):
        self.in_while = False

    def enterAppend(self, ctx):
        if self.affect_global:
            global global_variables
        if self.is_safe():
            full = [i.getText() for i in ctx.getChildren()]
            value = self.convert(full[1])
            name = self.convert(full[3])

            if self.affect_global:
                global_variables[name].append(value)

            else:
                self.variables[name].append(value)

    def enterRemoveVal(self, ctx):
        if self.affect_global:
            global global_variables
        if self.is_safe():
            full = [i.getText() for i in ctx.getChildren()]
            value = self.convert(full[1])
            name = self.convert(full[3])
            if self.affect_global:
                global_variables[name].remove(value)

            else:
                self.variables[name].remove(value)

    def enterRemovePos(self, ctx):
        if self.affect_global:
            global global_variables
        if self.is_safe():
            full = [i.getText() for i in ctx.getChildren()]
            idx = self.convert(full[1]) - 1
            if idx >= 0:
                name = self.convert(full[3])
                if self.affect_global:
                    del global_variables[name][idx]

                else:
                    del self.variables[name][idx]

            else:
                print(
                    "Index Error: We use 1 based indexing, you have tried to remove a value at index 0 or lower")

    def enterRemoveAll(self, ctx):
        if self.affect_global:
            global global_variables
        if self.is_safe():
            full = [i.getText() for i in ctx.getChildren()]
            value = self.convert(full[1])
            name = self.convert(full[3])
            if self.affect_global:
                global_variables[name] = [
                    i for i in global_variables[name] if i != value]

            else:
                self.variables[name] = [
                    i for i in self.variables[name] if i != value]

    def enterDefine(self, ctx):
        full = [i.getText() for i in ctx.getChildren()]
        as_idx = full.index(" as:")
        if " on " in full:
            on_idx = full.index(" on ")
            args = [self.convert(i) for i in full[on_idx + 1: as_idx: 2]]

        else:
            args = []

        name = self.convert(full[1])
        code = '.\n'.join(full[as_idx + 1:: 2]) + '.'
        lexer = alphaLexer(InputStream(code))
        stream = CommonTokenStream(lexer)
        parser = alphaParser(stream)
        tree = parser.prog()
        self.functions[name, len(args)] = tree, args

        self.in_func = True

    def exitDefine(self, ctx):
        self.in_func = False

    def enterCall(self, ctx):
        if self.is_safe():
            full = [i.getText() for i in ctx.getChildren()]
            name = self.convert(full[1])
            if " on " in full:
                on_idx = full.index(" on ")
                args = [self.convert(i) for i in full[on_idx + 1::2]]
            else:
                args = []
            tree, arg_names = self.functions[name, len(args)]
            arg_vars = self.variables.copy()
            arg_vars.update({arg_names[i]: args[i] for i in range(len(args))})
            walker = ParseTreeWalker()
            listener = alphaConcreteListener(
                variables=arg_vars, functions=self.functions, affect_global=False)
            walker.walk(listener, tree)

    def enterReturnStmt(self, ctx):
        global return_value
        if self.is_safe():
            full = list(ctx.getChildren())[1].getText()
            return_value = self.convert(full)


def main(code=""):
    if code != '':
        ipt = InputStream(code)

    elif len(argv) == 2:
        ipt = FileStream(argv[1])

    else:
        ipt = StdinStream()

    lexer = alphaLexer(ipt)
    stream = CommonTokenStream(lexer)
    parser = alphaParser(stream)
    tree = parser.prog()  # This step takes an INSANE amount of time. WORK ON THE GRAMMAR
    listener = alphaConcreteListener()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)


if __name__ == '__main__':
    main()
