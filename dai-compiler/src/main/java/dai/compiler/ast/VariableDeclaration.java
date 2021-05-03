package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class VariableDeclaration implements Statement {
    private VariableKind variableKind;
    private List<AnnotatedNode> annotations = new ArrayList<>();
    private List<VariableDeclarator> declarators = new ArrayList<>();

    public enum VariableKind {
        VAR,
        CONST
    }
}
