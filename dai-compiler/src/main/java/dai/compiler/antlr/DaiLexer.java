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
			"COLON", "AT", "ELLIPSIS", "LF", "CR", "IDENTIFIER", "EscapeSequence", 
			"HexDigit", "Letter", "LetterOrDigit"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2e\u02bc\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\6(\u01c2\n(\r(\16(\u01c3\3)\6)\u01c7\n)"+
		"\r)\16)\u01c8\3)\3)\3*\6*\u01ce\n*\r*\16*\u01cf\3*\3*\6*\u01d4\n*\r*\16"+
		"*\u01d5\3*\3*\3+\6+\u01db\n+\r+\16+\u01dc\3+\3+\6+\u01e1\n+\r+\16+\u01e2"+
		"\3,\3,\3,\5,\u01e8\n,\3,\3,\3-\3-\3-\7-\u01ef\n-\f-\16-\u01f2\13-\3-\3"+
		"-\3.\3.\5.\u01f8\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3"+
		":\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3"+
		"D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3"+
		"L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3S\3"+
		"S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\6Y\u0266\nY\rY\16Y\u0267\3Y\3Y\3Z\3"+
		"Z\3Z\3Z\7Z\u0270\nZ\fZ\16Z\u0273\13Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\7[\u027e"+
		"\n[\f[\16[\u0281\13[\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3a\3"+
		"a\3b\3b\3c\3c\3d\3d\7d\u0299\nd\fd\16d\u029c\13d\3e\3e\3e\3e\5e\u02a2"+
		"\ne\3e\5e\u02a5\ne\3e\3e\3e\6e\u02aa\ne\re\16e\u02ab\3e\3e\3e\3e\3e\5"+
		"e\u02b3\ne\3f\3f\3g\3g\3h\3h\5h\u02bb\nh\3\u0271\2i\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7"+
		"U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb"+
		"_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9\2\u00cb\2\u00cd\2\u00cf"+
		"\2\3\2\17\3\2\62;\3\2nn\3\2\62\62\3\2hh\6\2\f\f\17\17))^^\6\2\f\f\17\17"+
		"$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\n\2$$))^^ddhhppttvv\3\2\62\65\3"+
		"\2\629\5\2\62;CHch\6\2&&C\\aac|\2\u02cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7"+
		"\3\2\2\2\3\u00d1\3\2\2\2\5\u00d9\3\2\2\2\7\u00e0\3\2\2\2\t\u00e4\3\2\2"+
		"\2\13\u00ea\3\2\2\2\r\u00ef\3\2\2\2\17\u00f4\3\2\2\2\21\u00fa\3\2\2\2"+
		"\23\u0100\3\2\2\2\25\u0104\3\2\2\2\27\u010a\3\2\2\2\31\u0112\3\2\2\2\33"+
		"\u0115\3\2\2\2\35\u011a\3\2\2\2\37\u0121\3\2\2\2!\u0126\3\2\2\2#\u012e"+
		"\3\2\2\2%\u0133\3\2\2\2\'\u0136\3\2\2\2)\u013c\3\2\2\2+\u0140\3\2\2\2"+
		"-\u0148\3\2\2\2/\u014b\3\2\2\2\61\u0154\3\2\2\2\63\u015a\3\2\2\2\65\u015f"+
		"\3\2\2\2\67\u0166\3\2\2\29\u016b\3\2\2\2;\u0170\3\2\2\2=\u0177\3\2\2\2"+
		"?\u017d\3\2\2\2A\u0185\3\2\2\2C\u0189\3\2\2\2E\u0195\3\2\2\2G\u019a\3"+
		"\2\2\2I\u01a0\3\2\2\2K\u01aa\3\2\2\2M\u01b5\3\2\2\2O\u01c1\3\2\2\2Q\u01c6"+
		"\3\2\2\2S\u01cd\3\2\2\2U\u01da\3\2\2\2W\u01e4\3\2\2\2Y\u01eb\3\2\2\2["+
		"\u01f7\3\2\2\2]\u01f9\3\2\2\2_\u01fb\3\2\2\2a\u01fd\3\2\2\2c\u01ff\3\2"+
		"\2\2e\u0201\3\2\2\2g\u0204\3\2\2\2i\u0207\3\2\2\2k\u0209\3\2\2\2m\u020b"+
		"\3\2\2\2o\u020e\3\2\2\2q\u0211\3\2\2\2s\u0214\3\2\2\2u\u0217\3\2\2\2w"+
		"\u021a\3\2\2\2y\u021d\3\2\2\2{\u021f\3\2\2\2}\u0221\3\2\2\2\177\u0223"+
		"\3\2\2\2\u0081\u0225\3\2\2\2\u0083\u0227\3\2\2\2\u0085\u0229\3\2\2\2\u0087"+
		"\u022b\3\2\2\2\u0089\u022d\3\2\2\2\u008b\u0230\3\2\2\2\u008d\u0233\3\2"+
		"\2\2\u008f\u0235\3\2\2\2\u0091\u0238\3\2\2\2\u0093\u023b\3\2\2\2\u0095"+
		"\u023e\3\2\2\2\u0097\u0241\3\2\2\2\u0099\u0244\3\2\2\2\u009b\u0247\3\2"+
		"\2\2\u009d\u024a\3\2\2\2\u009f\u024d\3\2\2\2\u00a1\u0251\3\2\2\2\u00a3"+
		"\u0255\3\2\2\2\u00a5\u0258\3\2\2\2\u00a7\u025a\3\2\2\2\u00a9\u025c\3\2"+
		"\2\2\u00ab\u025e\3\2\2\2\u00ad\u0260\3\2\2\2\u00af\u0262\3\2\2\2\u00b1"+
		"\u0265\3\2\2\2\u00b3\u026b\3\2\2\2\u00b5\u0279\3\2\2\2\u00b7\u0284\3\2"+
		"\2\2\u00b9\u0286\3\2\2\2\u00bb\u0288\3\2\2\2\u00bd\u028a\3\2\2\2\u00bf"+
		"\u028c\3\2\2\2\u00c1\u028e\3\2\2\2\u00c3\u0292\3\2\2\2\u00c5\u0294\3\2"+
		"\2\2\u00c7\u0296\3\2\2\2\u00c9\u02b2\3\2\2\2\u00cb\u02b4\3\2\2\2\u00cd"+
		"\u02b6\3\2\2\2\u00cf\u02ba\3\2\2\2\u00d1\u00d2\7R\2\2\u00d2\u00d3\7C\2"+
		"\2\u00d3\u00d4\7E\2\2\u00d4\u00d5\7M\2\2\u00d5\u00d6\7C\2\2\u00d6\u00d7"+
		"\7I\2\2\u00d7\u00d8\7G\2\2\u00d8\4\3\2\2\2\u00d9\u00da\7K\2\2\u00da\u00db"+
		"\7O\2\2\u00db\u00dc\7R\2\2\u00dc\u00dd\7Q\2\2\u00dd\u00de\7T\2\2\u00de"+
		"\u00df\7V\2\2\u00df\6\3\2\2\2\u00e0\u00e1\7X\2\2\u00e1\u00e2\7C\2\2\u00e2"+
		"\u00e3\7T\2\2\u00e3\b\3\2\2\2\u00e4\u00e5\7E\2\2\u00e5\u00e6\7Q\2\2\u00e6"+
		"\u00e7\7P\2\2\u00e7\u00e8\7U\2\2\u00e8\u00e9\7V\2\2\u00e9\n\3\2\2\2\u00ea"+
		"\u00eb\7P\2\2\u00eb\u00ec\7W\2\2\u00ec\u00ed\7N\2\2\u00ed\u00ee\7N\2\2"+
		"\u00ee\f\3\2\2\2\u00ef\u00f0\7V\2\2\u00f0\u00f1\7T\2\2\u00f1\u00f2\7W"+
		"\2\2\u00f2\u00f3\7G\2\2\u00f3\16\3\2\2\2\u00f4\u00f5\7H\2\2\u00f5\u00f6"+
		"\7C\2\2\u00f6\u00f7\7N\2\2\u00f7\u00f8\7U\2\2\u00f8\u00f9\7G\2\2\u00f9"+
		"\20\3\2\2\2\u00fa\u00fb\7V\2\2\u00fb\u00fc\7J\2\2\u00fc\u00fd\7T\2\2\u00fd"+
		"\u00fe\7Q\2\2\u00fe\u00ff\7Y\2\2\u00ff\22\3\2\2\2\u0100\u0101\7V\2\2\u0101"+
		"\u0102\7T\2\2\u0102\u0103\7[\2\2\u0103\24\3\2\2\2\u0104\u0105\7E\2\2\u0105"+
		"\u0106\7C\2\2\u0106\u0107\7V\2\2\u0107\u0108\7E\2\2\u0108\u0109\7J\2\2"+
		"\u0109\26\3\2\2\2\u010a\u010b\7H\2\2\u010b\u010c\7K\2\2\u010c\u010d\7"+
		"P\2\2\u010d\u010e\7C\2\2\u010e\u010f\7N\2\2\u010f\u0110\7N\2\2\u0110\u0111"+
		"\7[\2\2\u0111\30\3\2\2\2\u0112\u0113\7K\2\2\u0113\u0114\7H\2\2\u0114\32"+
		"\3\2\2\2\u0115\u0116\7G\2\2\u0116\u0117\7N\2\2\u0117\u0118\7U\2\2\u0118"+
		"\u0119\7G\2\2\u0119\34\3\2\2\2\u011a\u011b\7U\2\2\u011b\u011c\7Y\2\2\u011c"+
		"\u011d\7K\2\2\u011d\u011e\7V\2\2\u011e\u011f\7E\2\2\u011f\u0120\7J\2\2"+
		"\u0120\36\3\2\2\2\u0121\u0122\7E\2\2\u0122\u0123\7C\2\2\u0123\u0124\7"+
		"U\2\2\u0124\u0125\7G\2\2\u0125 \3\2\2\2\u0126\u0127\7F\2\2\u0127\u0128"+
		"\7G\2\2\u0128\u0129\7H\2\2\u0129\u012a\7C\2\2\u012a\u012b\7W\2\2\u012b"+
		"\u012c\7N\2\2\u012c\u012d\7V\2\2\u012d\"\3\2\2\2\u012e\u012f\7N\2\2\u012f"+
		"\u0130\7Q\2\2\u0130\u0131\7Q\2\2\u0131\u0132\7R\2\2\u0132$\3\2\2\2\u0133"+
		"\u0134\7F\2\2\u0134\u0135\7Q\2\2\u0135&\3\2\2\2\u0136\u0137\7Y\2\2\u0137"+
		"\u0138\7J\2\2\u0138\u0139\7K\2\2\u0139\u013a\7N\2\2\u013a\u013b\7G\2\2"+
		"\u013b(\3\2\2\2\u013c\u013d\7H\2\2\u013d\u013e\7Q\2\2\u013e\u013f\7T\2"+
		"\2\u013f*\3\2\2\2\u0140\u0141\7H\2\2\u0141\u0142\7Q\2\2\u0142\u0143\7"+
		"T\2\2\u0143\u0144\7G\2\2\u0144\u0145\7C\2\2\u0145\u0146\7E\2\2\u0146\u0147"+
		"\7J\2\2\u0147,\3\2\2\2\u0148\u0149\7K\2\2\u0149\u014a\7P\2\2\u014a.\3"+
		"\2\2\2\u014b\u014c\7E\2\2\u014c\u014d\7Q\2\2\u014d\u014e\7P\2\2\u014e"+
		"\u014f\7V\2\2\u014f\u0150\7K\2\2\u0150\u0151\7P\2\2\u0151\u0152\7W\2\2"+
		"\u0152\u0153\7G\2\2\u0153\60\3\2\2\2\u0154\u0155\7D\2\2\u0155\u0156\7"+
		"T\2\2\u0156\u0157\7G\2\2\u0157\u0158\7C\2\2\u0158\u0159\7M\2\2\u0159\62"+
		"\3\2\2\2\u015a\u015b\7H\2\2\u015b\u015c\7W\2\2\u015c\u015d\7P\2\2\u015d"+
		"\u015e\7E\2\2\u015e\64\3\2\2\2\u015f\u0160\7T\2\2\u0160\u0161\7G\2\2\u0161"+
		"\u0162\7V\2\2\u0162\u0163\7W\2\2\u0163\u0164\7T\2\2\u0164\u0165\7P\2\2"+
		"\u0165\66\3\2\2\2\u0166\u0167\7X\2\2\u0167\u0168\7Q\2\2\u0168\u0169\7"+
		"K\2\2\u0169\u016a\7F\2\2\u016a8\3\2\2\2\u016b\u016c\7G\2\2\u016c\u016d"+
		"\7P\2\2\u016d\u016e\7W\2\2\u016e\u016f\7O\2\2\u016f:\3\2\2\2\u0170\u0171"+
		"\7U\2\2\u0171\u0172\7V\2\2\u0172\u0173\7T\2\2\u0173\u0174\7W\2\2\u0174"+
		"\u0175\7E\2\2\u0175\u0176\7V\2\2\u0176<\3\2\2\2\u0177\u0178\7E\2\2\u0178"+
		"\u0179\7N\2\2\u0179\u017a\7C\2\2\u017a\u017b\7U\2\2\u017b\u017c\7U\2\2"+
		"\u017c>\3\2\2\2\u017d\u017e\7G\2\2\u017e\u017f\7Z\2\2\u017f\u0180\7V\2"+
		"\2\u0180\u0181\7G\2\2\u0181\u0182\7P\2\2\u0182\u0183\7F\2\2\u0183\u0184"+
		"\7U\2\2\u0184@\3\2\2\2\u0185\u0186\7P\2\2\u0186\u0187\7G\2\2\u0187\u0188"+
		"\7Y\2\2\u0188B\3\2\2\2\u0189\u018a\7E\2\2\u018a\u018b\7Q\2\2\u018b\u018c"+
		"\7P\2\2\u018c\u018d\7U\2\2\u018d\u018e\7V\2\2\u018e\u018f\7T\2\2\u018f"+
		"\u0190\7W\2\2\u0190\u0191\7E\2\2\u0191\u0192\7V\2\2\u0192\u0193\7Q\2\2"+
		"\u0193\u0194\7T\2\2\u0194D\3\2\2\2\u0195\u0196\7V\2\2\u0196\u0197\7J\2"+
		"\2\u0197\u0198\7K\2\2\u0198\u0199\7U\2\2\u0199F\3\2\2\2\u019a\u019b\7"+
		"U\2\2\u019b\u019c\7W\2\2\u019c\u019d\7R\2\2\u019d\u019e\7G\2\2\u019e\u019f"+
		"\7T\2\2\u019fH\3\2\2\2\u01a0\u01a1\7K\2\2\u01a1\u01a2\7P\2\2\u01a2\u01a3"+
		"\7V\2\2\u01a3\u01a4\7G\2\2\u01a4\u01a5\7T\2\2\u01a5\u01a6\7H\2\2\u01a6"+
		"\u01a7\7C\2\2\u01a7\u01a8\7E\2\2\u01a8\u01a9\7G\2\2\u01a9J\3\2\2\2\u01aa"+
		"\u01ab\7K\2\2\u01ab\u01ac\7O\2\2\u01ac\u01ad\7R\2\2\u01ad\u01ae\7N\2\2"+
		"\u01ae\u01af\7G\2\2\u01af\u01b0\7O\2\2\u01b0\u01b1\7G\2\2\u01b1\u01b2"+
		"\7P\2\2\u01b2\u01b3\7V\2\2\u01b3\u01b4\7U\2\2\u01b4L\3\2\2\2\u01b5\u01b6"+
		"\7C\2\2\u01b6\u01b7\7P\2\2\u01b7\u01b8\7P\2\2\u01b8\u01b9\7Q\2\2\u01b9"+
		"\u01ba\7V\2\2\u01ba\u01bb\7C\2\2\u01bb\u01bc\7V\2\2\u01bc\u01bd\7K\2\2"+
		"\u01bd\u01be\7Q\2\2\u01be\u01bf\7P\2\2\u01bfN\3\2\2\2\u01c0\u01c2\t\2"+
		"\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4P\3\2\2\2\u01c5\u01c7\t\2\2\2\u01c6\u01c5\3\2\2\2"+
		"\u01c7\u01c8\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca"+
		"\3\2\2\2\u01ca\u01cb\t\3\2\2\u01cbR\3\2\2\2\u01cc\u01ce\t\2\2\2\u01cd"+
		"\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\5\u00b7\\\2\u01d2\u01d4\t\4\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\t\5\2\2\u01d8T\3\2\2\2\u01d9\u01db"+
		"\t\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\5\u00b7\\\2\u01df\u01e1"+
		"\t\4\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3V\3\2\2\2\u01e4\u01e7\7)\2\2\u01e5\u01e8\n\6\2\2\u01e6"+
		"\u01e8\5\u00c9e\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01e9"+
		"\3\2\2\2\u01e9\u01ea\7)\2\2\u01eaX\3\2\2\2\u01eb\u01f0\7$\2\2\u01ec\u01ef"+
		"\n\7\2\2\u01ed\u01ef\5\u00c9e\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2"+
		"\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3"+
		"\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\7$\2\2\u01f4Z\3\2\2\2\u01f5\u01f8"+
		"\5\r\7\2\u01f6\u01f8\5\17\b\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2"+
		"\u01f8\\\3\2\2\2\u01f9\u01fa\5\13\6\2\u01fa^\3\2\2\2\u01fb\u01fc\7#\2"+
		"\2\u01fc`\3\2\2\2\u01fd\u01fe\7\u0080\2\2\u01feb\3\2\2\2\u01ff\u0200\7"+
		"A\2\2\u0200d\3\2\2\2\u0201\u0202\7?\2\2\u0202\u0203\7?\2\2\u0203f\3\2"+
		"\2\2\u0204\u0205\7#\2\2\u0205\u0206\7?\2\2\u0206h\3\2\2\2\u0207\u0208"+
		"\7@\2\2\u0208j\3\2\2\2\u0209\u020a\7>\2\2\u020al\3\2\2\2\u020b\u020c\7"+
		">\2\2\u020c\u020d\7?\2\2\u020dn\3\2\2\2\u020e\u020f\7@\2\2\u020f\u0210"+
		"\7?\2\2\u0210p\3\2\2\2\u0211\u0212\7(\2\2\u0212\u0213\7(\2\2\u0213r\3"+
		"\2\2\2\u0214\u0215\7~\2\2\u0215\u0216\7~\2\2\u0216t\3\2\2\2\u0217\u0218"+
		"\7-\2\2\u0218\u0219\7-\2\2\u0219v\3\2\2\2\u021a\u021b\7/\2\2\u021b\u021c"+
		"\7/\2\2\u021cx\3\2\2\2\u021d\u021e\7-\2\2\u021ez\3\2\2\2\u021f\u0220\7"+
		"/\2\2\u0220|\3\2\2\2\u0221\u0222\7,\2\2\u0222~\3\2\2\2\u0223\u0224\7\61"+
		"\2\2\u0224\u0080\3\2\2\2\u0225\u0226\7(\2\2\u0226\u0082\3\2\2\2\u0227"+
		"\u0228\7~\2\2\u0228\u0084\3\2\2\2\u0229\u022a\7`\2\2\u022a\u0086\3\2\2"+
		"\2\u022b\u022c\7\'\2\2\u022c\u0088\3\2\2\2\u022d\u022e\7>\2\2\u022e\u022f"+
		"\7>\2\2\u022f\u008a\3\2\2\2\u0230\u0231\7@\2\2\u0231\u0232\7@\2\2\u0232"+
		"\u008c\3\2\2\2\u0233\u0234\7?\2\2\u0234\u008e\3\2\2\2\u0235\u0236\7-\2"+
		"\2\u0236\u0237\7?\2\2\u0237\u0090\3\2\2\2\u0238\u0239\7/\2\2\u0239\u023a"+
		"\7?\2\2\u023a\u0092\3\2\2\2\u023b\u023c\7,\2\2\u023c\u023d\7?\2\2\u023d"+
		"\u0094\3\2\2\2\u023e\u023f\7\61\2\2\u023f\u0240\7?\2\2\u0240\u0096\3\2"+
		"\2\2\u0241\u0242\7(\2\2\u0242\u0243\7?\2\2\u0243\u0098\3\2\2\2\u0244\u0245"+
		"\7~\2\2\u0245\u0246\7?\2\2\u0246\u009a\3\2\2\2\u0247\u0248\7`\2\2\u0248"+
		"\u0249\7?\2\2\u0249\u009c\3\2\2\2\u024a\u024b\7\'\2\2\u024b\u024c\7?\2"+
		"\2\u024c\u009e\3\2\2\2\u024d\u024e\7>\2\2\u024e\u024f\7>\2\2\u024f\u0250"+
		"\7?\2\2\u0250\u00a0\3\2\2\2\u0251\u0252\7@\2\2\u0252\u0253\7@\2\2\u0253"+
		"\u0254\7?\2\2\u0254\u00a2\3\2\2\2\u0255\u0256\7?\2\2\u0256\u0257\7@\2"+
		"\2\u0257\u00a4\3\2\2\2\u0258\u0259\7*\2\2\u0259\u00a6\3\2\2\2\u025a\u025b"+
		"\7+\2\2\u025b\u00a8\3\2\2\2\u025c\u025d\7}\2\2\u025d\u00aa\3\2\2\2\u025e"+
		"\u025f\7\177\2\2\u025f\u00ac\3\2\2\2\u0260\u0261\7]\2\2\u0261\u00ae\3"+
		"\2\2\2\u0262\u0263\7_\2\2\u0263\u00b0\3\2\2\2\u0264\u0266\t\b\2\2\u0265"+
		"\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2"+
		"\2\2\u0268\u0269\3\2\2\2\u0269\u026a\bY\2\2\u026a\u00b2\3\2\2\2\u026b"+
		"\u026c\7\61\2\2\u026c\u026d\7,\2\2\u026d\u0271\3\2\2\2\u026e\u0270\13"+
		"\2\2\2\u026f\u026e\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u0272\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0275\7,"+
		"\2\2\u0275\u0276\7\61\2\2\u0276\u0277\3\2\2\2\u0277\u0278\bZ\2\2\u0278"+
		"\u00b4\3\2\2\2\u0279\u027a\7\61\2\2\u027a\u027b\7\61\2\2\u027b\u027f\3"+
		"\2\2\2\u027c\u027e\n\t\2\2\u027d\u027c\3\2\2\2\u027e\u0281\3\2\2\2\u027f"+
		"\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u027f\3\2"+
		"\2\2\u0282\u0283\b[\2\2\u0283\u00b6\3\2\2\2\u0284\u0285\7\60\2\2\u0285"+
		"\u00b8\3\2\2\2\u0286\u0287\7.\2\2\u0287\u00ba\3\2\2\2\u0288\u0289\7=\2"+
		"\2\u0289\u00bc\3\2\2\2\u028a\u028b\7<\2\2\u028b\u00be\3\2\2\2\u028c\u028d"+
		"\7B\2\2\u028d\u00c0\3\2\2\2\u028e\u028f\7\60\2\2\u028f\u0290\7\60\2\2"+
		"\u0290\u0291\7\60\2\2\u0291\u00c2\3\2\2\2\u0292\u0293\7\f\2\2\u0293\u00c4"+
		"\3\2\2\2\u0294\u0295\7\17\2\2\u0295\u00c6\3\2\2\2\u0296\u029a\5\u00cd"+
		"g\2\u0297\u0299\5\u00cfh\2\u0298\u0297\3\2\2\2\u0299\u029c\3\2\2\2\u029a"+
		"\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u00c8\3\2\2\2\u029c\u029a\3\2"+
		"\2\2\u029d\u029e\7^\2\2\u029e\u02b3\t\n\2\2\u029f\u02a4\7^\2\2\u02a0\u02a2"+
		"\t\13\2\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2"+
		"\u02a3\u02a5\t\f\2\2\u02a4\u02a1\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6"+
		"\3\2\2\2\u02a6\u02b3\t\f\2\2\u02a7\u02a9\7^\2\2\u02a8\u02aa\7w\2\2\u02a9"+
		"\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\5\u00cbf\2\u02ae\u02af\5\u00cbf\2"+
		"\u02af\u02b0\5\u00cbf\2\u02b0\u02b1\5\u00cbf\2\u02b1\u02b3\3\2\2\2\u02b2"+
		"\u029d\3\2\2\2\u02b2\u029f\3\2\2\2\u02b2\u02a7\3\2\2\2\u02b3\u00ca\3\2"+
		"\2\2\u02b4\u02b5\t\r\2\2\u02b5\u00cc\3\2\2\2\u02b6\u02b7\t\16\2\2\u02b7"+
		"\u00ce\3\2\2\2\u02b8\u02bb\5\u00cdg\2\u02b9\u02bb\t\2\2\2\u02ba\u02b8"+
		"\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bb\u00d0\3\2\2\2\26\2\u01c3\u01c8\u01cf"+
		"\u01d5\u01dc\u01e2\u01e7\u01ee\u01f0\u01f7\u0267\u0271\u027f\u029a\u02a1"+
		"\u02a4\u02ab\u02b2\u02ba\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}