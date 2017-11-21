package lab1

class Grammar(val terminals: Set[Symbol],
              val nonTerminals: Set[Symbol],
              val rules: Set[Rule],
              val startSymbol: Symbol) {

  require((terminals & nonTerminals & Set(startSymbol)).isEmpty, "Duplicate symbols found")

  lazy val `type`: GrammarType.Value = GrammarType.Type0

  def isContextFree: Boolean = rules forall
    (rule => rule.left.len == 1 && (rule.left.contents -- nonTerminals).isEmpty)

  override def toString: String =
    s"""Terminals: ${terminals.mkString}
      |NonTerminals: ${nonTerminals.mkString}
      |Rules: ${rules.mkString("\n\t", ";\n\t", "")}
      |Start symbol: $startSymbol""".stripMargin
}
