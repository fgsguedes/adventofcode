package day2

import org.junit.Assert.assertEquals
import org.junit.Test

class BathroomSecurityTest {

  private val input = listOf(
      "ULL",
      "RRDDD",
      "LURDL",
      "UUUUD"
  )

  @Test
  fun testPart1ExampleInput() {
    assertEquals("1985", solveCodePart1(input))
  }

  @Test
  fun testPart2ExampleInput() {
    assertEquals("5DB3", solveCodePart2(input))
  }
}
