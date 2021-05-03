package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public class ParserVisitor extends BaseParserVisitor<Object> implements
        IdentifierVisitor,
        ClassTypeVisitor,
        StatementVisitor,
        ExpressionVisitor,
        LiteralVisitor,
        VariableVisitor,
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
    public VariableDeclaration visitForInitDeclaration(ForInitDeclarationContext ctx) {
        return StatementVisitor.super.visitForInitDeclaration(ctx);
    }

    @Override
    public ForInStatement visitForInStatement(ForInStatementContext ctx) {
        return StatementVisitor.super.visitForInStatement(ctx);
    }

    @Override
    public ContinueStatement visitContinueStatement(ContinueStatementContext ctx) {
        return StatementVisitor.super.visitContinueStatement(ctx);
    }

    @Override
    public BreakStatement visitBreakStatement(BreakStatementContext ctx) {
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

    @Override
    public EmptyStatement visitEmptyStatement(EmptyStatementContext ctx) {
        return StatementVisitor.super.visitEmptyStatement(ctx);
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

    /* variable */

    @Override
    public VariableDeclaration visitVariableDeclaration(VariableDeclarationContext ctx) {
        return VariableVisitor.super.visitVariableDeclaration(ctx);
    }

    @Override
    public List<VariableDeclarator> visitVariableDeclarators(VariableDeclaratorsContext ctx) {
        return VariableVisitor.super.visitVariableDeclarators(ctx);
    }

    @Override
    public VariableDeclarator visitVariableDeclarator(VariableDeclaratorContext ctx) {
        return VariableVisitor.super.visitVariableDeclarator(ctx);
    }

    /* function */

    @Override
    public FunctionDeclaration visitFuncDeclaration(FuncDeclarationContext ctx) {
        return FunctionVisitor.super.visitFuncDeclaration(ctx);
    }

    @Override
    public List<VariableDeclarator> visitFuncParams(FuncParamsContext ctx) {
        return FunctionVisitor.super.visitFuncParams(ctx);
    }

    @Override
    public List<VariableDeclarator> visitFuncParamsBlock(FuncParamsBlockContext ctx) {
        return FunctionVisitor.super.visitFuncParamsBlock(ctx);
    }

    @Override
    public VariableDeclarator visitFuncParam(FuncParamContext ctx) {
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
    public VariableDeclarator visitEnumFieldDeclarator(EnumFieldDeclaratorContext ctx) {
        return EnumVisitor.super.visitEnumFieldDeclarator(ctx);
    }

    @Override
    public List<VariableDeclarator> visitEnumFieldDeclarators(EnumFieldDeclaratorsContext ctx) {
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

    @Override
    public MemberExpression visitMemberExpression(MemberExpressionContext ctx) {
        return ExpressionVisitor.super.visitMemberExpression(ctx);
    }

    @Override
    public ChainExpression visitChainExpression(ChainExpressionContext ctx) {
        return ExpressionVisitor.super.visitChainExpression(ctx);
    }

    @Override
    public NewExpression visitNewExpression(NewExpressionContext ctx) {
        return ExpressionVisitor.super.visitNewExpression(ctx);
    }

    @Override
    public CallExpression visitCallExpression(CallExpressionContext ctx) {
        return ExpressionVisitor.super.visitCallExpression(ctx);
    }

    @Override
    public UnaryExpression visitIncrementalExpression(IncrementalExpressionContext ctx) {
        return ExpressionVisitor.super.visitIncrementalExpression(ctx);
    }

    @Override
    public UnaryExpression visitNotExpression(NotExpressionContext ctx) {
        return ExpressionVisitor.super.visitNotExpression(ctx);
    }

    @Override
    public UnaryExpression visitUnaryExpression(UnaryExpressionContext ctx) {
        return ExpressionVisitor.super.visitUnaryExpression(ctx);
    }

    @Override
    public BinaryExpression visitAdditiveExpression(AdditiveExpressionContext ctx) {
        return ExpressionVisitor.super.visitAdditiveExpression(ctx);
    }

    @Override
    public BinaryExpression visitAndExpression(AndExpressionContext ctx) {
        return ExpressionVisitor.super.visitAndExpression(ctx);
    }

    @Override
    public BinaryExpression visitBitwiseAndExpression(BitwiseAndExpressionContext ctx) {
        return ExpressionVisitor.super.visitBitwiseAndExpression(ctx);
    }

    @Override
    public BinaryExpression visitEqualExpression(EqualExpressionContext ctx) {
        return ExpressionVisitor.super.visitEqualExpression(ctx);
    }

    @Override
    public BinaryExpression visitShiftExpression(ShiftExpressionContext ctx) {
        return ExpressionVisitor.super.visitShiftExpression(ctx);
    }

    @Override
    public BinaryExpression visitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
        return ExpressionVisitor.super.visitMultiplicativeExpression(ctx);
    }

    @Override
    public BinaryExpression visitOrExpression(OrExpressionContext ctx) {
        return ExpressionVisitor.super.visitOrExpression(ctx);
    }

    @Override
    public BinaryExpression visitBitwiseOrExpression(BitwiseOrExpressionContext ctx) {
        return ExpressionVisitor.super.visitBitwiseOrExpression(ctx);
    }

    @Override
    public BinaryExpression visitExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {
        return ExpressionVisitor.super.visitExclusiveOrExpression(ctx);
    }

    @Override
    public BinaryExpression visitRelationalExpression(RelationalExpressionContext ctx) {
        return ExpressionVisitor.super.visitRelationalExpression(ctx);
    }

    @Override
    public ConditionalExpression visitConditionalExpression(ConditionalExpressionContext ctx) {
        return ExpressionVisitor.super.visitConditionalExpression(ctx);
    }

    @Override
    public AssignmentExpression visitAssignExpression(AssignExpressionContext ctx) {
        return ExpressionVisitor.super.visitAssignExpression(ctx);
    }

    @Override
    public LambdaExpression visitLambdaExpression(LambdaExpressionContext ctx) {
        return ExpressionVisitor.super.visitLambdaExpression(ctx);
    }

    @Override
    public Expression visitParenthesizedExpression(ParenthesizedExpressionContext ctx) {
        return ExpressionVisitor.super.visitParenthesizedExpression(ctx);
    }

    /* literal */

    @Override
    public LiteralExpression visitLiteralExpression(LiteralExpressionContext ctx) {
        return LiteralVisitor.super.visitLiteralExpression(ctx);
    }

    @Override
    public IntegerLiteral visitIntLiteral(IntLiteralContext ctx) {
        return LiteralVisitor.super.visitIntLiteral(ctx);
    }

    @Override
    public LongLiteral visitLongLiteral(LongLiteralContext ctx) {
        return LiteralVisitor.super.visitLongLiteral(ctx);
    }

    @Override
    public FloatLiteral visitFloatLiteral(FloatLiteralContext ctx) {
        return LiteralVisitor.super.visitFloatLiteral(ctx);
    }

    @Override
    public DoubleLiteral visitDoubleLiteral(DoubleLiteralContext ctx) {
        return LiteralVisitor.super.visitDoubleLiteral(ctx);
    }

    @Override
    public CharacterLiteral visitCharLiteral(CharLiteralContext ctx) {
        return LiteralVisitor.super.visitCharLiteral(ctx);
    }

    @Override
    public StringLiteral visitStringLiteral(StringLiteralContext ctx) {
        return LiteralVisitor.super.visitStringLiteral(ctx);
    }

    @Override
    public FalseLiteral visitFalseLiteral(FalseLiteralContext ctx) {
        return LiteralVisitor.super.visitFalseLiteral(ctx);
    }

    @Override
    public TrueLiteral visitTrueLiteral(TrueLiteralContext ctx) {
        return LiteralVisitor.super.visitTrueLiteral(ctx);
    }

    @Override
    public NullLiteral visitNullLiteral(NullLiteralContext ctx) {
        return LiteralVisitor.super.visitNullLiteral(ctx);
    }

    @Override
    public ArrayLiteral visitArrayLiteral(ArrayLiteralContext ctx) {
        return LiteralVisitor.super.visitArrayLiteral(ctx);
    }

    @Override
    public ObjectLiteral visitObjectLiteral(ObjectLiteralContext ctx) {
        return LiteralVisitor.super.visitObjectLiteral(ctx);
    }

    @Override
    public ObjectPropertyNode visitObjectProperty(ObjectPropertyContext ctx) {
        return LiteralVisitor.super.visitObjectProperty(ctx);
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
    public VariableDeclarator visitNamedParam(NamedParamContext ctx) {
        return ParameterVisitor.super.visitNamedParam(ctx);
    }

    @Override
    public List<VariableDeclarator> visitNamedParams(NamedParamsContext ctx) {
        return ParameterVisitor.super.visitNamedParams(ctx);
    }

    @Override
    public List<VariableDeclarator> visitNamedParamsBlock(NamedParamsBlockContext ctx) {
        return ParameterVisitor.super.visitNamedParamsBlock(ctx);
    }
}
