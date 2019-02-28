package be.adventofcode

import scala.io.Source

object Day2ChecksumCalculator {

  def calculateCheckSum(): Int = {
    val tuple = getListFromFile()
      .map(entry => calculateDoublesAndTripplesFor(entry.toList))
      .reduce((x,y) => (x._1 + y._1, x._2 + y._2))

    tuple._1 * tuple._2
  }

  def calculateDoublesAndTripplesFor(chars: List[Char], result: (Int, Int) = (0,0)): (Int,Int) = {
    chars match {
      case List() => result
      case x :: xs => calculateDoublesAndTripplesFor(xs.filter(_.!=(x)), calculateOccurencesOf(x, xs, result))
    }
  }

  private def calculateOccurencesOf(x: Char, xs: List[Char], currentResult: (Int,Int)): (Int, Int) = {
    val count = xs.count(elem => elem == x)
    count match {
      case 1 => (1, currentResult._2)
      case 2 => (currentResult._1, 1)
      case _ => currentResult
    }
  }

  private def getListFromFile(): List[String] = {
    Source.fromFile(this.getClass.getResource("/input/day2.txt").getFile)
      .getLines()
      .toList
  }
}
