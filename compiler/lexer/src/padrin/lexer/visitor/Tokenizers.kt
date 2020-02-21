package src.padrin.lexer.visitor

val Tokenizer = (
  KeywordTokenizer
  + ModifierTokenizer
  + SingleValueTokenizer
  + RegularTokenizer
  + NumberTokenizer
)