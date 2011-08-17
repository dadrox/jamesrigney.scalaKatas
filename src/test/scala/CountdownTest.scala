import org.junit.Test
import kata.Countdown

class CountdownTest {
@Test
  def testCountdown() {
	val unit = new Countdown()
	val startFrom = 11
	assert((startFrom to 0) == unit.countdown(startFrom))
  }
  
}