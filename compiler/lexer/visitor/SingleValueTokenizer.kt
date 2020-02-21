package visitor

import token.PTokenType

object SingleValueTokenizer : LexerVisitor {

    override fun visit(symbol: String): PTokenType.PSingleValueToken {
        TODO()
    }
}