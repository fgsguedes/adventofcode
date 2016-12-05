package year2015.day5

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class IsNaughtyTest {

  @Test
  fun testNaughtyExampleInputs() {
    assertTrue("ugknbfddgicrmopn".isNice())
    assertTrue("aaa".isNice())
    assertFalse("jchzalrnumimnmhp".isNice())
    assertFalse("haegwjzuvuyypxyu".isNice())
    assertFalse("dvszwmarrgswjxmb".isNice())
  }
}