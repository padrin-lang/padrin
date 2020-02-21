package visitor

import token.PToken
import token.PTokenType

object SingleValueTokenizer : LexerVisitor {

    override fun visit(symbol: String): PToken = tokens().find {
        symbol == (it.tokenType as PTokenType.PSingleValueToken).symbol
    } ?: PToken.UNKNOWN

    override fun tokenPredicate(token: PToken): Boolean = token.tokenType is PTokenType.PSingleValueToken
}