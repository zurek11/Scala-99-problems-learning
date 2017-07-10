import org.scalatest.{FunSuite, Matchers}
import Learning.ScalaLearning

/**
  * P02_test
  * Created by a.zurek on 7/6/2017.
  */

class P02_test extends FunSuite with Matchers{
  val test = new ScalaLearning[Int]()

  test("that returns none for empty list") {
    test.p_02(List()) should be(None)
  }

  //ALTERNATIVE EXCEPTION TEST
  //test("that returns none for empty list") {
  //  an [IndexOutOfBoundsException] should be thrownBy test.p_02(List())
  //}
  test("that returns none for one-element list") {
    test.p_02(List(5)) should be(None)
  }

  //ALTERNATIVE EXEPTION TEST
  //test("that returns none for one-element list") {
  //  an [IndexOutOfBoundsException] should be thrownBy test.p_02(List(5))
  //}
  test("that returns first element of two-elements list") {
    test.p_02(List(5, 7)) should be(Some(5))
  }
  test("that returns last but one element of list with size > 2") {
    test.p_02(List(8, 9, 1, 5, 7, 3)) should be(Some(7))
  }
}