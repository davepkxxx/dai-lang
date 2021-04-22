package dai.compiler.syntax;

public class CharLiteral extends Literal {

    private Character value;

    @Override
    public Character getValue() {
        return value;
    }

    public void setValue(Character value) {
        this.value = value;
    }

    @Override
    @Deprecated
    public void setValue(Object value) {
        throw new LiteralException(this, "Unexpected data type.");
    }

}
