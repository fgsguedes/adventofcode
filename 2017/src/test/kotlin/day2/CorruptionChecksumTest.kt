package day2

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class CorruptionChecksumTest {

  @Test
  fun testPart1ExampleInput() {
    val input = listOf(
        listOf(5, 1, 9, 5),
        listOf(7, 5, 3),
        listOf(2, 4, 6, 8)
    )

    assertEquals(18, calcCheckSum(input))
  }

  @Test
  fun testPart2ExampleInput() {
    val input = listOf(
        listOf(5, 9, 2, 8),
        listOf(9, 4, 7, 3),
        listOf(3, 8, 6, 5)
    )

    assertEquals(9, calcCheckSumPart2(input))
  }
}