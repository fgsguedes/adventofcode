import java.nio.file.Files
import java.nio.file.Paths

fun <T> fromOneLineInput(puzzleYear: Int, puzzleDay: Int, inputeFileName: String, f: (String) -> T): T {
  val path = Paths.get("$puzzleYear", "src", "main", "resources", "day$puzzleDay", inputeFileName)
  val input = String(Files.readAllBytes(path))
  return f(input)
}

fun <T> fromMultipleLineInput(puzzleYear: Int, puzzleDay: Int, inputeFileName: String, f: (List<String>) -> T): T {
  val path = Paths.get("$puzzleYear", "src", "main", "resources", "day$puzzleDay", inputeFileName)
  val input = Files.readAllLines(path)
  return f(input)
}
