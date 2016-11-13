def existsNeg(list: List[Int]): Boolean = list.exists(_ < 0)

println(existsNeg(List(4,5,6,7)))
println(existsNeg(List(-5,65,5,35)))