List.range(1, 6) filter (_ % 2 == 0)
List.range(1, 6) partition (_ % 2 == 0)
List.range(1, 6) find (_ % 2 == 0)

List(1, 2, 3, -4, 5) takeWhile (_ > 0)
val words = List("the", "quick", "brown", "fox")
words dropWhile (_ startsWith "t")