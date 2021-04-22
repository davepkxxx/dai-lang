package dai.compiler.syntax;

import java.util.ArrayList;
import java.util.List;

public class Program extends Element {

    private List<Statement> body = new ArrayList<>();

    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> body) {
        this.body = body;
    }

}
