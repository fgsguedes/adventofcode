package day1

import fromOneLineInput
import java.lang.Character.getNumericValue

fun solveCaptchaPart1(input: String) = input.foldIndexed(0) { index, sum, char ->
  val nextChar = input[(index + 1) % input.length]

  if (char == nextChar) getNumericValue(char) + sum
  else sum
}

fun solveCaptchaPart2(input: String): Int {
  val step = input.length / 2

  return input.foldIndexed(0) { index, sum, char ->
    val nextChar = input[(index + step) % input.length]

    if (char == nextChar) getNumericValue(char) + sum
    else sum
  }
}

fun main(args: Array<String>) {
  val part1Solution = fromOneLineInput(2017, 1, "Captcha.txt", ::solveCaptchaPart1)
  println(part1Solution)

  val part2Solution = fromOneLineInput(2017, 1, "CaptchaPart2.txt", ::solveCaptchaPart2)
  println(part2Solution)
}
