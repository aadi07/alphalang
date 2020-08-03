from decode import decode


def variable(c, variables):
    lowered = [i.lower() for i in c]
    if lowered.count("assign") != 1 or lowered.count("to") != 1 or lowered.count("as") > 1:
        print(c)
        print()
        print("Syntax Error: Use of keyword in variable declaration")
        exit()
    
    to_idx = lowered.index("to")
    treat_as_as = False
    if "as" in lowered:
        treat_as_as = True
    
    value = decode(' '.join(c[1:to_idx]), variables)
    var = decode(' '.join(c[to_idx + 1:-2] if treat_as_as else c[to_idx + 1:]), variables)
    val_type = c[-1] if treat_as_as else ''

    if val_type == "integer":
        try:
            value = int(value)
        except:
            print(c)
            print()
            print("Type Error: Unacceptable Integer Conversion")
            exit()

    elif val_type == "float":
        try:
            value = float(value)
        
        except:
            print(c)
            print()
            print("Type Error: Unacceptable Float Conversion")
            exit()
        
    variables[var] = value