package src.padrin.lexer.input

interface FileMetaDataInput {

    fun read(): Char
    fun getFile(): String
    fun getLine(): Int
    fun getColumn(): Int
}