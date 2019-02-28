package be.adventofcode

import org.scalatest.FunSuite

class Day1FrequencyCalculatorTest extends FunSuite {

  test("calculate duplicate for test input") {
    val res = Day1FrequencyCalculator.calculateDuplicateFreq(List(0), List(1,-2,3,1,1,-2))

    assert(res == 2)
  }

  test("calculate duplicate for test input 2") {
    val res = Day1FrequencyCalculator.calculateDuplicateFreq(List(0), List(3,3,4,- 2,- 4))

    assert(res == 10)
  }

  test("run with file") {
    val result = Day1FrequencyCalculator.parseFileAndCalculateFrequency()
    println(result)
  }

  test("run duplicate test with file") {
    val result = Day1FrequencyCalculator.parseFileAndCalculateDuplicateFrequency()
    println(result)
  }
}
