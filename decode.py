def decode(s, variables):
    decoded = ""
    i = 0
    while i < len(s):
        if s[i] == '"':
            n = s[i + 1:].index('"')
            i += 1
        
            decoded += s[i:i+n]
            i += n + 1
        
        elif s[i] == "'":
            n = s[i + 1:].index("'")
            i += 1
        
            decoded += s[i:i+n]
            i += n + 1
        
        elif s[i] == "(":
            n = s[i + 1:].index(")")
            i += 1

            decoded += str(variables[s[i:i+n]])
            i += n + 1
        
        else:
            decoded += s[i]
            i += 1
    
    return decoded
