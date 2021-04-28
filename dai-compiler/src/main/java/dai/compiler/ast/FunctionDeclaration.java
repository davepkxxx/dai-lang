package dai.compiler.ast;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclaration extends Statement {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private List<ClassType> genericsParameters = new ArrayList<>();
    @Getter
    @Setter
    private List<VariateDeclarator> parameters = new ArrayList<>();
    @Getter
    @Setter
    private ClassType returnType;
    @Getter
    @Setter
    private List<Statement> body = new ArrayList<>();
}
