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
val fruit2 = "apples" :: ("oranges" :: ("pears" :: Nil))
val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)))
val diag3_2 = (1 :: (0 :: (0 :: Nil))) ::
              (0 :: (1 :: (0 :: Nil))) ::
              (0 :: (0 :: (1 :: Nil))) :: Nil
val empty2 = Nil