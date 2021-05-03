package dai.compiler.ast;

import lombok.Data;

@Data
public class ConditionalExpression implements Expression {
    private Expression condition;
    private Expression consequent;
    private Expression alternate;
}
