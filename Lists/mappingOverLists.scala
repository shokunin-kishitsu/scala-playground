List(1, 2, 3) map (_ + 1)
val words = List("the", "quick", "brown", "fox")
words map (_.length)
words map (_.toList.reverse.mkString)