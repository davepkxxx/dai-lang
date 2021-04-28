parser grammar DaiParser;

options { tokenVocab=DaiLexer; }

compilationUnit: packageDeclaration? importDeclaration* body EOF;
packageDeclaration: PACKAGE identifierPath eos;
importDeclaration: IMPORT identifierPath eos;

body: statement*;

statement
    : emptyStatement
    | blockStatements
    | variateDeclaration eos
    | functionDeclaration
    | returnStatement
    | enumDeclaration
    | structDeclaration
    | classDeclaration
    | interfaceDeclaration
//    | annotationDeclaration
    | throwStatement
    | tryStatement
    | ifStatement
    | switchStatement
    | loopStatement
    | whileStatement
    | doWhileStatement
    | forStatement
    | foreachStatement
    | continueStatement
    | breakStatement
    | expressionStatement
    ;

block:              '{' statement* '}';
blockStatements:    '{' statement* '}';
emptyStatement:     ';';
continueStatement:  CONTINUE eos;
breakStatement:     BREAK eos;

variateDeclaration:     (VAR | CONST) variateDeclaratorList;
variateDeclaratorList:  variateDeclarator (',' variateDeclarator)*;
variateDeclarator:      identifier (':' classType)? ('=' expression)?;

functionDeclaration:    FUNC identifier declareGenericsParameters? functionParameters functionReturn? block;
functionParameters:     '(' variateDeclaratorList? ')';
functionReturn:         ':' (classType | VOID);
returnStatement:        RETURN expression? eos;

enumDeclaration:            ENUM identifier ('<' genericsParameter '>')? enumBody;
enumBody:                   '{' enumFieldDeclaratorList '}';
enumFieldDeclarator:        identifier ('=' expression)?;
enumFieldDeclaratorList:    enumFieldDeclarator (',' enumFieldDeclarator)*;

structDeclaration:  STRUCT identifier declareGenericsParameters? extendsSnippet? structBody;
structBody:         '{' variateDeclaration* '}';
extendsSnippet:     (EXTENDS classType);

classDeclaration:       CLASS identifier declareGenericsParameters? extendsSnippet? implementsSnippet? classBody;
classBody:              '{' classMemberDeclaration* '}';
classMemberDeclaration: variateDeclaration | functionDeclaration | constructorDeclaration;
constructorDeclaration: CONSTRUCTOR functionParameters block;
implementsSnippet:      IMPLEMENTS classType (',' classType)*;

interfaceDeclaration:           INTERFACE identifier declareGenericsParameters? extendsSnippet? interfaceBody;
interfaceBody:                  '{' interfaceMemberDeclaration* '}';
interfaceMemberDeclaration:     variateDeclaration | functionDeclaration | abstractFunctionDeclaration;
abstractFunctionDeclaration:    FUNC identifier genericsParameters? functionParameters eos;

annotationDeclaration:  ANNOTATION identifier annotationBody;
annotationBody:         '{' variateDeclaration* '}';

throwStatement: THROW expression eos;
tryStatement
    : TRY statement FINALLY statement
    | TRY statement CATCH '(' variateDeclarator ')' statement
    | TRY statement CATCH '(' variateDeclarator ')' statement FINALLY statement
    ;

ifStatement:    IF condition statement (ELSE statement)?;
condition:      '(' expression ')';

switchStatement:        SWITCH condition '{' switchCaseStatement+ '}';
switchCaseStatement:    switchCaseLabel+ statement+;
switchCaseLabel:        CASE expression ':' | DEFAULT ':';

loopStatement:      LOOP statement;
whileStatement:     WHILE condition statement;
doWhileStatement:   DO statement WHILE condition eos;

forStatement:   FOR '(' forInit? ';' expression? ';' expressionList? ')' statement;
forInit:        variateDeclaration | expressionList;
foreachStatement
    : FOREACH '(' variateDeclarator IN expression ')' statement
    | FOREACH '(' '(' variateDeclarator (',' variateDeclarator)? ')' IN expression ')' statement;

expression
    : '(' expression ')'                                            # parenthesizedExpression
    | THIS                                                          # thisExpression
    | SUPER                                                         # superExpression
    | identifier                                                    # identifierExpression
    | expression '.' (identifier | expression params)               # chainExpression
    | expression '[' expression ']'                                 # memberExpression
    | expression params                                             # callExpression
    | NEW genericsParameters? params                                # newExpression
    | expression ('++' | '--')                                      # incrementalExpression
    | ('+' | '-') expression                                        # unaryExpression
    | ('~' | '!') expression                                        # notExpression
    | expression ('*' | '/' | '%') expression                       # multiplicativeExpression
    | expression ('+' | '-') expression                             # additiveExpression
    | expression ('<' '<' | '>' '>') expression                     # shiftExpression
    | expression ('>' | '<' | '>=' | '<=') expression               # relationalExpression
    | expression ('=' | '!=') expression                            # equalExpression
    | expression '&' expression                                     # bitwiseAndExpression
    | expression '^' expression                                     # exclusiveOrExpression
    | expression '|' expression                                     # bitwiseOrExpression
    | expression '&&' expression                                    # andExpression
    | expression '||' expression                                    # orExpression
    | <assoc=right> expression '?' expression ':' expression        # conditionalExpression
    | <assoc=right> identifierPath assignOperator expression         # assignExpression
    | (identifier | functionParameters) ARROW (expression | block)  # lambdaExpression
    | literal                                                       # literalExpression
    | arrayLiteral                                                  # arrayLiteralExpression
    | objectLiteral                                                 # objectLiteralExpression
    ;

expressionList: expression (',' expression)*;
expressionStatement: expression eos;
params: '(' expressionList? ')';

assignOperator
    : '='
    | '+='
    | '-='
    | '*='
    | '/='
    | '&='
    | '|='
    | '^='
    | '%='
    | '<<='
    | '>>='
    ;

literal
    : INTEGER_LITERAL
    | LONG_LITERAL
    | FLOAT_LITERAL
    | DOUBLE_LITERAL
    | CHARACTER_LITERAL
    | STRING_LITERAL
    | BOOLEAN_LITERAL
    | NULL_LITERAL
    ;

arrayLiteral:       '[' expressionList? ']';
objectLiteral:      '{' objectPropertyList? '}';
objectProperty:     identifier ':' expression;
objectPropertyList: objectProperty (',' objectProperty)?;

identifier:     IDENTIFIER;
identifierPath: identifier ('.' identifier)*;

genericsParameter:                  identifierPath genericsParameters?;
genericsParameterList:              genericsParameter (',' genericsParameter)?;
genericsParameters:                 '<' genericsParameterList '>';
classType:                          identifierPath genericsParameters?;
declareGenericsParameter:          identifier declareGenericsParameterExtends?;
declareGenericsParameterList:      declareGenericsParameter (',' declareGenericsParameter)?;
declareGenericsParameters:         '<' declareGenericsParameterList '>';
declareGenericsParameterExtends:   EXTENDS (identifier | declareGenericsParameterSuper);
declareGenericsParameterSuper:     identifierPath genericsParameters?;

eos: NL+ | NL* SEMI NL* | EOF;