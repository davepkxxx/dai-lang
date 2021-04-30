package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface VariateVisitor extends BaseVisitor {

    default VariateDeclaration visitVariateDeclaration(VariateDeclarationContext ctx) {
        VariateDeclaration result = new VariateDeclaration();
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        if (ctx.VAR() != null) result.setVariateKind(VariateDeclaration.VAR);
        if (ctx.CONST() != null) result.setVariateKind(VariateDeclaration.CONST);
        this.accept(ctx.variateDeclarators(), this::visitVariateDeclarators, result::setDeclarators);
        return result;
    }

    default List<VariateDeclarator> visitVariateDeclarators(VariateDeclaratorsContext ctx) {
        return map(ctx.variateDeclarator(), this::visitVariateDeclarator);
    }

    default VariateDeclarator visitVariateDeclarator(VariateDeclaratorContext ctx) {
        VariateDeclarator result = new VariateDeclarator();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.useType(), this::visitUseType, result::setType);
        this.accept(ctx.expression(), this::visitExpression, result::setInit);
        return result;
    }

    AnnotatedNode visitAnnotated(AnnotatedContext ctx);

    Expression visitExpression(ExpressionContext ctx);

    String visitIdentifier(IdentifierContext ctx);

    ClassTypeNode visitUseType(UseTypeContext ctx);
}
