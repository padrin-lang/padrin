package visitor

import token.PToken

interface LexerVisitor {
    fun visit(symbol: String): PToken
}

data class BindedLexerVisitor(val visitor: LexerVisitor, val bindedVisitor: BindedLexerVisitor? = null) : LexerVisitor {
    override fun visit(symbol: String): PToken {
        return when(val visitorToken: PToken = visitor.visit(symbol)) {
            is PToken.PUnknownToken -> bindedVisitor?.visit(symbol) ?: PToken.PUnknownToken
            else -> visitorToken
        }
    }
}

infix operator fun LexerVisitor.plus(visitor: LexerVisitor): LexerVisitor = BindedLexerVisitor(this, BindedLexerVisitor(visitor))