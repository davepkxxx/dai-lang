package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class VariableDeclarator implements AstNode {
    private String name;
    private ClassTypeNode type;
    private Expression init;
    private List<AnnotatedNode> annotations = new ArrayList<>();
}
