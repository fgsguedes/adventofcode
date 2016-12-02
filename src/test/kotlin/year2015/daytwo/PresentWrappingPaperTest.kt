package year2015.daytwo

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PresentWrappingPaperTest {

  @Test
  fun testRequiredPaperExampleInput() {
    assertEquals(58, requiredPaper("2x3x4"))
    assertEquals(43, requiredPaper("1x1x10"))
  }

  @Test
  fun testRequiredRibbonExampleInput() {
    assertEquals(34, requiredRibbon("2x3x4"))
    assertEquals(14, requiredRibbon("1x1x10"))
  }
}