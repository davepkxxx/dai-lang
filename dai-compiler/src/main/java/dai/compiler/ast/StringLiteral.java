package dai.compiler.ast;

import lombok.Data;

@Data
public class StringLiteral implements Literal {
    private String value;
}
