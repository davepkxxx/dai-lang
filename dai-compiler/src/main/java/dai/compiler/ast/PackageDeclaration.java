package dai.compiler.ast;

import lombok.Getter;
import lombok.Setter;

public class PackageDeclaration extends Statement {

    @Getter
    @Setter
    private String name;

}
