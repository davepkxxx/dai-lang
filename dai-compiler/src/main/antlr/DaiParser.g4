parser grammar DaiParser;

options { tokenVocab=DaiLexer; }

compilationUnit:    packageDeclaration? importDeclaration* statement* EOF;
packageDeclaration: annotated* PACKAGE identifierPath eos;
importDeclaration:  IMPORT identifierPath eos;

statement
    : emptyStatement
    | blockStatement
    | variateDeclaration
    | functionDeclaration
    | returnStatement
    | enumDeclaration
    | structDeclaration
    | classDeclaration
    | interfaceDeclaration
    | annotationDeclaration
    | throwStatement
    | tryStatement
    | ifStatement
    | switchStatement
    | whileStatement
    | doWhileStatement
    | forStatement
    | forInStatement
    | continueStatement
    | breakStatement
    | expressionStatement
    ;

body:               '{' statement* '}';
blockStatement:     '{' statement* '}';
emptyStatement:     ';';
continueStatement:  CONTINUE eos;
breakStatement:     BREAK eos;

variateDeclaration: annotated* (VAR | CONST) variateDeclarators eos;
variateDeclarators: variateDeclarator (',' variateDeclarator)*;
variateDeclarator:  identifier (':' useType)? ('=' expression)?;

functionDeclaration:                annotated* FUNC identifier declarationTypeParametersBlock? functionParameterDeclaratorsBlock functionReturn? body;
functionParameterDeclaratorsBlock:  '(' functionParameterDeclarators? ')';
functionParameterDeclarators:       functionParameterDeclarator (',' functionParameterDeclarator);
functionParameterDeclarator:        annotated* variateDeclarator;
functionReturn:             ':' (useType | VOID);
returnStatement:            RETURN expression? eos;

enumDeclaration:        annotated* ENUM identifier ('<' useTypeParameter '>')? '{' enumBody '}';
enumBody:               '{' enumFieldDeclarators '}';
enumFieldDeclarator:    annotated* identifier ('=' expression)?;
enumFieldDeclarators:   enumFieldDeclarator (',' enumFieldDeclarator)* eos;

structDeclaration:  annotated* STRUCT identifier declarationTypeParametersBlock? declareExtends? structBody;
structBody:         '{' variateDeclaration* '}';
declareExtends:     (EXTENDS useType);

classDeclaration:       annotated* CLASS identifier declarationTypeParametersBlock? declareExtends? declareImplements? classBody;
classBody:              '{' classMemberDeclaration* '}';
classMemberDeclaration: variateDeclaration | functionDeclaration | constructorDeclaration;
constructorDeclaration: annotated* CONSTRUCTOR functionParameterDeclaratorsBlock  body;
declareImplements:      IMPLEMENTS useTypes;

interfaceDeclaration:           annotated* INTERFACE identifier declarationTypeParametersBlock? declareExtends? interfaceBody;
interfaceBody:                  '{' interfaceMemberDeclaration* '}';
interfaceMemberDeclaration:     variateDeclaration | functionDeclaration | abstractFunctionDeclaration;
abstractFunctionDeclaration:    annotated* FUNC identifier declarationTypeParametersBlock? functionParameterDeclaratorsBlock functionReturn? eos;

annotationDeclaration:  annotated* ANNOTATION identifier annotationBody;
annotationBody:         '{' variateDeclaration* '}';
annotated:              '@' identifierPath namedParametersBlock?;

throwStatement: THROW expression eos;
tryStatement
    : TRY body finallyBlock
    | TRY body catchBlock+ finallyBlock?
    ;
catchBlock:     CATCH '(' variateDeclarator ')' body;
finallyBlock:   FINALLY body;

ifStatement:    IF condition statement elseBlock?;
elseBlock:      ELSE statement;
condition:      '(' expression ')';

switchStatement: SWITCH condition '{' switchCaseBlock+ '}';
switchCaseBlock: switchCaseLabel+ statement+;
switchCaseLabel: CASE expression ':' | DEFAULT ':';

whileStatement:     WHILE condition statement;
doWhileStatement:   DO statement WHILE condition eos;

forStatement:       FOR '(' forInit? ';' expression? ';' expressions? ')' statement;
forInit:            forInitDeclaration | expressions;
forInitDeclaration: annotated* (VAR | CONST) variateDeclarators;
forInStatement:     FOR '(' identifier (',' identifier)? IN expression ')' statement;

expr
    : '(' expr ')'                                                          # parenthesizedExpression
    | THIS                                                                  # thisExpression
    | SUPER                                                                 # superExpression
    | identifier                                                            # identifierExpression
    | expr '.' (identifier | expr parametersBlock)                          # chainExpression
    | expr '[' expr ']'                                                     # memberExpression
    | expr parametersBlock                                                  # callExpression
    | NEW annotated* useType parametersBlock                                # newExpression
    | expr ('++' | '--')                                                    # incrementalExpression
    | ('+' | '-') expr                                                      # unaryExpression
    | ('~' | '!') expr                                                      # notExpression
    | expr ('*' | '/' | '%') expr                                           # multiplicativeExpression
    | expr ('+' | '-') expr                                                 # additiveExpression
    | expr ('<' '<' | '>' '>') expr                                         # shiftExpression
    | expr ('>' | '<' | '>=' | '<=') expr                                   # relationalExpression
    | expr ('=' | '!=') expr                                                # equalExpression
    | expr '&' expr                                                         # bitwiseAndExpression
    | expr '^' expr                                                         # exclusiveOrExpression
    | expr '|' expr                                                         # bitwiseOrExpression
    | expr '&&' expr                                                        # andExpression
    | expr '||' expr                                                        # orExpression
    | <assoc=right> expr '?' expr ':' expr                                  # conditionalExpression
    | <assoc=right> identifierPath assignOperator expr                      # assignExpression
    | (identifier | functionParameterDeclaratorsBlock) ARROW (expr | body)  # lambdaExpression
    | literal                                                               # literalExpression
    | arrayLiteral                                                          # arrayLiteralExpression
    | objectLiteral                                                         # objectLiteralExpression
    ;

expression:             expr;
expressions:            expression (',' expression)*;
expressionStatement:    expression eos;

parameter:              expression | namedParameter;
parameters:             parameter (',' parameter)*;
parametersBlock:        '(' parameters? ')';
namedParameter:         identifier ('=' expression);
namedParameters:        namedParameter (',' namedParameter)*;
namedParametersBlock:   '(' namedParameters? ')';

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

arrayLiteral:       '[' expressions? ']';
objectLiteral:      '{' objectProperties? '}';
objectProperty:     identifier ':' expression;
objectProperties:   objectProperty (',' objectProperty)?;

identifier:     IDENTIFIER;
identifierPath: identifier ('.' identifier)*;

useType:    identifierPath useTypeParametersBlock?;
useTypes:   useType (',' useType)*;

useTypeParameter:       useType;
useTypeParameters:      useTypeParameter (',' useTypeParameter);
useTypeParametersBlock: '<' useTypeParameters '>';

declarationTypeParameter:           identifier declarationTypeParameterExtends?;
declarationTypeParameters:          declarationTypeParameter (',' declarationTypeParameter)?;
declarationTypeParametersBlock:     '<' declarationTypeParameters '>';
declarationTypeParameterExtends:    EXTENDS useType;

eos: NL+ | NL* SEMI NL* | EOF;