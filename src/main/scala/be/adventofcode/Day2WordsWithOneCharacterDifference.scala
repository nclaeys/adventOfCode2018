package be.adventofcode

import scala.io.Source

object Day2WordsWithOneCharacterDifference {

  def calculateCommonCharsForFile(): String = {
    val words = Source.fromFile(this.getClass.getResource("/input/day2.txt").getFile)
      .getLines()
      .toList
    calculateCommonCharacters(words)
  }

  def calculateCommonCharacters(words: List[String]): String = {
    words
      .map(word => entryDiffersByOneChar(word, words).getOrElse(""))
      .find(_.nonEmpty)
      .getOrElse("")
  }

  def entryDiffersByOneChar(word: String, words: List[String]): Option[String] = {
      words.map(toMatch => calculateCommonPartIfOneDifference(word, toMatch))
      .find(_.nonEmpty)
  }

  def calculateCommonPartIfOneDifference(word1: String, word2: String): String = {
    val commonChars = calculateCommonCharsBetween(word1.toList, word2.toList)
    if (commonChars.length == word1.length - 1)
      commonChars
    else ""
  }

  def calculateCommonCharsBetween(word1: List[Char], word2: List[Char], acc: List[Char] = List()): String = {
    word1 match {
      case List() => acc.reverse.mkString
      case x :: xs => if (x == word2.head)
        calculateCommonCharsBetween(xs, word2.tail, x::acc)
      else
        calculateCommonCharsBetween(xs, word2.tail, acc)
    }
  }
}
