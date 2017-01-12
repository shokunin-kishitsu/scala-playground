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

// TreeSet
import scala.collection.immutable.TreeSet
val ts = TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5)
val cs = TreeSet('f', 'u', 'n')

// TreeMap
import scala.collection.immutable.TreeMap
var tm = TreeMap(3 -> 'x', 1 -> 'x', 4 -> 'x')
tm += (2 -> 'x')
tm

// initialization tricks
val colors = List("blue", "yellow", "red", "green")
val treeSet = TreeSet[String]() ++ colors

treeSet.toList
treeSet.toArray