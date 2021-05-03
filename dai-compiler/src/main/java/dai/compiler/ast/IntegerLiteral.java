package dai.compiler.ast;

import lombok.Data;

@Data
public class IntegerLiteral implements Literal {
    private String value;
}
