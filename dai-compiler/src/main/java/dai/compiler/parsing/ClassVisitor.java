package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface ClassVisitor extends BaseVisitor {
    default ClassDeclaration visitClassDeclaration(ClassDeclarationContext ctx) {
        ClassDeclaration result = new ClassDeclaration();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.declarationTypeParametersBlock(), this::visitDeclarationTypeParametersBlock, result::setGenericsParameters);
        this.accept(ctx.declareExtends(), this::visitDeclareExtends, result::setSuperType);
        this.accept(ctx.declareImplements(), this::visitDeclareImplements, result::setInterfaces);
        this.map(ctx.classBody(), this::visitClassBody).forEach(member -> {
            if (member instanceof VariateDeclaration) result.getFields().add((VariateDeclaration) member);
            if (member instanceof ConstructorDeclaration) result.getConstructors().add((ConstructorDeclaration) member);
            if (member instanceof FunctionDeclaration) result.getMethods().add((FunctionDeclaration) member);
        });
        return result;
    }

    default List<Statement> visitClassBody(ClassBodyContext ctx) {
        return this.map(ctx.classMemberDeclaration(), this::visitClassMemberDeclaration);
    }

    default Statement visitClassMemberDeclaration(ClassMemberDeclarationContext ctx) {
        return this.find(ctx.children, result -> result instanceof Statement ? (Statement) result : (Statement) null);
    }

    default ConstructorDeclaration visitConstructorDeclaration(ConstructorDeclarationContext ctx) {
        ConstructorDeclaration result = new ConstructorDeclaration();
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.functionParameterDeclaratorsBlock(), this::visitFunctionParameterDeclaratorsBlock, result::setParameters);
        this.accept(ctx.body(), this::visitBody, result::setBody);
        return result;
    }

    default List<ClassTypeNode> visitDeclareImplements(DeclareImplementsContext ctx) {
        return this.map(ctx.useTypes(), this::visitUseTypes);
    }

    AnnotatedNode visitAnnotated(AnnotatedContext ctx);

    List<ClassTypeNode> visitUseTypes(UseTypesContext ctx);

    String visitIdentifier(IdentifierContext ctx);

    ClassTypeNode visitDeclareExtends(DeclareExtendsContext ctx);

    List<ClassTypeNode> visitDeclarationTypeParametersBlock(DeclarationTypeParametersBlockContext ctx);

    List<VariateDeclarator> visitFunctionParameterDeclaratorsBlock(FunctionParameterDeclaratorsBlockContext ctx);

    List<Statement> visitBody(BodyContext ctx);
}
