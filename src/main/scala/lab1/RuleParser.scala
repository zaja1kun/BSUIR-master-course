package lab1

import scala.util.parsing.combinator.RegexParsers

object RuleParser extends RegexParsers {

  private def rule = (seq <~ "=>") ~ right ^^ (res => res._2.map(right => Rule(res._1, right)))
  private def right = seq ~ rep("|" ~> seq) ^^ (e => e._1 :: e._2)
  private def seq = "[a-zA-Z]+".r ^^ (_.toList.map(Symbol(_)))

  def parse(str: CharSequence): List[Rule] = parseAll(rule, str) match {
    case Success(result, _) => result
    case NoSuccess(msg, _) => {print(msg); List.empty}
  }

  def parse(rules: Iterable[String]): List[Rule] = rules.flatMap(parse(_)).toList
}
