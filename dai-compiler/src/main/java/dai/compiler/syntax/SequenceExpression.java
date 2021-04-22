package dai.compiler.syntax;

import java.util.List;

public class SequenceExpression extends Expression {

    private List<Expression> expressions;

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

}
