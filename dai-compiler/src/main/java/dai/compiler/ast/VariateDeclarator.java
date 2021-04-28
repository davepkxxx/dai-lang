package dai.compiler.ast;

import lombok.Getter;
import lombok.Setter;

public class VariateDeclarator extends AstNode {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private ClassType type;

    @Getter
    @Setter
    private Expression init;
}
