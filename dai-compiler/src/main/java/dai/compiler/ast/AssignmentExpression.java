package dai.compiler.ast;

import lombok.Data;

@Data
public class AssignmentExpression implements Expression {
    private Expression left;
    private Expression right;
    private AssignmentOperator operator;

    public enum AssignmentOperator {
        ASSIGNMENT,
        ADDITION_ASSIGNMENT,
        SUBTRACTION_ASSIGNMENT,
        MULTIPLICATION_ASSIGNMENT,
        DIVISION_ASSIGNMENT,
        AND_ASSIGNMENT,
        OR_ASSIGNMENT,
        EXCLUSIVE_OR_ASSIGNMENT,
        REMAINDER_ASSIGNMENT,
        LEFT_SHIFT_ASSIGNMENT,
        RIGHT_SHIFT_ASSIGNMENT
    }
}
