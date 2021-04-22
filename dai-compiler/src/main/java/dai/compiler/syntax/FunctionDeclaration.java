package dai.compiler.syntax;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclaration extends Statement implements Declaration {

    private Identifier id;

    private List<Identifier> params = new ArrayList<>();

    private BlockStatement body;

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public List<Identifier> getParams() {
        return params;
    }

    public void setParams(List<Identifier> params) {
        this.params = params;
    }

    public BlockStatement getBody() {
        return body;
    }

    public void setBody(BlockStatement body) {
        this.body = body;
    }

}
