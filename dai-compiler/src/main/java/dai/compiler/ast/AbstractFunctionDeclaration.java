package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AbstractFunctionDeclaration implements Statement {
    private String name;
    private List<AnnotatedNode> annotations = new ArrayList<>();
    private List<ClassTypeNode> genericsParameters = new ArrayList<>();
    private List<VariableDeclarator> parameters = new ArrayList<>();
    private ClassTypeNode returnType;
}
