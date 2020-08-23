grammar alpha;

// ROOT

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
			| exit
			| forLoop
		) '.' WS*
	)*;

// RULES

exit: 'Exit';

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
	'Define ' STRING (' on ' STRING ( 'and' STRING)*)? ' as:' WS* (
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
			| exit
			| forLoop
		) (',' WS*)?
	)+;

returnStmt:
	'Return ' (STRING | MATH | BOOL | REFERENCE | LIST)
	| 'Return';

show:
	'Print ' (STRING | MATH | BOOL | REFERENCE | LIST | NONE)
	| 'Print';

ifStmt:
	'If ' (BOOL | REFERENCE) ':' WS* (
		(
			show
			| assign
			| append
			| removeVal
			| removeAll
			| ifBlock
			| removePos
			| call
			| returnStmt
			| exit
			| forLoop
		) (',' WS*)?
	)+;

elifStmt:
	'otherwise if ' (BOOL | REFERENCE) ':' WS* (
		(
			show
			| assign
			| append
			| removeVal
			| removeAll
			| removePos
			| call
			| returnStmt
			| ifBlock
			| exit
			| forLoop
		) (',' WS*)?
	)+;

elseStmt:
	'otherwise:' WS* (
		(
			show
			| assign
			| append
			| removeVal
			| removeAll
			| removePos
			| call
			| ifBlock
			| returnStmt
			| exit
			| forLoop
		) (',' WS*)?
	)+;

ifBlock: ifStmt elifStmt* elseStmt?;

assign:
	'Assign ' (STRING | MATH | BOOL | REFERENCE | LIST | INPUT) ' to ' STRING;

forLoop:
	'For ' STRING ' in ' (LIST | REFERENCE | INPUT) ':' WS* (
		(
			show
			| assign
			| append
			| removeVal
			| removeAll
			| removePos
			| call
			| returnStmt
			| ifBlock
			| exit
			| forLoop
		) (',' WS*)?
	)+;

whileLoop:
	'While ' (BOOL | REFERENCE) ':' WS* (
		(
			show
			| assign
			| append
			| removeVal
			| removeAll
			| removePos
			| call
			| returnStmt
			| ifBlock
			| exit
			| forLoop
		) (',' WS*)?
	)+;

append:
	'Append ' (STRING | MATH | BOOL | REFERENCE | LIST) ' to ' STRING;

removeVal:
	'Remove ' (STRING | MATH | BOOL | REFERENCE | LIST) ' from ' STRING;

removeAll:
	'Remove all ' (STRING | MATH | BOOL | REFERENCE | LIST) 's from ' STRING;

removePos: 'Remove position ' MATH ' from ' STRING;

// TOKENS

NONE: 'None';

INPUT: 'input' | (STRING '\'s response');

REFERENCE:
	LITERAL_STRING '\'s' (
		' ' (INTEGER | '(' REFERENCE ')') (
			'th'
			| 'nd'
			| 'st'
			| 'rd'
		)
	)? ' value'
	| LITERAL_STRING '\'s ' (INTEGER | '(' REFERENCE ')') (
		'th'
		| 'nd'
		| 'st'
		| 'rd'
	) ' to ' (INTEGER | '(' REFERENCE ')') (
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
	)?
	| 'the type of ' (
		BOOL
		| STRING
		| MATH
		| LIST
		| INPUT
		| REFERENCE
	);

MATH: (
		(INTEGER | FLOAT | REFERENCE) (
			(
				' as ' (
					'a string'
					| 'an integer'
					| 'a float'
					| 'a boolean'
				)
			)?
		)
	) (
		(ADD | SUBTRACT | MULTIPLY | DIVIDE | POWER | MODULO) (
			(INTEGER | FLOAT | REFERENCE) (
				(
					' as ' (
						'a string'
						| 'an integer'
						| 'a float'
						| 'a boolean'
					)
				)?
			)
		)
	)*;

STRING: (
		(STRING_FACTOR) (
			' as ' (
				'a string'
				| 'an integer'
				| 'a float'
				| 'a boolean'
			)
		)?
	) (
		ADD (
			(STRING_FACTOR) (
				' as ' (
					'a string'
					| 'an integer'
					| 'a float'
					| 'a boolean'
				)
			)?
		)
	)*;

BOOL:
	(
		(BOOL_LITERAL) (
			' as ' (
				'a string'
				| 'an integer'
				| 'a float'
				| 'a boolean'
			)
		)?
	) (
		(AND | OR | ' is equal to ' | ' is not equal to ') (
			(BOOL_LITERAL) (
				' as ' (
					'a string'
					| 'an integer'
					| 'a float'
					| 'a boolean'
				)
			)?
		)
	)*;

LIST: (
		(STRING | BOOL | REFERENCE | MATH) (
			(',' WS*)? (STRING | BOOL | REFERENCE | MATH)
		)*
		| 'a new list'
	) (
		' as ' (
			'a string'
			| 'an integer'
			| 'a float'
			| 'a boolean'
		)
	)?;

// FRAGMENTS

fragment INTEGER: '-'? [0-9]+;

fragment FLOAT: '-'? [0-9]* '.' [0-9]+;

fragment BOOL_LITERAL:
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

fragment STRING_FACTOR:
	STRING_LITERAL (MULTIPLY MATH)?
	| (MATH MULTIPLY) STRING_LITERAL;

fragment LITERAL_STRING: '"' ~["]* '"';

fragment STRING_LITERAL: LITERAL_STRING | REFERENCE;

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