import bobsdelights.Fruit

class UsingFruit extends Fruit("mango", "tango") {
	def print = {
		println(this.name)

		import bobsdelights.Fruits._

		println(Pear)
	}
}

object EasyImports {
	def main(args: Array[String]) = {
		val uf = new UsingFruit
		uf.print

		import bobsdelights.Fruits.Apple
		showFruit(Apple)
	}

	def showFruit(fruit: Fruit) = {
		import fruit._
		println(name + "s are " + color)
	}
}

