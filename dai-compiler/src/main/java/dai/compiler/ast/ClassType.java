package dai.compiler.ast;

import java.util.ArrayList;
import java.util.List;

public class ClassType extends AstNode {

    private String name;

    List<ClassType> genericsParameters = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ClassType> getGenericsParameters() {
        return genericsParameters;
    }

    public void setGenericsParameters(List<ClassType> genericsParameters) {
        this.genericsParameters = genericsParameters;
    }
}
