package visitor

import token.PTokenType

interface LexerVisitor {
    fun visit(symbol: String): PTokenType
}

data class BindedLexerVisitor(val visitor: LexerVisitor, val bindedVisitor: BindedLexerVisitor? = null) : LexerVisitor {
    override fun visit(symbol: String): PTokenType {
        return when(val visitorToken: PTokenType = visitor.visit(symbol)) {
            is PTokenType.PUnknownToken -> bindedVisitor?.visit(symbol) ?: PTokenType.PUnknownToken
            else -> visitorToken
        }
    }
}

infix operator fun LexerVisitor.plus(visitor: LexerVisitor): LexerVisitor = BindedLexerVisitor(this, BindedLexerVisitor(visitor))