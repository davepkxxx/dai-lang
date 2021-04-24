package dai.compiler.syntax;

public abstract class BasicLiteral extends Literal {

    private String raw;

    public BasicLiteral() {
    }

    public BasicLiteral(String raw) {
        this.raw = raw;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

}
