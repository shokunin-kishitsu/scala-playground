def boom(x: Int): Int =
	if (x == 0) throw new Exception("boom!")
	else boom(x - 1) + 1

boom(5)