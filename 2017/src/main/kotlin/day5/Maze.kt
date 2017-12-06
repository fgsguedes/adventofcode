package day5

import fromMultipleLineInput

fun leaveMaze(input: List<Int>): Int {
  val mutable = input.toMutableList()
  var steps = 0
  var index = 0

  do {
    steps++
    val offset = mutable[index]
    mutable[index] = offset + 1
    index += offset
  } while (index < mutable.size)

  return steps
}

fun leaveMazePart2(input: List<Int>): Int {
  val mutable = input.toMutableList()
  var steps = 0
  var index = 0

  do {
    steps++
    val offset = mutable[index]
    mutable[index] = offset + if (offset >= 3) -1 else 1
    index += offset
  } while (index < mutable.size)

  return steps
}

fun main(args: Array<String>) {
  fromMultipleLineInput(2017, 5, "MazePart1Input.txt") { rawInput ->
    println(leaveMaze(rawInput.map { it.toInt() }))
  }

  fromMultipleLineInput(2017, 5, "MazePart2Input.txt") { rawInput ->
    println(leaveMazePart2(rawInput.map { it.toInt() }))
  }
}