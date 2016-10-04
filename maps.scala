import scala.collection.mutable

// mutable
val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on the ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap.getClass)
println(treasureMap(2))

// immutable
val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
println(romanNumeral.getClass)
println(romanNumeral(4))
