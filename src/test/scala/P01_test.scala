import org.scalatest.{FunSuite, Matchers}
import Learning.ScalaLearning

/**
  * P01_test
  * Created by a.zurek on 7/9/2017.
  */

class P01_test extends FunSuite with Matchers{
  val test = new ScalaLearning[Int]()

  test("that returns none for empty list") {
    test.p_01(List()) should be(None)
  }
//ALTERNATIVE EXCEPTION TEST
//  test("that returns none for empty list") {
//    an [NoSuchElementException] should be thrownBy test.p_01(List())
//  }
  test("that returns that one element for one-element list") {
    test.p_01(List(5)) should be(Some(5))
  }
  test("that returns second element of two-elements list") {
    test.p_01(List(5, 7)) should be(Some(7))
  }
  test("that returns last element of list with size > 2") {
    test.p_01(List(8, 9, 1, 5, 7, 3)) should be(Some(3))
  }
}
