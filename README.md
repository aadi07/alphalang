# Alpha

## Instructions To Run Alpha

### Install ANTLR 4.8

    $ cd /usr/local/lib
    $ sudo curl -O https://www.antlr.org/download/antlr-4.8-complete.jar 
    $ export CLASSPATH=".:/usr/local/lib/antlr-4.8-complete.jar:$CLASSPATH"
    $ alias antlr4='java -jar /usr/local/lib/antlr-4.8-complete.jar'
    $ alias grun='java org.antlr.v4.gui.TestRig'

Add the last three lines to your shell profile (eg. ___.bash_profile___ / ___.zshrc___) so that you do not have to run them in every new shell window.

### Clone this git repository

Go to the folder in which you want to clone it

`$ git clone https://github.com/aadi07/alphalang.git`

### Alias running an alpha file

    $ alias alpha='python <path/to/git/repo>/alpha_antlr_v0.4/alpha.py'
    $ alpha <filename>.alp

Add the alias line to your shell profile.

## Instructions To Write Alpha

Alpha is optimized for readability, not efficiency, some programs may be slow, they may be verbose, but they will be exceptionally clear.

### Printing and Comments

    Note: This is a comment!!! Comments go to the end of a line
    Print "Hello, World!". Note: They do not need to take up the whole line however

### Data Types

    Note: As you can see, print statements can print all types of values
    Print "Hello, World!". Note: This is a string
    Print 13. Note: This is an integer
    Print 1.3. Note: This is a float
    Print True. Note: This is a boolean
    Print "Hello, World!", 13, 1.3, True. Note: This is a list

### Expressions

    Note: They can also print expressions. All MATHEMATICAL operations can be expressed in words or symbols.
    Print "He" plus 2 * "l" + 1 times "o" plus ", world!". Note: Strings can be concatenated with strings or products of strings and numbers.
    Print 13 times 13 / 13 plus 13 - 13. Note: Supported operators include addition, subtraction...
    Print 1.3 * 1.3 by 1.3 + 1.3 minus 1.3. Note: multiplication, division...
    Print 10 ^ 10 mod 7 raise 7. Note: powers, and modulo or remainder
    Print 10 is equal to 10 and 3 is not equal to 7 and 4 is less than 12 and 3 is greater than or equal to 0. Note: Booleans have and, or, equality and inequality. Numbers have the usual comparison operators. Strings and lists have only equality
    Print "He" plus 2 * "l" + 1 times "o" plus ", world!",
        13 * 13 / 13 + 13 - 13, Note: Lists can also contain expressions as elements, spacing and new lines are not an issue for separation
        1.3 times 1.3 by 1.3 plus 1.3 minus 1.3,
        10 is equal to 10 and 3 is not equal to 7 and 4 is less than 12 and 3 is greater than or equal to 0.
