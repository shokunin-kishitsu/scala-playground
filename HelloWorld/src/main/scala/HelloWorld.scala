object HelloWorld extends App {

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  println(max(5, 7))
  println("Hello, world!")
}