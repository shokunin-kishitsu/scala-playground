import scala.collection.mutable

// sets
val mutaSet = mutable.Set(1, 2, 3)

val text = "See Spot run. Run, Spot. Run!"
val wordsArray = text.split("[ !,.]+")
val words = mutable.Set.empty[String]
for (word <- wordsArray)
  words += word.toLowerCase
words

val nums = Set(1, 2, 3)
nums + 5
nums - 3
nums ++ List(5, 6)
nums -- List(1, 2)
nums & Set(1, 3, 5, 7)
nums.size
nums.contains(3)

words.clear
words

// maps
val map = mutable.Map.empty[String, Int]
map("hello") = 1
map("there") = 2
map
map("hello")

val mums = Map("i" -> 1, "ii" -> 2)
mums + ("vi" -> 6)
mums - "ii"
mums ++ List("iii" -> 3, "v" -> 5)
mums -- List("i", "ii")
mums.size
mums.contains("ii")
mums("ii")
mums.keys
mums.keySet
mums.values
mums.isEmpty