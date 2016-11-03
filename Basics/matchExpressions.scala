val firstArg = if (args.length > 0) args(0) else ""

var friend = firstArg match {
	case "salt" => "pepper"
	case "chips" => "salsa"
	case "eggs" => "bacon"
	case _ => "wat?"
}

println(friend)