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
		REMAINDER=67, LEFT_SHIFT=68, RIGHT_SHIFT=69, ASSIGNMENT=70, ADDITION_ASSIGNMENT=71, 
		SUBTRACTION_ASSIGNMENT=72, MULTIPLICATION_ASSIGNMENT=73, DIVISION_ASSIGNMENT=74, 
		AND_ASSIGNMENT=75, OR_ASSIGNMENT=76, EXCLUSIVE_OR_ASSIGNMENT=77, REMAINDER_ASSIGNMENT=78, 
		LEFT_SHIFT_ASSIGNMENT=79, RIGHT_SHIFT_ASSIGNMENT=80, ARROW=81, LEFT_PAREN=82, 
		RIGHT_PAREN=83, LEFT_BRACE=84, RIGHT_BRACE=85, LEFT_BRACK=86, RIGHT_BRACK=87, 
		WS=88, COMMENT=89, LINE_COMMENT=90, DOT=91, COMMA=92, SEMI=93, COLON=94, 
		AT=95, ELLIPSIS=96, LF=97, CR=98, IDENTIFIER=99;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_statement = 3, RULE_block = 4, RULE_emptyStatement = 5, RULE_continueStatement = 6, 
		RULE_breakStatement = 7, RULE_variateDeclaration = 8, RULE_variateDeclaratorList = 9, 
		RULE_variateDeclarator = 10, RULE_functionDeclaration = 11, RULE_functionParameters = 12, 
		RULE_returnStatement = 13, RULE_enumDeclaration = 14, RULE_enumBody = 15, 
		RULE_enumFieldDeclarator = 16, RULE_enumFieldDeclaratorList = 17, RULE_structDeclaration = 18, 
		RULE_structBody = 19, RULE_extendsSnippet = 20, RULE_classDeclaration = 21, 
		RULE_classBody = 22, RULE_classMemberDeclaration = 23, RULE_constructorDeclaration = 24, 
		RULE_implementsSnippet = 25, RULE_interfaceDeclaration = 26, RULE_interfaceBody = 27, 
		RULE_interfaceMemberDeclaration = 28, RULE_abstractFunctionDeclaration = 29, 
		RULE_annotationDeclaration = 30, RULE_annotationBody = 31, RULE_throwStatement = 32, 
		RULE_tryStatement = 33, RULE_ifStatement = 34, RULE_condition = 35, RULE_switchStatement = 36, 
		RULE_switchCaseStatement = 37, RULE_switchCaseLabel = 38, RULE_loopStatement = 39, 
		RULE_whileStatement = 40, RULE_doWhileStatement = 41, RULE_forStatement = 42, 
		RULE_forInit = 43, RULE_foreachStatement = 44, RULE_expression = 45, RULE_expressionList = 46, 
		RULE_expressionStatement = 47, RULE_params = 48, RULE_assignOperator = 49, 
		RULE_literal = 50, RULE_arrayLiteral = 51, RULE_objectLiteral = 52, RULE_objectProperty = 53, 
		RULE_objectPropertyList = 54, RULE_qualifiedName = 55, RULE_genericsParameter = 56, 
		RULE_genericsParameterList = 57, RULE_genericsParameters = 58, RULE_classType = 59, 
		RULE_abstractGenericsParameter = 60, RULE_abstractGenericsParameterList = 61, 
		RULE_abstractGenericsParameters = 62, RULE_eos = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "statement", 
			"block", "emptyStatement", "continueStatement", "breakStatement", "variateDeclaration", 
			"variateDeclaratorList", "variateDeclarator", "functionDeclaration", 
			"functionParameters", "returnStatement", "enumDeclaration", "enumBody", 
			"enumFieldDeclarator", "enumFieldDeclaratorList", "structDeclaration", 
			"structBody", "extendsSnippet", "classDeclaration", "classBody", "classMemberDeclaration", 
			"constructorDeclaration", "implementsSnippet", "interfaceDeclaration", 
			"interfaceBody", "interfaceMemberDeclaration", "abstractFunctionDeclaration", 
			"annotationDeclaration", "annotationBody", "throwStatement", "tryStatement", 
			"ifStatement", "condition", "switchStatement", "switchCaseStatement", 
			"switchCaseLabel", "loopStatement", "whileStatement", "doWhileStatement", 
			"forStatement", "forInit", "foreachStatement", "expression", "expressionList", 
			"expressionStatement", "params", "assignOperator", "literal", "arrayLiteral", 
			"objectLiteral", "objectProperty", "objectPropertyList", "qualifiedName", 
			"genericsParameter", "genericsParameterList", "genericsParameters", "classType", 
			"abstractGenericsParameter", "abstractGenericsParameterList", "abstractGenericsParameters", 
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
			"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'<<'", "'>>'", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
			"'<<='", "'>>='", "'=>'", "'('", "')'", "'{'", "'}'", "'['", "']'", null, 
			null, null, "'.'", "','", "';'", "':'", "'@'", "'...'", "'\n'", "'\r'"
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
			"EXCLUSIVE_OR", "REMAINDER", "LEFT_SHIFT", "RIGHT_SHIFT", "ASSIGNMENT", 
			"ADDITION_ASSIGNMENT", "SUBTRACTION_ASSIGNMENT", "MULTIPLICATION_ASSIGNMENT", 
			"DIVISION_ASSIGNMENT", "AND_ASSIGNMENT", "OR_ASSIGNMENT", "EXCLUSIVE_OR_ASSIGNMENT", 
			"REMAINDER_ASSIGNMENT", "LEFT_SHIFT_ASSIGNMENT", "RIGHT_SHIFT_ASSIGNMENT", 
			"ARROW", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACK", 
			"RIGHT_BRACK", "WS", "COMMENT", "LINE_COMMENT", "DOT", "COMMA", "SEMI", 
			"COLON", "AT", "ELLIPSIS", "LF", "CR", "IDENTIFIER"
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
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(128);
				packageDeclaration();
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(131);
				importDeclaration();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << LOOP) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LEFT_PAREN - 82)) | (1L << (LEFT_BRACE - 82)) | (1L << (LEFT_BRACK - 82)) | (1L << (SEMI - 82)) | (1L << (IDENTIFIER - 82)))) != 0)) {
				{
				{
				setState(137);
				statement();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
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
			setState(145);
			match(PACKAGE);
			setState(146);
			qualifiedName();
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(DaiParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
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
			setState(149);
			match(IMPORT);
			setState(150);
			qualifiedName();
			setState(151);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				emptyStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				variateDeclaration();
				setState(156);
				eos();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				enumDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				structDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(163);
				interfaceDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(164);
				throwStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(165);
				tryStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(166);
				ifStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(167);
				switchStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(168);
				loopStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(169);
				whileStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(170);
				doWhileStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(171);
				forStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(172);
				foreachStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(173);
				continueStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(174);
				breakStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(175);
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
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(LEFT_BRACE);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << LOOP) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LEFT_PAREN - 82)) | (1L << (LEFT_BRACE - 82)) | (1L << (LEFT_BRACK - 82)) | (1L << (SEMI - 82)) | (1L << (IDENTIFIER - 82)))) != 0)) {
				{
				{
				setState(179);
				statement();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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
		enterRule(_localctx, 10, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
		enterRule(_localctx, 12, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(CONTINUE);
			setState(190);
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
		enterRule(_localctx, 14, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(BREAK);
			setState(193);
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
		enterRule(_localctx, 16, RULE_variateDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(196);
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
		enterRule(_localctx, 18, RULE_variateDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			variateDeclarator();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(199);
				match(COMMA);
				setState(200);
				variateDeclarator();
				}
				}
				setState(205);
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 20, RULE_variateDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(IDENTIFIER);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(207);
				match(COLON);
				setState(208);
				classType();
				}
			}

			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(211);
				match(ASSIGNMENT);
				setState(212);
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AbstractGenericsParametersContext abstractGenericsParameters() {
			return getRuleContext(AbstractGenericsParametersContext.class,0);
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
		enterRule(_localctx, 22, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(FUNC);
			setState(216);
			match(IDENTIFIER);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(217);
				abstractGenericsParameters();
				}
			}

			setState(220);
			functionParameters();
			setState(221);
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
		enterRule(_localctx, 24, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(LEFT_PAREN);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(224);
				variateDeclaratorList();
				}
			}

			setState(227);
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
		enterRule(_localctx, 26, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(RETURN);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LEFT_PAREN - 82)) | (1L << (LEFT_BRACE - 82)) | (1L << (LEFT_BRACK - 82)) | (1L << (IDENTIFIER - 82)))) != 0)) {
				{
				setState(230);
				expression(0);
				}
			}

			setState(233);
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 28, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ENUM);
			setState(236);
			match(IDENTIFIER);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(237);
				match(LESS_THAN);
				setState(238);
				genericsParameter();
				setState(239);
				match(GREATER_THAN);
				}
			}

			setState(243);
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
		enterRule(_localctx, 30, RULE_enumBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(LEFT_BRACE);
			setState(246);
			enumFieldDeclaratorList();
			setState(247);
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 32, RULE_enumFieldDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IDENTIFIER);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(250);
				match(ASSIGNMENT);
				setState(251);
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
		enterRule(_localctx, 34, RULE_enumFieldDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			enumFieldDeclarator();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255);
				match(COMMA);
				setState(256);
				enumFieldDeclarator();
				}
				}
				setState(261);
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public AbstractGenericsParametersContext abstractGenericsParameters() {
			return getRuleContext(AbstractGenericsParametersContext.class,0);
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
		enterRule(_localctx, 36, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(STRUCT);
			setState(263);
			match(IDENTIFIER);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(264);
				abstractGenericsParameters();
				}
			}

			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(267);
				extendsSnippet();
				}
			}

			setState(270);
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
		enterRule(_localctx, 38, RULE_structBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LEFT_BRACE);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==CONST) {
				{
				{
				setState(273);
				variateDeclaration();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
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
		enterRule(_localctx, 40, RULE_extendsSnippet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(281);
			match(EXTENDS);
			setState(282);
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AbstractGenericsParametersContext abstractGenericsParameters() {
			return getRuleContext(AbstractGenericsParametersContext.class,0);
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
		enterRule(_localctx, 42, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(CLASS);
			setState(285);
			match(IDENTIFIER);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(286);
				abstractGenericsParameters();
				}
			}

			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(289);
				extendsSnippet();
				}
			}

			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(292);
				implementsSnippet();
				}
			}

			setState(295);
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
		enterRule(_localctx, 44, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(LEFT_BRACE);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << FUNC) | (1L << CONSTRUCTOR))) != 0)) {
				{
				{
				setState(298);
				classMemberDeclaration();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
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
		enterRule(_localctx, 46, RULE_classMemberDeclaration);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				variateDeclaration();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				functionDeclaration();
				}
				break;
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
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
		enterRule(_localctx, 48, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(CONSTRUCTOR);
			setState(312);
			functionParameters();
			setState(313);
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
		enterRule(_localctx, 50, RULE_implementsSnippet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(IMPLEMENTS);
			setState(316);
			classType();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(317);
				match(COMMA);
				setState(318);
				classType();
				}
				}
				setState(323);
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public AbstractGenericsParametersContext abstractGenericsParameters() {
			return getRuleContext(AbstractGenericsParametersContext.class,0);
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
		enterRule(_localctx, 52, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(INTERFACE);
			setState(325);
			match(IDENTIFIER);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(326);
				abstractGenericsParameters();
				}
			}

			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(329);
				extendsSnippet();
				}
			}

			setState(332);
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
		enterRule(_localctx, 54, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(LEFT_BRACE);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << FUNC))) != 0)) {
				{
				{
				setState(335);
				interfaceMemberDeclaration();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
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
		enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				variateDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 58, RULE_abstractFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(FUNC);
			setState(349);
			match(IDENTIFIER);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(350);
				genericsParameters();
				}
			}

			setState(353);
			functionParameters();
			setState(354);
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 60, RULE_annotationDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(ANNOTATION);
			setState(357);
			match(IDENTIFIER);
			setState(358);
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
		enterRule(_localctx, 62, RULE_annotationBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(LEFT_BRACE);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==CONST) {
				{
				{
				setState(361);
				variateDeclaration();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 64, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(THROW);
			setState(370);
			expression(0);
			setState(371);
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
		enterRule(_localctx, 66, RULE_tryStatement);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(TRY);
				setState(374);
				statement();
				setState(375);
				match(FINALLY);
				setState(376);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(TRY);
				setState(379);
				statement();
				setState(380);
				match(CATCH);
				setState(381);
				match(LEFT_PAREN);
				setState(382);
				variateDeclarator();
				setState(383);
				match(RIGHT_PAREN);
				setState(384);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(TRY);
				setState(387);
				statement();
				setState(388);
				match(CATCH);
				setState(389);
				match(LEFT_PAREN);
				setState(390);
				variateDeclarator();
				setState(391);
				match(RIGHT_PAREN);
				setState(392);
				statement();
				setState(393);
				match(FINALLY);
				setState(394);
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
		enterRule(_localctx, 68, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(IF);
			setState(399);
			condition();
			setState(400);
			statement();
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(401);
				match(ELSE);
				setState(402);
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
		enterRule(_localctx, 70, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(LEFT_PAREN);
			setState(406);
			expression(0);
			setState(407);
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
		enterRule(_localctx, 72, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(SWITCH);
			setState(410);
			condition();
			setState(411);
			match(LEFT_BRACE);
			setState(413); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(412);
				switchCaseStatement();
				}
				}
				setState(415); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(417);
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
		enterRule(_localctx, 74, RULE_switchCaseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(419);
				switchCaseLabel();
				}
				}
				setState(422); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(425); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(424);
				statement();
				}
				}
				setState(427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << THROW) | (1L << TRY) | (1L << IF) | (1L << SWITCH) | (1L << LOOP) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << FOREACH) | (1L << CONTINUE) | (1L << BREAK) | (1L << FUNC) | (1L << RETURN) | (1L << ENUM) | (1L << STRUCT) | (1L << CLASS) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTERFACE) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LEFT_PAREN - 82)) | (1L << (LEFT_BRACE - 82)) | (1L << (LEFT_BRACK - 82)) | (1L << (SEMI - 82)) | (1L << (IDENTIFIER - 82)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_switchCaseLabel);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(CASE);
				setState(430);
				expression(0);
				setState(431);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(DEFAULT);
				setState(434);
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
		enterRule(_localctx, 78, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(LOOP);
			setState(438);
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
		enterRule(_localctx, 80, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(WHILE);
			setState(441);
			condition();
			setState(442);
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
		enterRule(_localctx, 82, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(DO);
			setState(445);
			statement();
			setState(446);
			match(WHILE);
			setState(447);
			condition();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(FOR);
			setState(450);
			match(LEFT_PAREN);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LEFT_PAREN - 82)) | (1L << (LEFT_BRACE - 82)) | (1L << (LEFT_BRACK - 82)) | (1L << (IDENTIFIER - 82)))) != 0)) {
				{
				setState(451);
				forInit();
				}
			}

			setState(454);
			match(SEMI);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LEFT_PAREN - 82)) | (1L << (LEFT_BRACE - 82)) | (1L << (LEFT_BRACK - 82)) | (1L << (IDENTIFIER - 82)))) != 0)) {
				{
				setState(455);
				expression(0);
				}
			}

			setState(458);
			match(SEMI);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LEFT_PAREN - 82)) | (1L << (LEFT_BRACE - 82)) | (1L << (LEFT_BRACK - 82)) | (1L << (IDENTIFIER - 82)))) != 0)) {
				{
				setState(459);
				expressionList();
				}
			}

			setState(462);
			match(RIGHT_PAREN);
			setState(463);
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
		enterRule(_localctx, 86, RULE_forInit);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
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
				setState(466);
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
		enterRule(_localctx, 88, RULE_foreachStatement);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(FOREACH);
				setState(470);
				match(LEFT_PAREN);
				setState(471);
				variateDeclarator();
				setState(472);
				match(IN);
				setState(473);
				expression(0);
				setState(474);
				match(RIGHT_PAREN);
				setState(475);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				match(FOREACH);
				setState(478);
				match(LEFT_PAREN);
				setState(479);
				match(LEFT_PAREN);
				setState(480);
				variateDeclarator();
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(481);
					match(COMMA);
					setState(482);
					variateDeclarator();
					}
				}

				setState(485);
				match(RIGHT_PAREN);
				setState(486);
				match(IN);
				setState(487);
				expression(0);
				setState(488);
				match(RIGHT_PAREN);
				setState(489);
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
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
		public TerminalNode LEFT_SHIFT() { return getToken(DaiParser.LEFT_SHIFT, 0); }
		public TerminalNode RIGHT_SHIFT() { return getToken(DaiParser.RIGHT_SHIFT, 0); }
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(494);
				match(LEFT_PAREN);
				setState(495);
				expression(0);
				setState(496);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(498);
				match(THIS);
				}
				break;
			case 3:
				{
				_localctx = new SuperExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499);
				match(SUPER);
				}
				break;
			case 4:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(500);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(501);
				match(NEW);
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_THAN) {
					{
					setState(502);
					genericsParameters();
					}
				}

				setState(505);
				params();
				}
				break;
			case 6:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(506);
				_la = _input.LA(1);
				if ( !(_la==ADDITION || _la==SUBTRACTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(507);
				expression(18);
				}
				break;
			case 7:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(508);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(509);
				expression(17);
				}
				break;
			case 8:
				{
				_localctx = new AssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(510);
				qualifiedName();
				setState(511);
				assignOperator();
				setState(512);
				expression(5);
				}
				break;
			case 9:
				{
				_localctx = new LambdaExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(516);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(514);
					match(IDENTIFIER);
					}
					break;
				case LEFT_PAREN:
					{
					setState(515);
					functionParameters();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(518);
				match(ARROW);
				setState(521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(519);
					expression(0);
					}
					break;
				case 2:
					{
					setState(520);
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
				setState(523);
				literal();
				}
				break;
			case 11:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(524);
				arrayLiteral();
				}
				break;
			case 12:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(525);
				objectLiteral();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(581);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(528);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(529);
						_la = _input.LA(1);
						if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (MULTIPLICATION - 62)) | (1L << (DIVISION - 62)) | (1L << (REMAINDER - 62)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(530);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(531);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(532);
						_la = _input.LA(1);
						if ( !(_la==ADDITION || _la==SUBTRACTION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(533);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(534);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(535);
						_la = _input.LA(1);
						if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(536);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(537);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(538);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_THAN) | (1L << LESS_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN_OR_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(539);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new EqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(540);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(541);
						_la = _input.LA(1);
						if ( !(_la==INEQUALITY || _la==ASSIGNMENT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(542);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new BitwiseAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(543);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(544);
						match(BITWISE_AND);
						setState(545);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExclusiveOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(546);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(547);
						match(EXCLUSIVE_OR);
						setState(548);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(549);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(550);
						match(BITWISE_OR);
						setState(551);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(552);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(553);
						match(AND);
						setState(554);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(555);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(556);
						match(OR);
						setState(557);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(558);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(559);
						match(QUESTION);
						setState(560);
						expression(0);
						setState(561);
						match(COLON);
						setState(562);
						expression(6);
						}
						break;
					case 12:
						{
						_localctx = new ChainExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(564);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(565);
						match(DOT);
						setState(570);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
						case 1:
							{
							setState(566);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(567);
							expression(0);
							setState(568);
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
						setState(572);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(573);
						match(LEFT_BRACK);
						setState(574);
						expression(0);
						setState(575);
						match(RIGHT_BRACK);
						}
						break;
					case 14:
						{
						_localctx = new CallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(577);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(578);
						params();
						}
						break;
					case 15:
						{
						_localctx = new IncrementalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(579);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(580);
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
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 92, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			expression(0);
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(587);
				match(COMMA);
				setState(588);
				expression(0);
				}
				}
				setState(593);
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
		enterRule(_localctx, 94, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			expression(0);
			setState(595);
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
		enterRule(_localctx, 96, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(LEFT_PAREN);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LEFT_PAREN - 82)) | (1L << (LEFT_BRACE - 82)) | (1L << (LEFT_BRACK - 82)) | (1L << (IDENTIFIER - 82)))) != 0)) {
				{
				setState(598);
				expressionList();
				}
			}

			setState(601);
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
		enterRule(_localctx, 98, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ASSIGNMENT - 70)) | (1L << (ADDITION_ASSIGNMENT - 70)) | (1L << (SUBTRACTION_ASSIGNMENT - 70)) | (1L << (MULTIPLICATION_ASSIGNMENT - 70)) | (1L << (DIVISION_ASSIGNMENT - 70)) | (1L << (AND_ASSIGNMENT - 70)) | (1L << (OR_ASSIGNMENT - 70)) | (1L << (EXCLUSIVE_OR_ASSIGNMENT - 70)) | (1L << (REMAINDER_ASSIGNMENT - 70)) | (1L << (LEFT_SHIFT_ASSIGNMENT - 70)) | (1L << (RIGHT_SHIFT_ASSIGNMENT - 70)))) != 0)) ) {
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
		enterRule(_localctx, 100, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
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
		enterRule(_localctx, 102, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(LEFT_BRACK);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << SUPER) | (1L << INTEGER_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL) | (1L << NOT) | (1L << TILDE) | (1L << ADDITION) | (1L << SUBTRACTION))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LEFT_PAREN - 82)) | (1L << (LEFT_BRACE - 82)) | (1L << (LEFT_BRACK - 82)) | (1L << (IDENTIFIER - 82)))) != 0)) {
				{
				setState(608);
				expressionList();
				}
			}

			setState(611);
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
		enterRule(_localctx, 104, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(LEFT_BRACE);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(614);
				objectPropertyList();
				}
			}

			setState(617);
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 106, RULE_objectProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(IDENTIFIER);
			setState(620);
			match(COLON);
			setState(621);
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
		enterRule(_localctx, 108, RULE_objectPropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			objectProperty();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(624);
				match(COMMA);
				setState(625);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DaiParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DaiParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(DaiParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DaiParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(IDENTIFIER);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(629);
				match(DOT);
				setState(630);
				match(IDENTIFIER);
				}
				}
				setState(635);
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
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
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
		enterRule(_localctx, 112, RULE_genericsParameter);
		try {
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				qualifiedName();
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
		enterRule(_localctx, 114, RULE_genericsParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			genericsParameter();
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(641);
				match(COMMA);
				setState(642);
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
		enterRule(_localctx, 116, RULE_genericsParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(LESS_THAN);
			setState(646);
			genericsParameterList();
			setState(647);
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
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
		enterRule(_localctx, 118, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			qualifiedName();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(650);
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

	public static class AbstractGenericsParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DaiParser.IDENTIFIER, 0); }
		public TerminalNode EXTENDS() { return getToken(DaiParser.EXTENDS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AbstractGenericsParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractGenericsParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAbstractGenericsParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractGenericsParameterContext abstractGenericsParameter() throws RecognitionException {
		AbstractGenericsParameterContext _localctx = new AbstractGenericsParameterContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_abstractGenericsParameter);
		int _la;
		try {
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				match(IDENTIFIER);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(654);
					match(EXTENDS);
					setState(655);
					qualifiedName();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				qualifiedName();
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

	public static class AbstractGenericsParameterListContext extends ParserRuleContext {
		public List<AbstractGenericsParameterContext> abstractGenericsParameter() {
			return getRuleContexts(AbstractGenericsParameterContext.class);
		}
		public AbstractGenericsParameterContext abstractGenericsParameter(int i) {
			return getRuleContext(AbstractGenericsParameterContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DaiParser.COMMA, 0); }
		public AbstractGenericsParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractGenericsParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAbstractGenericsParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractGenericsParameterListContext abstractGenericsParameterList() throws RecognitionException {
		AbstractGenericsParameterListContext _localctx = new AbstractGenericsParameterListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_abstractGenericsParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			abstractGenericsParameter();
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(662);
				match(COMMA);
				setState(663);
				abstractGenericsParameter();
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

	public static class AbstractGenericsParametersContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(DaiParser.LESS_THAN, 0); }
		public AbstractGenericsParameterListContext abstractGenericsParameterList() {
			return getRuleContext(AbstractGenericsParameterListContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(DaiParser.GREATER_THAN, 0); }
		public AbstractGenericsParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractGenericsParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaiParserVisitor ) return ((DaiParserVisitor<? extends T>)visitor).visitAbstractGenericsParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractGenericsParametersContext abstractGenericsParameters() throws RecognitionException {
		AbstractGenericsParametersContext _localctx = new AbstractGenericsParametersContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_abstractGenericsParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(LESS_THAN);
			setState(667);
			abstractGenericsParameterList();
			setState(668);
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
		public TerminalNode SEMI() { return getToken(DaiParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(DaiParser.EOF, 0); }
		public TerminalNode LF() { return getToken(DaiParser.LF, 0); }
		public TerminalNode CR() { return getToken(DaiParser.CR, 0); }
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
		enterRule(_localctx, 126, RULE_eos);
		int _la;
		try {
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				match(SEMI);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				match(EOF);
				}
				break;
			case LF:
				enterOuterAlt(_localctx, 3);
				{
				setState(672);
				match(LF);
				}
				break;
			case CR:
				enterOuterAlt(_localctx, 4);
				{
				setState(673);
				match(CR);
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LF) {
					{
					setState(674);
					match(LF);
					}
				}

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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 45:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3e\u02aa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\5\2\u0084\n\2\3\2\7\2\u0087\n\2\f\2\16\2"+
		"\u008a\13\2\3\2\7\2\u008d\n\2\f\2\16\2\u0090\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b3\n\5\3\6\3\6\7\6\u00b7"+
		"\n\6\f\6\16\6\u00ba\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\7\13\u00cc\n\13\f\13\16\13\u00cf\13\13\3\f\3\f\3"+
		"\f\5\f\u00d4\n\f\3\f\3\f\5\f\u00d8\n\f\3\r\3\r\3\r\5\r\u00dd\n\r\3\r\3"+
		"\r\3\r\3\16\3\16\5\16\u00e4\n\16\3\16\3\16\3\17\3\17\5\17\u00ea\n\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f4\n\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00ff\n\22\3\23\3\23\3\23\7\23\u0104"+
		"\n\23\f\23\16\23\u0107\13\23\3\24\3\24\3\24\5\24\u010c\n\24\3\24\5\24"+
		"\u010f\n\24\3\24\3\24\3\25\3\25\7\25\u0115\n\25\f\25\16\25\u0118\13\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0122\n\27\3\27\5\27\u0125"+
		"\n\27\3\27\5\27\u0128\n\27\3\27\3\27\3\30\3\30\7\30\u012e\n\30\f\30\16"+
		"\30\u0131\13\30\3\30\3\30\3\31\3\31\3\31\5\31\u0138\n\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\7\33\u0142\n\33\f\33\16\33\u0145\13\33\3\34"+
		"\3\34\3\34\5\34\u014a\n\34\3\34\5\34\u014d\n\34\3\34\3\34\3\35\3\35\7"+
		"\35\u0153\n\35\f\35\16\35\u0156\13\35\3\35\3\35\3\36\3\36\3\36\5\36\u015d"+
		"\n\36\3\37\3\37\3\37\5\37\u0162\n\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!"+
		"\7!\u016d\n!\f!\16!\u0170\13!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u018f\n#\3$\3$"+
		"\3$\3$\3$\5$\u0196\n$\3%\3%\3%\3%\3&\3&\3&\3&\6&\u01a0\n&\r&\16&\u01a1"+
		"\3&\3&\3\'\6\'\u01a7\n\'\r\'\16\'\u01a8\3\'\6\'\u01ac\n\'\r\'\16\'\u01ad"+
		"\3(\3(\3(\3(\3(\3(\5(\u01b6\n(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,"+
		"\3,\3,\5,\u01c7\n,\3,\3,\5,\u01cb\n,\3,\3,\5,\u01cf\n,\3,\3,\3,\3-\3-"+
		"\5-\u01d6\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01e6\n.\3."+
		"\3.\3.\3.\3.\3.\5.\u01ee\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01fa\n/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0207\n/\3/\3/\3/\5/\u020c\n/\3/"+
		"\3/\3/\5/\u0211\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\5/\u023d\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0248\n/\f/\16/\u024b"+
		"\13/\3\60\3\60\3\60\7\60\u0250\n\60\f\60\16\60\u0253\13\60\3\61\3\61\3"+
		"\61\3\62\3\62\5\62\u025a\n\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\5\65\u0264\n\65\3\65\3\65\3\66\3\66\5\66\u026a\n\66\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\38\38\38\58\u0275\n8\39\39\39\79\u027a\n9\f9\169\u027d\13"+
		"9\3:\3:\5:\u0281\n:\3;\3;\3;\5;\u0286\n;\3<\3<\3<\3<\3=\3=\5=\u028e\n"+
		"=\3>\3>\3>\5>\u0293\n>\3>\5>\u0296\n>\3?\3?\3?\5?\u029b\n?\3@\3@\3@\3"+
		"@\3A\3A\3A\3A\3A\5A\u02a6\nA\5A\u02a8\nA\3A\2\3\\B\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\2\f\3\2\5\6\3\2>?\3\2\61\62\4\2@AEE\3\2FG\3\2\669\4\2\65"+
		"\65HH\3\2<=\3\2HR\3\2)\60\2\u02d6\2\u0083\3\2\2\2\4\u0093\3\2\2\2\6\u0097"+
		"\3\2\2\2\b\u00b2\3\2\2\2\n\u00b4\3\2\2\2\f\u00bd\3\2\2\2\16\u00bf\3\2"+
		"\2\2\20\u00c2\3\2\2\2\22\u00c5\3\2\2\2\24\u00c8\3\2\2\2\26\u00d0\3\2\2"+
		"\2\30\u00d9\3\2\2\2\32\u00e1\3\2\2\2\34\u00e7\3\2\2\2\36\u00ed\3\2\2\2"+
		" \u00f7\3\2\2\2\"\u00fb\3\2\2\2$\u0100\3\2\2\2&\u0108\3\2\2\2(\u0112\3"+
		"\2\2\2*\u011b\3\2\2\2,\u011e\3\2\2\2.\u012b\3\2\2\2\60\u0137\3\2\2\2\62"+
		"\u0139\3\2\2\2\64\u013d\3\2\2\2\66\u0146\3\2\2\28\u0150\3\2\2\2:\u015c"+
		"\3\2\2\2<\u015e\3\2\2\2>\u0166\3\2\2\2@\u016a\3\2\2\2B\u0173\3\2\2\2D"+
		"\u018e\3\2\2\2F\u0190\3\2\2\2H\u0197\3\2\2\2J\u019b\3\2\2\2L\u01a6\3\2"+
		"\2\2N\u01b5\3\2\2\2P\u01b7\3\2\2\2R\u01ba\3\2\2\2T\u01be\3\2\2\2V\u01c3"+
		"\3\2\2\2X\u01d5\3\2\2\2Z\u01ed\3\2\2\2\\\u0210\3\2\2\2^\u024c\3\2\2\2"+
		"`\u0254\3\2\2\2b\u0257\3\2\2\2d\u025d\3\2\2\2f\u025f\3\2\2\2h\u0261\3"+
		"\2\2\2j\u0267\3\2\2\2l\u026d\3\2\2\2n\u0271\3\2\2\2p\u0276\3\2\2\2r\u0280"+
		"\3\2\2\2t\u0282\3\2\2\2v\u0287\3\2\2\2x\u028b\3\2\2\2z\u0295\3\2\2\2|"+
		"\u0297\3\2\2\2~\u029c\3\2\2\2\u0080\u02a7\3\2\2\2\u0082\u0084\5\4\3\2"+
		"\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0088\3\2\2\2\u0085\u0087"+
		"\5\6\4\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008e\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\5\b"+
		"\5\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\2"+
		"\2\3\u0092\3\3\2\2\2\u0093\u0094\7\3\2\2\u0094\u0095\5p9\2\u0095\u0096"+
		"\5\u0080A\2\u0096\5\3\2\2\2\u0097\u0098\7\4\2\2\u0098\u0099\5p9\2\u0099"+
		"\u009a\5\u0080A\2\u009a\7\3\2\2\2\u009b\u00b3\5\f\7\2\u009c\u00b3\5\n"+
		"\6\2\u009d\u009e\5\22\n\2\u009e\u009f\5\u0080A\2\u009f\u00b3\3\2\2\2\u00a0"+
		"\u00b3\5\30\r\2\u00a1\u00b3\5\34\17\2\u00a2\u00b3\5\36\20\2\u00a3\u00b3"+
		"\5&\24\2\u00a4\u00b3\5,\27\2\u00a5\u00b3\5\66\34\2\u00a6\u00b3\5B\"\2"+
		"\u00a7\u00b3\5D#\2\u00a8\u00b3\5F$\2\u00a9\u00b3\5J&\2\u00aa\u00b3\5P"+
		")\2\u00ab\u00b3\5R*\2\u00ac\u00b3\5T+\2\u00ad\u00b3\5V,\2\u00ae\u00b3"+
		"\5Z.\2\u00af\u00b3\5\16\b\2\u00b0\u00b3\5\20\t\2\u00b1\u00b3\5`\61\2\u00b2"+
		"\u009b\3\2\2\2\u00b2\u009c\3\2\2\2\u00b2\u009d\3\2\2\2\u00b2\u00a0\3\2"+
		"\2\2\u00b2\u00a1\3\2\2\2\u00b2\u00a2\3\2\2\2\u00b2\u00a3\3\2\2\2\u00b2"+
		"\u00a4\3\2\2\2\u00b2\u00a5\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a7\3\2"+
		"\2\2\u00b2\u00a8\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2"+
		"\u00ab\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2"+
		"\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\t\3\2\2\2\u00b4\u00b8\7V\2\2\u00b5\u00b7\5\b\5\2\u00b6\u00b5\3\2\2\2"+
		"\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7W\2\2\u00bc\13\3\2\2\2\u00bd"+
		"\u00be\7_\2\2\u00be\r\3\2\2\2\u00bf\u00c0\7\31\2\2\u00c0\u00c1\5\u0080"+
		"A\2\u00c1\17\3\2\2\2\u00c2\u00c3\7\32\2\2\u00c3\u00c4\5\u0080A\2\u00c4"+
		"\21\3\2\2\2\u00c5\u00c6\t\2\2\2\u00c6\u00c7\5\24\13\2\u00c7\23\3\2\2\2"+
		"\u00c8\u00cd\5\26\f\2\u00c9\u00ca\7^\2\2\u00ca\u00cc\5\26\f\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\25\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\7e\2\2\u00d1\u00d2\7`\2\2"+
		"\u00d2\u00d4\5x=\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d6\7H\2\2\u00d6\u00d8\5\\/\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\27\3\2\2\2\u00d9\u00da\7\33\2\2\u00da\u00dc\7e\2"+
		"\2\u00db\u00dd\5~@\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\5\32\16\2\u00df\u00e0\5\n\6\2\u00e0\31\3\2\2\2\u00e1"+
		"\u00e3\7T\2\2\u00e2\u00e4\5\24\13\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7U\2\2\u00e6\33\3\2\2\2\u00e7\u00e9"+
		"\7\34\2\2\u00e8\u00ea\5\\/\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\5\u0080A\2\u00ec\35\3\2\2\2\u00ed\u00ee\7\36"+
		"\2\2\u00ee\u00f3\7e\2\2\u00ef\u00f0\7\67\2\2\u00f0\u00f1\5r:\2\u00f1\u00f2"+
		"\7\66\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f4\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f5\u00f6\5 \21\2\u00f6\37\3\2\2\2\u00f7\u00f8"+
		"\7V\2\2\u00f8\u00f9\5$\23\2\u00f9\u00fa\7W\2\2\u00fa!\3\2\2\2\u00fb\u00fe"+
		"\7e\2\2\u00fc\u00fd\7H\2\2\u00fd\u00ff\5\\/\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff#\3\2\2\2\u0100\u0105\5\"\22\2\u0101\u0102\7^\2\2"+
		"\u0102\u0104\5\"\22\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106%\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\7\37\2\2\u0109\u010b\7e\2\2\u010a\u010c\5~@\2\u010b\u010a\3\2\2"+
		"\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010f\5*\26\2\u010e\u010d"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5(\25\2\u0111"+
		"\'\3\2\2\2\u0112\u0116\7V\2\2\u0113\u0115\5\22\n\2\u0114\u0113\3\2\2\2"+
		"\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7W\2\2\u011a)\3\2\2\2\u011b\u011c"+
		"\7!\2\2\u011c\u011d\5x=\2\u011d+\3\2\2\2\u011e\u011f\7 \2\2\u011f\u0121"+
		"\7e\2\2\u0120\u0122\5~@\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u0125\5*\26\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0127\3\2\2\2\u0126\u0128\5\64\33\2\u0127\u0126\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\5.\30\2\u012a-\3\2\2\2"+
		"\u012b\u012f\7V\2\2\u012c\u012e\5\60\31\2\u012d\u012c\3\2\2\2\u012e\u0131"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0133\7W\2\2\u0133/\3\2\2\2\u0134\u0138\5\22\n\2"+
		"\u0135\u0138\5\30\r\2\u0136\u0138\5\62\32\2\u0137\u0134\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\61\3\2\2\2\u0139\u013a\7#\2\2"+
		"\u013a\u013b\5\32\16\2\u013b\u013c\5\n\6\2\u013c\63\3\2\2\2\u013d\u013e"+
		"\7\'\2\2\u013e\u0143\5x=\2\u013f\u0140\7^\2\2\u0140\u0142\5x=\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\65\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7&\2\2\u0147\u0149"+
		"\7e\2\2\u0148\u014a\5~@\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u014d\5*\26\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u014f\58\35\2\u014f\67\3\2\2\2\u0150\u0154"+
		"\7V\2\2\u0151\u0153\5:\36\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157\u0158\7W\2\2\u01589\3\2\2\2\u0159\u015d\5\22\n\2\u015a\u015d"+
		"\5\30\r\2\u015b\u015d\5<\37\2\u015c\u0159\3\2\2\2\u015c\u015a\3\2\2\2"+
		"\u015c\u015b\3\2\2\2\u015d;\3\2\2\2\u015e\u015f\7\33\2\2\u015f\u0161\7"+
		"e\2\2\u0160\u0162\5v<\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\5\32\16\2\u0164\u0165\5\u0080A\2\u0165=\3\2"+
		"\2\2\u0166\u0167\7(\2\2\u0167\u0168\7e\2\2\u0168\u0169\5@!\2\u0169?\3"+
		"\2\2\2\u016a\u016e\7V\2\2\u016b\u016d\5\22\n\2\u016c\u016b\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2"+
		"\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7W\2\2\u0172A\3\2\2\2\u0173\u0174"+
		"\7\n\2\2\u0174\u0175\5\\/\2\u0175\u0176\5\u0080A\2\u0176C\3\2\2\2\u0177"+
		"\u0178\7\13\2\2\u0178\u0179\5\b\5\2\u0179\u017a\7\r\2\2\u017a\u017b\5"+
		"\b\5\2\u017b\u018f\3\2\2\2\u017c\u017d\7\13\2\2\u017d\u017e\5\b\5\2\u017e"+
		"\u017f\7\f\2\2\u017f\u0180\7T\2\2\u0180\u0181\5\26\f\2\u0181\u0182\7U"+
		"\2\2\u0182\u0183\5\b\5\2\u0183\u018f\3\2\2\2\u0184\u0185\7\13\2\2\u0185"+
		"\u0186\5\b\5\2\u0186\u0187\7\f\2\2\u0187\u0188\7T\2\2\u0188\u0189\5\26"+
		"\f\2\u0189\u018a\7U\2\2\u018a\u018b\5\b\5\2\u018b\u018c\7\r\2\2\u018c"+
		"\u018d\5\b\5\2\u018d\u018f\3\2\2\2\u018e\u0177\3\2\2\2\u018e\u017c\3\2"+
		"\2\2\u018e\u0184\3\2\2\2\u018fE\3\2\2\2\u0190\u0191\7\16\2\2\u0191\u0192"+
		"\5H%\2\u0192\u0195\5\b\5\2\u0193\u0194\7\17\2\2\u0194\u0196\5\b\5\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196G\3\2\2\2\u0197\u0198\7T\2\2\u0198"+
		"\u0199\5\\/\2\u0199\u019a\7U\2\2\u019aI\3\2\2\2\u019b\u019c\7\20\2\2\u019c"+
		"\u019d\5H%\2\u019d\u019f\7V\2\2\u019e\u01a0\5L\'\2\u019f\u019e\3\2\2\2"+
		"\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\u01a4\7W\2\2\u01a4K\3\2\2\2\u01a5\u01a7\5N(\2\u01a6\u01a5"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01ac\5\b\5\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01aeM\3\2\2\2\u01af\u01b0"+
		"\7\21\2\2\u01b0\u01b1\5\\/\2\u01b1\u01b2\7`\2\2\u01b2\u01b6\3\2\2\2\u01b3"+
		"\u01b4\7\22\2\2\u01b4\u01b6\7`\2\2\u01b5\u01af\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b6O\3\2\2\2\u01b7\u01b8\7\23\2\2\u01b8\u01b9\5\b\5\2\u01b9Q\3"+
		"\2\2\2\u01ba\u01bb\7\25\2\2\u01bb\u01bc\5H%\2\u01bc\u01bd\5\b\5\2\u01bd"+
		"S\3\2\2\2\u01be\u01bf\7\24\2\2\u01bf\u01c0\5\b\5\2\u01c0\u01c1\7\25\2"+
		"\2\u01c1\u01c2\5H%\2\u01c2U\3\2\2\2\u01c3\u01c4\7\26\2\2\u01c4\u01c6\7"+
		"T\2\2\u01c5\u01c7\5X-\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01ca\7_\2\2\u01c9\u01cb\5\\/\2\u01ca\u01c9\3\2\2"+
		"\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\7_\2\2\u01cd\u01cf"+
		"\5^\60\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d1\7U\2\2\u01d1\u01d2\5\b\5\2\u01d2W\3\2\2\2\u01d3\u01d6\5\22\n\2"+
		"\u01d4\u01d6\5^\60\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6Y\3"+
		"\2\2\2\u01d7\u01d8\7\27\2\2\u01d8\u01d9\7T\2\2\u01d9\u01da\5\26\f\2\u01da"+
		"\u01db\7\30\2\2\u01db\u01dc\5\\/\2\u01dc\u01dd\7U\2\2\u01dd\u01de\5\b"+
		"\5\2\u01de\u01ee\3\2\2\2\u01df\u01e0\7\27\2\2\u01e0\u01e1\7T\2\2\u01e1"+
		"\u01e2\7T\2\2\u01e2\u01e5\5\26\f\2\u01e3\u01e4\7^\2\2\u01e4\u01e6\5\26"+
		"\f\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e8\7U\2\2\u01e8\u01e9\7\30\2\2\u01e9\u01ea\5\\/\2\u01ea\u01eb\7U\2"+
		"\2\u01eb\u01ec\5\b\5\2\u01ec\u01ee\3\2\2\2\u01ed\u01d7\3\2\2\2\u01ed\u01df"+
		"\3\2\2\2\u01ee[\3\2\2\2\u01ef\u01f0\b/\1\2\u01f0\u01f1\7T\2\2\u01f1\u01f2"+
		"\5\\/\2\u01f2\u01f3\7U\2\2\u01f3\u0211\3\2\2\2\u01f4\u0211\7$\2\2\u01f5"+
		"\u0211\7%\2\2\u01f6\u0211\7e\2\2\u01f7\u01f9\7\"\2\2\u01f8\u01fa\5v<\2"+
		"\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u0211"+
		"\5b\62\2\u01fc\u01fd\t\3\2\2\u01fd\u0211\5\\/\24\u01fe\u01ff\t\4\2\2\u01ff"+
		"\u0211\5\\/\23\u0200\u0201\5p9\2\u0201\u0202\5d\63\2\u0202\u0203\5\\/"+
		"\7\u0203\u0211\3\2\2\2\u0204\u0207\7e\2\2\u0205\u0207\5\32\16\2\u0206"+
		"\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020b\7S"+
		"\2\2\u0209\u020c\5\\/\2\u020a\u020c\5\n\6\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020a\3\2\2\2\u020c\u0211\3\2\2\2\u020d\u0211\5f\64\2\u020e\u0211\5h"+
		"\65\2\u020f\u0211\5j\66\2\u0210\u01ef\3\2\2\2\u0210\u01f4\3\2\2\2\u0210"+
		"\u01f5\3\2\2\2\u0210\u01f6\3\2\2\2\u0210\u01f7\3\2\2\2\u0210\u01fc\3\2"+
		"\2\2\u0210\u01fe\3\2\2\2\u0210\u0200\3\2\2\2\u0210\u0206\3\2\2\2\u0210"+
		"\u020d\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211\u0249\3\2"+
		"\2\2\u0212\u0213\f\22\2\2\u0213\u0214\t\5\2\2\u0214\u0248\5\\/\23\u0215"+
		"\u0216\f\21\2\2\u0216\u0217\t\3\2\2\u0217\u0248\5\\/\22\u0218\u0219\f"+
		"\20\2\2\u0219\u021a\t\6\2\2\u021a\u0248\5\\/\21\u021b\u021c\f\17\2\2\u021c"+
		"\u021d\t\7\2\2\u021d\u0248\5\\/\20\u021e\u021f\f\16\2\2\u021f\u0220\t"+
		"\b\2\2\u0220\u0248\5\\/\17\u0221\u0222\f\r\2\2\u0222\u0223\7B\2\2\u0223"+
		"\u0248\5\\/\16\u0224\u0225\f\f\2\2\u0225\u0226\7D\2\2\u0226\u0248\5\\"+
		"/\r\u0227\u0228\f\13\2\2\u0228\u0229\7C\2\2\u0229\u0248\5\\/\f\u022a\u022b"+
		"\f\n\2\2\u022b\u022c\7:\2\2\u022c\u0248\5\\/\13\u022d\u022e\f\t\2\2\u022e"+
		"\u022f\7;\2\2\u022f\u0248\5\\/\n\u0230\u0231\f\b\2\2\u0231\u0232\7\63"+
		"\2\2\u0232\u0233\5\\/\2\u0233\u0234\7`\2\2\u0234\u0235\5\\/\b\u0235\u0248"+
		"\3\2\2\2\u0236\u0237\f\31\2\2\u0237\u023c\7]\2\2\u0238\u023d\7e\2\2\u0239"+
		"\u023a\5\\/\2\u023a\u023b\5b\62\2\u023b\u023d\3\2\2\2\u023c\u0238\3\2"+
		"\2\2\u023c\u0239\3\2\2\2\u023d\u0248\3\2\2\2\u023e\u023f\f\30\2\2\u023f"+
		"\u0240\7X\2\2\u0240\u0241\5\\/\2\u0241\u0242\7Y\2\2\u0242\u0248\3\2\2"+
		"\2\u0243\u0244\f\27\2\2\u0244\u0248\5b\62\2\u0245\u0246\f\25\2\2\u0246"+
		"\u0248\t\t\2\2\u0247\u0212\3\2\2\2\u0247\u0215\3\2\2\2\u0247\u0218\3\2"+
		"\2\2\u0247\u021b\3\2\2\2\u0247\u021e\3\2\2\2\u0247\u0221\3\2\2\2\u0247"+
		"\u0224\3\2\2\2\u0247\u0227\3\2\2\2\u0247\u022a\3\2\2\2\u0247\u022d\3\2"+
		"\2\2\u0247\u0230\3\2\2\2\u0247\u0236\3\2\2\2\u0247\u023e\3\2\2\2\u0247"+
		"\u0243\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a]\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u0251"+
		"\5\\/\2\u024d\u024e\7^\2\2\u024e\u0250\5\\/\2\u024f\u024d\3\2\2\2\u0250"+
		"\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252_\3\2\2\2"+
		"\u0253\u0251\3\2\2\2\u0254\u0255\5\\/\2\u0255\u0256\5\u0080A\2\u0256a"+
		"\3\2\2\2\u0257\u0259\7T\2\2\u0258\u025a\5^\60\2\u0259\u0258\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\7U\2\2\u025cc\3\2\2\2\u025d"+
		"\u025e\t\n\2\2\u025ee\3\2\2\2\u025f\u0260\t\13\2\2\u0260g\3\2\2\2\u0261"+
		"\u0263\7X\2\2\u0262\u0264\5^\60\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2"+
		"\2\2\u0264\u0265\3\2\2\2\u0265\u0266\7Y\2\2\u0266i\3\2\2\2\u0267\u0269"+
		"\7V\2\2\u0268\u026a\5n8\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u026c\7W\2\2\u026ck\3\2\2\2\u026d\u026e\7e\2\2\u026e"+
		"\u026f\7`\2\2\u026f\u0270\5\\/\2\u0270m\3\2\2\2\u0271\u0274\5l\67\2\u0272"+
		"\u0273\7^\2\2\u0273\u0275\5l\67\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275o\3\2\2\2\u0276\u027b\7e\2\2\u0277\u0278\7]\2\2\u0278\u027a"+
		"\7e\2\2\u0279\u0277\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027cq\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0281\7e\2\2\u027f"+
		"\u0281\5p9\2\u0280\u027e\3\2\2\2\u0280\u027f\3\2\2\2\u0281s\3\2\2\2\u0282"+
		"\u0285\5r:\2\u0283\u0284\7^\2\2\u0284\u0286\5r:\2\u0285\u0283\3\2\2\2"+
		"\u0285\u0286\3\2\2\2\u0286u\3\2\2\2\u0287\u0288\7\67\2\2\u0288\u0289\5"+
		"t;\2\u0289\u028a\7\66\2\2\u028aw\3\2\2\2\u028b\u028d\5p9\2\u028c\u028e"+
		"\5v<\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028ey\3\2\2\2\u028f\u0292"+
		"\7e\2\2\u0290\u0291\7!\2\2\u0291\u0293\5p9\2\u0292\u0290\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0296\5p9\2\u0295\u028f\3\2\2"+
		"\2\u0295\u0294\3\2\2\2\u0296{\3\2\2\2\u0297\u029a\5z>\2\u0298\u0299\7"+
		"^\2\2\u0299\u029b\5z>\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"}\3\2\2\2\u029c\u029d\7\67\2\2\u029d\u029e\5|?\2\u029e\u029f\7\66\2\2"+
		"\u029f\177\3\2\2\2\u02a0\u02a8\7_\2\2\u02a1\u02a8\7\2\2\3\u02a2\u02a8"+
		"\7c\2\2\u02a3\u02a5\7d\2\2\u02a4\u02a6\7c\2\2\u02a5\u02a4\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6\u02a8\3\2\2\2\u02a7\u02a0\3\2\2\2\u02a7\u02a1\3\2"+
		"\2\2\u02a7\u02a2\3\2\2\2\u02a7\u02a3\3\2\2\2\u02a8\u0081\3\2\2\2@\u0083"+
		"\u0088\u008e\u00b2\u00b8\u00cd\u00d3\u00d7\u00dc\u00e3\u00e9\u00f3\u00fe"+
		"\u0105\u010b\u010e\u0116\u0121\u0124\u0127\u012f\u0137\u0143\u0149\u014c"+
		"\u0154\u015c\u0161\u016e\u018e\u0195\u01a1\u01a8\u01ad\u01b5\u01c6\u01ca"+
		"\u01ce\u01d5\u01e5\u01ed\u01f9\u0206\u020b\u0210\u023c\u0247\u0249\u0251"+
		"\u0259\u0263\u0269\u0274\u027b\u0280\u0285\u028d\u0292\u0295\u029a\u02a5"+
		"\u02a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}