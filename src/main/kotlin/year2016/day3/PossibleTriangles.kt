package year2016.day3

import fromMultipleLineInput

fun possibleTrianglesPart1(input: List<String>): Int {

  return input.count { line ->

    val (a, b, c) = line.trim()
        .split(" ")
        .filter(String::isNotBlank)
        .map(String::toInt)
        .sorted()

    a + b > c
  }
}

fun possibleTrianglesPart2(input: List<String>): Int {

  val firstBuffer = mutableListOf<Int>()
  val secondBuffer = mutableListOf<Int>()
  val thirdBuffer = mutableListOf<Int>()

  input.forEach { line ->

    val (a, b, c) = line.trim()
        .split(" ")
        .filter(String::isNotBlank)
        .map(String::toInt)

    firstBuffer += a
    secondBuffer += b
    thirdBuffer += c
  }

  val inputList = firstBuffer + secondBuffer + thirdBuffer

  return (0..inputList.size - 1 step 3).count {
    val (a, b, c) = sorted(inputList[it], inputList[it + 1], inputList[it + 2])
    a + b > c
  }
}

fun sorted(vararg int: Int) = int.sorted()

fun main(args: Array<String>) {
  fromMultipleLineInput(2016, 3, "PossibleTrianglesInput.txt") { input ->
    println(possibleTrianglesPart1(input))
    println(possibleTrianglesPart2(input))
  }
}