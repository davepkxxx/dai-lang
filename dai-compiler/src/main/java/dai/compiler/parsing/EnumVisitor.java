package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface EnumVisitor extends BaseVisitor {
    default EnumDeclaration visitEnumDeclaration(EnumDeclarationContext ctx) {
        EnumDeclaration result = new EnumDeclaration();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.useTypeParam(), this::visitUseTypeParam, result::setGenericsParameter);
        this.accept(ctx.enumFieldDeclarators(), this::visitEnumFieldDeclarators, result::setFields);
        return result;
    }

    default VariateDeclarator visitEnumFieldDeclarator(EnumFieldDeclaratorContext ctx) {
        VariateDeclarator result = new VariateDeclarator();
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.expression(), this::visitExpression, result::setInit);
        return result;
    }

    default List<VariateDeclarator> visitEnumFieldDeclarators(EnumFieldDeclaratorsContext ctx) {
        return this.map(ctx.enumFieldDeclarator(), this::visitEnumFieldDeclarator);
    }

    AnnotatedNode visitAnnotated(AnnotatedContext ctx);

    Expression visitExpression(ExpressionContext ctx);

    String visitIdentifier(IdentifierContext ctx);

    ClassTypeNode visitUseTypeParam(UseTypeParamContext ctx);
}
