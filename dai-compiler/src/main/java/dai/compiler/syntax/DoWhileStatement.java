package dai.compiler.syntax;

public class DoWhileStatement extends Statement {

    private Expression test;

    private Statement body;

    public Expression getTest() {
        return test;
    }

    public void setTest(Expression test) {
        this.test = test;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }

}
