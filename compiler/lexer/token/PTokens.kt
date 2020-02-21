package token

enum class PTokens(val tokenType: PToken) {

    EOF(PToken.PRegularToken("EOF")),
    RESERVED(PToken.PRegularToken("RESERVED")),
    EOL(PToken.PRegularToken("EOL")),
    INTEGER_LITERAL(PToken.PRegularToken("INTEGER_LITERAL")),
    FLOAT_LITERAL(PToken.PRegularToken("FLOAT_LITERAL")),
    CHARACTER_LITERAL(PToken.PRegularToken("CHARACTER_LITERAL")),

    PACKAGE(PToken.PKeywordToken("package")),
    INSTANCE(PToken.PKeywordToken("instance")),
    TRAIT(PToken.PKeywordToken("trait")),
    DEF(PToken.PKeywordToken("def")),
    VAL(PToken.PKeywordToken("val")),
    VAR(PToken.PKeywordToken("var")),
    NULL(PToken.PKeywordToken("null")),

    PRIVATE(PToken.PModifierToken("private")),
    PUBLIC(PToken.PModifierToken("public")),
    PROTECTED(PToken.PModifierToken("protected")),

    LBRACE(PToken.PSingleValueToken("LBRACE", symbol = "{")),
    RBRACE(PToken.PSingleValueToken("RBRACE", symbol = "}")),
    LPAR(PToken.PSingleValueToken("LPAR", symbol = "(")),
    RPAR(PToken.PSingleValueToken("RPAR", symbol = ")")),
    DOT(PToken.PSingleValueToken("DOT", symbol = ".")),
    MUL(PToken.PSingleValueToken("MUL", symbol = "*")),
    PLUS(PToken.PSingleValueToken("PLUS", symbol = "+")),
    MINUS(PToken.PSingleValueToken("MINUS", symbol = "-")),

}