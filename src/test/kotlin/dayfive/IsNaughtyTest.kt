package dayfive

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@RunWith(JUnit4::class)
class IsNaughtyTest {

  @Test
  fun testNaughtyExampleInputs() {
    assertTrue { "ugknbfddgicrmopn".isNice() }
    assertTrue { "aaa".isNice() }
    assertFalse { "jchzalrnumimnmhp".isNice() }
    assertFalse { "haegwjzuvuyypxyu".isNice() }
    assertFalse { "dvszwmarrgswjxmb".isNice() }
  }
}