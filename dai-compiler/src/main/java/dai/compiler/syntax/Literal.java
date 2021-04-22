package dai.compiler.syntax;

public abstract class Literal extends Expression {

    private Object value;

    private String raw;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

}
