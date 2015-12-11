package dayfour

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class AdventCoinsTest {

  @Test
  fun testExampleHashes() {
    assertEquals(609043, mineAdventCoin("abcdef"))
    assertEquals(1048970, mineAdventCoin("pqrstuv"))
  }
}