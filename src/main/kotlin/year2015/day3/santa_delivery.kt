package year2015.day3

import fromOneLineInput

fun Int.isOdd() = this % 2 == 1

data class House(val x: Int, val y: Int) {

  val northNeighbor: House by lazy { House(x, y + 1) }
  val southNeighbor: House by lazy { House(x, y - 1) }
  val westNeighbor: House by lazy { House(x - 1, y) }
  val eastNeighbor: House by lazy { House(x + 1, y) }
}

fun santaAloneUniqueVisitedHouses(input: String): Int {
  val inputCharList = input.toCharArray().asList()
  return uniqueVisitedHouses(inputCharList, ::toVisitedHouses)
}

fun withRobotUniqueVisitedHouses(input: String): Int {
  val inputCharList = input.toCharArray().asList()
  return uniqueVisitedHouses(inputCharList, ::toVisitedHousesWithRobot)
}

private fun uniqueVisitedHouses(input: List<Char>, f: (List<Char>) -> List<House>) = f(input).distinct().size

private fun toVisitedHouses(input: List<Char>): List<House> {

  val initialHouse = House(0, 0)

  var currentHouse = initialHouse
  return listOf(initialHouse)
      .plus(input.map {
        currentHouse = nextHouse(currentHouse, it)
        currentHouse
      })
}

private fun toVisitedHousesWithRobot(input: List<Char>): List<House> {

  val initialHouse = House(0, 0)

  var santaHouse = initialHouse
  var robotHouse = initialHouse
  val lala = listOf(initialHouse)
      .plus(input.mapIndexed { index, c ->
        when (index.isOdd()) {
          true -> {
            robotHouse = nextHouse(robotHouse, c)
            robotHouse
          }
          else -> {
            santaHouse = nextHouse(santaHouse, c)
            santaHouse
          }
        }
      })

  return lala
}

private fun nextHouse(currentHouse: House, moveInstruction: Char) = when (moveInstruction) {
  '^' -> currentHouse.northNeighbor
  'v' -> currentHouse.southNeighbor
  '<' -> currentHouse.westNeighbor
  '>' -> currentHouse.eastNeighbor
  else -> throw IllegalArgumentException("Invalid input")
}

fun main(args: Array<String>) {
  val housesVisited = fromOneLineInput(2015, 3, "santa_delivery_input.txt", ::santaAloneUniqueVisitedHouses)
  val housesVisitedWithRobot = fromOneLineInput(2015, 3, "santa_with_robot_delivery_input.txt", ::withRobotUniqueVisitedHouses)

  println(housesVisited)
  println(housesVisitedWithRobot)
}