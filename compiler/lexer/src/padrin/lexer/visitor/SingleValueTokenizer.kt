package src.padrin.lexer.visitor

import src.padrin.lexer.token.PToken
import src.padrin.lexer.token.PTokenType

object SingleValueTokenizer : LexerVisitor {

    override fun visit(symbol: String): PToken = tokens().find {
        symbol == (it.tokenType as PTokenType.PSingleValueToken).symbol
    } ?: PToken.UNKNOWN

    override fun tokenPredicate(token: PToken): Boolean = token.tokenType is PTokenType.PSingleValueToken
}