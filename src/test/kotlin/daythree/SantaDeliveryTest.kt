package daythree

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class SantaDeliveryTest {

  @Test
  fun testExampleInputs() {
    assertEquals(2, uniqueVisitedHouses(">"))
    assertEquals(4, uniqueVisitedHouses("^>v<"))
    assertEquals(2, uniqueVisitedHouses("^v^v^v^v^v"))
  }
}
