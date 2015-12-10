package daytwo

import multipleLineInput

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
  multipleLineInput("daytwo", "pretent_wrapping_paper_input.txt") { fileContent ->
    fileContent.map { requiredPaper(it) }.sum()
  }
}
