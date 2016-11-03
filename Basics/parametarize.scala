val big = new java.math.BigInteger("12345")

println(big)

var greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

for (i <- 0 to 2) print(greetStrings(i))

// all operations are method calls
greetStrings.update(0, "Goodbye")
greetStrings.update(1, ", cruel ")
greetStrings.update(2, "Universe!\n")

for (i <- 0 to 2) print(greetStrings.apply(i))

// an array of strings
val numNames = Array("one", "two", "three")
val numNames2 = Array.apply("zero", "one", "two")