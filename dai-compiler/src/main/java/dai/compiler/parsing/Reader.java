package dai.compiler.parsing;

import dai.compiler.syntax.TreeNode;
import dai.compiler.syntax.Position;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Reader {

    @NotNull
    private final String code;

    private final int length;

    private int offset;

    private int line;

    private int column;

    private char prevChar;

    private char currChar;

    @Nullable
    private Position pos;

    protected Reader(@NotNull String code) {
        this.code = code;
        this.length = code.length();
        this.refreshCurrChar();
    }

    protected String getCode() {
        return code;
    }

    protected int getOffset() {
        return offset;
    }

    protected int getLine() {
        return line;
    }

    protected int getColumn() {
        return column;
    }

    public char getPrevChar() {
        return prevChar;
    }

    protected char getCurrChar() {
        return currChar;
    }

    private void refreshCurrChar() {
        this.prevChar = this.currChar;
        this.currChar = this.offset < this.length ? this.code.charAt(this.offset) : '\u0000';
    }

    protected Position getPos() {
        return pos;
    }

    protected void copyFrom(Reader from) {
        this.offset = from.offset;
        this.line = from.line;
        this.column = from.column;
        this.currChar = from.currChar;
    }

    protected void copyTo(Reader to) {
        to.offset = this.offset;
        to.line = this.line;
        to.column = this.column;
        to.currChar = this.currChar;
    }

    protected Position newPos() {
        this.pos = new Position();
        this.pos.setStartOffset(this.offset);
        this.pos.setStartLine(this.line);
        this.pos.setStartColumn(this.column);
        return this.pos;
    }

    protected void setEndPos(TreeNode node) {
        node.getPos().setEndOffset(offset);
        node.getPos().setEndLine(line);
        node.getPos().setEndColumn(column);
    }

    protected void nextChar() {
        if (currChar == '\r' || currChar == '\n') {
            this.column = 0;
            this.line++;
        } else {
            this.column++;
        }
        this.offset++;
        this.refreshCurrChar();
    }

    protected ParsingException newParsingException(@NotNull String msg) throws ParsingException {
        return new ParsingException(msg, this.line, this.column);
    }

}
