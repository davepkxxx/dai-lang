package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface AnnotationVisitor extends BaseVisitor {
    default AnnotationDeclaration visitAnnotationDeclaration(AnnotationDeclarationContext ctx) {
        AnnotationDeclaration result = new AnnotationDeclaration();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.variableDeclaration(), this::visitVariableDeclaration, result.getFields()::add);
        return result;
    }

    default AnnotatedNode visitAnnotated(AnnotatedContext ctx) {
        AnnotatedNode result = new AnnotatedNode();
        this.accept(ctx.identifierPath(), this::visitIdentifierPath, result::setName);
        this.accept(ctx.namedParamsBlock(), this::visitNamedParamsBlock, result::setParameters);
        return result;
    }

    String visitIdentifier(IdentifierContext ctx);

    String visitIdentifierPath(IdentifierPathContext ctx);

    VariableDeclaration visitVariableDeclaration(VariableDeclarationContext ctx);

    List<VariableDeclarator> visitNamedParamsBlock(NamedParamsBlockContext ctx);
}
