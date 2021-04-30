package dai.compiler.ast;

import lombok.Data;

@Data
public class ForInStatement implements Statement {
    private Expression collection;
    private String element;
    private String index;
    private Statement body;
}
