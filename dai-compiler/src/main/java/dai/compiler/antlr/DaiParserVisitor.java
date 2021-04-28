// Generated from DaiParser.g4 by ANTLR 4.9.2
package dai.compiler.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DaiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DaiParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DaiParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(DaiParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(DaiParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(DaiParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(DaiParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DaiParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DaiParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(DaiParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(DaiParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(DaiParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(DaiParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#variateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariateDeclaration(DaiParser.VariateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#variateDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariateDeclaratorList(DaiParser.VariateDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#variateDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariateDeclarator(DaiParser.VariateDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(DaiParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(DaiParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(DaiParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(DaiParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(DaiParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(DaiParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#enumFieldDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumFieldDeclarator(DaiParser.EnumFieldDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#enumFieldDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumFieldDeclaratorList(DaiParser.EnumFieldDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(DaiParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#structBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructBody(DaiParser.StructBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#extendsSnippet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsSnippet(DaiParser.ExtendsSnippetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(DaiParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(DaiParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(DaiParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(DaiParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#implementsSnippet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsSnippet(DaiParser.ImplementsSnippetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(DaiParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(DaiParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(DaiParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#abstractFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractFunctionDeclaration(DaiParser.AbstractFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationDeclaration(DaiParser.AnnotationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#annotationBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationBody(DaiParser.AnnotationBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(DaiParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(DaiParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DaiParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DaiParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(DaiParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#switchCaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseStatement(DaiParser.SwitchCaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#switchCaseLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseLabel(DaiParser.SwitchCaseLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(DaiParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(DaiParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(DaiParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(DaiParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(DaiParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#foreachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStatement(DaiParser.ForeachStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementalExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementalExpression(DaiParser.IncrementalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(DaiParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(DaiParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(DaiParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(DaiParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code superExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpression(DaiParser.SuperExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(DaiParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(DaiParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseAndExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAndExpression(DaiParser.BitwiseAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(DaiParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(DaiParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(DaiParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(DaiParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(DaiParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(DaiParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(DaiParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectLiteralExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(DaiParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(DaiParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpression(DaiParser.MemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(DaiParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chainExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainExpression(DaiParser.ChainExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseOrExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOrExpression(DaiParser.BitwiseOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLiteralExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpression(DaiParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(DaiParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(DaiParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exclusiveOrExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(DaiParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(DaiParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DaiParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(DaiParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(DaiParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#assignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(DaiParser.AssignOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DaiParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(DaiParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(DaiParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperty(DaiParser.ObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#objectPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectPropertyList(DaiParser.ObjectPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DaiParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#identifierPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierPath(DaiParser.IdentifierPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#genericsParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericsParameter(DaiParser.GenericsParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#genericsParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericsParameterList(DaiParser.GenericsParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#genericsParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericsParameters(DaiParser.GenericsParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(DaiParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#declareGenericsParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareGenericsParameter(DaiParser.DeclareGenericsParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#declareGenericsParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareGenericsParameterList(DaiParser.DeclareGenericsParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#declareGenericsParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareGenericsParameters(DaiParser.DeclareGenericsParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#declareGenericsParameterExtends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareGenericsParameterExtends(DaiParser.DeclareGenericsParameterExtendsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#declareGenericsParameterSuper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareGenericsParameterSuper(DaiParser.DeclareGenericsParameterSuperContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(DaiParser.EosContext ctx);
}