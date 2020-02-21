package visitor

import token.PToken

interface LexerVisitor {
    fun visit(symbol: String): PToken
    fun tokenPredicate(token: PToken): Boolean = true
    fun tokens(): List<PToken> = PToken.values().filter { tokenPredicate(it) }
}

data class BindedLexerVisitor(val visitor: LexerVisitor, val bindedVisitor: BindedLexerVisitor? = null) : LexerVisitor {
    override fun visit(symbol: String): PToken {
        return when(val visitorToken: PToken = visitor.visit(symbol)) {
            PToken.UNKNOWN -> bindedVisitor?.visit(symbol) ?: PToken.UNKNOWN
            else -> visitorToken
        }
    }
}

infix operator fun LexerVisitor.plus(visitor: LexerVisitor): LexerVisitor = BindedLexerVisitor(this, BindedLexerVisitor(visitor))