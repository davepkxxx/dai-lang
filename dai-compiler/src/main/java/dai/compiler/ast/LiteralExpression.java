package dai.compiler.ast;

import lombok.Data;

@Data
public class LiteralExpression implements Expression {
    private Literal value;
}
