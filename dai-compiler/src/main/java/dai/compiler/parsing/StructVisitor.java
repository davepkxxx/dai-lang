package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.AnnotatedNode;
import dai.compiler.ast.ClassTypeNode;
import dai.compiler.ast.StructDeclaration;
import dai.compiler.ast.VariateDeclaration;

import java.util.List;

public interface StructVisitor extends BaseVisitor {
    default StructDeclaration visitStructDeclaration(StructDeclarationContext ctx) {
        StructDeclaration result = new StructDeclaration();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.declTypeParamsBlock(), this::visitDeclTypeParamsBlock, result::setGenericsParameters);
        this.accept(ctx.extendsBlock(), this::visitExtendsBlock, result::setSuperType);
        this.accept(ctx.variateDeclaration(), this::visitVariateDeclaration, result.getFields()::add);
        return result;
    }

    default ClassTypeNode visitExtendsBlock(ExtendsBlockContext ctx) {
        return this.map(ctx.useType(), this::visitUseType);
    }

    AnnotatedNode visitAnnotated(AnnotatedContext ctx);

    ClassTypeNode visitUseType(UseTypeContext ctx);

    String visitIdentifier(IdentifierContext ctx);

    VariateDeclaration visitVariateDeclaration(VariateDeclarationContext ctx);

    List<ClassTypeNode> visitDeclTypeParamsBlock(DeclTypeParamsBlockContext ctx);
}
