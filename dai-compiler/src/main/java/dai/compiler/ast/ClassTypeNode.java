package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClassTypeNode implements AstNode {
    private String name;
    private ClassTypeNode superType;
    List<ClassTypeNode> genericsParameters = new ArrayList<>();

}
