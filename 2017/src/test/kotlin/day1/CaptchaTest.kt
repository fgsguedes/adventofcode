package day1

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class CaptchaTest {

  @Test
  fun testPart1ExampleInput() {
    assertEquals(3, solveCaptcha("1122"))
    assertEquals(4, solveCaptcha("1111"))
    assertEquals(0, solveCaptcha("1234"))
    assertEquals(9, solveCaptcha("91212129"))
  }
}
