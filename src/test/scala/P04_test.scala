import org.scalatest.{FunSuite, Matchers}
import Learning.ScalaLearning

/**
  * P04_test
  * Created by a.zurek on 7/9/2017.
  */

class P04_test extends FunSuite with Matchers {
  val test = new ScalaLearning[Int]

  test("that returns None for empty List"){
    test.p_04(List()) should equal(0)
  }

  test("that returns 1 for one-element List"){
    test.p_04(List(3)) should equal(1)
  }

  test("that returns unsigned Int for multiple-element List"){
    test.p_04(List(1, 5 ,7, 9, 10, 45)) should equal(6)
  }
}
