package src.padrin.lexer

import src.padrin.lexer.input.FileMetaDataInput
import src.padrin.lexer.token.PToken
import src.padrin.lexer.visitor.LexerVisitor
import src.padrin.lexer.visitor.Tokenizer

class PLexer(private val fileInput: FileMetaDataInput, private val tokenizer: LexerVisitor = Tokenizer) {

    fun nextToken(): PToken {
        var symbol = Symbol("")
        var currentSymbol: Char? = null
        while (true) {
            currentSymbol = fileInput.read()
            symbol += currentSymbol
            val token = symbol.accept(tokenizer)
            if (token != PToken.UNKNOWN && token != PToken.IDENTIFIER) return token
        }
    }
}