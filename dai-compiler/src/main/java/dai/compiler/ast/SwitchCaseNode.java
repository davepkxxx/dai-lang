package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SwitchCaseNode implements AstNode {
    private List<SwitchCaseLabel> labels = new ArrayList<>();
    private List<Statement> body = new ArrayList<>();
}
