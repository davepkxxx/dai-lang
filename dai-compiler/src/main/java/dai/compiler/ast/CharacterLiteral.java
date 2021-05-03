package dai.compiler.ast;

import lombok.Data;

@Data
public class CharacterLiteral implements Literal {
    private String value;
}
