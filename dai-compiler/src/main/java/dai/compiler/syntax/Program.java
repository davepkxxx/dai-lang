package dai.compiler.syntax;

import java.util.List;

public class Program extends TreeNode {

    private List<Statement> body;

    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> body) {
        this.body = body;
    }

}
