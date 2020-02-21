package visitor

import token.PToken
import token.PTokenType

object RegularTokenizer : LexerVisitor {

    override fun visit(symbol: String): PToken = tokens().find {
        symbol == it.tokenType.text
    } ?: PToken.UNKNOWN

    override fun tokenPredicate(token: PToken): Boolean = token.tokenType is PTokenType.PRegularToken
}