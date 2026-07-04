grammar Expr;

root: expr EOF ;    

expr: EOF ;


IMPORT : 'import' ;
PUBLIC : 'public' ;
PRIVATE : 'private' ;
CLASS : 'class' ;
STATIC : 'static' ;
NEW : 'new' ;
VOID : 'void' ;
INT : 'int' ;
IF: 'if';
SYSOUT : 'System.out.println' ;
SCAN : 'Scanner' ;
WHILE : 'while' ;
DO : 'do' ;
ELSE : 'else' ;
for : 'for' ;
SWITCH : 'switch' ;
GET : 'get';
SET : 'set';


STRING : 'String' ;
DOUBLE : 'double';
BOOLEAN : 'boolean';
ARRAY : 'array' ;
ARRAYLIST : 'ArrayList' ;
LIST : 'List' ;
FLOAT : 'float' ;


NUM : [0-9]+ ;
CADENA : '"' ~["\r\n]* '"' ;


ID : [a-zA-Z_][a-zA-Z0-9_]* ;


IGUAL : '=' ;
SUMA : '+' ;
MAYORIGUAL : '>=' ;
AND : '&&' ;
OR : '||' ;

PUNTO : '.' ;
PUNTO_COMA : ';' ;
PAR_IZQ : '(' ;
PAR_DER : ')' ;
LLAVE_IZQ : '{' ;
LLAVE_DER : '}' ;
COR_IZQ : '[' ;
COR_DER : ']' ;



WS : [ \t\r\n]+ -> skip ;