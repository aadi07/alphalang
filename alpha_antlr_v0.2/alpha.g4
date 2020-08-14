grammar alpha;

// Roots

prog: ((assign | show | func | call) '.' WS?)+;
returnFunc: ((assign | show | func | call | returnVal) '.' WS?)+;

// Types of statements

assign:
	'Assign ' value ' to ' value (
		' as ' ('an integer' | 'a float' | 'a string')
	)?;

show: 'Print ' value;

func:
	'Define ' value (' on ' args)? ' as:' WS? (
		(assign | show | func | call | returnVal) (',' WS?)?
	)+;

call: 'Call ' value (' on ' args)?;

returnVal: 'Return ' value;

// Tokens

value: (
		(STRING | reference | returnCall) PLUS?
		| (NUMBER | reference | returnCall) (
			PLUS
			| MINUS
			| TIMES
			| DIVIDE
		)?
	)+;

args: value (' and ' value)*;

reference: 'the value of ' value (',' WS?)?;

returnCall:
	'the result of calling ' value (' on ' args)? (',' WS?)?;

STRING: '"' ~["]+ '"';

NUMBER: [0-9]* '.' [0-9]+ | [0-9]+;

PLUS: WS? ('+' | 'plus') WS?;

MINUS: WS? ('-' | 'minus') WS?;

TIMES: WS? ('*' | 'times' | 'multiplied by') WS?;

DIVIDE: WS? ('/' | 'divided by' | 'by') WS?;

WS: [ \t\r\n] -> skip;
