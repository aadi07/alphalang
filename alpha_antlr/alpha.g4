grammar alpha;
r: ((assign | show | define) '.' ' '?)+;
assign:
	'Assign ' value ' to ' value (
		' as a' ('n integer' | ' float')
	)?;
show: 'Print ' value;
define: func_head func_body;
func_head: 'Define ' value ' on' args ' as:' ' '?;
args: ' ' value (' and' args)?;
// func_parser: ((func_assign | func_show | value) '.' ' '?)+;
func_body: ((func_assign | func_show | value | define) ', '?)+;
func_assign:
	'Assign ' value ' to ' value (
		' as a' ('n integer' | ' float')
	)?;
func_show: 'Print ' value;
value: (STRING | REFERENCE) (' '? PLUS ' '? value)?
	| NUMBER (' '? (PLUS | MINUS | TIMES | DIVIDE) ' '? value)?;
REFERENCE: 'the value of ' STRING;
STRING: '"' ~[\\"]+ '"';
NUMBER: [0-9]* '.' [0-9]+ | [0-9]+;
PLUS: '+' | 'plus';
MINUS: '-' | 'minus';
TIMES: '*' | 'times' | 'multiplied by';
DIVIDE: '/' | 'by' | 'divided by';
WS: [ \t\r\n]+ -> skip;