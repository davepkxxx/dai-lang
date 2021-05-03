package dai.compiler.ast;

import lombok.Data;

@Data
public class ChainExpression implements Expression {
    private Expression object;
    private String property;
    private boolean isOptionalChaining;
}
