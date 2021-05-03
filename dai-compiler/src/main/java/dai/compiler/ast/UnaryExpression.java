package dai.compiler.ast;

import lombok.Data;

@Data
public class UnaryExpression implements Expression {
    private Expression expression;
    private UnaryOperator operator;

    public enum UnaryOperator {
        UNARY_PLUS,
        UNARY_NEGATION,
        LOGIC_NOT,
        BITWISE_NOT,
        INCREMENT,
        DECREMENT
    }
}
