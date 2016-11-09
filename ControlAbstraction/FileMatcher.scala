object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles

  private def filesMatching(matcher: String => Boolean) =
		for (file <- filesHere; if matcher(file.getName))
			yield file

  def filesEnding(query: String) = filesMatching(_.endsWith(query))
  def filesContaining(query: String) = filesMatching(_.contains(query))
  def filesRegex(query: String) = filesMatching(_.matches(query))
}

println(FileMatcher.filesEnding("scala").toList)
println(FileMatcher.filesContaining("Mat").toList)
println(FileMatcher.filesRegex("FileMatcher.scala").toList)
