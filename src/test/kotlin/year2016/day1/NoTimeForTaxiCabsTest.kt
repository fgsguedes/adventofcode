package year2016.day1

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class NoTimeForTaxiCabsTest {

  @Test
  fun testPart1ExampleInputs() {
    assertEquals(5, measureDistancePart1("R2, L3"))
    assertEquals(2, measureDistancePart1("R2, R2, R2"))
    assertEquals(12, measureDistancePart1("R5, L5, R5, R3"))
  }

  @Test
  fun testPart2ExampleInputs() {
    assertEquals(4, measureDistancePart2("R8, R4, R4, R8"))
  }
}