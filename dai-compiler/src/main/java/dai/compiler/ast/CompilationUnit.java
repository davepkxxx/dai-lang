package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CompilationUnit implements AstNode {
    private PackageDeclaration package_;
    private List<ImportDeclaration> imports = new ArrayList<>();
    private List<Statement> body = new ArrayList<>();
}
