lexer grammar DaiLexer;

// keywords

PACKAGE: 'PACKAGE';
IMPORT: 'IMPORT';

VAR: 'VAR';
CONST: 'CONST';

NULL: 'NULL';
TRUE: 'TRUE';
FALSE: 'FALSE';

THROW: 'THROW';
TRY: 'TRY';
CATCH: 'CATCH';
FINALLY: 'FINALLY';

IF: 'IF';
ELSE: 'ELSE';
SWITCH: 'SWITCH';
CASE: 'CASE';
DEFAULT: 'DEFAULT';

LOOP: 'LOOP';
DO: 'DO';
WHILE: 'WHILE';
FOR: 'FOR';
IN: 'IN';

CONTINUE: 'CONTINUE';
BREAK: 'BREAK';

FUNC: 'FUNC';
RETURN: 'RETURN';
VOID: 'VOID';

ENUM:           'ENUM';
STRUCT:         'STRUCT';
CLASS:          'CLASS';
EXTENDS:        'EXTENDS';
NEW:            'NEW';
CONSTRUCTOR:    'CONSTRUCTOR';
THIS:           'THIS';
SUPER:          'SUPER';
INTERFACE:      'INTERFACE';
IMPLEMENTS:     'IMPLEMENTS';
ANNOTATION:     'ANNOTATION';

// Literals
INT_LITERAL:    [0-9]+;
LONG_LITERAL:   [0-9]+ [l];
FLOAT_LITERAL:  [0-9]+ DOT [0-0]+ [f];
DOUBLE_LITERAL: [0-9]+ DOT [0-0]+;
CHAR_LITERAL:   '\'' (~['\\\r\n] | EscapeSequence) '\'';
STRING_LITERAL: '"' (~["\\\r\n] | EscapeSequence)* '"';

// operators
LOGICAL_NOT:            '!';
BITWISE_NOT:            '~';
QUESTION:               '?';
EQUALITY:               '==';
INEQUALITY:             '!=';
GREATER_THAN:           '>';
LESS_THAN:              '<';
LESS_THAN_OR_EQUAL:     '<=';
GREATER_THAN_OR_EQUAL:  '>=';
LOGICAL_AND:            '&&';
LOGICAL_OR:             '||';
INCREMENT:              '++';
DECREMENT:              '--';
ADDITION:               '+';
SUBTRACTION:            '-';
MULTIPLICATION:         '*';
DIVISION:               '/';
BITWISE_AND:            '&';
BITWISE_OR:             '|';
EXCLUSIVE_OR:           '^';
REMAINDER:              '%';
//LEFT_SHIFT:             '<<';
//RIGHT_SHIFT:            '>>';

// assignments
ASSIGNMENT:                 '=';
ADDITION_ASSIGNMENT:        '+=';
SUBTRACTION_ASSIGNMENT:     '-=';
MULTIPLICATION_ASSIGNMENT:  '*=';
DIVISION_ASSIGNMENT:        '/=';
AND_ASSIGNMENT:             '&=';
OR_ASSIGNMENT:              '|=';
EXCLUSIVE_OR_ASSIGNMENT:    '^=';
REMAINDER_ASSIGNMENT:       '%=';
LEFT_SHIFT_ASSIGNMENT:      '<<=';
RIGHT_SHIFT_ASSIGNMENT:     '>>=';

// function
ARROW: '=>';

// groupings
LEFT_PAREN:     '(';
RIGHT_PAREN:    ')';
LEFT_BRACE:     '{';
RIGHT_BRACE:    '}';
LEFT_BRACK:     '[';
RIGHT_BRACK:    ']';

// whitespace
WS: [\u0020\u0009\u000C] -> skip;
NL: '\u000A' | '\u000D' '\u000A';

// comments
COMMENT:        '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT:   '//' ~[\r\n]*    -> channel(HIDDEN);

// separators
DOT:        '.';
COMMA:      ',';
SEMI:       ';';
COLON:      ':';
AT:         '@';
ELLIPSIS:   '...';

// id
IDENTIFIER: Letter LetterOrDigit*;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;

fragment HexDigit: [0-9a-fA-F];

fragment Letter: [a-zA-Z$_];

fragment LetterOrDigit: Letter | [0-9];