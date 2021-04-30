parser grammar DaiParser;

options { tokenVocab=DaiLexer; }

compilationUnit:    packageDeclaration? importDeclaration* statement* EOF;
packageDeclaration: annotated* PACKAGE identifierPath eos;
importDeclaration:  IMPORT identifierPath eos;

statement
    : stmt
    | variateDeclaration
    | funcDeclaration
    | enumDeclaration
    | structDeclaration
    | classDeclaration
    | interfaceDeclaration
    | annotationDeclaration
    ;

stmt
    : body                                                                              #blockStatement
    | CONTINUE eos                                                                      #continueStatement
    | BREAK eos                                                                         #breakStatement
    | RETURN expression? eos                                                            #returnStatement
    | THROW expression eos                                                              #throwStatement
    | TRY body catchBlock* (finallyBody=body)?                                          #tryStatement
    | IF condition statement (ELSE elseStatement=statement)?                            #ifStatement
    | SWITCH condition '{' switchCaseBlock+ '}'                                         #switchStatement
    | WHILE condition statement                                                         #whileStatement
    | DO statement WHILE condition eos                                                  #doWhileStatement
    | FOR '(' forInit? ';' expression? ';' expressions? ')' statement                   #forStatement
    | FOR '(' element=identifier (',' index=identifier)? IN expression ')' statement    #forInStatement
    | expression eos                                                                    #expressionStatement
    | ';'                                                                               #emptyStatement
    ;

body:               '{' statement* '}';
catchBlock:         CATCH '(' variateDeclarator ')' body;
condition:          '(' expression ')';
switchCaseBlock:    switchCaseLabel+ statement+;
switchCaseLabel:    CASE expression ':' | DEFAULT ':';
forInit:            forInitDeclaration | expressions;
forInitDeclaration: annotated* (VAR | CONST) variateDeclarators;

variateDeclaration: annotated* (VAR | CONST) variateDeclarators eos;
variateDeclarators: variateDeclarator (',' variateDeclarator)*;
variateDeclarator:  identifier (':' useType)? ('=' expression)?;

funcDeclaration:  annotated* FUNC identifier declTypeParamsBlock? funcParamsBlock funcReturn? body;
funcParamsBlock:  '(' funcParams? ')';
funcParams:       funcParam (',' funcParam);
funcParam:        annotated* variateDeclarator;
funcReturn:       ':' (useType | VOID);

enumDeclaration:        annotated* ENUM identifier ('<' useTypeParam '>')? '{' enumFieldDeclarators '}';
enumFieldDeclarator:    annotated* identifier ('=' expression)?;
enumFieldDeclarators:   enumFieldDeclarator (',' enumFieldDeclarator)* eos;

structDeclaration:
    annotated*
    STRUCT identifier declTypeParamsBlock?
    extendsBlock?
    '{' variateDeclaration* '}';
extendsBlock:     (EXTENDS useType);

classDeclaration:       
    annotated* 
    CLASS identifier declTypeParamsBlock? 
    extendsBlock? 
    (IMPLEMENTS implTypes=useTypes)? 
    '{' classMemberDeclaration* '}';
classMemberDeclaration: variateDeclaration | funcDeclaration | constructorDeclaration;
constructorDeclaration: annotated* CONSTRUCTOR funcParamsBlock body;

interfaceDeclaration:
    annotated*
    INTERFACE identifier declTypeParamsBlock?
    extendsBlock?
    '{' interfaceMemberDeclaration* '}';
interfaceMemberDeclaration: variateDeclaration | funcDeclaration | abstractFuncDeclaration;
abstractFuncDeclaration:    annotated* FUNC identifier declTypeParamsBlock? funcParamsBlock funcReturn? eos;

annotationDeclaration:  annotated* ANNOTATION identifier '{' variateDeclaration* '}';
annotated:              '@' identifierPath namedParamsBlock?;

expr
    : '(' expr ')'                                                              #parenthesizedExpression
    | THIS                                                                      #thisExpression
    | SUPER                                                                     #superExpression
    | identifier                                                                #identifierExpression
    | expr '.' identifier                                                       #chainExpression
    | object=expr '[' property=expr ']'                                         #memberExpression
    | expr paramsBlock                                                          #callExpression
    | NEW annotated* useType paramsBlock                                        #newExpression
    | expr oper=('++' | '--')                                                   #incrementalExpression
    | oper=('+' | '-') expr                                                     #unaryExpression
    | oper=('~' | '!') expr                                                     #notExpression
    | left=expr oper=('*' | '/' | '%') right=expr                               #multiplicativeExpression
    | left=expr oper=('+' | '-') right=expr                                     #additiveExpression
    | left=expr ( leftShiftOper='<' '<' | rightShiftOper='>' '>') right=expr    #shiftExpression
    | left=expr oper=('>' | '<' | '>=' | '<=') right=expr                       #relationalExpression
    | left=expr oper=('=' | '!=') right=expr                                    #equalExpression
    | left=expr oper='&' right=expr                                             #bitwiseAndExpression
    | left=expr oper='^' right=expr                                             #exclusiveOrExpression
    | left=expr oper='|' right=expr                                             #bitwiseOrExpression
    | left=expr oper='&&' right=expr                                            #andExpression
    | left=expr oper='||' right=expr                                            #orExpression
    | <assoc=right> test=expr '?' consequent=expr ':' alternate=expr            #conditionalExpression
    | <assoc=right> identifierPath assignOperator expr                          #assignExpression
    | (identifier | funcParamsBlock) ARROW (expr | body)                        #lambdaExpression
    | literal                                                                   #literalExpression
    | arrayLiteral                                                              #arrayLiteralExpression
    | objectLiteral                                                             #objectLiteralExpression
    ;

expression:     expr;
expressions:    expression (',' expression)*;

param:              expression | namedParam;
params:             param (',' param)*;
paramsBlock:        '(' params? ')';
namedParam:         identifier ('=' expression);
namedParams:        namedParam (',' namedParam)*;
namedParamsBlock:   '(' namedParams? ')';

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
    : INTEGER_LITERAL   #integerLiteral
    | LONG_LITERAL      #longLiteral
    | FLOAT_LITERAL     #floatLiteral
    | DOUBLE_LITERAL    #doubleLiteral
    | CHARACTER_LITERAL #characterLiteral
    | STRING_LITERAL    #stringLiteral
    | BOOLEAN_LITERAL   #booleanLiteral
    | NULL_LITERAL      #nullLiteral
    ;

arrayLiteral:       '[' expressions? ']';
objectLiteral:      '{' objectProperty* '}';
objectProperty:     identifier ':' expression;

identifier:     IDENTIFIER;
identifierPath: identifier ('.' identifier)*;

useType:    identifierPath useTypeParamsBlock?;
useTypes:   useType (',' useType)*;

useTypeParam:       useType;
useTypeParams:      useTypeParam (',' useTypeParam);
useTypeParamsBlock: '<' useTypeParams '>';

declTypeParam:           identifier declTypeParamExtends?;
declTypeParams:          declTypeParam (',' declTypeParam)?;
declTypeParamsBlock:     '<' declTypeParams '>';
declTypeParamExtends:    EXTENDS useType;

eos: NL+ | NL* SEMI NL* | EOF;