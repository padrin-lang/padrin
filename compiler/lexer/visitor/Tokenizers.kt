package visitor

val TOKENIZER = (
  KeywordTokenizer
  + ModifierTokenizer
  + SingleValueTokenizer
  + RegularTokenizer
)