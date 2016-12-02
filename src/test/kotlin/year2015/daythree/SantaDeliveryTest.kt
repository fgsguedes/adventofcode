package year2015.daythree

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class SantaDeliveryTest {

  @Test
  fun testExampleInputs() {
    assertEquals(2, santaAloneUniqueVisitedHouses(">"))
    assertEquals(4, santaAloneUniqueVisitedHouses("^>v<"))
    assertEquals(2, santaAloneUniqueVisitedHouses("^v^v^v^v^v"))
  }

  @Test
  fun testSantaDeliveryWithRobot() {
    assertEquals(3, withRobotUniqueVisitedHouses("^v"))
    assertEquals(3, withRobotUniqueVisitedHouses("^>v<"))
    assertEquals(11, withRobotUniqueVisitedHouses("^v^v^v^v^v"))
  }
}
