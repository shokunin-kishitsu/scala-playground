val filesHere = (new java.io.File(".")).listFiles

val scalaFiles =
	for {
		file <- filesHere
		if file.getName.endsWith(".scala")
	} yield file

println(scalaFiles.toList)