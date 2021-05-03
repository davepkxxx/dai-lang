package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ForInitNode implements AstNode {
    private VariableDeclaration declaration;
    private List<Expression> expressions = new ArrayList<>();
}
