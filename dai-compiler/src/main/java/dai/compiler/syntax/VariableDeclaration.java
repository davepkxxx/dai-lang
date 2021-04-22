package dai.compiler.syntax;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclaration extends Statement implements Declaration {

    List<VariableDeclarator> declarators = new ArrayList<>();

    VariableDeclarationKind kind;

    public List<VariableDeclarator> getDeclarators() {
        return declarators;
    }

    public void setDeclarators(List<VariableDeclarator> declarators) {
        this.declarators = declarators;
    }

    public VariableDeclarationKind getKind() {
        return kind;
    }

    public void setKind(VariableDeclarationKind kind) {
        this.kind = kind;
    }

}
