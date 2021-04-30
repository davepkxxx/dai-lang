package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ForStatement implements Statement {
    private ForInitNode init;
    private Expression condition;
    private List<Expression> update = new ArrayList<>();
    private Statement body;
}
