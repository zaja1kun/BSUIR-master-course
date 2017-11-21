package lab1

import java.io.FileReader

import lab1.parser.GrammarParser

object Main {
  def main(args: Array[String]): Unit = {
    print(GrammarParser.parse(new FileReader(args(0))))

  }

}
