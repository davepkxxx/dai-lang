package dai.compiler.syntax;

public class LiteralException extends RuntimeException {

    private Literal literal;

    public LiteralException(Literal l, String s) {
        super(s);
        this.literal = l;
    }

}
