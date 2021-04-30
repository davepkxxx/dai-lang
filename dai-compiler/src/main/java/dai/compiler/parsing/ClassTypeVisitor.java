package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.ClassTypeNode;

import java.util.List;

public interface ClassTypeVisitor extends BaseVisitor {

    default ClassTypeNode visitUseType(UseTypeContext ctx) {
        ClassTypeNode result = new ClassTypeNode();
        this.accept(ctx.identifierPath(), this::visitIdentifierPath, result::setName);
        this.accept(ctx.useTypeParametersBlock(), this::visitUseTypeParametersBlock, result::setGenericsParameters);
        return result;
    }

    default List<ClassTypeNode> visitUseTypes(UseTypesContext ctx) {
        return this.map(ctx.useType(), this::visitUseType);
    }

    /* generics */

    default ClassTypeNode visitUseTypeParameter(UseTypeParameterContext ctx) {
        return this.map(ctx.useType(), this::visitUseType);
    }

    default List<ClassTypeNode> visitUseTypeParameters(UseTypeParametersContext ctx) {
        return this.map(ctx.useTypeParameter(), this::visitUseTypeParameter);
    }

    default List<ClassTypeNode> visitUseTypeParametersBlock(UseTypeParametersBlockContext ctx) {
        return this.map(ctx.useTypeParameters(), this::visitUseTypeParameters);
    }

    default ClassTypeNode visitDeclarationTypeParameter(DeclarationTypeParameterContext ctx) {
        ClassTypeNode result = new ClassTypeNode();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.declarationTypeParameterExtends(), this::visitDeclarationTypeParameterExtends, result::setSuperType);
        return result;
    }

    default ClassTypeNode visitDeclarationTypeParameterExtends(DeclarationTypeParameterExtendsContext ctx) {
        return this.map(ctx.useType(), this::visitUseType);
    }

    default List<ClassTypeNode> visitDeclarationTypeParametersBlock(DeclarationTypeParametersBlockContext ctx) {
        return this.map(ctx.declarationTypeParameters(), this::visitDeclarationTypeParameters);
    }

    default List<ClassTypeNode> visitDeclarationTypeParameters(DeclarationTypeParametersContext ctx) {
        return this.map(ctx.declarationTypeParameter(), this::visitDeclarationTypeParameter);
    }

    String visitIdentifier(IdentifierContext ctx);

    String visitIdentifierPath(IdentifierPathContext ctx);
}
