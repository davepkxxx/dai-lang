package dai.compiler.syntax;

public class ClassDeclaration extends Statement implements Declaration {

    private Identifier id;

    private Identifier superClass;

    private ClassBody body;

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public Identifier getSuperClass() {
        return superClass;
    }

    public void setSuperClass(Identifier superClass) {
        this.superClass = superClass;
    }

    public ClassBody getBody() {
        return body;
    }

    public void setBody(ClassBody body) {
        this.body = body;
    }
}
