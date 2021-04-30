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
	 * Visit a parse tree produced by {@link DaiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DaiParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(DaiParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(DaiParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(DaiParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(DaiParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(DaiParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tryStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(DaiParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DaiParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(DaiParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(DaiParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(DaiParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(DaiParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(DaiParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(DaiParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link DaiParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(DaiParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(DaiParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(DaiParser.CatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DaiParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#switchCaseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseBlock(DaiParser.SwitchCaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#switchCaseLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseLabel(DaiParser.SwitchCaseLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(DaiParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#forInitDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitDeclaration(DaiParser.ForInitDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#variateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariateDeclaration(DaiParser.VariateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#variateDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariateDeclarators(DaiParser.VariateDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#variateDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariateDeclarator(DaiParser.VariateDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#funcDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclaration(DaiParser.FuncDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#funcParamsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParamsBlock(DaiParser.FuncParamsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#funcParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParams(DaiParser.FuncParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#funcParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParam(DaiParser.FuncParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#funcReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncReturn(DaiParser.FuncReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(DaiParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#enumFieldDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumFieldDeclarator(DaiParser.EnumFieldDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#enumFieldDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumFieldDeclarators(DaiParser.EnumFieldDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(DaiParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#extendsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsBlock(DaiParser.ExtendsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(DaiParser.ClassDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link DaiParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(DaiParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(DaiParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#abstractFuncDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractFuncDeclaration(DaiParser.AbstractFuncDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationDeclaration(DaiParser.AnnotationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#annotated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotated(DaiParser.AnnotatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementalExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementalExpression(DaiParser.IncrementalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(DaiParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(DaiParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(DaiParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(DaiParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code superExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpression(DaiParser.SuperExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(DaiParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(DaiParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseAndExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAndExpression(DaiParser.BitwiseAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(DaiParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(DaiParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(DaiParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(DaiParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(DaiParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(DaiParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(DaiParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectLiteralExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(DaiParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(DaiParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpression(DaiParser.MemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(DaiParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chainExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainExpression(DaiParser.ChainExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseOrExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOrExpression(DaiParser.BitwiseOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLiteralExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpression(DaiParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(DaiParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(DaiParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exclusiveOrExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(DaiParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link DaiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(DaiParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DaiParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(DaiParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(DaiParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(DaiParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#paramsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsBlock(DaiParser.ParamsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#namedParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedParam(DaiParser.NamedParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#namedParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedParams(DaiParser.NamedParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#namedParamsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedParamsBlock(DaiParser.NamedParamsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#assignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(DaiParser.AssignOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DaiParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(DaiParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code longLiteral}
	 * labeled alternative in {@link DaiParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongLiteral(DaiParser.LongLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link DaiParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(DaiParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DaiParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(DaiParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterLiteral}
	 * labeled alternative in {@link DaiParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterLiteral(DaiParser.CharacterLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link DaiParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(DaiParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link DaiParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(DaiParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link DaiParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(DaiParser.NullLiteralContext ctx);
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
	 * Visit a parse tree produced by {@link DaiParser#useType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseType(DaiParser.UseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#useTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseTypes(DaiParser.UseTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#useTypeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseTypeParam(DaiParser.UseTypeParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#useTypeParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseTypeParams(DaiParser.UseTypeParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#useTypeParamsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseTypeParamsBlock(DaiParser.UseTypeParamsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#declTypeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclTypeParam(DaiParser.DeclTypeParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#declTypeParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclTypeParams(DaiParser.DeclTypeParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#declTypeParamsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclTypeParamsBlock(DaiParser.DeclTypeParamsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#declTypeParamExtends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclTypeParamExtends(DaiParser.DeclTypeParamExtendsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaiParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(DaiParser.EosContext ctx);
}