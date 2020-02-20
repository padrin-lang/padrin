package visitor

import token.PToken

class KeywordTokenizer : LexerVisitor {

    override fun visit(symbol: String): PToken.PKeywordToken {
        TODO()
    }
}