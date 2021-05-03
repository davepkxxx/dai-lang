package dai.compiler.ast;

import lombok.Data;

@Data
public class ParameterNode implements AstNode {
    private Expression expression;
    private VariableDeclarator namedParameter;
}
