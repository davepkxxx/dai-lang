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
			"SEMI", "COLON", "AT", "ELLIPSIS", "IDENTIFIER", "EscapeSequence", "HexDigit", 
			"Letter", "LetterOrDigit"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2_\u029a\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3\'\6\'\u01ae\n\'\r\'\16\'\u01af\3(\6(\u01b3\n(\r"+
		"(\16(\u01b4\3(\3(\3)\6)\u01ba\n)\r)\16)\u01bb\3)\3)\6)\u01c0\n)\r)\16"+
		")\u01c1\3)\3)\3*\6*\u01c7\n*\r*\16*\u01c8\3*\3*\6*\u01cd\n*\r*\16*\u01ce"+
		"\3+\3+\3+\5+\u01d4\n+\3+\3+\3,\3,\3,\7,\u01db\n,\f,\16,\u01de\13,\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38"+
		"\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C"+
		"\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K"+
		"\3K\3K\3K\3L\3L\3L\3L\3M\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T"+
		"\3T\3T\3T\3U\3U\3U\5U\u024c\nU\3V\3V\3V\3V\7V\u0252\nV\fV\16V\u0255\13"+
		"V\3V\3V\3V\3V\3V\3W\3W\3W\3W\7W\u0260\nW\fW\16W\u0263\13W\3W\3W\3X\3X"+
		"\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3]\3]\3^\3^\7^\u0277\n^\f^\16^\u027a"+
		"\13^\3_\3_\3_\3_\5_\u0280\n_\3_\5_\u0283\n_\3_\3_\3_\6_\u0288\n_\r_\16"+
		"_\u0289\3_\3_\3_\3_\3_\5_\u0291\n_\3`\3`\3a\3a\3b\3b\5b\u0299\nb\3\u0253"+
		"\2c\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5"+
		"\\\u00b7]\u00b9^\u00bb_\u00bd\2\u00bf\2\u00c1\2\u00c3\2\3\2\17\3\2\62"+
		";\3\2nn\3\2\62\62\3\2hh\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\5\2\13\13"+
		"\16\16\"\"\4\2\f\f\17\17\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\62"+
		";CHch\6\2&&C\\aac|\2\u02a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7"+
		"\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\3\u00c5\3\2\2\2\5\u00cd\3\2\2"+
		"\2\7\u00d4\3\2\2\2\t\u00d8\3\2\2\2\13\u00de\3\2\2\2\r\u00e3\3\2\2\2\17"+
		"\u00e8\3\2\2\2\21\u00ee\3\2\2\2\23\u00f4\3\2\2\2\25\u00f8\3\2\2\2\27\u00fe"+
		"\3\2\2\2\31\u0106\3\2\2\2\33\u0109\3\2\2\2\35\u010e\3\2\2\2\37\u0115\3"+
		"\2\2\2!\u011a\3\2\2\2#\u0122\3\2\2\2%\u0127\3\2\2\2\'\u012a\3\2\2\2)\u0130"+
		"\3\2\2\2+\u0134\3\2\2\2-\u0137\3\2\2\2/\u0140\3\2\2\2\61\u0146\3\2\2\2"+
		"\63\u014b\3\2\2\2\65\u0152\3\2\2\2\67\u0157\3\2\2\29\u015c\3\2\2\2;\u0163"+
		"\3\2\2\2=\u0169\3\2\2\2?\u0171\3\2\2\2A\u0175\3\2\2\2C\u0181\3\2\2\2E"+
		"\u0186\3\2\2\2G\u018c\3\2\2\2I\u0196\3\2\2\2K\u01a1\3\2\2\2M\u01ad\3\2"+
		"\2\2O\u01b2\3\2\2\2Q\u01b9\3\2\2\2S\u01c6\3\2\2\2U\u01d0\3\2\2\2W\u01d7"+
		"\3\2\2\2Y\u01e1\3\2\2\2[\u01e3\3\2\2\2]\u01e5\3\2\2\2_\u01e7\3\2\2\2a"+
		"\u01ea\3\2\2\2c\u01ed\3\2\2\2e\u01ef\3\2\2\2g\u01f1\3\2\2\2i\u01f4\3\2"+
		"\2\2k\u01f7\3\2\2\2m\u01fa\3\2\2\2o\u01fd\3\2\2\2q\u0200\3\2\2\2s\u0203"+
		"\3\2\2\2u\u0205\3\2\2\2w\u0207\3\2\2\2y\u0209\3\2\2\2{\u020b\3\2\2\2}"+
		"\u020d\3\2\2\2\177\u020f\3\2\2\2\u0081\u0211\3\2\2\2\u0083\u0213\3\2\2"+
		"\2\u0085\u0215\3\2\2\2\u0087\u0218\3\2\2\2\u0089\u021b\3\2\2\2\u008b\u021e"+
		"\3\2\2\2\u008d\u0221\3\2\2\2\u008f\u0224\3\2\2\2\u0091\u0227\3\2\2\2\u0093"+
		"\u022a\3\2\2\2\u0095\u022d\3\2\2\2\u0097\u0231\3\2\2\2\u0099\u0235\3\2"+
		"\2\2\u009b\u0238\3\2\2\2\u009d\u023a\3\2\2\2\u009f\u023c\3\2\2\2\u00a1"+
		"\u023e\3\2\2\2\u00a3\u0240\3\2\2\2\u00a5\u0242\3\2\2\2\u00a7\u0244\3\2"+
		"\2\2\u00a9\u024b\3\2\2\2\u00ab\u024d\3\2\2\2\u00ad\u025b\3\2\2\2\u00af"+
		"\u0266\3\2\2\2\u00b1\u0268\3\2\2\2\u00b3\u026a\3\2\2\2\u00b5\u026c\3\2"+
		"\2\2\u00b7\u026e\3\2\2\2\u00b9\u0270\3\2\2\2\u00bb\u0274\3\2\2\2\u00bd"+
		"\u0290\3\2\2\2\u00bf\u0292\3\2\2\2\u00c1\u0294\3\2\2\2\u00c3\u0298\3\2"+
		"\2\2\u00c5\u00c6\7R\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\7E\2\2\u00c8\u00c9"+
		"\7M\2\2\u00c9\u00ca\7C\2\2\u00ca\u00cb\7I\2\2\u00cb\u00cc\7G\2\2\u00cc"+
		"\4\3\2\2\2\u00cd\u00ce\7K\2\2\u00ce\u00cf\7O\2\2\u00cf\u00d0\7R\2\2\u00d0"+
		"\u00d1\7Q\2\2\u00d1\u00d2\7T\2\2\u00d2\u00d3\7V\2\2\u00d3\6\3\2\2\2\u00d4"+
		"\u00d5\7X\2\2\u00d5\u00d6\7C\2\2\u00d6\u00d7\7T\2\2\u00d7\b\3\2\2\2\u00d8"+
		"\u00d9\7E\2\2\u00d9\u00da\7Q\2\2\u00da\u00db\7P\2\2\u00db\u00dc\7U\2\2"+
		"\u00dc\u00dd\7V\2\2\u00dd\n\3\2\2\2\u00de\u00df\7P\2\2\u00df\u00e0\7W"+
		"\2\2\u00e0\u00e1\7N\2\2\u00e1\u00e2\7N\2\2\u00e2\f\3\2\2\2\u00e3\u00e4"+
		"\7V\2\2\u00e4\u00e5\7T\2\2\u00e5\u00e6\7W\2\2\u00e6\u00e7\7G\2\2\u00e7"+
		"\16\3\2\2\2\u00e8\u00e9\7H\2\2\u00e9\u00ea\7C\2\2\u00ea\u00eb\7N\2\2\u00eb"+
		"\u00ec\7U\2\2\u00ec\u00ed\7G\2\2\u00ed\20\3\2\2\2\u00ee\u00ef\7V\2\2\u00ef"+
		"\u00f0\7J\2\2\u00f0\u00f1\7T\2\2\u00f1\u00f2\7Q\2\2\u00f2\u00f3\7Y\2\2"+
		"\u00f3\22\3\2\2\2\u00f4\u00f5\7V\2\2\u00f5\u00f6\7T\2\2\u00f6\u00f7\7"+
		"[\2\2\u00f7\24\3\2\2\2\u00f8\u00f9\7E\2\2\u00f9\u00fa\7C\2\2\u00fa\u00fb"+
		"\7V\2\2\u00fb\u00fc\7E\2\2\u00fc\u00fd\7J\2\2\u00fd\26\3\2\2\2\u00fe\u00ff"+
		"\7H\2\2\u00ff\u0100\7K\2\2\u0100\u0101\7P\2\2\u0101\u0102\7C\2\2\u0102"+
		"\u0103\7N\2\2\u0103\u0104\7N\2\2\u0104\u0105\7[\2\2\u0105\30\3\2\2\2\u0106"+
		"\u0107\7K\2\2\u0107\u0108\7H\2\2\u0108\32\3\2\2\2\u0109\u010a\7G\2\2\u010a"+
		"\u010b\7N\2\2\u010b\u010c\7U\2\2\u010c\u010d\7G\2\2\u010d\34\3\2\2\2\u010e"+
		"\u010f\7U\2\2\u010f\u0110\7Y\2\2\u0110\u0111\7K\2\2\u0111\u0112\7V\2\2"+
		"\u0112\u0113\7E\2\2\u0113\u0114\7J\2\2\u0114\36\3\2\2\2\u0115\u0116\7"+
		"E\2\2\u0116\u0117\7C\2\2\u0117\u0118\7U\2\2\u0118\u0119\7G\2\2\u0119 "+
		"\3\2\2\2\u011a\u011b\7F\2\2\u011b\u011c\7G\2\2\u011c\u011d\7H\2\2\u011d"+
		"\u011e\7C\2\2\u011e\u011f\7W\2\2\u011f\u0120\7N\2\2\u0120\u0121\7V\2\2"+
		"\u0121\"\3\2\2\2\u0122\u0123\7N\2\2\u0123\u0124\7Q\2\2\u0124\u0125\7Q"+
		"\2\2\u0125\u0126\7R\2\2\u0126$\3\2\2\2\u0127\u0128\7F\2\2\u0128\u0129"+
		"\7Q\2\2\u0129&\3\2\2\2\u012a\u012b\7Y\2\2\u012b\u012c\7J\2\2\u012c\u012d"+
		"\7K\2\2\u012d\u012e\7N\2\2\u012e\u012f\7G\2\2\u012f(\3\2\2\2\u0130\u0131"+
		"\7H\2\2\u0131\u0132\7Q\2\2\u0132\u0133\7T\2\2\u0133*\3\2\2\2\u0134\u0135"+
		"\7K\2\2\u0135\u0136\7P\2\2\u0136,\3\2\2\2\u0137\u0138\7E\2\2\u0138\u0139"+
		"\7Q\2\2\u0139\u013a\7P\2\2\u013a\u013b\7V\2\2\u013b\u013c\7K\2\2\u013c"+
		"\u013d\7P\2\2\u013d\u013e\7W\2\2\u013e\u013f\7G\2\2\u013f.\3\2\2\2\u0140"+
		"\u0141\7D\2\2\u0141\u0142\7T\2\2\u0142\u0143\7G\2\2\u0143\u0144\7C\2\2"+
		"\u0144\u0145\7M\2\2\u0145\60\3\2\2\2\u0146\u0147\7H\2\2\u0147\u0148\7"+
		"W\2\2\u0148\u0149\7P\2\2\u0149\u014a\7E\2\2\u014a\62\3\2\2\2\u014b\u014c"+
		"\7T\2\2\u014c\u014d\7G\2\2\u014d\u014e\7V\2\2\u014e\u014f\7W\2\2\u014f"+
		"\u0150\7T\2\2\u0150\u0151\7P\2\2\u0151\64\3\2\2\2\u0152\u0153\7X\2\2\u0153"+
		"\u0154\7Q\2\2\u0154\u0155\7K\2\2\u0155\u0156\7F\2\2\u0156\66\3\2\2\2\u0157"+
		"\u0158\7G\2\2\u0158\u0159\7P\2\2\u0159\u015a\7W\2\2\u015a\u015b\7O\2\2"+
		"\u015b8\3\2\2\2\u015c\u015d\7U\2\2\u015d\u015e\7V\2\2\u015e\u015f\7T\2"+
		"\2\u015f\u0160\7W\2\2\u0160\u0161\7E\2\2\u0161\u0162\7V\2\2\u0162:\3\2"+
		"\2\2\u0163\u0164\7E\2\2\u0164\u0165\7N\2\2\u0165\u0166\7C\2\2\u0166\u0167"+
		"\7U\2\2\u0167\u0168\7U\2\2\u0168<\3\2\2\2\u0169\u016a\7G\2\2\u016a\u016b"+
		"\7Z\2\2\u016b\u016c\7V\2\2\u016c\u016d\7G\2\2\u016d\u016e\7P\2\2\u016e"+
		"\u016f\7F\2\2\u016f\u0170\7U\2\2\u0170>\3\2\2\2\u0171\u0172\7P\2\2\u0172"+
		"\u0173\7G\2\2\u0173\u0174\7Y\2\2\u0174@\3\2\2\2\u0175\u0176\7E\2\2\u0176"+
		"\u0177\7Q\2\2\u0177\u0178\7P\2\2\u0178\u0179\7U\2\2\u0179\u017a\7V\2\2"+
		"\u017a\u017b\7T\2\2\u017b\u017c\7W\2\2\u017c\u017d\7E\2\2\u017d\u017e"+
		"\7V\2\2\u017e\u017f\7Q\2\2\u017f\u0180\7T\2\2\u0180B\3\2\2\2\u0181\u0182"+
		"\7V\2\2\u0182\u0183\7J\2\2\u0183\u0184\7K\2\2\u0184\u0185\7U\2\2\u0185"+
		"D\3\2\2\2\u0186\u0187\7U\2\2\u0187\u0188\7W\2\2\u0188\u0189\7R\2\2\u0189"+
		"\u018a\7G\2\2\u018a\u018b\7T\2\2\u018bF\3\2\2\2\u018c\u018d\7K\2\2\u018d"+
		"\u018e\7P\2\2\u018e\u018f\7V\2\2\u018f\u0190\7G\2\2\u0190\u0191\7T\2\2"+
		"\u0191\u0192\7H\2\2\u0192\u0193\7C\2\2\u0193\u0194\7E\2\2\u0194\u0195"+
		"\7G\2\2\u0195H\3\2\2\2\u0196\u0197\7K\2\2\u0197\u0198\7O\2\2\u0198\u0199"+
		"\7R\2\2\u0199\u019a\7N\2\2\u019a\u019b\7G\2\2\u019b\u019c\7O\2\2\u019c"+
		"\u019d\7G\2\2\u019d\u019e\7P\2\2\u019e\u019f\7V\2\2\u019f\u01a0\7U\2\2"+
		"\u01a0J\3\2\2\2\u01a1\u01a2\7C\2\2\u01a2\u01a3\7P\2\2\u01a3\u01a4\7P\2"+
		"\2\u01a4\u01a5\7Q\2\2\u01a5\u01a6\7V\2\2\u01a6\u01a7\7C\2\2\u01a7\u01a8"+
		"\7V\2\2\u01a8\u01a9\7K\2\2\u01a9\u01aa\7Q\2\2\u01aa\u01ab\7P\2\2\u01ab"+
		"L\3\2\2\2\u01ac\u01ae\t\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2"+
		"\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0N\3\2\2\2\u01b1\u01b3\t"+
		"\2\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\t\3\2\2\u01b7P\3\2\2\2"+
		"\u01b8\u01ba\t\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\5\u00afX"+
		"\2\u01be\u01c0\t\4\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf"+
		"\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\t\5\2\2\u01c4"+
		"R\3\2\2\2\u01c5\u01c7\t\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2"+
		"\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc"+
		"\5\u00afX\2\u01cb\u01cd\t\4\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2"+
		"\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cfT\3\2\2\2\u01d0\u01d3"+
		"\7)\2\2\u01d1\u01d4\n\6\2\2\u01d2\u01d4\5\u00bd_\2\u01d3\u01d1\3\2\2\2"+
		"\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\7)\2\2\u01d6V\3\2"+
		"\2\2\u01d7\u01dc\7$\2\2\u01d8\u01db\n\7\2\2\u01d9\u01db\5\u00bd_\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2"+
		"\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01e0\7$\2\2\u01e0X\3\2\2\2\u01e1\u01e2\7#\2\2\u01e2Z\3\2\2\2\u01e3\u01e4"+
		"\7\u0080\2\2\u01e4\\\3\2\2\2\u01e5\u01e6\7A\2\2\u01e6^\3\2\2\2\u01e7\u01e8"+
		"\7?\2\2\u01e8\u01e9\7?\2\2\u01e9`\3\2\2\2\u01ea\u01eb\7#\2\2\u01eb\u01ec"+
		"\7?\2\2\u01ecb\3\2\2\2\u01ed\u01ee\7@\2\2\u01eed\3\2\2\2\u01ef\u01f0\7"+
		">\2\2\u01f0f\3\2\2\2\u01f1\u01f2\7>\2\2\u01f2\u01f3\7?\2\2\u01f3h\3\2"+
		"\2\2\u01f4\u01f5\7@\2\2\u01f5\u01f6\7?\2\2\u01f6j\3\2\2\2\u01f7\u01f8"+
		"\7(\2\2\u01f8\u01f9\7(\2\2\u01f9l\3\2\2\2\u01fa\u01fb\7~\2\2\u01fb\u01fc"+
		"\7~\2\2\u01fcn\3\2\2\2\u01fd\u01fe\7-\2\2\u01fe\u01ff\7-\2\2\u01ffp\3"+
		"\2\2\2\u0200\u0201\7/\2\2\u0201\u0202\7/\2\2\u0202r\3\2\2\2\u0203\u0204"+
		"\7-\2\2\u0204t\3\2\2\2\u0205\u0206\7/\2\2\u0206v\3\2\2\2\u0207\u0208\7"+
		",\2\2\u0208x\3\2\2\2\u0209\u020a\7\61\2\2\u020az\3\2\2\2\u020b\u020c\7"+
		"(\2\2\u020c|\3\2\2\2\u020d\u020e\7~\2\2\u020e~\3\2\2\2\u020f\u0210\7`"+
		"\2\2\u0210\u0080\3\2\2\2\u0211\u0212\7\'\2\2\u0212\u0082\3\2\2\2\u0213"+
		"\u0214\7?\2\2\u0214\u0084\3\2\2\2\u0215\u0216\7-\2\2\u0216\u0217\7?\2"+
		"\2\u0217\u0086\3\2\2\2\u0218\u0219\7/\2\2\u0219\u021a\7?\2\2\u021a\u0088"+
		"\3\2\2\2\u021b\u021c\7,\2\2\u021c\u021d\7?\2\2\u021d\u008a\3\2\2\2\u021e"+
		"\u021f\7\61\2\2\u021f\u0220\7?\2\2\u0220\u008c\3\2\2\2\u0221\u0222\7("+
		"\2\2\u0222\u0223\7?\2\2\u0223\u008e\3\2\2\2\u0224\u0225\7~\2\2\u0225\u0226"+
		"\7?\2\2\u0226\u0090\3\2\2\2\u0227\u0228\7`\2\2\u0228\u0229\7?\2\2\u0229"+
		"\u0092\3\2\2\2\u022a\u022b\7\'\2\2\u022b\u022c\7?\2\2\u022c\u0094\3\2"+
		"\2\2\u022d\u022e\7>\2\2\u022e\u022f\7>\2\2\u022f\u0230\7?\2\2\u0230\u0096"+
		"\3\2\2\2\u0231\u0232\7@\2\2\u0232\u0233\7@\2\2\u0233\u0234\7?\2\2\u0234"+
		"\u0098\3\2\2\2\u0235\u0236\7?\2\2\u0236\u0237\7@\2\2\u0237\u009a\3\2\2"+
		"\2\u0238\u0239\7*\2\2\u0239\u009c\3\2\2\2\u023a\u023b\7+\2\2\u023b\u009e"+
		"\3\2\2\2\u023c\u023d\7}\2\2\u023d\u00a0\3\2\2\2\u023e\u023f\7\177\2\2"+
		"\u023f\u00a2\3\2\2\2\u0240\u0241\7]\2\2\u0241\u00a4\3\2\2\2\u0242\u0243"+
		"\7_\2\2\u0243\u00a6\3\2\2\2\u0244\u0245\t\b\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0247\bT\2\2\u0247\u00a8\3\2\2\2\u0248\u024c\7\f\2\2\u0249\u024a\7\17"+
		"\2\2\u024a\u024c\7\f\2\2\u024b\u0248\3\2\2\2\u024b\u0249\3\2\2\2\u024c"+
		"\u00aa\3\2\2\2\u024d\u024e\7\61\2\2\u024e\u024f\7,\2\2\u024f\u0253\3\2"+
		"\2\2\u0250\u0252\13\2\2\2\u0251\u0250\3\2\2\2\u0252\u0255\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0253\3\2"+
		"\2\2\u0256\u0257\7,\2\2\u0257\u0258\7\61\2\2\u0258\u0259\3\2\2\2\u0259"+
		"\u025a\bV\3\2\u025a\u00ac\3\2\2\2\u025b\u025c\7\61\2\2\u025c\u025d\7\61"+
		"\2\2\u025d\u0261\3\2\2\2\u025e\u0260\n\t\2\2\u025f\u025e\3\2\2\2\u0260"+
		"\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2"+
		"\2\2\u0263\u0261\3\2\2\2\u0264\u0265\bW\3\2\u0265\u00ae\3\2\2\2\u0266"+
		"\u0267\7\60\2\2\u0267\u00b0\3\2\2\2\u0268\u0269\7.\2\2\u0269\u00b2\3\2"+
		"\2\2\u026a\u026b\7=\2\2\u026b\u00b4\3\2\2\2\u026c\u026d\7<\2\2\u026d\u00b6"+
		"\3\2\2\2\u026e\u026f\7B\2\2\u026f\u00b8\3\2\2\2\u0270\u0271\7\60\2\2\u0271"+
		"\u0272\7\60\2\2\u0272\u0273\7\60\2\2\u0273\u00ba\3\2\2\2\u0274\u0278\5"+
		"\u00c1a\2\u0275\u0277\5\u00c3b\2\u0276\u0275\3\2\2\2\u0277\u027a\3\2\2"+
		"\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u00bc\3\2\2\2\u027a\u0278"+
		"\3\2\2\2\u027b\u027c\7^\2\2\u027c\u0291\t\n\2\2\u027d\u0282\7^\2\2\u027e"+
		"\u0280\t\13\2\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3"+
		"\2\2\2\u0281\u0283\t\f\2\2\u0282\u027f\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u0291\t\f\2\2\u0285\u0287\7^\2\2\u0286\u0288\7w\2"+
		"\2\u0287\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a"+
		"\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\5\u00bf`\2\u028c\u028d\5\u00bf"+
		"`\2\u028d\u028e\5\u00bf`\2\u028e\u028f\5\u00bf`\2\u028f\u0291\3\2\2\2"+
		"\u0290\u027b\3\2\2\2\u0290\u027d\3\2\2\2\u0290\u0285\3\2\2\2\u0291\u00be"+
		"\3\2\2\2\u0292\u0293\t\r\2\2\u0293\u00c0\3\2\2\2\u0294\u0295\t\16\2\2"+
		"\u0295\u00c2\3\2\2\2\u0296\u0299\5\u00c1a\2\u0297\u0299\t\2\2\2\u0298"+
		"\u0296\3\2\2\2\u0298\u0297\3\2\2\2\u0299\u00c4\3\2\2\2\25\2\u01af\u01b4"+
		"\u01bb\u01c1\u01c8\u01ce\u01d3\u01da\u01dc\u024b\u0253\u0261\u0278\u027f"+
		"\u0282\u0289\u0290\u0298\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}