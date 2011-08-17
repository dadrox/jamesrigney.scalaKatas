import org.junit.Test
import kata.Welcome

class WelcomeTest {
  @Test
  def testWelcome_ms() {
    val unit = new Welcome();
    val lastName = "Austen"
    val isWoman = true
    val isSir = false
    val result = unit.welcome(lastName, isWoman, isSir)
    assert(result == "Hello Ms. Austen")
  }
  @Test
  def testWelcome_sir() {
    val unit = new Welcome();
    val lastName = "Newton"
    val isWoman = false
    val isSir = true
    val result = unit.welcome(lastName, isWoman, isSir)
    assert(result == "Hello Sir Newton")
  }
  
  @Test
  def testWelcome_mr() {
    val unit = new Welcome();
    val lastName = "Orwell"
    val isWoman = false
    val isSir = false
    val result = unit.welcome(lastName, isWoman, isSir)
    assert(result == "Hello Mr. Orwell")
  }
}