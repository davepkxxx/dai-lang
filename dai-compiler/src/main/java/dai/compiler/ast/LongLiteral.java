package dai.compiler.ast;

import lombok.Data;

@Data
public class LongLiteral implements Literal {
    private String value;
}
