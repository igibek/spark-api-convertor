grammar Dataframe;

@header {
  // package dataframe;
}

program  : 'sc.range(' NUMBER ',' NUMBER ')' mapops '.collect()' EOF
         ;

mapops   : EOF
         | mapops '.map(' udf ')'
         ;

udf      : IDENTIFIER '=>' expression
         ;

expression : simple_expression
           | '{' complex_expression '}'
           ;

simple_expression : pure_expression
                  | '(' tuple_expression ')'
                  ;

tuple_expression  : pure_expression ',' pure_expression
                  | tuple_expression ',' pure_expression
                  ;

complex_expression : simple_expression
                   | assign_exprs ';' simple_expression
                   ;
assign_exprs       : assign_expr 
                   | assign_exprs ';' assign_expr
                   ;

assign_expr        : 'val ' IDENTIFIER ' = ' pure_expression
                   ;

pure_expression   : (IDENTIFIER|NUMBER)
                  | IDENTIFIER '.' IDENTIFIER
                  | '(' pure_expression ')'
                  | pure_expression op pure_expression
                  | 'if (' comp_expression ')' pure_expression ' else ' pure_expression
                  ; 

comp_expression   : pure_expression comp pure_expression
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
NUMBER     : DIGIT+;
IDENTIFIER : LETTER(NUMBER|LETTER)*;
STRING     : '\"' (NUMBER|LETTER)+ '\"';
CHAR       : '\'' (NUMBER|LETTER) '\'';
SYMBOL     : '('|')'|'*'|'&'|'^'|'%'|'$'|'#'|'@'|'!'|'~'|'.'|','|'='|'+'|'-'|'/'|'?'|'<'|'>'|':';