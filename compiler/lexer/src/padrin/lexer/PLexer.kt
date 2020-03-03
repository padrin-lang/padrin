package src.padrin.lexer

import src.padrin.lexer.input.FileMetaDataInput
import src.padrin.lexer.token.PToken
import src.padrin.lexer.token.PTokenType
import src.padrin.lexer.visitor.LexerVisitor
import src.padrin.lexer.visitor.Tokenizer

class PLexer(private val fileInput: FileMetaDataInput, private val tokenizer: LexerVisitor = Tokenizer) {

    private var memoizedSymbol: Char? = null

    fun nextToken(): PToken {
        var symbol = Symbol("")
        var currentSymbol: Char? = null
        while (true) {
            currentSymbol = memoizedSymbol.also { memoizedSymbol = null } ?: fileInput.read()
            if (currentSymbol.shouldReturnTokenWith(symbol)) {
                memoizedSymbol = currentSymbol
                return symbol.accept(tokenizer)
            }
            symbol += currentSymbol
            val token = symbol.accept(tokenizer)
            if (token != PToken.UNKNOWN && token != PToken.IDENTIFIER) return token
            if (currentSymbol.toByte() < 0) return PToken.EOF
        }
    }

    private fun Char.shouldReturnTokenWith(symbol: Symbol) = this.let {
        symbol.text.isNotEmpty() && (Symbol(this.toString()).accept(tokenizer).tokenType is PTokenType.PSingleValueToken)
    }
}