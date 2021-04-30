package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public class ParserVisitor extends BaseParserVisitor<Object> implements
        IdentifierVisitor,
        ClassTypeVisitor,
        StatementVisitor,
        ExpressionVisitor,
        VariateVisitor,
        FunctionVisitor,
        EnumVisitor,
        StructVisitor,
        ClassVisitor,
        InterfaceVisitor,
        AnnotationVisitor,
        ParameterVisitor {
    @Override
    public CompilationUnit visitCompilationUnit(CompilationUnitContext ctx) {
        CompilationUnit result = new CompilationUnit();
        this.accept(ctx.packageDeclaration(), this::visitPackageDeclaration, result::setPackage_);
        this.accept(ctx.importDeclaration(), this::visitImportDeclaration, result.getImports()::add);
        this.accept(ctx.statement(), this::visitStatement, result.getBody()::add);
        return result;
    }

    @Override
    public List<Statement> visitBody(BodyContext ctx) {
        return this.map(ctx.statement(), child -> {
            Object childResult = child.accept(this);
            return childResult instanceof Statement ? (Statement) childResult : (Statement) null;
        });
    }

    /* statement */

    @Override
    public PackageDeclaration visitPackageDeclaration(PackageDeclarationContext ctx) {
        return StatementVisitor.super.visitPackageDeclaration(ctx);
    }

    @Override
    public ImportDeclaration visitImportDeclaration(ImportDeclarationContext ctx) {
        return StatementVisitor.super.visitImportDeclaration(ctx);
    }

    @Override
    public Statement visitStatement(StatementContext ctx) {
        return StatementVisitor.super.visitStatement(ctx);
    }

    @Override
    public BlockStatement visitBlockStatement(BlockStatementContext ctx) {
        return StatementVisitor.super.visitBlockStatement(ctx);
    }

    @Override
    public ThrowStatement visitThrowStatement(ThrowStatementContext ctx) {
        return StatementVisitor.super.visitThrowStatement(ctx);
    }

    @Override
    public TryStatement visitTryStatement(TryStatementContext ctx) {
        return StatementVisitor.super.visitTryStatement(ctx);
    }

    @Override
    public CatchNode visitCatchBlock(CatchBlockContext ctx) {
        return StatementVisitor.super.visitCatchBlock(ctx);
    }

    @Override
    public IfStatement visitIfStatement(IfStatementContext ctx) {
        return StatementVisitor.super.visitIfStatement(ctx);
    }

    @Override
    public Expression visitCondition(ConditionContext ctx) {
        return StatementVisitor.super.visitCondition(ctx);
    }

    @Override
    public SwitchStatement visitSwitchStatement(SwitchStatementContext ctx) {
        return StatementVisitor.super.visitSwitchStatement(ctx);
    }

    @Override
    public SwitchCaseNode visitSwitchCaseBlock(SwitchCaseBlockContext ctx) {
        return StatementVisitor.super.visitSwitchCaseBlock(ctx);
    }

    @Override
    public SwitchCaseLabel visitSwitchCaseLabel(SwitchCaseLabelContext ctx) {
        return StatementVisitor.super.visitSwitchCaseLabel(ctx);
    }

    @Override
    public WhileStatement visitWhileStatement(WhileStatementContext ctx) {
        return StatementVisitor.super.visitWhileStatement(ctx);
    }

    @Override
    public DoWhileStatement visitDoWhileStatement(DoWhileStatementContext ctx) {
        return StatementVisitor.super.visitDoWhileStatement(ctx);
    }

    @Override
    public ForStatement visitForStatement(ForStatementContext ctx) {
        return StatementVisitor.super.visitForStatement(ctx);
    }

    @Override
    public ForInitNode visitForInit(ForInitContext ctx) {
        return StatementVisitor.super.visitForInit(ctx);
    }

    @Override
    public VariateDeclaration visitForInitDeclaration(ForInitDeclarationContext ctx) {
        return StatementVisitor.super.visitForInitDeclaration(ctx);
    }

    @Override
    public ForInStatement visitForInStatement(ForInStatementContext ctx) {
        return StatementVisitor.super.visitForInStatement(ctx);
    }

    @Override
    public BreakStatement visitContinueStatement(ContinueStatementContext ctx) {
        return StatementVisitor.super.visitContinueStatement(ctx);
    }

    @Override
    public ContinueStatement visitBreakStatement(BreakStatementContext ctx) {
        return StatementVisitor.super.visitBreakStatement(ctx);
    }

    @Override
    public ReturnStatement visitReturnStatement(ReturnStatementContext ctx) {
        return StatementVisitor.super.visitReturnStatement(ctx);
    }

    @Override
    public ExpressionStatement visitExpressionStatement(ExpressionStatementContext ctx) {
        return StatementVisitor.super.visitExpressionStatement(ctx);
    }

    /* identifier */

    @Override
    public String visitIdentifier(IdentifierContext ctx) {
        return IdentifierVisitor.super.visitIdentifier(ctx);
    }

    @Override
    public String visitIdentifierPath(IdentifierPathContext ctx) {
        return IdentifierVisitor.super.visitIdentifierPath(ctx);
    }

    /* class type */

    @Override
    public ClassTypeNode visitUseType(UseTypeContext ctx) {
        return ClassTypeVisitor.super.visitUseType(ctx);
    }

    @Override
    public List<ClassTypeNode> visitUseTypes(UseTypesContext ctx) {
        return ClassTypeVisitor.super.visitUseTypes(ctx);
    }

    /* generics */

    @Override
    public List<ClassTypeNode> visitUseTypeParamsBlock(UseTypeParamsBlockContext ctx) {
        return ClassTypeVisitor.super.visitUseTypeParamsBlock(ctx);
    }

    @Override
    public List<ClassTypeNode> visitUseTypeParams(UseTypeParamsContext ctx) {
        return ClassTypeVisitor.super.visitUseTypeParams(ctx);
    }

    @Override
    public ClassTypeNode visitUseTypeParam(UseTypeParamContext ctx) {
        return ClassTypeVisitor.super.visitUseTypeParam(ctx);
    }

    @Override
    public ClassTypeNode visitDeclTypeParam(DeclTypeParamContext ctx) {
        return ClassTypeVisitor.super.visitDeclTypeParam(ctx);
    }

    @Override
    public List<ClassTypeNode> visitDeclTypeParams(DeclTypeParamsContext ctx) {
        return ClassTypeVisitor.super.visitDeclTypeParams(ctx);
    }

    @Override
    public List<ClassTypeNode> visitDeclTypeParamsBlock(DeclTypeParamsBlockContext ctx) {
        return ClassTypeVisitor.super.visitDeclTypeParamsBlock(ctx);
    }

    @Override
    public ClassTypeNode visitDeclTypeParamExtends(DeclTypeParamExtendsContext ctx) {
        return ClassTypeVisitor.super.visitDeclTypeParamExtends(ctx);
    }

    /* variate */

    @Override
    public VariateDeclaration visitVariateDeclaration(VariateDeclarationContext ctx) {
        return VariateVisitor.super.visitVariateDeclaration(ctx);
    }

    @Override
    public List<VariateDeclarator> visitVariateDeclarators(VariateDeclaratorsContext ctx) {
        return VariateVisitor.super.visitVariateDeclarators(ctx);
    }

    @Override
    public VariateDeclarator visitVariateDeclarator(VariateDeclaratorContext ctx) {
        return VariateVisitor.super.visitVariateDeclarator(ctx);
    }

    /* function */

    @Override
    public FunctionDeclaration visitFuncDeclaration(FuncDeclarationContext ctx) {
        return FunctionVisitor.super.visitFuncDeclaration(ctx);
    }

    @Override
    public List<VariateDeclarator> visitFuncParams(FuncParamsContext ctx) {
        return FunctionVisitor.super.visitFuncParams(ctx);
    }

    @Override
    public List<VariateDeclarator> visitFuncParamsBlock(FuncParamsBlockContext ctx) {
        return FunctionVisitor.super.visitFuncParamsBlock(ctx);
    }

    @Override
    public VariateDeclarator visitFuncParam(FuncParamContext ctx) {
        return FunctionVisitor.super.visitFuncParam(ctx);
    }

    @Override
    public ClassTypeNode visitFuncReturn(FuncReturnContext ctx) {
        return FunctionVisitor.super.visitFuncReturn(ctx);
    }

    /* enum */

    @Override
    public EnumDeclaration visitEnumDeclaration(EnumDeclarationContext ctx) {
        return EnumVisitor.super.visitEnumDeclaration(ctx);
    }

    @Override
    public VariateDeclarator visitEnumFieldDeclarator(EnumFieldDeclaratorContext ctx) {
        return EnumVisitor.super.visitEnumFieldDeclarator(ctx);
    }

    @Override
    public List<VariateDeclarator> visitEnumFieldDeclarators(EnumFieldDeclaratorsContext ctx) {
        return EnumVisitor.super.visitEnumFieldDeclarators(ctx);
    }

    /* struct */

    @Override
    public StructDeclaration visitStructDeclaration(StructDeclarationContext ctx) {
        return StructVisitor.super.visitStructDeclaration(ctx);
    }

    @Override
    public ClassTypeNode visitExtendsBlock(ExtendsBlockContext ctx) {
        return StructVisitor.super.visitExtendsBlock(ctx);
    }

    /* class */

    @Override
    public ClassDeclaration visitClassDeclaration(ClassDeclarationContext ctx) {
        return ClassVisitor.super.visitClassDeclaration(ctx);
    }

    @Override
    public Statement visitClassMemberDeclaration(ClassMemberDeclarationContext ctx) {
        return ClassVisitor.super.visitClassMemberDeclaration(ctx);
    }

    @Override
    public ConstructorDeclaration visitConstructorDeclaration(ConstructorDeclarationContext ctx) {
        return ClassVisitor.super.visitConstructorDeclaration(ctx);
    }

    /* interface */

    @Override
    public InterfaceDeclaration visitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
        return InterfaceVisitor.super.visitInterfaceDeclaration(ctx);
    }

    @Override
    public Statement visitInterfaceMemberDeclaration(InterfaceMemberDeclarationContext ctx) {
        return InterfaceVisitor.super.visitInterfaceMemberDeclaration(ctx);
    }

    @Override
    public AbstractFunctionDeclaration visitAbstractFuncDeclaration(AbstractFuncDeclarationContext ctx) {
        return InterfaceVisitor.super.visitAbstractFuncDeclaration(ctx);
    }

    /* annotation */

    @Override
    public AnnotationDeclaration visitAnnotationDeclaration(AnnotationDeclarationContext ctx) {
        return AnnotationVisitor.super.visitAnnotationDeclaration(ctx);
    }

    @Override
    public AnnotatedNode visitAnnotated(AnnotatedContext ctx) {
        return AnnotationVisitor.super.visitAnnotated(ctx);
    }

    /* expression */

    @Override
    public Expression visitExpression(ExpressionContext ctx) {
        return ExpressionVisitor.super.visitExpression(ctx);
    }

    @Override
    public List<Expression> visitExpressions(ExpressionsContext ctx) {
        return ExpressionVisitor.super.visitExpressions(ctx);
    }

    @Override
    public SuperExpression visitSuperExpression(SuperExpressionContext ctx) {
        return ExpressionVisitor.super.visitSuperExpression(ctx);
    }

    @Override
    public ThisExpression visitThisExpression(ThisExpressionContext ctx) {
        return ExpressionVisitor.super.visitThisExpression(ctx);
    }

    @Override
    public IdentifierExpression visitIdentifierExpression(IdentifierExpressionContext ctx) {
        return ExpressionVisitor.super.visitIdentifierExpression(ctx);
    }

    /* parameter */

    @Override
    public ParameterNode visitParam(ParamContext ctx) {
        return ParameterVisitor.super.visitParam(ctx);
    }

    @Override
    public List<ParameterNode> visitParams(ParamsContext ctx) {
        return ParameterVisitor.super.visitParams(ctx);
    }

    @Override
    public List<ParameterNode> visitParamsBlock(ParamsBlockContext ctx) {
        return ParameterVisitor.super.visitParamsBlock(ctx);
    }

    @Override
    public VariateDeclarator visitNamedParam(NamedParamContext ctx) {
        return ParameterVisitor.super.visitNamedParam(ctx);
    }

    @Override
    public List<VariateDeclarator> visitNamedParams(NamedParamsContext ctx) {
        return ParameterVisitor.super.visitNamedParams(ctx);
    }

    @Override
    public List<VariateDeclarator> visitNamedParamsBlock(NamedParamsBlockContext ctx) {
        return ParameterVisitor.super.visitNamedParamsBlock(ctx);
    }
}
