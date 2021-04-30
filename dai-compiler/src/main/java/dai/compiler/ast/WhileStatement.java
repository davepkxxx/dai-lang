package dai.compiler.ast;

import lombok.Data;

@Data
public class WhileStatement implements Statement {
    private Expression condition;
    private Statement body;
}
