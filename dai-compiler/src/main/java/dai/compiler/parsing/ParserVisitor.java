package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public class ParserVisitor extends BaseParserVisitor implements
        IdentifierVisitor,
        ClassTypeVisitor,
        StatementVisitor,
        VariateVisitor,
        FunctionVisitor {
    @Override
    public CompilationUnit visitCompilationUnit(CompilationUnitContext ctx) {
        CompilationUnit result = new CompilationUnit();
        this.accept(ctx.packageDeclaration(), this::visitPackageDeclaration, result::setPackage_);
        this.accept(ctx.importDeclaration(), this::visitImportDeclaration, result.getImports()::add);
        this.accept(ctx.body(), this::visitBody, result::setBody);
        return result;
    }

    // statement

    @Override
    public PackageDeclaration visitPackageDeclaration(PackageDeclarationContext ctx) {
        return StatementVisitor.super.visitPackageDeclaration(ctx);
    }

    @Override
    public ImportDeclaration visitImportDeclaration(ImportDeclarationContext ctx) {
        return StatementVisitor.super.visitImportDeclaration(ctx);
    }

    @Override
    public List<Statement> visitBody(BodyContext ctx) {
        return StatementVisitor.super.visitBody(ctx);
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

    /* class type & generics */

    @Override
    public ClassType visitClassType(ClassTypeContext ctx) {
        return ClassTypeVisitor.super.visitClassType(ctx);
    }

    @Override
    public List<ClassType> visitGenericsParameters(GenericsParametersContext ctx) {
        return ClassTypeVisitor.super.visitGenericsParameters(ctx);
    }

    @Override
    public List<ClassType> visitGenericsParameterList(GenericsParameterListContext ctx) {
        return ClassTypeVisitor.super.visitGenericsParameterList(ctx);
    }

    @Override
    public ClassType visitGenericsParameter(GenericsParameterContext ctx) {
        return ClassTypeVisitor.super.visitGenericsParameter(ctx);
    }

    @Override
    public ClassType visitDeclareGenericsParameter(DeclareGenericsParameterContext ctx) {
        return ClassTypeVisitor.super.visitDeclareGenericsParameter(ctx);
    }

    @Override
    public List<ClassType> visitDeclareGenericsParameterList(DeclareGenericsParameterListContext ctx) {
        return ClassTypeVisitor.super.visitDeclareGenericsParameterList(ctx);
    }

    @Override
    public List<ClassType> visitDeclareGenericsParameters(DeclareGenericsParametersContext ctx) {
        return ClassTypeVisitor.super.visitDeclareGenericsParameters(ctx);
    }

    @Override
    public ClassType visitDeclareGenericsParameterExtends(DeclareGenericsParameterExtendsContext ctx) {
        return ClassTypeVisitor.super.visitDeclareGenericsParameterExtends(ctx);
    }

    @Override
    public ClassType visitDeclareGenericsParameterSuper(DeclareGenericsParameterSuperContext ctx) {
        return ClassTypeVisitor.super.visitDeclareGenericsParameterSuper(ctx);
    }

    /* variate */

    @Override
    public VariateDeclaration visitVariateDeclaration(VariateDeclarationContext ctx) {
        return VariateVisitor.super.visitVariateDeclaration(ctx);
    }

    @Override
    public List<VariateDeclarator> visitVariateDeclaratorList(VariateDeclaratorListContext ctx) {
        return VariateVisitor.super.visitVariateDeclaratorList(ctx);
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
    public List<VariateDeclarator> visitFunctionParameters(FunctionParametersContext ctx) {
        return FunctionVisitor.super.visitFunctionParameters(ctx);
    }

    @Override
    public ClassType visitFunctionReturn(FunctionReturnContext ctx) {
        return FunctionVisitor.super.visitFunctionReturn(ctx);
    }

    @Override
    public ReturnStatement visitReturnStatement(ReturnStatementContext ctx) {
        return FunctionVisitor.super.visitReturnStatement(ctx);
    }
}
