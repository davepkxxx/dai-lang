package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface InterfaceVisitor extends BaseVisitor {
    default InterfaceDeclaration visitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
        InterfaceDeclaration result = new InterfaceDeclaration();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.declarationTypeParametersBlock(), this::visitDeclarationTypeParametersBlock, result::setGenericsParameters);
        this.accept(ctx.declareExtends(), this::visitDeclareExtends, result::setSuperType);
        return result;
    }

    default List<Statement> visitInterfaceBody(InterfaceBodyContext ctx) {
        return this.map(ctx.interfaceMemberDeclaration(), this::visitInterfaceMemberDeclaration);
    }

    default Statement visitInterfaceMemberDeclaration(InterfaceMemberDeclarationContext ctx) {
        return this.find(ctx.children, result -> result instanceof Statement ? (Statement) result : (Statement) null);
    }

    default AbstractFunctionDeclaration visitAbstractFunctionDeclaration(AbstractFunctionDeclarationContext ctx) {
        AbstractFunctionDeclaration result = new AbstractFunctionDeclaration();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.declarationTypeParametersBlock(), this::visitDeclarationTypeParametersBlock, result::setGenericsParameters);
        this.accept(ctx.functionParameterDeclaratorsBlock(), this::visitFunctionParameterDeclaratorsBlock, result::setParameters);
        this.accept(ctx.functionReturn(), this::visitFunctionReturn, result::setReturnType);
        return result;
    }

    String visitIdentifier(IdentifierContext ctx);

    ClassTypeNode visitDeclareExtends(DeclareExtendsContext ctx);

    List<ClassTypeNode> visitDeclarationTypeParametersBlock(DeclarationTypeParametersBlockContext ctx);

    List<VariateDeclarator> visitFunctionParameterDeclaratorsBlock(FunctionParameterDeclaratorsBlockContext ctx);

    ClassTypeNode visitFunctionReturn(FunctionReturnContext ctx);

    AnnotatedNode visitAnnotated(AnnotatedContext ctx);
}
