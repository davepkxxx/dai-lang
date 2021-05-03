package dai.compiler.ast;

import lombok.Data;

@Data
public class BinaryExpression implements Expression {
    private Expression left;
    private Expression right;
    private BinaryOperator operator;

    public enum BinaryOperator {
        ADDITION,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION,
        REMAINDER,
        LEFT_SHIFT,
        RIGHT_SHIFT,
        EQUALITY,
        INEQUALITY,
        GREATER_THAN,
        LESS_THAN,
        LESS_THAN_OR_EQUAL,
        GREATER_THAN_OR_EQUAL,
        LOGICAL_AND,
        LOGICAL_OR,
        BITWISE_AND,
        BITWISE_OR,
        EXCLUSIVE_OR
    }
}
