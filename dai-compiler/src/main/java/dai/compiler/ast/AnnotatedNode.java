package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AnnotatedNode implements AstNode {
    private String name;
    private List<VariateDeclarator> parameters = new ArrayList<>();
}
