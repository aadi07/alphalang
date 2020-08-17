# Alpha

Creator Name: ___Advaith Anand___  
Github Username: ___@aadi07___

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

    $ alias alpha='python [PATH_TO_GIT_REPOSITORY]/alpha_antlr_v0.4/alpha.py'
    $ alpha [FILE_NAME]

Add the alias line to your shell profile.
