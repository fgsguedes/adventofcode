package daytwo

import fromMultipleLineInput

fun boxFromInput(input: String): Box {
  val (length, height, width) = input.split("x").map { it.toInt() }
  return Box(length, height, width)
}

fun requiredPaper(input: String): Int {
  val box = boxFromInput(input)
  return box.area + box.smallerFace.area
}

fun requiredRibbon(input: String): Int {
  val box = boxFromInput(input)
  return box.smallerFace.perimeter + box.height * box.width * box.length
}

data class Box(val length: Int, val height: Int, val width: Int) {

  private val front = Face(length, height)
  private val top = Face(length, width)
  private val side = Face(height, width)

  val smallerFace = arrayOf(front, top, side).sortedBy { it.area }.first()
  val area = 2 * front.area + 2 * top.area + 2 * side.area
}

data class Face(val width: Int, val height: Int) {
  val area = width * height
  val perimeter = 2 * width + 2 * height
}


fun main(args: Array<String>) {
  val requiredWrappingPaper = fromMultipleLineInput("daytwo", "present_wrapping_paper_input.txt") { fileContent ->
    fileContent.map { requiredPaper(it) }.sum()
  }

  val requiredRibbon = fromMultipleLineInput("daytwo", "present_wrapping_ribbon_input.txt") { fileContent ->
    fileContent.map { requiredRibbon(it) }.sum()
  }

  println(requiredWrappingPaper)
  println(requiredRibbon)
}
