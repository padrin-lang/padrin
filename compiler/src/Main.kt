import src.padrin.lexer.PLexer
import src.padrin.lexer.input.FileInput
import java.io.File

fun main() {
    val x = PLexer(FileInput(File("./compiler/tmp/Main.pd")))
    for (i in 1..10) {
        x.nextToken()
    }
}