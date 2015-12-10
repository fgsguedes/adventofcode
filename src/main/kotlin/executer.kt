import java.nio.file.Files
import java.nio.file.Paths

fun <T> fromOneLineInput(puzzleDay: String, inputeFileName: String, f: (String) -> T): T {
  val path = Paths.get("src", "main", "resources", puzzleDay, inputeFileName)
  val input = String(Files.readAllBytes(path))
  return f(input)
}

fun <T> fromMultipleLineInput(puzzleDay: String, inputeFileName: String, f: (List<String>) -> T): T {
  val path = Paths.get("src", "main", "resources", puzzleDay, inputeFileName)
  val input = Files.readAllLines(path)
  return f(input)
}