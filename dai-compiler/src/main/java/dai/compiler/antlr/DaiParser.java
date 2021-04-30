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
		LOOP=17, DO=18, WHILE=19, FOR=20, FOREACH=21, IN=22, CONTINUE=23, BREAK=24, 
		FUNC=25, RETURN=26, VOID=27, ENUM=28, STRUCT=29, CLASS=30, EXTENDS=31, 
		NEW=32, CONSTRUCTOR=33, THIS=34, SUPER=35, INTERFACE=36, IMPLEMENTS=37, 
		ANNOTATION=38, INTEGER_LITERAL=39, LONG_LITERAL=40, FLOAT_LITERAL=41, 
		DOUBLE_LITERAL=42, CHARACTER_LITERAL=43, STRING_LITERAL=44, BOOLEAN_LITERAL=45, 
		NULL_LITERAL=46, NOT=47, TILDE=48, QUESTION=49, EQUALITY=50, INEQUALITY=51, 
		GREATER_THAN=52, LESS_THAN=53, LESS_THAN_OR_EQUAL=54, GREATER_THAN_OR_EQUAL=55, 
		AND=56, OR=57, INCREMENT=58, DECREMENT=59, ADDITION=60, SUBTRACTION=61, 
		MULTIPLICATION=62, DIVISION=63, BITWISE_AND=64, BITWISE_OR=65, EXCLUSIVE_OR=66, 
		REMAINDER=67, ASSIGNMENT=68, ADDITION_ASSIGNMENT=69, SUBTRACTION_ASSIGNMENT=70, 
		MULTIPLICATION_ASSIGNMENT=71, DIVISION_ASSIGNMENT=72, AND_ASSIGNMENT=73, 
		OR_ASSIGNMENT=74, EXCLUSIVE_OR_ASSIGNMENT=75, REMAINDER_ASSIGNMENT=76, 
		LEFT_SHIFT_ASSIGNMENT=77, RIGHT_SHIFT_ASSIGNMENT=78, ARROW=79, LEFT_PAREN=80, 
		RIGHT_PAREN=81, LEFT_BRACE=82, RIGHT_BRACE=83, LEFT_BRACK=84, RIGHT_BRACK=85, 
		WS=86, NL=87, COMMENT=88, LINE_COMMENT=89, DOT=90, COMMA=91, SEMI=92, 
		COLON=93, AT=94, ELLIPSIS=95, IDENTIFIER=96;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_statement = 3, RULE_body = 4, RULE_blockStatement = 5, RULE_emptyStatement = 6, 
		RULE_continueStatement = 7, RULE_breakStatement = 8, RULE_variateDeclaration = 9, 
		RULE_variateDeclarators = 10, RULE_variateDeclarator = 11, RULE_functionDeclaration = 12, 
		RULE_functionParameterDeclaratorsBlock = 13, RULE_functionParameterDeclarators = 14, 
		RULE_functionParameterDeclarator = 15, RULE_functionReturn = 16, RULE_returnStatement = 17, 
		RULE_enumDeclaration = 18, RULE_enumBody = 19, RULE_enumFieldDeclarator = 20, 
		RULE_enumFieldDeclarators = 21, RULE_structDeclaration = 22, RULE_structBody = 23, 
		RULE_declareExtends = 24, RULE_classDeclaration = 25, RULE_classBody = 26, 
		RULE_classMemberDeclaration = 27, RULE_constructorDeclaration = 28, RULE_declareImplements = 29, 
		RULE_interfaceDeclaration = 30, RULE_interfaceBody = 31, RULE_interfaceMemberDeclaration = 32, 
		RULE_abstractFunctionDeclaration = 33, RULE_annotationDeclaration = 34, 
		RULE_annotationBody = 35, RULE_annotated = 36, RULE_throwStatement = 37, 
		RULE_tryStatement = 38, RULE_catchBlock = 39, RULE_finallyBlock = 40, 
		RULE_ifStatement = 41, RULE_elseBlock = 42, RULE_condition = 43, RULE_switchStatement = 44, 
		RULE_switchCaseBlock = 45, RULE_switchCaseLabel = 46, RULE_whileStatement = 47, 
		RULE_doWhileStatement = 48, RULE_forStatement = 49, RULE_forInit = 50, 
		RULE_forInitDeclaration = 51, RULE_forInStatement = 52, RULE_expr = 53, 
		RULE_expression = 54, RULE_expressions = 55, RULE_expressionStatement = 56, 
		RULE_parameter = 57, RULE_parameters = 58, RULE_parametersBlock = 59, 
		RULE_namedParameter = 60, RULE_namedParameters = 61, RULE_namedParametersBlock = 62, 
		RULE_assignOperator = 63, RULE_literal = 64, RULE_arrayLiteral = 65, RULE_objectLiteral = 66, 
		RULE_objectProperty = 67, RULE_objectProperties = 68, RULE_identifier = 69, 
		RULE_identifierPath = 70, RULE_useType = 71, RULE_useTypes = 72, RULE_useTypeParameter = 73, 
		RULE_useTypeParameters = 74, RULE_useTypeParametersBlock = 75, RULE_declarationTypeParameter = 76, 
		RULE_declarationTypeParameters = 77, RULE_declarationTypeParametersBlock = 78, 
		RULE_declarationTypeParameterExtends = 79, RULE_eos = 80;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "statement", 
			"body", "blockStatement", "emptyStatement", "continueStatement", "breakStatement", 
			"variateDeclaration", "variateDeclarators", "variateDeclarator", "functionDeclaration", 
			"functionParameterDeclaratorsBlock", "functionParameterDeclarators", 
			"functionParameterDeclarator", "functionReturn", "returnStatement", "enumDeclaration", 
			"enumBody", "enumFieldDeclarator", "enumFieldDeclarators", "structDeclaration", 
			"structBody", "declareExtends", "classDeclaration", "classBody", "classMemberDeclaration", 
			"constructorDeclaration", "declareImplements", "interfaceDeclaration", 
			"interfaceBody", "interfaceMemberDeclaration", "abstractFunctionDeclaration", 
			"annotationDeclaration", "annotationBody", "annotated", "throwStatement", 
			"tryStatement", "catchBlock", "finallyBlock", "ifStatement", "elseBlock", 
			"condition", "switchStatement", "switchCaseBlock", "switchCaseLabel", 
			"whileStatement", "doWhileStatement", "forStatement", "forInit", "forInitDeclaration", 
			"forInStatement", "expr", "expression", "expressions", "expressionStatement", 
			"parameter", "parameters", "parametersBlock", "namedParameter", "namedParameters", 
			"namedParametersBlock", "assignOperator", "literal", "arrayLiteral", 
			"objectLiteral", "objectProperty", "objectProperties", "identifier", 
			"identifierPath", "useType", "useTypes", "useTypeParameter", "useTypeParameters", 
			"useTypeParametersBlock", "declarationTypeParameter", "declarationTypeParameters", 
			"declarationTypeParametersBlock", "declarationTypeParameterExtends", 
			"eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PACKAGE'", "'IMPORT'", "'VAR'", "'CONST'", "'NULL'", "'TRUE'", 
			"'FALSE'", "'THROW'", "'TRY'", "'CATCH'", "'FINALLY'", "'IF'", "'ELSE'", 
			"'SWITCH'", "'CASE'", "'DEFAULT'", "'LOOP'", "'DO'", "'WHILE'", "'FOR'", 
			"'FOREACH'", "'IN'", "'CONTINUE'", "'BREAK'", "'FUNC'", "'RETURN'", "'VOID'", 
			"'ENUM'", "'STRUCT'", "'CLASS'", "'EXTENDS'", "'NEW'", "'CONSTRUCTOR'", 
			"'THIS'", "'SUPER'", "'INTERFACE'", "'IMPLEMENTS'", "'ANNOTATION'", null, 
			null, null, null, null, null, null, null, "'!'", "'~'", "'?'", "'=='", 
			"'!='", "'>'", "'<'", "'<='", "'>='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
			"'=>'", "'('", "')'", "'{'", "'}'", "'['", "']'", null, null, null, null, 
			"'.'", "','", "';'", "':'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PACKAGE", "IMPORT", "VAR", "CONST", "NULL", "TRUE", "FALSE", "THROW", 
			"TRY", "CATCH", "FINALLY", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"LOOP", "DO", "WHILE", "FOR", "FOREACH", "IN", "CONTINUE", "BREAK", "FUNC", 
			"RETURN", "VOID", "ENUM", "STRUCT", "CLASS", "EXTENDS", "NEW", "CONSTRUCTOR", 
			"THIS", "SUPER", "INTERFACE", "IMPLEMENTS", "ANNOTATION", "INTEGER_LITERAL", 
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
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(162);
				packageDeclaration();
				}
				break;
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(165);
				importDeclaration();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << ANNOTATION) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (SEMI - 80)) | (1L << (AT - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				{
				setState(171);
				statement();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
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
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(179);
				annotated();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(PACKAGE);
			setState(186);
			identifierPath();
			setState(187);
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
			setState(189);
			match(IMPORT);
			setState(190);
			identifierPath();
			setState(191);
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
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public VariateDeclarationContext variateDeclaration() {
			return getRuleContext(VariateDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
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
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForInStatementContext forInStatement() {
			return getRuleContext(ForInStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				emptyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				variateDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				enumDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				structDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(200);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(201);
				interfaceDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(202);
				annotationDeclaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(203);
				throwStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(204);
				tryStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(205);
				ifStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(206);
				switchStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(207);
				whileStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(208);
				doWhileStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(209);
				forStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(210);
				forInStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(211);
				continueStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(212);
				breakStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(213);
				expressionStatement();
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
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(LEFT_BRACE);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << ANNOTATION) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (SEMI - 80)) | (1L << (AT - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				{
				setState(217);
				statement();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(LEFT_BRACE);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << ANNOTATION) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (SEMI - 80)) | (1L << (AT - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				{
				setState(226);
				statement();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(DaiParser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(SEMI);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(DaiParser.CONTINUE, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(CONTINUE);
			setState(237);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(DaiParser.BREAK, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(BREAK);
			setState(240);
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
		enterRule(_localctx, 18, RULE_variateDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(242);
				annotated();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(249);
			variateDeclarators();
			setState(250);
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
		enterRule(_localctx, 20, RULE_variateDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			variateDeclarator();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(253);
				match(COMMA);
				setState(254);
				variateDeclarator();
				}
				}
				setState(259);
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
		enterRule(_localctx, 22, RULE_variateDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			identifier();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(261);
				match(COLON);
				setState(262);
				useType();
				}
			}

			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(265);
				match(ASSIGNMENT);
				setState(266);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(DaiParser.FUNC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionParameterDeclaratorsBlockContext functionParameterDeclaratorsBlock() {
			return getRuleContext(FunctionParameterDeclaratorsBlockContext.class,0);
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
		public DeclarationTypeParametersBlockContext declarationTypeParametersBlock() {
			return getRuleContext(DeclarationTypeParametersBlockContext.class,0);
		}
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(269);
				annotated();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(FUNC);
			setState(276);
			identifier();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(277);
				declarationTypeParametersBlock();
				}
			}

			setState(280);
			functionParameterDeclaratorsBlock();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(281);
				functionReturn();
				}
			}

			setState(284);
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

	public static class FunctionParameterDeclaratorsBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public FunctionParameterDeclaratorsContext functionParameterDeclarators() {
			return getRuleContext(FunctionParameterDeclaratorsContext.class,0);
		}
		public FunctionParameterDeclaratorsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterDeclaratorsBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFunctionParameterDeclaratorsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterDeclaratorsBlockContext functionParameterDeclaratorsBlock() throws RecognitionException {
		FunctionParameterDeclaratorsBlockContext _localctx = new FunctionParameterDeclaratorsBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionParameterDeclaratorsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LEFT_PAREN);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENTIFIER) {
				{
				setState(287);
				functionParameterDeclarators();
				}
			}

			setState(290);
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

	public static class FunctionParameterDeclaratorsContext extends ParserRuleContext {
		public List<FunctionParameterDeclaratorContext> functionParameterDeclarator() {
			return getRuleContexts(FunctionParameterDeclaratorContext.class);
		}
		public FunctionParameterDeclaratorContext functionParameterDeclarator(int i) {
			return getRuleContext(FunctionParameterDeclaratorContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public FunctionParameterDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterDeclarators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFunctionParameterDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterDeclaratorsContext functionParameterDeclarators() throws RecognitionException {
		FunctionParameterDeclaratorsContext _localctx = new FunctionParameterDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionParameterDeclarators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			functionParameterDeclarator();
			{
			setState(293);
			match(COMMA);
			setState(294);
			functionParameterDeclarator();
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

	public static class FunctionParameterDeclaratorContext extends ParserRuleContext {
		public VariateDeclaratorContext variateDeclarator() {
			return getRuleContext(VariateDeclaratorContext.class,0);
		}
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public FunctionParameterDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFunctionParameterDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterDeclaratorContext functionParameterDeclarator() throws RecognitionException {
		FunctionParameterDeclaratorContext _localctx = new FunctionParameterDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionParameterDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(296);
				annotated();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
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

	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(DaiParser.COLON, 0); }
		public UseTypeContext useType() {
			return getRuleContext(UseTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(DaiParser.VOID, 0); }
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(COLON);
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(305);
				useType();
				}
				break;
			case VOID:
				{
				setState(306);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(DaiParser.RETURN, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(RETURN);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(310);
				expression();
				}
			}

			setState(313);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(DaiParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(DaiParser.LESS_THAN, 0); }
		public UseTypeParameterContext useTypeParameter() {
			return getRuleContext(UseTypeParameterContext.class,0);
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
		enterRule(_localctx, 36, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(315);
				annotated();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			match(ENUM);
			setState(322);
			identifier();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(323);
				match(LESS_THAN);
				setState(324);
				useTypeParameter();
				setState(325);
				match(GREATER_THAN);
				}
			}

			setState(329);
			match(LEFT_BRACE);
			setState(330);
			enumBody();
			setState(331);
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

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public EnumFieldDeclaratorsContext enumFieldDeclarators() {
			return getRuleContext(EnumFieldDeclaratorsContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LEFT_BRACE);
			setState(334);
			enumFieldDeclarators();
			setState(335);
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
		enterRule(_localctx, 40, RULE_enumFieldDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(337);
				annotated();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			identifier();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(344);
				match(ASSIGNMENT);
				setState(345);
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
		enterRule(_localctx, 42, RULE_enumFieldDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			enumFieldDeclarator();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(349);
				match(COMMA);
				setState(350);
				enumFieldDeclarator();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
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
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public DeclarationTypeParametersBlockContext declarationTypeParametersBlock() {
			return getRuleContext(DeclarationTypeParametersBlockContext.class,0);
		}
		public DeclareExtendsContext declareExtends() {
			return getRuleContext(DeclareExtendsContext.class,0);
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
		enterRule(_localctx, 44, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(358);
				annotated();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(STRUCT);
			setState(365);
			identifier();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(366);
				declarationTypeParametersBlock();
				}
			}

			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(369);
				declareExtends();
				}
			}

			setState(372);
			structBody();
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

	public static class StructBodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<VariateDeclarationContext> variateDeclaration() {
			return getRuleContexts(VariateDeclarationContext.class);
		}
		public VariateDeclarationContext variateDeclaration(int i) {
			return getRuleContext(VariateDeclarationContext.class,i);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_structBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(LEFT_BRACE);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==CONST || _la==AT) {
				{
				{
				setState(375);
				variateDeclaration();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
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

	public static class DeclareExtendsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(DaiParser.EXTENDS, 0); }
		public UseTypeContext useType() {
			return getRuleContext(UseTypeContext.class,0);
		}
		public DeclareExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareExtends; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclareExtends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareExtendsContext declareExtends() throws RecognitionException {
		DeclareExtendsContext _localctx = new DeclareExtendsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declareExtends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(383);
			match(EXTENDS);
			setState(384);
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
		public TerminalNode CLASS() { return getToken(DaiParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public DeclarationTypeParametersBlockContext declarationTypeParametersBlock() {
			return getRuleContext(DeclarationTypeParametersBlockContext.class,0);
		}
		public DeclareExtendsContext declareExtends() {
			return getRuleContext(DeclareExtendsContext.class,0);
		}
		public DeclareImplementsContext declareImplements() {
			return getRuleContext(DeclareImplementsContext.class,0);
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
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(386);
				annotated();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			match(CLASS);
			setState(393);
			identifier();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(394);
				declarationTypeParametersBlock();
				}
			}

			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(397);
				declareExtends();
				}
			}

			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(400);
				declareImplements();
				}
			}

			setState(403);
			classBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(LEFT_BRACE);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << FUNC) | (1L << CONSTRUCTOR))) != 0) || _la==AT) {
				{
				{
				setState(406);
				classMemberDeclaration();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
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
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
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
		enterRule(_localctx, 54, RULE_classMemberDeclaration);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				variateDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
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
		public FunctionParameterDeclaratorsBlockContext functionParameterDeclaratorsBlock() {
			return getRuleContext(FunctionParameterDeclaratorsBlockContext.class,0);
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
		enterRule(_localctx, 56, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(419);
				annotated();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			match(CONSTRUCTOR);
			setState(426);
			functionParameterDeclaratorsBlock();
			setState(427);
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

	public static class DeclareImplementsContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(DaiParser.IMPLEMENTS, 0); }
		public UseTypesContext useTypes() {
			return getRuleContext(UseTypesContext.class,0);
		}
		public DeclareImplementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareImplements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclareImplements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareImplementsContext declareImplements() throws RecognitionException {
		DeclareImplementsContext _localctx = new DeclareImplementsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_declareImplements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(IMPLEMENTS);
			setState(430);
			useTypes();
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
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
		}
		public DeclarationTypeParametersBlockContext declarationTypeParametersBlock() {
			return getRuleContext(DeclarationTypeParametersBlockContext.class,0);
		}
		public DeclareExtendsContext declareExtends() {
			return getRuleContext(DeclareExtendsContext.class,0);
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
		enterRule(_localctx, 60, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(432);
				annotated();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
			match(INTERFACE);
			setState(439);
			identifier();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(440);
				declarationTypeParametersBlock();
				}
			}

			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(443);
				declareExtends();
				}
			}

			setState(446);
			interfaceBody();
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(LEFT_BRACE);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << FUNC))) != 0) || _la==AT) {
				{
				{
				setState(449);
				interfaceMemberDeclaration();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
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
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public AbstractFunctionDeclarationContext abstractFunctionDeclaration() {
			return getRuleContext(AbstractFunctionDeclarationContext.class,0);
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
		enterRule(_localctx, 64, RULE_interfaceMemberDeclaration);
		try {
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				variateDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				abstractFunctionDeclaration();
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

	public static class AbstractFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(DaiParser.FUNC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionParameterDeclaratorsBlockContext functionParameterDeclaratorsBlock() {
			return getRuleContext(FunctionParameterDeclaratorsBlockContext.class,0);
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
		public DeclarationTypeParametersBlockContext declarationTypeParametersBlock() {
			return getRuleContext(DeclarationTypeParametersBlockContext.class,0);
		}
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public AbstractFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractFunctionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAbstractFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractFunctionDeclarationContext abstractFunctionDeclaration() throws RecognitionException {
		AbstractFunctionDeclarationContext _localctx = new AbstractFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_abstractFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(462);
				annotated();
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
			match(FUNC);
			setState(469);
			identifier();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(470);
				declarationTypeParametersBlock();
				}
			}

			setState(473);
			functionParameterDeclaratorsBlock();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(474);
				functionReturn();
				}
			}

			setState(477);
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
		public AnnotationBodyContext annotationBody() {
			return getRuleContext(AnnotationBodyContext.class,0);
		}
		public List<AnnotatedContext> annotated() {
			return getRuleContexts(AnnotatedContext.class);
		}
		public AnnotatedContext annotated(int i) {
			return getRuleContext(AnnotatedContext.class,i);
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
		enterRule(_localctx, 68, RULE_annotationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(479);
				annotated();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			match(ANNOTATION);
			setState(486);
			identifier();
			setState(487);
			annotationBody();
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

	public static class AnnotationBodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<VariateDeclarationContext> variateDeclaration() {
			return getRuleContexts(VariateDeclarationContext.class);
		}
		public VariateDeclarationContext variateDeclaration(int i) {
			return getRuleContext(VariateDeclarationContext.class,i);
		}
		public AnnotationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAnnotationBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationBodyContext annotationBody() throws RecognitionException {
		AnnotationBodyContext _localctx = new AnnotationBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_annotationBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(LEFT_BRACE);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==CONST || _la==AT) {
				{
				{
				setState(490);
				variateDeclaration();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
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
		public NamedParametersBlockContext namedParametersBlock() {
			return getRuleContext(NamedParametersBlockContext.class,0);
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
		enterRule(_localctx, 72, RULE_annotated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(AT);
			setState(499);
			identifierPath();
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(500);
				namedParametersBlock();
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(DaiParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(THROW);
			setState(504);
			expression();
			setState(505);
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

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(DaiParser.TRY, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tryStatement);
		int _la;
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				match(TRY);
				setState(508);
				body();
				setState(509);
				finallyBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				match(TRY);
				setState(512);
				body();
				setState(514); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(513);
					catchBlock();
					}
					}
					setState(516); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CATCH );
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(518);
					finallyBlock();
					}
				}

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
		enterRule(_localctx, 78, RULE_catchBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(CATCH);
			setState(524);
			match(LEFT_PAREN);
			setState(525);
			variateDeclarator();
			setState(526);
			match(RIGHT_PAREN);
			setState(527);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(DaiParser.FINALLY, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(FINALLY);
			setState(530);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DaiParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(IF);
			setState(533);
			condition();
			setState(534);
			statement();
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(535);
				elseBlock();
				}
				break;
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

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(DaiParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(ELSE);
			setState(539);
			statement();
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
		enterRule(_localctx, 86, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(LEFT_PAREN);
			setState(542);
			expression();
			setState(543);
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

	public static class SwitchStatementContext extends ParserRuleContext {
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
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(SWITCH);
			setState(546);
			condition();
			setState(547);
			match(LEFT_BRACE);
			setState(549); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(548);
				switchCaseBlock();
				}
				}
				setState(551); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(553);
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
		enterRule(_localctx, 90, RULE_switchCaseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(555);
				switchCaseLabel();
				}
				}
				setState(558); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(561); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(560);
				statement();
				}
				}
				setState(563); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << ANNOTATION) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (SEMI - 80)) | (1L << (AT - 80)) | (1L << (IDENTIFIER - 80)))) != 0) );
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
		enterRule(_localctx, 92, RULE_switchCaseLabel);
		try {
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(CASE);
				setState(566);
				expression();
				setState(567);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				match(DEFAULT);
				setState(570);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(DaiParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(WHILE);
			setState(574);
			condition();
			setState(575);
			statement();
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

	public static class DoWhileStatementContext extends ParserRuleContext {
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
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(DO);
			setState(578);
			statement();
			setState(579);
			match(WHILE);
			setState(580);
			condition();
			setState(581);
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

	public static class ForStatementContext extends ParserRuleContext {
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
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(FOR);
			setState(584);
			match(LEFT_PAREN);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (AT - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(585);
				forInit();
				}
			}

			setState(588);
			match(SEMI);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(589);
				expression();
				}
			}

			setState(592);
			match(SEMI);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(593);
				expressions();
				}
			}

			setState(596);
			match(RIGHT_PAREN);
			setState(597);
			statement();
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
		enterRule(_localctx, 100, RULE_forInit);
		try {
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case CONST:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
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
				setState(600);
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
		enterRule(_localctx, 102, RULE_forInitDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(603);
				annotated();
				}
				}
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(609);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(610);
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

	public static class ForInStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DaiParser.FOR, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IN() { return getToken(DaiParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public ForInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInStatementContext forInStatement() throws RecognitionException {
		ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_forInStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(FOR);
			setState(613);
			match(LEFT_PAREN);
			setState(614);
			identifier();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(615);
				match(COMMA);
				setState(616);
				identifier();
				}
			}

			setState(619);
			match(IN);
			setState(620);
			expression();
			setState(621);
			match(RIGHT_PAREN);
			setState(622);
			statement();
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
		public FunctionParameterDeclaratorsBlockContext functionParameterDeclaratorsBlock() {
			return getRuleContext(FunctionParameterDeclaratorsBlockContext.class,0);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(DaiParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(DaiParser.COLON, 0); }
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
		public ParametersBlockContext parametersBlock() {
			return getRuleContext(ParametersBlockContext.class,0);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LEFT_BRACK() { return getToken(DaiParser.LEFT_BRACK, 0); }
		public TerminalNode RIGHT_BRACK() { return getToken(DaiParser.RIGHT_BRACK, 0); }
		public MemberExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExprContext {
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(DaiParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParametersBlockContext parametersBlock() {
			return getRuleContext(ParametersBlockContext.class,0);
		}
		public ChainExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitChainExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseOrExpressionContext extends ExprContext {
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
		public ParametersBlockContext parametersBlock() {
			return getRuleContext(ParametersBlockContext.class,0);
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(625);
				match(LEFT_PAREN);
				setState(626);
				expr(0);
				setState(627);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(629);
				match(THIS);
				}
				break;
			case 3:
				{
				_localctx = new SuperExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(630);
				match(SUPER);
				}
				break;
			case 4:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(631);
				identifier();
				}
				break;
			case 5:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(632);
				match(NEW);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(633);
					annotated();
					}
					}
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(639);
				useType();
				setState(640);
				parametersBlock();
				}
				break;
			case 6:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(642);
				_la = _input.LA(1);
				if ( !(_la==ADDITION || _la==SUBTRACTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(643);
				expr(18);
				}
				break;
			case 7:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(644);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(645);
				expr(17);
				}
				break;
			case 8:
				{
				_localctx = new AssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(646);
				identifierPath();
				setState(647);
				assignOperator();
				setState(648);
				expr(5);
				}
				break;
			case 9:
				{
				_localctx = new LambdaExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(652);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(650);
					identifier();
					}
					break;
				case LEFT_PAREN:
					{
					setState(651);
					functionParameterDeclaratorsBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(654);
				match(ARROW);
				setState(657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(655);
					expr(0);
					}
					break;
				case 2:
					{
					setState(656);
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
				setState(659);
				literal();
				}
				break;
			case 11:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(660);
				arrayLiteral();
				}
				break;
			case 12:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(661);
				objectLiteral();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(722);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(664);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(665);
						_la = _input.LA(1);
						if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (MULTIPLICATION - 62)) | (1L << (DIVISION - 62)) | (1L << (REMAINDER - 62)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(666);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(667);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(668);
						_la = _input.LA(1);
						if ( !(_la==ADDITION || _la==SUBTRACTION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(669);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(670);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(675);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LESS_THAN:
							{
							setState(671);
							match(LESS_THAN);
							setState(672);
							match(LESS_THAN);
							}
							break;
						case GREATER_THAN:
							{
							setState(673);
							match(GREATER_THAN);
							setState(674);
							match(GREATER_THAN);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(677);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(678);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(679);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_THAN) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN_OR_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(680);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new EqualExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(681);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(682);
						_la = _input.LA(1);
						if ( !(_la==INEQUALITY || _la==ASSIGNMENT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(683);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new BitwiseAndExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(684);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(685);
						match(BITWISE_AND);
						setState(686);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExclusiveOrExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(687);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(688);
						match(EXCLUSIVE_OR);
						setState(689);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseOrExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(690);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(691);
						match(BITWISE_OR);
						setState(692);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new AndExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(693);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(694);
						match(AND);
						setState(695);
						expr(9);
						}
						break;
					case 10:
						{
						_localctx = new OrExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(696);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(697);
						match(OR);
						setState(698);
						expr(8);
						}
						break;
					case 11:
						{
						_localctx = new ConditionalExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(699);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(700);
						match(QUESTION);
						setState(701);
						expr(0);
						setState(702);
						match(COLON);
						setState(703);
						expr(6);
						}
						break;
					case 12:
						{
						_localctx = new ChainExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(705);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(706);
						match(DOT);
						setState(711);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
						case 1:
							{
							setState(707);
							identifier();
							}
							break;
						case 2:
							{
							setState(708);
							expr(0);
							setState(709);
							parametersBlock();
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new MemberExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(713);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(714);
						match(LEFT_BRACK);
						setState(715);
						expr(0);
						setState(716);
						match(RIGHT_BRACK);
						}
						break;
					case 14:
						{
						_localctx = new CallExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(718);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(719);
						parametersBlock();
						}
						break;
					case 15:
						{
						_localctx = new IncrementalExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(720);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(721);
						_la = _input.LA(1);
						if ( !(_la==INCREMENT || _la==DECREMENT) ) {
						_errHandler.recoverInline(this);
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
				setState(726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		enterRule(_localctx, 108, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
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
		enterRule(_localctx, 110, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			expression();
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(730);
				match(COMMA);
				setState(731);
				expression();
				}
				}
				setState(736);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			expression();
			setState(738);
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

	public static class ParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedParameterContext namedParameter() {
			return getRuleContext(NamedParameterContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parameter);
		try {
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				namedParameter();
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaiParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			parameter();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(745);
				match(COMMA);
				setState(746);
				parameter();
				}
				}
				setState(751);
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

	public static class ParametersBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitParametersBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersBlockContext parametersBlock() throws RecognitionException {
		ParametersBlockContext _localctx = new ParametersBlockContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parametersBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(LEFT_PAREN);
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(753);
				parameters();
				}
			}

			setState(756);
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

	public static class NamedParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(DaiParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitNamedParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedParameterContext namedParameter() throws RecognitionException {
		NamedParameterContext _localctx = new NamedParameterContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_namedParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			identifier();
			{
			setState(759);
			match(ASSIGNMENT);
			setState(760);
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

	public static class NamedParametersContext extends ParserRuleContext {
		public List<NamedParameterContext> namedParameter() {
			return getRuleContexts(NamedParameterContext.class);
		}
		public NamedParameterContext namedParameter(int i) {
			return getRuleContext(NamedParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaiParser.COMMA, i);
		}
		public NamedParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitNamedParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedParametersContext namedParameters() throws RecognitionException {
		NamedParametersContext _localctx = new NamedParametersContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_namedParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			namedParameter();
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(763);
				match(COMMA);
				setState(764);
				namedParameter();
				}
				}
				setState(769);
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

	public static class NamedParametersBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public NamedParametersContext namedParameters() {
			return getRuleContext(NamedParametersContext.class,0);
		}
		public NamedParametersBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedParametersBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitNamedParametersBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedParametersBlockContext namedParametersBlock() throws RecognitionException {
		NamedParametersBlockContext _localctx = new NamedParametersBlockContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_namedParametersBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(LEFT_PAREN);
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(771);
				namedParameters();
				}
			}

			setState(774);
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
		enterRule(_localctx, 126, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ASSIGNMENT - 68)) | (1L << (ADDITION_ASSIGNMENT - 68)) | (1L << (SUBTRACTION_ASSIGNMENT - 68)) | (1L << (MULTIPLICATION_ASSIGNMENT - 68)) | (1L << (DIVISION_ASSIGNMENT - 68)) | (1L << (AND_ASSIGNMENT - 68)) | (1L << (OR_ASSIGNMENT - 68)) | (1L << (EXCLUSIVE_OR_ASSIGNMENT - 68)) | (1L << (REMAINDER_ASSIGNMENT - 68)) | (1L << (LEFT_SHIFT_ASSIGNMENT - 68)) | (1L << (RIGHT_SHIFT_ASSIGNMENT - 68)))) != 0)) ) {
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
		public TerminalNode INTEGER_LITERAL() { return getToken(DaiParser.INTEGER_LITERAL, 0); }
		public TerminalNode LONG_LITERAL() { return getToken(DaiParser.LONG_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(DaiParser.FLOAT_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(DaiParser.DOUBLE_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(DaiParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DaiParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(DaiParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(DaiParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL))) != 0)) ) {
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
		enterRule(_localctx, 130, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(LEFT_BRACK);
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(781);
				expressions();
				}
			}

			setState(784);
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
		public ObjectPropertiesContext objectProperties() {
			return getRuleContext(ObjectPropertiesContext.class,0);
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
		enterRule(_localctx, 132, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(LEFT_BRACE);
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(787);
				objectProperties();
				}
			}

			setState(790);
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
		enterRule(_localctx, 134, RULE_objectProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			identifier();
			setState(793);
			match(COLON);
			setState(794);
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

	public static class ObjectPropertiesContext extends ParserRuleContext {
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public ObjectPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitObjectProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertiesContext objectProperties() throws RecognitionException {
		ObjectPropertiesContext _localctx = new ObjectPropertiesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_objectProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			objectProperty();
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(797);
				match(COMMA);
				setState(798);
				objectProperty();
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
		enterRule(_localctx, 138, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
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
		enterRule(_localctx, 140, RULE_identifierPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			identifier();
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(804);
				match(DOT);
				setState(805);
				identifier();
				}
				}
				setState(810);
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
		public UseTypeParametersBlockContext useTypeParametersBlock() {
			return getRuleContext(UseTypeParametersBlockContext.class,0);
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
		enterRule(_localctx, 142, RULE_useType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			identifierPath();
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(812);
				useTypeParametersBlock();
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
		enterRule(_localctx, 144, RULE_useTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			useType();
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(816);
				match(COMMA);
				setState(817);
				useType();
				}
				}
				setState(822);
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

	public static class UseTypeParameterContext extends ParserRuleContext {
		public UseTypeContext useType() {
			return getRuleContext(UseTypeContext.class,0);
		}
		public UseTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useTypeParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitUseTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseTypeParameterContext useTypeParameter() throws RecognitionException {
		UseTypeParameterContext _localctx = new UseTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_useTypeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
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

	public static class UseTypeParametersContext extends ParserRuleContext {
		public List<UseTypeParameterContext> useTypeParameter() {
			return getRuleContexts(UseTypeParameterContext.class);
		}
		public UseTypeParameterContext useTypeParameter(int i) {
			return getRuleContext(UseTypeParameterContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public UseTypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useTypeParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitUseTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseTypeParametersContext useTypeParameters() throws RecognitionException {
		UseTypeParametersContext _localctx = new UseTypeParametersContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_useTypeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			useTypeParameter();
			{
			setState(826);
			match(COMMA);
			setState(827);
			useTypeParameter();
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

	public static class UseTypeParametersBlockContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(DaiParser.LESS_THAN, 0); }
		public UseTypeParametersContext useTypeParameters() {
			return getRuleContext(UseTypeParametersContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(DaiParser.GREATER_THAN, 0); }
		public UseTypeParametersBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useTypeParametersBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitUseTypeParametersBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseTypeParametersBlockContext useTypeParametersBlock() throws RecognitionException {
		UseTypeParametersBlockContext _localctx = new UseTypeParametersBlockContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_useTypeParametersBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(LESS_THAN);
			setState(830);
			useTypeParameters();
			setState(831);
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

	public static class DeclarationTypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclarationTypeParameterExtendsContext declarationTypeParameterExtends() {
			return getRuleContext(DeclarationTypeParameterExtendsContext.class,0);
		}
		public DeclarationTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationTypeParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclarationTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationTypeParameterContext declarationTypeParameter() throws RecognitionException {
		DeclarationTypeParameterContext _localctx = new DeclarationTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_declarationTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			identifier();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(834);
				declarationTypeParameterExtends();
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

	public static class DeclarationTypeParametersContext extends ParserRuleContext {
		public List<DeclarationTypeParameterContext> declarationTypeParameter() {
			return getRuleContexts(DeclarationTypeParameterContext.class);
		}
		public DeclarationTypeParameterContext declarationTypeParameter(int i) {
			return getRuleContext(DeclarationTypeParameterContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public DeclarationTypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationTypeParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclarationTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationTypeParametersContext declarationTypeParameters() throws RecognitionException {
		DeclarationTypeParametersContext _localctx = new DeclarationTypeParametersContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_declarationTypeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			declarationTypeParameter();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(838);
				match(COMMA);
				setState(839);
				declarationTypeParameter();
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

	public static class DeclarationTypeParametersBlockContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(DaiParser.LESS_THAN, 0); }
		public DeclarationTypeParametersContext declarationTypeParameters() {
			return getRuleContext(DeclarationTypeParametersContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(DaiParser.GREATER_THAN, 0); }
		public DeclarationTypeParametersBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationTypeParametersBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclarationTypeParametersBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationTypeParametersBlockContext declarationTypeParametersBlock() throws RecognitionException {
		DeclarationTypeParametersBlockContext _localctx = new DeclarationTypeParametersBlockContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_declarationTypeParametersBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(LESS_THAN);
			setState(843);
			declarationTypeParameters();
			setState(844);
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

	public static class DeclarationTypeParameterExtendsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(DaiParser.EXTENDS, 0); }
		public UseTypeContext useType() {
			return getRuleContext(UseTypeContext.class,0);
		}
		public DeclarationTypeParameterExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationTypeParameterExtends; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclarationTypeParameterExtends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationTypeParameterExtendsContext declarationTypeParameterExtends() throws RecognitionException {
		DeclarationTypeParameterExtendsContext _localctx = new DeclarationTypeParameterExtendsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_declarationTypeParameterExtends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(EXTENDS);
			setState(847);
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
		enterRule(_localctx, 160, RULE_eos);
		int _la;
		try {
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(849);
					match(NL);
					}
					}
					setState(852); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(854);
					match(NL);
					}
					}
					setState(859);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(860);
				match(SEMI);
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(861);
					match(NL);
					}
					}
					setState(866);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(867);
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
		case 53:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3b\u0369\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\5\2\u00a6"+
		"\n\2\3\2\7\2\u00a9\n\2\f\2\16\2\u00ac\13\2\3\2\7\2\u00af\n\2\f\2\16\2"+
		"\u00b2\13\2\3\2\3\2\3\3\7\3\u00b7\n\3\f\3\16\3\u00ba\13\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00d9\n\5\3\6\3\6\7\6\u00dd\n\6"+
		"\f\6\16\6\u00e0\13\6\3\6\3\6\3\7\3\7\7\7\u00e6\n\7\f\7\16\7\u00e9\13\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\7\13\u00f6\n\13\f\13\16"+
		"\13\u00f9\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u0102\n\f\f\f\16\f"+
		"\u0105\13\f\3\r\3\r\3\r\5\r\u010a\n\r\3\r\3\r\5\r\u010e\n\r\3\16\7\16"+
		"\u0111\n\16\f\16\16\16\u0114\13\16\3\16\3\16\3\16\5\16\u0119\n\16\3\16"+
		"\3\16\5\16\u011d\n\16\3\16\3\16\3\17\3\17\5\17\u0123\n\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\21\7\21\u012c\n\21\f\21\16\21\u012f\13\21\3\21\3"+
		"\21\3\22\3\22\3\22\5\22\u0136\n\22\3\23\3\23\5\23\u013a\n\23\3\23\3\23"+
		"\3\24\7\24\u013f\n\24\f\24\16\24\u0142\13\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u014a\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\7\26"+
		"\u0155\n\26\f\26\16\26\u0158\13\26\3\26\3\26\3\26\5\26\u015d\n\26\3\27"+
		"\3\27\3\27\7\27\u0162\n\27\f\27\16\27\u0165\13\27\3\27\3\27\3\30\7\30"+
		"\u016a\n\30\f\30\16\30\u016d\13\30\3\30\3\30\3\30\5\30\u0172\n\30\3\30"+
		"\5\30\u0175\n\30\3\30\3\30\3\31\3\31\7\31\u017b\n\31\f\31\16\31\u017e"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\3\33\7\33\u0186\n\33\f\33\16\33\u0189"+
		"\13\33\3\33\3\33\3\33\5\33\u018e\n\33\3\33\5\33\u0191\n\33\3\33\5\33\u0194"+
		"\n\33\3\33\3\33\3\34\3\34\7\34\u019a\n\34\f\34\16\34\u019d\13\34\3\34"+
		"\3\34\3\35\3\35\3\35\5\35\u01a4\n\35\3\36\7\36\u01a7\n\36\f\36\16\36\u01aa"+
		"\13\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \7 \u01b4\n \f \16 \u01b7"+
		"\13 \3 \3 \3 \5 \u01bc\n \3 \5 \u01bf\n \3 \3 \3!\3!\7!\u01c5\n!\f!\16"+
		"!\u01c8\13!\3!\3!\3\"\3\"\3\"\5\"\u01cf\n\"\3#\7#\u01d2\n#\f#\16#\u01d5"+
		"\13#\3#\3#\3#\5#\u01da\n#\3#\3#\5#\u01de\n#\3#\3#\3$\7$\u01e3\n$\f$\16"+
		"$\u01e6\13$\3$\3$\3$\3$\3%\3%\7%\u01ee\n%\f%\16%\u01f1\13%\3%\3%\3&\3"+
		"&\3&\5&\u01f8\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\6(\u0205\n(\r(\16"+
		"(\u0206\3(\5(\u020a\n(\5(\u020c\n(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3"+
		"+\3+\5+\u021b\n+\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\6.\u0228\n.\r.\16.\u0229"+
		"\3.\3.\3/\6/\u022f\n/\r/\16/\u0230\3/\6/\u0234\n/\r/\16/\u0235\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\5\60\u023e\n\60\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\5\63\u024d\n\63\3\63\3\63\5\63\u0251"+
		"\n\63\3\63\3\63\5\63\u0255\n\63\3\63\3\63\3\63\3\64\3\64\5\64\u025c\n"+
		"\64\3\65\7\65\u025f\n\65\f\65\16\65\u0262\13\65\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\5\66\u026c\n\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u027d\n\67\f\67\16\67\u0280"+
		"\13\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u028f\n\67\3\67\3\67\3\67\5\67\u0294\n\67\3\67\3\67\3\67\5\67\u0299"+
		"\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u02a6"+
		"\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u02ca\n\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\7\67\u02d5\n\67\f\67\16\67\u02d8\13\67\38\3"+
		"8\39\39\39\79\u02df\n9\f9\169\u02e2\139\3:\3:\3:\3;\3;\5;\u02e9\n;\3<"+
		"\3<\3<\7<\u02ee\n<\f<\16<\u02f1\13<\3=\3=\5=\u02f5\n=\3=\3=\3>\3>\3>\3"+
		">\3?\3?\3?\7?\u0300\n?\f?\16?\u0303\13?\3@\3@\5@\u0307\n@\3@\3@\3A\3A"+
		"\3B\3B\3C\3C\5C\u0311\nC\3C\3C\3D\3D\5D\u0317\nD\3D\3D\3E\3E\3E\3E\3F"+
		"\3F\3F\5F\u0322\nF\3G\3G\3H\3H\3H\7H\u0329\nH\fH\16H\u032c\13H\3I\3I\5"+
		"I\u0330\nI\3J\3J\3J\7J\u0335\nJ\fJ\16J\u0338\13J\3K\3K\3L\3L\3L\3L\3M"+
		"\3M\3M\3M\3N\3N\5N\u0346\nN\3O\3O\3O\5O\u034b\nO\3P\3P\3P\3P\3Q\3Q\3Q"+
		"\3R\6R\u0355\nR\rR\16R\u0356\3R\7R\u035a\nR\fR\16R\u035d\13R\3R\3R\7R"+
		"\u0361\nR\fR\16R\u0364\13R\3R\5R\u0367\nR\3R\2\3lS\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\2\13\3\2\5\6\3\2>?\3\2\61\62"+
		"\4\2@AEE\3\2\669\4\2\65\65FF\3\2<=\3\2FP\3\2)\60\2\u0399\2\u00a5\3\2\2"+
		"\2\4\u00b8\3\2\2\2\6\u00bf\3\2\2\2\b\u00d8\3\2\2\2\n\u00da\3\2\2\2\f\u00e3"+
		"\3\2\2\2\16\u00ec\3\2\2\2\20\u00ee\3\2\2\2\22\u00f1\3\2\2\2\24\u00f7\3"+
		"\2\2\2\26\u00fe\3\2\2\2\30\u0106\3\2\2\2\32\u0112\3\2\2\2\34\u0120\3\2"+
		"\2\2\36\u0126\3\2\2\2 \u012d\3\2\2\2\"\u0132\3\2\2\2$\u0137\3\2\2\2&\u0140"+
		"\3\2\2\2(\u014f\3\2\2\2*\u0156\3\2\2\2,\u015e\3\2\2\2.\u016b\3\2\2\2\60"+
		"\u0178\3\2\2\2\62\u0181\3\2\2\2\64\u0187\3\2\2\2\66\u0197\3\2\2\28\u01a3"+
		"\3\2\2\2:\u01a8\3\2\2\2<\u01af\3\2\2\2>\u01b5\3\2\2\2@\u01c2\3\2\2\2B"+
		"\u01ce\3\2\2\2D\u01d3\3\2\2\2F\u01e4\3\2\2\2H\u01eb\3\2\2\2J\u01f4\3\2"+
		"\2\2L\u01f9\3\2\2\2N\u020b\3\2\2\2P\u020d\3\2\2\2R\u0213\3\2\2\2T\u0216"+
		"\3\2\2\2V\u021c\3\2\2\2X\u021f\3\2\2\2Z\u0223\3\2\2\2\\\u022e\3\2\2\2"+
		"^\u023d\3\2\2\2`\u023f\3\2\2\2b\u0243\3\2\2\2d\u0249\3\2\2\2f\u025b\3"+
		"\2\2\2h\u0260\3\2\2\2j\u0266\3\2\2\2l\u0298\3\2\2\2n\u02d9\3\2\2\2p\u02db"+
		"\3\2\2\2r\u02e3\3\2\2\2t\u02e8\3\2\2\2v\u02ea\3\2\2\2x\u02f2\3\2\2\2z"+
		"\u02f8\3\2\2\2|\u02fc\3\2\2\2~\u0304\3\2\2\2\u0080\u030a\3\2\2\2\u0082"+
		"\u030c\3\2\2\2\u0084\u030e\3\2\2\2\u0086\u0314\3\2\2\2\u0088\u031a\3\2"+
		"\2\2\u008a\u031e\3\2\2\2\u008c\u0323\3\2\2\2\u008e\u0325\3\2\2\2\u0090"+
		"\u032d\3\2\2\2\u0092\u0331\3\2\2\2\u0094\u0339\3\2\2\2\u0096\u033b\3\2"+
		"\2\2\u0098\u033f\3\2\2\2\u009a\u0343\3\2\2\2\u009c\u0347\3\2\2\2\u009e"+
		"\u034c\3\2\2\2\u00a0\u0350\3\2\2\2\u00a2\u0366\3\2\2\2\u00a4\u00a6\5\4"+
		"\3\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00aa\3\2\2\2\u00a7"+
		"\u00a9\5\6\4\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b0\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00af\5\b\5\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b4\7\2\2\3\u00b4\3\3\2\2\2\u00b5\u00b7\5J&\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00bd\5\u008eH\2\u00bd"+
		"\u00be\5\u00a2R\2\u00be\5\3\2\2\2\u00bf\u00c0\7\4\2\2\u00c0\u00c1\5\u008e"+
		"H\2\u00c1\u00c2\5\u00a2R\2\u00c2\7\3\2\2\2\u00c3\u00d9\5\16\b\2\u00c4"+
		"\u00d9\5\f\7\2\u00c5\u00d9\5\24\13\2\u00c6\u00d9\5\32\16\2\u00c7\u00d9"+
		"\5$\23\2\u00c8\u00d9\5&\24\2\u00c9\u00d9\5.\30\2\u00ca\u00d9\5\64\33\2"+
		"\u00cb\u00d9\5> \2\u00cc\u00d9\5F$\2\u00cd\u00d9\5L\'\2\u00ce\u00d9\5"+
		"N(\2\u00cf\u00d9\5T+\2\u00d0\u00d9\5Z.\2\u00d1\u00d9\5`\61\2\u00d2\u00d9"+
		"\5b\62\2\u00d3\u00d9\5d\63\2\u00d4\u00d9\5j\66\2\u00d5\u00d9\5\20\t\2"+
		"\u00d6\u00d9\5\22\n\2\u00d7\u00d9\5r:\2\u00d8\u00c3\3\2\2\2\u00d8\u00c4"+
		"\3\2\2\2\u00d8\u00c5\3\2\2\2\u00d8\u00c6\3\2\2\2\u00d8\u00c7\3\2\2\2\u00d8"+
		"\u00c8\3\2\2\2\u00d8\u00c9\3\2\2\2\u00d8\u00ca\3\2\2\2\u00d8\u00cb\3\2"+
		"\2\2\u00d8\u00cc\3\2\2\2\u00d8\u00cd\3\2\2\2\u00d8\u00ce\3\2\2\2\u00d8"+
		"\u00cf\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d8\u00d2\3\2"+
		"\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\t\3\2\2\2\u00da\u00de\7T\2\2"+
		"\u00db\u00dd\5\b\5\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\7U\2\2\u00e2\13\3\2\2\2\u00e3\u00e7\7T\2\2\u00e4\u00e6\5\b\5\2"+
		"\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7U\2\2\u00eb"+
		"\r\3\2\2\2\u00ec\u00ed\7^\2\2\u00ed\17\3\2\2\2\u00ee\u00ef\7\31\2\2\u00ef"+
		"\u00f0\5\u00a2R\2\u00f0\21\3\2\2\2\u00f1\u00f2\7\32\2\2\u00f2\u00f3\5"+
		"\u00a2R\2\u00f3\23\3\2\2\2\u00f4\u00f6\5J&\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\t\2\2\2\u00fb\u00fc\5\26\f\2\u00fc"+
		"\u00fd\5\u00a2R\2\u00fd\25\3\2\2\2\u00fe\u0103\5\30\r\2\u00ff\u0100\7"+
		"]\2\2\u0100\u0102\5\30\r\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\27\3\2\2\2\u0105\u0103\3\2\2"+
		"\2\u0106\u0109\5\u008cG\2\u0107\u0108\7_\2\2\u0108\u010a\5\u0090I\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u010c\7F"+
		"\2\2\u010c\u010e\5n8\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\31"+
		"\3\2\2\2\u010f\u0111\5J&\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0115\u0116\7\33\2\2\u0116\u0118\5\u008cG\2\u0117\u0119\5\u009eP"+
		"\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c"+
		"\5\34\17\2\u011b\u011d\5\"\22\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2"+
		"\2\u011d\u011e\3\2\2\2\u011e\u011f\5\n\6\2\u011f\33\3\2\2\2\u0120\u0122"+
		"\7R\2\2\u0121\u0123\5\36\20\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0125\7S\2\2\u0125\35\3\2\2\2\u0126\u0127\5"+
		" \21\2\u0127\u0128\7]\2\2\u0128\u0129\5 \21\2\u0129\37\3\2\2\2\u012a\u012c"+
		"\5J&\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\5\30"+
		"\r\2\u0131!\3\2\2\2\u0132\u0135\7_\2\2\u0133\u0136\5\u0090I\2\u0134\u0136"+
		"\7\35\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136#\3\2\2\2\u0137"+
		"\u0139\7\34\2\2\u0138\u013a\5n8\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u013c\5\u00a2R\2\u013c%\3\2\2\2\u013d\u013f"+
		"\5J&\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7\36"+
		"\2\2\u0144\u0149\5\u008cG\2\u0145\u0146\7\67\2\2\u0146\u0147\5\u0094K"+
		"\2\u0147\u0148\7\66\2\2\u0148\u014a\3\2\2\2\u0149\u0145\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7T\2\2\u014c\u014d\5(\25"+
		"\2\u014d\u014e\7U\2\2\u014e\'\3\2\2\2\u014f\u0150\7T\2\2\u0150\u0151\5"+
		",\27\2\u0151\u0152\7U\2\2\u0152)\3\2\2\2\u0153\u0155\5J&\2\u0154\u0153"+
		"\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015c\5\u008cG\2\u015a\u015b"+
		"\7F\2\2\u015b\u015d\5n8\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"+\3\2\2\2\u015e\u0163\5*\26\2\u015f\u0160\7]\2\2\u0160\u0162\5*\26\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\5\u00a2R\2\u0167"+
		"-\3\2\2\2\u0168\u016a\5J&\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016e\u016f\7\37\2\2\u016f\u0171\5\u008cG\2\u0170\u0172\5\u009eP"+
		"\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0175"+
		"\5\62\32\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2"+
		"\u0176\u0177\5\60\31\2\u0177/\3\2\2\2\u0178\u017c\7T\2\2\u0179\u017b\5"+
		"\24\13\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7U"+
		"\2\2\u0180\61\3\2\2\2\u0181\u0182\7!\2\2\u0182\u0183\5\u0090I\2\u0183"+
		"\63\3\2\2\2\u0184\u0186\5J&\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2"+
		"\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187"+
		"\3\2\2\2\u018a\u018b\7 \2\2\u018b\u018d\5\u008cG\2\u018c\u018e\5\u009e"+
		"P\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f"+
		"\u0191\5\62\32\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3"+
		"\2\2\2\u0192\u0194\5<\37\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0196\5\66\34\2\u0196\65\3\2\2\2\u0197\u019b\7T\2"+
		"\2\u0198\u019a\58\35\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e"+
		"\u019f\7U\2\2\u019f\67\3\2\2\2\u01a0\u01a4\5\24\13\2\u01a1\u01a4\5\32"+
		"\16\2\u01a2\u01a4\5:\36\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a2\3\2\2\2\u01a49\3\2\2\2\u01a5\u01a7\5J&\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2"+
		"\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7#\2\2\u01ac\u01ad\5\34\17\2\u01ad"+
		"\u01ae\5\n\6\2\u01ae;\3\2\2\2\u01af\u01b0\7\'\2\2\u01b0\u01b1\5\u0092"+
		"J\2\u01b1=\3\2\2\2\u01b2\u01b4\5J&\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3"+
		"\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8\u01b9\7&\2\2\u01b9\u01bb\5\u008cG\2\u01ba\u01bc\5"+
		"\u009eP\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2"+
		"\u01bd\u01bf\5\62\32\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0\u01c1\5@!\2\u01c1?\3\2\2\2\u01c2\u01c6\7T\2\2\u01c3\u01c5"+
		"\5B\"\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7U"+
		"\2\2\u01caA\3\2\2\2\u01cb\u01cf\5\24\13\2\u01cc\u01cf\5\32\16\2\u01cd"+
		"\u01cf\5D#\2\u01ce\u01cb\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2"+
		"\2\u01cfC\3\2\2\2\u01d0\u01d2\5J&\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3"+
		"\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d6\u01d7\7\33\2\2\u01d7\u01d9\5\u008cG\2\u01d8\u01da"+
		"\5\u009eP\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2"+
		"\2\u01db\u01dd\5\34\17\2\u01dc\u01de\5\"\22\2\u01dd\u01dc\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\5\u00a2R\2\u01e0E\3\2\2"+
		"\2\u01e1\u01e3\5J&\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7"+
		"\u01e8\7(\2\2\u01e8\u01e9\5\u008cG\2\u01e9\u01ea\5H%\2\u01eaG\3\2\2\2"+
		"\u01eb\u01ef\7T\2\2\u01ec\u01ee\5\24\13\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1"+
		"\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01f3\7U\2\2\u01f3I\3\2\2\2\u01f4\u01f5\7`\2\2\u01f5"+
		"\u01f7\5\u008eH\2\u01f6\u01f8\5~@\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3"+
		"\2\2\2\u01f8K\3\2\2\2\u01f9\u01fa\7\n\2\2\u01fa\u01fb\5n8\2\u01fb\u01fc"+
		"\5\u00a2R\2\u01fcM\3\2\2\2\u01fd\u01fe\7\13\2\2\u01fe\u01ff\5\n\6\2\u01ff"+
		"\u0200\5R*\2\u0200\u020c\3\2\2\2\u0201\u0202\7\13\2\2\u0202\u0204\5\n"+
		"\6\2\u0203\u0205\5P)\2\u0204\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0204"+
		"\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u020a\5R*\2\u0209"+
		"\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u01fd\3\2"+
		"\2\2\u020b\u0201\3\2\2\2\u020cO\3\2\2\2\u020d\u020e\7\f\2\2\u020e\u020f"+
		"\7R\2\2\u020f\u0210\5\30\r\2\u0210\u0211\7S\2\2\u0211\u0212\5\n\6\2\u0212"+
		"Q\3\2\2\2\u0213\u0214\7\r\2\2\u0214\u0215\5\n\6\2\u0215S\3\2\2\2\u0216"+
		"\u0217\7\16\2\2\u0217\u0218\5X-\2\u0218\u021a\5\b\5\2\u0219\u021b\5V,"+
		"\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021bU\3\2\2\2\u021c\u021d"+
		"\7\17\2\2\u021d\u021e\5\b\5\2\u021eW\3\2\2\2\u021f\u0220\7R\2\2\u0220"+
		"\u0221\5n8\2\u0221\u0222\7S\2\2\u0222Y\3\2\2\2\u0223\u0224\7\20\2\2\u0224"+
		"\u0225\5X-\2\u0225\u0227\7T\2\2\u0226\u0228\5\\/\2\u0227\u0226\3\2\2\2"+
		"\u0228\u0229\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b"+
		"\3\2\2\2\u022b\u022c\7U\2\2\u022c[\3\2\2\2\u022d\u022f\5^\60\2\u022e\u022d"+
		"\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0233\3\2\2\2\u0232\u0234\5\b\5\2\u0233\u0232\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236]\3\2\2\2\u0237\u0238"+
		"\7\21\2\2\u0238\u0239\5n8\2\u0239\u023a\7_\2\2\u023a\u023e\3\2\2\2\u023b"+
		"\u023c\7\22\2\2\u023c\u023e\7_\2\2\u023d\u0237\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023e_\3\2\2\2\u023f\u0240\7\25\2\2\u0240\u0241\5X-\2\u0241\u0242"+
		"\5\b\5\2\u0242a\3\2\2\2\u0243\u0244\7\24\2\2\u0244\u0245\5\b\5\2\u0245"+
		"\u0246\7\25\2\2\u0246\u0247\5X-\2\u0247\u0248\5\u00a2R\2\u0248c\3\2\2"+
		"\2\u0249\u024a\7\26\2\2\u024a\u024c\7R\2\2\u024b\u024d\5f\64\2\u024c\u024b"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\7^\2\2\u024f"+
		"\u0251\5n8\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2"+
		"\2\u0252\u0254\7^\2\2\u0253\u0255\5p9\2\u0254\u0253\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\7S\2\2\u0257\u0258\5\b\5\2\u0258"+
		"e\3\2\2\2\u0259\u025c\5h\65\2\u025a\u025c\5p9\2\u025b\u0259\3\2\2\2\u025b"+
		"\u025a\3\2\2\2\u025cg\3\2\2\2\u025d\u025f\5J&\2\u025e\u025d\3\2\2\2\u025f"+
		"\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2"+
		"\2\2\u0262\u0260\3\2\2\2\u0263\u0264\t\2\2\2\u0264\u0265\5\26\f\2\u0265"+
		"i\3\2\2\2\u0266\u0267\7\26\2\2\u0267\u0268\7R\2\2\u0268\u026b\5\u008c"+
		"G\2\u0269\u026a\7]\2\2\u026a\u026c\5\u008cG\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\7\30\2\2\u026e\u026f\5"+
		"n8\2\u026f\u0270\7S\2\2\u0270\u0271\5\b\5\2\u0271k\3\2\2\2\u0272\u0273"+
		"\b\67\1\2\u0273\u0274\7R\2\2\u0274\u0275\5l\67\2\u0275\u0276\7S\2\2\u0276"+
		"\u0299\3\2\2\2\u0277\u0299\7$\2\2\u0278\u0299\7%\2\2\u0279\u0299\5\u008c"+
		"G\2\u027a\u027e\7\"\2\2\u027b\u027d\5J&\2\u027c\u027b\3\2\2\2\u027d\u0280"+
		"\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280"+
		"\u027e\3\2\2\2\u0281\u0282\5\u0090I\2\u0282\u0283\5x=\2\u0283\u0299\3"+
		"\2\2\2\u0284\u0285\t\3\2\2\u0285\u0299\5l\67\24\u0286\u0287\t\4\2\2\u0287"+
		"\u0299\5l\67\23\u0288\u0289\5\u008eH\2\u0289\u028a\5\u0080A\2\u028a\u028b"+
		"\5l\67\7\u028b\u0299\3\2\2\2\u028c\u028f\5\u008cG\2\u028d\u028f\5\34\17"+
		"\2\u028e\u028c\3\2\2\2\u028e\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0293"+
		"\7Q\2\2\u0291\u0294\5l\67\2\u0292\u0294\5\n\6\2\u0293\u0291\3\2\2\2\u0293"+
		"\u0292\3\2\2\2\u0294\u0299\3\2\2\2\u0295\u0299\5\u0082B\2\u0296\u0299"+
		"\5\u0084C\2\u0297\u0299\5\u0086D\2\u0298\u0272\3\2\2\2\u0298\u0277\3\2"+
		"\2\2\u0298\u0278\3\2\2\2\u0298\u0279\3\2\2\2\u0298\u027a\3\2\2\2\u0298"+
		"\u0284\3\2\2\2\u0298\u0286\3\2\2\2\u0298\u0288\3\2\2\2\u0298\u028e\3\2"+
		"\2\2\u0298\u0295\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0297\3\2\2\2\u0299"+
		"\u02d6\3\2\2\2\u029a\u029b\f\22\2\2\u029b\u029c\t\5\2\2\u029c\u02d5\5"+
		"l\67\23\u029d\u029e\f\21\2\2\u029e\u029f\t\3\2\2\u029f\u02d5\5l\67\22"+
		"\u02a0\u02a5\f\20\2\2\u02a1\u02a2\7\67\2\2\u02a2\u02a6\7\67\2\2\u02a3"+
		"\u02a4\7\66\2\2\u02a4\u02a6\7\66\2\2\u02a5\u02a1\3\2\2\2\u02a5\u02a3\3"+
		"\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02d5\5l\67\21\u02a8\u02a9\f\17\2\2\u02a9"+
		"\u02aa\t\6\2\2\u02aa\u02d5\5l\67\20\u02ab\u02ac\f\16\2\2\u02ac\u02ad\t"+
		"\7\2\2\u02ad\u02d5\5l\67\17\u02ae\u02af\f\r\2\2\u02af\u02b0\7B\2\2\u02b0"+
		"\u02d5\5l\67\16\u02b1\u02b2\f\f\2\2\u02b2\u02b3\7D\2\2\u02b3\u02d5\5l"+
		"\67\r\u02b4\u02b5\f\13\2\2\u02b5\u02b6\7C\2\2\u02b6\u02d5\5l\67\f\u02b7"+
		"\u02b8\f\n\2\2\u02b8\u02b9\7:\2\2\u02b9\u02d5\5l\67\13\u02ba\u02bb\f\t"+
		"\2\2\u02bb\u02bc\7;\2\2\u02bc\u02d5\5l\67\n\u02bd\u02be\f\b\2\2\u02be"+
		"\u02bf\7\63\2\2\u02bf\u02c0\5l\67\2\u02c0\u02c1\7_\2\2\u02c1\u02c2\5l"+
		"\67\b\u02c2\u02d5\3\2\2\2\u02c3\u02c4\f\31\2\2\u02c4\u02c9\7\\\2\2\u02c5"+
		"\u02ca\5\u008cG\2\u02c6\u02c7\5l\67\2\u02c7\u02c8\5x=\2\u02c8\u02ca\3"+
		"\2\2\2\u02c9\u02c5\3\2\2\2\u02c9\u02c6\3\2\2\2\u02ca\u02d5\3\2\2\2\u02cb"+
		"\u02cc\f\30\2\2\u02cc\u02cd\7V\2\2\u02cd\u02ce\5l\67\2\u02ce\u02cf\7W"+
		"\2\2\u02cf\u02d5\3\2\2\2\u02d0\u02d1\f\27\2\2\u02d1\u02d5\5x=\2\u02d2"+
		"\u02d3\f\25\2\2\u02d3\u02d5\t\b\2\2\u02d4\u029a\3\2\2\2\u02d4\u029d\3"+
		"\2\2\2\u02d4\u02a0\3\2\2\2\u02d4\u02a8\3\2\2\2\u02d4\u02ab\3\2\2\2\u02d4"+
		"\u02ae\3\2\2\2\u02d4\u02b1\3\2\2\2\u02d4\u02b4\3\2\2\2\u02d4\u02b7\3\2"+
		"\2\2\u02d4\u02ba\3\2\2\2\u02d4\u02bd\3\2\2\2\u02d4\u02c3\3\2\2\2\u02d4"+
		"\u02cb\3\2\2\2\u02d4\u02d0\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d8\3\2"+
		"\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7m\3\2\2\2\u02d8\u02d6"+
		"\3\2\2\2\u02d9\u02da\5l\67\2\u02dao\3\2\2\2\u02db\u02e0\5n8\2\u02dc\u02dd"+
		"\7]\2\2\u02dd\u02df\5n8\2\u02de\u02dc\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0"+
		"\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1q\3\2\2\2\u02e2\u02e0\3\2\2\2"+
		"\u02e3\u02e4\5n8\2\u02e4\u02e5\5\u00a2R\2\u02e5s\3\2\2\2\u02e6\u02e9\5"+
		"n8\2\u02e7\u02e9\5z>\2\u02e8\u02e6\3\2\2\2\u02e8\u02e7\3\2\2\2\u02e9u"+
		"\3\2\2\2\u02ea\u02ef\5t;\2\u02eb\u02ec\7]\2\2\u02ec\u02ee\5t;\2\u02ed"+
		"\u02eb\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2"+
		"\2\2\u02f0w\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f4\7R\2\2\u02f3\u02f5"+
		"\5v<\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u02f7\7S\2\2\u02f7y\3\2\2\2\u02f8\u02f9\5\u008cG\2\u02f9\u02fa\7F\2\2"+
		"\u02fa\u02fb\5n8\2\u02fb{\3\2\2\2\u02fc\u0301\5z>\2\u02fd\u02fe\7]\2\2"+
		"\u02fe\u0300\5z>\2\u02ff\u02fd\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302}\3\2\2\2\u0303\u0301\3\2\2\2\u0304"+
		"\u0306\7R\2\2\u0305\u0307\5|?\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2"+
		"\2\u0307\u0308\3\2\2\2\u0308\u0309\7S\2\2\u0309\177\3\2\2\2\u030a\u030b"+
		"\t\t\2\2\u030b\u0081\3\2\2\2\u030c\u030d\t\n\2\2\u030d\u0083\3\2\2\2\u030e"+
		"\u0310\7V\2\2\u030f\u0311\5p9\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2"+
		"\2\u0311\u0312\3\2\2\2\u0312\u0313\7W\2\2\u0313\u0085\3\2\2\2\u0314\u0316"+
		"\7T\2\2\u0315\u0317\5\u008aF\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2"+
		"\u0317\u0318\3\2\2\2\u0318\u0319\7U\2\2\u0319\u0087\3\2\2\2\u031a\u031b"+
		"\5\u008cG\2\u031b\u031c\7_\2\2\u031c\u031d\5n8\2\u031d\u0089\3\2\2\2\u031e"+
		"\u0321\5\u0088E\2\u031f\u0320\7]\2\2\u0320\u0322\5\u0088E\2\u0321\u031f"+
		"\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u008b\3\2\2\2\u0323\u0324\7b\2\2\u0324"+
		"\u008d\3\2\2\2\u0325\u032a\5\u008cG\2\u0326\u0327\7\\\2\2\u0327\u0329"+
		"\5\u008cG\2\u0328\u0326\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2"+
		"\2\u032a\u032b\3\2\2\2\u032b\u008f\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032f"+
		"\5\u008eH\2\u032e\u0330\5\u0098M\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330\u0091\3\2\2\2\u0331\u0336\5\u0090I\2\u0332\u0333\7]\2\2\u0333"+
		"\u0335\5\u0090I\2\u0334\u0332\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334"+
		"\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0093\3\2\2\2\u0338\u0336\3\2\2\2\u0339"+
		"\u033a\5\u0090I\2\u033a\u0095\3\2\2\2\u033b\u033c\5\u0094K\2\u033c\u033d"+
		"\7]\2\2\u033d\u033e\5\u0094K\2\u033e\u0097\3\2\2\2\u033f\u0340\7\67\2"+
		"\2\u0340\u0341\5\u0096L\2\u0341\u0342\7\66\2\2\u0342\u0099\3\2\2\2\u0343"+
		"\u0345\5\u008cG\2\u0344\u0346\5\u00a0Q\2\u0345\u0344\3\2\2\2\u0345\u0346"+
		"\3\2\2\2\u0346\u009b\3\2\2\2\u0347\u034a\5\u009aN\2\u0348\u0349\7]\2\2"+
		"\u0349\u034b\5\u009aN\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"\u009d\3\2\2\2\u034c\u034d\7\67\2\2\u034d\u034e\5\u009cO\2\u034e\u034f"+
		"\7\66\2\2\u034f\u009f\3\2\2\2\u0350\u0351\7!\2\2\u0351\u0352\5\u0090I"+
		"\2\u0352\u00a1\3\2\2\2\u0353\u0355\7Y\2\2\u0354\u0353\3\2\2\2\u0355\u0356"+
		"\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0367\3\2\2\2\u0358"+
		"\u035a\7Y\2\2\u0359\u0358\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359\3\2"+
		"\2\2\u035b\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d\u035b\3\2\2\2\u035e"+
		"\u0362\7^\2\2\u035f\u0361\7Y\2\2\u0360\u035f\3\2\2\2\u0361\u0364\3\2\2"+
		"\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0367\3\2\2\2\u0364\u0362"+
		"\3\2\2\2\u0365\u0367\7\2\2\3\u0366\u0354\3\2\2\2\u0366\u035b\3\2\2\2\u0366"+
		"\u0365\3\2\2\2\u0367\u00a3\3\2\2\2W\u00a5\u00aa\u00b0\u00b8\u00d8\u00de"+
		"\u00e7\u00f7\u0103\u0109\u010d\u0112\u0118\u011c\u0122\u012d\u0135\u0139"+
		"\u0140\u0149\u0156\u015c\u0163\u016b\u0171\u0174\u017c\u0187\u018d\u0190"+
		"\u0193\u019b\u01a3\u01a8\u01b5\u01bb\u01be\u01c6\u01ce\u01d3\u01d9\u01dd"+
		"\u01e4\u01ef\u01f7\u0206\u0209\u020b\u021a\u0229\u0230\u0235\u023d\u024c"+
		"\u0250\u0254\u025b\u0260\u026b\u027e\u028e\u0293\u0298\u02a5\u02c9\u02d4"+
		"\u02d6\u02e0\u02e8\u02ef\u02f4\u0301\u0306\u0310\u0316\u0321\u032a\u032f"+
		"\u0336\u0345\u034a\u0356\u035b\u0362\u0366";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}