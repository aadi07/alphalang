grammar alpha;

// Roots

prog: ((assign | show | func | call | ifStmt) '.' WS?)+;
returnFunc: (
		(assign | show | func | call | returnVal | ifStmt) '.' WS?
	)+;

// Types of statements

assign:
	'Assign ' value ' to ' stringValue (
		' as ' ('an integer' | 'a float' | 'a string')
	)?;

show: 'Print ' value;

func:
	'Define ' stringValue (' on ' args)? ' as:' WS? (
		(assign | show | func | call | returnVal | ifStmt) (
			',' WS?
		)?
	)+;

ifStmt:
	'If ' booleanValue ':' WS? (
		(assign | show | func | call | returnVal) (',' WS?)?
	)+ (
		',' WS? 'otherwise if ' booleanValue ':' WS? (
			(assign | show | func | call | returnVal) (',' WS?)?
		)+
	)* (
		', otherwise:' WS? (
			(assign | show | func | call | returnVal) (',' WS?)?
		)+
	)?;

call: 'Call ' stringValue (' on ' args)?;

returnVal: 'Return ' value;

// Tokens

value: (bl | reference | returnCall) (
		('and' | 'or') (bl | reference | returnCall)
	)*
	| (STRING | reference | returnCall) (
		PLUS? (STRING | reference | returnCall)
	)*
	| (NUMBER | reference | returnCall) (
		(PLUS | MINUS | TIMES | DIVIDE) (
			NUMBER
			| reference
			| returnCall
		)
	)*;

stringValue: (STRING | reference | returnCall) (
		PLUS? (STRING | reference | returnCall)
	)*;

numericValue: (NUMBER | reference | returnCall) (
		(PLUS | MINUS | TIMES | DIVIDE) (
			NUMBER
			| reference
			| returnCall
		)
	)*;

booleanValue: (bl | reference | returnCall) (
		(' and ' | ' or ') (bl | reference | returnCall)
	)*;

bl:
	stringValue (
		' is equal to '
		| ' equals '
		| ' is not equal to '
		| ' isn\'t equal to '
	) stringValue (',' WS?)?
	| numericValue (
		' is equal to '
		| ' equals '
		| ' is not equal to '
		| ' isn\'t equal to '
		| ' is less than '
		| ' is greater than '
		| ' is atleast '
		| ' is atmost '
		| ' is at least '
		| ' is at most '
		| ' is greater than or equal to '
		| ' is less than or equal to '
		| ' is not greater than '
		| ' is not less than '
		| ' isn\'t less than '
		| ' isn\'t greater than '
	) numericValue (',' WS?)?
	| 'true'
	| 'false';

args: value (' and ' value)*;

reference: 'the value of ' value (',' WS?)?;

returnCall:
	'the result of calling ' value (' on ' args)? (',' WS?)?;

STRING: '"' ~["]+ '"';

NUMBER: [0-9]+ '.' [0-9]+ | [0-9]+;

PLUS: WS? ('+' | 'plus') WS?;

MINUS: WS? ('-' | 'minus') WS?;

TIMES: WS? ('*' | 'times' | 'multiplied by') WS?;

DIVIDE: WS? ('/' | 'divided by' | 'by') WS?;

WS: [ \t\r\n] -> skip;
