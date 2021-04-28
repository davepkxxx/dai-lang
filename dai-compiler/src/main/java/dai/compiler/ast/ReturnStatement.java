package dai.compiler.ast;

import lombok.Getter;
import lombok.Setter;

public class ReturnStatement extends Statement {
    @Getter
    @Setter
    private Expression expression;
}
