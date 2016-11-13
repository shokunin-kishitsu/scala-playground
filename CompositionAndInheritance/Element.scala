import Element.elem

abstract class Element {
	def contents: Array[String]
	def height: Int = contents.length
	def width: Int = if (height == 0) 0 else contents(0).length
	def above(that: Element): Element = elem(this.contents ++ that.contents)
	def beside(that: Element): Element =
		elem(
			for (
				(line1, line2) <- this.contents zip that.contents
			) yield line1 + line2
		)
	override def toString = contents mkString "\n"
}

class ArrayElement(val contents: Array[String]) extends Element

val ae = new ArrayElement(Array("fish", "sauce"))
println(ae.width)

val e: Element = new ArrayElement(Array("salsa", "chips"))

class LineElement(s: String) extends ArrayElement(Array(s)) {
	override val width = s.length
	override val height = 1
}

class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element {
	private val line = ch.toString * width
	def contents = Array.fill(height)(line)
}

val e3: Element = new UniformElement('x', 4, 5)
println(e3)