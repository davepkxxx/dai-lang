parser grammar DaiParser;

options { tokenVocab=DaiLexer; }

compilationUnit: packageDeclaration? importDeclaration* statement* EOF;
packageDeclaration: PACKAGE qualifiedName eos;
importDeclaration: IMPORT qualifiedName eos;

statement
    : emptyStatement
    | block
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
emptyStatement:     ';';
continueStatement:  CONTINUE eos;
breakStatement:     BREAK eos;

variateDeclaration:     (VAR | CONST) variateDeclaratorList;
variateDeclaratorList:  variateDeclarator (',' variateDeclarator)*;
variateDeclarator:      IDENTIFIER (':' classType)? ('=' expression)?;

functionDeclaration:    FUNC IDENTIFIER abstractGenericsParameters? functionParameters block;
functionParameters:     '(' variateDeclaratorList? ')';
returnStatement:        RETURN expression? eos;

enumDeclaration:            ENUM IDENTIFIER ('<' genericsParameter '>')? enumBody;
enumBody:                   '{' enumFieldDeclaratorList '}';
enumFieldDeclarator:        IDENTIFIER ('=' expression)?;
enumFieldDeclaratorList:    enumFieldDeclarator (',' enumFieldDeclarator)*;

structDeclaration:  STRUCT IDENTIFIER abstractGenericsParameters? extendsSnippet? structBody;
structBody:         '{' variateDeclaration* '}';
extendsSnippet:     (EXTENDS classType);

classDeclaration:       CLASS IDENTIFIER abstractGenericsParameters? extendsSnippet? implementsSnippet? classBody;
classBody:              '{' classMemberDeclaration* '}';
classMemberDeclaration: variateDeclaration | functionDeclaration | constructorDeclaration;
constructorDeclaration: CONSTRUCTOR functionParameters block;
implementsSnippet:      IMPLEMENTS classType (',' classType)*;

interfaceDeclaration:           INTERFACE IDENTIFIER abstractGenericsParameters? extendsSnippet? interfaceBody;
interfaceBody:                  '{' interfaceMemberDeclaration* '}';
interfaceMemberDeclaration:     variateDeclaration | functionDeclaration | abstractFunctionDeclaration;
abstractFunctionDeclaration:    FUNC IDENTIFIER genericsParameters? functionParameters eos;

annotationDeclaration:  ANNOTATION IDENTIFIER annotationBody;
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
doWhileStatement:   DO statement WHILE condition;

forStatement:   FOR '(' forInit? ';' expression? ';' expressionList? ')' statement;
forInit:        variateDeclaration | expressionList;
foreachStatement
    : FOREACH '(' variateDeclarator IN expression ')' statement
    | FOREACH '(' '(' variateDeclarator (',' variateDeclarator)? ')' IN expression ')' statement;

expression
    : '(' expression ')'                                            # parenthesizedExpression
    | THIS                                                          # thisExpression
    | SUPER                                                         # superExpression
    | IDENTIFIER                                                    # identifierExpression
    | expression '.' (IDENTIFIER | expression params)               # chainExpression
    | expression '[' expression ']'                                 # memberExpression
    | expression params                                             # callExpression
    | NEW genericsParameters? params                                # newExpression
    | expression ('++' | '--')                                      # incrementalExpression
    | ('+' | '-') expression                                        # unaryExpression
    | ('~' | '!') expression                                        # notExpression
    | expression ('*' | '/' | '%') expression                       # multiplicativeExpression
    | expression ('+' | '-') expression                             # additiveExpression
    | expression ('<<' | '>>') expression                           # shiftExpression
    | expression ('>' | '<' | '>=' | '<=') expression               # relationalExpression
    | expression ('=' | '!=') expression                            # equalExpression
    | expression '&' expression                                     # bitwiseAndExpression
    | expression '^' expression                                     # exclusiveOrExpression
    | expression '|' expression                                     # bitwiseOrExpression
    | expression '&&' expression                                    # andExpression
    | expression '||' expression                                    # orExpression
    | <assoc=right> expression '?' expression ':' expression        # conditionalExpression
    | <assoc=right> qualifiedName assignOperator expression         # assignExpression
    | (IDENTIFIER | functionParameters) ARROW (expression | block)  # lambdaExpression
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
objectProperty:     IDENTIFIER ':' expression;
objectPropertyList: objectProperty (',' objectProperty)?;

qualifiedName:                  IDENTIFIER ('.' IDENTIFIER)*;
genericsParameter:              IDENTIFIER | qualifiedName;
genericsParameterList:          genericsParameter (',' genericsParameter)?;
genericsParameters:             '<' genericsParameterList '>';
classType:                      qualifiedName genericsParameters?;
abstractGenericsParameter:      IDENTIFIER (EXTENDS qualifiedName)? | qualifiedName;
abstractGenericsParameterList:  abstractGenericsParameter (',' abstractGenericsParameter)?;
abstractGenericsParameters:     '<' abstractGenericsParameterList '>';

eos
    : ';'
    | EOF
    | '\n'
    | '\r' '\n'?
    ;