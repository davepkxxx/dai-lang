package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TryStatement {
    private List<Statement> tryBody = new ArrayList<>();
    private List<CatchNode> catches = new ArrayList<>();
    private List<Statement> finallyBody = new ArrayList<>();
}
