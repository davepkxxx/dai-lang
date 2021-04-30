package dai.compiler.ast;

import lombok.Data;

@Data
public class SwitchCaseLabel implements AstNode {
    private boolean isDefault;
    private Expression value;
}
