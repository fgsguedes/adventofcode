package dayone

import java.nio.file.Files
import java.nio.file.Paths

fun computeFloor(input: String) = input.map {
  when (it) {
    '(' -> 1
    ')' -> -1
    else -> 0 // Should never happen
  }
}.sum()

fun main(args: Array<String>) {
  val path = Paths.get("src", "main", "resources", "dayone", "not_quite_lisp.txt")
  val input = String(Files.readAllBytes(path))
  val resultingFlor = computeFloor(input)

  println(resultingFlor)
}