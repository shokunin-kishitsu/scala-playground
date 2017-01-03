val simpleList = List(1, 2, 3, 4, 5)
def sum(xs: List[Int]): Int = (0 /: xs)(_ + _)
def product(xs: List[Int]): Int = (1 /: xs)(_ * _)

sum(simpleList)
product(simpleList)

val fox = List("the", "quick", "brown", "fox")
(fox.head /: fox.tail)(_ + " " + _)