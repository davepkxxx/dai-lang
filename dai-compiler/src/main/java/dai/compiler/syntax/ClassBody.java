package dai.compiler.syntax;

import java.util.ArrayList;
import java.util.List;

public class ClassBody extends SyntaxTreeNode {

    private List<ClassMemberDeclaration> body = new ArrayList<>();

    public List<ClassMemberDeclaration> getBody() {
        return body;
    }

    public void setBody(List<ClassMemberDeclaration> body) {
        this.body = body;
    }

}
