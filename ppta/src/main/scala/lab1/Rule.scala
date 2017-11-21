package lab1

case class Rule(left: List[Symbol],
           right: List[Symbol]) {

  override def toString: String = left.mkString + " => " + right.mkString

}
