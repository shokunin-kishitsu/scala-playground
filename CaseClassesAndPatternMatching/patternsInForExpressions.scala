val results = List(Some("apple"), None, Some("orange"))
for(Some(fruit) <- results) println(fruit)