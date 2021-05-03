package dai.compiler.ast;

import lombok.Data;

@Data
public class DoubleLiteral implements Literal {
    private String value;
}
