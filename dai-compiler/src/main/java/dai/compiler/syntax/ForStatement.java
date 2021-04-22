package dai.compiler.syntax;

public class ForStatement {

    private Statement init;

    private Expression test;

    private Expression update;

    private Statement body;

    public Statement getInit() {
        return init;
    }

    public void setInit(Statement init) {
        this.init = init;
    }

    public Expression getTest() {
        return test;
    }

    public void setTest(Expression test) {
        this.test = test;
    }

    public Expression getUpdate() {
        return update;
    }

    public void setUpdate(Expression update) {
        this.update = update;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }

}
