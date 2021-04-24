package dai.compiler.syntax;

public class VariableDeclarator extends TreeNode {

    private Identifier id;

    private Expression init;

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public Expression getInit() {
        return init;
    }

    public void setInit(Expression init) {
        this.init = init;
    }

}
