package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface ParameterVisitor extends BaseVisitor {

    default ParameterNode visitParam(ParamContext ctx) {
        ParameterNode result = new ParameterNode();
        this.accept(ctx.expression(), this::visitExpression, result::setExpression);
        this.accept(ctx.namedParam(), this::visitNamedParam, result::setNamedParameter);
        return result;
    }

    default List<ParameterNode> visitParams(ParamsContext ctx) {
        return this.map(ctx.param(), this::visitParam);
    }

    default List<ParameterNode> visitParamsBlock(ParamsBlockContext ctx) {
        return this.map(ctx.params(), this::visitParams);
    }

    default VariableDeclarator visitNamedParam(NamedParamContext ctx) {
        VariableDeclarator result = new VariableDeclarator();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.expression(), this::visitExpression, result::setInit);
        return result;
    }

    default List<VariableDeclarator> visitNamedParams(NamedParamsContext ctx) {
        return this.map(ctx.namedParam(), this::visitNamedParam);
    }

    default List<VariableDeclarator> visitNamedParamsBlock(NamedParamsBlockContext ctx) {
        return this.map(ctx.namedParams(), this::visitNamedParams);
    }

    String visitIdentifier(IdentifierContext ctx);

    Expression visitExpression(ExpressionContext ctx);
}
