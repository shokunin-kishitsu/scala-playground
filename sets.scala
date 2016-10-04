import scala.collection.mutable

// immutable
var jetSet = Set("Boeing", "Airbus")
println(jetSet.getClass)
jetSet += "Lear"
println(jetSet.getClass)
println(jetSet.contains("Cessna"))

// mutable
val movieSet = mutable.Set("Hitch", "Poltergeist")
println(movieSet.getClass)
movieSet += "Shrek"
println(movieSet.getClass)
println(movieSet)