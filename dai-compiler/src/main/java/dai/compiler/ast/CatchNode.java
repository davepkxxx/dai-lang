package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CatchNode implements AstNode {
    private VariateDeclarator parameter;
    private List<Statement> body = new ArrayList<>();
}
