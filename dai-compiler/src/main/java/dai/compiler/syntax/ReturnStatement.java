package dai.compiler.syntax;

public class ReturnStatement extends Statement {

    private Expression argument;

    public Expression getArgument() {
        return argument;
    }

    public void setArgument(Expression argument) {
        this.argument = argument;
    }

}
