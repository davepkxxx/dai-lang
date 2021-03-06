package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PackageDeclaration implements Statement {
    private String name;
    private List<AnnotatedNode> annotations = new ArrayList<>();
}
