package dai.compiler.syntax;

public class UnaryExpression extends Expression {

    private Expression argument;

    private UnaryOperator operator;

    public Expression getArgument() {
        return argument;
    }

    public void setArgument(Expression argument) {
        this.argument = argument;
    }

    public UnaryOperator getOperator() {
        return operator;
    }

    public void setOperator(UnaryOperator operator) {
        this.operator = operator;
    }

}
