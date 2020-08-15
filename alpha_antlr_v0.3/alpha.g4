grammar alpha;

// ROOTS

prog: ((show | ifBlock) '.' WS?)*;

// RULES

show: 'Print ' (STRING | MATH | BOOL);

ifBlock: ifStmt elifStmt* elseStmt?;

ifStmt: 'If ' BOOL ':' WS? (show (',' WS?)?)+;

elifStmt: 'otherwise if ' BOOL ':' WS? (show (',' WS?)?)+;

elseStmt: 'otherwise:' WS? (show (',' WS?)?)+;

// TOKENS

MATH: (INTEGER | FLOAT) (
		(ADD | SUBTRACT | MULTIPLY | DIVIDE | POWER) (
			INTEGER
			| FLOAT
		)
	)*;

BOOL: BOOL_LITERAL ((AND | OR) BOOL_LITERAL)*;

INTEGER: [0-9]+;

FLOAT: [0-9]* '.' [0-9]+;

STRING: STRING_FACTOR (ADD STRING_FACTOR)*;

STRING_FACTOR:
	STRING_LITERAL (MULTIPLY MATH)?
	| (MATH MULTIPLY) STRING_LITERAL;

STRING_LITERAL: '"' ~["]+ '"';

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
	);

AND: ' and ';

OR: ' or ';

ADD: ' + ' | ' plus ';

SUBTRACT: ' - ' | ' minus ';

MULTIPLY: ' * ' | ' times ';

DIVIDE: ' / ' | ' by ';

POWER: ' ^ ' | ' raise ';

WS: [ \t\r\n] -> skip;
