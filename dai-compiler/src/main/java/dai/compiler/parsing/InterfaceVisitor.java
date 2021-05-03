package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface InterfaceVisitor extends BaseVisitor {
    default InterfaceDeclaration visitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
        InterfaceDeclaration result = new InterfaceDeclaration();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.declTypeParamsBlock(), this::visitDeclTypeParamsBlock, result::setGenericsParameters);
        this.accept(ctx.extendsBlock(), this::visitExtendsBlock, result::setSuperType);
        this.map(ctx.interfaceMemberDeclaration(), this::visitInterfaceMemberDeclaration).forEach(member -> {
            if (member instanceof VariableDeclaration) result.getFields().add((VariableDeclaration) member);
            if (member instanceof FunctionDeclaration) result.getMethods().add((FunctionDeclaration) member);
            if (member instanceof AbstractFunctionDeclaration) result.getAbstractMethods().add((AbstractFunctionDeclaration) member);
        });
        return result;
    }

    default Statement visitInterfaceMemberDeclaration(InterfaceMemberDeclarationContext ctx) {
        return this.find(ctx.children, result -> result instanceof Statement ? (Statement) result : (Statement) null);
    }

    default AbstractFunctionDeclaration visitAbstractFuncDeclaration(AbstractFuncDeclarationContext ctx) {
        AbstractFunctionDeclaration result = new AbstractFunctionDeclaration();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.declTypeParamsBlock(), this::visitDeclTypeParamsBlock, result::setGenericsParameters);
        this.accept(ctx.funcParamsBlock(), this::visitFuncParamsBlock, result::setParameters);
        this.accept(ctx.funcReturn(), this::visitFuncReturn, result::setReturnType);
        return result;
    }

    String visitIdentifier(IdentifierContext ctx);

    ClassTypeNode visitExtendsBlock(ExtendsBlockContext ctx);

    List<ClassTypeNode> visitDeclTypeParamsBlock(DeclTypeParamsBlockContext ctx);

    List<VariableDeclarator> visitFuncParamsBlock(FuncParamsBlockContext ctx);

    ClassTypeNode visitFuncReturn(FuncReturnContext ctx);

    AnnotatedNode visitAnnotated(AnnotatedContext ctx);
}
