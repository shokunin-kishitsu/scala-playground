List(1, 2, 3) map (_ + 1)
val words = List("the", "quick", "brown", "fox")
words map (_.length)
words map (_.toList.reverse.mkString)

words map (_.toList)
words flatMap (_.toList)

List.range(1, 5) flatMap(i => List.range(1, i) map (j => (i, j)))
for (i <- List.range(1, 5); j <- List.range(1, i)) yield (i, j)

var sum = 0
List.range(1, 6) foreach (sum += _)
sum