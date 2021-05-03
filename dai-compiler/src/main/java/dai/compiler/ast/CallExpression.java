package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CallExpression implements Expression {
    private Expression function;
    private List<ParameterNode> parameters = new ArrayList<>();
}
