package dai.compiler.parsing;

import dai.compiler.antlr.DaiParserBaseVisitor;
import dai.compiler.ast.AstNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.function.Consumer;

public class BaseParserVisitor extends DaiParserBaseVisitor<AstNode> {

    public void visitChildren(RuleNode node, Consumer<AstNode> fn) {
        int n = node.getChildCount();
        for (int i = 0; i < n; i++) {
            ParseTree c = node.getChild(i);
            AstNode childResult = c.accept(this);
            fn.accept(childResult);
        }
    }

    @Override
    protected AstNode aggregateResult(AstNode aggregate, AstNode nextResult) {
        return nextResult == null ? aggregate : nextResult;
    }
}
