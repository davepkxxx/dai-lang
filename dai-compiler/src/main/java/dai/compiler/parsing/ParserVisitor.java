package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public class ParserVisitor extends BaseParserVisitor implements
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
    public List<Statement> visitFinallyBlock(FinallyBlockContext ctx) {
        return StatementVisitor.super.visitFinallyBlock(ctx);
    }

    @Override
    public IfStatement visitIfStatement(IfStatementContext ctx) {
        return StatementVisitor.super.visitIfStatement(ctx);
    }

    @Override
    public Statement visitElseBlock(ElseBlockContext ctx) {
        return StatementVisitor.super.visitElseBlock(ctx);
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
    public List<ClassTypeNode> visitUseTypeParametersBlock(UseTypeParametersBlockContext ctx) {
        return ClassTypeVisitor.super.visitUseTypeParametersBlock(ctx);
    }

    @Override
    public List<ClassTypeNode> visitUseTypeParameters(UseTypeParametersContext ctx) {
        return ClassTypeVisitor.super.visitUseTypeParameters(ctx);
    }

    @Override
    public ClassTypeNode visitUseTypeParameter(UseTypeParameterContext ctx) {
        return ClassTypeVisitor.super.visitUseTypeParameter(ctx);
    }

    @Override
    public ClassTypeNode visitDeclarationTypeParameter(DeclarationTypeParameterContext ctx) {
        return ClassTypeVisitor.super.visitDeclarationTypeParameter(ctx);
    }

    @Override
    public List<ClassTypeNode> visitDeclarationTypeParameters(DeclarationTypeParametersContext ctx) {
        return ClassTypeVisitor.super.visitDeclarationTypeParameters(ctx);
    }

    @Override
    public List<ClassTypeNode> visitDeclarationTypeParametersBlock(DeclarationTypeParametersBlockContext ctx) {
        return ClassTypeVisitor.super.visitDeclarationTypeParametersBlock(ctx);
    }

    @Override
    public ClassTypeNode visitDeclarationTypeParameterExtends(DeclarationTypeParameterExtendsContext ctx) {
        return ClassTypeVisitor.super.visitDeclarationTypeParameterExtends(ctx);
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
    public FunctionDeclaration visitFunctionDeclaration(FunctionDeclarationContext ctx) {
        return FunctionVisitor.super.visitFunctionDeclaration(ctx);
    }

    @Override
    public List<VariateDeclarator> visitFunctionParameterDeclarators(FunctionParameterDeclaratorsContext ctx) {
        return FunctionVisitor.super.visitFunctionParameterDeclarators(ctx);
    }

    @Override
    public List<VariateDeclarator> visitFunctionParameterDeclaratorsBlock(FunctionParameterDeclaratorsBlockContext ctx) {
        return FunctionVisitor.super.visitFunctionParameterDeclaratorsBlock(ctx);
    }

    @Override
    public VariateDeclarator visitFunctionParameterDeclarator(FunctionParameterDeclaratorContext ctx) {
        return FunctionVisitor.super.visitFunctionParameterDeclarator(ctx);
    }

    @Override
    public ClassTypeNode visitFunctionReturn(FunctionReturnContext ctx) {
        return FunctionVisitor.super.visitFunctionReturn(ctx);
    }

    @Override
    public ReturnStatement visitReturnStatement(ReturnStatementContext ctx) {
        return FunctionVisitor.super.visitReturnStatement(ctx);
    }

    /* enum */

    @Override
    public EnumDeclaration visitEnumDeclaration(EnumDeclarationContext ctx) {
        return EnumVisitor.super.visitEnumDeclaration(ctx);
    }

    @Override
    public List<VariateDeclarator> visitEnumBody(EnumBodyContext ctx) {
        return EnumVisitor.super.visitEnumBody(ctx);
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
    public List<VariateDeclaration> visitStructBody(StructBodyContext ctx) {
        return StructVisitor.super.visitStructBody(ctx);
    }

    @Override
    public ClassTypeNode visitDeclareExtends(DeclareExtendsContext ctx) {
        return StructVisitor.super.visitDeclareExtends(ctx);
    }

    /* class */

    @Override
    public ClassDeclaration visitClassDeclaration(ClassDeclarationContext ctx) {
        return ClassVisitor.super.visitClassDeclaration(ctx);
    }

    @Override
    public List<Statement> visitClassBody(ClassBodyContext ctx) {
        return ClassVisitor.super.visitClassBody(ctx);
    }

    @Override
    public Statement visitClassMemberDeclaration(ClassMemberDeclarationContext ctx) {
        return ClassVisitor.super.visitClassMemberDeclaration(ctx);
    }

    @Override
    public ConstructorDeclaration visitConstructorDeclaration(ConstructorDeclarationContext ctx) {
        return ClassVisitor.super.visitConstructorDeclaration(ctx);
    }

    @Override
    public List<ClassTypeNode> visitDeclareImplements(DeclareImplementsContext ctx) {
        return ClassVisitor.super.visitDeclareImplements(ctx);
    }

    /* interface */

    @Override
    public InterfaceDeclaration visitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
        return InterfaceVisitor.super.visitInterfaceDeclaration(ctx);
    }

    @Override
    public List<Statement> visitInterfaceBody(InterfaceBodyContext ctx) {
        return InterfaceVisitor.super.visitInterfaceBody(ctx);
    }

    @Override
    public Statement visitInterfaceMemberDeclaration(InterfaceMemberDeclarationContext ctx) {
        return InterfaceVisitor.super.visitInterfaceMemberDeclaration(ctx);
    }

    @Override
    public AbstractFunctionDeclaration visitAbstractFunctionDeclaration(AbstractFunctionDeclarationContext ctx) {
        return InterfaceVisitor.super.visitAbstractFunctionDeclaration(ctx);
    }

    /* annotation */

    @Override
    public AnnotationDeclaration visitAnnotationDeclaration(AnnotationDeclarationContext ctx) {
        return AnnotationVisitor.super.visitAnnotationDeclaration(ctx);
    }

    @Override
    public List<VariateDeclaration> visitAnnotationBody(AnnotationBodyContext ctx) {
        return AnnotationVisitor.super.visitAnnotationBody(ctx);
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

    /* parameter */

    @Override
    public ParameterNode visitParameter(ParameterContext ctx) {
        return ParameterVisitor.super.visitParameter(ctx);
    }

    @Override
    public List<ParameterNode> visitParameters(ParametersContext ctx) {
        return ParameterVisitor.super.visitParameters(ctx);
    }

    @Override
    public List<ParameterNode> visitParametersBlock(ParametersBlockContext ctx) {
        return ParameterVisitor.super.visitParametersBlock(ctx);
    }

    @Override
    public VariateDeclarator visitNamedParameter(NamedParameterContext ctx) {
        return ParameterVisitor.super.visitNamedParameter(ctx);
    }

    @Override
    public List<VariateDeclarator> visitNamedParameters(NamedParametersContext ctx) {
        return ParameterVisitor.super.visitNamedParameters(ctx);
    }

    @Override
    public List<VariateDeclarator> visitNamedParametersBlock(NamedParametersBlockContext ctx) {
        return ParameterVisitor.super.visitNamedParametersBlock(ctx);
    }
}
