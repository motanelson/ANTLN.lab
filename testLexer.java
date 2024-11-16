// Generated from test.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, VALUE=12, INT=13, FLOAT=14, STRING=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "ID", "VALUE", "INT", "FLOAT", "STRING", "DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mul '", "','", "'add '", "'sub '", "'div '", "'mov '", "'integer'", 
			"'float'", "'string'", "'def'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"VALUE", "INT", "FLOAT", "STRING", "WS"
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


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\7\f\\\n\f\f\f\16\f_\13\f\3\r\3\r\3\r\5\rd\n\r\3\16\6"+
		"\16g\n\16\r\16\16\16h\3\17\6\17l\n\17\r\17\16\17m\3\17\3\17\7\17r\n\17"+
		"\f\17\16\17u\13\17\3\20\3\20\6\20y\n\20\r\20\16\20z\3\20\3\20\3\21\3\21"+
		"\3\22\6\22\u0082\n\22\r\22\16\22\u0083\3\22\3\22\2\2\23\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\22\3"+
		"\2\7\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\f\17\17\3\2\62;\6\2\13\f\17\17\""+
		"\"==\2\u008d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2"+
		"\2\2\3%\3\2\2\2\5*\3\2\2\2\7,\3\2\2\2\t\61\3\2\2\2\13\66\3\2\2\2\r;\3"+
		"\2\2\2\17@\3\2\2\2\21H\3\2\2\2\23N\3\2\2\2\25U\3\2\2\2\27Y\3\2\2\2\31"+
		"c\3\2\2\2\33f\3\2\2\2\35k\3\2\2\2\37v\3\2\2\2!~\3\2\2\2#\u0081\3\2\2\2"+
		"%&\7o\2\2&\'\7w\2\2\'(\7n\2\2()\7\"\2\2)\4\3\2\2\2*+\7.\2\2+\6\3\2\2\2"+
		",-\7c\2\2-.\7f\2\2./\7f\2\2/\60\7\"\2\2\60\b\3\2\2\2\61\62\7u\2\2\62\63"+
		"\7w\2\2\63\64\7d\2\2\64\65\7\"\2\2\65\n\3\2\2\2\66\67\7f\2\2\678\7k\2"+
		"\289\7x\2\29:\7\"\2\2:\f\3\2\2\2;<\7o\2\2<=\7q\2\2=>\7x\2\2>?\7\"\2\2"+
		"?\16\3\2\2\2@A\7k\2\2AB\7p\2\2BC\7v\2\2CD\7g\2\2DE\7i\2\2EF\7g\2\2FG\7"+
		"t\2\2G\20\3\2\2\2HI\7h\2\2IJ\7n\2\2JK\7q\2\2KL\7c\2\2LM\7v\2\2M\22\3\2"+
		"\2\2NO\7u\2\2OP\7v\2\2PQ\7t\2\2QR\7k\2\2RS\7p\2\2ST\7i\2\2T\24\3\2\2\2"+
		"UV\7f\2\2VW\7g\2\2WX\7h\2\2X\26\3\2\2\2Y]\t\2\2\2Z\\\t\3\2\2[Z\3\2\2\2"+
		"\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\30\3\2\2\2_]\3\2\2\2`d\5\33\16\2ad\5"+
		"\35\17\2bd\5\37\20\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\32\3\2\2\2eg\5!\21"+
		"\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\34\3\2\2\2jl\5!\21\2kj\3\2"+
		"\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2os\7\60\2\2pr\5!\21\2qp\3"+
		"\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\36\3\2\2\2us\3\2\2\2vx\7$\2\2wy"+
		"\n\4\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7$\2\2} "+
		"\3\2\2\2~\177\t\5\2\2\177\"\3\2\2\2\u0080\u0082\t\6\2\2\u0081\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\b\22\2\2\u0086$\3\2\2\2\n\2]chmsz\u0083\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}