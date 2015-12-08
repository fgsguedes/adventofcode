package dayone

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class NotQuiteListTest {

  @Test
  fun testExampleInputs() {
    assertEquals(computeFloor("(())"), 0)
    assertEquals(computeFloor("()()"), 0)
    assertEquals(computeFloor("((("), 3)
    assertEquals(computeFloor("(()(()("), 3)
    assertEquals(computeFloor("))((((("), 3)
    assertEquals(computeFloor("())"), -1)
    assertEquals(computeFloor("))("), -1)
    assertEquals(computeFloor(")))"), -3)
    assertEquals(computeFloor(")())())"), -3)
  }
}