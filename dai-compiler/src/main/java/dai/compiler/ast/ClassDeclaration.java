package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClassDeclaration implements Statement {
    private String name;
    private List<AnnotatedNode> annotations = new ArrayList<>();
    private List<ClassTypeNode> genericsParameters = new ArrayList<>();
    private ClassTypeNode superType;
    private List<ClassTypeNode> interfaces = new ArrayList<>();
    private List<VariableDeclaration> fields = new ArrayList<>();
    private List<ConstructorDeclaration> constructors = new ArrayList<>();
    private List<FunctionDeclaration> methods = new ArrayList<>();
}
