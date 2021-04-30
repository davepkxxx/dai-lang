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
        this.accept(ctx.declarationTypeParametersBlock(), this::visitDeclarationTypeParametersBlock, result::setGenericsParameters);
        this.accept(ctx.declareExtends(), this::visitDeclareExtends, result::setSuperType);
        this.accept(ctx.structBody(), this::visitStructBody, result::setFields);
        return result;
    }

    default List<VariateDeclaration> visitStructBody(StructBodyContext ctx) {
        return this.map(ctx.variateDeclaration(), this::visitVariateDeclaration);
    }

    default ClassTypeNode visitDeclareExtends(DeclareExtendsContext ctx) {
        return this.map(ctx.useType(), this::visitUseType);
    }

    AnnotatedNode visitAnnotated(AnnotatedContext ctx);

    ClassTypeNode visitUseType(UseTypeContext ctx);

    String visitIdentifier(IdentifierContext ctx);

    VariateDeclaration visitVariateDeclaration(VariateDeclarationContext ctx);

    List<ClassTypeNode> visitDeclarationTypeParametersBlock(DeclarationTypeParametersBlockContext ctx);
}
