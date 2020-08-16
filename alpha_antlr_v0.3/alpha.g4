grammar alpha;

// ROOTS

prog: ((show | ifBlock | assign | whileLoop) '.' WS?)*;

// RULES

show: 'Print ' (STRING | MATH | BOOL | REFERENCE);

ifStmt:
	'If ' (BOOL | REFERENCE) ':' WS? ((show | assign) (',' WS?)?)+;

elifStmt:
	'otherwise if ' (BOOL | REFERENCE) ':' WS? (
		(show | assign) (',' WS?)?
	)+;

elseStmt: 'otherwise:' WS? ((show | assign) (',' WS?)?)+;

ifBlock: ifStmt elifStmt* elseStmt?;

assign:
	'Assign ' (STRING | MATH | BOOL | REFERENCE) ' to ' STRING;

whileLoop:
	'While ' (BOOL | REFERENCE) ':' WS? (
		(show | assign) (',' WS?)?
	)+;

// TOKENS

REFERENCE: 'the value of ' STRING;

MATH: (INTEGER | FLOAT | REFERENCE) (
		(ADD | SUBTRACT | MULTIPLY | DIVIDE | POWER) (
			INTEGER
			| FLOAT
			| REFERENCE
		)
	)*;

INTEGER: [0-9]+;

FLOAT: [0-9]* '.' [0-9]+;

STRING: STRING_FACTOR (ADD STRING_FACTOR)*;

STRING_FACTOR:
	STRING_LITERAL (MULTIPLY MATH)?
	| (MATH MULTIPLY) STRING_LITERAL;

STRING_LITERAL: '"' ~["]+ '"' | REFERENCE;

BOOL: BOOL_LITERAL ((AND | OR) BOOL_LITERAL)*;

BOOL_LITERAL:
	'not '? (
		'true'
		| 'false'
		| STRING (' is equal to ' | ' is not equal to ') STRING
		| MATH (
			' is equal to '
			| ' is not equal to '
			| ' is less than '
			| ' is greater than '
			| ' is greater than or equal to '
			| ' is less than or equal to '
		) MATH
		| REFERENCE
	);

AND: ' and ';

OR: ' or ';

ADD: ' + ' | ' plus ';

SUBTRACT: ' - ' | ' minus ';

MULTIPLY: ' * ' | ' times ';

DIVIDE: ' / ' | ' by ';

POWER: ' ^ ' | ' raise ';

WS: [ \t\r\n] -> skip;
