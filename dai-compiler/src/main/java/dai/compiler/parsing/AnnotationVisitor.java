package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface AnnotationVisitor extends BaseVisitor {
    default AnnotationDeclaration visitAnnotationDeclaration(AnnotationDeclarationContext ctx) {
        AnnotationDeclaration result = new AnnotationDeclaration();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.annotationBody(), this::visitAnnotationBody, result::setFields);
        return result;
    }

    default List<VariateDeclaration> visitAnnotationBody(AnnotationBodyContext ctx) {
        return this.map(ctx.variateDeclaration(), this::visitVariateDeclaration);
    }

    default AnnotatedNode visitAnnotated(AnnotatedContext ctx) {
        AnnotatedNode result = new AnnotatedNode();
        this.accept(ctx.identifierPath(), this::visitIdentifierPath, result::setName);
        this.accept(ctx.namedParametersBlock(), this::visitNamedParametersBlock, result::setParameters);
        return result;
    }

    String visitIdentifier(IdentifierContext ctx);

    String visitIdentifierPath(IdentifierPathContext ctx);

    VariateDeclaration visitVariateDeclaration(VariateDeclarationContext ctx);

    List<VariateDeclarator> visitNamedParametersBlock(NamedParametersBlockContext ctx);
}
