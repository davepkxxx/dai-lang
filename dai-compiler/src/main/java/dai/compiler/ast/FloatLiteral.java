package dai.compiler.ast;

import lombok.Data;

@Data
public class FloatLiteral implements Literal {
    private String value;
}
