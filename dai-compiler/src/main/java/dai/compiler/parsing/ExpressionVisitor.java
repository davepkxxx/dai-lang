package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface ExpressionVisitor extends BaseVisitor {

    default Expression visitExpression(ExpressionContext ctx) {
        return this.find(ctx.children, result -> result instanceof Expression ? (Expression) result : (Expression) null);
    }

    default List<Expression> visitExpressions(ExpressionsContext ctx) {
        return this.map(ctx.expression(), this::visitExpression);
    }
}
