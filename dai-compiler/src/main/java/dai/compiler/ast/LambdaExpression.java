package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LambdaExpression implements Expression {
    private List<VariableDeclarator> parameters = new ArrayList<>();
    private List<Statement> body;
}
