val filename =
  if (!args.isEmpty) args(0)
  else "default.txt"

var line = ""
do {
  line = readLine()
  println("Read: " + line)
} while (line != "")