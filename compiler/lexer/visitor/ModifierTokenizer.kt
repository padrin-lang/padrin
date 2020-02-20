package visitor

import token.PToken

class ModifierTokenizer : LexerVisitor {

    override fun visit(symbol: String): PToken.PModifierToken {
        TODO()
    }
}