package dai.compiler.ast;

import lombok.Data;

@Data
public class IfStatement {
    private Expression condition;
    private Statement consequent;
    private Statement alternate;
}
