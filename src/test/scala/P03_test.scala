import org.scalatest.{FunSuite, Matchers}
import Learning.ScalaLearning

/**
  * P03_test
  * Created by a.zurek on 7/9/2017.
  */

class P03_test extends FunSuite with Matchers{
  val test = new ScalaLearning[Int]()

  test("that returns nth element of list") {
    test.p_03(2,List(8, 9, 1, 5, 7, 3)) should be(1)
  }
  test("that returns none for unsigned outOfBoundIndex of list") {
    an [NoSuchElementException] should be thrownBy test.p_03(6,List(8, 9, 1, 5, 7, 3))
  }
  test("that returns none for signed outOfBoundIndex of list") {
    an [NoSuchElementException] should be thrownBy test.p_03(-1,List(8, 9, 1, 5, 7, 3))
  }
}
