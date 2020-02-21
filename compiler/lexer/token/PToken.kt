package token

enum class PToken(val tokenType: PTokenType) {

    EOF(PTokenType.PRegularToken("EOF")),
    RESERVED(PTokenType.PRegularToken("RESERVED")),
    EOL(PTokenType.PRegularToken("EOL")),
    INTEGER_LITERAL(PTokenType.PRegularToken("INTEGER_LITERAL")),
    FLOAT_LITERAL(PTokenType.PRegularToken("FLOAT_LITERAL")),
    CHARACTER_LITERAL(PTokenType.PRegularToken("CHARACTER_LITERAL")),
    IDENTIFIER(PTokenType.PRegularToken("IDENTIFIER")),

    PACKAGE(PTokenType.PKeywordToken("package")),
    INSTANCE(PTokenType.PKeywordToken("instance")),
    TRAIT(PTokenType.PKeywordToken("trait")),
    DEF(PTokenType.PKeywordToken("def")),
    VAL(PTokenType.PKeywordToken("val")),
    VAR(PTokenType.PKeywordToken("var")),
    NULL(PTokenType.PKeywordToken("null")),

    PRIVATE(PTokenType.PModifierToken("private")),
    PUBLIC(PTokenType.PModifierToken("public")),
    PROTECTED(PTokenType.PModifierToken("protected")),

    LBRACE(PTokenType.PSingleValueToken("LBRACE", symbol = "{")),
    RBRACE(PTokenType.PSingleValueToken("RBRACE", symbol = "}")),
    LPAR(PTokenType.PSingleValueToken("LPAR", symbol = "(")),
    RPAR(PTokenType.PSingleValueToken("RPAR", symbol = ")")),
    DOT(PTokenType.PSingleValueToken("DOT", symbol = ".")),
    MUL(PTokenType.PSingleValueToken("MUL", symbol = "*")),
    PLUS(PTokenType.PSingleValueToken("PLUS", symbol = "+")),
    MINUS(PTokenType.PSingleValueToken("MINUS", symbol = "-")),
    DIV(PTokenType.PSingleValueToken("DIV", symbol = "/")),

    UNKNOWN(PTokenType.PUnknownToken)
}