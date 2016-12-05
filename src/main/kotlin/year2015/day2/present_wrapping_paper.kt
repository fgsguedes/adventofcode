package year2015.day2

import fromMultipleLineInput

fun boxFromInput(input: String): Box {
  val (length, height, width) = input.split("x").map(String::toInt)
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

  val smallerFace = arrayOf(front, top, side).sortedBy(Face::area).first()
  val area = 2 * front.area + 2 * top.area + 2 * side.area
}

data class Face(val width: Int, val height: Int) {
  val area = width * height
  val perimeter = 2 * width + 2 * height
}


fun main(args: Array<String>) {
  val requiredWrappingPaper = fromMultipleLineInput(2015, 2, "present_wrapping_paper_input.txt") { fileContent ->
    fileContent.map(::requiredPaper).sum()
  }

  val requiredRibbon = fromMultipleLineInput(2015, 2, "present_wrapping_ribbon_input.txt") { fileContent ->
    fileContent.map(::requiredRibbon).sum()
  }

  println(requiredWrappingPaper)
  println(requiredRibbon)
}
