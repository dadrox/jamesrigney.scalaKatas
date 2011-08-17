import org.junit.Test
import org.junit.Assert._
import kata.FizzBuzzer

class FizzBuzzerTest {

  @Test
  def multipleOfThree() {
    val unit = new FizzBuzzer()
    val result = unit.getString(3)
    assert(result == "FIZZ")
  }

  @Test
  def multipleOfFive() {
    val unit = new FizzBuzzer()
    val result = unit.getString(5)
    assert(result == "BUZZ")
  }
  
  @Test
  def multipleOfFiveAndThree(){
    val unit = new FizzBuzzer()
    val result = unit.getString(15);
    assert(result == "FIZZBUZZ")
  }
}