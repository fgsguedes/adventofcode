package dayone

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class NotQuiteListTest {

  @Test
  fun testExampleInputs() {
    assertEquals(0, computeFloor("(())"))
    assertEquals(0, computeFloor("()()"))
    assertEquals(3, computeFloor("((("))
    assertEquals(3, computeFloor("(()(()("))
    assertEquals(3, computeFloor("))((((("))
    assertEquals(-1, computeFloor("())"))
    assertEquals(-1, computeFloor("))("))
    assertEquals(-3, computeFloor(")))"))
    assertEquals(-3, computeFloor(")())())"))
  }

  @Test
  fun testNegativeFloor() {
    assertEquals(1, firstBasementPosition(")"))
    assertEquals(5, firstBasementPosition("()())"))

    assertEquals(0, firstBasementPosition("(())"))
    assertEquals(0, firstBasementPosition("()()"))
    assertEquals(0, firstBasementPosition("((("))
    assertEquals(0, firstBasementPosition("(()(()("))
    assertEquals(1, firstBasementPosition("))((((("))
    assertEquals(3, firstBasementPosition("())"))
    assertEquals(1, firstBasementPosition("))("))
    assertEquals(1, firstBasementPosition(")))"))
    assertEquals(1, firstBasementPosition(")())())"))
  }
}