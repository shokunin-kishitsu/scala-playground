var num = args(0).toInt

val half =
	if (num % 2 == 0)
		num / 2
	else
		throw new RuntimeException("num must be even")

println(half)

