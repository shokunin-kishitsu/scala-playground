val fruit: List[String] = List("apples", "oranges", "pears")
val nums: List[Int] = List(1, 2, 3, 4)
val diag3: List[List[Int]] =
  List(
    List(1, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )
val empty: List[Nothing] = List()
val xs: List[String] = List()

// alternative way to construct lists
val fruit2 = "apples" :: "oranges" :: "pears" :: Nil
val nums2 = 1 :: 2 :: 3 :: 4 :: Nil
val diag3_2 = (1 :: (0 :: (0 :: Nil))) ::
              (0 :: (1 :: (0 :: Nil))) ::
              (0 :: (0 :: (1 :: Nil))) :: Nil
val empty2 = Nil

// insertion sorting in Scala
def isort(xs: List[Int]): List[Int] =
  if (xs.isEmpty) Nil
  else insert(xs.head, isort(xs.tail))

def insert(x: Int, xs: List[Int]): List[Int] =
  if (xs.isEmpty || x <= xs.head) x :: xs
  else xs.head :: insert(x, xs.tail)


println(isort(List(5, 6, 2, 8, 3, 1, 0)))

val List(a, b, c) = fruit
println(a)
println(b)
println(c)

val aa :: bb :: rest = nums
println(aa)
println(bb)
println(rest)

// insertion sorting using pattern matching
def isort2(xs: List[Int]): List[Int] = xs match {
  case List()   => List()
  case x :: xs1 => insert2(x, isort2(xs1))
}

def insert2(x: Int, xs: List[Int]): List[Int] = xs match {
  case List()   => List(x)
  case y :: ys  =>  if (x <= y) x :: xs
                    else y :: insert2(x, ys)
}

println(isort2(List(5, 6, 2, 8, 3, 1, 0)))

// concatenation, returns List[Any]
println(List(1, 2, 3) ::: List("apples", "oranges"))

// an implementation of manual concatenation
def append[T](xs: List[T], ys: List[T]): List[T] = xs match {
  case List() =>    ys
  case x :: xs1 =>  x :: append(xs1, ys)
}

val newList = append(List(1, 2, 3), List("mangoes", "bananas"))
println(newList)
println(newList.length)

// head, tail, last, init
println(nums)
println(nums.head)
println(nums.last)
println(nums.tail)
println(nums.init)

// reverse
val abcde = List('a', 'b', 'c', 'd', 'e')
println(abcde)
println(abcde.reverse)
println(abcde.reverse.reverse == abcde)

// take, drop, and splitAt
println(abcde take 3)
println(abcde drop 2)
println(abcde splitAt 3)

// apply and indices
println(abcde apply 2)
println(abcde(2))
println(abcde.indices)

// flatten
val (left, right) = abcde.splitAt(2)
val splitList = List(left, right)
println(splitList)
println(splitList.flatten)

println(fruit.map(_.toCharArray).flatten)

// zip
println(abcde.indices zip abcde)
println(abcde.zipWithIndex)
println(abcde zip List(1, 2, 3))

// unzip
println(abcde.zipWithIndex.unzip)

// toString
println(abcde.getClass)
println(abcde.toString.getClass)

println(abcde.mkString(","))
println(abcde.mkString("[", " : ", "]"))

// StringBuilder
val buf = new StringBuilder
abcde addString (buf, "(", ";", ")")

// toArray and toList
val arr = abcde.toArray
arr.toList

// copyToArray
val arr2 = new Array[Int](10)
List(1, 2, 3) copyToArray (arr2, 3)
arr2

// iterator
val it = abcde.iterator
it.next
it.next

// using forall and exists
def hasZeroRow(m: List[List[Int]]) =
	m exists (row => row forall (_ == 0))
hasZeroRow(diag3)

// sortWith
List(1, -3, 3, 6, 7, 2, -7, 2, -6, -12, 4, 32) sortWith (_ > _)
List(1, -3, 3, 6, 7, 2, -7, 2, -6, -12, 4, 32) sortWith ((x:Int, y:Int) => (x + y) % 2 == 0)

// methods of the List object

// apply
List.apply(1, 2, 3)

// range
List.range(1, 9, 2)
List.range(9, 1, -3)

// fill
List.fill(5)('a')
List.fill(3)("hello")
List.fill(6, 6)("666")

// tabulate
val squares = List.tabulate(5)(n => n * n)
val multiplication = List.tabulate(5, 5)(_ * _)

// concat
List.concat(List(1, 2, 3), List('a'))

// zipped
(List(10, 20), List(3, 4, 5)).zipped.map(_ * _)
(List("abc", "de"), List(3, 2)).zipped.forall(_.length == _)
(List("abc", "de"), List(3, 2)).zipped.exists(_.length != _)