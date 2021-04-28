package dai.compiler.ast;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class CompilationUnit extends AstNode {
    @Getter
    @Setter
    private PackageDeclaration package_;
    @Getter
    @Setter
    private List<ImportDeclaration> imports = new ArrayList<>();
    @Getter
    @Setter
    private List<Statement> body = new ArrayList<>();
}
