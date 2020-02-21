package visitor

import token.PTokenType

object KeywordTokenizer : LexerVisitor {

    override fun visit(symbol: String): PTokenType.PKeywordToken {
        TODO()
    }
}