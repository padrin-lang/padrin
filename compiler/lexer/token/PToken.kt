package token

sealed class PToken(override val text: String, override val debugName: String = text) : PElement {

    data class PRegularToken(override val text: String, override val debugName: String = text) : PToken(text, debugName)
    data class PKeywordToken(override val text: String, override val debugName: String = text) : PToken(text, debugName)
    data class PSingleValueToken(override val text: String, override val debugName: String = text) : PToken(text, debugName)
    data class PModifierToken(override val text: String, override val debugName: String = text) : PToken(text, debugName)
    object PUnknownToken : PToken("UNKNOWN", "UNKNOWN")
}