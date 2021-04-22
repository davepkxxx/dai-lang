package dai.compiler.syntax;

import java.util.ArrayList;
import java.util.List;

public class NewExpression extends Expression {

    private Expression callee;

    private List<Expression> arguments = new ArrayList<>();

    public Expression getCallee() {
        return callee;
    }

    public void setCallee(Expression callee) {
        this.callee = callee;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public void setArguments(List<Expression> arguments) {
        this.arguments = arguments;
    }

}
