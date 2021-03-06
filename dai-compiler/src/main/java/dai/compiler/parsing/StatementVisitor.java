package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;
import dai.compiler.ast.VariableDeclaration.VariableKind;

import java.util.List;

public interface StatementVisitor extends BaseVisitor {

    default Statement visitStatement(StatementContext ctx) {
        return this.find(ctx.children, child -> {
            Object result = child.accept(this);
            return result instanceof Statement ? (Statement) result : (Statement) null;
        });
    }

    default PackageDeclaration visitPackageDeclaration(PackageDeclarationContext ctx) {
        if (ctx.PACKAGE() == null) return null;
        PackageDeclaration result = new PackageDeclaration();
        this.accept(ctx.identifierPath(), this::visitIdentifierPath, result::setName);
        return result;
    }

    default ImportDeclaration visitImportDeclaration(ImportDeclarationContext ctx) {
        if (ctx.IMPORT() == null) return null;
        ImportDeclaration result = new ImportDeclaration();
        this.accept(ctx.identifierPath(), this::visitIdentifierPath, result::setName);
        return result;
    }

    default BlockStatement visitBlockStatement(BlockStatementContext ctx) {
        BlockStatement result = new BlockStatement();
        this.accept(ctx.body(), this::visitBody, result::setBody);
        return result;
    }

    /* throw */

    default ThrowStatement visitThrowStatement(ThrowStatementContext ctx) {
        ThrowStatement result = new ThrowStatement();
        this.accept(ctx.expression(), this::visitExpression, result::setExpression);
        return result;
    }

    /* try */

    default TryStatement visitTryStatement(TryStatementContext ctx) {
        TryStatement result = new TryStatement();
        this.accept(ctx.body(), this::visitBody, result::setTryBody);
        this.accept(ctx.catchBlock(), this::visitCatchBlock, result.getCatches()::add);
        this.accept(ctx.finallyBody, this::visitBody, result::setFinallyBody);
        return result;
    }

    default CatchNode visitCatchBlock(CatchBlockContext ctx) {
        CatchNode result = new CatchNode();
        this.accept(ctx.variableDeclarator(), this::visitVariableDeclarator, result::setParameter);
        this.accept(ctx.body(), this::visitBody, result::setBody);
        return result;
    }

    /* if */

    default IfStatement visitIfStatement(IfStatementContext ctx) {
        IfStatement result = new IfStatement();
        this.accept(ctx.condition(), this::visitCondition, result::setCondition);
        this.accept(ctx.statement(), this::visitStatement, result::setConsequent);
        this.accept(ctx.elseStatement, this::visitStatement, result::setAlternate);
        return result;
    }

    default Expression visitCondition(ConditionContext ctx) {
        return this.map(ctx.expression(), this::visitExpression);
    }

    /* switch */

    default SwitchStatement visitSwitchStatement(SwitchStatementContext ctx) {
        SwitchStatement result = new SwitchStatement();
        this.accept(ctx.condition(), this::visitCondition, result::setCondition);
        this.accept(ctx.switchCaseBlock(), this::visitSwitchCaseBlock, result.getCases()::add);
        return result;
    }

    default SwitchCaseNode visitSwitchCaseBlock(SwitchCaseBlockContext ctx) {
        SwitchCaseNode result = new SwitchCaseNode();
        this.accept(ctx.switchCaseLabel(), this::visitSwitchCaseLabel, result.getLabels()::add);
        this.accept(ctx.statement(), this::visitStatement, result.getBody()::add);
        return result;
    }

    default SwitchCaseLabel visitSwitchCaseLabel(SwitchCaseLabelContext ctx) {
        SwitchCaseLabel result = new SwitchCaseLabel();
        result.setDefault(ctx.DEFAULT() != null);
        this.accept(ctx.expression(), this::visitExpression, result::setValue);
        return result;
    }

    /* while */

    default WhileStatement visitWhileStatement(WhileStatementContext ctx) {
        WhileStatement result = new WhileStatement();
        this.accept(ctx.condition(), this::visitCondition, result::setCondition);
        this.accept(ctx.statement(), this::visitStatement, result::setBody);
        return result;
    }

    default DoWhileStatement visitDoWhileStatement(DoWhileStatementContext ctx) {
        DoWhileStatement result = new DoWhileStatement();
        this.accept(ctx.condition(), this::visitCondition, result::setCondition);
        this.accept(ctx.statement(), this::visitStatement, result::setBody);
        return result;
    }

    /* for */

    default ForStatement visitForStatement(ForStatementContext ctx) {
        ForStatement result = new ForStatement();
        this.accept(ctx.forInit(), this::visitForInit, result::setInit);
        this.accept(ctx.expression(), this::visitExpression, result::setCondition);
        this.accept(ctx.expressions(), this::visitExpressions, result::setUpdate);
        this.accept(ctx.statement(), this::visitStatement, result::setBody);
        return result;
    }

    default ForInitNode visitForInit(ForInitContext ctx) {
        ForInitNode result = new ForInitNode();
        this.accept(ctx.forInitDeclaration(), this::visitForInitDeclaration, result::setDeclaration);
        this.accept(ctx.expressions(), this::visitExpressions, result::setExpressions);
        return result;
    }

    default VariableDeclaration visitForInitDeclaration(ForInitDeclarationContext ctx) {
        VariableDeclaration result = new VariableDeclaration();
        if (ctx.VAR() != null) result.setVariableKind(VariableKind.VAR);
        if (ctx.CONST() != null) result.setVariableKind(VariableKind.CONST);
        this.accept(ctx.variableDeclarators(), this::visitVariableDeclarators, result::setDeclarators);
        return result;
    }

    /* for...in */

    default ForInStatement visitForInStatement(ForInStatementContext ctx) {
        ForInStatement result = new ForInStatement();
        this.accept(ctx.expression(), this::visitExpression, result::setCollection);
        this.accept(ctx.element, this::visitIdentifier, result::setElement);
        this.accept(ctx.index, this::visitIdentifier, result::setIndex);
        this.accept(ctx.statement(), this::visitStatement, result::setBody);
        return result;
    }

    /* continue & break & return */

    default ContinueStatement visitContinueStatement(ContinueStatementContext ctx) {
        if (ctx.CONTINUE() == null) return null;
        return new ContinueStatement();
    }

    default BreakStatement visitBreakStatement(BreakStatementContext ctx) {
        if (ctx.BREAK() == null) return null;
        return new BreakStatement();
    }

    default ReturnStatement visitReturnStatement(ReturnStatementContext ctx) {
        ReturnStatement result = new ReturnStatement();
        this.accept(ctx.expression(), this::visitExpression, result::setExpression);
        return result;
    }

    /* expression */

    default ExpressionStatement visitExpressionStatement(ExpressionStatementContext ctx) {
        ExpressionStatement result = new ExpressionStatement();
        this.accept(ctx.expression(), this::visitExpression, result::setExpression);
        return result;
    }

    /* empty */

    default EmptyStatement visitEmptyStatement(EmptyStatementContext ctx) {
        if (ctx.SEMI() == null) return null;
        return new EmptyStatement();
    }

    List<VariableDeclarator> visitVariableDeclarators(VariableDeclaratorsContext ctx);

    VariableDeclarator visitVariableDeclarator(VariableDeclaratorContext ctx);

    String visitIdentifierPath(IdentifierPathContext ctx);

    String visitIdentifier(IdentifierContext ctx);

    List<Expression> visitExpressions(ExpressionsContext ctx);

    Expression visitExpression(ExpressionContext ctx);

    List<Statement> visitBody(BodyContext ctx);
}
