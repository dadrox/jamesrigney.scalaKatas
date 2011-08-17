import kata.Fibonacci
import org.junit.Test
class FibonacciTest {

	@Test
	def testFibonacci_0() {
		val nthElement = 0
		val unit = new Fibonacci()
		assert(0 == unit.fibonacci(nthElement))
	}

	@Test
	def testFibonacci_1() {
		val nthElement = 1
		val unit = new Fibonacci()
		assert(1 == unit.fibonacci(nthElement))
	}

	@Test
	def testFibonacci_11() {
		val nthElement = 11
		val unit = new Fibonacci()
		assert(89 == unit.fibonacci(nthElement))
	}

	@Test
	def testFibonacci_14() {
		val nthElement = 14
		val unit = new Fibonacci()
		assert(377 == unit.fibonacci(nthElement))
	}
}