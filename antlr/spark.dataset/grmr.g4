grammar grmr;

@header {
  package spark.dataset;
}

prog  : IDENTIFIER '=' start '\n'* more* '\n'* EOF
      | start '\n'* more* '\n'* EOF
      ;

start : 'sc' mod '\n'*
      ;

more  : IDENTIFIER mod '\n'*
      //| IDENTIFIER stmt '\n'*
      ;

//stmt : '.range(' NUMBER ',' NUMBER ')' mod
//     | '.textFile(' STRING ')' mod
//     ;

mod  : '.range(' NUMBER ',' NUMBER ')' mod
     | '.textFile(' STRING ')' mod
     | '.map' '(' func ')' mod
     | '.filter' '(' func ')' mod
     | '.reduce(' func ')' mod
     | '.reduceByKey(' func ')' mod
     | '.sortBy(' func ')' mod
     | '.collect()' mod
     | 
     ; 

func : IDENTIFIER '=>' (SYMBOL|IDENTIFIER|NUMBER)*
     ;









//Lexer Rules

fragment LETTER     : ([a-z]|[A-Z]|'_');
fragment DIGIT      : [0-9];
NUMBER     : DIGIT+;
IDENTIFIER : LETTER(NUMBER|LETTER)*;
STRING     : '\"' (NUMBER|LETTER)+ '\"';
CHAR       : '\'' (NUMBER|LETTER) '\'';
SYMBOL     : '('|')'|'*'|'&'|'^'|'%'|'$'|'#'|'@'|'!'|'~'|'.'|','|'='|'+'|'-'|'/'|'?'|'<'|'>'|':';
