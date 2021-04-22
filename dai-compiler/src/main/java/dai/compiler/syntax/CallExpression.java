package dai.compiler.syntax;

import java.util.ArrayList;
import java.util.List;

public class CallExpression extends Expression {

    private Expression callee;

    private List<Expression> arguments = new ArrayList<>();

}
