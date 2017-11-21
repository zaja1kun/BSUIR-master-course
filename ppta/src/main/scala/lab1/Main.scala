package lab1

object Main {
  def main(args: Array[String]): Unit = {
    print(RuleParser.parse(args(0)))

  }

}
