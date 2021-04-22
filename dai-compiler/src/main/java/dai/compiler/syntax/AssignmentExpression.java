package dai.compiler.syntax;

public class AssignmentExpression extends Expression {

    Identifier left;

    Expression right;

    AssignmentOperator operator;

    public Identifier getLeft() {
        return left;
    }

    public void setLeft(Identifier left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public AssignmentOperator getOperator() {
        return operator;
    }

    public void setOperator(AssignmentOperator operator) {
        this.operator = operator;
    }

}
