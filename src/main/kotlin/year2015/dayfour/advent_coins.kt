package year2015.dayfour

import java.math.BigInteger
import java.security.MessageDigest

fun String.toMd5(): String {
  val messageDigest = MessageDigest.getInstance("MD5")
  val bytes = messageDigest.digest(this.toByteArray())
  val bigInt = BigInteger(1, bytes).toString(16)

  val stringBuilder = StringBuilder(bigInt)

  while (stringBuilder.length < 32) {
    stringBuilder.insert(0, "0")
  }

  return stringBuilder.toString()
}

fun mineAdventCoin(input: String) = (1..Int.MAX_VALUE).first {
  (input + it).toMd5().startsWith("00000")
}

fun mineAdventCoin2(input: String) = (1..Int.MAX_VALUE).first {
  (input + it).toMd5().startsWith("000000")
}


fun main(args: Array<String>) {
  val output = mineAdventCoin("ckczppom")
  val output2 = mineAdventCoin2("ckczppom")

  println(output)
  println(output2)
}