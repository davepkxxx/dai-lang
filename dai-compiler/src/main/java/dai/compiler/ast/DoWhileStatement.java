package dai.compiler.ast;

import lombok.Data;

@Data
public class DoWhileStatement implements Statement {
    private Expression condition;
    private Statement body;
}
