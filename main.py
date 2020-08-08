from sys import argv
from char_by_char import variable


def main():
    if len(argv) != 2:
        print("File Error: Single File Required")
        exit()

    try:
        file = open(argv[1])
        commands = file.read().strip().split('. ')
        file.close()

    except:
        print("File Error: Error Opening File")
        exit()
    
    commands[-1] = commands[-1].strip('.')
    variables = {}
    for c in commands:
        if c[:7] == "Assign ":
            variable(c, variables)

        elif c[:5] == "Show ":
            print(decode(c[5:], variables))


main()
