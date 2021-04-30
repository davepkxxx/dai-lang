// Generated from DaiLexer.g4 by ANTLR 4.9.2
package dai.compiler.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DaiLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PACKAGE", "IMPORT", "VAR", "CONST", "NULL", "TRUE", "FALSE", "THROW", 
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
			"DOT", "COMMA", "SEMI", "COLON", "AT", "ELLIPSIS", "IDENTIFIER", "EscapeSequence", 
			"HexDigit", "Letter", "LetterOrDigit"
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


	public DaiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DaiLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2a\u02a4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\6\'\u01b2\n\'\r\'\16\'\u01b3\3(\6("+
		"\u01b7\n(\r(\16(\u01b8\3(\3(\3)\6)\u01be\n)\r)\16)\u01bf\3)\3)\6)\u01c4"+
		"\n)\r)\16)\u01c5\3)\3)\3*\6*\u01cb\n*\r*\16*\u01cc\3*\3*\6*\u01d1\n*\r"+
		"*\16*\u01d2\3+\3+\3+\5+\u01d8\n+\3+\3+\3,\3,\3,\7,\u01df\n,\f,\16,\u01e2"+
		"\13,\3,\3,\3-\3-\5-\u01e8\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A"+
		"\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J"+
		"\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\3N\3O\3O\3O\3P\3P\3Q\3Q"+
		"\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3V\3V\3W\3W\3W\5W\u0256\nW\3X\3X\3X\3X"+
		"\7X\u025c\nX\fX\16X\u025f\13X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\7Y\u026a\nY\f"+
		"Y\16Y\u026d\13Y\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3_\3_\3`\3"+
		"`\7`\u0281\n`\f`\16`\u0284\13`\3a\3a\3a\3a\5a\u028a\na\3a\5a\u028d\na"+
		"\3a\3a\3a\6a\u0292\na\ra\16a\u0293\3a\3a\3a\3a\3a\5a\u029b\na\3b\3b\3"+
		"c\3c\3d\3d\5d\u02a3\nd\3\u025d\2e\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099"+
		"N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00ad"+
		"X\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1"+
		"\2\u00c3\2\u00c5\2\u00c7\2\3\2\17\3\2\62;\3\2nn\3\2\62\62\3\2hh\6\2\f"+
		"\f\17\17))^^\6\2\f\f\17\17$$^^\5\2\13\13\16\16\"\"\4\2\f\f\17\17\n\2$"+
		"$))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\62;CHch\6\2&&C\\aac|\2\u02b3\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\3\u00c9\3\2\2\2\5\u00d1\3\2\2"+
		"\2\7\u00d8\3\2\2\2\t\u00dc\3\2\2\2\13\u00e2\3\2\2\2\r\u00e7\3\2\2\2\17"+
		"\u00ec\3\2\2\2\21\u00f2\3\2\2\2\23\u00f8\3\2\2\2\25\u00fc\3\2\2\2\27\u0102"+
		"\3\2\2\2\31\u010a\3\2\2\2\33\u010d\3\2\2\2\35\u0112\3\2\2\2\37\u0119\3"+
		"\2\2\2!\u011e\3\2\2\2#\u0126\3\2\2\2%\u012b\3\2\2\2\'\u012e\3\2\2\2)\u0134"+
		"\3\2\2\2+\u0138\3\2\2\2-\u013b\3\2\2\2/\u0144\3\2\2\2\61\u014a\3\2\2\2"+
		"\63\u014f\3\2\2\2\65\u0156\3\2\2\2\67\u015b\3\2\2\29\u0160\3\2\2\2;\u0167"+
		"\3\2\2\2=\u016d\3\2\2\2?\u0175\3\2\2\2A\u0179\3\2\2\2C\u0185\3\2\2\2E"+
		"\u018a\3\2\2\2G\u0190\3\2\2\2I\u019a\3\2\2\2K\u01a5\3\2\2\2M\u01b1\3\2"+
		"\2\2O\u01b6\3\2\2\2Q\u01bd\3\2\2\2S\u01ca\3\2\2\2U\u01d4\3\2\2\2W\u01db"+
		"\3\2\2\2Y\u01e7\3\2\2\2[\u01e9\3\2\2\2]\u01eb\3\2\2\2_\u01ed\3\2\2\2a"+
		"\u01ef\3\2\2\2c\u01f1\3\2\2\2e\u01f4\3\2\2\2g\u01f7\3\2\2\2i\u01f9\3\2"+
		"\2\2k\u01fb\3\2\2\2m\u01fe\3\2\2\2o\u0201\3\2\2\2q\u0204\3\2\2\2s\u0207"+
		"\3\2\2\2u\u020a\3\2\2\2w\u020d\3\2\2\2y\u020f\3\2\2\2{\u0211\3\2\2\2}"+
		"\u0213\3\2\2\2\177\u0215\3\2\2\2\u0081\u0217\3\2\2\2\u0083\u0219\3\2\2"+
		"\2\u0085\u021b\3\2\2\2\u0087\u021d\3\2\2\2\u0089\u021f\3\2\2\2\u008b\u0222"+
		"\3\2\2\2\u008d\u0225\3\2\2\2\u008f\u0228\3\2\2\2\u0091\u022b\3\2\2\2\u0093"+
		"\u022e\3\2\2\2\u0095\u0231\3\2\2\2\u0097\u0234\3\2\2\2\u0099\u0237\3\2"+
		"\2\2\u009b\u023b\3\2\2\2\u009d\u023f\3\2\2\2\u009f\u0242\3\2\2\2\u00a1"+
		"\u0244\3\2\2\2\u00a3\u0246\3\2\2\2\u00a5\u0248\3\2\2\2\u00a7\u024a\3\2"+
		"\2\2\u00a9\u024c\3\2\2\2\u00ab\u024e\3\2\2\2\u00ad\u0255\3\2\2\2\u00af"+
		"\u0257\3\2\2\2\u00b1\u0265\3\2\2\2\u00b3\u0270\3\2\2\2\u00b5\u0272\3\2"+
		"\2\2\u00b7\u0274\3\2\2\2\u00b9\u0276\3\2\2\2\u00bb\u0278\3\2\2\2\u00bd"+
		"\u027a\3\2\2\2\u00bf\u027e\3\2\2\2\u00c1\u029a\3\2\2\2\u00c3\u029c\3\2"+
		"\2\2\u00c5\u029e\3\2\2\2\u00c7\u02a2\3\2\2\2\u00c9\u00ca\7R\2\2\u00ca"+
		"\u00cb\7C\2\2\u00cb\u00cc\7E\2\2\u00cc\u00cd\7M\2\2\u00cd\u00ce\7C\2\2"+
		"\u00ce\u00cf\7I\2\2\u00cf\u00d0\7G\2\2\u00d0\4\3\2\2\2\u00d1\u00d2\7K"+
		"\2\2\u00d2\u00d3\7O\2\2\u00d3\u00d4\7R\2\2\u00d4\u00d5\7Q\2\2\u00d5\u00d6"+
		"\7T\2\2\u00d6\u00d7\7V\2\2\u00d7\6\3\2\2\2\u00d8\u00d9\7X\2\2\u00d9\u00da"+
		"\7C\2\2\u00da\u00db\7T\2\2\u00db\b\3\2\2\2\u00dc\u00dd\7E\2\2\u00dd\u00de"+
		"\7Q\2\2\u00de\u00df\7P\2\2\u00df\u00e0\7U\2\2\u00e0\u00e1\7V\2\2\u00e1"+
		"\n\3\2\2\2\u00e2\u00e3\7P\2\2\u00e3\u00e4\7W\2\2\u00e4\u00e5\7N\2\2\u00e5"+
		"\u00e6\7N\2\2\u00e6\f\3\2\2\2\u00e7\u00e8\7V\2\2\u00e8\u00e9\7T\2\2\u00e9"+
		"\u00ea\7W\2\2\u00ea\u00eb\7G\2\2\u00eb\16\3\2\2\2\u00ec\u00ed\7H\2\2\u00ed"+
		"\u00ee\7C\2\2\u00ee\u00ef\7N\2\2\u00ef\u00f0\7U\2\2\u00f0\u00f1\7G\2\2"+
		"\u00f1\20\3\2\2\2\u00f2\u00f3\7V\2\2\u00f3\u00f4\7J\2\2\u00f4\u00f5\7"+
		"T\2\2\u00f5\u00f6\7Q\2\2\u00f6\u00f7\7Y\2\2\u00f7\22\3\2\2\2\u00f8\u00f9"+
		"\7V\2\2\u00f9\u00fa\7T\2\2\u00fa\u00fb\7[\2\2\u00fb\24\3\2\2\2\u00fc\u00fd"+
		"\7E\2\2\u00fd\u00fe\7C\2\2\u00fe\u00ff\7V\2\2\u00ff\u0100\7E\2\2\u0100"+
		"\u0101\7J\2\2\u0101\26\3\2\2\2\u0102\u0103\7H\2\2\u0103\u0104\7K\2\2\u0104"+
		"\u0105\7P\2\2\u0105\u0106\7C\2\2\u0106\u0107\7N\2\2\u0107\u0108\7N\2\2"+
		"\u0108\u0109\7[\2\2\u0109\30\3\2\2\2\u010a\u010b\7K\2\2\u010b\u010c\7"+
		"H\2\2\u010c\32\3\2\2\2\u010d\u010e\7G\2\2\u010e\u010f\7N\2\2\u010f\u0110"+
		"\7U\2\2\u0110\u0111\7G\2\2\u0111\34\3\2\2\2\u0112\u0113\7U\2\2\u0113\u0114"+
		"\7Y\2\2\u0114\u0115\7K\2\2\u0115\u0116\7V\2\2\u0116\u0117\7E\2\2\u0117"+
		"\u0118\7J\2\2\u0118\36\3\2\2\2\u0119\u011a\7E\2\2\u011a\u011b\7C\2\2\u011b"+
		"\u011c\7U\2\2\u011c\u011d\7G\2\2\u011d \3\2\2\2\u011e\u011f\7F\2\2\u011f"+
		"\u0120\7G\2\2\u0120\u0121\7H\2\2\u0121\u0122\7C\2\2\u0122\u0123\7W\2\2"+
		"\u0123\u0124\7N\2\2\u0124\u0125\7V\2\2\u0125\"\3\2\2\2\u0126\u0127\7N"+
		"\2\2\u0127\u0128\7Q\2\2\u0128\u0129\7Q\2\2\u0129\u012a\7R\2\2\u012a$\3"+
		"\2\2\2\u012b\u012c\7F\2\2\u012c\u012d\7Q\2\2\u012d&\3\2\2\2\u012e\u012f"+
		"\7Y\2\2\u012f\u0130\7J\2\2\u0130\u0131\7K\2\2\u0131\u0132\7N\2\2\u0132"+
		"\u0133\7G\2\2\u0133(\3\2\2\2\u0134\u0135\7H\2\2\u0135\u0136\7Q\2\2\u0136"+
		"\u0137\7T\2\2\u0137*\3\2\2\2\u0138\u0139\7K\2\2\u0139\u013a\7P\2\2\u013a"+
		",\3\2\2\2\u013b\u013c\7E\2\2\u013c\u013d\7Q\2\2\u013d\u013e\7P\2\2\u013e"+
		"\u013f\7V\2\2\u013f\u0140\7K\2\2\u0140\u0141\7P\2\2\u0141\u0142\7W\2\2"+
		"\u0142\u0143\7G\2\2\u0143.\3\2\2\2\u0144\u0145\7D\2\2\u0145\u0146\7T\2"+
		"\2\u0146\u0147\7G\2\2\u0147\u0148\7C\2\2\u0148\u0149\7M\2\2\u0149\60\3"+
		"\2\2\2\u014a\u014b\7H\2\2\u014b\u014c\7W\2\2\u014c\u014d\7P\2\2\u014d"+
		"\u014e\7E\2\2\u014e\62\3\2\2\2\u014f\u0150\7T\2\2\u0150\u0151\7G\2\2\u0151"+
		"\u0152\7V\2\2\u0152\u0153\7W\2\2\u0153\u0154\7T\2\2\u0154\u0155\7P\2\2"+
		"\u0155\64\3\2\2\2\u0156\u0157\7X\2\2\u0157\u0158\7Q\2\2\u0158\u0159\7"+
		"K\2\2\u0159\u015a\7F\2\2\u015a\66\3\2\2\2\u015b\u015c\7G\2\2\u015c\u015d"+
		"\7P\2\2\u015d\u015e\7W\2\2\u015e\u015f\7O\2\2\u015f8\3\2\2\2\u0160\u0161"+
		"\7U\2\2\u0161\u0162\7V\2\2\u0162\u0163\7T\2\2\u0163\u0164\7W\2\2\u0164"+
		"\u0165\7E\2\2\u0165\u0166\7V\2\2\u0166:\3\2\2\2\u0167\u0168\7E\2\2\u0168"+
		"\u0169\7N\2\2\u0169\u016a\7C\2\2\u016a\u016b\7U\2\2\u016b\u016c\7U\2\2"+
		"\u016c<\3\2\2\2\u016d\u016e\7G\2\2\u016e\u016f\7Z\2\2\u016f\u0170\7V\2"+
		"\2\u0170\u0171\7G\2\2\u0171\u0172\7P\2\2\u0172\u0173\7F\2\2\u0173\u0174"+
		"\7U\2\2\u0174>\3\2\2\2\u0175\u0176\7P\2\2\u0176\u0177\7G\2\2\u0177\u0178"+
		"\7Y\2\2\u0178@\3\2\2\2\u0179\u017a\7E\2\2\u017a\u017b\7Q\2\2\u017b\u017c"+
		"\7P\2\2\u017c\u017d\7U\2\2\u017d\u017e\7V\2\2\u017e\u017f\7T\2\2\u017f"+
		"\u0180\7W\2\2\u0180\u0181\7E\2\2\u0181\u0182\7V\2\2\u0182\u0183\7Q\2\2"+
		"\u0183\u0184\7T\2\2\u0184B\3\2\2\2\u0185\u0186\7V\2\2\u0186\u0187\7J\2"+
		"\2\u0187\u0188\7K\2\2\u0188\u0189\7U\2\2\u0189D\3\2\2\2\u018a\u018b\7"+
		"U\2\2\u018b\u018c\7W\2\2\u018c\u018d\7R\2\2\u018d\u018e\7G\2\2\u018e\u018f"+
		"\7T\2\2\u018fF\3\2\2\2\u0190\u0191\7K\2\2\u0191\u0192\7P\2\2\u0192\u0193"+
		"\7V\2\2\u0193\u0194\7G\2\2\u0194\u0195\7T\2\2\u0195\u0196\7H\2\2\u0196"+
		"\u0197\7C\2\2\u0197\u0198\7E\2\2\u0198\u0199\7G\2\2\u0199H\3\2\2\2\u019a"+
		"\u019b\7K\2\2\u019b\u019c\7O\2\2\u019c\u019d\7R\2\2\u019d\u019e\7N\2\2"+
		"\u019e\u019f\7G\2\2\u019f\u01a0\7O\2\2\u01a0\u01a1\7G\2\2\u01a1\u01a2"+
		"\7P\2\2\u01a2\u01a3\7V\2\2\u01a3\u01a4\7U\2\2\u01a4J\3\2\2\2\u01a5\u01a6"+
		"\7C\2\2\u01a6\u01a7\7P\2\2\u01a7\u01a8\7P\2\2\u01a8\u01a9\7Q\2\2\u01a9"+
		"\u01aa\7V\2\2\u01aa\u01ab\7C\2\2\u01ab\u01ac\7V\2\2\u01ac\u01ad\7K\2\2"+
		"\u01ad\u01ae\7Q\2\2\u01ae\u01af\7P\2\2\u01afL\3\2\2\2\u01b0\u01b2\t\2"+
		"\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4N\3\2\2\2\u01b5\u01b7\t\2\2\2\u01b6\u01b5\3\2\2\2"+
		"\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba\u01bb\t\3\2\2\u01bbP\3\2\2\2\u01bc\u01be\t\2\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\5\u00b3Z\2\u01c2\u01c4\t\4\2\2\u01c3"+
		"\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\t\5\2\2\u01c8R\3\2\2\2\u01c9\u01cb"+
		"\t\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\5\u00b3Z\2\u01cf\u01d1"+
		"\t\4\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3T\3\2\2\2\u01d4\u01d7\7)\2\2\u01d5\u01d8\n\6\2\2\u01d6"+
		"\u01d8\5\u00c1a\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\7)\2\2\u01daV\3\2\2\2\u01db\u01e0\7$\2\2\u01dc\u01df"+
		"\n\7\2\2\u01dd\u01df\5\u00c1a\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2"+
		"\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3"+
		"\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7$\2\2\u01e4X\3\2\2\2\u01e5\u01e8"+
		"\5\r\7\2\u01e6\u01e8\5\17\b\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2"+
		"\u01e8Z\3\2\2\2\u01e9\u01ea\5\13\6\2\u01ea\\\3\2\2\2\u01eb\u01ec\7#\2"+
		"\2\u01ec^\3\2\2\2\u01ed\u01ee\7\u0080\2\2\u01ee`\3\2\2\2\u01ef\u01f0\7"+
		"A\2\2\u01f0b\3\2\2\2\u01f1\u01f2\7?\2\2\u01f2\u01f3\7?\2\2\u01f3d\3\2"+
		"\2\2\u01f4\u01f5\7#\2\2\u01f5\u01f6\7?\2\2\u01f6f\3\2\2\2\u01f7\u01f8"+
		"\7@\2\2\u01f8h\3\2\2\2\u01f9\u01fa\7>\2\2\u01faj\3\2\2\2\u01fb\u01fc\7"+
		">\2\2\u01fc\u01fd\7?\2\2\u01fdl\3\2\2\2\u01fe\u01ff\7@\2\2\u01ff\u0200"+
		"\7?\2\2\u0200n\3\2\2\2\u0201\u0202\7(\2\2\u0202\u0203\7(\2\2\u0203p\3"+
		"\2\2\2\u0204\u0205\7~\2\2\u0205\u0206\7~\2\2\u0206r\3\2\2\2\u0207\u0208"+
		"\7-\2\2\u0208\u0209\7-\2\2\u0209t\3\2\2\2\u020a\u020b\7/\2\2\u020b\u020c"+
		"\7/\2\2\u020cv\3\2\2\2\u020d\u020e\7-\2\2\u020ex\3\2\2\2\u020f\u0210\7"+
		"/\2\2\u0210z\3\2\2\2\u0211\u0212\7,\2\2\u0212|\3\2\2\2\u0213\u0214\7\61"+
		"\2\2\u0214~\3\2\2\2\u0215\u0216\7(\2\2\u0216\u0080\3\2\2\2\u0217\u0218"+
		"\7~\2\2\u0218\u0082\3\2\2\2\u0219\u021a\7`\2\2\u021a\u0084\3\2\2\2\u021b"+
		"\u021c\7\'\2\2\u021c\u0086\3\2\2\2\u021d\u021e\7?\2\2\u021e\u0088\3\2"+
		"\2\2\u021f\u0220\7-\2\2\u0220\u0221\7?\2\2\u0221\u008a\3\2\2\2\u0222\u0223"+
		"\7/\2\2\u0223\u0224\7?\2\2\u0224\u008c\3\2\2\2\u0225\u0226\7,\2\2\u0226"+
		"\u0227\7?\2\2\u0227\u008e\3\2\2\2\u0228\u0229\7\61\2\2\u0229\u022a\7?"+
		"\2\2\u022a\u0090\3\2\2\2\u022b\u022c\7(\2\2\u022c\u022d\7?\2\2\u022d\u0092"+
		"\3\2\2\2\u022e\u022f\7~\2\2\u022f\u0230\7?\2\2\u0230\u0094\3\2\2\2\u0231"+
		"\u0232\7`\2\2\u0232\u0233\7?\2\2\u0233\u0096\3\2\2\2\u0234\u0235\7\'\2"+
		"\2\u0235\u0236\7?\2\2\u0236\u0098\3\2\2\2\u0237\u0238\7>\2\2\u0238\u0239"+
		"\7>\2\2\u0239\u023a\7?\2\2\u023a\u009a\3\2\2\2\u023b\u023c\7@\2\2\u023c"+
		"\u023d\7@\2\2\u023d\u023e\7?\2\2\u023e\u009c\3\2\2\2\u023f\u0240\7?\2"+
		"\2\u0240\u0241\7@\2\2\u0241\u009e\3\2\2\2\u0242\u0243\7*\2\2\u0243\u00a0"+
		"\3\2\2\2\u0244\u0245\7+\2\2\u0245\u00a2\3\2\2\2\u0246\u0247\7}\2\2\u0247"+
		"\u00a4\3\2\2\2\u0248\u0249\7\177\2\2\u0249\u00a6\3\2\2\2\u024a\u024b\7"+
		"]\2\2\u024b\u00a8\3\2\2\2\u024c\u024d\7_\2\2\u024d\u00aa\3\2\2\2\u024e"+
		"\u024f\t\b\2\2\u024f\u0250\3\2\2\2\u0250\u0251\bV\2\2\u0251\u00ac\3\2"+
		"\2\2\u0252\u0256\7\f\2\2\u0253\u0254\7\17\2\2\u0254\u0256\7\f\2\2\u0255"+
		"\u0252\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u00ae\3\2\2\2\u0257\u0258\7\61"+
		"\2\2\u0258\u0259\7,\2\2\u0259\u025d\3\2\2\2\u025a\u025c\13\2\2\2\u025b"+
		"\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025e\3\2\2\2\u025d\u025b\3\2"+
		"\2\2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\7,\2\2\u0261"+
		"\u0262\7\61\2\2\u0262\u0263\3\2\2\2\u0263\u0264\bX\3\2\u0264\u00b0\3\2"+
		"\2\2\u0265\u0266\7\61\2\2\u0266\u0267\7\61\2\2\u0267\u026b\3\2\2\2\u0268"+
		"\u026a\n\t\2\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2"+
		"\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e"+
		"\u026f\bY\3\2\u026f\u00b2\3\2\2\2\u0270\u0271\7\60\2\2\u0271\u00b4\3\2"+
		"\2\2\u0272\u0273\7.\2\2\u0273\u00b6\3\2\2\2\u0274\u0275\7=\2\2\u0275\u00b8"+
		"\3\2\2\2\u0276\u0277\7<\2\2\u0277\u00ba\3\2\2\2\u0278\u0279\7B\2\2\u0279"+
		"\u00bc\3\2\2\2\u027a\u027b\7\60\2\2\u027b\u027c\7\60\2\2\u027c\u027d\7"+
		"\60\2\2\u027d\u00be\3\2\2\2\u027e\u0282\5\u00c5c\2\u027f\u0281\5\u00c7"+
		"d\2\u0280\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u00c0\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0286\7^"+
		"\2\2\u0286\u029b\t\n\2\2\u0287\u028c\7^\2\2\u0288\u028a\t\13\2\2\u0289"+
		"\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\t\f"+
		"\2\2\u028c\u0289\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u029b\t\f\2\2\u028f\u0291\7^\2\2\u0290\u0292\7w\2\2\u0291\u0290\3\2\2"+
		"\2\u0292\u0293\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295"+
		"\3\2\2\2\u0295\u0296\5\u00c3b\2\u0296\u0297\5\u00c3b\2\u0297\u0298\5\u00c3"+
		"b\2\u0298\u0299\5\u00c3b\2\u0299\u029b\3\2\2\2\u029a\u0285\3\2\2\2\u029a"+
		"\u0287\3\2\2\2\u029a\u028f\3\2\2\2\u029b\u00c2\3\2\2\2\u029c\u029d\t\r"+
		"\2\2\u029d\u00c4\3\2\2\2\u029e\u029f\t\16\2\2\u029f\u00c6\3\2\2\2\u02a0"+
		"\u02a3\5\u00c5c\2\u02a1\u02a3\t\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a1"+
		"\3\2\2\2\u02a3\u00c8\3\2\2\2\26\2\u01b3\u01b8\u01bf\u01c5\u01cc\u01d2"+
		"\u01d7\u01de\u01e0\u01e7\u0255\u025d\u026b\u0282\u0289\u028c\u0293\u029a"+
		"\u02a2\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}