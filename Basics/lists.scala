// Lists are immutable
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour // concat

println(oneTwo + " and " + threeFour + " where not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")


// cons
val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)


// another way to initialize
val anotherList = 1 :: 2 :: 3 :: Nil
println(anotherList)