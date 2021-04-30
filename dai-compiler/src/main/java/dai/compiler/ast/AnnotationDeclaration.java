package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AnnotationDeclaration implements Statement {
    private String name;
    private List<AnnotatedNode> annotations = new ArrayList<>();
    private List<VariateDeclaration> fields = new ArrayList<>();
}
