import org.scalatest.FunSuite
import Element.elem

class ElementSuite extends FunSuite {
	test("elem result should have passed width") {
		val ele = elem('x', 2, 3)
		assert(ele.width == 2)
	}

  test("assert many things") {
  	val width = 2
  	assert(width == 2)

  	assert(List(1,2,3,4).contains(3))

  	val ele = elem('x', 2, 3)
  	assertResult(2) {
  		ele.width
  	}

  	assertThrows[IllegalArgumentException] {
  		elem('x', -2, 3)
  	}
  }

  test("assert intercept") {
  	val caught =
  		intercept[ArithmeticException] {
  			1 / 0
  		}
  	assert(caught.getMessage == "/ by zero")
  }
}