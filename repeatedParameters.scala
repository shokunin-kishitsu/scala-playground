val arr = Array("what's", "up", "doc?")

def echo(args: String*) =
	for (arg <- args) println(arg)

echo()
echo("one")
echo("one", "two")
echo("one", "two", "three")

echo(arr: _*)