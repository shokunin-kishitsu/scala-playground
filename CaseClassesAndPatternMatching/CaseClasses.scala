sealed abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

val v = Var("x")
val op = BinOp("+", Number(1), v)

println(v.name)
println(op.left)
println(op)
println(op.right == Var("x"))

println(op.copy(operator = "-"))

def simplifyTop(expr: Expr): Expr = expr match {
	case UnOp("-", UnOp("-", e)) => e
	case BinOp("+", e, Number(0)) => e
	case BinOp("*", e, Number(1)) => e
	case _ => expr
}

println(simplifyTop(UnOp("-", UnOp("-", Var("x")))))

def describe(e: Expr): String = e match {
	case Number(_) => "a number"
	case Var(_) => "a variable"
	case _ => throw new RuntimeException
}