package daytwo

fun computeArea(input: String) {
  val (length, height, width) = input.split("x").map { it.toInt() }

  computeArea(length, height, width)
}

fun computeArea(length: Int, height: Int, width: Int) = 2 * length * width +
    2 * width * height +
    2 * height * length +
    smallerSideArea(length, height, width)

fun smallerSideArea(length: Int, height: Int, width: Int) = 0
