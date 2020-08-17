from antlr4 import *
from alphaLexer import alphaLexer
from alphaListener import alphaListener
from alphaParser import alphaParser
import sys
import re
from pprint import pprint


code = '''
Assign 1, 2, 3 to "m".
Remove position 2 from "m".
Print "m"'s value.
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
    ' mod': ' %'
}

real_variables = {}
return_value = None


class alphaConcreteListener(alphaListener):
    def __init__(self, variables={}, functions={}, affect_global=True):
        self.if_true = True
        self.if_was_true = False
        self.variables = variables
        self.affect_global = True
        self.in_while = False
        self.in_func = False
        self.functions = functions

    def enterDefine(self, ctx):
        full = [i.getText() for i in ctx.getChildren()]
        on_idx = full.index(" on ")
        as_idx = full.index(" as:")
        name = self.convert(full[1])
        args = [self.convert(i)[0] for i in full[on_idx + 1: as_idx: 2]]
        code = '.\n'.join(full[as_idx + 1:: 2]) + '.'
        lexer = alphaLexer(InputStream(code))
        stream = CommonTokenStream(lexer)
        parser = alphaParser(stream)
        tree = parser.prog()
        self.functions[name, len(args)] = tree, args

        self.in_func = True

    def enterCall(self, ctx):
        full = [i.getText() for i in ctx.getChildren()]
        on_idx = full.index(" on ")
        name = self.convert(full[1])
        args = [self.convert(i)[0] for i in full[on_idx + 1:: 2]]
        tree, arg_names = self.functions[name, len(args)]
        arg_vars = self.variables.copy()
        arg_vars.update({arg_names[i]: args[i] for i in range(len(args))})
        walker = ParseTreeWalker()
        listener = alphaConcreteListener(
            variables=arg_vars, functions=self.functions, affect_global=False)
        walker.walk(listener, tree)

    def exitDefine(self, ctx):
        self.in_func = False

    def enterAppend(self, ctx):
        if self.affect_global:
            global real_variables
        if not self.in_while and self.if_true and not self.if_was_true and not self.in_func:
            full = [i.getText() for i in ctx.getChildren()]
            value, t = self.convert(full[1])
            name, _ = self.convert(full[3])
            if t == "Boolean":
                if self.affect_global:
                    real_variables[name].append(value == "true")

                else:
                    self.variables[name].append(value == "true")

            else:
                if self.affect_global:
                    real_variables[name].append(value)

                else:
                    self.variables[name].append(value)

    def enterRemoveVal(self, ctx):
        if self.affect_global:
            global real_variables
        if not self.in_while and self.if_true and not self.if_was_true and not self.in_func:
            full = [i.getText() for i in ctx.getChildren()]
            value, t = self.convert(full[1])
            name, _ = self.convert(full[3])
            if t == "Boolean":
                if self.affect_global:
                    real_variables[name].remove(value == "true")

                else:
                    self.variables[name].remove(value == "true")

            else:
                if self.affect_global:
                    real_variables[name].remove(value)

                else:
                    self.variables[name].remove(value)

    def enterRemovePos(self, ctx):
        if self.affect_global:
            global real_variables
        if not self.in_while and self.if_true and not self.if_was_true and not self.in_func:
            full = [i.getText() for i in ctx.getChildren()]
            value, _ = self.convert(full[1])
            name, _ = self.convert(full[3])
            if self.affect_global:
                del real_variables[name][value]

            else:
                del self.variables[name][value]

    def enterRemoveAll(self, ctx):
        if self.affect_global:
            global real_variables
        if not self.in_while and self.if_true and not self.if_was_true and not self.in_func:
            full = [i.getText() for i in ctx.getChildren()]
            value, t = self.convert(full[1])
            name, _ = self.convert(full[3])
            if t == "Boolean":
                if self.affect_global:
                    real_variables[name] = [
                        i for i in real_variables[name] if i != value == "true"]

                else:
                    self.variables[name] = [
                        i for i in self.variables[name] if i != value == "true"]

            else:
                if self.affect_global:
                    real_variables[name] = [
                        i for i in real_variables[name] if i != value]

                else:
                    self.variables[name] = [
                        i for i in self.variables[name] if i != value]

    def enterShow(self, ctx):
        if not self.in_while and self.if_true and not self.if_was_true and not self.in_func:
            value = [i for i in ctx.getChildren()][1].getText()
            printable, t = self.convert(value)
            print(f"{printable} : {t}")

    def enterAssign(self, ctx):
        if self.affect_global:
            global real_variables
        if not self.in_while and self.if_true and not self.if_was_true and not self.in_func:
            full = [i.getText() for i in ctx.getChildren()]
            if full[1] == "input":
                value, t = self.convert(input())

            elif full[1][-9:] == "'s answer":
                value, t = input(full[1][1: full[1][1:].index('"')+1]), ""

            else:
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
        lexer = alphaLexer(InputStream('. '.join(full[3:: 2]) + '.'))
        stream = CommonTokenStream(lexer)
        parser = alphaParser(stream)
        tree = parser.prog()
        walker = ParseTreeWalker()
        listener = alphaConcreteListener(variables=self.variables)
        while self.convert(full[1])[0] == "true":
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

        def lref(obj):
            value = self.variables[obj.group(1)]
            index = int(obj.group(2)) - 1
            if index >= 0:
                if value == 'true':
                    return str(value[index])

                elif type(value) != str:
                    return str(value[index])

                else:
                    return '"' + str(value[index]) + '"'

            else:
                print(
                    "Index Error: We use one based indexing, you have tried to access a value at index 0")
                exit()

        def slicer(obj):
            value = self.variables[obj.group(1)]
            start = int(obj.group(2)) - 1
            end = int(obj.group(4)) - 1
            if start >= 0 and end >= 0:
                if value == 'true':
                    return str(value[start:end])

                elif type(value) != str:
                    return str(value[start:end])

                else:
                    return '"' + str(value[start:end]) + '"'

            else:
                print(
                    "Index Error: We use one based indexing, you have tried to access a slice including index 0")
                exit()
        print(value)
        if value[0] == '"' and '"' not in value[1:-1]:
            return value[1:-1], "String"

        elif value == 'true' or value == 'false':
            return value, "Boolean"

        elif value[:len('the result of calling')] == 'the result of calling':
            on_idx = value.index(" on ")
            print(value[on_idx + 4:])
            return "Aadi", "String"

        else:
            value = re.sub(r'"([^"]+)"\'s value', ref, value)
            value = re.sub(
                r'"([^"]+)"\'s (\d+)(st|nd|rd|th) value', lref, value)
            value = re.sub(
                r'"([^"]+)"\'s (\d+)(st|nd|rd|th) to (\d+)(st|nd|rd|th) values', slicer, value)
            value = re.sub(
                r'"([^"]+)"\'s length', lambda obj: str(len(self.variables[obj.group(1)])), value)
            value = re.sub(
                r'"([^"]+)"\'s literal length', lambda obj: str(len(obj.group(1))), value)
            try:
                if value[0] == '[' and value[-1] == ']':
                    return eval(value), "List"

                elif ',' in value:
                    return [self.convert(i.strip())[0] for i in value.split(',')], "List"

                elif value.lower() == 'a new list':
                    return [], "List"

                else:
                    print(10 / 0)

            except:
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
    tree = parser.prog()  # This step takes an INSANE amount of time
    listener = alphaConcreteListener()
    walker = ParseTreeWalker()
    # try:
    walker.walk(listener, tree)

    # except:
    #     print("Error")
    #     exit()


if __name__ == '__main__':
    main()
