def outputInOrder(alwaysFirst: String, alwaysSecond: String) = {
	println(alwaysFirst)
	println(alwaysSecond)
}

outputInOrder("1", "2")
outputInOrder(alwaysSecond = "2", alwaysFirst = "1")