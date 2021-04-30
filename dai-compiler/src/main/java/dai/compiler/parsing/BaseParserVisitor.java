package dai.compiler.parsing;

import dai.compiler.antlr.DaiParserBaseVisitor;

public class BaseParserVisitor<T> extends DaiParserBaseVisitor<T> {
    @Override
    protected T aggregateResult(T aggregate, T nextResult) {
        return nextResult == null ? aggregate : nextResult;
    }
}
