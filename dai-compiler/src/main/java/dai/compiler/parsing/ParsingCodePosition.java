package dai.compiler.parsing;

import dai.compiler.syntax.SyntaxTreeNode;
import dai.compiler.syntax.SyntaxTreeNodePosition;

public class ParsingCodePosition {

    private final int length;

    private int offset;

    private int line;

    private int column;

    public ParsingCodePosition(int length) {
        this.length = length;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean hasNext() {
        return offset < length;
    }

    public void next() {
        this.offset++;
        this.column++;
    }

    public void nextLine() {
        this.column = 0;
        this.line++;
    }

    public void setStartPosition (SyntaxTreeNode node) {
        node.getPosition().setStartOffset(offset);
        node.getPosition().setStartLine(line);
        node.getPosition().setStartColumn(column);
    }

    public void setEndPosition (SyntaxTreeNode node) {
        node.getPosition().setEndOffset(offset);
        node.getPosition().setEndLine(line);
        node.getPosition().setEndColumn(column);
    }

}
