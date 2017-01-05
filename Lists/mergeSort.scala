def msort[T](less: (T, T) => Boolean)(xs: List[T]): List[T] = {
	def merge(xs: List[T], ys: List[T]): List[T] =
		(xs, ys) match {
			case (Nil, _) => ys
			case (_, Nil) => xs
			case (x :: xs1, y :: ys1) =>
				if (less(x, y)) x :: merge(xs1, ys)
				else y :: merge(xs, ys1)
		}

	val n = xs.length / 2
	if (n == 0) xs
	else {
		val (ys, zs) = xs splitAt n
		merge(msort(less)(ys), msort(less)(zs))
	}
}

msort((x: Int, y: Int) => x < y)(List(5, 3, 7, 1, 8))

val intSort = msort((x: Int, y: Int) => x < y) _
intSort(List(9, 8, 7, 5, 4, 3, 2, 1))

val reverseSort = msort((x: Int, y: Int) => x > y) _
reverseSort(List(1, 2, 3, 4, 5, 6, 7, 8))

msort[Int](_ > _)(List(5, 3, 7, 1, 8))

def msortSwapped[T](xs: List[T])(less: (T, T) => Boolean): List[T] = {
	def merge(xs: List[T], ys: List[T]): List[T] =
		(xs, ys) match {
			case (Nil, _) => ys
			case (_, Nil) => xs
			case (x :: xs1, y :: ys1) =>
				if (less(x, y)) x :: merge(xs1, ys)
				else y :: merge(xs, ys1)
		}

	val n = xs.length / 2
	if (n == 0) xs
	else {
		val (ys, zs) = xs splitAt n
		merge(msort(less)(ys), msort(less)(zs))
	}
}

msortSwapped(List(5, 3, 7, 1, 8))(_ > _)