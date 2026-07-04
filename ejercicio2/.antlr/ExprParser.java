// Generated from c:/Users/EV/Documentos/isc/LyA II/semana 2/examen_p2/ejercicio2/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, FINAL=2, CLASS=3, THROW=4, NEW=5, PRIVATE=6, PROTECTED=7, TRY=8, 
		CATCH=9, FINALLY=10, IF=11, ELSE=12, FOR=13, WHILE=14, DO=15, VOID=16, 
		INT=17, DOUBLE=18, FLOAT=19, IMPORT=20, EXTENDS=21, IMPLEMENTS=22, THIS=23, 
		PACKAGE=24, OVERRIDE=25, SUPER=26, AND=27, OR=28, NOT=29, COMA=30, PUNTO=31, 
		SEMIC=32, COR_A=33, COR_C=34, PAR_A=35, PAR_C=36, LLA_A=37, LLA_C=38, 
		IGUAL=39, MAYOR_QUE=40, MAYOR_IGUAL=41, MENOR_QUE=42, MENOR_IGUAL=43, 
		DIFERENTE=44, ASIG=45, MAS=46, MENOS=47, POR=48, ENTRE=49, MODU=50, STRING=51, 
		NUM_INT=52, NUM_REAL=53, IDF=54, WS=55;
	public static final int
		RULE_root = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'final'", "'class'", "'throw'", "'new'", "'private'", 
			"'protected'", "'try'", "'catch'", "'finally'", "'if'", "'else'", "'for'", 
			"'while'", "'do'", "'void'", "'int'", "'double'", "'float'", "'import'", 
			"'extends'", "'implements'", "'this'", "'package'", "'@Override'", "'super'", 
			"'&&'", "'||'", "'!'", "','", "'.'", "';'", "'['", "']'", "'('", "')'", 
			"'{'", "'}'", "'=='", "'>'", "'>='", "'<'", "'<='", "'!='", "'='", "'+'", 
			"'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "FINAL", "CLASS", "THROW", "NEW", "PRIVATE", "PROTECTED", 
			"TRY", "CATCH", "FINALLY", "IF", "ELSE", "FOR", "WHILE", "DO", "VOID", 
			"INT", "DOUBLE", "FLOAT", "IMPORT", "EXTENDS", "IMPLEMENTS", "THIS", 
			"PACKAGE", "OVERRIDE", "SUPER", "AND", "OR", "NOT", "COMA", "PUNTO", 
			"SEMIC", "COR_A", "COR_C", "PAR_A", "PAR_C", "LLA_A", "LLA_C", "IGUAL", 
			"MAYOR_QUE", "MAYOR_IGUAL", "MENOR_QUE", "MENOR_IGUAL", "DIFERENTE", 
			"ASIG", "MAS", "MENOS", "POR", "ENTRE", "MODU", "STRING", "NUM_INT", 
			"NUM_REAL", "IDF", "WS"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expr();
			setState(5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
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

	public static final String _serializedATN =
		"\u0004\u00017\n\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0000\u0007\u0000\u0004\u0001\u0000\u0000"+
		"\u0000\u0002\u0007\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001"+
		"\u0000\u0005\u0006\u0005\u0000\u0000\u0001\u0006\u0001\u0001\u0000\u0000"+
		"\u0000\u0007\b\u0005\u0000\u0000\u0001\b\u0003\u0001\u0000\u0000\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}