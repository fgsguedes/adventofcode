package day1

import fromOneLineInput
import java.lang.Math.abs

fun measureDistancePart1(input: String): Int {
  var facing = 0 // 0 up, 1 right, 2 down, 3 left
  var xPosition = 0
  var yPosition = 0

  val coordinates = input.split(", ")

  coordinates.forEach { coordinate ->
    val direction = coordinate[0]
    val distance = coordinate.substring(1).toInt()

    facing = when (direction) {
      'R' -> (facing + 1 + 4) % 4
      'L' -> (facing - 1 + 4) % 4
      else -> throw IllegalArgumentException()
    }

    when (facing) {
      0 -> yPosition += distance
      1 -> xPosition += distance
      2 -> yPosition -= distance
      3 -> xPosition -= distance
    }
  }

  return abs(xPosition) + abs(yPosition)
}

fun measureDistancePart2(input: String): Int {
  var facing = 0 // 0 up, 1 right, 2 down, 3 left
  var xPosition = 0
  var yPosition = 0

  val lambdas = arrayOf(
      { yPosition += 1 },
      { xPosition += 1 },
      { yPosition += -1 },
      { xPosition += -1 }
  )

  val coordinates = input.split(", ")

  val visitedBlocks = mutableSetOf(0 to 0)

  coordinates.forEach { coordinate ->
    val direction = coordinate[0]
    val distance = coordinate.substring(1).toInt()

    facing = when (direction) {
      'R' -> (facing + 1 + 4) % 4
      'L' -> (facing - 1 + 4) % 4
      else -> throw IllegalArgumentException()
    }

    for (step in 1..distance) {
      lambdas[facing]()

      if (!visitedBlocks.add(xPosition to yPosition)) {
        return abs(xPosition) + abs(yPosition)
      }
    }
  }

  return abs(xPosition) + abs(yPosition)
}

fun main(args: Array<String>) {
  fromOneLineInput(1, "NoTimeForTaxiCabsInput.txt") { input ->
    println("Part1: ${measureDistancePart1(input)}")
    println("Part2: ${measureDistancePart2(input)}")
  }
}
