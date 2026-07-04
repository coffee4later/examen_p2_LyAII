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
        4,1,42,14,2,0,7,0,2,1,7,1,2,2,7,2,1,0,1,0,1,0,1,1,1,1,1,2,1,2,1,
        2,0,0,3,0,2,4,0,0,10,0,6,1,0,0,0,2,9,1,0,0,0,4,11,1,0,0,0,6,7,3,
        2,1,0,7,8,5,0,0,1,8,1,1,0,0,0,9,10,5,0,0,1,10,3,1,0,0,0,11,12,5,
        1,0,0,12,5,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'for'", "'import'", "'public'", "'private'", 
                     "'class'", "'static'", "'new'", "'void'", "'int'", 
                     "'if'", "'System.out.println'", "'Scanner'", "'while'", 
                     "'do'", "'else'", "'switch'", "'get'", "'set'", "'String'", 
                     "'double'", "'boolean'", "'array'", "'ArrayList'", 
                     "'List'", "'float'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'='", "'+'", "'>='", "'&&'", "'||'", "'.'", "';'", 
                     "'('", "')'", "'{'", "'}'", "'['", "']'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "IMPORT", "PUBLIC", "PRIVATE", 
                      "CLASS", "STATIC", "NEW", "VOID", "INT", "IF", "SYSOUT", 
                      "SCAN", "WHILE", "DO", "ELSE", "SWITCH", "GET", "SET", 
                      "STRING", "DOUBLE", "BOOLEAN", "ARRAY", "ARRAYLIST", 
                      "LIST", "FLOAT", "NUM", "CADENA", "ID", "IGUAL", "SUMA", 
                      "MAYORIGUAL", "AND", "OR", "PUNTO", "PUNTO_COMA", 
                      "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", "COR_IZQ", 
                      "COR_DER", "WS" ]

    RULE_root = 0
    RULE_expr = 1
    RULE_for = 2

    ruleNames =  [ "root", "expr", "for" ]

    EOF = Token.EOF
    T__0=1
    IMPORT=2
    PUBLIC=3
    PRIVATE=4
    CLASS=5
    STATIC=6
    NEW=7
    VOID=8
    INT=9
    IF=10
    SYSOUT=11
    SCAN=12
    WHILE=13
    DO=14
    ELSE=15
    SWITCH=16
    GET=17
    SET=18
    STRING=19
    DOUBLE=20
    BOOLEAN=21
    ARRAY=22
    ARRAYLIST=23
    LIST=24
    FLOAT=25
    NUM=26
    CADENA=27
    ID=28
    IGUAL=29
    SUMA=30
    MAYORIGUAL=31
    AND=32
    OR=33
    PUNTO=34
    PUNTO_COMA=35
    PAR_IZQ=36
    PAR_DER=37
    LLAVE_IZQ=38
    LLAVE_DER=39
    COR_IZQ=40
    COR_DER=41
    WS=42

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




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 6
            self.expr()
            self.state = 7
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




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 9
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ExprParser.RULE_for




    def for_(self):

        localctx = ExprParser.ForContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_for)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 11
            self.match(ExprParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





