// Generated from DaiParser.g4 by ANTLR 4.9.2
package dai.compiler.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DaiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PACKAGE=1, IMPORT=2, VAR=3, CONST=4, NULL=5, TRUE=6, FALSE=7, THROW=8, 
		TRY=9, CATCH=10, FINALLY=11, IF=12, ELSE=13, SWITCH=14, CASE=15, DEFAULT=16, 
		LOOP=17, DO=18, WHILE=19, FOR=20, IN=21, CONTINUE=22, BREAK=23, FUNC=24, 
		RETURN=25, VOID=26, ENUM=27, STRUCT=28, CLASS=29, EXTENDS=30, NEW=31, 
		CONSTRUCTOR=32, THIS=33, SUPER=34, INTERFACE=35, IMPLEMENTS=36, ANNOTATION=37, 
		INTEGER_LITERAL=38, LONG_LITERAL=39, FLOAT_LITERAL=40, DOUBLE_LITERAL=41, 
		CHARACTER_LITERAL=42, STRING_LITERAL=43, BOOLEAN_LITERAL=44, NULL_LITERAL=45, 
		NOT=46, TILDE=47, QUESTION=48, EQUALITY=49, INEQUALITY=50, GREATER_THAN=51, 
		LESS_THAN=52, LESS_THAN_OR_EQUAL=53, GREATER_THAN_OR_EQUAL=54, AND=55, 
		OR=56, INCREMENT=57, DECREMENT=58, ADDITION=59, SUBTRACTION=60, MULTIPLICATION=61, 
		DIVISION=62, BITWISE_AND=63, BITWISE_OR=64, EXCLUSIVE_OR=65, REMAINDER=66, 
		ASSIGNMENT=67, ADDITION_ASSIGNMENT=68, SUBTRACTION_ASSIGNMENT=69, MULTIPLICATION_ASSIGNMENT=70, 
		DIVISION_ASSIGNMENT=71, AND_ASSIGNMENT=72, OR_ASSIGNMENT=73, EXCLUSIVE_OR_ASSIGNMENT=74, 
		REMAINDER_ASSIGNMENT=75, LEFT_SHIFT_ASSIGNMENT=76, RIGHT_SHIFT_ASSIGNMENT=77, 
		ARROW=78, LEFT_PAREN=79, RIGHT_PAREN=80, LEFT_BRACE=81, RIGHT_BRACE=82, 
		LEFT_BRACK=83, RIGHT_BRACK=84, WS=85, NL=86, COMMENT=87, LINE_COMMENT=88, 
		DOT=89, COMMA=90, SEMI=91, COLON=92, AT=93, ELLIPSIS=94, IDENTIFIER=95;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_statement = 3, RULE_stmt = 4, RULE_body = 5, RULE_catchBlock = 6, 
		RULE_condition = 7, RULE_switchCaseBlock = 8, RULE_switchCaseLabel = 9, 
		RULE_forInit = 10, RULE_forInitDeclaration = 11, RULE_variateDeclaration = 12, 
		RULE_variateDeclarators = 13, RULE_variateDeclarator = 14, RULE_funcDeclaration = 15, 
		RULE_funcParamsBlock = 16, RULE_funcParams = 17, RULE_funcParam = 18, 
		RULE_funcReturn = 19, RULE_enumDeclaration = 20, RULE_enumFieldDeclarator = 21, 
		RULE_enumFieldDeclarators = 22, RULE_structDeclaration = 23, RULE_extendsBlock = 24, 
		RULE_classDeclaration = 25, RULE_classMemberDeclaration = 26, RULE_constructorDeclaration = 27, 
		RULE_interfaceDeclaration = 28, RULE_interfaceMemberDeclaration = 29, 
		RULE_abstractFuncDeclaration = 30, RULE_annotationDeclaration = 31, RULE_annotated = 32, 
		RULE_expr = 33, RULE_expression = 34, RULE_expressions = 35, RULE_param = 36, 
		RULE_params = 37, RULE_paramsBlock = 38, RULE_namedParam = 39, RULE_namedParams = 40, 
		RULE_namedParamsBlock = 41, RULE_assignOperator = 42, RULE_literal = 43, 
		RULE_arrayLiteral = 44, RULE_objectLiteral = 45, RULE_objectProperty = 46, 
		RULE_identifier = 47, RULE_identifierPath = 48, RULE_useType = 49, RULE_useTypes = 50, 
		RULE_useTypeParam = 51, RULE_useTypeParams = 52, RULE_useTypeParamsBlock = 53, 
		RULE_declTypeParam = 54, RULE_declTypeParams = 55, RULE_declTypeParamsBlock = 56, 
		RULE_declTypeParamExtends = 57, RULE_eos = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "statement", 
			"stmt", "body", "catchBlock", "condition", "switchCaseBlock", "switchCaseLabel", 
			"forInit", "forInitDeclaration", "variateDeclaration", "variateDeclarators", 
			"variateDeclarator", "funcDeclaration", "funcParamsBlock", "funcParams", 
			"funcParam", "funcReturn", "enumDeclaration", "enumFieldDeclarator", 
			"enumFieldDeclarators", "structDeclaration", "extendsBlock", "classDeclaration", 
			"classMemberDeclaration", "constructorDeclaration", "interfaceDeclaration", 
			"interfaceMemberDeclaration", "abstractFuncDeclaration", "annotationDeclaration", 
			"annotated", "expr", "expression", "expressions", "param", "params", 
			"paramsBlock", "namedParam", "namedParams", "namedParamsBlock", "assignOperator", 
			"literal", "arrayLiteral", "objectLiteral", "objectProperty", "identifier", 
			"identifierPath", "useType", "useTypes", "useTypeParam", "useTypeParams", 
			"useTypeParamsBlock", "declTypeParam", "declTypeParams", "declTypeParamsBlock", 
			"declTypeParamExtends", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PACKAGE'", "'IMPORT'", "'VAR'", "'CONST'", "'NULL'", "'TRUE'", 
			"'FALSE'", "'THROW'", "'TRY'", "'CATCH'", "'FINALLY'", "'IF'", "'ELSE'", 
			"'SWITCH'", "'CASE'", "'DEFAULT'", "'LOOP'", "'DO'", "'WHILE'", "'FOR'", 
			"'IN'", "'CONTINUE'", "'BREAK'", "'FUNC'", "'RETURN'", "'VOID'", "'ENUM'", 
			"'STRUCT'", "'CLASS'", "'EXTENDS'", "'NEW'", "'CONSTRUCTOR'", "'THIS'", 
			"'SUPER'", "'INTERFACE'", "'IMPLEMENTS'", "'ANNOTATION'", null, null, 
			null, null, null, null, null, null, "'!'", "'~'", "'?'", "'=='", "'!='", 
			"'>'", "'<'", "'<='", "'>='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'=>'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", null, null, null, null, "'.'", 
			"','", "';'", "':'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PACKAGE", "IMPORT", "VAR", "CONST", "NULL", "TRUE", "FALSE", "THROW", 
			"TRY", "CATCH", "FINALLY", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"LOOP", "DO", "WHILE", "FOR", "IN", "CONTINUE", "BREAK", "FUNC", "RETURN", 
			"VOID", "ENUM", "STRUCT", "CLASS", "EXTENDS", "NEW", "CONSTRUCTOR", "THIS", 
			"SUPER", "INTERFACE", "IMPLEMENTS", "ANNOTATION", "INTEGER_LITERAL", 
			"LONG_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", "CHARACTER_LITERAL", 
			"STRING_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", "NOT", "TILDE", 
			"QUESTION", "EQUALITY", "INEQUALITY", "GREATER_THAN", "LESS_THAN", "LESS_THAN_OR_EQUAL", 
			"GREATER_THAN_OR_EQUAL", "AND", "OR", "INCREMENT", "DECREMENT", "ADDITION", 
			"SUBTRACTION", "MULTIPLICATION", "DIVISION", "BITWISE_AND", "BITWISE_OR", 
			"EXCLUSIVE_OR", "REMAINDER", "ASSIGNMENT", "ADDITION_ASSIGNMENT", "SUBTRACTION_ASSIGNMENT", 
			"MULTIPLICATION_ASSIGNMENT", "DIVISION_ASSIGNMENT", "AND_ASSIGNMENT", 
			"OR_ASSIGNMENT", "EXCLUSIVE_OR_ASSIGNMENT", "REMAINDER_ASSIGNMENT", "LEFT_SHIFT_ASSIGNMENT", 
			"RIGHT_SHIFT_ASSIGNMENT", "ARROW", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", 
			"RIGHT_BRACE", "LEFT_BRACK", "RIGHT_BRACK", "WS", "NL", "COMMENT", "LINE_COMMENT", 
			"DOT", "COMMA", "SEMI", "COLON", "AT", "ELLIPSIS", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DaiParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DaiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DaiParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(118);
				packageDeclaration();
				}
				break;
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(121);
				importDeclaration();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << ANNOTATION) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LEFT_PAREN - 79)) | (1L << (LEFT_BRACE - 79)) | (1L << (LEFT_BRACK - 79)) | (1L << (SEMI - 79)) | (1L << (AT - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
				{
				{
				setState(127);
				statement();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(DaiParser.PACKAGE, 0); }
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(135);
				annotated();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(PACKAGE);
			setState(142);
			identifierPath();
			setState(143);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(DaiParser.IMPORT, 0); }
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(IMPORT);
			setState(146);
			identifierPath();
			setState(147);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public VariateDeclarationContext variateDeclaration() {
			return getRuleContext(VariateDeclarationContext.class,0);
		}
		public FuncDeclarationContext funcDeclaration() {
			return getRuleContext(FuncDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationDeclarationContext annotationDeclaration() {
			return getRuleContext(AnnotationDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				variateDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				funcDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				enumDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				structDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				interfaceDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				annotationDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyStatementContext extends StmtContext {
		public TerminalNode SEMI() { return getToken(DaiParser.SEMI, 0); }
		public EmptyStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TryStatementContext extends StmtContext {
		public BodyContext finallyBody;
		public TerminalNode TRY() { return getToken(DaiParser.TRY, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public TryStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementContext extends StmtContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BlockStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThrowStatementContext extends StmtContext {
		public TerminalNode THROW() { return getToken(DaiParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStatementContext extends StmtContext {
		public TerminalNode BREAK() { return getToken(DaiParser.BREAK, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public BreakStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StmtContext {
		public TerminalNode FOR() { return getToken(DaiParser.FOR, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(DaiParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DaiParser.SEMI, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ForStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StmtContext {
		public TerminalNode RETURN() { return getToken(DaiParser.RETURN, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StmtContext {
		public StatementContext elseStatement;
		public TerminalNode IF() { return getToken(DaiParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DaiParser.ELSE, 0); }
		public IfStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchStatementContext extends StmtContext {
		public TerminalNode SWITCH() { return getToken(DaiParser.SWITCH, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<SwitchCaseBlockContext> switchCaseBlock() {
			return getRuleContexts(SwitchCaseBlockContext.class);
		}
		public SwitchCaseBlockContext switchCaseBlock(int i) {
			return getRuleContext(SwitchCaseBlockContext.class,i);
		}
		public SwitchStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementContext extends StmtContext {
		public TerminalNode WHILE() { return getToken(DaiParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInStatementContext extends StmtContext {
		public IdentifierContext element;
		public IdentifierContext index;
		public TerminalNode FOR() { return getToken(DaiParser.FOR, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public TerminalNode IN() { return getToken(DaiParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public ForInStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementContext extends StmtContext {
		public TerminalNode CONTINUE() { return getToken(DaiParser.CONTINUE, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ContinueStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileStatementContext extends StmtContext {
		public TerminalNode DO() { return getToken(DaiParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(DaiParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoWhileStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStatementContext extends StmtContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				body();
				}
				break;
			case 2:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(CONTINUE);
				setState(161);
				eos();
				}
				break;
			case 3:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(BREAK);
				setState(163);
				eos();
				}
				break;
			case 4:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(RETURN);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LEFT_PAREN - 79)) | (1L << (LEFT_BRACE - 79)) | (1L << (LEFT_BRACK - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
					{
					setState(165);
					expression();
					}
				}

				setState(168);
				eos();
				}
				break;
			case 5:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(THROW);
				setState(170);
				expression();
				setState(171);
				eos();
				}
				break;
			case 6:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(TRY);
				setState(174);
				body();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(175);
					catchBlock();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(181);
					((TryStatementContext)_localctx).finallyBody = body();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				match(IF);
				setState(185);
				condition();
				setState(186);
				statement();
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(187);
					match(ELSE);
					setState(188);
					((IfStatementContext)_localctx).elseStatement = statement();
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(191);
				match(SWITCH);
				setState(192);
				condition();
				setState(193);
				match(LEFT_BRACE);
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(194);
					switchCaseBlock();
					}
					}
					setState(197); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE || _la==DEFAULT );
				setState(199);
				match(RIGHT_BRACE);
				}
				break;
			case 9:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(201);
				match(WHILE);
				setState(202);
				condition();
				setState(203);
				statement();
				}
				break;
			case 10:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(205);
				match(DO);
				setState(206);
				statement();
				setState(207);
				match(WHILE);
				setState(208);
				condition();
				setState(209);
				eos();
				}
				break;
			case 11:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(211);
				match(FOR);
				setState(212);
				match(LEFT_PAREN);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LEFT_PAREN - 79)) | (1L << (LEFT_BRACE - 79)) | (1L << (LEFT_BRACK - 79)) | (1L << (AT - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
					{
					setState(213);
					forInit();
					}
				}

				setState(216);
				match(SEMI);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LEFT_PAREN - 79)) | (1L << (LEFT_BRACE - 79)) | (1L << (LEFT_BRACK - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
					{
					setState(217);
					expression();
					}
				}

				setState(220);
				match(SEMI);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LEFT_PAREN - 79)) | (1L << (LEFT_BRACE - 79)) | (1L << (LEFT_BRACK - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
					{
					setState(221);
					expressions();
					}
				}

				setState(224);
				match(RIGHT_PAREN);
				setState(225);
				statement();
				}
				break;
			case 12:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(226);
				match(FOR);
				setState(227);
				match(LEFT_PAREN);
				setState(228);
				((ForInStatementContext)_localctx).element = identifier();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(229);
					match(COMMA);
					setState(230);
					((ForInStatementContext)_localctx).index = identifier();
					}
				}

				setState(233);
				match(IN);
				setState(234);
				expression();
				setState(235);
				match(RIGHT_PAREN);
				setState(236);
				statement();
				}
				break;
			case 13:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(238);
				expression();
				setState(239);
				eos();
				}
				break;
			case 14:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(241);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(LEFT_BRACE);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << ANNOTATION) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LEFT_PAREN - 79)) | (1L << (LEFT_BRACE - 79)) | (1L << (LEFT_BRACK - 79)) | (1L << (SEMI - 79)) | (1L << (AT - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
				{
				{
				setState(245);
				statement();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchBlockContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(DaiParser.CATCH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public VariateDeclaratorContext variateDeclarator() {
			return getRuleContext(VariateDeclaratorContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public CatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitCatchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchBlockContext catchBlock() throws RecognitionException {
		CatchBlockContext _localctx = new CatchBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_catchBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(CATCH);
			setState(254);
			match(LEFT_PAREN);
			setState(255);
			variateDeclarator();
			setState(256);
			match(RIGHT_PAREN);
			setState(257);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(LEFT_PAREN);
			setState(260);
			expression();
			setState(261);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseBlockContext extends ParserRuleContext {
		public List<SwitchCaseLabelContext> switchCaseLabel() {
			return getRuleContexts(SwitchCaseLabelContext.class);
		}
		public SwitchCaseLabelContext switchCaseLabel(int i) {
			return getRuleContext(SwitchCaseLabelContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SwitchCaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCaseBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitSwitchCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseBlockContext switchCaseBlock() throws RecognitionException {
		SwitchCaseBlockContext _localctx = new SwitchCaseBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_switchCaseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				switchCaseLabel();
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				statement();
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << ANNOTATION) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LEFT_PAREN - 79)) | (1L << (LEFT_BRACE - 79)) | (1L << (LEFT_BRACK - 79)) | (1L << (SEMI - 79)) | (1L << (AT - 79)) | (1L << (IDENTIFIER - 79)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(DaiParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DaiParser.COLON, 0); }
		public TerminalNode DEFAULT() { return getToken(DaiParser.DEFAULT, 0); }
		public SwitchCaseLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCaseLabel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitSwitchCaseLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseLabelContext switchCaseLabel() throws RecognitionException {
		SwitchCaseLabelContext _localctx = new SwitchCaseLabelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_switchCaseLabel);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(CASE);
				setState(274);
				expression();
				setState(275);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(DEFAULT);
				setState(278);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ForInitDeclarationContext forInitDeclaration() {
			return getRuleContext(ForInitDeclarationContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forInit);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case CONST:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				forInitDeclaration();
				}
				break;
			case NEW:
			case THIS:
			case SUPER:
			case INTEGER_LITERAL:
			case LONG_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case NULL_LITERAL:
			case NOT:
			case TILDE:
			case ADDITION:
			case SUBTRACTION:
			case LEFT_PAREN:
			case LEFT_BRACE:
			case LEFT_BRACK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				expressions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitDeclarationContext extends ParserRuleContext {
		public VariateDeclaratorsContext variateDeclarators() {
			return getRuleContext(VariateDeclaratorsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(DaiParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(DaiParser.CONST, 0); }
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public ForInitDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitForInitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitDeclarationContext forInitDeclaration() throws RecognitionException {
		ForInitDeclarationContext _localctx = new ForInitDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forInitDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(285);
				annotated();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(292);
			variateDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariateDeclarationContext extends ParserRuleContext {
		public VariateDeclaratorsContext variateDeclarators() {
			return getRuleContext(VariateDeclaratorsContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode VAR() { return getToken(DaiParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(DaiParser.CONST, 0); }
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public VariateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variateDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitVariateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariateDeclarationContext variateDeclaration() throws RecognitionException {
		VariateDeclarationContext _localctx = new VariateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variateDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(294);
				annotated();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(301);
			variateDeclarators();
			setState(302);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariateDeclaratorsContext extends ParserRuleContext {
		public List<VariateDeclaratorContext> variateDeclarator() {
			return getRuleContexts(VariateDeclaratorContext.class);
		}
		public VariateDeclaratorContext variateDeclarator(int i) {
			return getRuleContext(VariateDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaiParser.COMMA, i);
		}
		public VariateDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variateDeclarators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitVariateDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariateDeclaratorsContext variateDeclarators() throws RecognitionException {
		VariateDeclaratorsContext _localctx = new VariateDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variateDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			variateDeclarator();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(305);
				match(COMMA);
				setState(306);
				variateDeclarator();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariateDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DaiParser.COLON, 0); }
		public UseTypeContext useType() {
			return getRuleContext(UseTypeContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(DaiParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariateDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variateDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitVariateDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariateDeclaratorContext variateDeclarator() throws RecognitionException {
		VariateDeclaratorContext _localctx = new VariateDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variateDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			identifier();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(313);
				match(COLON);
				setState(314);
				useType();
				}
			}

			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(317);
				match(ASSIGNMENT);
				setState(318);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(DaiParser.FUNC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FuncParamsBlockContext funcParamsBlock() {
			return getRuleContext(FuncParamsBlockContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public DeclTypeParamsBlockContext declTypeParamsBlock() {
			return getRuleContext(DeclTypeParamsBlockContext.class,0);
		}
		public FuncReturnContext funcReturn() {
			return getRuleContext(FuncReturnContext.class,0);
		}
		public FuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFuncDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclarationContext funcDeclaration() throws RecognitionException {
		FuncDeclarationContext _localctx = new FuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(321);
				annotated();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			match(FUNC);
			setState(328);
			identifier();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(329);
				declTypeParamsBlock();
				}
			}

			setState(332);
			funcParamsBlock();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(333);
				funcReturn();
				}
			}

			setState(336);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncParamsBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public FuncParamsContext funcParams() {
			return getRuleContext(FuncParamsContext.class,0);
		}
		public FuncParamsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParamsBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFuncParamsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamsBlockContext funcParamsBlock() throws RecognitionException {
		FuncParamsBlockContext _localctx = new FuncParamsBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcParamsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(LEFT_PAREN);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENTIFIER) {
				{
				setState(339);
				funcParams();
				}
			}

			setState(342);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncParamsContext extends ParserRuleContext {
		public List<FuncParamContext> funcParam() {
			return getRuleContexts(FuncParamContext.class);
		}
		public FuncParamContext funcParam(int i) {
			return getRuleContext(FuncParamContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public FuncParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFuncParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamsContext funcParams() throws RecognitionException {
		FuncParamsContext _localctx = new FuncParamsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			funcParam();
			{
			setState(345);
			match(COMMA);
			setState(346);
			funcParam();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncParamContext extends ParserRuleContext {
		public VariateDeclaratorContext variateDeclarator() {
			return getRuleContext(VariateDeclaratorContext.class,0);
		}
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public FuncParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFuncParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamContext funcParam() throws RecognitionException {
		FuncParamContext _localctx = new FuncParamContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(348);
				annotated();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			variateDeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncReturnContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(DaiParser.COLON, 0); }
		public UseTypeContext useType() {
			return getRuleContext(UseTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(DaiParser.VOID, 0); }
		public FuncReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcReturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFuncReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncReturnContext funcReturn() throws RecognitionException {
		FuncReturnContext _localctx = new FuncReturnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(COLON);
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(357);
				useType();
				}
				break;
			case VOID:
				{
				setState(358);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(DaiParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public EnumFieldDeclaratorsContext enumFieldDeclarators() {
			return getRuleContext(EnumFieldDeclaratorsContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(DaiParser.LESS_THAN, 0); }
		public UseTypeParamContext useTypeParam() {
			return getRuleContext(UseTypeParamContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(DaiParser.GREATER_THAN, 0); }
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(361);
				annotated();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(ENUM);
			setState(368);
			identifier();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(369);
				match(LESS_THAN);
				setState(370);
				useTypeParam();
				setState(371);
				match(GREATER_THAN);
				}
			}

			setState(375);
			match(LEFT_BRACE);
			setState(376);
			enumFieldDeclarators();
			setState(377);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumFieldDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(DaiParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumFieldDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumFieldDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitEnumFieldDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumFieldDeclaratorContext enumFieldDeclarator() throws RecognitionException {
		EnumFieldDeclaratorContext _localctx = new EnumFieldDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumFieldDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(379);
				annotated();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
			identifier();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(386);
				match(ASSIGNMENT);
				setState(387);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumFieldDeclaratorsContext extends ParserRuleContext {
		public List<EnumFieldDeclaratorContext> enumFieldDeclarator() {
			return getRuleContexts(EnumFieldDeclaratorContext.class);
		}
		public EnumFieldDeclaratorContext enumFieldDeclarator(int i) {
			return getRuleContext(EnumFieldDeclaratorContext.class,i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaiParser.COMMA, i);
		}
		public EnumFieldDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumFieldDeclarators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitEnumFieldDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumFieldDeclaratorsContext enumFieldDeclarators() throws RecognitionException {
		EnumFieldDeclaratorsContext _localctx = new EnumFieldDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumFieldDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			enumFieldDeclarator();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(391);
				match(COMMA);
				setState(392);
				enumFieldDeclarator();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(DaiParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public DeclTypeParamsBlockContext declTypeParamsBlock() {
			return getRuleContext(DeclTypeParamsBlockContext.class,0);
		}
		public ExtendsBlockContext extendsBlock() {
			return getRuleContext(ExtendsBlockContext.class,0);
		}
		public List<VariateDeclarationContext> variateDeclaration() {
			return getRuleContexts(VariateDeclarationContext.class);
		}
		public VariateDeclarationContext variateDeclaration(int i) {
			return getRuleContext(VariateDeclarationContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(400);
				annotated();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			match(STRUCT);
			setState(407);
			identifier();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(408);
				declTypeParamsBlock();
				}
			}

			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(411);
				extendsBlock();
				}
			}

			setState(414);
			match(LEFT_BRACE);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==CONST || _la==AT) {
				{
				{
				setState(415);
				variateDeclaration();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsBlockContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(DaiParser.EXTENDS, 0); }
		public UseTypeContext useType() {
			return getRuleContext(UseTypeContext.class,0);
		}
		public ExtendsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitExtendsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsBlockContext extendsBlock() throws RecognitionException {
		ExtendsBlockContext _localctx = new ExtendsBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_extendsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(423);
			match(EXTENDS);
			setState(424);
			useType();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public UseTypesContext implTypes;
		public TerminalNode CLASS() { return getToken(DaiParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public DeclTypeParamsBlockContext declTypeParamsBlock() {
			return getRuleContext(DeclTypeParamsBlockContext.class,0);
		}
		public ExtendsBlockContext extendsBlock() {
			return getRuleContext(ExtendsBlockContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(DaiParser.IMPLEMENTS, 0); }
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public UseTypesContext useTypes() {
			return getRuleContext(UseTypesContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(426);
				annotated();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			match(CLASS);
			setState(433);
			identifier();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(434);
				declTypeParamsBlock();
				}
			}

			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(437);
				extendsBlock();
				}
			}

			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(440);
				match(IMPLEMENTS);
				setState(441);
				((ClassDeclarationContext)_localctx).implTypes = useTypes();
				}
			}

			setState(444);
			match(LEFT_BRACE);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << FUNC) | (1L << CONSTRUCTOR))) != 0) || _la==AT) {
				{
				{
				setState(445);
				classMemberDeclaration();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public VariateDeclarationContext variateDeclaration() {
			return getRuleContext(VariateDeclarationContext.class,0);
		}
		public FuncDeclarationContext funcDeclaration() {
			return getRuleContext(FuncDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classMemberDeclaration);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				variateDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				funcDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(DaiParser.CONSTRUCTOR, 0); }
		public FuncParamsBlockContext funcParamsBlock() {
			return getRuleContext(FuncParamsBlockContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(458);
				annotated();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
			match(CONSTRUCTOR);
			setState(465);
			funcParamsBlock();
			setState(466);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(DaiParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public DeclTypeParamsBlockContext declTypeParamsBlock() {
			return getRuleContext(DeclTypeParamsBlockContext.class,0);
		}
		public ExtendsBlockContext extendsBlock() {
			return getRuleContext(ExtendsBlockContext.class,0);
		}
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(468);
				annotated();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(INTERFACE);
			setState(475);
			identifier();
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(476);
				declTypeParamsBlock();
				}
			}

			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(479);
				extendsBlock();
				}
			}

			setState(482);
			match(LEFT_BRACE);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << FUNC))) != 0) || _la==AT) {
				{
				{
				setState(483);
				interfaceMemberDeclaration();
				}
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(489);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public VariateDeclarationContext variateDeclaration() {
			return getRuleContext(VariateDeclarationContext.class,0);
		}
		public FuncDeclarationContext funcDeclaration() {
			return getRuleContext(FuncDeclarationContext.class,0);
		}
		public AbstractFuncDeclarationContext abstractFuncDeclaration() {
			return getRuleContext(AbstractFuncDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceMemberDeclaration);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				variateDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				funcDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				abstractFuncDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractFuncDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(DaiParser.FUNC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FuncParamsBlockContext funcParamsBlock() {
			return getRuleContext(FuncParamsBlockContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public DeclTypeParamsBlockContext declTypeParamsBlock() {
			return getRuleContext(DeclTypeParamsBlockContext.class,0);
		}
		public FuncReturnContext funcReturn() {
			return getRuleContext(FuncReturnContext.class,0);
		}
		public AbstractFuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractFuncDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAbstractFuncDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractFuncDeclarationContext abstractFuncDeclaration() throws RecognitionException {
		AbstractFuncDeclarationContext _localctx = new AbstractFuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_abstractFuncDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(496);
				annotated();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(502);
			match(FUNC);
			setState(503);
			identifier();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(504);
				declTypeParamsBlock();
				}
			}

			setState(507);
			funcParamsBlock();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(508);
				funcReturn();
				}
			}

			setState(511);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationDeclarationContext extends ParserRuleContext {
		public TerminalNode ANNOTATION() { return getToken(DaiParser.ANNOTATION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public List<VariateDeclarationContext> variateDeclaration() {
			return getRuleContexts(VariateDeclarationContext.class);
		}
		public VariateDeclarationContext variateDeclaration(int i) {
			return getRuleContext(VariateDeclarationContext.class,i);
		}
		public AnnotationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAnnotationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationDeclarationContext annotationDeclaration() throws RecognitionException {
		AnnotationDeclarationContext _localctx = new AnnotationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_annotationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(513);
				annotated();
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
			match(ANNOTATION);
			setState(520);
			identifier();
			setState(521);
			match(LEFT_BRACE);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==CONST || _la==AT) {
				{
				{
				setState(522);
				variateDeclaration();
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotatedContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(DaiParser.AT, 0); }
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public NamedParamsBlockContext namedParamsBlock() {
			return getRuleContext(NamedParamsBlockContext.class,0);
		}
		public AnnotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotated; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAnnotated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotatedContext annotated() throws RecognitionException {
		AnnotatedContext _localctx = new AnnotatedContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_annotated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(AT);
			setState(531);
			identifierPath();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(532);
				namedParamsBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncrementalExpressionContext extends ExprContext {
		public Token oper;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(DaiParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(DaiParser.DECREMENT, 0); }
		public IncrementalExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitIncrementalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpressionContext extends ExprContext {
		public ExprContext left;
		public Token oper;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADDITION() { return getToken(DaiParser.ADDITION, 0); }
		public TerminalNode SUBTRACTION() { return getToken(DaiParser.SUBTRACTION, 0); }
		public AdditiveExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpressionContext extends ExprContext {
		public ExprContext left;
		public Token oper;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(DaiParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(DaiParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(DaiParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(DaiParser.LESS_THAN_OR_EQUAL, 0); }
		public RelationalExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExprContext {
		public Token oper;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(DaiParser.TILDE, 0); }
		public TerminalNode NOT() { return getToken(DaiParser.NOT, 0); }
		public NotExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuperExpressionContext extends ExprContext {
		public TerminalNode SUPER() { return getToken(DaiParser.SUPER, 0); }
		public SuperExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitSuperExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExprContext {
		public ExprContext left;
		public Token oper;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(DaiParser.AND, 0); }
		public AndExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends ExprContext {
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public ParenthesizedExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseAndExpressionContext extends ExprContext {
		public ExprContext left;
		public Token oper;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BITWISE_AND() { return getToken(DaiParser.BITWISE_AND, 0); }
		public BitwiseAndExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitBitwiseAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExprContext {
		public Token oper;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADDITION() { return getToken(DaiParser.ADDITION, 0); }
		public TerminalNode SUBTRACTION() { return getToken(DaiParser.SUBTRACTION, 0); }
		public UnaryExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualExpressionContext extends ExprContext {
		public ExprContext left;
		public Token oper;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(DaiParser.ASSIGNMENT, 0); }
		public TerminalNode INEQUALITY() { return getToken(DaiParser.INEQUALITY, 0); }
		public EqualExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaExpressionContext extends ExprContext {
		public TerminalNode ARROW() { return getToken(DaiParser.ARROW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FuncParamsBlockContext funcParamsBlock() {
			return getRuleContext(FuncParamsBlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LambdaExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftExpressionContext extends ExprContext {
		public ExprContext left;
		public Token leftShiftOper;
		public Token rightShiftOper;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(DaiParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(DaiParser.LESS_THAN, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(DaiParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(DaiParser.GREATER_THAN, i);
		}
		public ShiftExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExprContext {
		public ExprContext test;
		public ExprContext consequent;
		public ExprContext alternate;
		public TerminalNode QUESTION() { return getToken(DaiParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(DaiParser.COLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConditionalExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpressionContext extends ExprContext {
		public TerminalNode NEW() { return getToken(DaiParser.NEW, 0); }
		public UseTypeContext useType() {
			return getRuleContext(UseTypeContext.class,0);
		}
		public ParamsBlockContext paramsBlock() {
			return getRuleContext(ParamsBlockContext.class,0);
		}
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public NewExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExpressionContext extends ExprContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectLiteralExpressionContext extends ExprContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitObjectLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExpressionContext extends ExprContext {
		public ExprContext left;
		public Token oper;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLICATION() { return getToken(DaiParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(DaiParser.DIVISION, 0); }
		public TerminalNode REMAINDER() { return getToken(DaiParser.REMAINDER, 0); }
		public MultiplicativeExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberExpressionContext extends ExprContext {
		public ExprContext object;
		public ExprContext property;
		public TerminalNode LEFT_BRACK() { return getToken(DaiParser.LEFT_BRACK, 0); }
		public TerminalNode RIGHT_BRACK() { return getToken(DaiParser.RIGHT_BRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MemberExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExprContext {
		public ExprContext left;
		public Token oper;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(DaiParser.OR, 0); }
		public OrExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChainExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DaiParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ChainExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitChainExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseOrExpressionContext extends ExprContext {
		public ExprContext left;
		public Token oper;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BITWISE_OR() { return getToken(DaiParser.BITWISE_OR, 0); }
		public BitwiseOrExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitBitwiseOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLiteralExpressionContext extends ExprContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitArrayLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamsBlockContext paramsBlock() {
			return getRuleContext(ParamsBlockContext.class,0);
		}
		public CallExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpressionContext extends ExprContext {
		public TerminalNode THIS() { return getToken(DaiParser.THIS, 0); }
		public ThisExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExclusiveOrExpressionContext extends ExprContext {
		public ExprContext left;
		public Token oper;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EXCLUSIVE_OR() { return getToken(DaiParser.EXCLUSIVE_OR, 0); }
		public ExclusiveOrExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(536);
				match(LEFT_PAREN);
				setState(537);
				expr(0);
				setState(538);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(540);
				match(THIS);
				}
				break;
			case 3:
				{
				_localctx = new SuperExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(541);
				match(SUPER);
				}
				break;
			case 4:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(542);
				identifier();
				}
				break;
			case 5:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(543);
				match(NEW);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(544);
					annotated();
					}
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(550);
				useType();
				setState(551);
				paramsBlock();
				}
				break;
			case 6:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(553);
				((UnaryExpressionContext)_localctx).oper = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADDITION || _la==SUBTRACTION) ) {
					((UnaryExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(554);
				expr(18);
				}
				break;
			case 7:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(555);
				((NotExpressionContext)_localctx).oper = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==TILDE) ) {
					((NotExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(556);
				expr(17);
				}
				break;
			case 8:
				{
				_localctx = new AssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(557);
				identifierPath();
				setState(558);
				assignOperator();
				setState(559);
				expr(5);
				}
				break;
			case 9:
				{
				_localctx = new LambdaExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(563);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(561);
					identifier();
					}
					break;
				case LEFT_PAREN:
					{
					setState(562);
					funcParamsBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(565);
				match(ARROW);
				setState(568);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(566);
					expr(0);
					}
					break;
				case 2:
					{
					setState(567);
					body();
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(570);
				literal();
				}
				break;
			case 11:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(571);
				arrayLiteral();
				}
				break;
			case 12:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(572);
				objectLiteral();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(630);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(628);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExprContext(_parentctx, _parentState));
						((MultiplicativeExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(575);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(576);
						((MultiplicativeExpressionContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (MULTIPLICATION - 61)) | (1L << (DIVISION - 61)) | (1L << (REMAINDER - 61)))) != 0)) ) {
							((MultiplicativeExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(577);
						((MultiplicativeExpressionContext)_localctx).right = expr(17);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExprContext(_parentctx, _parentState));
						((AdditiveExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(578);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(579);
						((AdditiveExpressionContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADDITION || _la==SUBTRACTION) ) {
							((AdditiveExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(580);
						((AdditiveExpressionContext)_localctx).right = expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(new ExprContext(_parentctx, _parentState));
						((ShiftExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(581);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(586);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LESS_THAN:
							{
							setState(582);
							((ShiftExpressionContext)_localctx).leftShiftOper = match(LESS_THAN);
							setState(583);
							match(LESS_THAN);
							}
							break;
						case GREATER_THAN:
							{
							setState(584);
							((ShiftExpressionContext)_localctx).rightShiftOper = match(GREATER_THAN);
							setState(585);
							match(GREATER_THAN);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(588);
						((ShiftExpressionContext)_localctx).right = expr(15);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new ExprContext(_parentctx, _parentState));
						((RelationalExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(589);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(590);
						((RelationalExpressionContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_THAN) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN_OR_EQUAL))) != 0)) ) {
							((RelationalExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(591);
						((RelationalExpressionContext)_localctx).right = expr(14);
						}
						break;
					case 5:
						{
						_localctx = new EqualExpressionContext(new ExprContext(_parentctx, _parentState));
						((EqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(592);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(593);
						((EqualExpressionContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INEQUALITY || _la==ASSIGNMENT) ) {
							((EqualExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(594);
						((EqualExpressionContext)_localctx).right = expr(13);
						}
						break;
					case 6:
						{
						_localctx = new BitwiseAndExpressionContext(new ExprContext(_parentctx, _parentState));
						((BitwiseAndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(595);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(596);
						((BitwiseAndExpressionContext)_localctx).oper = match(BITWISE_AND);
						setState(597);
						((BitwiseAndExpressionContext)_localctx).right = expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExclusiveOrExpressionContext(new ExprContext(_parentctx, _parentState));
						((ExclusiveOrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(598);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(599);
						((ExclusiveOrExpressionContext)_localctx).oper = match(EXCLUSIVE_OR);
						setState(600);
						((ExclusiveOrExpressionContext)_localctx).right = expr(11);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseOrExpressionContext(new ExprContext(_parentctx, _parentState));
						((BitwiseOrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(601);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(602);
						((BitwiseOrExpressionContext)_localctx).oper = match(BITWISE_OR);
						setState(603);
						((BitwiseOrExpressionContext)_localctx).right = expr(10);
						}
						break;
					case 9:
						{
						_localctx = new AndExpressionContext(new ExprContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(604);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(605);
						((AndExpressionContext)_localctx).oper = match(AND);
						setState(606);
						((AndExpressionContext)_localctx).right = expr(9);
						}
						break;
					case 10:
						{
						_localctx = new OrExpressionContext(new ExprContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(607);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(608);
						((OrExpressionContext)_localctx).oper = match(OR);
						setState(609);
						((OrExpressionContext)_localctx).right = expr(8);
						}
						break;
					case 11:
						{
						_localctx = new ConditionalExpressionContext(new ExprContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).test = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(610);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(611);
						match(QUESTION);
						setState(612);
						((ConditionalExpressionContext)_localctx).consequent = expr(0);
						setState(613);
						match(COLON);
						setState(614);
						((ConditionalExpressionContext)_localctx).alternate = expr(6);
						}
						break;
					case 12:
						{
						_localctx = new ChainExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(616);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(617);
						match(DOT);
						setState(618);
						identifier();
						}
						break;
					case 13:
						{
						_localctx = new MemberExpressionContext(new ExprContext(_parentctx, _parentState));
						((MemberExpressionContext)_localctx).object = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(619);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(620);
						match(LEFT_BRACK);
						setState(621);
						((MemberExpressionContext)_localctx).property = expr(0);
						setState(622);
						match(RIGHT_BRACK);
						}
						break;
					case 14:
						{
						_localctx = new CallExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(624);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(625);
						paramsBlock();
						}
						break;
					case 15:
						{
						_localctx = new IncrementalExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(626);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(627);
						((IncrementalExpressionContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INCREMENT || _la==DECREMENT) ) {
							((IncrementalExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaiParser.COMMA, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			expression();
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(636);
				match(COMMA);
				setState(637);
				expression();
				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedParamContext namedParam() {
			return getRuleContext(NamedParamContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_param);
		try {
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				namedParam();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaiParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			param();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(648);
				match(COMMA);
				setState(649);
				param();
				}
				}
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitParamsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsBlockContext paramsBlock() throws RecognitionException {
		ParamsBlockContext _localctx = new ParamsBlockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_paramsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(LEFT_PAREN);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LEFT_PAREN - 79)) | (1L << (LEFT_BRACE - 79)) | (1L << (LEFT_BRACK - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
				{
				setState(656);
				params();
				}
			}

			setState(659);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedParamContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(DaiParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitNamedParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedParamContext namedParam() throws RecognitionException {
		NamedParamContext _localctx = new NamedParamContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_namedParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			identifier();
			{
			setState(662);
			match(ASSIGNMENT);
			setState(663);
			expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedParamsContext extends ParserRuleContext {
		public List<NamedParamContext> namedParam() {
			return getRuleContexts(NamedParamContext.class);
		}
		public NamedParamContext namedParam(int i) {
			return getRuleContext(NamedParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaiParser.COMMA, i);
		}
		public NamedParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedParams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitNamedParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedParamsContext namedParams() throws RecognitionException {
		NamedParamsContext _localctx = new NamedParamsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_namedParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			namedParam();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(666);
				match(COMMA);
				setState(667);
				namedParam();
				}
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedParamsBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public NamedParamsContext namedParams() {
			return getRuleContext(NamedParamsContext.class,0);
		}
		public NamedParamsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedParamsBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitNamedParamsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedParamsBlockContext namedParamsBlock() throws RecognitionException {
		NamedParamsBlockContext _localctx = new NamedParamsBlockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_namedParamsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(LEFT_PAREN);
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(674);
				namedParams();
				}
			}

			setState(677);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(DaiParser.ASSIGNMENT, 0); }
		public TerminalNode ADDITION_ASSIGNMENT() { return getToken(DaiParser.ADDITION_ASSIGNMENT, 0); }
		public TerminalNode SUBTRACTION_ASSIGNMENT() { return getToken(DaiParser.SUBTRACTION_ASSIGNMENT, 0); }
		public TerminalNode MULTIPLICATION_ASSIGNMENT() { return getToken(DaiParser.MULTIPLICATION_ASSIGNMENT, 0); }
		public TerminalNode DIVISION_ASSIGNMENT() { return getToken(DaiParser.DIVISION_ASSIGNMENT, 0); }
		public TerminalNode AND_ASSIGNMENT() { return getToken(DaiParser.AND_ASSIGNMENT, 0); }
		public TerminalNode OR_ASSIGNMENT() { return getToken(DaiParser.OR_ASSIGNMENT, 0); }
		public TerminalNode EXCLUSIVE_OR_ASSIGNMENT() { return getToken(DaiParser.EXCLUSIVE_OR_ASSIGNMENT, 0); }
		public TerminalNode REMAINDER_ASSIGNMENT() { return getToken(DaiParser.REMAINDER_ASSIGNMENT, 0); }
		public TerminalNode LEFT_SHIFT_ASSIGNMENT() { return getToken(DaiParser.LEFT_SHIFT_ASSIGNMENT, 0); }
		public TerminalNode RIGHT_SHIFT_ASSIGNMENT() { return getToken(DaiParser.RIGHT_SHIFT_ASSIGNMENT, 0); }
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ASSIGNMENT - 67)) | (1L << (ADDITION_ASSIGNMENT - 67)) | (1L << (SUBTRACTION_ASSIGNMENT - 67)) | (1L << (MULTIPLICATION_ASSIGNMENT - 67)) | (1L << (DIVISION_ASSIGNMENT - 67)) | (1L << (AND_ASSIGNMENT - 67)) | (1L << (OR_ASSIGNMENT - 67)) | (1L << (EXCLUSIVE_OR_ASSIGNMENT - 67)) | (1L << (REMAINDER_ASSIGNMENT - 67)) | (1L << (LEFT_SHIFT_ASSIGNMENT - 67)) | (1L << (RIGHT_SHIFT_ASSIGNMENT - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharacterLiteralContext extends LiteralContext {
		public TerminalNode CHARACTER_LITERAL() { return getToken(DaiParser.CHARACTER_LITERAL, 0); }
		public CharacterLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitCharacterLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends LiteralContext {
		public TerminalNode NULL_LITERAL() { return getToken(DaiParser.NULL_LITERAL, 0); }
		public NullLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING_LITERAL() { return getToken(DaiParser.STRING_LITERAL, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends LiteralContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(DaiParser.DOUBLE_LITERAL, 0); }
		public DoubleLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends LiteralContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(DaiParser.INTEGER_LITERAL, 0); }
		public IntegerLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends LiteralContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(DaiParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends LiteralContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(DaiParser.BOOLEAN_LITERAL, 0); }
		public BooleanLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongLiteralContext extends LiteralContext {
		public TerminalNode LONG_LITERAL() { return getToken(DaiParser.LONG_LITERAL, 0); }
		public LongLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitLongLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_literal);
		try {
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(INTEGER_LITERAL);
				}
				break;
			case LONG_LITERAL:
				_localctx = new LongLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(LONG_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(683);
				match(FLOAT_LITERAL);
				}
				break;
			case DOUBLE_LITERAL:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(684);
				match(DOUBLE_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(685);
				match(CHARACTER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(686);
				match(STRING_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(687);
				match(BOOLEAN_LITERAL);
				}
				break;
			case NULL_LITERAL:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(688);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACK() { return getToken(DaiParser.LEFT_BRACK, 0); }
		public TerminalNode RIGHT_BRACK() { return getToken(DaiParser.RIGHT_BRACK, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(LEFT_BRACK);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LEFT_PAREN - 79)) | (1L << (LEFT_BRACE - 79)) | (1L << (LEFT_BRACK - 79)) | (1L << (IDENTIFIER - 79)))) != 0)) {
				{
				setState(692);
				expressions();
				}
			}

			setState(695);
			match(RIGHT_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(LEFT_BRACE);
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(698);
				objectProperty();
				}
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(704);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectPropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DaiParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_objectProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			identifier();
			setState(707);
			match(COLON);
			setState(708);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierPathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(DaiParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DaiParser.DOT, i);
		}
		public IdentifierPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPath; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitIdentifierPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierPathContext identifierPath() throws RecognitionException {
		IdentifierPathContext _localctx = new IdentifierPathContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_identifierPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			identifier();
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(713);
				match(DOT);
				setState(714);
				identifier();
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseTypeContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public UseTypeParamsBlockContext useTypeParamsBlock() {
			return getRuleContext(UseTypeParamsBlockContext.class,0);
		}
		public UseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitUseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseTypeContext useType() throws RecognitionException {
		UseTypeContext _localctx = new UseTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_useType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			identifierPath();
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(721);
				useTypeParamsBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseTypesContext extends ParserRuleContext {
		public List<UseTypeContext> useType() {
			return getRuleContexts(UseTypeContext.class);
		}
		public UseTypeContext useType(int i) {
			return getRuleContext(UseTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaiParser.COMMA, i);
		}
		public UseTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useTypes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitUseTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseTypesContext useTypes() throws RecognitionException {
		UseTypesContext _localctx = new UseTypesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_useTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			useType();
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(725);
				match(COMMA);
				setState(726);
				useType();
				}
				}
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseTypeParamContext extends ParserRuleContext {
		public UseTypeContext useType() {
			return getRuleContext(UseTypeContext.class,0);
		}
		public UseTypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useTypeParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitUseTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseTypeParamContext useTypeParam() throws RecognitionException {
		UseTypeParamContext _localctx = new UseTypeParamContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_useTypeParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			useType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseTypeParamsContext extends ParserRuleContext {
		public List<UseTypeParamContext> useTypeParam() {
			return getRuleContexts(UseTypeParamContext.class);
		}
		public UseTypeParamContext useTypeParam(int i) {
			return getRuleContext(UseTypeParamContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public UseTypeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useTypeParams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitUseTypeParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseTypeParamsContext useTypeParams() throws RecognitionException {
		UseTypeParamsContext _localctx = new UseTypeParamsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_useTypeParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			useTypeParam();
			{
			setState(735);
			match(COMMA);
			setState(736);
			useTypeParam();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseTypeParamsBlockContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(DaiParser.LESS_THAN, 0); }
		public UseTypeParamsContext useTypeParams() {
			return getRuleContext(UseTypeParamsContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(DaiParser.GREATER_THAN, 0); }
		public UseTypeParamsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useTypeParamsBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitUseTypeParamsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseTypeParamsBlockContext useTypeParamsBlock() throws RecognitionException {
		UseTypeParamsBlockContext _localctx = new UseTypeParamsBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_useTypeParamsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(LESS_THAN);
			setState(739);
			useTypeParams();
			setState(740);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclTypeParamContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclTypeParamExtendsContext declTypeParamExtends() {
			return getRuleContext(DeclTypeParamExtendsContext.class,0);
		}
		public DeclTypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declTypeParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclTypeParamContext declTypeParam() throws RecognitionException {
		DeclTypeParamContext _localctx = new DeclTypeParamContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_declTypeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			identifier();
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(743);
				declTypeParamExtends();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclTypeParamsContext extends ParserRuleContext {
		public List<DeclTypeParamContext> declTypeParam() {
			return getRuleContexts(DeclTypeParamContext.class);
		}
		public DeclTypeParamContext declTypeParam(int i) {
			return getRuleContext(DeclTypeParamContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public DeclTypeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declTypeParams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclTypeParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclTypeParamsContext declTypeParams() throws RecognitionException {
		DeclTypeParamsContext _localctx = new DeclTypeParamsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_declTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			declTypeParam();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(747);
				match(COMMA);
				setState(748);
				declTypeParam();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclTypeParamsBlockContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(DaiParser.LESS_THAN, 0); }
		public DeclTypeParamsContext declTypeParams() {
			return getRuleContext(DeclTypeParamsContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(DaiParser.GREATER_THAN, 0); }
		public DeclTypeParamsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declTypeParamsBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclTypeParamsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclTypeParamsBlockContext declTypeParamsBlock() throws RecognitionException {
		DeclTypeParamsBlockContext _localctx = new DeclTypeParamsBlockContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_declTypeParamsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(LESS_THAN);
			setState(752);
			declTypeParams();
			setState(753);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclTypeParamExtendsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(DaiParser.EXTENDS, 0); }
		public UseTypeContext useType() {
			return getRuleContext(UseTypeContext.class,0);
		}
		public DeclTypeParamExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declTypeParamExtends; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclTypeParamExtends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclTypeParamExtendsContext declTypeParamExtends() throws RecognitionException {
		DeclTypeParamExtendsContext _localctx = new DeclTypeParamExtendsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_declTypeParamExtends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(EXTENDS);
			setState(756);
			useType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(DaiParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(DaiParser.NL, i);
		}
		public TerminalNode SEMI() { return getToken(DaiParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(DaiParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_eos);
		int _la;
		try {
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(758);
					match(NL);
					}
					}
					setState(761); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(763);
					match(NL);
					}
					}
					setState(768);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(769);
				match(SEMI);
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(770);
					match(NL);
					}
					}
					setState(775);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(776);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 23);
		case 12:
			return precpred(_ctx, 22);
		case 13:
			return precpred(_ctx, 21);
		case 14:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3a\u030e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\5"+
		"\2z\n\2\3\2\7\2}\n\2\f\2\16\2\u0080\13\2\3\2\7\2\u0083\n\2\f\2\16\2\u0086"+
		"\13\2\3\2\3\2\3\3\7\3\u008b\n\3\f\3\16\3\u008e\13\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a0\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u00a9\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b3"+
		"\n\6\f\6\16\6\u00b6\13\6\3\6\5\6\u00b9\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c0"+
		"\n\6\3\6\3\6\3\6\3\6\6\6\u00c6\n\6\r\6\16\6\u00c7\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d9\n\6\3\6\3\6\5\6\u00dd"+
		"\n\6\3\6\3\6\5\6\u00e1\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ea\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00f5\n\6\3\7\3\7\7\7\u00f9\n\7"+
		"\f\7\16\7\u00fc\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\6\n\u010b\n\n\r\n\16\n\u010c\3\n\6\n\u0110\n\n\r\n\16\n\u0111\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u011a\n\13\3\f\3\f\5\f\u011e\n\f\3\r\7"+
		"\r\u0121\n\r\f\r\16\r\u0124\13\r\3\r\3\r\3\r\3\16\7\16\u012a\n\16\f\16"+
		"\16\16\u012d\13\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u0136\n\17"+
		"\f\17\16\17\u0139\13\17\3\20\3\20\3\20\5\20\u013e\n\20\3\20\3\20\5\20"+
		"\u0142\n\20\3\21\7\21\u0145\n\21\f\21\16\21\u0148\13\21\3\21\3\21\3\21"+
		"\5\21\u014d\n\21\3\21\3\21\5\21\u0151\n\21\3\21\3\21\3\22\3\22\5\22\u0157"+
		"\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\7\24\u0160\n\24\f\24\16\24\u0163"+
		"\13\24\3\24\3\24\3\25\3\25\3\25\5\25\u016a\n\25\3\26\7\26\u016d\n\26\f"+
		"\26\16\26\u0170\13\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0178\n\26\3"+
		"\26\3\26\3\26\3\26\3\27\7\27\u017f\n\27\f\27\16\27\u0182\13\27\3\27\3"+
		"\27\3\27\5\27\u0187\n\27\3\30\3\30\3\30\7\30\u018c\n\30\f\30\16\30\u018f"+
		"\13\30\3\30\3\30\3\31\7\31\u0194\n\31\f\31\16\31\u0197\13\31\3\31\3\31"+
		"\3\31\5\31\u019c\n\31\3\31\5\31\u019f\n\31\3\31\3\31\7\31\u01a3\n\31\f"+
		"\31\16\31\u01a6\13\31\3\31\3\31\3\32\3\32\3\32\3\33\7\33\u01ae\n\33\f"+
		"\33\16\33\u01b1\13\33\3\33\3\33\3\33\5\33\u01b6\n\33\3\33\5\33\u01b9\n"+
		"\33\3\33\3\33\5\33\u01bd\n\33\3\33\3\33\7\33\u01c1\n\33\f\33\16\33\u01c4"+
		"\13\33\3\33\3\33\3\34\3\34\3\34\5\34\u01cb\n\34\3\35\7\35\u01ce\n\35\f"+
		"\35\16\35\u01d1\13\35\3\35\3\35\3\35\3\35\3\36\7\36\u01d8\n\36\f\36\16"+
		"\36\u01db\13\36\3\36\3\36\3\36\5\36\u01e0\n\36\3\36\5\36\u01e3\n\36\3"+
		"\36\3\36\7\36\u01e7\n\36\f\36\16\36\u01ea\13\36\3\36\3\36\3\37\3\37\3"+
		"\37\5\37\u01f1\n\37\3 \7 \u01f4\n \f \16 \u01f7\13 \3 \3 \3 \5 \u01fc"+
		"\n \3 \3 \5 \u0200\n \3 \3 \3!\7!\u0205\n!\f!\16!\u0208\13!\3!\3!\3!\3"+
		"!\7!\u020e\n!\f!\16!\u0211\13!\3!\3!\3\"\3\"\3\"\5\"\u0218\n\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\7#\u0224\n#\f#\16#\u0227\13#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\5#\u0236\n#\3#\3#\3#\5#\u023b\n#\3#\3#\3#\5#\u0240"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u024d\n#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0277\n#\f#\16#\u027a\13#\3$\3$\3%\3"+
		"%\3%\7%\u0281\n%\f%\16%\u0284\13%\3&\3&\5&\u0288\n&\3\'\3\'\3\'\7\'\u028d"+
		"\n\'\f\'\16\'\u0290\13\'\3(\3(\5(\u0294\n(\3(\3(\3)\3)\3)\3)\3*\3*\3*"+
		"\7*\u029f\n*\f*\16*\u02a2\13*\3+\3+\5+\u02a6\n+\3+\3+\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\5-\u02b4\n-\3.\3.\5.\u02b8\n.\3.\3.\3/\3/\7/\u02be\n/\f"+
		"/\16/\u02c1\13/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\7\62"+
		"\u02ce\n\62\f\62\16\62\u02d1\13\62\3\63\3\63\5\63\u02d5\n\63\3\64\3\64"+
		"\3\64\7\64\u02da\n\64\f\64\16\64\u02dd\13\64\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\38\38\58\u02eb\n8\39\39\39\59\u02f0\n9\3:\3"+
		":\3:\3:\3;\3;\3;\3<\6<\u02fa\n<\r<\16<\u02fb\3<\7<\u02ff\n<\f<\16<\u0302"+
		"\13<\3<\3<\7<\u0306\n<\f<\16<\u0309\13<\3<\5<\u030c\n<\3<\2\3D=\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtv\2\n\3\2\5\6\3\2=>\3\2\60\61\4\2?@DD\3\2\658\4\2\64"+
		"\64EE\3\2;<\3\2EO\2\u0357\2y\3\2\2\2\4\u008c\3\2\2\2\6\u0093\3\2\2\2\b"+
		"\u009f\3\2\2\2\n\u00f4\3\2\2\2\f\u00f6\3\2\2\2\16\u00ff\3\2\2\2\20\u0105"+
		"\3\2\2\2\22\u010a\3\2\2\2\24\u0119\3\2\2\2\26\u011d\3\2\2\2\30\u0122\3"+
		"\2\2\2\32\u012b\3\2\2\2\34\u0132\3\2\2\2\36\u013a\3\2\2\2 \u0146\3\2\2"+
		"\2\"\u0154\3\2\2\2$\u015a\3\2\2\2&\u0161\3\2\2\2(\u0166\3\2\2\2*\u016e"+
		"\3\2\2\2,\u0180\3\2\2\2.\u0188\3\2\2\2\60\u0195\3\2\2\2\62\u01a9\3\2\2"+
		"\2\64\u01af\3\2\2\2\66\u01ca\3\2\2\28\u01cf\3\2\2\2:\u01d9\3\2\2\2<\u01f0"+
		"\3\2\2\2>\u01f5\3\2\2\2@\u0206\3\2\2\2B\u0214\3\2\2\2D\u023f\3\2\2\2F"+
		"\u027b\3\2\2\2H\u027d\3\2\2\2J\u0287\3\2\2\2L\u0289\3\2\2\2N\u0291\3\2"+
		"\2\2P\u0297\3\2\2\2R\u029b\3\2\2\2T\u02a3\3\2\2\2V\u02a9\3\2\2\2X\u02b3"+
		"\3\2\2\2Z\u02b5\3\2\2\2\\\u02bb\3\2\2\2^\u02c4\3\2\2\2`\u02c8\3\2\2\2"+
		"b\u02ca\3\2\2\2d\u02d2\3\2\2\2f\u02d6\3\2\2\2h\u02de\3\2\2\2j\u02e0\3"+
		"\2\2\2l\u02e4\3\2\2\2n\u02e8\3\2\2\2p\u02ec\3\2\2\2r\u02f1\3\2\2\2t\u02f5"+
		"\3\2\2\2v\u030b\3\2\2\2xz\5\4\3\2yx\3\2\2\2yz\3\2\2\2z~\3\2\2\2{}\5\6"+
		"\4\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0084\3\2\2\2"+
		"\u0080~\3\2\2\2\u0081\u0083\5\b\5\2\u0082\u0081\3\2\2\2\u0083\u0086\3"+
		"\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7\2\2\3\u0088\3\3\2\2\2\u0089\u008b\5B\"\2"+
		"\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\3\2\2\u0090"+
		"\u0091\5b\62\2\u0091\u0092\5v<\2\u0092\5\3\2\2\2\u0093\u0094\7\4\2\2\u0094"+
		"\u0095\5b\62\2\u0095\u0096\5v<\2\u0096\7\3\2\2\2\u0097\u00a0\5\n\6\2\u0098"+
		"\u00a0\5\32\16\2\u0099\u00a0\5 \21\2\u009a\u00a0\5*\26\2\u009b\u00a0\5"+
		"\60\31\2\u009c\u00a0\5\64\33\2\u009d\u00a0\5:\36\2\u009e\u00a0\5@!\2\u009f"+
		"\u0097\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009a\3\2"+
		"\2\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\t\3\2\2\2\u00a1\u00f5\5\f\7\2\u00a2\u00a3\7\30\2"+
		"\2\u00a3\u00f5\5v<\2\u00a4\u00a5\7\31\2\2\u00a5\u00f5\5v<\2\u00a6\u00a8"+
		"\7\33\2\2\u00a7\u00a9\5F$\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00f5\5v<\2\u00ab\u00ac\7\n\2\2\u00ac\u00ad\5F$\2"+
		"\u00ad\u00ae\5v<\2\u00ae\u00f5\3\2\2\2\u00af\u00b0\7\13\2\2\u00b0\u00b4"+
		"\5\f\7\2\u00b1\u00b3\5\16\b\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00b9\5\f\7\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00f5\3\2\2\2\u00ba\u00bb\7\16\2\2\u00bb\u00bc\5\20\t\2\u00bc\u00bf\5"+
		"\b\5\2\u00bd\u00be\7\17\2\2\u00be\u00c0\5\b\5\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00f5\3\2\2\2\u00c1\u00c2\7\20\2\2\u00c2\u00c3\5"+
		"\20\t\2\u00c3\u00c5\7S\2\2\u00c4\u00c6\5\22\n\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\7T\2\2\u00ca\u00f5\3\2\2\2\u00cb\u00cc\7\25\2\2\u00cc"+
		"\u00cd\5\20\t\2\u00cd\u00ce\5\b\5\2\u00ce\u00f5\3\2\2\2\u00cf\u00d0\7"+
		"\24\2\2\u00d0\u00d1\5\b\5\2\u00d1\u00d2\7\25\2\2\u00d2\u00d3\5\20\t\2"+
		"\u00d3\u00d4\5v<\2\u00d4\u00f5\3\2\2\2\u00d5\u00d6\7\26\2\2\u00d6\u00d8"+
		"\7Q\2\2\u00d7\u00d9\5\26\f\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\7]\2\2\u00db\u00dd\5F$\2\u00dc\u00db\3\2\2"+
		"\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\7]\2\2\u00df\u00e1"+
		"\5H%\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\7R\2\2\u00e3\u00f5\5\b\5\2\u00e4\u00e5\7\26\2\2\u00e5\u00e6\7Q"+
		"\2\2\u00e6\u00e9\5`\61\2\u00e7\u00e8\7\\\2\2\u00e8\u00ea\5`\61\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\27"+
		"\2\2\u00ec\u00ed\5F$\2\u00ed\u00ee\7R\2\2\u00ee\u00ef\5\b\5\2\u00ef\u00f5"+
		"\3\2\2\2\u00f0\u00f1\5F$\2\u00f1\u00f2\5v<\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f5\7]\2\2\u00f4\u00a1\3\2\2\2\u00f4\u00a2\3\2\2\2\u00f4\u00a4\3\2"+
		"\2\2\u00f4\u00a6\3\2\2\2\u00f4\u00ab\3\2\2\2\u00f4\u00af\3\2\2\2\u00f4"+
		"\u00ba\3\2\2\2\u00f4\u00c1\3\2\2\2\u00f4\u00cb\3\2\2\2\u00f4\u00cf\3\2"+
		"\2\2\u00f4\u00d5\3\2\2\2\u00f4\u00e4\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\13\3\2\2\2\u00f6\u00fa\7S\2\2\u00f7\u00f9\5\b\5\2"+
		"\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7T\2\2\u00fe"+
		"\r\3\2\2\2\u00ff\u0100\7\f\2\2\u0100\u0101\7Q\2\2\u0101\u0102\5\36\20"+
		"\2\u0102\u0103\7R\2\2\u0103\u0104\5\f\7\2\u0104\17\3\2\2\2\u0105\u0106"+
		"\7Q\2\2\u0106\u0107\5F$\2\u0107\u0108\7R\2\2\u0108\21\3\2\2\2\u0109\u010b"+
		"\5\24\13\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2"+
		"\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0110\5\b\5\2\u010f\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\23\3\2\2\2\u0113\u0114\7\21\2\2\u0114\u0115\5F$\2\u0115\u0116\7^\2\2"+
		"\u0116\u011a\3\2\2\2\u0117\u0118\7\22\2\2\u0118\u011a\7^\2\2\u0119\u0113"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u011a\25\3\2\2\2\u011b\u011e\5\30\r\2\u011c"+
		"\u011e\5H%\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\27\3\2\2\2"+
		"\u011f\u0121\5B\"\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125"+
		"\u0126\t\2\2\2\u0126\u0127\5\34\17\2\u0127\31\3\2\2\2\u0128\u012a\5B\""+
		"\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\t\2\2\2\u012f"+
		"\u0130\5\34\17\2\u0130\u0131\5v<\2\u0131\33\3\2\2\2\u0132\u0137\5\36\20"+
		"\2\u0133\u0134\7\\\2\2\u0134\u0136\5\36\20\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\35\3\2\2"+
		"\2\u0139\u0137\3\2\2\2\u013a\u013d\5`\61\2\u013b\u013c\7^\2\2\u013c\u013e"+
		"\5d\63\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u0140\7E\2\2\u0140\u0142\5F$\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2"+
		"\2\u0142\37\3\2\2\2\u0143\u0145\5B\"\2\u0144\u0143\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014a\7\32\2\2\u014a\u014c\5`\61\2\u014b\u014d\5"+
		"r:\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\5\"\22\2\u014f\u0151\5(\25\2\u0150\u014f\3\2\2\2\u0150\u0151\3"+
		"\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\5\f\7\2\u0153!\3\2\2\2\u0154\u0156"+
		"\7Q\2\2\u0155\u0157\5$\23\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0159\7R\2\2\u0159#\3\2\2\2\u015a\u015b\5&\24\2\u015b"+
		"\u015c\7\\\2\2\u015c\u015d\5&\24\2\u015d%\3\2\2\2\u015e\u0160\5B\"\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\5\36\20\2\u0165"+
		"\'\3\2\2\2\u0166\u0169\7^\2\2\u0167\u016a\5d\63\2\u0168\u016a\7\34\2\2"+
		"\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a)\3\2\2\2\u016b\u016d\5"+
		"B\"\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7\35"+
		"\2\2\u0172\u0177\5`\61\2\u0173\u0174\7\66\2\2\u0174\u0175\5h\65\2\u0175"+
		"\u0176\7\65\2\2\u0176\u0178\3\2\2\2\u0177\u0173\3\2\2\2\u0177\u0178\3"+
		"\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7S\2\2\u017a\u017b\5.\30\2\u017b"+
		"\u017c\7T\2\2\u017c+\3\2\2\2\u017d\u017f\5B\"\2\u017e\u017d\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0183\u0186\5`\61\2\u0184\u0185\7E\2\2\u0185"+
		"\u0187\5F$\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187-\3\2\2\2\u0188"+
		"\u018d\5,\27\2\u0189\u018a\7\\\2\2\u018a\u018c\5,\27\2\u018b\u0189\3\2"+
		"\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\5v<\2\u0191/\3\2\2\2\u0192"+
		"\u0194\5B\"\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198"+
		"\u0199\7\36\2\2\u0199\u019b\5`\61\2\u019a\u019c\5r:\2\u019b\u019a\3\2"+
		"\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019f\5\62\32\2\u019e"+
		"\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a4\7S"+
		"\2\2\u01a1\u01a3\5\32\16\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a7\u01a8\7T\2\2\u01a8\61\3\2\2\2\u01a9\u01aa\7 \2\2\u01aa\u01ab"+
		"\5d\63\2\u01ab\63\3\2\2\2\u01ac\u01ae\5B\"\2\u01ad\u01ac\3\2\2\2\u01ae"+
		"\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7\37\2\2\u01b3\u01b5\5`\61\2\u01b4"+
		"\u01b6\5r:\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2"+
		"\2\u01b7\u01b9\5\62\32\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01bc\3\2\2\2\u01ba\u01bb\7&\2\2\u01bb\u01bd\5f\64\2\u01bc\u01ba\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c2\7S\2\2\u01bf"+
		"\u01c1\5\66\34\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3"+
		"\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5"+
		"\u01c6\7T\2\2\u01c6\65\3\2\2\2\u01c7\u01cb\5\32\16\2\u01c8\u01cb\5 \21"+
		"\2\u01c9\u01cb\58\35\2\u01ca\u01c7\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9"+
		"\3\2\2\2\u01cb\67\3\2\2\2\u01cc\u01ce\5B\"\2\u01cd\u01cc\3\2\2\2\u01ce"+
		"\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7\"\2\2\u01d3\u01d4\5\"\22\2\u01d4"+
		"\u01d5\5\f\7\2\u01d59\3\2\2\2\u01d6\u01d8\5B\"\2\u01d7\u01d6\3\2\2\2\u01d8"+
		"\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2"+
		"\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\7%\2\2\u01dd\u01df\5`\61\2\u01de"+
		"\u01e0\5r:\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2"+
		"\2\u01e1\u01e3\5\62\32\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01e8\7S\2\2\u01e5\u01e7\5<\37\2\u01e6\u01e5\3\2"+
		"\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ec\7T\2\2\u01ec;\3\2\2\2\u01ed"+
		"\u01f1\5\32\16\2\u01ee\u01f1\5 \21\2\u01ef\u01f1\5> \2\u01f0\u01ed\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1=\3\2\2\2\u01f2\u01f4"+
		"\5B\"\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7\32"+
		"\2\2\u01f9\u01fb\5`\61\2\u01fa\u01fc\5r:\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\5\"\22\2\u01fe\u0200\5(\25\2"+
		"\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202"+
		"\5v<\2\u0202?\3\2\2\2\u0203\u0205\5B\"\2\u0204\u0203\3\2\2\2\u0205\u0208"+
		"\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0209\u020a\7\'\2\2\u020a\u020b\5`\61\2\u020b\u020f\7S"+
		"\2\2\u020c\u020e\5\32\16\2\u020d\u020c\3\2\2\2\u020e\u0211\3\2\2\2\u020f"+
		"\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u020f\3\2"+
		"\2\2\u0212\u0213\7T\2\2\u0213A\3\2\2\2\u0214\u0215\7_\2\2\u0215\u0217"+
		"\5b\62\2\u0216\u0218\5T+\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"C\3\2\2\2\u0219\u021a\b#\1\2\u021a\u021b\7Q\2\2\u021b\u021c\5D#\2\u021c"+
		"\u021d\7R\2\2\u021d\u0240\3\2\2\2\u021e\u0240\7#\2\2\u021f\u0240\7$\2"+
		"\2\u0220\u0240\5`\61\2\u0221\u0225\7!\2\2\u0222\u0224\5B\"\2\u0223\u0222"+
		"\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0229\5d\63\2\u0229\u022a\5N"+
		"(\2\u022a\u0240\3\2\2\2\u022b\u022c\t\3\2\2\u022c\u0240\5D#\24\u022d\u022e"+
		"\t\4\2\2\u022e\u0240\5D#\23\u022f\u0230\5b\62\2\u0230\u0231\5V,\2\u0231"+
		"\u0232\5D#\7\u0232\u0240\3\2\2\2\u0233\u0236\5`\61\2\u0234\u0236\5\"\22"+
		"\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u023a"+
		"\7P\2\2\u0238\u023b\5D#\2\u0239\u023b\5\f\7\2\u023a\u0238\3\2\2\2\u023a"+
		"\u0239\3\2\2\2\u023b\u0240\3\2\2\2\u023c\u0240\5X-\2\u023d\u0240\5Z.\2"+
		"\u023e\u0240\5\\/\2\u023f\u0219\3\2\2\2\u023f\u021e\3\2\2\2\u023f\u021f"+
		"\3\2\2\2\u023f\u0220\3\2\2\2\u023f\u0221\3\2\2\2\u023f\u022b\3\2\2\2\u023f"+
		"\u022d\3\2\2\2\u023f\u022f\3\2\2\2\u023f\u0235\3\2\2\2\u023f\u023c\3\2"+
		"\2\2\u023f\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240\u0278\3\2\2\2\u0241"+
		"\u0242\f\22\2\2\u0242\u0243\t\5\2\2\u0243\u0277\5D#\23\u0244\u0245\f\21"+
		"\2\2\u0245\u0246\t\3\2\2\u0246\u0277\5D#\22\u0247\u024c\f\20\2\2\u0248"+
		"\u0249\7\66\2\2\u0249\u024d\7\66\2\2\u024a\u024b\7\65\2\2\u024b\u024d"+
		"\7\65\2\2\u024c\u0248\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024e\3\2\2\2"+
		"\u024e\u0277\5D#\21\u024f\u0250\f\17\2\2\u0250\u0251\t\6\2\2\u0251\u0277"+
		"\5D#\20\u0252\u0253\f\16\2\2\u0253\u0254\t\7\2\2\u0254\u0277\5D#\17\u0255"+
		"\u0256\f\r\2\2\u0256\u0257\7A\2\2\u0257\u0277\5D#\16\u0258\u0259\f\f\2"+
		"\2\u0259\u025a\7C\2\2\u025a\u0277\5D#\r\u025b\u025c\f\13\2\2\u025c\u025d"+
		"\7B\2\2\u025d\u0277\5D#\f\u025e\u025f\f\n\2\2\u025f\u0260\79\2\2\u0260"+
		"\u0277\5D#\13\u0261\u0262\f\t\2\2\u0262\u0263\7:\2\2\u0263\u0277\5D#\n"+
		"\u0264\u0265\f\b\2\2\u0265\u0266\7\62\2\2\u0266\u0267\5D#\2\u0267\u0268"+
		"\7^\2\2\u0268\u0269\5D#\b\u0269\u0277\3\2\2\2\u026a\u026b\f\31\2\2\u026b"+
		"\u026c\7[\2\2\u026c\u0277\5`\61\2\u026d\u026e\f\30\2\2\u026e\u026f\7U"+
		"\2\2\u026f\u0270\5D#\2\u0270\u0271\7V\2\2\u0271\u0277\3\2\2\2\u0272\u0273"+
		"\f\27\2\2\u0273\u0277\5N(\2\u0274\u0275\f\25\2\2\u0275\u0277\t\b\2\2\u0276"+
		"\u0241\3\2\2\2\u0276\u0244\3\2\2\2\u0276\u0247\3\2\2\2\u0276\u024f\3\2"+
		"\2\2\u0276\u0252\3\2\2\2\u0276\u0255\3\2\2\2\u0276\u0258\3\2\2\2\u0276"+
		"\u025b\3\2\2\2\u0276\u025e\3\2\2\2\u0276\u0261\3\2\2\2\u0276\u0264\3\2"+
		"\2\2\u0276\u026a\3\2\2\2\u0276\u026d\3\2\2\2\u0276\u0272\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279E\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027c\5D#\2\u027cG\3\2\2"+
		"\2\u027d\u0282\5F$\2\u027e\u027f\7\\\2\2\u027f\u0281\5F$\2\u0280\u027e"+
		"\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"I\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0288\5F$\2\u0286\u0288\5P)\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0288K\3\2\2\2\u0289\u028e\5J&\2\u028a"+
		"\u028b\7\\\2\2\u028b\u028d\5J&\2\u028c\u028a\3\2\2\2\u028d\u0290\3\2\2"+
		"\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028fM\3\2\2\2\u0290\u028e"+
		"\3\2\2\2\u0291\u0293\7Q\2\2\u0292\u0294\5L\'\2\u0293\u0292\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\7R\2\2\u0296O\3\2\2\2\u0297"+
		"\u0298\5`\61\2\u0298\u0299\7E\2\2\u0299\u029a\5F$\2\u029aQ\3\2\2\2\u029b"+
		"\u02a0\5P)\2\u029c\u029d\7\\\2\2\u029d\u029f\5P)\2\u029e\u029c\3\2\2\2"+
		"\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1S\3"+
		"\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a5\7Q\2\2\u02a4\u02a6\5R*\2\u02a5"+
		"\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\7R"+
		"\2\2\u02a8U\3\2\2\2\u02a9\u02aa\t\t\2\2\u02aaW\3\2\2\2\u02ab\u02b4\7("+
		"\2\2\u02ac\u02b4\7)\2\2\u02ad\u02b4\7*\2\2\u02ae\u02b4\7+\2\2\u02af\u02b4"+
		"\7,\2\2\u02b0\u02b4\7-\2\2\u02b1\u02b4\7.\2\2\u02b2\u02b4\7/\2\2\u02b3"+
		"\u02ab\3\2\2\2\u02b3\u02ac\3\2\2\2\u02b3\u02ad\3\2\2\2\u02b3\u02ae\3\2"+
		"\2\2\u02b3\u02af\3\2\2\2\u02b3\u02b0\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b2\3\2\2\2\u02b4Y\3\2\2\2\u02b5\u02b7\7U\2\2\u02b6\u02b8\5H%\2\u02b7"+
		"\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\7V"+
		"\2\2\u02ba[\3\2\2\2\u02bb\u02bf\7S\2\2\u02bc\u02be\5^\60\2\u02bd\u02bc"+
		"\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		"\u02c2\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3\7T\2\2\u02c3]\3\2\2\2\u02c4"+
		"\u02c5\5`\61\2\u02c5\u02c6\7^\2\2\u02c6\u02c7\5F$\2\u02c7_\3\2\2\2\u02c8"+
		"\u02c9\7a\2\2\u02c9a\3\2\2\2\u02ca\u02cf\5`\61\2\u02cb\u02cc\7[\2\2\u02cc"+
		"\u02ce\5`\61\2\u02cd\u02cb\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2"+
		"\2\2\u02cf\u02d0\3\2\2\2\u02d0c\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d4"+
		"\5b\62\2\u02d3\u02d5\5l\67\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"e\3\2\2\2\u02d6\u02db\5d\63\2\u02d7\u02d8\7\\\2\2\u02d8\u02da\5d\63\2"+
		"\u02d9\u02d7\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc"+
		"\3\2\2\2\u02dcg\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02df\5d\63\2\u02df"+
		"i\3\2\2\2\u02e0\u02e1\5h\65\2\u02e1\u02e2\7\\\2\2\u02e2\u02e3\5h\65\2"+
		"\u02e3k\3\2\2\2\u02e4\u02e5\7\66\2\2\u02e5\u02e6\5j\66\2\u02e6\u02e7\7"+
		"\65\2\2\u02e7m\3\2\2\2\u02e8\u02ea\5`\61\2\u02e9\u02eb\5t;\2\u02ea\u02e9"+
		"\3\2\2\2\u02ea\u02eb\3\2\2\2\u02ebo\3\2\2\2\u02ec\u02ef\5n8\2\u02ed\u02ee"+
		"\7\\\2\2\u02ee\u02f0\5n8\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"q\3\2\2\2\u02f1\u02f2\7\66\2\2\u02f2\u02f3\5p9\2\u02f3\u02f4\7\65\2\2"+
		"\u02f4s\3\2\2\2\u02f5\u02f6\7 \2\2\u02f6\u02f7\5d\63\2\u02f7u\3\2\2\2"+
		"\u02f8\u02fa\7X\2\2\u02f9\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02f9"+
		"\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u030c\3\2\2\2\u02fd\u02ff\7X\2\2\u02fe"+
		"\u02fd\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\u0303\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0307\7]\2\2\u0304"+
		"\u0306\7X\2\2\u0305\u0304\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2"+
		"\2\2\u0307\u0308\3\2\2\2\u0308\u030c\3\2\2\2\u0309\u0307\3\2\2\2\u030a"+
		"\u030c\7\2\2\3\u030b\u02f9\3\2\2\2\u030b\u0300\3\2\2\2\u030b\u030a\3\2"+
		"\2\2\u030cw\3\2\2\2Uy~\u0084\u008c\u009f\u00a8\u00b4\u00b8\u00bf\u00c7"+
		"\u00d8\u00dc\u00e0\u00e9\u00f4\u00fa\u010c\u0111\u0119\u011d\u0122\u012b"+
		"\u0137\u013d\u0141\u0146\u014c\u0150\u0156\u0161\u0169\u016e\u0177\u0180"+
		"\u0186\u018d\u0195\u019b\u019e\u01a4\u01af\u01b5\u01b8\u01bc\u01c2\u01ca"+
		"\u01cf\u01d9\u01df\u01e2\u01e8\u01f0\u01f5\u01fb\u01ff\u0206\u020f\u0217"+
		"\u0225\u0235\u023a\u023f\u024c\u0276\u0278\u0282\u0287\u028e\u0293\u02a0"+
		"\u02a5\u02b3\u02b7\u02bf\u02cf\u02d4\u02db\u02ea\u02ef\u02fb\u0300\u0307"+
		"\u030b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}