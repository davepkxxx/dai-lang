package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface FunctionVisitor extends BaseVisitor {

    default FunctionDeclaration visitFunctionDeclaration(FunctionDeclarationContext ctx) {
        FunctionDeclaration result = new FunctionDeclaration();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.declareGenericsParameters(), this::visitDeclareGenericsParameters, result::setGenericsParameters);
        this.accept(ctx.functionParameters(), this::visitFunctionParameters, result::setParameters);
        this.accept(ctx.functionReturn(), this::visitFunctionReturn, result::setReturnType);
//        this.accept(ctx.block());
        return result;
    }

    default List<VariateDeclarator> visitFunctionParameters(FunctionParametersContext ctx) {
        return this.map(ctx.variateDeclaratorList(), this::visitVariateDeclaratorList);
    }

    default ClassType visitFunctionReturn(FunctionReturnContext ctx) {
        return this.map(ctx.classType(), this::visitClassType);
    }

    default ReturnStatement visitReturnStatement(ReturnStatementContext ctx) {
        ReturnStatement result = new ReturnStatement();
        this.accept(ctx.children, child -> {
            Object childResult = child.accept(this);
            return childResult instanceof Expression ? (Expression) childResult : (Expression) null;
        }, result::setExpression);
        return result;
    }

    List<ClassType> visitDeclareGenericsParameters(DeclareGenericsParametersContext ctx);

    List<VariateDeclarator> visitVariateDeclaratorList(VariateDeclaratorListContext ctx);

    ClassType visitClassType(ClassTypeContext ctx);

    String visitIdentifier(IdentifierContext ctx);
}
