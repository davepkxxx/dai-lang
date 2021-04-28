package dai.compiler.ast;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class VariateDeclaration extends Statement {

    @Getter
    @Setter
    private Kind kind;

    @Getter
    @Setter
    private List<VariateDeclarator> declarators = new ArrayList<>();

    public enum Kind {
        VAR,
        CONST;
    }
}
