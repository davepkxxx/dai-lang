package dai.compiler.ast;

public class VariateDeclarator extends AstNode {

    private String name;

    private ClassType type;

    private Expression init;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassType getType() {
        return type;
    }

    public void setType(ClassType type) {
        this.type = type;
    }

    public Expression getInit() {
        return init;
    }

    public void setInit(Expression init) {
        this.init = init;
    }
}
