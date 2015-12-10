package daytwo

import java.nio.file.Files
import java.nio.file.Paths

fun requiredPaper(input: String): Int {
  val (length, height, width) = input.split("x").map { it.toInt() }

  val box = Box(
      Face(length, height),
      Face(length, width),
      Face(height, width))

  return box.area() + box.smallerFace().area()
}

data class Box(val front: Face, val top: Face, val side: Face) {

  val faces = arrayOf(front, top, side).sortedBy { it.area() }

  fun area() = 2 * front.area() + 2 * top.area() + 2 * side.area()
  fun smallerFace() = faces.first()
}

data class Face(val width: Int, val height: Int) {
  fun area() = width * height
}

fun main(args: Array<String>) {
  execute("pretent_wrapping_paper_input.txt") { fileContent ->
    fileContent.map { requiredPaper(it) }.sum()
  }
}

fun execute(inputeFileName: String, f: (List<String>) -> Any) {
  val path = Paths.get("src", "main", "resources", "daytwo", inputeFileName)
  val input = Files.readAllLines(path)
  val resultingFloor = f(input)
  println(resultingFloor)
}