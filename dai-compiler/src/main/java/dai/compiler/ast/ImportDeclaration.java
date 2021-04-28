package dai.compiler.ast;

import lombok.Getter;
import lombok.Setter;

public class ImportDeclaration extends Statement {
    @Getter
    @Setter
    private String name;
}
