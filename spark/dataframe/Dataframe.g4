grammar Dataframe;

@header {
package spark.dataframe;
}

program  : 'sc.range(' NUMBER ',' NUMBER ')' WS* mapops* '.collect()' WS* EOF
         ;

mapops   : '.map(' udf ')' WS*
         ;

udf      : identity WS* '=>' WS* expression
         ;

expression : simple_expression
           | '{' WS* complex_expression WS* '}'
           ;

simple_expression : pure_expression
                  | '(' tuple_expression ')'
                  ;

tuple_expression  : pure_expression ',' WS* pure_expression
                  | tuple_expression ',' WS* pure_expression
                  ;

complex_expression : simple_expression
                   | assign_exprs ';' WS* simple_expression
                   ;
assign_exprs       : assign_expr 
                   | assign_exprs ';' WS* assign_expr
                   ;

assign_expr        : 'val' WS* identity WS* '=' WS* pure_expression
                   ;

pure_expression   : NUMBER
                  | identity
                  | '(' pure_expression ')'
                  | pure_expression WS* op WS* pure_expression
                  | 'if' WS* '(' comp_expression ')' WS* pure_expression ' else ' pure_expression
                  ;
identity          : IDENTIFIER (|'.' IDENTIFIER)
                  ;

comp_expression   : pure_expression WS* comp WS* pure_expression
                  ;

op                : '+'
                  | '-'
                  | '*'
                  | '%'
                  ;

comp              : '=='
                  | '<'
                  | '>'
                  | '!='
                  | '>='
                  | '<='
                  ;








//Lexer Rules

fragment LETTER     : ([a-z]|[A-Z]|'_');
fragment DIGIT      : [0-9];
fragment SIGN       : ('-'|'+'|);
NUMBER     : SIGN ('0'|[1-9]DIGIT*);
IDENTIFIER : LETTER(NUMBER|LETTER)*;
STRING     : '"' (NUMBER|LETTER)+ '"';
CHAR       : '\'' (NUMBER|LETTER) '\'';
SYMBOL     : '('|')'|'*'|'&'|'^'|'%'|'$'|'#'|'@'|'!'|'~'|'.'|','|'='|'+'|'-'|'/'|'?'|'<'|'>'|':';
WS         : [ \t\r\n]+ -> skip
           ;