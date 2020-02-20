package token

import visitor.LexerVisitor

interface PElement {
    val text: String
    val debugName: String
}