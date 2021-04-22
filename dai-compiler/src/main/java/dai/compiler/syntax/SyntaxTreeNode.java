package dai.compiler.syntax;

public abstract class SyntaxTreeNode {

    private SyntaxTreeNodePosition position = new SyntaxTreeNodePosition();

    public SyntaxTreeNodePosition getPosition() {
        return position;
    }

    public void setPosition(SyntaxTreeNodePosition position) {
        this.position = position;
    }

}
