package src.padrin.lexer

import src.padrin.lexer.input.MetaDataInput
import src.padrin.lexer.token.PToken
import src.padrin.lexer.visitor.LexerVisitor
import src.padrin.lexer.visitor.Tokenizer

class PLexer(private val fileInput: MetaDataInput, private val tokenizer: LexerVisitor = Tokenizer) {

    fun nextToken(): PToken {
        TODO()
    }
}