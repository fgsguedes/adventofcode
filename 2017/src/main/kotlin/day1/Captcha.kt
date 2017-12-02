package day1

import fromOneLineInput
import java.lang.Character.getNumericValue

fun solveCaptcha(input: String) = input.foldIndexed(0) { index, sum, char ->
  if (index == input.length - 1) {
    if (input[0] == char) getNumericValue(char) + sum
    else sum
  } else if (char == input[index + 1]) getNumericValue(char) + sum
  else sum
}

fun main(args: Array<String>) {
  val solution = fromOneLineInput(2017, 1, "Captcha.txt", ::solveCaptcha)
  println(solution)
}
