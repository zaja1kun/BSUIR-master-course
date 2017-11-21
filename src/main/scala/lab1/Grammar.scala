package lab1

class Grammar(terminals: Set[Symbol],
              nonTerminals: Set[Symbol],
              rules: Set[Rule],
              startSymbol: Symbol) {

  require((terminals & nonTerminals & Set(startSymbol)).isEmpty, "Duplicate symbols found")



}
