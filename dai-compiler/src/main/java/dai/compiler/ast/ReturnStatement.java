package dai.compiler.ast;

import lombok.Data;

@Data
public class ReturnStatement implements Statement {
    private Expression expression;
}
