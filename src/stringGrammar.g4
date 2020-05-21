grammar stringGrammar;

@header {
package compiler.grammar;
}

ASSIGN : '=';

CHAR : 'char';
STRING_TYPE : 'string';
STRING_ARRAY : 'stringArray';

OPAR : '(';
CPAR : ')';
OBRACKET : '{';
CBRACKET : '}';
SQ_O_BRACKET : '[';
SQ_C_BRACKET : ']';

COLON : ':';

NEGATION : '!';
EQ : '==';
NEQ : '!=';
IS : 'is';
PLUS : '+';
MOD : '/' ;
MUL : '*' ;
SUB : '-' ;

IN : 'in';
PRINT : 'print';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOREACH : 'forEach';

MAIN : 'main';
FUNCTION : 'fun';
RETURN : 'return';

parse
 : create* function* main function* EOF
 ;

main
 : MAIN OBRACKET start CBRACKET
 ;

start
 : instruction*
 ;

instruction
 : create
 | print
 | if_stat
 | while_stat
 | foreach_stat
 | function_call
 | expr
 ;


expr
    : expr op=(PLUS|MOD|MUL|SUB) expr                       #ModMulDiv
    | OPAR tp=STRING_TYPE CPAR expr                         #typeConversion
    | ID                                                    #idExpr
    | ID ASSIGN expr                                        #assignExpr
    ;

create
 : create_string
 | create_char
 | create_stringArray
 ;

create_char
 : (CHAR)? ID ASSIGN name_object_char
 ;

create_string
 : (STRING_TYPE)? ID ASSIGN name_object_string
 ;

create_stringArray
 : (STRING_ARRAY)? ID ASSIGN name_object_stringArray
 ;

name_object_stringArray
 : (SQ_O_BRACKET SQ_C_BRACKET)                          #emptyArray
 | (SQ_O_BRACKET (ID ',')* ID SQ_C_BRACKET)             #idArray
 | (SQ_O_BRACKET (STRING ',')* STRING SQ_C_BRACKET)     #strArray
 | function_call                                        #functionCallArray
 ;

name_object_string
 : STRING                                                                   #nameObjectString
 | function_call                                                            #functionCallString
 | SQ_O_BRACKET ID op=(PLUS|SUB|MOD|MUL) ID SQ_C_BRACKET                    #exprId
 | SQ_O_BRACKET STRING op=(PLUS|SUB|MOD|MUL) STRING  SQ_C_BRACKET           #exprString
 | ID                                                                       #idString
 ;

name_object_char
 : SYMBOL                                                               #nameObjectChar
 | function_call                                                        #functionCallChar
 | ID                                                                   #idChar
 ;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : OPAR (NEGATION)? condition CPAR stat_block
 ;

stat_block
 : OBRACKET start CBRACKET
 ;

while_stat
 : WHILE condition_block
 ;

foreach_stat
 : FOREACH OPAR condition_for_each CPAR stat_block
 ;

condition
 : ID op=(EQ | NEQ) ID                  #equalityExpr
 ;

condition_for_each
 : op = (STRING_TYPE|CHAR) ID IN ID                      #forEachElement
 ;

print
 : PRINT print_expr
 ;

print_expr
 : print_expr PLUS print_expr           #concatString
 | ID                                   #printId
 | STRING                               #printString
 ;

function_call
 : ID param_call
 ;

param_call
 : OPAR (arg_call)? CPAR
 ;

arg_call
 : ID                      #paramCallArg
 | ID ',' arg_call         #paramCallArgs
 ;

function
 : FUNCTION ID param stat_block                     #voidFunction
 | FUNCTION type ID param stat_block_with_return    #returnFunction
 ;

stat_block_with_return
 : OBRACKET start return_id CBRACKET
 ;

return_id
 : RETURN ID
 ;

param
 : OPAR (arg)? CPAR
 ;

arg
 : type ID                      #paramArg
 | type ID ',' arg              #paramArgs
 ;

type
 : STRING_TYPE
 | CHAR
 | STRING_ARRAY
 ;

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '//' ~[\r\n]* -> skip
 ;

SPACES
 : [ \t\r\n] -> skip
 ;

SYMBOL : '\''(.)'\'';