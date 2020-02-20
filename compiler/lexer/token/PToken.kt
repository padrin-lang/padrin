package token

import visitor.LexerVisitor

sealed class PToken(override val text: String, override val debugName: String) : PElement {

    data class PKeywordToken(override val text: String, override val debugName: String) : PToken(text, debugName)
    data class PSingleValueToken(override val text: String, override val debugName: String) : PToken(text, debugName)
    data class PModifierToken(override val text: String, override val debugName: String) : PToken(text, debugName)
    object PUnknownToken : PToken("UNKNOWN", "UNKNOWN")
}

fun PToken.accept(visitor: LexerVisitor): PToken = visitor.visit(text)