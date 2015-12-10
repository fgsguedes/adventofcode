import java.nio.file.Files
import java.nio.file.Paths

fun oneLineInput(puzzleDay: String, inputeFileName: String, f: (String) -> Any) {
  val path = Paths.get("src", "main", "resources", puzzleDay, inputeFileName)
  val input = String(Files.readAllBytes(path))
  val resultingFloor = f(input)
  println(resultingFloor)
}

fun multipleLineInput(puzzleDay: String, inputeFileName: String, f: (List<String>) -> Any) {
  val path = Paths.get("src", "main", "resources", puzzleDay, inputeFileName)
  val input = Files.readAllLines(path)
  val resultingFloor = f(input)
  println(resultingFloor)
}