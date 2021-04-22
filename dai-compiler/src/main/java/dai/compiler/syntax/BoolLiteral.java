package dai.compiler.syntax;

public class BoolLiteral extends Literal {

    private Boolean value;

    @Override
    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    @Override
    @Deprecated
    public void setValue(Object value) {
        throw new LiteralException(this, "Unexpected data type.");
    }

}
