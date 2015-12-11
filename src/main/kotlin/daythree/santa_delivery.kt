package daythree

import fromOneLineInput

data class House(val x: Int, val y: Int) {

  val northNeighbor: House by lazy { House(x, y + 1) }
  val southNeighbor: House by lazy { House(x, y - 1) }
  val westNeighbor: House by lazy { House(x - 1, y) }
  val eastNeighbor: House by lazy { House(x + 1, y) }
}

fun uniqueVisitedHouses(input: String): Int {
  val inputCharList = input.toCharArray().asList()
  return uniqueVisitedHouses(inputCharList)
}

private fun uniqueVisitedHouses(input: List<Char>) = toVisitedHouses(input).distinct().size

private fun toVisitedHouses(input: List<Char>): List<House> {

  var currentHouse = House(0, 0)

  return input.map {
    currentHouse = when (it) {
      '^' -> currentHouse.northNeighbor
      'v' -> currentHouse.southNeighbor
      '<' -> currentHouse.westNeighbor
      '>' -> currentHouse.eastNeighbor
      else -> throw IllegalArgumentException("Invalid input")
    }

    currentHouse
  }
}


fun main(args: Array<String>) {
  val housesVisited = fromOneLineInput("daythree", "santa_delivery_input.txt") { fileContent ->
    uniqueVisitedHouses(fileContent)
  }

  println(housesVisited)
}