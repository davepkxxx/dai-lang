package dai.compiler.syntax;

public class StringLiteral extends Literal {

    private String value;

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    @Deprecated
    public void setValue(Object value) {
        throw new LiteralException(this, "Unexpected data type.");
    }

}
