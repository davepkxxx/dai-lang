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
		INT_LITERAL=38, LONG_LITERAL=39, FLOAT_LITERAL=40, DOUBLE_LITERAL=41, 
		CHAR_LITERAL=42, STRING_LITERAL=43, LOGICAL_NOT=44, BITWISE_NOT=45, QUESTION=46, 
		EQUALITY=47, INEQUALITY=48, GREATER_THAN=49, LESS_THAN=50, LESS_THAN_OR_EQUAL=51, 
		GREATER_THAN_OR_EQUAL=52, LOGICAL_AND=53, LOGICAL_OR=54, INCREMENT=55, 
		DECREMENT=56, ADDITION=57, SUBTRACTION=58, MULTIPLICATION=59, DIVISION=60, 
		BITWISE_AND=61, BITWISE_OR=62, EXCLUSIVE_OR=63, REMAINDER=64, ASSIGNMENT=65, 
		ADDITION_ASSIGNMENT=66, SUBTRACTION_ASSIGNMENT=67, MULTIPLICATION_ASSIGNMENT=68, 
		DIVISION_ASSIGNMENT=69, AND_ASSIGNMENT=70, OR_ASSIGNMENT=71, EXCLUSIVE_OR_ASSIGNMENT=72, 
		REMAINDER_ASSIGNMENT=73, LEFT_SHIFT_ASSIGNMENT=74, RIGHT_SHIFT_ASSIGNMENT=75, 
		ARROW=76, LEFT_PAREN=77, RIGHT_PAREN=78, LEFT_BRACE=79, RIGHT_BRACE=80, 
		LEFT_BRACK=81, RIGHT_BRACK=82, WS=83, NL=84, COMMENT=85, LINE_COMMENT=86, 
		DOT=87, COMMA=88, SEMI=89, COLON=90, AT=91, ELLIPSIS=92, IDENTIFIER=93;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_statement = 3, RULE_stmt = 4, RULE_body = 5, RULE_catchBlock = 6, 
		RULE_condition = 7, RULE_switchCaseBlock = 8, RULE_switchCaseLabel = 9, 
		RULE_forInit = 10, RULE_forInitDeclaration = 11, RULE_variableDeclaration = 12, 
		RULE_variableDeclarators = 13, RULE_variableDeclarator = 14, RULE_funcDeclaration = 15, 
		RULE_funcParamsBlock = 16, RULE_funcParams = 17, RULE_funcParam = 18, 
		RULE_funcReturn = 19, RULE_enumDeclaration = 20, RULE_enumFieldDeclarator = 21, 
		RULE_enumFieldDeclarators = 22, RULE_structDeclaration = 23, RULE_extendsBlock = 24, 
		RULE_classDeclaration = 25, RULE_classMemberDeclaration = 26, RULE_constructorDeclaration = 27, 
		RULE_interfaceDeclaration = 28, RULE_interfaceMemberDeclaration = 29, 
		RULE_abstractFuncDeclaration = 30, RULE_annotationDeclaration = 31, RULE_annotated = 32, 
		RULE_expression = 33, RULE_expressions = 34, RULE_param = 35, RULE_params = 36, 
		RULE_paramsBlock = 37, RULE_namedParam = 38, RULE_namedParams = 39, RULE_namedParamsBlock = 40, 
		RULE_literal = 41, RULE_objectProperty = 42, RULE_identifier = 43, RULE_identifierPath = 44, 
		RULE_useType = 45, RULE_useTypes = 46, RULE_useTypeParam = 47, RULE_useTypeParams = 48, 
		RULE_useTypeParamsBlock = 49, RULE_declTypeParam = 50, RULE_declTypeParams = 51, 
		RULE_declTypeParamsBlock = 52, RULE_eos = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "statement", 
			"stmt", "body", "catchBlock", "condition", "switchCaseBlock", "switchCaseLabel", 
			"forInit", "forInitDeclaration", "variableDeclaration", "variableDeclarators", 
			"variableDeclarator", "funcDeclaration", "funcParamsBlock", "funcParams", 
			"funcParam", "funcReturn", "enumDeclaration", "enumFieldDeclarator", 
			"enumFieldDeclarators", "structDeclaration", "extendsBlock", "classDeclaration", 
			"classMemberDeclaration", "constructorDeclaration", "interfaceDeclaration", 
			"interfaceMemberDeclaration", "abstractFuncDeclaration", "annotationDeclaration", 
			"annotated", "expression", "expressions", "param", "params", "paramsBlock", 
			"namedParam", "namedParams", "namedParamsBlock", "literal", "objectProperty", 
			"identifier", "identifierPath", "useType", "useTypes", "useTypeParam", 
			"useTypeParams", "useTypeParamsBlock", "declTypeParam", "declTypeParams", 
			"declTypeParamsBlock", "eos"
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
			null, null, null, null, "'!'", "'~'", "'?'", "'=='", "'!='", "'>'", "'<'", 
			"'<='", "'>='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", 
			"'/'", "'&'", "'|'", "'^'", "'%'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'=>'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", null, null, null, null, "'.'", "','", "';'", 
			"':'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PACKAGE", "IMPORT", "VAR", "CONST", "NULL", "TRUE", "FALSE", "THROW", 
			"TRY", "CATCH", "FINALLY", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"LOOP", "DO", "WHILE", "FOR", "IN", "CONTINUE", "BREAK", "FUNC", "RETURN", 
			"VOID", "ENUM", "STRUCT", "CLASS", "EXTENDS", "NEW", "CONSTRUCTOR", "THIS", 
			"SUPER", "INTERFACE", "IMPLEMENTS", "ANNOTATION", "INT_LITERAL", "LONG_LITERAL", 
			"FLOAT_LITERAL", "DOUBLE_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"LOGICAL_NOT", "BITWISE_NOT", "QUESTION", "EQUALITY", "INEQUALITY", "GREATER_THAN", 
			"LESS_THAN", "LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", "LOGICAL_AND", 
			"LOGICAL_OR", "INCREMENT", "DECREMENT", "ADDITION", "SUBTRACTION", "MULTIPLICATION", 
			"DIVISION", "BITWISE_AND", "BITWISE_OR", "EXCLUSIVE_OR", "REMAINDER", 
			"ASSIGNMENT", "ADDITION_ASSIGNMENT", "SUBTRACTION_ASSIGNMENT", "MULTIPLICATION_ASSIGNMENT", 
			"DIVISION_ASSIGNMENT", "AND_ASSIGNMENT", "OR_ASSIGNMENT", "EXCLUSIVE_OR_ASSIGNMENT", 
			"REMAINDER_ASSIGNMENT", "LEFT_SHIFT_ASSIGNMENT", "RIGHT_SHIFT_ASSIGNMENT", 
			"ARROW", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACK", 
			"RIGHT_BRACK", "WS", "NL", "COMMENT", "LINE_COMMENT", "DOT", "COMMA", 
			"SEMI", "COLON", "AT", "ELLIPSIS", "IDENTIFIER"
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(108);
				packageDeclaration();
				}
				break;
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(111);
				importDeclaration();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << ANNOTATION) | (1L << INT_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << LOGICAL_NOT) | (1L << BITWISE_NOT) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LEFT_PAREN - 77)) | (1L << (LEFT_BRACE - 77)) | (1L << (LEFT_BRACK - 77)) | (1L << (SEMI - 77)) | (1L << (AT - 77)) | (1L << (IDENTIFIER - 77)))) != 0)) {
				{
				{
				setState(117);
				statement();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
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
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(125);
				annotated();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(PACKAGE);
			setState(132);
			identifierPath();
			setState(133);
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
			setState(135);
			match(IMPORT);
			setState(136);
			identifierPath();
			setState(137);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				funcDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				enumDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				structDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				interfaceDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				body();
				}
				break;
			case 2:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(CONTINUE);
				setState(151);
				eos();
				}
				break;
			case 3:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(BREAK);
				setState(153);
				eos();
				}
				break;
			case 4:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(RETURN);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INT_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << LOGICAL_NOT) | (1L << BITWISE_NOT) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LEFT_PAREN - 77)) | (1L << (LEFT_BRACE - 77)) | (1L << (LEFT_BRACK - 77)) | (1L << (IDENTIFIER - 77)))) != 0)) {
					{
					setState(155);
					expression(0);
					}
				}

				setState(158);
				eos();
				}
				break;
			case 5:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				match(THROW);
				setState(160);
				expression(0);
				setState(161);
				eos();
				}
				break;
			case 6:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				match(TRY);
				setState(164);
				body();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(165);
					catchBlock();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(171);
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
				setState(174);
				match(IF);
				setState(175);
				condition();
				setState(176);
				statement();
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(177);
					match(ELSE);
					setState(178);
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
				setState(181);
				match(SWITCH);
				setState(182);
				condition();
				setState(183);
				match(LEFT_BRACE);
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184);
					switchCaseBlock();
					}
					}
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE || _la==DEFAULT );
				setState(189);
				match(RIGHT_BRACE);
				}
				break;
			case 9:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(191);
				match(WHILE);
				setState(192);
				condition();
				setState(193);
				statement();
				}
				break;
			case 10:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(195);
				match(DO);
				setState(196);
				statement();
				setState(197);
				match(WHILE);
				setState(198);
				condition();
				setState(199);
				eos();
				}
				break;
			case 11:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(201);
				match(FOR);
				setState(202);
				match(LEFT_PAREN);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INT_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << LOGICAL_NOT) | (1L << BITWISE_NOT) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LEFT_PAREN - 77)) | (1L << (LEFT_BRACE - 77)) | (1L << (LEFT_BRACK - 77)) | (1L << (AT - 77)) | (1L << (IDENTIFIER - 77)))) != 0)) {
					{
					setState(203);
					forInit();
					}
				}

				setState(206);
				match(SEMI);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INT_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << LOGICAL_NOT) | (1L << BITWISE_NOT) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LEFT_PAREN - 77)) | (1L << (LEFT_BRACE - 77)) | (1L << (LEFT_BRACK - 77)) | (1L << (IDENTIFIER - 77)))) != 0)) {
					{
					setState(207);
					expression(0);
					}
				}

				setState(210);
				match(SEMI);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INT_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << LOGICAL_NOT) | (1L << BITWISE_NOT) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LEFT_PAREN - 77)) | (1L << (LEFT_BRACE - 77)) | (1L << (LEFT_BRACK - 77)) | (1L << (IDENTIFIER - 77)))) != 0)) {
					{
					setState(211);
					expressions();
					}
				}

				setState(214);
				match(RIGHT_PAREN);
				setState(215);
				statement();
				}
				break;
			case 12:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(216);
				match(FOR);
				setState(217);
				match(LEFT_PAREN);
				setState(218);
				((ForInStatementContext)_localctx).element = identifier();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(219);
					match(COMMA);
					setState(220);
					((ForInStatementContext)_localctx).index = identifier();
					}
				}

				setState(223);
				match(IN);
				setState(224);
				expression(0);
				setState(225);
				match(RIGHT_PAREN);
				setState(226);
				statement();
				}
				break;
			case 13:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(228);
				expression(0);
				setState(229);
				eos();
				}
				break;
			case 14:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(231);
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
			setState(234);
			match(LEFT_BRACE);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << ANNOTATION) | (1L << INT_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << LOGICAL_NOT) | (1L << BITWISE_NOT) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LEFT_PAREN - 77)) | (1L << (LEFT_BRACE - 77)) | (1L << (LEFT_BRACK - 77)) | (1L << (SEMI - 77)) | (1L << (AT - 77)) | (1L << (IDENTIFIER - 77)))) != 0)) {
				{
				{
				setState(235);
				statement();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
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
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
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
			setState(243);
			match(CATCH);
			setState(244);
			match(LEFT_PAREN);
			setState(245);
			variableDeclarator();
			setState(246);
			match(RIGHT_PAREN);
			setState(247);
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
			setState(249);
			match(LEFT_PAREN);
			setState(250);
			expression(0);
			setState(251);
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
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				switchCaseLabel();
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(258);
				statement();
				}
				}
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << ANNOTATION) | (1L << INT_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << LOGICAL_NOT) | (1L << BITWISE_NOT) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LEFT_PAREN - 77)) | (1L << (LEFT_BRACE - 77)) | (1L << (LEFT_BRACK - 77)) | (1L << (SEMI - 77)) | (1L << (AT - 77)) | (1L << (IDENTIFIER - 77)))) != 0) );
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
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(CASE);
				setState(264);
				expression(0);
				setState(265);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(DEFAULT);
				setState(268);
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
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case CONST:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				forInitDeclaration();
				}
				break;
			case NULL:
			case TRUE:
			case FALSE:
			case NEW:
			case THIS:
			case SUPER:
			case INT_LITERAL:
			case LONG_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case LOGICAL_NOT:
			case BITWISE_NOT:
			case ADDITION:
			case SUBTRACTION:
			case LEFT_PAREN:
			case LEFT_BRACE:
			case LEFT_BRACK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
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
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
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
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(275);
				annotated();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(282);
			variableDeclarators();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
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
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(284);
				annotated();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(291);
			variableDeclarators();
			setState(292);
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaiParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			variableDeclarator();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(295);
				match(COMMA);
				setState(296);
				variableDeclarator();
				}
				}
				setState(301);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
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
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			identifier();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(303);
				match(COLON);
				setState(304);
				useType();
				}
			}

			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(307);
				match(ASSIGNMENT);
				setState(308);
				expression(0);
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
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(311);
				annotated();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			match(FUNC);
			setState(318);
			identifier();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(319);
				declTypeParamsBlock();
				}
			}

			setState(322);
			funcParamsBlock();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(323);
				funcReturn();
				}
			}

			setState(326);
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
			setState(328);
			match(LEFT_PAREN);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENTIFIER) {
				{
				setState(329);
				funcParams();
				}
			}

			setState(332);
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
			setState(334);
			funcParam();
			{
			setState(335);
			match(COMMA);
			setState(336);
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
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
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
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(338);
				annotated();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			variableDeclarator();
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
			setState(346);
			match(COLON);
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(347);
				useType();
				}
				break;
			case VOID:
				{
				setState(348);
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
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(351);
				annotated();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			match(ENUM);
			setState(358);
			identifier();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(359);
				match(LESS_THAN);
				setState(360);
				useTypeParam();
				setState(361);
				match(GREATER_THAN);
				}
			}

			setState(365);
			match(LEFT_BRACE);
			setState(366);
			enumFieldDeclarators();
			setState(367);
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
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(369);
				annotated();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			identifier();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(376);
				match(ASSIGNMENT);
				setState(377);
				expression(0);
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
			setState(380);
			enumFieldDeclarator();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(381);
				match(COMMA);
				setState(382);
				enumFieldDeclarator();
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
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
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
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
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(390);
				annotated();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(STRUCT);
			setState(397);
			identifier();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(398);
				declTypeParamsBlock();
				}
			}

			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(401);
				extendsBlock();
				}
			}

			setState(404);
			match(LEFT_BRACE);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==CONST || _la==AT) {
				{
				{
				setState(405);
				variableDeclaration();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
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
			setState(413);
			match(EXTENDS);
			setState(414);
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
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(416);
				annotated();
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
			match(CLASS);
			setState(423);
			identifier();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(424);
				declTypeParamsBlock();
				}
			}

			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(427);
				extendsBlock();
				}
			}

			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(430);
				match(IMPLEMENTS);
				setState(431);
				((ClassDeclarationContext)_localctx).implTypes = useTypes();
				}
			}

			setState(434);
			match(LEFT_BRACE);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << FUNC) | (1L << CONSTRUCTOR))) != 0) || _la==AT) {
				{
				{
				setState(435);
				classMemberDeclaration();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
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
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				funcDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
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
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(448);
				annotated();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(CONSTRUCTOR);
			setState(455);
			funcParamsBlock();
			setState(456);
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
			match(INTERFACE);
			setState(465);
			identifier();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(466);
				declTypeParamsBlock();
				}
			}

			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(469);
				extendsBlock();
				}
			}

			setState(472);
			match(LEFT_BRACE);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << FUNC))) != 0) || _la==AT) {
				{
				{
				setState(473);
				interfaceMemberDeclaration();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
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
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				funcDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
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
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(486);
				annotated();
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			match(FUNC);
			setState(493);
			identifier();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(494);
				declTypeParamsBlock();
				}
			}

			setState(497);
			funcParamsBlock();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(498);
				funcReturn();
				}
			}

			setState(501);
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
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
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
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(503);
				annotated();
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
			match(ANNOTATION);
			setState(510);
			identifier();
			setState(511);
			match(LEFT_BRACE);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==CONST || _la==AT) {
				{
				{
				setState(512);
				variableDeclaration();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
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
			setState(520);
			match(AT);
			setState(521);
			identifierPath();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(522);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncrementalExpressionContext extends ExpressionContext {
		public Token oper;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(DaiParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(DaiParser.DECREMENT, 0); }
		public IncrementalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitIncrementalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token oper;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADDITION() { return getToken(DaiParser.ADDITION, 0); }
		public TerminalNode SUBTRACTION() { return getToken(DaiParser.SUBTRACTION, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token oper;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(DaiParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(DaiParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(DaiParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(DaiParser.LESS_THAN_OR_EQUAL, 0); }
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public Token oper;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BITWISE_NOT() { return getToken(DaiParser.BITWISE_NOT, 0); }
		public TerminalNode LOGICAL_NOT() { return getToken(DaiParser.LOGICAL_NOT, 0); }
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuperExpressionContext extends ExpressionContext {
		public TerminalNode SUPER() { return getToken(DaiParser.SUPER, 0); }
		public SuperExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitSuperExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token oper;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICAL_AND() { return getToken(DaiParser.LOGICAL_AND, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseAndExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token oper;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISE_AND() { return getToken(DaiParser.BITWISE_AND, 0); }
		public BitwiseAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitBitwiseAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token oper;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADDITION() { return getToken(DaiParser.ADDITION, 0); }
		public TerminalNode SUBTRACTION() { return getToken(DaiParser.SUBTRACTION, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token oper;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALITY() { return getToken(DaiParser.EQUALITY, 0); }
		public TerminalNode INEQUALITY() { return getToken(DaiParser.INEQUALITY, 0); }
		public EqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaExpressionContext extends ExpressionContext {
		public TerminalNode ARROW() { return getToken(DaiParser.ARROW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FuncParamsBlockContext funcParamsBlock() {
			return getRuleContext(FuncParamsBlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LambdaExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token leftOper;
		public Token rightOper;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(DaiParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(DaiParser.LESS_THAN, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(DaiParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(DaiParser.GREATER_THAN, i);
		}
		public ShiftExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public ExpressionContext test;
		public ExpressionContext consequent;
		public ExpressionContext alternate;
		public TerminalNode QUESTION() { return getToken(DaiParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(DaiParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpressionContext extends ExpressionContext {
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
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token oper;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		public AssignExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token oper;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLICATION() { return getToken(DaiParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(DaiParser.DIVISION, 0); }
		public TerminalNode REMAINDER() { return getToken(DaiParser.REMAINDER, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberExpressionContext extends ExpressionContext {
		public ExpressionContext object;
		public ExpressionContext property;
		public TerminalNode LEFT_BRACK() { return getToken(DaiParser.LEFT_BRACK, 0); }
		public TerminalNode RIGHT_BRACK() { return getToken(DaiParser.RIGHT_BRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MemberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token oper;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICAL_OR() { return getToken(DaiParser.LOGICAL_OR, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChainExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DaiParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(DaiParser.QUESTION, 0); }
		public ChainExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitChainExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseOrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token oper;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISE_OR() { return getToken(DaiParser.BITWISE_OR, 0); }
		public BitwiseOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitBitwiseOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParamsBlockContext paramsBlock() {
			return getRuleContext(ParamsBlockContext.class,0);
		}
		public CallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpressionContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(DaiParser.THIS, 0); }
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExclusiveOrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token oper;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXCLUSIVE_OR() { return getToken(DaiParser.EXCLUSIVE_OR, 0); }
		public ExclusiveOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(526);
				match(LEFT_PAREN);
				setState(527);
				expression(0);
				setState(528);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(530);
				match(THIS);
				}
				break;
			case 3:
				{
				_localctx = new SuperExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(531);
				match(SUPER);
				}
				break;
			case 4:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(532);
				identifier();
				}
				break;
			case 5:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(533);
				match(NEW);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(534);
					annotated();
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(540);
				useType();
				setState(541);
				paramsBlock();
				}
				break;
			case 6:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(543);
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
				setState(544);
				expression(16);
				}
				break;
			case 7:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(545);
				((NotExpressionContext)_localctx).oper = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LOGICAL_NOT || _la==BITWISE_NOT) ) {
					((NotExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(546);
				expression(15);
				}
				break;
			case 8:
				{
				_localctx = new LambdaExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(549);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(547);
					identifier();
					}
					break;
				case LEFT_PAREN:
					{
					setState(548);
					funcParamsBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(551);
				match(ARROW);
				setState(554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(552);
					expression(0);
					}
					break;
				case 2:
					{
					setState(553);
					body();
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(556);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(618);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicativeExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(559);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(560);
						((MultiplicativeExpressionContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (MULTIPLICATION - 59)) | (1L << (DIVISION - 59)) | (1L << (REMAINDER - 59)))) != 0)) ) {
							((MultiplicativeExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(561);
						((MultiplicativeExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditiveExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(562);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(563);
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
						setState(564);
						((AdditiveExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ShiftExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(565);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(570);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LESS_THAN:
							{
							setState(566);
							((ShiftExpressionContext)_localctx).leftOper = match(LESS_THAN);
							setState(567);
							match(LESS_THAN);
							}
							break;
						case GREATER_THAN:
							{
							setState(568);
							((ShiftExpressionContext)_localctx).rightOper = match(GREATER_THAN);
							setState(569);
							match(GREATER_THAN);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(572);
						((ShiftExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(573);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(574);
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
						setState(575);
						((RelationalExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 5:
						{
						_localctx = new EqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(576);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(577);
						((EqualExpressionContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUALITY || _la==INEQUALITY) ) {
							((EqualExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(578);
						((EqualExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 6:
						{
						_localctx = new BitwiseAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseAndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(579);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(580);
						((BitwiseAndExpressionContext)_localctx).oper = match(BITWISE_AND);
						setState(581);
						((BitwiseAndExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExclusiveOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ExclusiveOrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(582);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(583);
						((ExclusiveOrExpressionContext)_localctx).oper = match(EXCLUSIVE_OR);
						setState(584);
						((ExclusiveOrExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseOrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(585);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(586);
						((BitwiseOrExpressionContext)_localctx).oper = match(BITWISE_OR);
						setState(587);
						((BitwiseOrExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 9:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(588);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(589);
						((AndExpressionContext)_localctx).oper = match(LOGICAL_AND);
						setState(590);
						((AndExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 10:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(591);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(592);
						((OrExpressionContext)_localctx).oper = match(LOGICAL_OR);
						setState(593);
						((OrExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).test = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(594);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(595);
						match(QUESTION);
						setState(596);
						((ConditionalExpressionContext)_localctx).consequent = expression(0);
						setState(597);
						match(COLON);
						setState(598);
						((ConditionalExpressionContext)_localctx).alternate = expression(4);
						}
						break;
					case 12:
						{
						_localctx = new AssignExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AssignExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(600);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(601);
						((AssignExpressionContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ASSIGNMENT - 65)) | (1L << (ADDITION_ASSIGNMENT - 65)) | (1L << (SUBTRACTION_ASSIGNMENT - 65)) | (1L << (MULTIPLICATION_ASSIGNMENT - 65)) | (1L << (DIVISION_ASSIGNMENT - 65)) | (1L << (AND_ASSIGNMENT - 65)) | (1L << (OR_ASSIGNMENT - 65)) | (1L << (EXCLUSIVE_OR_ASSIGNMENT - 65)) | (1L << (REMAINDER_ASSIGNMENT - 65)) | (1L << (LEFT_SHIFT_ASSIGNMENT - 65)) | (1L << (RIGHT_SHIFT_ASSIGNMENT - 65)))) != 0)) ) {
							((AssignExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(602);
						((AssignExpressionContext)_localctx).right = expression(3);
						}
						break;
					case 13:
						{
						_localctx = new ChainExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(603);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(605);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QUESTION) {
							{
							setState(604);
							match(QUESTION);
							}
						}

						setState(607);
						match(DOT);
						setState(608);
						identifier();
						}
						break;
					case 14:
						{
						_localctx = new MemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MemberExpressionContext)_localctx).object = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(609);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(610);
						match(LEFT_BRACK);
						setState(611);
						((MemberExpressionContext)_localctx).property = expression(0);
						setState(612);
						match(RIGHT_BRACK);
						}
						break;
					case 15:
						{
						_localctx = new CallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(614);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(615);
						paramsBlock();
						}
						break;
					case 16:
						{
						_localctx = new IncrementalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(616);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(617);
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
				setState(622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		enterRule(_localctx, 68, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			expression(0);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(624);
				match(COMMA);
				setState(625);
				expression(0);
				}
				}
				setState(630);
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
		enterRule(_localctx, 70, RULE_param);
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
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
		enterRule(_localctx, 72, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			param();
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(636);
				match(COMMA);
				setState(637);
				param();
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
		enterRule(_localctx, 74, RULE_paramsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(LEFT_PAREN);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INT_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << LOGICAL_NOT) | (1L << BITWISE_NOT) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LEFT_PAREN - 77)) | (1L << (LEFT_BRACE - 77)) | (1L << (LEFT_BRACK - 77)) | (1L << (IDENTIFIER - 77)))) != 0)) {
				{
				setState(644);
				params();
				}
			}

			setState(647);
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
		enterRule(_localctx, 76, RULE_namedParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			identifier();
			{
			setState(650);
			match(ASSIGNMENT);
			setState(651);
			expression(0);
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
		enterRule(_localctx, 78, RULE_namedParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			namedParam();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(654);
				match(COMMA);
				setState(655);
				namedParam();
				}
				}
				setState(660);
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
		enterRule(_localctx, 80, RULE_namedParamsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(LEFT_PAREN);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(662);
				namedParams();
				}
			}

			setState(665);
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
	public static class NullLiteralContext extends LiteralContext {
		public TerminalNode NULL() { return getToken(DaiParser.NULL, 0); }
		public NullLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseLiteralContext extends LiteralContext {
		public TerminalNode FALSE() { return getToken(DaiParser.FALSE, 0); }
		public FalseLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectLiteralContext extends LiteralContext {
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public ObjectLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
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
	public static class ArrayLiteralContext extends LiteralContext {
		public TerminalNode LEFT_BRACK() { return getToken(DaiParser.LEFT_BRACK, 0); }
		public TerminalNode RIGHT_BRACK() { return getToken(DaiParser.RIGHT_BRACK, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ArrayLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends LiteralContext {
		public TerminalNode INT_LITERAL() { return getToken(DaiParser.INT_LITERAL, 0); }
		public IntLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitIntLiteral(this);
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
	public static class FloatLiteralContext extends LiteralContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(DaiParser.FLOAT_LITERAL, 0); }
		public FloatLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharLiteralContext extends LiteralContext {
		public TerminalNode CHAR_LITERAL() { return getToken(DaiParser.CHAR_LITERAL, 0); }
		public CharLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueLiteralContext extends LiteralContext {
		public TerminalNode TRUE() { return getToken(DaiParser.TRUE, 0); }
		public TrueLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitTrueLiteral(this);
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
		enterRule(_localctx, 82, RULE_literal);
		int _la;
		try {
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(INT_LITERAL);
				}
				break;
			case LONG_LITERAL:
				_localctx = new LongLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				match(LONG_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(669);
				match(FLOAT_LITERAL);
				}
				break;
			case DOUBLE_LITERAL:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(670);
				match(DOUBLE_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(671);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(672);
				match(STRING_LITERAL);
				}
				break;
			case TRUE:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(673);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(674);
				match(FALSE);
				}
				break;
			case NULL:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(675);
				match(NULL);
				}
				break;
			case LEFT_BRACK:
				_localctx = new ArrayLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(676);
				match(LEFT_BRACK);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INT_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << LOGICAL_NOT) | (1L << BITWISE_NOT) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LEFT_PAREN - 77)) | (1L << (LEFT_BRACE - 77)) | (1L << (LEFT_BRACK - 77)) | (1L << (IDENTIFIER - 77)))) != 0)) {
					{
					setState(677);
					expressions();
					}
				}

				setState(680);
				match(RIGHT_BRACK);
				}
				break;
			case LEFT_BRACE:
				_localctx = new ObjectLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(681);
				match(LEFT_BRACE);
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(682);
					objectProperty();
					}
					}
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(688);
				match(RIGHT_BRACE);
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
		enterRule(_localctx, 84, RULE_objectProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			identifier();
			setState(692);
			match(COLON);
			setState(693);
			expression(0);
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
		enterRule(_localctx, 86, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
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
		enterRule(_localctx, 88, RULE_identifierPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			identifier();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(698);
				match(DOT);
				setState(699);
				identifier();
				}
				}
				setState(704);
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
		enterRule(_localctx, 90, RULE_useType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			identifierPath();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(706);
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
		enterRule(_localctx, 92, RULE_useTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			useType();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(710);
				match(COMMA);
				setState(711);
				useType();
				}
				}
				setState(716);
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
		enterRule(_localctx, 94, RULE_useTypeParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
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
		enterRule(_localctx, 96, RULE_useTypeParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			useTypeParam();
			{
			setState(720);
			match(COMMA);
			setState(721);
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
		enterRule(_localctx, 98, RULE_useTypeParamsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(LESS_THAN);
			setState(724);
			useTypeParams();
			setState(725);
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
		public TerminalNode EXTENDS() { return getToken(DaiParser.EXTENDS, 0); }
		public UseTypeContext useType() {
			return getRuleContext(UseTypeContext.class,0);
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
		enterRule(_localctx, 100, RULE_declTypeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			identifier();
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(728);
				match(EXTENDS);
				setState(729);
				useType();
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
		enterRule(_localctx, 102, RULE_declTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			declTypeParam();
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(733);
				match(COMMA);
				setState(734);
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
		enterRule(_localctx, 104, RULE_declTypeParamsBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(LESS_THAN);
			setState(738);
			declTypeParams();
			setState(739);
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
		enterRule(_localctx, 106, RULE_eos);
		int _la;
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(741);
					match(NL);
					}
					}
					setState(744); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(746);
					match(NL);
					}
					}
					setState(751);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(752);
				match(SEMI);
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(753);
					match(NL);
					}
					}
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(759);
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
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 21);
		case 13:
			return precpred(_ctx, 20);
		case 14:
			return precpred(_ctx, 19);
		case 15:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3_\u02fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\5\2p\n\2\3\2\7\2s\n\2\f\2\16\2v"+
		"\13\2\3\2\7\2y\n\2\f\2\16\2|\13\2\3\2\3\2\3\3\7\3\u0081\n\3\f\3\16\3\u0084"+
		"\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u0096\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009f\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u00a9\n\6\f\6\16\6\u00ac\13\6\3\6\5\6\u00af\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00b6\n\6\3\6\3\6\3\6\3\6\6\6\u00bc\n\6\r\6\16"+
		"\6\u00bd\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00cf\n\6\3\6\3\6\5\6\u00d3\n\6\3\6\3\6\5\6\u00d7\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u00e0\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00eb"+
		"\n\6\3\7\3\7\7\7\u00ef\n\7\f\7\16\7\u00f2\13\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\6\n\u0101\n\n\r\n\16\n\u0102\3\n\6\n\u0106"+
		"\n\n\r\n\16\n\u0107\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0110\n\13\3\f"+
		"\3\f\5\f\u0114\n\f\3\r\7\r\u0117\n\r\f\r\16\r\u011a\13\r\3\r\3\r\3\r\3"+
		"\16\7\16\u0120\n\16\f\16\16\16\u0123\13\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\7\17\u012c\n\17\f\17\16\17\u012f\13\17\3\20\3\20\3\20\5\20\u0134"+
		"\n\20\3\20\3\20\5\20\u0138\n\20\3\21\7\21\u013b\n\21\f\21\16\21\u013e"+
		"\13\21\3\21\3\21\3\21\5\21\u0143\n\21\3\21\3\21\5\21\u0147\n\21\3\21\3"+
		"\21\3\22\3\22\5\22\u014d\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\7\24"+
		"\u0156\n\24\f\24\16\24\u0159\13\24\3\24\3\24\3\25\3\25\3\25\5\25\u0160"+
		"\n\25\3\26\7\26\u0163\n\26\f\26\16\26\u0166\13\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u016e\n\26\3\26\3\26\3\26\3\26\3\27\7\27\u0175\n\27\f"+
		"\27\16\27\u0178\13\27\3\27\3\27\3\27\5\27\u017d\n\27\3\30\3\30\3\30\7"+
		"\30\u0182\n\30\f\30\16\30\u0185\13\30\3\30\3\30\3\31\7\31\u018a\n\31\f"+
		"\31\16\31\u018d\13\31\3\31\3\31\3\31\5\31\u0192\n\31\3\31\5\31\u0195\n"+
		"\31\3\31\3\31\7\31\u0199\n\31\f\31\16\31\u019c\13\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\33\7\33\u01a4\n\33\f\33\16\33\u01a7\13\33\3\33\3\33\3\33\5"+
		"\33\u01ac\n\33\3\33\5\33\u01af\n\33\3\33\3\33\5\33\u01b3\n\33\3\33\3\33"+
		"\7\33\u01b7\n\33\f\33\16\33\u01ba\13\33\3\33\3\33\3\34\3\34\3\34\5\34"+
		"\u01c1\n\34\3\35\7\35\u01c4\n\35\f\35\16\35\u01c7\13\35\3\35\3\35\3\35"+
		"\3\35\3\36\7\36\u01ce\n\36\f\36\16\36\u01d1\13\36\3\36\3\36\3\36\5\36"+
		"\u01d6\n\36\3\36\5\36\u01d9\n\36\3\36\3\36\7\36\u01dd\n\36\f\36\16\36"+
		"\u01e0\13\36\3\36\3\36\3\37\3\37\3\37\5\37\u01e7\n\37\3 \7 \u01ea\n \f"+
		" \16 \u01ed\13 \3 \3 \3 \5 \u01f2\n \3 \3 \5 \u01f6\n \3 \3 \3!\7!\u01fb"+
		"\n!\f!\16!\u01fe\13!\3!\3!\3!\3!\7!\u0204\n!\f!\16!\u0207\13!\3!\3!\3"+
		"\"\3\"\3\"\5\"\u020e\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u021a\n#\f#"+
		"\16#\u021d\13#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0228\n#\3#\3#\3#\5#\u022d"+
		"\n#\3#\5#\u0230\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u023d\n#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0260\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\7#\u026d\n#\f#\16#\u0270\13#\3$\3$\3$\7$\u0275\n$\f$\16$\u0278\13$\3"+
		"%\3%\5%\u027c\n%\3&\3&\3&\7&\u0281\n&\f&\16&\u0284\13&\3\'\3\'\5\'\u0288"+
		"\n\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\7)\u0293\n)\f)\16)\u0296\13)\3*\3*\5"+
		"*\u029a\n*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02a9\n+\3+\3+\3"+
		"+\7+\u02ae\n+\f+\16+\u02b1\13+\3+\5+\u02b4\n+\3,\3,\3,\3,\3-\3-\3.\3."+
		"\3.\7.\u02bf\n.\f.\16.\u02c2\13.\3/\3/\5/\u02c6\n/\3\60\3\60\3\60\7\60"+
		"\u02cb\n\60\f\60\16\60\u02ce\13\60\3\61\3\61\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\5\64\u02dd\n\64\3\65\3\65\3\65\5\65\u02e2"+
		"\n\65\3\66\3\66\3\66\3\66\3\67\6\67\u02e9\n\67\r\67\16\67\u02ea\3\67\7"+
		"\67\u02ee\n\67\f\67\16\67\u02f1\13\67\3\67\3\67\7\67\u02f5\n\67\f\67\16"+
		"\67\u02f8\13\67\3\67\5\67\u02fb\n\67\3\67\2\3D8\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\n\3"+
		"\2\5\6\3\2;<\3\2./\4\2=>BB\3\2\63\66\3\2\61\62\3\2CM\3\29:\2\u034d\2o"+
		"\3\2\2\2\4\u0082\3\2\2\2\6\u0089\3\2\2\2\b\u0095\3\2\2\2\n\u00ea\3\2\2"+
		"\2\f\u00ec\3\2\2\2\16\u00f5\3\2\2\2\20\u00fb\3\2\2\2\22\u0100\3\2\2\2"+
		"\24\u010f\3\2\2\2\26\u0113\3\2\2\2\30\u0118\3\2\2\2\32\u0121\3\2\2\2\34"+
		"\u0128\3\2\2\2\36\u0130\3\2\2\2 \u013c\3\2\2\2\"\u014a\3\2\2\2$\u0150"+
		"\3\2\2\2&\u0157\3\2\2\2(\u015c\3\2\2\2*\u0164\3\2\2\2,\u0176\3\2\2\2."+
		"\u017e\3\2\2\2\60\u018b\3\2\2\2\62\u019f\3\2\2\2\64\u01a5\3\2\2\2\66\u01c0"+
		"\3\2\2\28\u01c5\3\2\2\2:\u01cf\3\2\2\2<\u01e6\3\2\2\2>\u01eb\3\2\2\2@"+
		"\u01fc\3\2\2\2B\u020a\3\2\2\2D\u022f\3\2\2\2F\u0271\3\2\2\2H\u027b\3\2"+
		"\2\2J\u027d\3\2\2\2L\u0285\3\2\2\2N\u028b\3\2\2\2P\u028f\3\2\2\2R\u0297"+
		"\3\2\2\2T\u02b3\3\2\2\2V\u02b5\3\2\2\2X\u02b9\3\2\2\2Z\u02bb\3\2\2\2\\"+
		"\u02c3\3\2\2\2^\u02c7\3\2\2\2`\u02cf\3\2\2\2b\u02d1\3\2\2\2d\u02d5\3\2"+
		"\2\2f\u02d9\3\2\2\2h\u02de\3\2\2\2j\u02e3\3\2\2\2l\u02fa\3\2\2\2np\5\4"+
		"\3\2on\3\2\2\2op\3\2\2\2pt\3\2\2\2qs\5\6\4\2rq\3\2\2\2sv\3\2\2\2tr\3\2"+
		"\2\2tu\3\2\2\2uz\3\2\2\2vt\3\2\2\2wy\5\b\5\2xw\3\2\2\2y|\3\2\2\2zx\3\2"+
		"\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\2\2\3~\3\3\2\2\2\177\u0081\5B\""+
		"\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\3\2\2\u0086"+
		"\u0087\5Z.\2\u0087\u0088\5l\67\2\u0088\5\3\2\2\2\u0089\u008a\7\4\2\2\u008a"+
		"\u008b\5Z.\2\u008b\u008c\5l\67\2\u008c\7\3\2\2\2\u008d\u0096\5\n\6\2\u008e"+
		"\u0096\5\32\16\2\u008f\u0096\5 \21\2\u0090\u0096\5*\26\2\u0091\u0096\5"+
		"\60\31\2\u0092\u0096\5\64\33\2\u0093\u0096\5:\36\2\u0094\u0096\5@!\2\u0095"+
		"\u008d\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0090\3\2"+
		"\2\2\u0095\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\t\3\2\2\2\u0097\u00eb\5\f\7\2\u0098\u0099\7\30\2"+
		"\2\u0099\u00eb\5l\67\2\u009a\u009b\7\31\2\2\u009b\u00eb\5l\67\2\u009c"+
		"\u009e\7\33\2\2\u009d\u009f\5D#\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00eb\5l\67\2\u00a1\u00a2\7\n\2\2\u00a2"+
		"\u00a3\5D#\2\u00a3\u00a4\5l\67\2\u00a4\u00eb\3\2\2\2\u00a5\u00a6\7\13"+
		"\2\2\u00a6\u00aa\5\f\7\2\u00a7\u00a9\5\16\b\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\5\f\7\2\u00ae\u00ad\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00eb\3\2\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\5"+
		"\20\t\2\u00b2\u00b5\5\b\5\2\u00b3\u00b4\7\17\2\2\u00b4\u00b6\5\b\5\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00eb\3\2\2\2\u00b7\u00b8\7\20"+
		"\2\2\u00b8\u00b9\5\20\t\2\u00b9\u00bb\7Q\2\2\u00ba\u00bc\5\22\n\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7R\2\2\u00c0\u00eb\3\2\2\2\u00c1"+
		"\u00c2\7\25\2\2\u00c2\u00c3\5\20\t\2\u00c3\u00c4\5\b\5\2\u00c4\u00eb\3"+
		"\2\2\2\u00c5\u00c6\7\24\2\2\u00c6\u00c7\5\b\5\2\u00c7\u00c8\7\25\2\2\u00c8"+
		"\u00c9\5\20\t\2\u00c9\u00ca\5l\67\2\u00ca\u00eb\3\2\2\2\u00cb\u00cc\7"+
		"\26\2\2\u00cc\u00ce\7O\2\2\u00cd\u00cf\5\26\f\2\u00ce\u00cd\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\7[\2\2\u00d1\u00d3\5D#"+
		"\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6"+
		"\7[\2\2\u00d5\u00d7\5F$\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\7P\2\2\u00d9\u00eb\5\b\5\2\u00da\u00db\7\26"+
		"\2\2\u00db\u00dc\7O\2\2\u00dc\u00df\5X-\2\u00dd\u00de\7Z\2\2\u00de\u00e0"+
		"\5X-\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\7\27\2\2\u00e2\u00e3\5D#\2\u00e3\u00e4\7P\2\2\u00e4\u00e5\5\b\5"+
		"\2\u00e5\u00eb\3\2\2\2\u00e6\u00e7\5D#\2\u00e7\u00e8\5l\67\2\u00e8\u00eb"+
		"\3\2\2\2\u00e9\u00eb\7[\2\2\u00ea\u0097\3\2\2\2\u00ea\u0098\3\2\2\2\u00ea"+
		"\u009a\3\2\2\2\u00ea\u009c\3\2\2\2\u00ea\u00a1\3\2\2\2\u00ea\u00a5\3\2"+
		"\2\2\u00ea\u00b0\3\2\2\2\u00ea\u00b7\3\2\2\2\u00ea\u00c1\3\2\2\2\u00ea"+
		"\u00c5\3\2\2\2\u00ea\u00cb\3\2\2\2\u00ea\u00da\3\2\2\2\u00ea\u00e6\3\2"+
		"\2\2\u00ea\u00e9\3\2\2\2\u00eb\13\3\2\2\2\u00ec\u00f0\7Q\2\2\u00ed\u00ef"+
		"\5\b\5\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7R"+
		"\2\2\u00f4\r\3\2\2\2\u00f5\u00f6\7\f\2\2\u00f6\u00f7\7O\2\2\u00f7\u00f8"+
		"\5\36\20\2\u00f8\u00f9\7P\2\2\u00f9\u00fa\5\f\7\2\u00fa\17\3\2\2\2\u00fb"+
		"\u00fc\7O\2\2\u00fc\u00fd\5D#\2\u00fd\u00fe\7P\2\2\u00fe\21\3\2\2\2\u00ff"+
		"\u0101\5\24\13\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3"+
		"\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0106\5\b\5\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\23\3\2\2\2\u0109\u010a\7\21\2\2\u010a\u010b\5D#\2\u010b\u010c"+
		"\7\\\2\2\u010c\u0110\3\2\2\2\u010d\u010e\7\22\2\2\u010e\u0110\7\\\2\2"+
		"\u010f\u0109\3\2\2\2\u010f\u010d\3\2\2\2\u0110\25\3\2\2\2\u0111\u0114"+
		"\5\30\r\2\u0112\u0114\5F$\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\27\3\2\2\2\u0115\u0117\5B\"\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2"+
		"\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011b\u011c\t\2\2\2\u011c\u011d\5\34\17\2\u011d\31\3\2\2\2\u011e"+
		"\u0120\5B\"\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\t\2\2\2\u0125\u0126\5\34\17\2\u0126\u0127\5l\67\2\u0127\33\3\2"+
		"\2\2\u0128\u012d\5\36\20\2\u0129\u012a\7Z\2\2\u012a\u012c\5\36\20\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\35\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0133\5X-\2\u0131\u0132"+
		"\7\\\2\2\u0132\u0134\5\\/\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0136\7C\2\2\u0136\u0138\5D#\2\u0137\u0135\3\2\2"+
		"\2\u0137\u0138\3\2\2\2\u0138\37\3\2\2\2\u0139\u013b\5B\"\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7\32\2\2\u0140\u0142\5"+
		"X-\2\u0141\u0143\5j\66\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0146\5\"\22\2\u0145\u0147\5(\25\2\u0146\u0145\3"+
		"\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\5\f\7\2\u0149"+
		"!\3\2\2\2\u014a\u014c\7O\2\2\u014b\u014d\5$\23\2\u014c\u014b\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7P\2\2\u014f#\3\2\2\2\u0150"+
		"\u0151\5&\24\2\u0151\u0152\7Z\2\2\u0152\u0153\5&\24\2\u0153%\3\2\2\2\u0154"+
		"\u0156\5B\"\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a"+
		"\u015b\5\36\20\2\u015b\'\3\2\2\2\u015c\u015f\7\\\2\2\u015d\u0160\5\\/"+
		"\2\u015e\u0160\7\34\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160"+
		")\3\2\2\2\u0161\u0163\5B\"\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0167\u0168\7\35\2\2\u0168\u016d\5X-\2\u0169\u016a\7\64\2\2\u016a"+
		"\u016b\5`\61\2\u016b\u016c\7\63\2\2\u016c\u016e\3\2\2\2\u016d\u0169\3"+
		"\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7Q\2\2\u0170"+
		"\u0171\5.\30\2\u0171\u0172\7R\2\2\u0172+\3\2\2\2\u0173\u0175\5B\"\2\u0174"+
		"\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017c\5X-\2\u017a\u017b"+
		"\7C\2\2\u017b\u017d\5D#\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"-\3\2\2\2\u017e\u0183\5,\27\2\u017f\u0180\7Z\2\2\u0180\u0182\5,\27\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\5l\67\2\u0187"+
		"/\3\2\2\2\u0188\u018a\5B\"\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018e\u018f\7\36\2\2\u018f\u0191\5X-\2\u0190\u0192\5j\66\2\u0191"+
		"\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0195\5\62"+
		"\32\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u019a\7Q\2\2\u0197\u0199\5\32\16\2\u0198\u0197\3\2\2\2\u0199\u019c\3"+
		"\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u019e\7R\2\2\u019e\61\3\2\2\2\u019f\u01a0\7 \2\2"+
		"\u01a0\u01a1\5\\/\2\u01a1\63\3\2\2\2\u01a2\u01a4\5B\"\2\u01a3\u01a2\3"+
		"\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7\37\2\2\u01a9\u01ab\5"+
		"X-\2\u01aa\u01ac\5j\66\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ae\3\2\2\2\u01ad\u01af\5\62\32\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3"+
		"\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01b1\7&\2\2\u01b1\u01b3\5^\60\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b8\7Q"+
		"\2\2\u01b5\u01b7\5\66\34\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01bb\u01bc\7R\2\2\u01bc\65\3\2\2\2\u01bd\u01c1\5\32\16\2\u01be\u01c1"+
		"\5 \21\2\u01bf\u01c1\58\35\2\u01c0\u01bd\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0"+
		"\u01bf\3\2\2\2\u01c1\67\3\2\2\2\u01c2\u01c4\5B\"\2\u01c3\u01c2\3\2\2\2"+
		"\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8"+
		"\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7\"\2\2\u01c9\u01ca\5\"\22\2"+
		"\u01ca\u01cb\5\f\7\2\u01cb9\3\2\2\2\u01cc\u01ce\5B\"\2\u01cd\u01cc\3\2"+
		"\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7%\2\2\u01d3\u01d5\5X-"+
		"\2\u01d4\u01d6\5j\66\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8"+
		"\3\2\2\2\u01d7\u01d9\5\62\32\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2"+
		"\u01d9\u01da\3\2\2\2\u01da\u01de\7Q\2\2\u01db\u01dd\5<\37\2\u01dc\u01db"+
		"\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7R\2\2\u01e2;\3\2\2\2\u01e3"+
		"\u01e7\5\32\16\2\u01e4\u01e7\5 \21\2\u01e5\u01e7\5> \2\u01e6\u01e3\3\2"+
		"\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7=\3\2\2\2\u01e8\u01ea"+
		"\5B\"\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7\32"+
		"\2\2\u01ef\u01f1\5X-\2\u01f0\u01f2\5j\66\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\5\"\22\2\u01f4\u01f6\5(\25\2"+
		"\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8"+
		"\5l\67\2\u01f8?\3\2\2\2\u01f9\u01fb\5B\"\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe"+
		"\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe"+
		"\u01fc\3\2\2\2\u01ff\u0200\7\'\2\2\u0200\u0201\5X-\2\u0201\u0205\7Q\2"+
		"\2\u0202\u0204\5\32\16\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0205\3\2"+
		"\2\2\u0208\u0209\7R\2\2\u0209A\3\2\2\2\u020a\u020b\7]\2\2\u020b\u020d"+
		"\5Z.\2\u020c\u020e\5R*\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"C\3\2\2\2\u020f\u0210\b#\1\2\u0210\u0211\7O\2\2\u0211\u0212\5D#\2\u0212"+
		"\u0213\7P\2\2\u0213\u0230\3\2\2\2\u0214\u0230\7#\2\2\u0215\u0230\7$\2"+
		"\2\u0216\u0230\5X-\2\u0217\u021b\7!\2\2\u0218\u021a\5B\"\2\u0219\u0218"+
		"\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\5\\/\2\u021f\u0220\5L\'"+
		"\2\u0220\u0230\3\2\2\2\u0221\u0222\t\3\2\2\u0222\u0230\5D#\22\u0223\u0224"+
		"\t\4\2\2\u0224\u0230\5D#\21\u0225\u0228\5X-\2\u0226\u0228\5\"\22\2\u0227"+
		"\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022c\7N"+
		"\2\2\u022a\u022d\5D#\2\u022b\u022d\5\f\7\2\u022c\u022a\3\2\2\2\u022c\u022b"+
		"\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u0230\5T+\2\u022f\u020f\3\2\2\2\u022f"+
		"\u0214\3\2\2\2\u022f\u0215\3\2\2\2\u022f\u0216\3\2\2\2\u022f\u0217\3\2"+
		"\2\2\u022f\u0221\3\2\2\2\u022f\u0223\3\2\2\2\u022f\u0227\3\2\2\2\u022f"+
		"\u022e\3\2\2\2\u0230\u026e\3\2\2\2\u0231\u0232\f\20\2\2\u0232\u0233\t"+
		"\5\2\2\u0233\u026d\5D#\21\u0234\u0235\f\17\2\2\u0235\u0236\t\3\2\2\u0236"+
		"\u026d\5D#\20\u0237\u023c\f\16\2\2\u0238\u0239\7\64\2\2\u0239\u023d\7"+
		"\64\2\2\u023a\u023b\7\63\2\2\u023b\u023d\7\63\2\2\u023c\u0238\3\2\2\2"+
		"\u023c\u023a\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u026d\5D#\17\u023f\u0240"+
		"\f\r\2\2\u0240\u0241\t\6\2\2\u0241\u026d\5D#\16\u0242\u0243\f\f\2\2\u0243"+
		"\u0244\t\7\2\2\u0244\u026d\5D#\r\u0245\u0246\f\13\2\2\u0246\u0247\7?\2"+
		"\2\u0247\u026d\5D#\f\u0248\u0249\f\n\2\2\u0249\u024a\7A\2\2\u024a\u026d"+
		"\5D#\13\u024b\u024c\f\t\2\2\u024c\u024d\7@\2\2\u024d\u026d\5D#\n\u024e"+
		"\u024f\f\b\2\2\u024f\u0250\7\67\2\2\u0250\u026d\5D#\t\u0251\u0252\f\7"+
		"\2\2\u0252\u0253\78\2\2\u0253\u026d\5D#\b\u0254\u0255\f\6\2\2\u0255\u0256"+
		"\7\60\2\2\u0256\u0257\5D#\2\u0257\u0258\7\\\2\2\u0258\u0259\5D#\6\u0259"+
		"\u026d\3\2\2\2\u025a\u025b\f\5\2\2\u025b\u025c\t\b\2\2\u025c\u026d\5D"+
		"#\5\u025d\u025f\f\27\2\2\u025e\u0260\7\60\2\2\u025f\u025e\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\7Y\2\2\u0262\u026d\5X-"+
		"\2\u0263\u0264\f\26\2\2\u0264\u0265\7S\2\2\u0265\u0266\5D#\2\u0266\u0267"+
		"\7T\2\2\u0267\u026d\3\2\2\2\u0268\u0269\f\25\2\2\u0269\u026d\5L\'\2\u026a"+
		"\u026b\f\23\2\2\u026b\u026d\t\t\2\2\u026c\u0231\3\2\2\2\u026c\u0234\3"+
		"\2\2\2\u026c\u0237\3\2\2\2\u026c\u023f\3\2\2\2\u026c\u0242\3\2\2\2\u026c"+
		"\u0245\3\2\2\2\u026c\u0248\3\2\2\2\u026c\u024b\3\2\2\2\u026c\u024e\3\2"+
		"\2\2\u026c\u0251\3\2\2\2\u026c\u0254\3\2\2\2\u026c\u025a\3\2\2\2\u026c"+
		"\u025d\3\2\2\2\u026c\u0263\3\2\2\2\u026c\u0268\3\2\2\2\u026c\u026a\3\2"+
		"\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"E\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0276\5D#\2\u0272\u0273\7Z\2\2\u0273"+
		"\u0275\5D#\2\u0274\u0272\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2"+
		"\2\u0276\u0277\3\2\2\2\u0277G\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027c"+
		"\5D#\2\u027a\u027c\5N(\2\u027b\u0279\3\2\2\2\u027b\u027a\3\2\2\2\u027c"+
		"I\3\2\2\2\u027d\u0282\5H%\2\u027e\u027f\7Z\2\2\u027f\u0281\5H%\2\u0280"+
		"\u027e\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2"+
		"\2\2\u0283K\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0287\7O\2\2\u0286\u0288"+
		"\5J&\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028a\7P\2\2\u028aM\3\2\2\2\u028b\u028c\5X-\2\u028c\u028d\7C\2\2\u028d"+
		"\u028e\5D#\2\u028eO\3\2\2\2\u028f\u0294\5N(\2\u0290\u0291\7Z\2\2\u0291"+
		"\u0293\5N(\2\u0292\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2"+
		"\2\u0294\u0295\3\2\2\2\u0295Q\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0299"+
		"\7O\2\2\u0298\u029a\5P)\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029c\7P\2\2\u029cS\3\2\2\2\u029d\u02b4\7(\2\2\u029e"+
		"\u02b4\7)\2\2\u029f\u02b4\7*\2\2\u02a0\u02b4\7+\2\2\u02a1\u02b4\7,\2\2"+
		"\u02a2\u02b4\7-\2\2\u02a3\u02b4\7\b\2\2\u02a4\u02b4\7\t\2\2\u02a5\u02b4"+
		"\7\7\2\2\u02a6\u02a8\7S\2\2\u02a7\u02a9\5F$\2\u02a8\u02a7\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02b4\7T\2\2\u02ab\u02af\7Q\2"+
		"\2\u02ac\u02ae\5V,\2\u02ad\u02ac\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad"+
		"\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2"+
		"\u02b4\7R\2\2\u02b3\u029d\3\2\2\2\u02b3\u029e\3\2\2\2\u02b3\u029f\3\2"+
		"\2\2\u02b3\u02a0\3\2\2\2\u02b3\u02a1\3\2\2\2\u02b3\u02a2\3\2\2\2\u02b3"+
		"\u02a3\3\2\2\2\u02b3\u02a4\3\2\2\2\u02b3\u02a5\3\2\2\2\u02b3\u02a6\3\2"+
		"\2\2\u02b3\u02ab\3\2\2\2\u02b4U\3\2\2\2\u02b5\u02b6\5X-\2\u02b6\u02b7"+
		"\7\\\2\2\u02b7\u02b8\5D#\2\u02b8W\3\2\2\2\u02b9\u02ba\7_\2\2\u02baY\3"+
		"\2\2\2\u02bb\u02c0\5X-\2\u02bc\u02bd\7Y\2\2\u02bd\u02bf\5X-\2\u02be\u02bc"+
		"\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"[\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c5\5Z.\2\u02c4\u02c6\5d\63\2\u02c5"+
		"\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6]\3\2\2\2\u02c7\u02cc\5\\/\2\u02c8"+
		"\u02c9\7Z\2\2\u02c9\u02cb\5\\/\2\u02ca\u02c8\3\2\2\2\u02cb\u02ce\3\2\2"+
		"\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd_\3\2\2\2\u02ce\u02cc"+
		"\3\2\2\2\u02cf\u02d0\5\\/\2\u02d0a\3\2\2\2\u02d1\u02d2\5`\61\2\u02d2\u02d3"+
		"\7Z\2\2\u02d3\u02d4\5`\61\2\u02d4c\3\2\2\2\u02d5\u02d6\7\64\2\2\u02d6"+
		"\u02d7\5b\62\2\u02d7\u02d8\7\63\2\2\u02d8e\3\2\2\2\u02d9\u02dc\5X-\2\u02da"+
		"\u02db\7 \2\2\u02db\u02dd\5\\/\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2"+
		"\2\u02ddg\3\2\2\2\u02de\u02e1\5f\64\2\u02df\u02e0\7Z\2\2\u02e0\u02e2\5"+
		"f\64\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2i\3\2\2\2\u02e3\u02e4"+
		"\7\64\2\2\u02e4\u02e5\5h\65\2\u02e5\u02e6\7\63\2\2\u02e6k\3\2\2\2\u02e7"+
		"\u02e9\7V\2\2\u02e8\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02e8\3\2"+
		"\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02fb\3\2\2\2\u02ec\u02ee\7V\2\2\u02ed"+
		"\u02ec\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2"+
		"\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f6\7[\2\2\u02f3"+
		"\u02f5\7V\2\2\u02f4\u02f3\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2"+
		"\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fb\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9"+
		"\u02fb\7\2\2\3\u02fa\u02e8\3\2\2\2\u02fa\u02ef\3\2\2\2\u02fa\u02f9\3\2"+
		"\2\2\u02fbm\3\2\2\2Votz\u0082\u0095\u009e\u00aa\u00ae\u00b5\u00bd\u00ce"+
		"\u00d2\u00d6\u00df\u00ea\u00f0\u0102\u0107\u010f\u0113\u0118\u0121\u012d"+
		"\u0133\u0137\u013c\u0142\u0146\u014c\u0157\u015f\u0164\u016d\u0176\u017c"+
		"\u0183\u018b\u0191\u0194\u019a\u01a5\u01ab\u01ae\u01b2\u01b8\u01c0\u01c5"+
		"\u01cf\u01d5\u01d8\u01de\u01e6\u01eb\u01f1\u01f5\u01fc\u0205\u020d\u021b"+
		"\u0227\u022c\u022f\u023c\u025f\u026c\u026e\u0276\u027b\u0282\u0287\u0294"+
		"\u0299\u02a8\u02af\u02b3\u02c0\u02c5\u02cc\u02dc\u02e1\u02ea\u02ef\u02f6"+
		"\u02fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}