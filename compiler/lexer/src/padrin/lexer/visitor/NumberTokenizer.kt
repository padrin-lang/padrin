package src.padrin.lexer.visitor

import src.padrin.lexer.token.PToken
import src.padrin.lexer.token.PTokenType

object NumberTokenizer : LexerVisitor {

    override fun visit(symbol: String): PToken = tokens().find {
        (it.tokenType as PTokenType.PNumberToken).pattern.matcher(symbol).matches()
    } ?: PToken.UNKNOWN

    override fun tokenPredicate(token: PToken): Boolean = token.tokenType is PTokenType.PNumberToken
}