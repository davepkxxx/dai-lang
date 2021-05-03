parser grammar DaiParser;

options { tokenVocab=DaiLexer; }

compilationUnit:    packageDeclaration? importDeclaration* statement* EOF;
packageDeclaration: annotated* PACKAGE identifierPath eos;
importDeclaration:  IMPORT identifierPath eos;

statement
    : stmt
    | variableDeclaration
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
catchBlock:         CATCH '(' variableDeclarator ')' body;
condition:          '(' expression ')';
switchCaseBlock:    switchCaseLabel+ statement+;
switchCaseLabel:    CASE expression ':' | DEFAULT ':';
forInit:            forInitDeclaration | expressions;
forInitDeclaration: annotated* (VAR | CONST) variableDeclarators;

variableDeclaration: annotated* (VAR | CONST) variableDeclarators eos;
variableDeclarators: variableDeclarator (',' variableDeclarator)*;
variableDeclarator:  identifier (':' useType)? ('=' expression)?;

funcDeclaration:  annotated* FUNC identifier declTypeParamsBlock? funcParamsBlock funcReturn? body;
funcParamsBlock:  '(' funcParams? ')';
funcParams:       funcParam (',' funcParam);
funcParam:        annotated* variableDeclarator;
funcReturn:       ':' (useType | VOID);

enumDeclaration:        annotated* ENUM identifier ('<' useTypeParam '>')? '{' enumFieldDeclarators '}';
enumFieldDeclarator:    annotated* identifier ('=' expression)?;
enumFieldDeclarators:   enumFieldDeclarator (',' enumFieldDeclarator)* eos;

structDeclaration:
    annotated*
    STRUCT identifier declTypeParamsBlock?
    extendsBlock?
    '{' variableDeclaration* '}';
extendsBlock:     (EXTENDS useType);

classDeclaration:       
    annotated* 
    CLASS identifier declTypeParamsBlock? 
    extendsBlock? 
    (IMPLEMENTS implTypes=useTypes)? 
    '{' classMemberDeclaration* '}';
classMemberDeclaration: variableDeclaration | funcDeclaration | constructorDeclaration;
constructorDeclaration: annotated* CONSTRUCTOR funcParamsBlock body;

interfaceDeclaration:
    annotated*
    INTERFACE identifier declTypeParamsBlock?
    extendsBlock?
    '{' interfaceMemberDeclaration* '}';
interfaceMemberDeclaration: variableDeclaration | funcDeclaration | abstractFuncDeclaration;
abstractFuncDeclaration:    annotated* FUNC identifier declTypeParamsBlock? funcParamsBlock funcReturn? eos;

annotationDeclaration:  annotated* ANNOTATION identifier '{' variableDeclaration* '}';
annotated:              '@' identifierPath namedParamsBlock?;

expression
    : '(' expression ')'                                                                #parenthesizedExpression
    | THIS                                                                              #thisExpression
    | SUPER                                                                             #superExpression
    | identifier                                                                        #identifierExpression
    | expression '?'? '.' identifier                                                    #chainExpression
    | object=expression '[' property=expression ']'                                     #memberExpression
    | expression paramsBlock                                                            #callExpression
    | NEW annotated* useType paramsBlock                                                #newExpression
    | expression oper=('++' | '--')                                                     #incrementalExpression
    | oper=('+' | '-') expression                                                       #unaryExpression
    | oper=('~' | '!') expression                                                       #notExpression
    | left=expression oper=('*' | '/' | '%') right=expression                           #multiplicativeExpression
    | left=expression oper=('+' | '-') right=expression                                 #additiveExpression
    | left=expression ( leftOper='<' '<' | rightOper='>' '>') right=expression          #shiftExpression
    | left=expression oper=('>' | '<' | '>=' | '<=') right=expression                   #relationalExpression
    | left=expression oper=('==' | '!=') right=expression                               #equalExpression
    | left=expression oper='&' right=expression                                         #bitwiseAndExpression
    | left=expression oper='^' right=expression                                         #exclusiveOrExpression
    | left=expression oper='|' right=expression                                         #bitwiseOrExpression
    | left=expression oper='&&' right=expression                                        #andExpression
    | left=expression oper='||' right=expression                                        #orExpression
    | <assoc=right> test=expression '?' consequent=expression ':' alternate=expression  #conditionalExpression
    | <assoc=right> left=expression oper=
        ( '='
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
        ) right=expression                                                              #assignExpression
    | (identifier | funcParamsBlock) ARROW (expression | body)                          #lambdaExpression
    | literal                                                                           #literalExpression
    ;

expressions:    expression (',' expression)*;

param:              expression | namedParam;
params:             param (',' param)*;
paramsBlock:        '(' params? ')';
namedParam:         identifier ('=' expression);
namedParams:        namedParam (',' namedParam)*;
namedParamsBlock:   '(' namedParams? ')';

literal
    : INT_LITERAL               #intLiteral
    | LONG_LITERAL              #longLiteral
    | FLOAT_LITERAL             #floatLiteral
    | DOUBLE_LITERAL            #doubleLiteral
    | CHAR_LITERAL              #charLiteral
    | STRING_LITERAL            #stringLiteral
    | TRUE                      #trueLiteral
    | FALSE                     #falseLiteral
    | NULL                      #nullLiteral
    | '[' expressions? ']'      #arrayLiteral
    | '{' objectProperty* '}'   #objectLiteral
    ;
objectProperty:     identifier ':' expression;

identifier:     IDENTIFIER;
identifierPath: identifier ('.' identifier)*;

useType:    identifierPath useTypeParamsBlock?;
useTypes:   useType (',' useType)*;

useTypeParam:       useType;
useTypeParams:      useTypeParam (',' useTypeParam);
useTypeParamsBlock: '<' useTypeParams '>';

declTypeParam:           identifier (EXTENDS useType)?;
declTypeParams:          declTypeParam (',' declTypeParam)?;
declTypeParamsBlock:     '<' declTypeParams '>';

eos: NL+ | NL* SEMI NL* | EOF;