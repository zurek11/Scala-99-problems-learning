import Learning.ScalaLearning
import org.scalatest.{FunSuite, Matchers}

/**
  * Created by a.zurek on 7/10/2017.
  */
class P06_test extends FunSuite with Matchers {
  val test = new ScalaLearning[Int]

  test("that returns true if List is empty"){
    test.p_06(List()) should be(true)
  }

  test("that returns true if List contain one element"){
    test.p_06(List(4)) should be(true)
  }

  test("that returns false if List is not a palindrome"){
    test.p_06(List(3 ,4)) should be(false)
  }

  test("that returns true if List is palindrome"){
    test.p_06(List(3 ,4, 3)) should be(true)
  }
}
