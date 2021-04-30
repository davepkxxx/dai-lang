package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.ClassTypeNode;

import java.util.List;

public interface ClassTypeVisitor extends BaseVisitor {

    default ClassTypeNode visitUseType(UseTypeContext ctx) {
        ClassTypeNode result = new ClassTypeNode();
        this.accept(ctx.identifierPath(), this::visitIdentifierPath, result::setName);
        this.accept(ctx.useTypeParamsBlock(), this::visitUseTypeParamsBlock, result::setGenericsParameters);
        return result;
    }

    default List<ClassTypeNode> visitUseTypes(UseTypesContext ctx) {
        return this.map(ctx.useType(), this::visitUseType);
    }

    /* generics */

    default ClassTypeNode visitUseTypeParam(UseTypeParamContext ctx) {
        return this.map(ctx.useType(), this::visitUseType);
    }

    default List<ClassTypeNode> visitUseTypeParams(UseTypeParamsContext ctx) {
        return this.map(ctx.useTypeParam(), this::visitUseTypeParam);
    }

    default List<ClassTypeNode> visitUseTypeParamsBlock(UseTypeParamsBlockContext ctx) {
        return this.map(ctx.useTypeParams(), this::visitUseTypeParams);
    }

    default ClassTypeNode visitDeclTypeParam(DeclTypeParamContext ctx) {
        ClassTypeNode result = new ClassTypeNode();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.declTypeParamExtends(), this::visitDeclTypeParamExtends, result::setSuperType);
        return result;
    }

    default ClassTypeNode visitDeclTypeParamExtends(DeclTypeParamExtendsContext ctx) {
        return this.map(ctx.useType(), this::visitUseType);
    }

    default List<ClassTypeNode> visitDeclTypeParamsBlock(DeclTypeParamsBlockContext ctx) {
        return this.map(ctx.declTypeParams(), this::visitDeclTypeParams);
    }

    default List<ClassTypeNode> visitDeclTypeParams(DeclTypeParamsContext ctx) {
        return this.map(ctx.declTypeParam(), this::visitDeclTypeParam);
    }

    String visitIdentifier(IdentifierContext ctx);

    String visitIdentifierPath(IdentifierPathContext ctx);
}
