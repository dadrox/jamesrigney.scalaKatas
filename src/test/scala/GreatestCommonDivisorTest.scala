import org.junit.Test
import kata.GreatestCommonDivisor

// Calculate the ’Greatest Common Divisor’
class GreatestCommonDivisorTest {
	@Test
	def testGreatestCommonDivisor() {
		val unit = new GreatestCommonDivisor()
		val numerator = 48
		val denominator = 18
		assert(6 == unit.calculate(numerator, denominator))
	}

}