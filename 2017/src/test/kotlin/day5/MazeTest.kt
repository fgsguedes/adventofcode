package day5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MazeTest {

  @Test
  fun testPart1ExampleInput() {
    assertEquals(5, leaveMaze(listOf(0, 3, 0, 1, -3)))
  }

  @Test
  fun testPart2ExampleInput() {
    assertEquals(10, leaveMazePart2(listOf(0, 3, 0, 1, -3)))
  }
}