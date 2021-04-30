package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BlockStatement implements Statement {
    private List<Statement> body = new ArrayList<>();
}
