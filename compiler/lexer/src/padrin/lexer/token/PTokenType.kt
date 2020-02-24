package src.padrin.lexer.token

import java.util.regex.Pattern

sealed class PTokenType(override val text: String, override val debugName: String = text) : PElement {

    data class PRegularToken(override val text: String, override val debugName: String = text, val pattern: Pattern? = null) : PTokenType(text, debugName)
    data class PKeywordToken(override val text: String, override val debugName: String = text) : PTokenType(text, debugName)
    data class PSingleValueToken(override val text: String, override val debugName: String = text, val symbol: String) : PTokenType(text, debugName)
    data class PModifierToken(override val text: String, override val debugName: String = text) : PTokenType(text, debugName)
    data class PNumberToken(override val text: String, override val debugName: String = text, val pattern: Pattern) : PTokenType(text, debugName)
    object PUnknownToken : PTokenType("UNKNOWN", "UNKNOWN")

    override fun toString(): String = "[$debugName]"
}