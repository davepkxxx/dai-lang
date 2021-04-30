package dai.compiler.parsing;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public interface BaseVisitor extends ParseTreeVisitor {

    default <T, E extends ParseTree> T find(List<E> children, Function<E, T> mapper) {
        if (children != null)
            for (E child: children) {
                T result = this.map(child, mapper);
                if (result != null) return result;
            }
        return null;
    }

    default <T, E extends ParseTree> T map(E ctx, Function<E, T> mapper) {
        return ctx == null ? null : mapper.apply(ctx);
    }

    default <T, E extends ParseTree> List<T> map(List<E> children, Function<E, T> mapper) {
        List<T> container = new ArrayList<>();
        this.accept(children, mapper, container::add);
        return container;
    }

    default <T, E extends ParseTree> void accept(E ctx, Function<E, T> mapper, Consumer<T> action) {
        T result = this.map(ctx, mapper);
        if (result != null) action.accept(result);
    }

    default <T, E extends ParseTree> void accept(List<E> children, Function<E, T> mapper, Consumer<T> action) {
        if (children != null) children.forEach(child -> this.accept(child, mapper, action));
    }

    default ParsingException newParsingException(String msg, Token token) {
        throw new ParsingException(msg, token.getLine(), token.getCharPositionInLine());
    }
}
