package dai.compiler.ast;

import java.util.ArrayList;
import java.util.List;

public class VariateDeclaration extends Statement {

    private Kind kind;

    private List<VariateDeclarator> declarators = new ArrayList<>();

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public List<VariateDeclarator> getDeclarators() {
        return declarators;
    }

    public void setDeclarators(List<VariateDeclarator> declarators) {
        this.declarators = declarators;
    }

    public enum Kind {

        VAR,
        CONST;

    }
}
