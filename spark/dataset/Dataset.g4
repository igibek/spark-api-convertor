grammar Dataset;

@header {
    package spark.dataset;
}

prog  : start
      ;

start : WS* 'sc' mod
      ;

mod  : '.range(' WS* NUMBER WS* ',' WS* NUMBER WS* ')' WS* mod
     | '.textFile(' WS* STRING WS* ')' WS* mod
     | '.map(' WS* func WS* ')' WS* mod
     | '.filter(' WS* func WS* ')' WS* mod
     | '.reduce(' WS* func WS* ')' WS* mod
     | '.reduceByKey(' WS* func WS* ')' WS* mod
     | '.sortBy(' WS* func WS* ')' WS* mod
     | '.collect(' WS* ')' WS* mod
     | EOF
     ; 

func : ((SYMBOL|IDENTIFIER|NUMBER|','|')'|'(')WS*)* WS* funcSym WS* ((SYMBOL|IDENTIFIER|NUMBER|','|')'|'(')WS*)*
     ;

funcSym : '=>' 
        ;

//Lexer Rules

fragment LETTER     : ([a-z]|[A-Z]|'_');
fragment DIGIT      : [0-9];
fragment SIGN       : ('-'|'+'|);
NUMBER     : SIGN (([1-9] DIGIT* ) | '0');
IDENTIFIER : LETTER(DIGIT|LETTER)*;
STRING     : '"' (NUMBER|LETTER)+ '"';
CHAR       : '\'' (NUMBER|LETTER) '\'';
SYMBOL     : '('|')'|'*'|'&'|'^'|'%'|'$'|'#'|'@'|'!'|'~'|'.'|','|'='|'+'|'-'|'/'|'?'|'<'|'>'|':';
WS         : [ \t\r\n]+ -> skip
           ;
