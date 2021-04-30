package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface FunctionVisitor extends BaseVisitor {

    default FunctionDeclaration visitFuncDeclaration(FuncDeclarationContext ctx) {
        FunctionDeclaration result = new FunctionDeclaration();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.declTypeParamsBlock(), this::visitDeclTypeParamsBlock, result::setGenericsParameters);
        this.accept(ctx.funcParamsBlock(), this::visitFuncParamsBlock, result::setParameters);
        this.accept(ctx.funcReturn(), this::visitFuncReturn, result::setReturnType);
        this.accept(ctx.body(), this::visitBody, result::setBody);
        return result;
    }

    default List<VariateDeclarator> visitFuncParams(FuncParamsContext ctx) {
        return this.map(ctx.funcParam(), this::visitFuncParam);
    }

    default List<VariateDeclarator> visitFuncParamsBlock(FuncParamsBlockContext ctx) {
        return this.map(ctx.funcParams(), this::visitFuncParams);
    }

    default VariateDeclarator visitFuncParam(FuncParamContext ctx) {
        VariateDeclarator result = this.map(ctx.variateDeclarator(), this::visitVariateDeclarator);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        return result;
    }

    default ClassTypeNode visitFuncReturn(FuncReturnContext ctx) {
        return this.map(ctx.useType(), this::visitUseType);
    }

    AnnotatedNode visitAnnotated(AnnotatedContext ctx);

    Expression visitExpression(ExpressionContext ctx);

    List<Statement> visitBody(BodyContext ctx);

    List<ClassTypeNode> visitDeclTypeParamsBlock(DeclTypeParamsBlockContext ctx);

    VariateDeclarator visitVariateDeclarator(VariateDeclaratorContext ctx);

    ClassTypeNode visitUseType(UseTypeContext ctx);

    String visitIdentifier(IdentifierContext ctx);
}
