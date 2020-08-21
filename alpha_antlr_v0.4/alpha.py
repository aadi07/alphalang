from antlr4 import *
from alphaLexer import alphaLexer
from alphaListener import alphaListener
from alphaParser import alphaParser
from sys import argv
from re import sub


CODE = '''
'''

BUILTINS = {}
BUILTINS_AS_CODE = {
    ('round', 1): ('''
    If "num"'s value mod 1 is less than 0.5: 
        Return "num"'s value as an integer, 
    otherwise: 
        Return "num"'s value as an integer + 1.
    ''', ["num"]),
    ('range', 2): ('''
    Assign a new list to "r". 
    Assign "lower"'s value to "count". 
    While "count"'s value is less than "upper"'s value: 
        Append "count"'s value to "r", 
        Assign "count"'s value + 1 to "count". 
    Return "r"'s value.
    ''', ["lower", "upper"]),
    ('min', 1): ('''
    Assign "list"'s length to "len". 
    If "len"'s value is equal to 0: 
        Return. 
    Assign "list"'s 1st value to "current min". 
    Assign 1 to "idx". 
    While "idx"'s value is less than "len"'s value: 
        Assign "idx"'s value + 1 to "idx", 
        If "list"'s ("idx"'s value)th value is less than "current min"'s value: 
            Assign "list"'s ("idx"'s value)th value to "current min". 
    Return "current min"'s value.
    ''', ["list"]),
    ('max', 1): ('''
    Assign "list"'s length to "len". 
    If "len"'s value is equal to 0: 
        Return. 
    Assign "list"'s 1st value to "current max". 
    Assign 1 to "idx". 
    While "idx"'s value is less than "len"'s value: 
        Assign "idx"'s value + 1 to "idx", 
        If "list"'s ("idx"'s value)th value is greater than "current max"'s value: 
            Assign "list"'s ("idx"'s value)th value to "current max". 
    Return "current max"'s value.
    ''', ["list"]),
    ('sort', 1): ('''
    Assign a new list to "sorted".
    While "list"'s length is greater than 0:
        Assign the result of calling "min" on "list"'s value to "cur min val",
        Remove "cur min val"'s value from "list",
        Append "cur min val"'s value to "sorted".
    Return "sorted"'s value.
    ''', ["list"]),
    ('sum', 1): ('''
    Assign 0 to "sum".
    Assign 1 to "idx".
    While "idx"'s value is less than or equal to "list"'s length:
        Assign "sum"'s value plus "list"'s ("idx"'s value)th value to "sum",
        Assign "idx"'s value plus 1 to "idx".

    Return "sum"'s value.
    ''', ["list"]),
}

for k, v in BUILTINS_AS_CODE.items():
    lexer = alphaLexer(InputStream(v[0]))
    stream = CommonTokenStream(lexer)
    parser = alphaParser(stream)
    tree = parser.prog()
    BUILTINS[k] = (tree, v[1])


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
        self.affect_global = affect_global
        self.variables = variables
        self.functions = BUILTINS
        self.functions.update(functions)
        self.if_true = True
        self.if_was_true = False
        self.in_while = False
        self.in_func = False
        self.has_returned = False

    def convert(self, value):
        def ref(obj):
            value = self.variables[obj.group(1)]
            if type(value) != str:
                return str(value)

            else:
                return '"' + str(value) + '"'

        def lref(obj):
            index = int(obj.group(2)) - 1
            value = self.variables[obj.group(1)][index]
            if index >= 0:
                if type(value) != str:
                    return str(value)

                else:
                    return '"' + str(value) + '"'

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

        def type_change(obj):
            content, t = obj.group(1), obj.group(2).split()[1]
            if t == "string":
                return '"' + str(self.convert(content)) + '"'

            elif t == "integer":
                value = str(int(self.convert(content)))
                return value

            elif t == "float":
                return str(float(self.convert(content)))

            elif t == "boolean":
                return str(self.convert(content) == '"True"')

        def what_type(obj):
            val = obj.group(1)
            if val.isdigit():
                return '"integer"'

            elif val[0] == val[-1] == '"':
                return '"string"'

            elif val == "True" or val == "False":
                return '"boolean"'

            elif val == "None":
                return '"none"'

            elif val[0] == '[' and val[-1] == ']':
                return '"list"'

            else:
                return '"float"'

        if value == '':
            return None

        elif value[0] == '"' and '"' not in value[1:-1]:
            return value[1:-1]

        elif value == 'True' or value == 'False':
            return value == 'True'

        elif value == 'None':
            return None

        elif value[:len('the result of calling')] == 'the result of calling':
            if '" on ' in value and '"' in value[:value.index('" on ')]:
                on_idx = value.index('" on ') + 1
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
            global return_value
            cur_ret_val = return_value
            return_value = None
            return cur_ret_val

        else:
            x = sub(r'\("([^"]+)"\'s value\)', ref, value)
            while x != value:
                value = x
                x = sub(r'\("([^"]+)"\'s value\)', ref, value)
            x = sub(r'"([^"]+)"\'s value', ref, value)
            while x != value:
                value = x
                x = sub(r'"([^"]+)"\'s value', ref, value)
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

                equation = sub(
                    r'(-?\d*\.?\d+|"[^"]+"|True|False|\[[^\]]*\]) as (a float|an integer|a string|a boolean)', type_change, equation)

                equation = sub(
                    r'the type of (-?\d*\.?\d+|"[^"]+"|True|False|\[[^\]]*\])', what_type, equation)

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
        return not self.in_while and self.if_true and not self.if_was_true and not self.in_func and not self.has_returned

    def enterShow(self, ctx):
        if self.is_safe():
            value = list(ctx.getChildren())
            if len(value) != 1:
                printable = self.convert(value[1].getText())
            else:
                printable = ""

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

            elif full[1][-11:] == "'s response":
                value = self.convert(
                    input(full[1][1: full[1][1:].index('"')+1]))

            else:
                value = self.convert(full[1])

            name = self.convert(full[3])

            if self.affect_global:
                global_variables[name] = value

            self.variables[name] = value

    def enterWhileLoop(self, ctx):
        if self.is_safe():
            full = [i.getText() for i in ctx.getChildren()]
            lexer = alphaLexer(InputStream('. '.join(full[3::2]) + '.'))
            stream = CommonTokenStream(lexer)
            parser = alphaParser(stream)
            tree = parser.prog()
            walker = ParseTreeWalker()
            listener = alphaConcreteListener(
                variables=self.variables, affect_global=self.affect_global)
            while self.convert(full[1]):
                walker.walk(listener, tree)
                if self.affect_global:
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
            self.has_returned = True
            full = list(ctx.getChildren())
            if len(full) != 1:
                return_value = self.convert(full[1].getText())

    def enterExit(self, ctx):
        if self.is_safe():
            exit()


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
