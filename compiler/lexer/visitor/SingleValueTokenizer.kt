package visitor

import token.PToken

object SingleValueTokenizer : LexerVisitor {

    override fun visit(symbol: String): PToken.PSingleValueToken {
        TODO()
    }
}