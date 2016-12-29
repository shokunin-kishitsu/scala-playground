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