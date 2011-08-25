import org.junit.Test
import org.junit.Assert._
import kata.SimpleCalculator

/*
 * Write a program that takes as its first argument one of the words ‘sum,’ ‘product,’ ‘mean,’ or ‘sqrt’ 
 * and for further arguments a series of numbers. The program applies the appropriate function to  the series.
 *
 * use foldleft
 * use pattern matching
 * use guards
 * use var args
 * what is _+_
 * 
*/
class SimpleCalculationsTest {
  @Test
  def testSum {
    val unit = new SimpleCalculator();
    val result = unit.calculate("sum", 1, 2, 3, 4, 5)
    assertEquals(15, result)
  }

  @Test
  def testProduct {
    val unit = new SimpleCalculator();
    val result = unit.calculate("product", 6, 7, 8, 9, 10)
    assertEquals(30240, result)
  }

  @Test
  def testMean {
    val unit = new SimpleCalculator();
    val result = unit.calculate("mean", 16, 17, 18, 19, 110)
    
    //use SimpleCalculator.calculate("sum", <args>)
    assertEquals(36, result)
  }

  @Test
  def testSqrt {
    val unit = new SimpleCalculator();
    val result = unit.calculate("sqrt", 10:Double)
    assertEquals(3.1622, result, .0001)
  }

  @Test
  def testErrorHandling {
    val unit = new SimpleCalculator();
    val result = unit.calculate("unexpectedOperator", 10, 11)
    fail("fix this test to take an expected exception eg (expected = IllegalArgumentException)")
  }

  @Test
  def testtestSqrt_moreThanOneValue {
    val unit = new SimpleCalculator();
    val result = unit.calculate("sqrt", 10, 15)
    fail("fix this test to take an expected exception eg (expected = IllegalArgumentException)")
  }
}
