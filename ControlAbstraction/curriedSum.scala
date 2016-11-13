def curriedSum(x: Int)(y: Int) = x + y

val onePlus = curriedSum(1)_
println(onePlus(2))