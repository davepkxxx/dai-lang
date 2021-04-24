package dai.compiler.parsing;

public class ParsingException extends RuntimeException {

    public ParsingException(String message, int line, int column) {
        super(message + String.format(" (%d:%d)", line + 1, column + 1));
    }

}
