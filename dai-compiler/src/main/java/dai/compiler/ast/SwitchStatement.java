package dai.compiler.ast;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SwitchStatement implements Statement {
    private Expression condition;
    private List<SwitchCaseNode> cases = new ArrayList<>();
}
