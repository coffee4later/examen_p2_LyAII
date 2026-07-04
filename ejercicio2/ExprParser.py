# Generated from Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,55,10,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,1,1,0,0,2,0,2,0,0,
        7,0,4,1,0,0,0,2,7,1,0,0,0,4,5,3,2,1,0,5,6,5,0,0,1,6,1,1,0,0,0,7,
        8,5,0,0,1,8,3,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'public'", "'final'", "'class'", "'throw'", 
                     "'new'", "'private'", "'protected'", "'try'", "'catch'", 
                     "'finally'", "'if'", "'else'", "'for'", "'while'", 
                     "'do'", "'void'", "'int'", "'double'", "'float'", "'import'", 
                     "'extends'", "'implements'", "'this'", "'package'", 
                     "'@Override'", "'super'", "'&&'", "'||'", "'!'", "','", 
                     "'.'", "';'", "'['", "']'", "'('", "')'", "'{'", "'}'", 
                     "'=='", "'>'", "'>='", "'<'", "'<='", "'!='", "'='", 
                     "'+'", "'-'", "'*'", "'/'", "'%'" ]

    symbolicNames = [ "<INVALID>", "PUBLIC", "FINAL", "CLASS", "THROW", 
                      "NEW", "PRIVATE", "PROTECTED", "TRY", "CATCH", "FINALLY", 
                      "IF", "ELSE", "FOR", "WHILE", "DO", "VOID", "INT", 
                      "DOUBLE", "FLOAT", "IMPORT", "EXTENDS", "IMPLEMENTS", 
                      "THIS", "PACKAGE", "OVERRIDE", "SUPER", "AND", "OR", 
                      "NOT", "COMA", "PUNTO", "SEMIC", "COR_A", "COR_C", 
                      "PAR_A", "PAR_C", "LLA_A", "LLA_C", "IGUAL", "MAYOR_QUE", 
                      "MAYOR_IGUAL", "MENOR_QUE", "MENOR_IGUAL", "DIFERENTE", 
                      "ASIG", "MAS", "MENOS", "POR", "ENTRE", "MODU", "STRING", 
                      "NUM_INT", "NUM_REAL", "IDF", "WS" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    PUBLIC=1
    FINAL=2
    CLASS=3
    THROW=4
    NEW=5
    PRIVATE=6
    PROTECTED=7
    TRY=8
    CATCH=9
    FINALLY=10
    IF=11
    ELSE=12
    FOR=13
    WHILE=14
    DO=15
    VOID=16
    INT=17
    DOUBLE=18
    FLOAT=19
    IMPORT=20
    EXTENDS=21
    IMPLEMENTS=22
    THIS=23
    PACKAGE=24
    OVERRIDE=25
    SUPER=26
    AND=27
    OR=28
    NOT=29
    COMA=30
    PUNTO=31
    SEMIC=32
    COR_A=33
    COR_C=34
    PAR_A=35
    PAR_C=36
    LLA_A=37
    LLA_C=38
    IGUAL=39
    MAYOR_QUE=40
    MAYOR_IGUAL=41
    MENOR_QUE=42
    MENOR_IGUAL=43
    DIFERENTE=44
    ASIG=45
    MAS=46
    MENOS=47
    POR=48
    ENTRE=49
    MODU=50
    STRING=51
    NUM_INT=52
    NUM_REAL=53
    IDF=54
    WS=55

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_root

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRoot" ):
                listener.enterRoot(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRoot" ):
                listener.exitRoot(self)




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 4
            self.expr()
            self.state = 5
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





