package day1

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.function.Executable

class CaptchaTest {

  @Test
  fun testPart1ExampleInput() {
    assertAll(
        Executable { assertEquals(3, solveCaptchaPart1("1122")) },
        Executable { assertEquals(4, solveCaptchaPart1("1111")) },
        Executable { assertEquals(0, solveCaptchaPart1("1234")) },
        Executable { assertEquals(9, solveCaptchaPart1("91212129")) }
    )
  }

  @Test
  fun testPart2ExampleInput() {
    assertAll(
        Executable { assertEquals(6, solveCaptchaPart2("1212")) },
        Executable { assertEquals(0, solveCaptchaPart2("1221")) },
        Executable { assertEquals(4, solveCaptchaPart2("123425")) },
        Executable { assertEquals(12, solveCaptchaPart2("123123")) },
        Executable { assertEquals(4, solveCaptchaPart2("12131415")) }
    )
  }
}
