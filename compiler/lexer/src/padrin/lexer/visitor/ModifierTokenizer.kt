package src.padrin.lexer.visitor

import src.padrin.lexer.token.PToken
import src.padrin.lexer.token.PTokenType

object ModifierTokenizer : LexerVisitor {

    override fun visit(symbol: String): PToken = tokens().find {
        symbol == it.tokenType.text
    } ?: PToken.UNKNOWN

    override fun tokenPredicate(token: PToken): Boolean = token.tokenType is PTokenType.PModifierToken
}