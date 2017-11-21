package lab1

sealed trait Word

case class EmptyWord() extends Word
case class SymbolicWord(value: CharSequence) extends Word {
  require(value.length() > 0, "word cannot be null")

  override def toString: String = value.toString
}

object Word {
  val empty: Word = EmptyWord()
  def apply(value: CharSequence) = SymbolicWord(value)
}


