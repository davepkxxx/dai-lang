package dai.compiler.parsing;

import lombok.Getter;

public class ParsingException extends RuntimeException {
    @Getter
    private final int line;
    @Getter
    private final int column;

    public ParsingException(String message, int line, int column) {
        super(message + String.format(" (%d:%d)", line, column));
        this.line = line;
        this.column = column;
    }
}
