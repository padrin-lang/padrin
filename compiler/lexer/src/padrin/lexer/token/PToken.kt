package src.padrin.lexer.token

import java.util.regex.Pattern

enum class PToken(val tokenType: PTokenType) {

    EOF(PTokenType.PRegularToken("EOF")),
    RESERVED(PTokenType.PRegularToken("RESERVED")),
    EOL(PTokenType.PRegularToken("EOL")),
    CHARACTER_LITERAL(PTokenType.PRegularToken("CHARACTER_LITERAL")),
    IDENTIFIER(PTokenType.PRegularToken("IDENTIFIER", pattern = Pattern.compile("[a-zA-Z_][a-zA-Z0-9_]*"))),

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

    INT(PTokenType.PNumberToken("INT", pattern = Pattern.compile("[-]?[0-9]+"))),
    DOUBLE(PTokenType.PNumberToken("DOUBLE", pattern = Pattern.compile((INT.tokenType as PTokenType.PNumberToken).pattern.toString() + "((\\.[0-9]+)?([eE][-+]?[0-9]+)?)"))),

    UNKNOWN(PTokenType.PUnknownToken)
}