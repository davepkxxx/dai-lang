package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;
import dai.compiler.ast.AssignmentExpression.AssignmentOperator;
import dai.compiler.ast.BinaryExpression.BinaryOperator;
import dai.compiler.ast.UnaryExpression.UnaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface ExpressionVisitor extends BaseVisitor {

    default Expression visitExpression(ExpressionContext ctx) {
        Object result = ctx.accept(this);
        return result instanceof Expression ? (Expression) result : (Expression) null;
    }

    default List<Expression> visitExpressions(ExpressionsContext ctx) {
        return this.map(ctx.expression(), this::visitExpression);
    }

    default Expression visitParenthesizedExpression(ParenthesizedExpressionContext ctx) {
        return this.map(ctx.expression(), this::visitExpression);
    }

    /* super & this & identifier */

    default SuperExpression visitSuperExpression(SuperExpressionContext ctx) {
        return new SuperExpression();
    }

    default ThisExpression visitThisExpression(ThisExpressionContext ctx) {
        return new ThisExpression();
    }

    default IdentifierExpression visitIdentifierExpression(IdentifierExpressionContext ctx) {
        IdentifierExpression result = new IdentifierExpression();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        return result;
    }

    /* member chain */

    default MemberExpression visitMemberExpression(MemberExpressionContext ctx) {
        MemberExpression result = new MemberExpression();
        this.accept(ctx.object, this::visitExpression, result::setObject);
        this.accept(ctx.property, this::visitExpression, result::setProperty);
        return result;
    }

    default ChainExpression visitChainExpression(ChainExpressionContext ctx) {
        ChainExpression result = new ChainExpression();
        this.accept(ctx.expression(), this::visitExpression, result::setObject);
        this.accept(ctx.identifier(), this::visitIdentifier, result::setProperty);
        result.setOptionalChaining(ctx.QUESTION() != null);
        return result;
    }

    default NewExpression visitNewExpression(NewExpressionContext ctx) {
        NewExpression result = new NewExpression();
        this.accept(ctx.annotated(), this::visitAnnotated, result.getAnnotations()::add);
        this.accept(ctx.useType(), this::visitUseType, result::setClassType);
        this.accept(ctx.paramsBlock(), this::visitParamsBlock, result::setParameters);
        return result;
    }

    default CallExpression visitCallExpression(CallExpressionContext ctx) {
        CallExpression result = new CallExpression();
        this.accept(ctx.expression(), this::visitExpression, result::setFunction);
        this.accept(ctx.paramsBlock(), this::visitParamsBlock, result::setParameters);
        return result;
    }

    /* unary */

    default UnaryExpression visitIncrementalExpression(IncrementalExpressionContext ctx) {
        UnaryExpression result = new UnaryExpression();
        this.accept(ctx.expression(), this::visitExpression, result::setExpression);
        if (ctx.INCREMENT() != null) result.setOperator(UnaryOperator.INCREMENT);
        if (ctx.DECREMENT() != null) result.setOperator(UnaryOperator.DECREMENT);
        return result;
    }

    default UnaryExpression visitNotExpression(NotExpressionContext ctx) {
        UnaryExpression result = new UnaryExpression();
        this.accept(ctx.expression(), this::visitExpression, result::setExpression);
        if (ctx.LOGICAL_NOT() != null) result.setOperator(UnaryOperator.LOGIC_NOT);
        if (ctx.BITWISE_NOT() != null) result.setOperator(UnaryOperator.BITWISE_NOT);
        return result;
    }

    default UnaryExpression visitUnaryExpression(UnaryExpressionContext ctx) {
        UnaryExpression result = new UnaryExpression();
        this.accept(ctx.expression(), this::visitExpression, result::setExpression);
        if (ctx.ADDITION() != null) result.setOperator(UnaryOperator.UNARY_PLUS);
        if (ctx.SUBTRACTION() != null) result.setOperator(UnaryOperator.UNARY_NEGATION);
        return result;
    }

    /* binary */

    default BinaryExpression visitAdditiveExpression(AdditiveExpressionContext ctx) {
        BinaryExpression result = new BinaryExpression();
        this.accept(ctx.left, this::visitExpression, result::setLeft);
        this.accept(ctx.right, this::visitExpression, result::setRight);
        if (ctx.ADDITION() != null) result.setOperator(BinaryOperator.ADDITION);
        if (ctx.SUBTRACTION() != null) result.setOperator(BinaryOperator.SUBTRACTION);
        return result;
    }

    default BinaryExpression visitAndExpression(AndExpressionContext ctx) {
        BinaryExpression result = new BinaryExpression();
        this.accept(ctx.left, this::visitExpression, result::setLeft);
        this.accept(ctx.right, this::visitExpression, result::setRight);
        result.setOperator(BinaryOperator.LOGICAL_AND);
        return result;
    }

    default BinaryExpression visitBitwiseAndExpression(BitwiseAndExpressionContext ctx) {
        BinaryExpression result = new BinaryExpression();
        this.accept(ctx.left, this::visitExpression, result::setLeft);
        this.accept(ctx.right, this::visitExpression, result::setRight);
        result.setOperator(BinaryOperator.BITWISE_AND);
        return result;
    }

    default BinaryExpression visitEqualExpression(EqualExpressionContext ctx) {
        BinaryExpression result = new BinaryExpression();
        this.accept(ctx.left, this::visitExpression, result::setLeft);
        this.accept(ctx.right, this::visitExpression, result::setRight);
        if (ctx.EQUALITY() != null) result.setOperator(BinaryOperator.EQUALITY);
        if (ctx.INEQUALITY() != null) result.setOperator(BinaryOperator.INEQUALITY);
        return result;
    }

    default BinaryExpression visitShiftExpression(ShiftExpressionContext ctx) {
        BinaryExpression result = new BinaryExpression();
        this.accept(ctx.left, this::visitExpression, result::setLeft);
        this.accept(ctx.right, this::visitExpression, result::setRight);
        if (ctx.leftOper != null) result.setOperator(BinaryOperator.LEFT_SHIFT);
        if (ctx.rightOper != null) result.setOperator(BinaryOperator.RIGHT_SHIFT);
        return result;
    }

    default BinaryExpression visitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
        BinaryExpression result = new BinaryExpression();
        this.accept(ctx.left, this::visitExpression, result::setLeft);
        this.accept(ctx.right, this::visitExpression, result::setRight);
        if (ctx.MULTIPLICATION() != null) result.setOperator(BinaryOperator.MULTIPLICATION);
        if (ctx.DIVISION() != null) result.setOperator(BinaryOperator.DIVISION);
        if (ctx.REMAINDER() != null) result.setOperator(BinaryOperator.REMAINDER);
        return result;
    }

    default BinaryExpression visitOrExpression(OrExpressionContext ctx) {
        BinaryExpression result = new BinaryExpression();
        this.accept(ctx.left, this::visitExpression, result::setLeft);
        this.accept(ctx.right, this::visitExpression, result::setRight);
        result.setOperator(BinaryOperator.LOGICAL_OR);
        return result;
    }

    default BinaryExpression visitBitwiseOrExpression(BitwiseOrExpressionContext ctx) {
        BinaryExpression result = new BinaryExpression();
        this.accept(ctx.left, this::visitExpression, result::setLeft);
        this.accept(ctx.right, this::visitExpression, result::setRight);
        result.setOperator(BinaryOperator.BITWISE_OR);
        return result;
    }

    default BinaryExpression visitExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {
        BinaryExpression result = new BinaryExpression();
        this.accept(ctx.left, this::visitExpression, result::setLeft);
        this.accept(ctx.right, this::visitExpression, result::setRight);
        result.setOperator(BinaryOperator.EXCLUSIVE_OR);
        return result;
    }

    default BinaryExpression visitRelationalExpression(RelationalExpressionContext ctx) {
        BinaryExpression result = new BinaryExpression();
        this.accept(ctx.left, this::visitExpression, result::setLeft);
        this.accept(ctx.right, this::visitExpression, result::setRight);
        if (ctx.GREATER_THAN() != null) result.setOperator(BinaryOperator.GREATER_THAN);
        if (ctx.LESS_THAN() != null) result.setOperator(BinaryOperator.LESS_THAN);
        if (ctx.LESS_THAN_OR_EQUAL() != null) result.setOperator(BinaryOperator.LESS_THAN_OR_EQUAL);
        if (ctx.GREATER_THAN_OR_EQUAL() != null) result.setOperator(BinaryOperator.GREATER_THAN_OR_EQUAL);
        return result;
    }

    /* conditional expression */

    default ConditionalExpression visitConditionalExpression(ConditionalExpressionContext ctx) {
        ConditionalExpression result = new ConditionalExpression();
        this.accept(ctx.test, this::visitExpression, result::setCondition);
        this.accept(ctx.consequent, this::visitExpression, result::setConsequent);
        this.accept(ctx.alternate, this::visitExpression, result::setAlternate);
        return result;
    }

    /* assignment */

    default AssignmentExpression visitAssignExpression(AssignExpressionContext ctx) {
        AssignmentExpression result = new AssignmentExpression();
        this.accept(ctx.left, this::visitExpression, result::setLeft);
        this.accept(ctx.right, this::visitExpression, result::setRight);
        if (ctx.ASSIGNMENT() != null) result.setOperator(AssignmentOperator.ASSIGNMENT);
        if (ctx.ADDITION_ASSIGNMENT() != null) result.setOperator(AssignmentOperator.ADDITION_ASSIGNMENT);
        if (ctx.SUBTRACTION_ASSIGNMENT() != null) result.setOperator(AssignmentOperator.SUBTRACTION_ASSIGNMENT);
        if (ctx.MULTIPLICATION_ASSIGNMENT() != null) result.setOperator(AssignmentOperator.MULTIPLICATION_ASSIGNMENT);
        if (ctx.DIVISION_ASSIGNMENT() != null) result.setOperator(AssignmentOperator.DIVISION_ASSIGNMENT);
        if (ctx.AND_ASSIGNMENT() != null) result.setOperator(AssignmentOperator.AND_ASSIGNMENT);
        if (ctx.OR_ASSIGNMENT() != null) result.setOperator(AssignmentOperator.OR_ASSIGNMENT);
        if (ctx.EXCLUSIVE_OR_ASSIGNMENT() != null) result.setOperator(AssignmentOperator.EXCLUSIVE_OR_ASSIGNMENT);
        if (ctx.REMAINDER_ASSIGNMENT() != null) result.setOperator(AssignmentOperator.REMAINDER_ASSIGNMENT);
        if (ctx.LEFT_SHIFT_ASSIGNMENT() != null) result.setOperator(AssignmentOperator.LEFT_SHIFT_ASSIGNMENT);
        if (ctx.RIGHT_SHIFT_ASSIGNMENT() != null) result.setOperator(AssignmentOperator.RIGHT_SHIFT_ASSIGNMENT);
        return result;
    }

    /* lambda */

    default LambdaExpression visitLambdaExpression(LambdaExpressionContext ctx) {
        LambdaExpression result = new LambdaExpression();
        // parameters
        this.accept(ctx.funcParamsBlock(), this::visitFuncParamsBlock, result::setParameters);
        if (ctx.identifier() != null) {
            VariableDeclarator param = new VariableDeclarator();
            this.accept(ctx.identifier(), this::visitIdentifier, param::setName);
            result.setParameters(Collections.singletonList(param));
        };
        // body
        this.accept(ctx.body(), this::visitBody, result::setBody);
        if (ctx.expression() != null) {
            ReturnStatement stmt = new ReturnStatement();
            this.accept(ctx.expression(), this::visitExpression, stmt::setExpression);
            result.setBody(Collections.singletonList(stmt));
        }
        return result;
    }

    AnnotatedNode visitAnnotated(AnnotatedContext ctx);

    List<Statement> visitBody(BodyContext ctx);

    List<VariableDeclarator> visitFuncParamsBlock(FuncParamsBlockContext ctx);

    List<ParameterNode> visitParamsBlock(ParamsBlockContext ctx);

    ClassTypeNode visitUseType(UseTypeContext ctx);

    String visitIdentifier(IdentifierContext ctx);
}
