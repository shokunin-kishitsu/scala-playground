import scala.collection.mutable.ListBuffer

// lists
val colors = List("red", "blue", "green")
colors.head
colors.tail

// arrays
val fiveInts = new Array[Int](5)
val fiveToOne = Array(5, 4, 3, 2, 1)

fiveInts(0) = fiveToOne(4)
fiveInts

// list buffers
val buf = new ListBuffer[Int]
buf += 1
buf += 2

3 +=: buf
buf.toList