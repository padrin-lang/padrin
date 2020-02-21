package visitor

import token.PTokenType

object ModifierTokenizer : LexerVisitor {

    override fun visit(symbol: String): PTokenType.PModifierToken {
        TODO()
    }
}