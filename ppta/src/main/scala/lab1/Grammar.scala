package lab1

class Grammar(terminals: Set[Symbol],
              nonTerminals: Set[Symbol],
              rules: Set[Rule],
              startSymbol: Symbol) {

  require((terminals & nonTerminals & Set(startSymbol)).isEmpty, "Duplicate symbols found")

  override def toString: String =
    s"""Terminals: ${terminals.mkString}
      |NonTerminals: ${nonTerminals.mkString}
      |Rules: ${rules.mkString("\n\t", ";\n\t", "")}
      |Start symbol: $startSymbol""".stripMargin

}
