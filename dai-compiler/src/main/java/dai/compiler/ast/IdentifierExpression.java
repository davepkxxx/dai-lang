package dai.compiler.ast;

import lombok.Data;

@Data
public class IdentifierExpression implements Expression {
    private String name;
}
