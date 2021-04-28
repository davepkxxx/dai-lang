package dai.compiler.ast;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class ClassType extends AstNode {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private ClassType superType;
    @Getter
    @Setter
    List<ClassType> genericsParameters = new ArrayList<>();

}
