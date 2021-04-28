package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;

import java.util.regex.Pattern;

public interface IdentifierVisitor extends BaseVisitor {

    default String visitIdentifier(IdentifierContext ctx) {
        String val = ctx.IDENTIFIER().getText();
        if (Pattern.matches("^[A-Z][A-Z]+$", val))
            throw this.newParsingException(String.format("Unexpected keyword '%s'", val), ctx.start);
        return val;
    }

    default String visitIdentifierPath(IdentifierPathContext ctx) {
        StringBuilder path = new StringBuilder();
        this.accept(ctx.identifier(), this::visitIdentifier, id -> {
            if (path.length() > 0) path.append('.');
            path.append(id);
        });
        return path.toString();
    }
}
