package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;
import dai.compiler.ast.VariableDeclaration.VariableKind;

import java.util.List;

public interface VariableVisitor extends BaseVisitor {

    default VariableDeclaration visitVariableDeclaration(VariableDeclarationContext ctx) {
        VariableDeclaration result = new VariableDeclaration();
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        if (ctx.VAR() != null) result.setVariableKind(VariableKind.VAR);
        if (ctx.CONST() != null) result.setVariableKind(VariableKind.CONST);
        this.accept(ctx.variableDeclarators(), this::visitVariableDeclarators, result::setDeclarators);
        return result;
    }

    default List<VariableDeclarator> visitVariableDeclarators(VariableDeclaratorsContext ctx) {
        return map(ctx.variableDeclarator(), this::visitVariableDeclarator);
    }

    default VariableDeclarator visitVariableDeclarator(VariableDeclaratorContext ctx) {
        VariableDeclarator result = new VariableDeclarator();
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
