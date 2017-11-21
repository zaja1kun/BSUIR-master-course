package lab1

sealed trait Word {
  def len: Int
  def contents: Set[Symbol]
}

case class EmptyWord() extends Word {
  override val len = 0
  override val contents: Set[Nothing] = Set.empty
}

case class SymbolicWord(value: CharSequence) extends Word {
  require(value.length() > 0, "word cannot be null")

  override val len: Int = value.length()
  override val contents: CharSequence = value

  override def toString: String = value.toString
}

object Word {
  val empty: Word = EmptyWord()
  def apply(value: CharSequence) = SymbolicWord(value)
}


