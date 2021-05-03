package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ArrayLiteral implements Literal {
    private List<Expression> elements = new ArrayList<>();
}
