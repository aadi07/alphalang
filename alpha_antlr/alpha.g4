grammar alpha;

// Roots
prog: (
		(assign | show | define | func_nr_call | func_r_call) '.' ' '?
	)+;

// Types of statements available directly in code
assign:
	'Assign ' value ' to ' value (
		' as a' ('n integer' | ' float')
	)?;
show: 'Print ' value;
define: func_head func_body;
func_nr_call: 'Call ' value (' on' args)?;
func_r_call: 'the result of calling ' value (' on' args)?;

// Related to define
func_head: 'Define ' value (' on' args)? ' as:' ' '?;
func_body: ( (func_assign | func_show | value | define) ', '?)+;
func_assign:
	'Assign ' value ' to ' value (
		' as a' ('n integer' | ' float')
	)?;
func_show: 'Print ' value;

// General Collections of Tokens
value: (STRING | REFERENCE) (' '? PLUS ' '? value)?
	| NUMBER (' '? (PLUS | MINUS | TIMES | DIVIDE) ' '? value)?;
args: ' ' value (' and' args)?;

// Lexer Tokens
REFERENCE: 'the value of ' STRING;
STRING: '"' ~[\\"]+ '"';
NUMBER: [0-9]* '.' [0-9]+ | [0-9]+;
PLUS: '+' | 'plus';
MINUS: '-' | 'minus';
TIMES: '*' | 'times' | 'multiplied by';
DIVIDE: '/' | 'by' | 'divided by';
WS: [ \t\r\n]+ -> skip;