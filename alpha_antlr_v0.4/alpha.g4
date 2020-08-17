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
			| define
			| call
			| returnStmt
		) '.' WS?
	)*;

// RULES

call:
	'Call ' STRING (
		' on ' (BOOL | STRING | MATH | LIST | INPUT | REFERENCE) (
			'and' (
				BOOL
				| STRING
				| MATH
				| LIST
				| INPUT
				| REFERENCE
			)
		)*
	)?;

define:
	'Define ' STRING (' on ' STRING ( 'and' STRING)*)? ' as:' WS? (
		(
			show
			| assign
			| append
			| removeVal
			| removeAll
			| removePos
			| ifBlock
			| whileLoop
			| call
			| returnStmt
		) (',' WS?)?
	)+;

returnStmt: 'Return ' (STRING | MATH | BOOL | REFERENCE | LIST);

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
			| call
			| returnStmt
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
			| call
			| returnStmt
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
			| call
			| returnStmt
		) (',' WS?)?
	)+;

ifBlock: ifStmt elifStmt* elseStmt?;

assign:
	'Assign ' (STRING | MATH | BOOL | REFERENCE | LIST | INPUT) ' to ' STRING;

whileLoop:
	'While ' (BOOL | REFERENCE) ':' WS? (
		(
			show
			| assign
			| append
			| removeVal
			| removeAll
			| removePos
			| call
			| returnStmt
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
INPUT: 'input' | (STRING '\'s answer');

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
	| LITERAL_STRING '\'s' (' literal')? ' length'
	| 'the result of calling ' STRING (
		' on ' (BOOL | STRING | MATH | LIST | INPUT | REFERENCE) (
			' and ' (
				BOOL
				| STRING
				| MATH
				| LIST
				| INPUT
				| REFERENCE
			)
		)*
	)?;

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

LITERAL_STRING: '"' ~["]+ '"';

STRING_LITERAL: '"' ~["]+ '"' | REFERENCE;

BOOL:
	BOOL_LITERAL (
		(AND | OR | ' is equal to ' | ' is not equal to ') BOOL_LITERAL
	)*;

BOOL_LITERAL:
	'not '? (
		'True'
		| 'False'
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

ARGS: (BOOL | STRING | MATH | LIST | INPUT) (
		'and' (BOOL | STRING | MATH | LIST | INPUT)
	)*;

fragment AND: ' and ';

fragment OR: ' or ';

fragment ADD: ' + ' | ' plus ';

fragment SUBTRACT: ' - ' | ' minus ';

fragment MULTIPLY: ' * ' | ' times ';

fragment DIVIDE: ' / ' | ' by ';

fragment POWER: ' ^ ' | ' raise ';

fragment MODULO: ' % ' | ' mod ';

WS: [ \t\r\n] -> skip;
COMMENT: 'Note: ' .*? '\n' -> skip;