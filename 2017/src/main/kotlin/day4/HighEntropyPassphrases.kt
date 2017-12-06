package day4

import fromMultipleLineInput

fun isPassPhraseValid(input: String): Boolean {
  return input.split(' ').let {
    it.size == it.distinct().size
  }
}

fun isPassPhraseValidPart2(input: String): Boolean {
  val split = input.split(' ')
  split.forEachIndexed { index, word ->
    if (split.drop(index + 1).any {
      word.toList().sorted() == it.toList().sorted()
    }) return false
  }

  return true
}

fun main(args: Array<String>) {
  fromMultipleLineInput(2017, 4, "HighEntropyPassphrasesInput.txt") { input ->
    println(input.count(::isPassPhraseValid))
  }

  fromMultipleLineInput(2017, 4, "HighEntropyPassphrasesInputPart2.txt") { input ->
    println(input.count(::isPassPhraseValidPart2))
  }
}