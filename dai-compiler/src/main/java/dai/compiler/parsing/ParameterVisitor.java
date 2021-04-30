package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface ParameterVisitor extends BaseVisitor {

    default ParameterNode visitParameter(ParameterContext ctx) {
        ParameterNode result = new ParameterNode();
        this.accept(ctx.expression(), this::visitExpression, result::setExpression);
        this.accept(ctx.namedParameter(), this::visitNamedParameter, result::setNamedParameter);
        return result;
    }

    default List<ParameterNode> visitParameters(ParametersContext ctx) {
        return this.map(ctx.parameter(), this::visitParameter);
    }

    default List<ParameterNode> visitParametersBlock(ParametersBlockContext ctx) {
        return this.map(ctx.parameters(), this::visitParameters);
    }

    default VariateDeclarator visitNamedParameter(NamedParameterContext ctx) {
        VariateDeclarator result = new VariateDeclarator();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.expression(), this::visitExpression, result::setInit);
        return result;
    }

    default List<VariateDeclarator> visitNamedParameters(NamedParametersContext ctx) {
        return this.map(ctx.namedParameter(), this::visitNamedParameter);
    }

    default List<VariateDeclarator> visitNamedParametersBlock(NamedParametersBlockContext ctx) {
        return this.map(ctx.namedParameters(), this::visitNamedParameters);
    }

    String visitIdentifier(IdentifierContext ctx);

    Expression visitExpression(ExpressionContext ctx);
}
