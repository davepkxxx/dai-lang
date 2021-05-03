package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;

import java.util.List;

public interface LiteralVisitor extends BaseVisitor {
    default LiteralExpression visitLiteralExpression(LiteralExpressionContext ctx) {
        LiteralExpression result = new LiteralExpression();
        this.accept(ctx.literal(), child -> child instanceof Literal ? (Literal) child : (Literal) null, result::setValue);
        return result;
    }

    default IntegerLiteral visitIntLiteral(IntLiteralContext ctx) {
        IntegerLiteral result = new IntegerLiteral();
        result.setValue(ctx.INT_LITERAL().getText());
        return result;
    }

    default LongLiteral visitLongLiteral(LongLiteralContext ctx) {
        LongLiteral result = new LongLiteral();
        result.setValue(ctx.LONG_LITERAL().getText());
        return result;
    }

    default FloatLiteral visitFloatLiteral(FloatLiteralContext ctx) {
        FloatLiteral result = new FloatLiteral();
        result.setValue(ctx.FLOAT_LITERAL().getText());
        return result;
    }

    default DoubleLiteral visitDoubleLiteral(DoubleLiteralContext ctx) {
        DoubleLiteral result = new DoubleLiteral();
        result.setValue(ctx.DOUBLE_LITERAL().getText());
        return result;
    }

    default CharacterLiteral visitCharLiteral(CharLiteralContext ctx) {
        CharacterLiteral result = new CharacterLiteral();
        result.setValue(ctx.CHAR_LITERAL().getText());
        return result;
    }

    default StringLiteral visitStringLiteral(StringLiteralContext ctx) {
        StringLiteral result = new StringLiteral();
        result.setValue(ctx.STRING_LITERAL().getText());
        return result;
    }

    default TrueLiteral visitTrueLiteral(TrueLiteralContext ctx) {
        return new TrueLiteral();
    }

    default FalseLiteral visitFalseLiteral(FalseLiteralContext ctx) {
        return new FalseLiteral();
    }

    default NullLiteral visitNullLiteral(NullLiteralContext ctx) {
        return new NullLiteral();
    }

    default ArrayLiteral visitArrayLiteral(ArrayLiteralContext ctx) {
        ArrayLiteral result = new ArrayLiteral();
        this.accept(ctx.expressions(), this::visitExpressions, result::setElements);
        return result;
    }

    default ObjectLiteral visitObjectLiteral(ObjectLiteralContext ctx) {
        ObjectLiteral result = new ObjectLiteral();
        this.accept(ctx.objectProperty(), this::visitObjectProperty, result.getProperties()::add);
        return result;
    }

    default ObjectPropertyNode visitObjectProperty(ObjectPropertyContext ctx) {
        ObjectPropertyNode result = new ObjectPropertyNode();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.expression(), this::visitExpression, result::setValue);
        return result;
    }

    Expression visitExpression(ExpressionContext ctx);

    List<Expression> visitExpressions(ExpressionsContext ctx);

    String visitIdentifier(IdentifierContext ctx);
}
