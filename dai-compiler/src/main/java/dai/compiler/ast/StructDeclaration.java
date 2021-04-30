package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StructDeclaration implements Statement {
    private String name;
    private List<AnnotatedNode> annotations = new ArrayList<>();
    private List<ClassTypeNode> genericsParameters = new ArrayList<>();
    private ClassTypeNode superType;
    private List<VariateDeclaration> fields = new ArrayList<>();
}