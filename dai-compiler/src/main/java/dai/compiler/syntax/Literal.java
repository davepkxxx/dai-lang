package dai.compiler.syntax;

public abstract class Literal extends Expression {

    private String raw;

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

}
