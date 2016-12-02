package year2015.dayone

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class NotQuiteLispTest {

  @Test
  fun testComputeFloorExampleInput() {
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
  fun testBasementPositionExampleInput() {
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