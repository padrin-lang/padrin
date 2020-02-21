package src.padrin.lexer

import src.padrin.lexer.token.PToken
import src.padrin.lexer.visitor.LexerVisitor

inline class Symbol(val text: String)

fun String.symbol(): Symbol = Symbol(this)
fun Symbol.accept(visitor: LexerVisitor): PToken = visitor.visit(text)