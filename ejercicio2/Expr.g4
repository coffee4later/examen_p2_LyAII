grammar Expr;

root: expr EOF ;    

expr: EOF ;

PUBLIC: 'public';
FINAL: 'final';
CLASS: 'class';
THROW: 'throw';
NEW: 'new';
PRIVATE: 'private';
PROTECTED: 'protected';
TRY: 'try';
CATCH: 'catch';
FINALLY: 'finally';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
DO: 'do';
VOID: 'void';
INT: 'int';
DOUBLE: 'double';
FLOAT: 'float';
IMPORT: 'import';
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
THIS: 'this';
PACKAGE: 'package';
OVERRIDE: '@Override';
SUPER: 'super';


AND: '&&';
OR: '||';
NOT: '!';

COMA: ',';
PUNTO: '.';
SEMIC: ';';
COR_A: '[';
COR_C: ']';
PAR_A: '(';
PAR_C: ')';
LLA_A: '{';
LLA_C: '}';

IGUAL: '==';
MAYOR_QUE: '>';
MAYOR_IGUAL: '>=';
MENOR_QUE: '<';
MENOR_IGUAL: '<=';
DIFERENTE: '!=';

ASIG: '=';
MAS: '+';
MENOS: '-';
POR: '*';
ENTRE: '/';
MODU: '%';

STRING: '"' .*? '"';
NUM_INT: [-]? [0-9]+ ;
NUM_REAL: [-]? [0-9]+ '.'[0-9]+;

IDF: [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip ;

