package dai.compiler.ast;

import lombok.Data;

@Data
public class ObjectPropertyNode implements AstNode {
    private String name;
    private Expression value;
}
