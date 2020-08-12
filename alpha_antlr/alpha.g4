grammar alpha;
r: (assign | show)+;
assign: 'Assign ' value ' to ' value '.' ' '?;
show: 'Print ' value '.' ' '?;
value: (STRING | REFERENCE) (' '? PLUS ' '? value)?
	| NUMBER (' '? (PLUS | MINUS | TIMES | DIVIDE) ' '? value)?;
REFERENCE: 'the value of ' STRING;
STRING: '"' ~[\\"]+ '"';
NUMBER: [0-9]+ | [0-9]+ '.' [0-9]+;
PLUS: '+' | 'plus';
MINUS: '-' | 'minus';
TIMES: '*' | 'times' | 'multiplied by';
DIVIDE: '/' | 'by' | 'divided by';
WS: [ \t\r\n]+ -> skip;