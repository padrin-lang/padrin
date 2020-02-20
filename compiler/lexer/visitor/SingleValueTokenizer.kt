package visitor

import token.PToken

class SingleValueTokenizer : LexerVisitor {

    override fun visit(symbol: String): PToken.PSingleValueToken {
        TODO()
    }
}