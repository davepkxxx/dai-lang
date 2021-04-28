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
		RULE_body = 3, RULE_statement = 4, RULE_block = 5, RULE_blockStatements = 6, 
		RULE_emptyStatement = 7, RULE_continueStatement = 8, RULE_breakStatement = 9, 
		RULE_variateDeclaration = 10, RULE_variateDeclaratorList = 11, RULE_variateDeclarator = 12, 
		RULE_functionDeclaration = 13, RULE_functionParameters = 14, RULE_functionReturn = 15, 
		RULE_returnStatement = 16, RULE_enumDeclaration = 17, RULE_enumBody = 18, 
		RULE_enumFieldDeclarator = 19, RULE_enumFieldDeclaratorList = 20, RULE_structDeclaration = 21, 
		RULE_structBody = 22, RULE_extendsSnippet = 23, RULE_classDeclaration = 24, 
		RULE_classBody = 25, RULE_classMemberDeclaration = 26, RULE_constructorDeclaration = 27, 
		RULE_implementsSnippet = 28, RULE_interfaceDeclaration = 29, RULE_interfaceBody = 30, 
		RULE_interfaceMemberDeclaration = 31, RULE_abstractFunctionDeclaration = 32, 
		RULE_annotationDeclaration = 33, RULE_annotationBody = 34, RULE_throwStatement = 35, 
		RULE_tryStatement = 36, RULE_ifStatement = 37, RULE_condition = 38, RULE_switchStatement = 39, 
		RULE_switchCaseStatement = 40, RULE_switchCaseLabel = 41, RULE_loopStatement = 42, 
		RULE_whileStatement = 43, RULE_doWhileStatement = 44, RULE_forStatement = 45, 
		RULE_forInit = 46, RULE_foreachStatement = 47, RULE_expression = 48, RULE_expressionList = 49, 
		RULE_expressionStatement = 50, RULE_params = 51, RULE_assignOperator = 52, 
		RULE_literal = 53, RULE_arrayLiteral = 54, RULE_objectLiteral = 55, RULE_objectProperty = 56, 
		RULE_objectPropertyList = 57, RULE_identifier = 58, RULE_identifierPath = 59, 
		RULE_genericsParameter = 60, RULE_genericsParameterList = 61, RULE_genericsParameters = 62, 
		RULE_classType = 63, RULE_declareGenericsParameter = 64, RULE_declareGenericsParameterList = 65, 
		RULE_declareGenericsParameters = 66, RULE_declareGenericsParameterExtends = 67, 
		RULE_declareGenericsParameterSuper = 68, RULE_eos = 69;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "body", 
			"statement", "block", "blockStatements", "emptyStatement", "continueStatement", 
			"breakStatement", "variateDeclaration", "variateDeclaratorList", "variateDeclarator", 
			"functionDeclaration", "functionParameters", "functionReturn", "returnStatement", 
			"enumDeclaration", "enumBody", "enumFieldDeclarator", "enumFieldDeclaratorList", 
			"structDeclaration", "structBody", "extendsSnippet", "classDeclaration", 
			"classBody", "classMemberDeclaration", "constructorDeclaration", "implementsSnippet", 
			"interfaceDeclaration", "interfaceBody", "interfaceMemberDeclaration", 
			"abstractFunctionDeclaration", "annotationDeclaration", "annotationBody", 
			"throwStatement", "tryStatement", "ifStatement", "condition", "switchStatement", 
			"switchCaseStatement", "switchCaseLabel", "loopStatement", "whileStatement", 
			"doWhileStatement", "forStatement", "forInit", "foreachStatement", "expression", 
			"expressionList", "expressionStatement", "params", "assignOperator", 
			"literal", "arrayLiteral", "objectLiteral", "objectProperty", "objectPropertyList", 
			"identifier", "identifierPath", "genericsParameter", "genericsParameterList", 
			"genericsParameters", "classType", "declareGenericsParameter", "declareGenericsParameterList", 
			"declareGenericsParameters", "declareGenericsParameterExtends", "declareGenericsParameterSuper", 
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
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
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(140);
				packageDeclaration();
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(143);
				importDeclaration();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			body();
			setState(150);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(PACKAGE);
			setState(153);
			identifierPath();
			setState(154);
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
			setState(156);
			match(IMPORT);
			setState(157);
			identifierPath();
			setState(158);
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

	public static class BodyContext extends ParserRuleContext {
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
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << LOOP) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (SEMI - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				{
				setState(160);
				statement();
				}
				}
				setState(165);
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

	public static class StatementContext extends ParserRuleContext {
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public VariateDeclarationContext variateDeclaration() {
			return getRuleContext(VariateDeclarationContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
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
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
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
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
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
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				emptyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				blockStatements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				variateDeclaration();
				setState(169);
				eos();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				enumDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				structDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				interfaceDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(177);
				throwStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(178);
				tryStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(179);
				ifStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(180);
				switchStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(181);
				loopStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(182);
				whileStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(183);
				doWhileStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(184);
				forStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(185);
				foreachStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(186);
				continueStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(187);
				breakStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(188);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(LEFT_BRACE);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << LOOP) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (SEMI - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				{
				setState(192);
				statement();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
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

	public static class BlockStatementsContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(DaiParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(DaiParser.RIGHT_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(LEFT_BRACE);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << LOOP) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (SEMI - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				{
				setState(201);
				statement();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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
		enterRule(_localctx, 14, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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
		enterRule(_localctx, 16, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(CONTINUE);
			setState(212);
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
		enterRule(_localctx, 18, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(BREAK);
			setState(215);
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
		public VariateDeclaratorListContext variateDeclaratorList() {
			return getRuleContext(VariateDeclaratorListContext.class,0);
		}
		public TerminalNode VAR() { return getToken(DaiParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(DaiParser.CONST, 0); }
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
		enterRule(_localctx, 20, RULE_variateDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(218);
			variateDeclaratorList();
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

	public static class VariateDeclaratorListContext extends ParserRuleContext {
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
		public VariateDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variateDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitVariateDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariateDeclaratorListContext variateDeclaratorList() throws RecognitionException {
		VariateDeclaratorListContext _localctx = new VariateDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variateDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			variateDeclarator();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				variateDeclarator();
				}
				}
				setState(227);
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
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
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
		enterRule(_localctx, 24, RULE_variateDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			identifier();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(229);
				match(COLON);
				setState(230);
				classType();
				}
			}

			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(233);
				match(ASSIGNMENT);
				setState(234);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(DaiParser.FUNC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclareGenericsParametersContext declareGenericsParameters() {
			return getRuleContext(DeclareGenericsParametersContext.class,0);
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
		enterRule(_localctx, 26, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(FUNC);
			setState(238);
			identifier();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(239);
				declareGenericsParameters();
				}
			}

			setState(242);
			functionParameters();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(243);
				functionReturn();
				}
			}

			setState(246);
			block();
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

	public static class FunctionParametersContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public VariateDeclaratorListContext variateDeclaratorList() {
			return getRuleContext(VariateDeclaratorListContext.class,0);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(LEFT_PAREN);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(249);
				variateDeclaratorList();
				}
			}

			setState(252);
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

	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(DaiParser.COLON, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
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
		enterRule(_localctx, 30, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(COLON);
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(255);
				classType();
				}
				break;
			case VOID:
				{
				setState(256);
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
		enterRule(_localctx, 32, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(RETURN);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(260);
				expression(0);
				}
			}

			setState(263);
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
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TerminalNode LESS_THAN() { return getToken(DaiParser.LESS_THAN, 0); }
		public GenericsParameterContext genericsParameter() {
			return getRuleContext(GenericsParameterContext.class,0);
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
		enterRule(_localctx, 34, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(ENUM);
			setState(266);
			identifier();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(267);
				match(LESS_THAN);
				setState(268);
				genericsParameter();
				setState(269);
				match(GREATER_THAN);
				}
			}

			setState(273);
			enumBody();
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
		public EnumFieldDeclaratorListContext enumFieldDeclaratorList() {
			return getRuleContext(EnumFieldDeclaratorListContext.class,0);
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
		enterRule(_localctx, 36, RULE_enumBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(LEFT_BRACE);
			setState(276);
			enumFieldDeclaratorList();
			setState(277);
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
		enterRule(_localctx, 38, RULE_enumFieldDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			identifier();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(280);
				match(ASSIGNMENT);
				setState(281);
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

	public static class EnumFieldDeclaratorListContext extends ParserRuleContext {
		public List<EnumFieldDeclaratorContext> enumFieldDeclarator() {
			return getRuleContexts(EnumFieldDeclaratorContext.class);
		}
		public EnumFieldDeclaratorContext enumFieldDeclarator(int i) {
			return getRuleContext(EnumFieldDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaiParser.COMMA, i);
		}
		public EnumFieldDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumFieldDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitEnumFieldDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumFieldDeclaratorListContext enumFieldDeclaratorList() throws RecognitionException {
		EnumFieldDeclaratorListContext _localctx = new EnumFieldDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumFieldDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			enumFieldDeclarator();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(285);
				match(COMMA);
				setState(286);
				enumFieldDeclarator();
				}
				}
				setState(291);
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(DaiParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public DeclareGenericsParametersContext declareGenericsParameters() {
			return getRuleContext(DeclareGenericsParametersContext.class,0);
		}
		public ExtendsSnippetContext extendsSnippet() {
			return getRuleContext(ExtendsSnippetContext.class,0);
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
		enterRule(_localctx, 42, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(STRUCT);
			setState(293);
			identifier();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(294);
				declareGenericsParameters();
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(297);
				extendsSnippet();
				}
			}

			setState(300);
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
		enterRule(_localctx, 44, RULE_structBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(LEFT_BRACE);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==CONST) {
				{
				{
				setState(303);
				variateDeclaration();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
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

	public static class ExtendsSnippetContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(DaiParser.EXTENDS, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ExtendsSnippetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsSnippet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitExtendsSnippet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsSnippetContext extendsSnippet() throws RecognitionException {
		ExtendsSnippetContext _localctx = new ExtendsSnippetContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_extendsSnippet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(311);
			match(EXTENDS);
			setState(312);
			classType();
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
		public DeclareGenericsParametersContext declareGenericsParameters() {
			return getRuleContext(DeclareGenericsParametersContext.class,0);
		}
		public ExtendsSnippetContext extendsSnippet() {
			return getRuleContext(ExtendsSnippetContext.class,0);
		}
		public ImplementsSnippetContext implementsSnippet() {
			return getRuleContext(ImplementsSnippetContext.class,0);
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
		enterRule(_localctx, 48, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(CLASS);
			setState(315);
			identifier();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(316);
				declareGenericsParameters();
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(319);
				extendsSnippet();
				}
			}

			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(322);
				implementsSnippet();
				}
			}

			setState(325);
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
		enterRule(_localctx, 50, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(LEFT_BRACE);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << FUNC) | (1L << CONSTRUCTOR))) != 0)) {
				{
				{
				setState(328);
				classMemberDeclaration();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
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
		enterRule(_localctx, 52, RULE_classMemberDeclaration);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				variateDeclaration();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				functionDeclaration();
				}
				break;
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				constructorDeclaration();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(DaiParser.CONSTRUCTOR, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(CONSTRUCTOR);
			setState(342);
			functionParameters();
			setState(343);
			block();
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

	public static class ImplementsSnippetContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(DaiParser.IMPLEMENTS, 0); }
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaiParser.COMMA, i);
		}
		public ImplementsSnippetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsSnippet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitImplementsSnippet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsSnippetContext implementsSnippet() throws RecognitionException {
		ImplementsSnippetContext _localctx = new ImplementsSnippetContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_implementsSnippet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(IMPLEMENTS);
			setState(346);
			classType();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(347);
				match(COMMA);
				setState(348);
				classType();
				}
				}
				setState(353);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(DaiParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public DeclareGenericsParametersContext declareGenericsParameters() {
			return getRuleContext(DeclareGenericsParametersContext.class,0);
		}
		public ExtendsSnippetContext extendsSnippet() {
			return getRuleContext(ExtendsSnippetContext.class,0);
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
		enterRule(_localctx, 58, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(INTERFACE);
			setState(355);
			identifier();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(356);
				declareGenericsParameters();
				}
			}

			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(359);
				extendsSnippet();
				}
			}

			setState(362);
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
		enterRule(_localctx, 60, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(LEFT_BRACE);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << FUNC))) != 0)) {
				{
				{
				setState(365);
				interfaceMemberDeclaration();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
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
		enterRule(_localctx, 62, RULE_interfaceMemberDeclaration);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				variateDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
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
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public GenericsParametersContext genericsParameters() {
			return getRuleContext(GenericsParametersContext.class,0);
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
		enterRule(_localctx, 64, RULE_abstractFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(FUNC);
			setState(379);
			identifier();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(380);
				genericsParameters();
				}
			}

			setState(383);
			functionParameters();
			setState(384);
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
		enterRule(_localctx, 66, RULE_annotationDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(ANNOTATION);
			setState(387);
			identifier();
			setState(388);
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
		enterRule(_localctx, 68, RULE_annotationBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(LEFT_BRACE);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==CONST) {
				{
				{
				setState(391);
				variateDeclaration();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
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
		enterRule(_localctx, 70, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(THROW);
			setState(400);
			expression(0);
			setState(401);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode FINALLY() { return getToken(DaiParser.FINALLY, 0); }
		public TerminalNode CATCH() { return getToken(DaiParser.CATCH, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public VariateDeclaratorContext variateDeclarator() {
			return getRuleContext(VariateDeclaratorContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
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
		enterRule(_localctx, 72, RULE_tryStatement);
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(TRY);
				setState(404);
				statement();
				setState(405);
				match(FINALLY);
				setState(406);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(TRY);
				setState(409);
				statement();
				setState(410);
				match(CATCH);
				setState(411);
				match(LEFT_PAREN);
				setState(412);
				variateDeclarator();
				setState(413);
				match(RIGHT_PAREN);
				setState(414);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				match(TRY);
				setState(417);
				statement();
				setState(418);
				match(CATCH);
				setState(419);
				match(LEFT_PAREN);
				setState(420);
				variateDeclarator();
				setState(421);
				match(RIGHT_PAREN);
				setState(422);
				statement();
				setState(423);
				match(FINALLY);
				setState(424);
				statement();
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

	public static class IfStatementContext extends ParserRuleContext {
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
		enterRule(_localctx, 74, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(IF);
			setState(429);
			condition();
			setState(430);
			statement();
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(431);
				match(ELSE);
				setState(432);
				statement();
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
		enterRule(_localctx, 76, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(LEFT_PAREN);
			setState(436);
			expression(0);
			setState(437);
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
		public List<SwitchCaseStatementContext> switchCaseStatement() {
			return getRuleContexts(SwitchCaseStatementContext.class);
		}
		public SwitchCaseStatementContext switchCaseStatement(int i) {
			return getRuleContext(SwitchCaseStatementContext.class,i);
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
		enterRule(_localctx, 78, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(SWITCH);
			setState(440);
			condition();
			setState(441);
			match(LEFT_BRACE);
			setState(443); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(442);
				switchCaseStatement();
				}
				}
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(447);
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

	public static class SwitchCaseStatementContext extends ParserRuleContext {
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
		public SwitchCaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCaseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitSwitchCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseStatementContext switchCaseStatement() throws RecognitionException {
		SwitchCaseStatementContext _localctx = new SwitchCaseStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_switchCaseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(449);
				switchCaseLabel();
				}
				}
				setState(452); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(455); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(454);
				statement();
				}
				}
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << LOOP) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (SEMI - 80)) | (1L << (IDENTIFIER - 80)))) != 0) );
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
		enterRule(_localctx, 82, RULE_switchCaseLabel);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(CASE);
				setState(460);
				expression(0);
				setState(461);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(DEFAULT);
				setState(464);
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

	public static class LoopStatementContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(DaiParser.LOOP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(LOOP);
			setState(468);
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
		enterRule(_localctx, 86, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(WHILE);
			setState(471);
			condition();
			setState(472);
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
		enterRule(_localctx, 88, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(DO);
			setState(475);
			statement();
			setState(476);
			match(WHILE);
			setState(477);
			condition();
			setState(478);
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
		enterRule(_localctx, 90, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(FOR);
			setState(481);
			match(LEFT_PAREN);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(482);
				forInit();
				}
			}

			setState(485);
			match(SEMI);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(486);
				expression(0);
				}
			}

			setState(489);
			match(SEMI);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(490);
				expressionList();
				}
			}

			setState(493);
			match(RIGHT_PAREN);
			setState(494);
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
		public VariateDeclarationContext variateDeclaration() {
			return getRuleContext(VariateDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
		enterRule(_localctx, 92, RULE_forInit);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				variateDeclaration();
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
				setState(497);
				expressionList();
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

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(DaiParser.FOREACH, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(DaiParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(DaiParser.LEFT_PAREN, i);
		}
		public List<VariateDeclaratorContext> variateDeclarator() {
			return getRuleContexts(VariateDeclaratorContext.class);
		}
		public VariateDeclaratorContext variateDeclarator(int i) {
			return getRuleContext(VariateDeclaratorContext.class,i);
		}
		public TerminalNode IN() { return getToken(DaiParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(DaiParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(DaiParser.RIGHT_PAREN, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_foreachStatement);
		int _la;
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				match(FOREACH);
				setState(501);
				match(LEFT_PAREN);
				setState(502);
				variateDeclarator();
				setState(503);
				match(IN);
				setState(504);
				expression(0);
				setState(505);
				match(RIGHT_PAREN);
				setState(506);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(FOREACH);
				setState(509);
				match(LEFT_PAREN);
				setState(510);
				match(LEFT_PAREN);
				setState(511);
				variateDeclarator();
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(512);
					match(COMMA);
					setState(513);
					variateDeclarator();
					}
				}

				setState(516);
				match(RIGHT_PAREN);
				setState(517);
				match(IN);
				setState(518);
				expression(0);
				setState(519);
				match(RIGHT_PAREN);
				setState(520);
				statement();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(DaiParser.TILDE, 0); }
		public TerminalNode NOT() { return getToken(DaiParser.NOT, 0); }
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(DaiParser.AND, 0); }
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(DaiParser.ASSIGNMENT, 0); }
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
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftExpressionContext extends ExpressionContext {
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(DaiParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(DaiParser.COLON, 0); }
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpressionContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(DaiParser.NEW, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public GenericsParametersContext genericsParameters() {
			return getRuleContext(GenericsParametersContext.class,0);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExpressionContext extends ExpressionContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectLiteralExpressionContext extends ExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitObjectLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExpressionContext extends ExpressionContext {
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LEFT_BRACK() { return getToken(DaiParser.LEFT_BRACK, 0); }
		public TerminalNode RIGHT_BRACK() { return getToken(DaiParser.RIGHT_BRACK, 0); }
		public MemberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(DaiParser.OR, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChainExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(DaiParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ChainExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitChainExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseOrExpressionContext extends ExpressionContext {
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
	public static class ArrayLiteralExpressionContext extends ExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitArrayLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(525);
				match(LEFT_PAREN);
				setState(526);
				expression(0);
				setState(527);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(529);
				match(THIS);
				}
				break;
			case 3:
				{
				_localctx = new SuperExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(530);
				match(SUPER);
				}
				break;
			case 4:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(531);
				identifier();
				}
				break;
			case 5:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(532);
				match(NEW);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_THAN) {
					{
					setState(533);
					genericsParameters();
					}
				}

				setState(536);
				params();
				}
				break;
			case 6:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(537);
				_la = _input.LA(1);
				if ( !(_la==ADDITION || _la==SUBTRACTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(538);
				expression(18);
				}
				break;
			case 7:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(539);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(540);
				expression(17);
				}
				break;
			case 8:
				{
				_localctx = new AssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(541);
				identifierPath();
				setState(542);
				assignOperator();
				setState(543);
				expression(5);
				}
				break;
			case 9:
				{
				_localctx = new LambdaExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(547);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(545);
					identifier();
					}
					break;
				case LEFT_PAREN:
					{
					setState(546);
					functionParameters();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(549);
				match(ARROW);
				setState(552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(550);
					expression(0);
					}
					break;
				case 2:
					{
					setState(551);
					block();
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
				setState(554);
				literal();
				}
				break;
			case 11:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(555);
				arrayLiteral();
				}
				break;
			case 12:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(556);
				objectLiteral();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(617);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(559);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(560);
						_la = _input.LA(1);
						if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (MULTIPLICATION - 62)) | (1L << (DIVISION - 62)) | (1L << (REMAINDER - 62)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(561);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(562);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(563);
						_la = _input.LA(1);
						if ( !(_la==ADDITION || _la==SUBTRACTION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(564);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(565);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(570);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LESS_THAN:
							{
							setState(566);
							match(LESS_THAN);
							setState(567);
							match(LESS_THAN);
							}
							break;
						case GREATER_THAN:
							{
							setState(568);
							match(GREATER_THAN);
							setState(569);
							match(GREATER_THAN);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(572);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(573);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(574);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_THAN) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN_OR_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(575);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new EqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(576);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(577);
						_la = _input.LA(1);
						if ( !(_la==INEQUALITY || _la==ASSIGNMENT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(578);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new BitwiseAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(579);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(580);
						match(BITWISE_AND);
						setState(581);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExclusiveOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(582);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(583);
						match(EXCLUSIVE_OR);
						setState(584);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(585);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(586);
						match(BITWISE_OR);
						setState(587);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(588);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(589);
						match(AND);
						setState(590);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(591);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(592);
						match(OR);
						setState(593);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(594);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(595);
						match(QUESTION);
						setState(596);
						expression(0);
						setState(597);
						match(COLON);
						setState(598);
						expression(6);
						}
						break;
					case 12:
						{
						_localctx = new ChainExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(600);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(601);
						match(DOT);
						setState(606);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
						case 1:
							{
							setState(602);
							identifier();
							}
							break;
						case 2:
							{
							setState(603);
							expression(0);
							setState(604);
							params();
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new MemberExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(608);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(609);
						match(LEFT_BRACK);
						setState(610);
						expression(0);
						setState(611);
						match(RIGHT_BRACK);
						}
						break;
					case 14:
						{
						_localctx = new CallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(613);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(614);
						params();
						}
						break;
					case 15:
						{
						_localctx = new IncrementalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(615);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(616);
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
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class ExpressionListContext extends ParserRuleContext {
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
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			expression(0);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(623);
				match(COMMA);
				setState(624);
				expression(0);
				}
				}
				setState(629);
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
		enterRule(_localctx, 100, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			expression(0);
			setState(631);
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

	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DaiParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(DaiParser.RIGHT_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
		enterRule(_localctx, 102, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(LEFT_PAREN);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(634);
				expressionList();
				}
			}

			setState(637);
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
		enterRule(_localctx, 104, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
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
		enterRule(_localctx, 106, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
		enterRule(_localctx, 108, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(LEFT_BRACK);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (LEFT_PAREN - 80)) | (1L << (LEFT_BRACE - 80)) | (1L << (LEFT_BRACK - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
				{
				setState(644);
				expressionList();
				}
			}

			setState(647);
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
		public ObjectPropertyListContext objectPropertyList() {
			return getRuleContext(ObjectPropertyListContext.class,0);
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
		enterRule(_localctx, 110, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(LEFT_BRACE);
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(650);
				objectPropertyList();
				}
			}

			setState(653);
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
		enterRule(_localctx, 112, RULE_objectProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			identifier();
			setState(656);
			match(COLON);
			setState(657);
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

	public static class ObjectPropertyListContext extends ParserRuleContext {
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public ObjectPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPropertyList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitObjectPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyListContext objectPropertyList() throws RecognitionException {
		ObjectPropertyListContext _localctx = new ObjectPropertyListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_objectPropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			objectProperty();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(660);
				match(COMMA);
				setState(661);
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
		enterRule(_localctx, 116, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
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
		enterRule(_localctx, 118, RULE_identifierPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			identifier();
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(667);
				match(DOT);
				setState(668);
				identifier();
				}
				}
				setState(673);
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

	public static class GenericsParameterContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public GenericsParametersContext genericsParameters() {
			return getRuleContext(GenericsParametersContext.class,0);
		}
		public GenericsParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericsParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitGenericsParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericsParameterContext genericsParameter() throws RecognitionException {
		GenericsParameterContext _localctx = new GenericsParameterContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_genericsParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			identifierPath();
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(675);
				genericsParameters();
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

	public static class GenericsParameterListContext extends ParserRuleContext {
		public List<GenericsParameterContext> genericsParameter() {
			return getRuleContexts(GenericsParameterContext.class);
		}
		public GenericsParameterContext genericsParameter(int i) {
			return getRuleContext(GenericsParameterContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public GenericsParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericsParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitGenericsParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericsParameterListContext genericsParameterList() throws RecognitionException {
		GenericsParameterListContext _localctx = new GenericsParameterListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_genericsParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			genericsParameter();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(679);
				match(COMMA);
				setState(680);
				genericsParameter();
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

	public static class GenericsParametersContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(DaiParser.LESS_THAN, 0); }
		public GenericsParameterListContext genericsParameterList() {
			return getRuleContext(GenericsParameterListContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(DaiParser.GREATER_THAN, 0); }
		public GenericsParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericsParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitGenericsParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericsParametersContext genericsParameters() throws RecognitionException {
		GenericsParametersContext _localctx = new GenericsParametersContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_genericsParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(LESS_THAN);
			setState(684);
			genericsParameterList();
			setState(685);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public GenericsParametersContext genericsParameters() {
			return getRuleContext(GenericsParametersContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			identifierPath();
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(688);
				genericsParameters();
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

	public static class DeclareGenericsParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclareGenericsParameterExtendsContext declareGenericsParameterExtends() {
			return getRuleContext(DeclareGenericsParameterExtendsContext.class,0);
		}
		public DeclareGenericsParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareGenericsParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclareGenericsParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareGenericsParameterContext declareGenericsParameter() throws RecognitionException {
		DeclareGenericsParameterContext _localctx = new DeclareGenericsParameterContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_declareGenericsParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			identifier();
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(692);
				declareGenericsParameterExtends();
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

	public static class DeclareGenericsParameterListContext extends ParserRuleContext {
		public List<DeclareGenericsParameterContext> declareGenericsParameter() {
			return getRuleContexts(DeclareGenericsParameterContext.class);
		}
		public DeclareGenericsParameterContext declareGenericsParameter(int i) {
			return getRuleContext(DeclareGenericsParameterContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public DeclareGenericsParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareGenericsParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclareGenericsParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareGenericsParameterListContext declareGenericsParameterList() throws RecognitionException {
		DeclareGenericsParameterListContext _localctx = new DeclareGenericsParameterListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_declareGenericsParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			declareGenericsParameter();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(696);
				match(COMMA);
				setState(697);
				declareGenericsParameter();
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

	public static class DeclareGenericsParametersContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(DaiParser.LESS_THAN, 0); }
		public DeclareGenericsParameterListContext declareGenericsParameterList() {
			return getRuleContext(DeclareGenericsParameterListContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(DaiParser.GREATER_THAN, 0); }
		public DeclareGenericsParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareGenericsParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclareGenericsParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareGenericsParametersContext declareGenericsParameters() throws RecognitionException {
		DeclareGenericsParametersContext _localctx = new DeclareGenericsParametersContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_declareGenericsParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(LESS_THAN);
			setState(701);
			declareGenericsParameterList();
			setState(702);
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

	public static class DeclareGenericsParameterExtendsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(DaiParser.EXTENDS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclareGenericsParameterSuperContext declareGenericsParameterSuper() {
			return getRuleContext(DeclareGenericsParameterSuperContext.class,0);
		}
		public DeclareGenericsParameterExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareGenericsParameterExtends; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclareGenericsParameterExtends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareGenericsParameterExtendsContext declareGenericsParameterExtends() throws RecognitionException {
		DeclareGenericsParameterExtendsContext _localctx = new DeclareGenericsParameterExtendsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_declareGenericsParameterExtends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(EXTENDS);
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(705);
				identifier();
				}
				break;
			case 2:
				{
				setState(706);
				declareGenericsParameterSuper();
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

	public static class DeclareGenericsParameterSuperContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public GenericsParametersContext genericsParameters() {
			return getRuleContext(GenericsParametersContext.class,0);
		}
		public DeclareGenericsParameterSuperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareGenericsParameterSuper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitDeclareGenericsParameterSuper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareGenericsParameterSuperContext declareGenericsParameterSuper() throws RecognitionException {
		DeclareGenericsParameterSuperContext _localctx = new DeclareGenericsParameterSuperContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declareGenericsParameterSuper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			identifierPath();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(710);
				genericsParameters();
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
		enterRule(_localctx, 138, RULE_eos);
		int _la;
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(713);
					match(NL);
					}
					}
					setState(716); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(718);
					match(NL);
					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(724);
				match(SEMI);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(725);
					match(NL);
					}
					}
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(731);
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
		case 48:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3b\u02e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\5\2\u0090"+
		"\n\2\3\2\7\2\u0093\n\2\f\2\16\2\u0096\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\7\5\u00a4\n\5\f\5\16\5\u00a7\13\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00c0\n\6\3\7\3\7\7\7\u00c4\n\7\f\7\16\7\u00c7\13\7\3\7\3\7"+
		"\3\b\3\b\7\b\u00cd\n\b\f\b\16\b\u00d0\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00e2\n\r\f\r\16\r\u00e5\13"+
		"\r\3\16\3\16\3\16\5\16\u00ea\n\16\3\16\3\16\5\16\u00ee\n\16\3\17\3\17"+
		"\3\17\5\17\u00f3\n\17\3\17\3\17\5\17\u00f7\n\17\3\17\3\17\3\20\3\20\5"+
		"\20\u00fd\n\20\3\20\3\20\3\21\3\21\3\21\5\21\u0104\n\21\3\22\3\22\5\22"+
		"\u0108\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0112\n\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u011d\n\25\3\26\3\26"+
		"\3\26\7\26\u0122\n\26\f\26\16\26\u0125\13\26\3\27\3\27\3\27\5\27\u012a"+
		"\n\27\3\27\5\27\u012d\n\27\3\27\3\27\3\30\3\30\7\30\u0133\n\30\f\30\16"+
		"\30\u0136\13\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u0140\n\32"+
		"\3\32\5\32\u0143\n\32\3\32\5\32\u0146\n\32\3\32\3\32\3\33\3\33\7\33\u014c"+
		"\n\33\f\33\16\33\u014f\13\33\3\33\3\33\3\34\3\34\3\34\5\34\u0156\n\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u0160\n\36\f\36\16\36\u0163"+
		"\13\36\3\37\3\37\3\37\5\37\u0168\n\37\3\37\5\37\u016b\n\37\3\37\3\37\3"+
		" \3 \7 \u0171\n \f \16 \u0174\13 \3 \3 \3!\3!\3!\5!\u017b\n!\3\"\3\"\3"+
		"\"\5\"\u0180\n\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\7$\u018b\n$\f$\16$\u018e"+
		"\13$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\5&\u01ad\n&\3\'\3\'\3\'\3\'\3\'\5\'\u01b4\n\'\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\6)\u01be\n)\r)\16)\u01bf\3)\3)\3*\6*\u01c5\n*\r"+
		"*\16*\u01c6\3*\6*\u01ca\n*\r*\16*\u01cb\3+\3+\3+\3+\3+\3+\5+\u01d4\n+"+
		"\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\5/\u01e6\n/\3/\3/\5/"+
		"\u01ea\n/\3/\3/\5/\u01ee\n/\3/\3/\3/\3\60\3\60\5\60\u01f5\n\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0205"+
		"\n\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u020d\n\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0219\n\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0226\n\62\3\62\3\62\3\62\5\62\u022b"+
		"\n\62\3\62\3\62\3\62\5\62\u0230\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u023d\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u0261\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u026c\n"+
		"\62\f\62\16\62\u026f\13\62\3\63\3\63\3\63\7\63\u0274\n\63\f\63\16\63\u0277"+
		"\13\63\3\64\3\64\3\64\3\65\3\65\5\65\u027e\n\65\3\65\3\65\3\66\3\66\3"+
		"\67\3\67\38\38\58\u0288\n8\38\38\39\39\59\u028e\n9\39\39\3:\3:\3:\3:\3"+
		";\3;\3;\5;\u0299\n;\3<\3<\3=\3=\3=\7=\u02a0\n=\f=\16=\u02a3\13=\3>\3>"+
		"\5>\u02a7\n>\3?\3?\3?\5?\u02ac\n?\3@\3@\3@\3@\3A\3A\5A\u02b4\nA\3B\3B"+
		"\5B\u02b8\nB\3C\3C\3C\5C\u02bd\nC\3D\3D\3D\3D\3E\3E\3E\5E\u02c6\nE\3F"+
		"\3F\5F\u02ca\nF\3G\6G\u02cd\nG\rG\16G\u02ce\3G\7G\u02d2\nG\fG\16G\u02d5"+
		"\13G\3G\3G\7G\u02d9\nG\fG\16G\u02dc\13G\3G\5G\u02df\nG\3G\2\3bH\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\2\13"+
		"\3\2\5\6\3\2>?\3\2\61\62\4\2@AEE\3\2\669\4\2\65\65FF\3\2<=\3\2FP\3\2)"+
		"\60\2\u030d\2\u008f\3\2\2\2\4\u009a\3\2\2\2\6\u009e\3\2\2\2\b\u00a5\3"+
		"\2\2\2\n\u00bf\3\2\2\2\f\u00c1\3\2\2\2\16\u00ca\3\2\2\2\20\u00d3\3\2\2"+
		"\2\22\u00d5\3\2\2\2\24\u00d8\3\2\2\2\26\u00db\3\2\2\2\30\u00de\3\2\2\2"+
		"\32\u00e6\3\2\2\2\34\u00ef\3\2\2\2\36\u00fa\3\2\2\2 \u0100\3\2\2\2\"\u0105"+
		"\3\2\2\2$\u010b\3\2\2\2&\u0115\3\2\2\2(\u0119\3\2\2\2*\u011e\3\2\2\2,"+
		"\u0126\3\2\2\2.\u0130\3\2\2\2\60\u0139\3\2\2\2\62\u013c\3\2\2\2\64\u0149"+
		"\3\2\2\2\66\u0155\3\2\2\28\u0157\3\2\2\2:\u015b\3\2\2\2<\u0164\3\2\2\2"+
		">\u016e\3\2\2\2@\u017a\3\2\2\2B\u017c\3\2\2\2D\u0184\3\2\2\2F\u0188\3"+
		"\2\2\2H\u0191\3\2\2\2J\u01ac\3\2\2\2L\u01ae\3\2\2\2N\u01b5\3\2\2\2P\u01b9"+
		"\3\2\2\2R\u01c4\3\2\2\2T\u01d3\3\2\2\2V\u01d5\3\2\2\2X\u01d8\3\2\2\2Z"+
		"\u01dc\3\2\2\2\\\u01e2\3\2\2\2^\u01f4\3\2\2\2`\u020c\3\2\2\2b\u022f\3"+
		"\2\2\2d\u0270\3\2\2\2f\u0278\3\2\2\2h\u027b\3\2\2\2j\u0281\3\2\2\2l\u0283"+
		"\3\2\2\2n\u0285\3\2\2\2p\u028b\3\2\2\2r\u0291\3\2\2\2t\u0295\3\2\2\2v"+
		"\u029a\3\2\2\2x\u029c\3\2\2\2z\u02a4\3\2\2\2|\u02a8\3\2\2\2~\u02ad\3\2"+
		"\2\2\u0080\u02b1\3\2\2\2\u0082\u02b5\3\2\2\2\u0084\u02b9\3\2\2\2\u0086"+
		"\u02be\3\2\2\2\u0088\u02c2\3\2\2\2\u008a\u02c7\3\2\2\2\u008c\u02de\3\2"+
		"\2\2\u008e\u0090\5\4\3\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0094\3\2\2\2\u0091\u0093\5\6\4\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\5\b\5\2\u0098\u0099\7\2\2\3\u0099\3\3\2\2\2"+
		"\u009a\u009b\7\3\2\2\u009b\u009c\5x=\2\u009c\u009d\5\u008cG\2\u009d\5"+
		"\3\2\2\2\u009e\u009f\7\4\2\2\u009f\u00a0\5x=\2\u00a0\u00a1\5\u008cG\2"+
		"\u00a1\7\3\2\2\2\u00a2\u00a4\5\n\6\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3"+
		"\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\t\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00c0\5\20\t\2\u00a9\u00c0\5\16\b\2\u00aa\u00ab\5\26\f"+
		"\2\u00ab\u00ac\5\u008cG\2\u00ac\u00c0\3\2\2\2\u00ad\u00c0\5\34\17\2\u00ae"+
		"\u00c0\5\"\22\2\u00af\u00c0\5$\23\2\u00b0\u00c0\5,\27\2\u00b1\u00c0\5"+
		"\62\32\2\u00b2\u00c0\5<\37\2\u00b3\u00c0\5H%\2\u00b4\u00c0\5J&\2\u00b5"+
		"\u00c0\5L\'\2\u00b6\u00c0\5P)\2\u00b7\u00c0\5V,\2\u00b8\u00c0\5X-\2\u00b9"+
		"\u00c0\5Z.\2\u00ba\u00c0\5\\/\2\u00bb\u00c0\5`\61\2\u00bc\u00c0\5\22\n"+
		"\2\u00bd\u00c0\5\24\13\2\u00be\u00c0\5f\64\2\u00bf\u00a8\3\2\2\2\u00bf"+
		"\u00a9\3\2\2\2\u00bf\u00aa\3\2\2\2\u00bf\u00ad\3\2\2\2\u00bf\u00ae\3\2"+
		"\2\2\u00bf\u00af\3\2\2\2\u00bf\u00b0\3\2\2\2\u00bf\u00b1\3\2\2\2\u00bf"+
		"\u00b2\3\2\2\2\u00bf\u00b3\3\2\2\2\u00bf\u00b4\3\2\2\2\u00bf\u00b5\3\2"+
		"\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b8\3\2\2\2\u00bf"+
		"\u00b9\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\13\3\2\2\2\u00c1\u00c5"+
		"\7T\2\2\u00c2\u00c4\5\n\6\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00c9\7U\2\2\u00c9\r\3\2\2\2\u00ca\u00ce\7T\2\2\u00cb\u00cd"+
		"\5\n\6\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7U"+
		"\2\2\u00d2\17\3\2\2\2\u00d3\u00d4\7^\2\2\u00d4\21\3\2\2\2\u00d5\u00d6"+
		"\7\31\2\2\u00d6\u00d7\5\u008cG\2\u00d7\23\3\2\2\2\u00d8\u00d9\7\32\2\2"+
		"\u00d9\u00da\5\u008cG\2\u00da\25\3\2\2\2\u00db\u00dc\t\2\2\2\u00dc\u00dd"+
		"\5\30\r\2\u00dd\27\3\2\2\2\u00de\u00e3\5\32\16\2\u00df\u00e0\7]\2\2\u00e0"+
		"\u00e2\5\32\16\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3"+
		"\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\31\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e9\5v<\2\u00e7\u00e8\7_\2\2\u00e8\u00ea\5\u0080A\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ec\7F\2\2\u00ec"+
		"\u00ee\5b\62\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\33\3\2\2"+
		"\2\u00ef\u00f0\7\33\2\2\u00f0\u00f2\5v<\2\u00f1\u00f3\5\u0086D\2\u00f2"+
		"\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\5\36"+
		"\20\2\u00f5\u00f7\5 \21\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\5\f\7\2\u00f9\35\3\2\2\2\u00fa\u00fc\7R\2\2"+
		"\u00fb\u00fd\5\30\r\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00ff\7S\2\2\u00ff\37\3\2\2\2\u0100\u0103\7_\2\2\u0101"+
		"\u0104\5\u0080A\2\u0102\u0104\7\35\2\2\u0103\u0101\3\2\2\2\u0103\u0102"+
		"\3\2\2\2\u0104!\3\2\2\2\u0105\u0107\7\34\2\2\u0106\u0108\5b\62\2\u0107"+
		"\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\5\u008c"+
		"G\2\u010a#\3\2\2\2\u010b\u010c\7\36\2\2\u010c\u0111\5v<\2\u010d\u010e"+
		"\7\67\2\2\u010e\u010f\5z>\2\u010f\u0110\7\66\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010d\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\5&"+
		"\24\2\u0114%\3\2\2\2\u0115\u0116\7T\2\2\u0116\u0117\5*\26\2\u0117\u0118"+
		"\7U\2\2\u0118\'\3\2\2\2\u0119\u011c\5v<\2\u011a\u011b\7F\2\2\u011b\u011d"+
		"\5b\62\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d)\3\2\2\2\u011e"+
		"\u0123\5(\25\2\u011f\u0120\7]\2\2\u0120\u0122\5(\25\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"+\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\37\2\2\u0127\u0129\5v<\2\u0128"+
		"\u012a\5\u0086D\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c"+
		"\3\2\2\2\u012b\u012d\5\60\31\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012f\5.\30\2\u012f-\3\2\2\2\u0130\u0134\7"+
		"T\2\2\u0131\u0133\5\26\f\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0138\7U\2\2\u0138/\3\2\2\2\u0139\u013a\7!\2\2\u013a\u013b"+
		"\5\u0080A\2\u013b\61\3\2\2\2\u013c\u013d\7 \2\2\u013d\u013f\5v<\2\u013e"+
		"\u0140\5\u0086D\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142"+
		"\3\2\2\2\u0141\u0143\5\60\31\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2"+
		"\u0143\u0145\3\2\2\2\u0144\u0146\5:\36\2\u0145\u0144\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\5\64\33\2\u0148\63\3\2\2\2\u0149"+
		"\u014d\7T\2\2\u014a\u014c\5\66\34\2\u014b\u014a\3\2\2\2\u014c\u014f\3"+
		"\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0151\7U\2\2\u0151\65\3\2\2\2\u0152\u0156\5\26\f"+
		"\2\u0153\u0156\5\34\17\2\u0154\u0156\58\35\2\u0155\u0152\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\67\3\2\2\2\u0157\u0158\7#\2\2"+
		"\u0158\u0159\5\36\20\2\u0159\u015a\5\f\7\2\u015a9\3\2\2\2\u015b\u015c"+
		"\7\'\2\2\u015c\u0161\5\u0080A\2\u015d\u015e\7]\2\2\u015e\u0160\5\u0080"+
		"A\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162;\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7&\2\2\u0165"+
		"\u0167\5v<\2\u0166\u0168\5\u0086D\2\u0167\u0166\3\2\2\2\u0167\u0168\3"+
		"\2\2\2\u0168\u016a\3\2\2\2\u0169\u016b\5\60\31\2\u016a\u0169\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\5> \2\u016d=\3\2\2\2\u016e"+
		"\u0172\7T\2\2\u016f\u0171\5@!\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2"+
		"\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0175\u0176\7U\2\2\u0176?\3\2\2\2\u0177\u017b\5\26\f\2\u0178"+
		"\u017b\5\34\17\2\u0179\u017b\5B\"\2\u017a\u0177\3\2\2\2\u017a\u0178\3"+
		"\2\2\2\u017a\u0179\3\2\2\2\u017bA\3\2\2\2\u017c\u017d\7\33\2\2\u017d\u017f"+
		"\5v<\2\u017e\u0180\5~@\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\5\36\20\2\u0182\u0183\5\u008cG\2\u0183C\3\2"+
		"\2\2\u0184\u0185\7(\2\2\u0185\u0186\5v<\2\u0186\u0187\5F$\2\u0187E\3\2"+
		"\2\2\u0188\u018c\7T\2\2\u0189\u018b\5\26\f\2\u018a\u0189\3\2\2\2\u018b"+
		"\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2"+
		"\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7U\2\2\u0190G\3\2\2\2\u0191\u0192"+
		"\7\n\2\2\u0192\u0193\5b\62\2\u0193\u0194\5\u008cG\2\u0194I\3\2\2\2\u0195"+
		"\u0196\7\13\2\2\u0196\u0197\5\n\6\2\u0197\u0198\7\r\2\2\u0198\u0199\5"+
		"\n\6\2\u0199\u01ad\3\2\2\2\u019a\u019b\7\13\2\2\u019b\u019c\5\n\6\2\u019c"+
		"\u019d\7\f\2\2\u019d\u019e\7R\2\2\u019e\u019f\5\32\16\2\u019f\u01a0\7"+
		"S\2\2\u01a0\u01a1\5\n\6\2\u01a1\u01ad\3\2\2\2\u01a2\u01a3\7\13\2\2\u01a3"+
		"\u01a4\5\n\6\2\u01a4\u01a5\7\f\2\2\u01a5\u01a6\7R\2\2\u01a6\u01a7\5\32"+
		"\16\2\u01a7\u01a8\7S\2\2\u01a8\u01a9\5\n\6\2\u01a9\u01aa\7\r\2\2\u01aa"+
		"\u01ab\5\n\6\2\u01ab\u01ad\3\2\2\2\u01ac\u0195\3\2\2\2\u01ac\u019a\3\2"+
		"\2\2\u01ac\u01a2\3\2\2\2\u01adK\3\2\2\2\u01ae\u01af\7\16\2\2\u01af\u01b0"+
		"\5N(\2\u01b0\u01b3\5\n\6\2\u01b1\u01b2\7\17\2\2\u01b2\u01b4\5\n\6\2\u01b3"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4M\3\2\2\2\u01b5\u01b6\7R\2\2\u01b6"+
		"\u01b7\5b\62\2\u01b7\u01b8\7S\2\2\u01b8O\3\2\2\2\u01b9\u01ba\7\20\2\2"+
		"\u01ba\u01bb\5N(\2\u01bb\u01bd\7T\2\2\u01bc\u01be\5R*\2\u01bd\u01bc\3"+
		"\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\7U\2\2\u01c2Q\3\2\2\2\u01c3\u01c5\5T+\2\u01c4"+
		"\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01ca\5\n\6\2\u01c9\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01ccS\3\2\2\2"+
		"\u01cd\u01ce\7\21\2\2\u01ce\u01cf\5b\62\2\u01cf\u01d0\7_\2\2\u01d0\u01d4"+
		"\3\2\2\2\u01d1\u01d2\7\22\2\2\u01d2\u01d4\7_\2\2\u01d3\u01cd\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d4U\3\2\2\2\u01d5\u01d6\7\23\2\2\u01d6\u01d7\5\n\6\2"+
		"\u01d7W\3\2\2\2\u01d8\u01d9\7\25\2\2\u01d9\u01da\5N(\2\u01da\u01db\5\n"+
		"\6\2\u01dbY\3\2\2\2\u01dc\u01dd\7\24\2\2\u01dd\u01de\5\n\6\2\u01de\u01df"+
		"\7\25\2\2\u01df\u01e0\5N(\2\u01e0\u01e1\5\u008cG\2\u01e1[\3\2\2\2\u01e2"+
		"\u01e3\7\26\2\2\u01e3\u01e5\7R\2\2\u01e4\u01e6\5^\60\2\u01e5\u01e4\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\7^\2\2\u01e8"+
		"\u01ea\5b\62\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01eb\u01ed\7^\2\2\u01ec\u01ee\5d\63\2\u01ed\u01ec\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\7S\2\2\u01f0\u01f1\5\n"+
		"\6\2\u01f1]\3\2\2\2\u01f2\u01f5\5\26\f\2\u01f3\u01f5\5d\63\2\u01f4\u01f2"+
		"\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5_\3\2\2\2\u01f6\u01f7\7\27\2\2\u01f7"+
		"\u01f8\7R\2\2\u01f8\u01f9\5\32\16\2\u01f9\u01fa\7\30\2\2\u01fa\u01fb\5"+
		"b\62\2\u01fb\u01fc\7S\2\2\u01fc\u01fd\5\n\6\2\u01fd\u020d\3\2\2\2\u01fe"+
		"\u01ff\7\27\2\2\u01ff\u0200\7R\2\2\u0200\u0201\7R\2\2\u0201\u0204\5\32"+
		"\16\2\u0202\u0203\7]\2\2\u0203\u0205\5\32\16\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\7S\2\2\u0207\u0208\7\30"+
		"\2\2\u0208\u0209\5b\62\2\u0209\u020a\7S\2\2\u020a\u020b\5\n\6\2\u020b"+
		"\u020d\3\2\2\2\u020c\u01f6\3\2\2\2\u020c\u01fe\3\2\2\2\u020da\3\2\2\2"+
		"\u020e\u020f\b\62\1\2\u020f\u0210\7R\2\2\u0210\u0211\5b\62\2\u0211\u0212"+
		"\7S\2\2\u0212\u0230\3\2\2\2\u0213\u0230\7$\2\2\u0214\u0230\7%\2\2\u0215"+
		"\u0230\5v<\2\u0216\u0218\7\"\2\2\u0217\u0219\5~@\2\u0218\u0217\3\2\2\2"+
		"\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0230\5h\65\2\u021b\u021c"+
		"\t\3\2\2\u021c\u0230\5b\62\24\u021d\u021e\t\4\2\2\u021e\u0230\5b\62\23"+
		"\u021f\u0220\5x=\2\u0220\u0221\5j\66\2\u0221\u0222\5b\62\7\u0222\u0230"+
		"\3\2\2\2\u0223\u0226\5v<\2\u0224\u0226\5\36\20\2\u0225\u0223\3\2\2\2\u0225"+
		"\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022a\7Q\2\2\u0228\u022b\5b\62"+
		"\2\u0229\u022b\5\f\7\2\u022a\u0228\3\2\2\2\u022a\u0229\3\2\2\2\u022b\u0230"+
		"\3\2\2\2\u022c\u0230\5l\67\2\u022d\u0230\5n8\2\u022e\u0230\5p9\2\u022f"+
		"\u020e\3\2\2\2\u022f\u0213\3\2\2\2\u022f\u0214\3\2\2\2\u022f\u0215\3\2"+
		"\2\2\u022f\u0216\3\2\2\2\u022f\u021b\3\2\2\2\u022f\u021d\3\2\2\2\u022f"+
		"\u021f\3\2\2\2\u022f\u0225\3\2\2\2\u022f\u022c\3\2\2\2\u022f\u022d\3\2"+
		"\2\2\u022f\u022e\3\2\2\2\u0230\u026d\3\2\2\2\u0231\u0232\f\22\2\2\u0232"+
		"\u0233\t\5\2\2\u0233\u026c\5b\62\23\u0234\u0235\f\21\2\2\u0235\u0236\t"+
		"\3\2\2\u0236\u026c\5b\62\22\u0237\u023c\f\20\2\2\u0238\u0239\7\67\2\2"+
		"\u0239\u023d\7\67\2\2\u023a\u023b\7\66\2\2\u023b\u023d\7\66\2\2\u023c"+
		"\u0238\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u026c\5b"+
		"\62\21\u023f\u0240\f\17\2\2\u0240\u0241\t\6\2\2\u0241\u026c\5b\62\20\u0242"+
		"\u0243\f\16\2\2\u0243\u0244\t\7\2\2\u0244\u026c\5b\62\17\u0245\u0246\f"+
		"\r\2\2\u0246\u0247\7B\2\2\u0247\u026c\5b\62\16\u0248\u0249\f\f\2\2\u0249"+
		"\u024a\7D\2\2\u024a\u026c\5b\62\r\u024b\u024c\f\13\2\2\u024c\u024d\7C"+
		"\2\2\u024d\u026c\5b\62\f\u024e\u024f\f\n\2\2\u024f\u0250\7:\2\2\u0250"+
		"\u026c\5b\62\13\u0251\u0252\f\t\2\2\u0252\u0253\7;\2\2\u0253\u026c\5b"+
		"\62\n\u0254\u0255\f\b\2\2\u0255\u0256\7\63\2\2\u0256\u0257\5b\62\2\u0257"+
		"\u0258\7_\2\2\u0258\u0259\5b\62\b\u0259\u026c\3\2\2\2\u025a\u025b\f\31"+
		"\2\2\u025b\u0260\7\\\2\2\u025c\u0261\5v<\2\u025d\u025e\5b\62\2\u025e\u025f"+
		"\5h\65\2\u025f\u0261\3\2\2\2\u0260\u025c\3\2\2\2\u0260\u025d\3\2\2\2\u0261"+
		"\u026c\3\2\2\2\u0262\u0263\f\30\2\2\u0263\u0264\7V\2\2\u0264\u0265\5b"+
		"\62\2\u0265\u0266\7W\2\2\u0266\u026c\3\2\2\2\u0267\u0268\f\27\2\2\u0268"+
		"\u026c\5h\65\2\u0269\u026a\f\25\2\2\u026a\u026c\t\b\2\2\u026b\u0231\3"+
		"\2\2\2\u026b\u0234\3\2\2\2\u026b\u0237\3\2\2\2\u026b\u023f\3\2\2\2\u026b"+
		"\u0242\3\2\2\2\u026b\u0245\3\2\2\2\u026b\u0248\3\2\2\2\u026b\u024b\3\2"+
		"\2\2\u026b\u024e\3\2\2\2\u026b\u0251\3\2\2\2\u026b\u0254\3\2\2\2\u026b"+
		"\u025a\3\2\2\2\u026b\u0262\3\2\2\2\u026b\u0267\3\2\2\2\u026b\u0269\3\2"+
		"\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"c\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0275\5b\62\2\u0271\u0272\7]\2\2\u0272"+
		"\u0274\5b\62\2\u0273\u0271\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2"+
		"\2\2\u0275\u0276\3\2\2\2\u0276e\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u0279"+
		"\5b\62\2\u0279\u027a\5\u008cG\2\u027ag\3\2\2\2\u027b\u027d\7R\2\2\u027c"+
		"\u027e\5d\63\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2"+
		"\2\2\u027f\u0280\7S\2\2\u0280i\3\2\2\2\u0281\u0282\t\t\2\2\u0282k\3\2"+
		"\2\2\u0283\u0284\t\n\2\2\u0284m\3\2\2\2\u0285\u0287\7V\2\2\u0286\u0288"+
		"\5d\63\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028a\7W\2\2\u028ao\3\2\2\2\u028b\u028d\7T\2\2\u028c\u028e\5t;\2\u028d"+
		"\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\7U"+
		"\2\2\u0290q\3\2\2\2\u0291\u0292\5v<\2\u0292\u0293\7_\2\2\u0293\u0294\5"+
		"b\62\2\u0294s\3\2\2\2\u0295\u0298\5r:\2\u0296\u0297\7]\2\2\u0297\u0299"+
		"\5r:\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299u\3\2\2\2\u029a\u029b"+
		"\7b\2\2\u029bw\3\2\2\2\u029c\u02a1\5v<\2\u029d\u029e\7\\\2\2\u029e\u02a0"+
		"\5v<\2\u029f\u029d\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2y\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a6\5x=\2\u02a5"+
		"\u02a7\5~@\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7{\3\2\2\2\u02a8"+
		"\u02ab\5z>\2\u02a9\u02aa\7]\2\2\u02aa\u02ac\5z>\2\u02ab\u02a9\3\2\2\2"+
		"\u02ab\u02ac\3\2\2\2\u02ac}\3\2\2\2\u02ad\u02ae\7\67\2\2\u02ae\u02af\5"+
		"|?\2\u02af\u02b0\7\66\2\2\u02b0\177\3\2\2\2\u02b1\u02b3\5x=\2\u02b2\u02b4"+
		"\5~@\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u0081\3\2\2\2\u02b5"+
		"\u02b7\5v<\2\u02b6\u02b8\5\u0088E\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3"+
		"\2\2\2\u02b8\u0083\3\2\2\2\u02b9\u02bc\5\u0082B\2\u02ba\u02bb\7]\2\2\u02bb"+
		"\u02bd\5\u0082B\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u0085"+
		"\3\2\2\2\u02be\u02bf\7\67\2\2\u02bf\u02c0\5\u0084C\2\u02c0\u02c1\7\66"+
		"\2\2\u02c1\u0087\3\2\2\2\u02c2\u02c5\7!\2\2\u02c3\u02c6\5v<\2\u02c4\u02c6"+
		"\5\u008aF\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3\2\2\2\u02c6\u0089\3\2\2"+
		"\2\u02c7\u02c9\5x=\2\u02c8\u02ca\5~@\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca"+
		"\3\2\2\2\u02ca\u008b\3\2\2\2\u02cb\u02cd\7Y\2\2\u02cc\u02cb\3\2\2\2\u02cd"+
		"\u02ce\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02df\3\2"+
		"\2\2\u02d0\u02d2\7Y\2\2\u02d1\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3"+
		"\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d3\3\2"+
		"\2\2\u02d6\u02da\7^\2\2\u02d7\u02d9\7Y\2\2\u02d8\u02d7\3\2\2\2\u02d9\u02dc"+
		"\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02df\3\2\2\2\u02dc"+
		"\u02da\3\2\2\2\u02dd\u02df\7\2\2\3\u02de\u02cc\3\2\2\2\u02de\u02d3\3\2"+
		"\2\2\u02de\u02dd\3\2\2\2\u02df\u008d\3\2\2\2G\u008f\u0094\u00a5\u00bf"+
		"\u00c5\u00ce\u00e3\u00e9\u00ed\u00f2\u00f6\u00fc\u0103\u0107\u0111\u011c"+
		"\u0123\u0129\u012c\u0134\u013f\u0142\u0145\u014d\u0155\u0161\u0167\u016a"+
		"\u0172\u017a\u017f\u018c\u01ac\u01b3\u01bf\u01c6\u01cb\u01d3\u01e5\u01e9"+
		"\u01ed\u01f4\u0204\u020c\u0218\u0225\u022a\u022f\u023c\u0260\u026b\u026d"+
		"\u0275\u027d\u0287\u028d\u0298\u02a1\u02a6\u02ab\u02b3\u02b7\u02bc\u02c5"+
		"\u02c9\u02ce\u02d3\u02da\u02de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}