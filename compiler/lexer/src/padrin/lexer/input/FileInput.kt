package src.padrin.lexer.input

import java.io.File

class FileInput(private val file: File) : FileMetaDataInput {

    private var line = -1
    private var column = 0
    private val cache: List<String> = file.readLines().map { it + '\n' }

    init { if (cache.isEmpty()) column = -1 }

    override fun read(): Char {
        if (column == -1) return (-1).toChar()
        line++
        while (column != -1 && cache[column].length <= line) {
            line = 0
            column++
            if (column >= cache.size) {
                column = -1
            }
        }
        if (column == -1) {
            return (-1).toChar()
        }
        return cache[column][line]
    }

    override fun getFile(): String = file.name

    override fun getLine(): Int = line

    override fun getColumn(): Int = column
}