package dai.compiler.syntax;

import java.util.ArrayList;
import java.util.List;

public class SwitchCase extends SyntaxTreeNode {

    private Expression test;

    private List<Statement> consequent = new ArrayList<>();

    public Expression getTest() {
        return test;
    }

    public void setTest(Expression test) {
        this.test = test;
    }

    public List<Statement> getConsequent() {
        return consequent;
    }

    public void setConsequent(List<Statement> consequent) {
        this.consequent = consequent;
    }

}
