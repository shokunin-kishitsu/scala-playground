class Rational(n: Int, d: Int) extends Ordered[Rational] {
	require (d != 0)

	private val g = gcd(n.abs, d.abs)
	val numerator = n / g
	val denominator = d / g

	def this(n: Int) = this(n, 1)

	override def toString = s"$numerator/$denominator"

	def + (that: Rational): Rational = {
		new Rational(
			numerator * that.denominator + denominator * that.numerator,
			denominator * that.denominator
		)
	}

	def + (i: Int): Rational =
    new Rational(numerator + i * denominator, denominator)

  def - (that: Rational): Rational =
    new Rational(
      numerator * that.denominator - that.numerator * denominator,
      denominator * that.denominator
    )

  def - (i: Int): Rational =
    new Rational(numerator - i * denominator, denominator)

  def * (that: Rational): Rational =
    new Rational(numerator * that.numerator, denominator * that.denominator)

  def * (i: Int): Rational =
    new Rational(numerator * i, denominator)

  def / (that: Rational): Rational =
    new Rational(numerator * that.denominator, denominator * that.numerator)

  def / (i: Int): Rational =
    new Rational(numerator, denominator * i)

  def compare(that: Rational) =
		(this.numerator * that.denominator) -  (that.numerator * this.denominator)

	private def gcd(a: Int, b: Int): Int = {
		if (b == 0) a else gcd(b, a % b)
	}
}

val r1 = new Rational(1, 2)
println(r1)

val r2 = new Rational(44, 467)
println(r2)

println(r1 + r2)
println(r1 * r2)

println((r1 + r2) * r2)
println(r1 + r2 * r2)

println(new Rational(5))
println(new Rational(66, 42))

implicit def intToRational(x: Int) = new Rational(x)

println(r2 * 5)
println(5 * r2)

println(r1 > r2)
println(r1 <= r2)