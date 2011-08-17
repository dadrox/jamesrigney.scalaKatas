import kata.WordReplacement
import scala.collection.immutable.HashMap
import org.junit.Test

class TeleprompterTest {
	@Test
	def testTranslate() {
		val unit = new WordReplacement()
		val text = "I am $hammered$."

		val dictionary = Array(Array("$hammered$", "drunk"))

		val result = unit.translate(text, dictionary)
		assert("I am drunk." == result)

	}
}