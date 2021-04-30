package dai.compiler.ast;

import lombok.Data;

@Data
public class ImportDeclaration implements Statement {
    private String name;
}
