package dai.compiler.syntax;

public abstract class TreeNode {

    private Position pos;

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

}