class Rational(n: Int, d: Int) {
	require (d != 0)
	val numerator: Int = n
	val denominator: Int = d

	override def toString = s"$n/$d"

	def add(that: Rational):Rational = {
		new Rational(
			numerator * that.denominator + denominator * that.numerator,
			denominator * that.denominator
		)
	}
}

val r1 = new Rational(1, 2)
println(r1)

val r2 = new Rational(44, 467)
println(r2)

println(r1.add(r2))