// Generated from D:/JB/IDEA/UNI_LAB1_V1/src/main/antlr4/uni/makarov/parser\Grammar.g4 by ANTLR 4.9.1
package parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUMBER=2, EXP=3, MULTIPLY=4, DIVIDE=5, SUB=6, ADD=7, MOD=8, DIV=9, 
		MMAX=10, MMIN=11, WORD=12, CELL_COL=13, CELL_ROW=14, ID=15, LPAREN=16, 
		RPAREN=17, WS=18, ANY=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "LETTER", "DIGIT", "NUMBER", "EXP", "MULTIPLY", "DIVIDE", "SUB", 
			"ADD", "MOD", "DIV", "MMAX", "MMIN", "WORD", "CELL_COL", "CELL_ROW", 
			"ID", "LPAREN", "RPAREN", "WS", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'^'", "'*'", "'/'", "'-'", "'+'", "'mod'", "'div'", 
			"'mmax'", "'mmin'", null, null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NUMBER", "EXP", "MULTIPLY", "DIVIDE", "SUB", "ADD", "MOD", 
			"DIV", "MMAX", "MMIN", "WORD", "CELL_COL", "CELL_ROW", "ID", "LPAREN", 
			"RPAREN", "WS", "ANY"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\5"+
		"\5\65\n\5\3\5\7\58\n\5\f\5\16\5;\13\5\3\5\5\5>\n\5\3\5\6\5A\n\5\r\5\16"+
		"\5B\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\6\17b\n\17"+
		"\r\17\16\17c\3\20\6\20g\n\20\r\20\16\20h\3\21\6\21l\n\21\r\21\16\21m\3"+
		"\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\2\2\27"+
		"\3\3\5\2\7\2\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37"+
		"\17!\20#\21%\22\'\23)\24+\25\3\2\6\4\2C\\c|\3\2\62;\3\2C\\\5\2\13\f\17"+
		"\17\"\"\2\u0080\2\3\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3"+
		"\2\2\2\t\64\3\2\2\2\13D\3\2\2\2\rF\3\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23"+
		"L\3\2\2\2\25N\3\2\2\2\27R\3\2\2\2\31V\3\2\2\2\33[\3\2\2\2\35a\3\2\2\2"+
		"\37f\3\2\2\2!k\3\2\2\2#o\3\2\2\2%r\3\2\2\2\'t\3\2\2\2)v\3\2\2\2+z\3\2"+
		"\2\2-.\7.\2\2.\4\3\2\2\2/\60\t\2\2\2\60\6\3\2\2\2\61\62\t\3\2\2\62\b\3"+
		"\2\2\2\63\65\7/\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65=\3\2\2\2\668\5\7\4"+
		"\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<"+
		">\7\60\2\2=9\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\5\7\4\2@?\3\2\2\2AB\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2C\n\3\2\2\2DE\7`\2\2E\f\3\2\2\2FG\7,\2\2G\16\3\2\2"+
		"\2HI\7\61\2\2I\20\3\2\2\2JK\7/\2\2K\22\3\2\2\2LM\7-\2\2M\24\3\2\2\2NO"+
		"\7o\2\2OP\7q\2\2PQ\7f\2\2Q\26\3\2\2\2RS\7f\2\2ST\7k\2\2TU\7x\2\2U\30\3"+
		"\2\2\2VW\7o\2\2WX\7o\2\2XY\7c\2\2YZ\7z\2\2Z\32\3\2\2\2[\\\7o\2\2\\]\7"+
		"o\2\2]^\7k\2\2^_\7p\2\2_\34\3\2\2\2`b\5\5\3\2a`\3\2\2\2bc\3\2\2\2ca\3"+
		"\2\2\2cd\3\2\2\2d\36\3\2\2\2eg\t\4\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2h"+
		"i\3\2\2\2i \3\2\2\2jl\5\7\4\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2"+
		"n\"\3\2\2\2op\5\37\20\2pq\5!\21\2q$\3\2\2\2rs\7*\2\2s&\3\2\2\2tu\7+\2"+
		"\2u(\3\2\2\2vw\t\5\2\2wx\3\2\2\2xy\b\25\2\2y*\3\2\2\2z{\13\2\2\2{,\3\2"+
		"\2\2\n\2\649=Bchm\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}