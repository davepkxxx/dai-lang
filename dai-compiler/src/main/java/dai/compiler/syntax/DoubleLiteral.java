package dai.compiler.syntax;

public class DoubleLiteral extends Literal {

    private Double value;

    @Override
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    @Deprecated
    public void setValue(Object value) {
        throw new LiteralException(this, "Unexpected data type.");
    }

}
