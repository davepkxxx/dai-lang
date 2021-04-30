package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface ClassVisitor extends BaseVisitor {
    default ClassDeclaration visitClassDeclaration(ClassDeclarationContext ctx) {
        ClassDeclaration result = new ClassDeclaration();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.declTypeParamsBlock(), this::visitDeclTypeParamsBlock, result::setGenericsParameters);
        this.accept(ctx.extendsBlock(), this::visitExtendsBlock, result::setSuperType);
        this.accept(ctx.implTypes, this::visitUseTypes, result::setInterfaces);
        this.map(ctx.classMemberDeclaration(), this::visitClassMemberDeclaration).forEach(member -> {
            if (member instanceof VariateDeclaration) result.getFields().add((VariateDeclaration) member);
            if (member instanceof ConstructorDeclaration) result.getConstructors().add((ConstructorDeclaration) member);
            if (member instanceof FunctionDeclaration) result.getMethods().add((FunctionDeclaration) member);
        });
        return result;
    }

    default Statement visitClassMemberDeclaration(ClassMemberDeclarationContext ctx) {
        return this.find(ctx.children, result -> result instanceof Statement ? (Statement) result : (Statement) null);
    }

    default ConstructorDeclaration visitConstructorDeclaration(ConstructorDeclarationContext ctx) {
        ConstructorDeclaration result = new ConstructorDeclaration();
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.funcParamsBlock(), this::visitFuncParamsBlock, result::setParameters);
        this.accept(ctx.body(), this::visitBody, result::setBody);
        return result;
    }

    AnnotatedNode visitAnnotated(AnnotatedContext ctx);

    List<ClassTypeNode> visitUseTypes(UseTypesContext ctx);

    String visitIdentifier(IdentifierContext ctx);

    ClassTypeNode visitExtendsBlock(ExtendsBlockContext ctx);

    List<ClassTypeNode> visitDeclTypeParamsBlock(DeclTypeParamsBlockContext ctx);

    List<VariateDeclarator> visitFuncParamsBlock(FuncParamsBlockContext ctx);

    List<Statement> visitBody(BodyContext ctx);
}
