package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.ClassType;

import java.util.List;

public interface ClassTypeVisitor extends BaseVisitor {

    default ClassType visitClassType(ClassTypeContext ctx) {
        ClassType result = new ClassType();
        this.accept(ctx.identifierPath(), this::visitIdentifierPath, result::setName);
        this.accept(ctx.genericsParameters(), this::visitGenericsParameters, result::setGenericsParameters);
        return result;
    }

    default ClassType visitGenericsParameter(GenericsParameterContext ctx) {
        ClassType result = new ClassType();
        this.accept(ctx.identifierPath(), this::visitIdentifierPath, result::setName);
        this.accept(ctx.genericsParameters(), this::visitGenericsParameters, result::setGenericsParameters);
        return result;
    }

    default List<ClassType> visitGenericsParameterList(GenericsParameterListContext ctx) {
        return this.map(ctx.genericsParameter(), this::visitGenericsParameter);
    }

    default List<ClassType> visitGenericsParameters(GenericsParametersContext ctx) {
        return this.map(ctx.genericsParameterList(), this::visitGenericsParameterList);
    }

    default ClassType visitDeclareGenericsParameter(DeclareGenericsParameterContext ctx) {
        ClassType result = new ClassType();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.declareGenericsParameterExtends(), this::visitDeclareGenericsParameterExtends, result::setSuperType);
        return result;
    }

    default ClassType visitDeclareGenericsParameterExtends(DeclareGenericsParameterExtendsContext ctx) {
        ClassType result = new ClassType();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.declareGenericsParameterSuper(), this::visitDeclareGenericsParameterSuper, result::setSuperType);
        return result;
    }

    default ClassType visitDeclareGenericsParameterSuper(DeclareGenericsParameterSuperContext ctx) {
        ClassType result = new ClassType();
        this.accept(ctx.identifierPath(), this::visitIdentifierPath, result::setName);
        this.accept(ctx.genericsParameters(), this::visitGenericsParameters, result::setGenericsParameters);
        return result;
    }

    default List<ClassType> visitDeclareGenericsParameterList(DeclareGenericsParameterListContext ctx) {
        return this.map(ctx.declareGenericsParameter(), this::visitDeclareGenericsParameter);
    }

    default List<ClassType> visitDeclareGenericsParameters(DeclareGenericsParametersContext ctx) {
        return this.map(ctx.declareGenericsParameterList(), this::visitDeclareGenericsParameterList);
    }

    String visitIdentifier(IdentifierContext ctx);

    String visitIdentifierPath(IdentifierPathContext ctx);
}
