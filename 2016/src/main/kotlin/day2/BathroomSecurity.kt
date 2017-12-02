package day2

import fromMultipleLineInput
import java.lang.Math.max
import java.lang.Math.min

val keypadPart1 = arrayOf(
    arrayOf(1, 2, 3),
    arrayOf(4, 5, 6),
    arrayOf(7, 8, 9)
)

val keypadPart2 = arrayOf(
    arrayOf('#', '#', '1', '#', '#'),
    arrayOf('#', '2', '3', '4', '#'),
    arrayOf('5', '6', '7', '8', '9'),
    arrayOf('#', 'A', 'B', 'C', '#'),
    arrayOf('#', '#', 'D', '#', '#')
)

fun solveCodePart1(input: List<String>): String {
  return input.fold("" to (1 to 1)) { result, instructionLine ->

    val position = instructionLine.fold(result.second) { position, instruction ->
      when (instruction) {
        'U' -> max(position.first - 1, 0) to position.second
        'R' -> position.first to min(position.second + 1, 2)
        'D' -> min(position.first + 1, 2) to position.second
        'L' -> position.first to max(position.second - 1, 0)
        else -> throw IllegalArgumentException()
      }
    }

    result.first + keypadPart1[position.first][position.second] to position
  }.first
}

fun solveCodePart2(input: List<String>): String {

  return input.fold("" to (2 to 0)) { result, instructionLine ->
    val position = instructionLine.fold(result.second) { position, instruction ->

      val newPosition = when (instruction) {
        'U' -> max(position.first - 1, 0) to position.second
        'R' -> position.first to min(position.second + 1, 4)
        'D' -> min(position.first + 1, 4) to position.second
        'L' -> position.first to max(position.second - 1, 0)
        else -> throw IllegalArgumentException()
      }

      when {
        keypadPart2[newPosition.first][newPosition.second].isLetterOrDigit() -> newPosition
        else -> position
      }
    }

    result.first + keypadPart2[position.first][position.second] to position
  }.first
}

fun main(args: Array<String>) {
  fromMultipleLineInput(2016, 2, "BathroomSecurityInput.txt") { input ->
    println("Part 1: ${solveCodePart1(input)}")
    println("Part 2: ${solveCodePart2(input)}")
  }
}
