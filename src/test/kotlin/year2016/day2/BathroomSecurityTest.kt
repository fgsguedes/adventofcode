package year2016.day2

import fromMultipleLineInput
import org.junit.Assert.assertEquals
import org.junit.Test

class BathroomSecurityTest {

  @Test
  fun testPart1ExampleInput() {
    fromMultipleLineInput(2016, 2, "BathroomSecurityExampleInput.txt") { input ->
      assertEquals("1985", solveCodePart1(input))
    }
  }

  @Test
  fun testPart2ExampleInput() {
    fromMultipleLineInput(2016, 2, "BathroomSecurityExampleInput.txt") { input ->
      assertEquals("5DB3", solveCodePart2(input))
    }
  }
}