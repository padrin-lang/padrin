package visitor

import token.PToken

object ModifierTokenizer : LexerVisitor {

    override fun visit(symbol: String): PToken.PModifierToken {
        TODO()
    }
}