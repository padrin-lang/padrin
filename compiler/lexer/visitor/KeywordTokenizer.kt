package visitor

import token.PToken

object KeywordTokenizer : LexerVisitor {

    override fun visit(symbol: String): PToken.PKeywordToken {
        TODO()
    }
}