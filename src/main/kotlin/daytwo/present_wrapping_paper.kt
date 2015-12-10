package daytwo

import fromMultipleLineInput

fun requiredPaper(input: String): Int {
  val box = Box.fromInputString(input)
  return box.area() + box.smallerFace().area()
}

data class Box(val front: Face, val top: Face, val side: Face) {

  companion object {
    fun fromInputString(input: String): Box {
      val (length, height, width) = input.split("x").map { it.toInt() }

      return Box(
          Face(length, height),
          Face(length, width),
          Face(height, width))
    }
  }

  val faces = arrayOf(front, top, side).sortedBy { it.area() }

  fun area() = 2 * front.area() + 2 * top.area() + 2 * side.area()
  fun smallerFace() = faces.first()
}

data class Face(val width: Int, val height: Int) {
  fun area() = width * height
}

fun main(args: Array<String>) {
  val requiredWrappingPaper = fromMultipleLineInput("daytwo", "pretent_wrapping_paper_input.txt") { fileContent ->
    fileContent.map { requiredPaper(it) }.sum()
  }

  println(requiredWrappingPaper)
}
