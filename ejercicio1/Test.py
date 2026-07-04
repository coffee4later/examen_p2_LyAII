from antlr4 import*
from ExprLexer import ExprLexer
import sys

if len(sys.argv) < 2:
    print("Uso: py Test.py <archivo>")
    sys.exit(1)

#leer archivos con codificación UTF-8
input_stream = FileStream(sys.argv[1], encoding='utf-8')
#Por Terminal
lexer = ExprLexer(input_stream)

tokens = CommonTokenStream(lexer)
tokens.fill()
print(tokens)

for token in tokens.tokens:
    print("Texto :", token.text)
    print("Linea :", token.line)
    print("Columna :", token.column)
    nombre_token = lexer.symbolicNames[token.type]
    print("Tipo ", nombre_token)
    print("----------------------")