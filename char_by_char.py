def variable(c, variables):
    is_as = False
    for i in range(len(c)):
        if c[i].lower() == "to":
            to_idx = i
        
        elif c[i].lower() == "as":
            is_as = True
            break
    
        elif c[i][0] == "\\":
            c[i] = c[i][1:]
        
    value = ' '.join(c[1:to_idx])
    var = ' '.join(c[to_idx:-2]) if is_as else ' '.join(c[to_idx])
    v_type = c[-1] if is_as else ''
    if v_type == 'int':
        value = int(value)
    
    elif v_type == 'float':
        value = float(value)
    
    variables[value] = var[]
    
    