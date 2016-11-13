object Element {

	private class ArrayElement(val contents: Array[String])
		extends Element

	private class LineElement(s: String) extends ArrayElement(Array(s)) {
		override val width = s.length
		override val height = 1
	}

	private class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element {
		private val line = ch.toString * width
		def contents = Array.fill(height)(line)
	}

	def elem(contents: Array[String]): Element =
		new ArrayElement(contents)

	def elem(chr: Char, width: Int, height: Int): Element =
		new UniformElement(chr, width, height)

	def elem(line: String): Element =
		new LineElement(line)
}