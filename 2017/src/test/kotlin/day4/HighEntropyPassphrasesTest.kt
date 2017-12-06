package day4

import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

class HighEntropyPassphrasesTest {

  @Test
  fun testPart1ExampleInput() {
    assertAll(
        Executable { assertEquals(true, isPassPhraseValid("aa bb cc dd ee")) },
        Executable { assertEquals(false, isPassPhraseValid("aa bb cc dd aa")) },
        Executable { assertEquals(true, isPassPhraseValid("aa bb cc dd aaa")) }
    )
  }

  @Test
  fun testPart2ExampleInput() {
    assertAll(
        Executable { assertEquals(true, isPassPhraseValidPart2("abcde fghij"), "abcde fghij") },
        Executable { assertEquals(false, isPassPhraseValidPart2("abcde xyz ecdab"), "abcde xyz ecdab") },
        Executable { assertEquals(true, isPassPhraseValidPart2("a ab abc abd abf abj"), "a ab abc abd abf abj") },
        Executable { assertEquals(true, isPassPhraseValidPart2("iiii oiii ooii oooi oooo"), "iiii oiii ooii oooi oooo") },
        Executable { assertEquals(false, isPassPhraseValidPart2("oiii ioii iioi iiio"), "oiii ioii iioi iiio") }
    )
  }
}