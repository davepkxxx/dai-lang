package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ObjectLiteral implements Literal {
    private List<ObjectPropertyNode> properties = new ArrayList<>();
}
