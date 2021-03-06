package day5

import fromMultipleLineInput
import kotlin.text.Regex

fun String.isNice(): Boolean {

  val bannedWords = arrayOf(
      Regex.fromLiteral("ab"),
      Regex.fromLiteral("cd"),
      Regex.fromLiteral("pq"),
      Regex.fromLiteral("xy")
  )

  val threeVowelsRegex = Regex("[aeiou]")

  val atLeastThreeVowels = threeVowelsRegex.findAll(this).count() >= 3
  val twiceInARow = Regex("(\\w)\\1").findAll(this).count() > 0
  val containsBannedWords = bannedWords.any { it.findAll(this).count() > 0 }

  return atLeastThreeVowels && twiceInARow && !containsBannedWords
}


fun main(args: Array<String>) {
  val naughtyWords = fromMultipleLineInput(2015, 5, "naughty_words_input.txt") { fileContent ->
    fileContent.filter(String::isNice).count()
  }

  println(naughtyWords)
}
