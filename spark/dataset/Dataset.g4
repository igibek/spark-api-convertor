grammar Dataset;

@header {
    package spark.dataset;
}

prog  : start //EOF
      //| IDENTIFIER WS* '=' WS* start WS* more* WS* EOF
      //| start WS* EOF
      ;

start : WS* 'sc' mod
      ;

//more  : IDENTIFIER mod WS*
//      ;

mod  : '.range(' WS* NUMBER WS* ',' WS* NUMBER WS* ')' mod
     | '.textFile(' WS* STRING WS* ')' mod
     | '.map(' WS* func WS* ')' mod
     | '.filter(' WS* func WS* ')' mod
     | '.reduce(' WS* func WS* ')' mod
     | '.reduceByKey(' WS* func WS* ')' mod
     | '.sortBy(' WS* func WS* ')' mod
     | '.collect(' WS* ')' mod
     | EOF
     ; 

func : ((SYMBOL|IDENTIFIER|NUMBER)WS*)* WS* funcSym WS* ((SYMBOL|IDENTIFIER|NUMBER)WS*)*
     ;

funcSym : '=>' 
        ;

//Lexer Rules

fragment LETTER     : ([a-z]|[A-Z]|'_');
fragment DIGIT      : [0-9];
fragment SIGN       : ('-'|'+'|);
NUMBER     : SIGN (([1-9] DIGIT* ) | '0');
IDENTIFIER : LETTER(NUMBER|LETTER)*;
STRING     : '"' (NUMBER|LETTER)+ '"';
CHAR       : '\'' (NUMBER|LETTER) '\'';
SYMBOL     : '('|')'|'*'|'&'|'^'|'%'|'$'|'#'|'@'|'!'|'~'|'.'|','|'='|'+'|'-'|'/'|'?'|'<'|'>'|':';
WS         : [ \t\r\n]+ -> skip
           ;
