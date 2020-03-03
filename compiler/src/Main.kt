import src.padrin.lexer.PLexer
import src.padrin.lexer.input.FileInput
import src.padrin.lexer.token.PToken
import java.io.File

fun main() {
    val x = PLexer(FileInput(File("./compiler/tmp/Main.pd")))
    var token: PToken = x.nextToken()
    do {
        println(token)
        token = x.nextToken()
    } while (token != PToken.EOF)
    println(token)
}