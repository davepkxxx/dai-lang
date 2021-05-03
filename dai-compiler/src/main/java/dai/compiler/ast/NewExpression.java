package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class NewExpression implements Expression {
    private ClassTypeNode classType;
    private List<AnnotatedNode> annotations = new ArrayList<>();
    private List<ParameterNode> parameters = new ArrayList<>();
}
