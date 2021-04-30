package dai.compiler.ast;

import lombok.Data;

@Data
public class ExpressionStatement implements AstNode {
    private Expression expression;
}
