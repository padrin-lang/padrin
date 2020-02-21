package src.padrin.lexer.input

interface MetaDataInput {

    fun read(): Char
    fun getFile(): String
    fun getLine(): Int
    fun getColumn(): Int
}