package visitor

import token.PToken

interface LexerVisitor  {

  fun visit(symbol: String): PToken
}
