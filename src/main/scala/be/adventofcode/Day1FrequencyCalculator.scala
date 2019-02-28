package be.adventofcode

import scala.io
import scala.io.Source


object Day1FrequencyCalculator {

  def parseFileAndCalculateFrequency(): Long = {
    getListOfEntries.sum
  }

  def parseFileAndCalculateDuplicateFrequency(): Long = {
    calculateDuplicateFreq(List(0), getListOfEntries)
  }

  private def getListOfEntries = {
    Source.fromFile(this.getClass.getResource("/input/day1.txt").getFile)
      .getLines()
      .toList
      .map(_.toInt)
  }

  def calculateDuplicateFreq(seenFreq: List[Int], input: List[Int], index: Int = 0): Int = {
    val newFreq = seenFreq.head + input(index % input.length)
    if(seenFreq.contains(newFreq)) newFreq
    else calculateDuplicateFreq(newFreq::seenFreq, input, index + 1)
  }
}
