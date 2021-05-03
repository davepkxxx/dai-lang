package dai.compiler.ast;

import lombok.Data;

@Data
public class ExpressionStatement implements Statement {
    private Expression expression;
}
