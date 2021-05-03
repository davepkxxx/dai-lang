package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ConstructorDeclaration implements Statement {
    private List<AnnotatedNode> annotations = new ArrayList<>();
    private List<VariableDeclarator> parameters = new ArrayList<>();
    private List<Statement> body = new ArrayList<>();
}
