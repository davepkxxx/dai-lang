package dai.compiler.ast;

import lombok.Data;

@Data
public class MemberExpression implements Expression {
    private Expression object;
    private Expression property;
}
