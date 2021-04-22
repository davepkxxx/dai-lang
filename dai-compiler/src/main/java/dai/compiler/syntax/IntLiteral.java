package dai.compiler.syntax;

public class IntLiteral extends Literal {

    private Integer value;

    @Override
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    @Deprecated
    public void setValue(Object value) {
        throw new LiteralException(this, "Unexpected data type.");
    }

}
