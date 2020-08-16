grammar alpha;

// ROOTS

prog: (
		(
			show
			| ifBlock
			| assign
			| whileLoop
			| append
			| removeVal
			| removeAll
			| removePos
		) '.' WS?
	)*;

// RULES

show: 'Print ' (STRING | MATH | BOOL | REFERENCE | LIST);

ifStmt:
	'If ' (BOOL | REFERENCE) ':' WS? (
		(
			show
			| assign
			| append
			| removeVal
			| removeAll
			| removePos
		) (',' WS?)?
	)+;

elifStmt:
	'otherwise if ' (BOOL | REFERENCE) ':' WS? (
		(
			show
			| assign
			| append
			| removeVal
			| removeAll
			| removePos
		) (',' WS?)?
	)+;

elseStmt:
	'otherwise:' WS? (
		(
			show
			| assign
			| append
			| removeVal
			| removeAll
			| removePos
		) (',' WS?)?
	)+;

ifBlock: ifStmt elifStmt* elseStmt?;

assign:
	'Assign ' (STRING | MATH | BOOL | REFERENCE | LIST) ' to ' STRING;

whileLoop:
	'While ' (BOOL | REFERENCE) ':' WS? (
		(
			show
			| assign
			| append
			| removeVal
			| removeAll
			| removePos
		) (',' WS?)?
	)+;

append:
	'Append ' (STRING | MATH | BOOL | REFERENCE) ' to ' STRING;

removeVal:
	'Remove ' (STRING | MATH | BOOL | REFERENCE) ' from ' STRING;

removeAll:
	'Remove all ' (STRING | MATH | BOOL | REFERENCE) 's from ' STRING;

removePos: 'Remove position ' MATH ' from ' STRING;

// TOKENS
REFERENCE:
	LITERAL_STRING '\'s' (
		' ' INTEGER ('th' | 'nd' | 'st' | 'rd')
	)? ' value'
	| LITERAL_STRING '\'s ' INTEGER ('th' | 'nd' | 'st' | 'rd') ' to ' INTEGER (
		'th'
		| 'nd'
		| 'st'
		| 'rd'
	) ' values'
	| LITERAL_STRING '\'s' (' literal')? ' length';

MATH: (INTEGER | FLOAT | REFERENCE) (
		(ADD | SUBTRACT | MULTIPLY | DIVIDE | POWER | MODULO) (
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

LITERAL_STRING: '"' ~["]+ '"';

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

LIST: (STRING | BOOL | REFERENCE | MATH) (
		(',' WS?)? (STRING | BOOL | REFERENCE | MATH)
	)*
	| 'a new list';

AND: ' and ';

OR: ' or ';

ADD: ' + ' | ' plus ';

SUBTRACT: ' - ' | ' minus ';

MULTIPLY: ' * ' | ' times ';

DIVIDE: ' / ' | ' by ';

POWER: ' ^ ' | ' raise ';

MODULO: ' % ' | ' mod ';

WS: [ \t\r\n] -> skip;
