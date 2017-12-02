package day2

import fromMultipleLineInput
import kotlin.Int.Companion.MAX_VALUE
import kotlin.Int.Companion.MIN_VALUE
import kotlin.math.max
import kotlin.math.min

fun calcCheckSum(input: List<List<Int>>): Int {
  return input.map { row ->
    row.fold(MAX_VALUE to MIN_VALUE) { (currentMin, currentMax), rowElement ->
      min(rowElement, currentMin) to max(rowElement, currentMax)
    }
  }.sumBy { (min, max) -> max - min }
}

fun calcCheckSumPart2(input: List<List<Int>>): Int {
  return input.map { row ->
    row.filter { element ->
      row.any { innerElement ->
        element != innerElement &&
            (element % innerElement == 0 || innerElement % element == 0)
      }
    }.sorted()
  }.sumBy { (first, second) -> second / first }
}

fun main(args: Array<String>) {
  val input = fromMultipleLineInput(2017, 2, "CorruptionChecksumInput.txt") { rawInput ->
    rawInput.map { row ->
      row.split('\t').map { it.toInt() }
    }
  }
  println(calcCheckSum(input))

  val inputPart2 = fromMultipleLineInput(2017, 2, "CorruptionChecksumInputPart2.txt") { rawInput ->
    rawInput.map { row ->
      row.split('\t').map { it.toInt() }
    }
  }
  println(calcCheckSumPart2(inputPart2))
}
