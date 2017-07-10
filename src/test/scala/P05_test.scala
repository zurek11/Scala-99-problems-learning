import Learning.ScalaLearning
import org.scalatest.{FunSuite, Matchers}

/**
  * Created by a.zurek on 7/10/2017.
  */
class P05_test extends FunSuite with Matchers {
  val test = new ScalaLearning[Int]()

  test("that returns empty list"){
    test.p_05(List()) should be(List())
  }

  test("that returns the same list"){
    test.p_05(List(5)) should be(List(5))
  }

  test("that returns reverse list"){
    test.p_05(List(1, 2, 3, 4, 5)) should be(List(5, 4, 3, 2, 1))
  }
}
