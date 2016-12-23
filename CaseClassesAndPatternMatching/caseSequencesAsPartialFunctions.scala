val withDefault: Option[Int] => Int = {
	case Some(x) => x
	case None => 0
}

println(withDefault(Some(10)))
println(withDefault(None))

val second: List[Int] => Int = {
	case x :: y :: _ => y
}

println(second(List(4, 5, 6)))
println(second(List(2)))