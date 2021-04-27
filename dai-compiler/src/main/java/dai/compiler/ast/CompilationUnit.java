package dai.compiler.ast;

import java.util.ArrayList;
import java.util.List;

public class CompilationUnit extends AstNode {

    private Package pkg;

    private List<Statement> body = new ArrayList<>();

    public Package getPkg() {
        return pkg;
    }

    public void setPkg(Package pkg) {
        this.pkg = pkg;
    }

    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> body) {
        this.body = body;
    }
}
