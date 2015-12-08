package dayone

import java.nio.file.Files
import java.nio.file.Paths

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
  execute("not_quite_lisp.txt") {
    computeFloor(it)
  }

  execute("not_quite_lisp_part_two.txt") {
    firstBasementPosition(it)
  }
}

fun execute(inputeFileName: String, f: (String) -> Any) {
  val path = Paths.get("src", "main", "resources", "dayone", inputeFileName)
  val input = String(Files.readAllBytes(path))
  val resultingFloor = f(input)
  println(resultingFloor)
}