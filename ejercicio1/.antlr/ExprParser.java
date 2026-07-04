// Generated from c:/Users/denis/Tecnologico/Automatas 2/examen 2 parcial/examen_p2_LyAII/ejercicio1/Expr.g4 by ANTLR 4.13.1
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
		T__0=1, IMPORT=2, PUBLIC=3, PRIVATE=4, CLASS=5, STATIC=6, NEW=7, VOID=8, 
		INT=9, IF=10, SYSOUT=11, SCAN=12, WHILE=13, DO=14, ELSE=15, SWITCH=16, 
		GET=17, SET=18, STRING=19, DOUBLE=20, BOOLEAN=21, ARRAY=22, ARRAYLIST=23, 
		LIST=24, FLOAT=25, NUM=26, CADENA=27, ID=28, IGUAL=29, SUMA=30, MAYORIGUAL=31, 
		AND=32, OR=33, PUNTO=34, PUNTO_COMA=35, PAR_IZQ=36, PAR_DER=37, LLAVE_IZQ=38, 
		LLAVE_DER=39, COR_IZQ=40, COR_DER=41, WS=42;
	public static final int
		RULE_root = 0, RULE_expr = 1, RULE_for = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr", "for"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'import'", "'public'", "'private'", "'class'", "'static'", 
			"'new'", "'void'", "'int'", "'if'", "'System.out.println'", "'Scanner'", 
			"'while'", "'do'", "'else'", "'switch'", "'get'", "'set'", "'String'", 
			"'double'", "'boolean'", "'array'", "'ArrayList'", "'List'", "'float'", 
			null, null, null, "'='", "'+'", "'>='", "'&&'", "'||'", "'.'", "';'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "IMPORT", "PUBLIC", "PRIVATE", "CLASS", "STATIC", "NEW", 
			"VOID", "INT", "IF", "SYSOUT", "SCAN", "WHILE", "DO", "ELSE", "SWITCH", 
			"GET", "SET", "STRING", "DOUBLE", "BOOLEAN", "ARRAY", "ARRAYLIST", "LIST", 
			"FLOAT", "NUM", "CADENA", "ID", "IGUAL", "SUMA", "MAYORIGUAL", "AND", 
			"OR", "PUNTO", "PUNTO_COMA", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", 
			"COR_IZQ", "COR_DER", "WS"
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
			setState(6);
			expr();
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
			setState(9);
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
	public static class ForContext extends ParserRuleContext {
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001*\u000e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0000\u0000\u0003\u0000\u0002"+
		"\u0004\u0000\u0000\n\u0000\u0006\u0001\u0000\u0000\u0000\u0002\t\u0001"+
		"\u0000\u0000\u0000\u0004\u000b\u0001\u0000\u0000\u0000\u0006\u0007\u0003"+
		"\u0002\u0001\u0000\u0007\b\u0005\u0000\u0000\u0001\b\u0001\u0001\u0000"+
		"\u0000\u0000\t\n\u0005\u0000\u0000\u0001\n\u0003\u0001\u0000\u0000\u0000"+
		"\u000b\f\u0005\u0001\u0000\u0000\f\u0005\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}