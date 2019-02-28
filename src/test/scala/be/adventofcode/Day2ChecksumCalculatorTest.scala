package be.adventofcode

import be.adventofcode.Day2ChecksumCalculator.calculateDoublesAndTripplesFor
import org.scalatest.FunSuite

class Day2ChecksumCalculatorTest extends FunSuite {

  test("calculate doubles and tripples for simple words") {
    assert(calculateDoublesAndTripplesFor("abcdef".toList).equals((0,0)))
    assert(calculateDoublesAndTripplesFor("bababc".toList).equals((1,1)))
    assert(calculateDoublesAndTripplesFor("abbcde".toList).equals((1,0)))
    assert(calculateDoublesAndTripplesFor("abcccd".toList).equals((0,1)))
    assert(calculateDoublesAndTripplesFor("aabcdd".toList).equals((1,0)))
    assert(calculateDoublesAndTripplesFor("abcdee".toList).equals((1,0)))
    assert(calculateDoublesAndTripplesFor("ababab".toList).equals((0,1)))
  }

  test("calc test result") {
    assert(calculateDoublesAndTripplesFor("tjxmoewpqkyaiqvmndgflunszc".toList).equals((1,0)))
  }

  test("calculate list from file") {
    println(Day2ChecksumCalculator.calculateCheckSum())
  }
}
