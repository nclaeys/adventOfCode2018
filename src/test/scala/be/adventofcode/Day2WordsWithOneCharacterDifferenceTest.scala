package be.adventofcode

import be.adventofcode.Day2WordsWithOneCharacterDifference.calculateCommonCharacters
import org.scalatest.FunSuite

class Day2WordsWithOneCharacterDifferenceTest extends FunSuite {

  test("sample input for words that differ one character") {
    assert(calculateCommonCharacters(List("abcde","fghij","klmno","pqrst","fguij","axcye","wvxyz")).equals("fgij"))
  }

  test("calculate difference between words") {
    assert(Day2WordsWithOneCharacterDifference.calculateCommonCharsBetween("abcde".toList, "axcye".toList).contentEquals("ace"))
    assert(Day2WordsWithOneCharacterDifference.calculateCommonCharsBetween("fghij".toList, "fguij".toList).contentEquals("fgij"))
  }

  test("calculate common chars for") {
    println(Day2WordsWithOneCharacterDifference.calculateCommonCharsForFile())
  }

}
