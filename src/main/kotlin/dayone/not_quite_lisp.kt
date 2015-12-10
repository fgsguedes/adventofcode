package dayone

import oneLineInput

fun characterInstruction(char: Char) = when (char) {
  '(' -> 1
  ')' -> -1
  else -> 0 // Should never happen
}

fun computeFloor(input: String) = input.map { characterInstruction(it) }.sum()

fun firstBasementPosition(input: String): Int {
  val counter = Counter()
  return input.indexOfFirst { counter.compute(it) } + 1
}

data class Counter(private var floor: Int = 0) {
  fun compute(input: Char): Boolean {
    floor += characterInstruction(input)
    return floor < 0
  }
}


fun main(args: Array<String>) {
  val currentDay = "dayone"
  oneLineInput(currentDay, "not_quite_lisp.txt") {
    computeFloor(it)
  }

  oneLineInput(currentDay, "not_quite_lisp_part_two.txt") {
    firstBasementPosition(it)
  }
}