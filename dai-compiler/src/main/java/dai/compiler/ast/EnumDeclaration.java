package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EnumDeclaration implements Statement {
    private String name;
    private List<AnnotatedNode> annotations = new ArrayList<>();
    private ClassTypeNode genericsParameter;
    private List<VariateDeclarator> fields = new ArrayList<>();
}
