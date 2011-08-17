import org.junit.Test
import kata.WordReverse

class WordReverseTest {
	@Test
	def revert() {
		val unit = new WordReverse()
		val backwardWord = "looc"
		assert("cool" == unit.revert(backwardWord))
	}
}