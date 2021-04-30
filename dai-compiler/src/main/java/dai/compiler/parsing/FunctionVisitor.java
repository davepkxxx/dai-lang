package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface FunctionVisitor extends BaseVisitor {

    default FunctionDeclaration visitFunctionDeclaration(FunctionDeclarationContext ctx) {
        FunctionDeclaration result = new FunctionDeclaration();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.declarationTypeParametersBlock(), this::visitDeclarationTypeParametersBlock, result::setGenericsParameters);
        this.accept(ctx.functionParameterDeclaratorsBlock(), this::visitFunctionParameterDeclaratorsBlock, result::setParameters);
        this.accept(ctx.functionReturn(), this::visitFunctionReturn, result::setReturnType);
        this.accept(ctx.body(), this::visitBody, result::setBody);
        return result;
    }

    default List<VariateDeclarator> visitFunctionParameterDeclarators(FunctionParameterDeclaratorsContext ctx) {
        return this.map(ctx.functionParameterDeclarator(), this::visitFunctionParameterDeclarator);
    }

    default List<VariateDeclarator> visitFunctionParameterDeclaratorsBlock(FunctionParameterDeclaratorsBlockContext ctx) {
        return this.map(ctx.functionParameterDeclarators(), this::visitFunctionParameterDeclarators);
    }

    default VariateDeclarator visitFunctionParameterDeclarator(FunctionParameterDeclaratorContext ctx) {
        VariateDeclarator result = this.map(ctx.variateDeclarator(), this::visitVariateDeclarator);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        return result;
    }

    default ClassTypeNode visitFunctionReturn(FunctionReturnContext ctx) {
        return this.map(ctx.useType(), this::visitUseType);
    }

    default ReturnStatement visitReturnStatement(ReturnStatementContext ctx) {
        ReturnStatement result = new ReturnStatement();
        this.accept(ctx.expression(), this::visitExpression, result::setExpression);
        return result;
    }

    AnnotatedNode visitAnnotated(AnnotatedContext ctx);

    Expression visitExpression(ExpressionContext ctx);

    List<Statement> visitBody(BodyContext ctx);

    List<ClassTypeNode> visitDeclarationTypeParametersBlock(DeclarationTypeParametersBlockContext ctx);

    VariateDeclarator visitVariateDeclarator(VariateDeclaratorContext ctx);

    ClassTypeNode visitUseType(UseTypeContext ctx);

    String visitIdentifier(IdentifierContext ctx);
}
