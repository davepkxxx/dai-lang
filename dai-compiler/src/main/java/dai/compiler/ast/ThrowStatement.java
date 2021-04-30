package dai.compiler.ast;

import lombok.Data;

@Data
public class ThrowStatement implements AstNode {
    private Expression expression;
}
