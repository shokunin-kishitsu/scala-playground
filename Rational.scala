class Rational(n: Int, d: Int) {
	require (d != 0)

	private val g = gcd(n.abs, d.abs)
	val numerator = n / g
	val denominator = d / g

	def this(n: Int) = this(n, 1)

	override def toString = s"$numerator/$denominator"

	def add(that: Rational):Rational = {
		new Rational(
			numerator * that.denominator + denominator * that.numerator,
			denominator * that.denominator
		)
	}

	private def gcd(a: Int, b: Int): Int = {
		if (b == 0) a else gcd(b, a % b)
	}
}

val r1 = new Rational(1, 2)
println(r1)

val r2 = new Rational(44, 467)
println(r2)

println(r1 add r2)

println(new Rational(5))
println(new Rational(66, 42))