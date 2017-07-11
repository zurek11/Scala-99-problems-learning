import Learning.ScalaLearning
import org.scalatest.{FunSuite, Matchers}

/**
  * Created by a.zurek on 7/10/2017.
  */
class P07_test extends FunSuite with Matchers{
  val test = new ScalaLearning[Int]()

  test("that returns empty element if"){
    test.p_07(List()) should be(List())
  }

  test("that return list if"){
    test.p_07(List(1, 2)) should be(List(1, 2))
  }

  test("that return connected list if"){
    test.p_07(List(List(1, 2), List(3, 4))) should be(List(1, 2, 3, 4))
  }

  test("that return connected list + int if"){
    test.p_07(List(List(1, 2), 3, List(4, 5, 6), 7)) should be(List(1, 2, 3, 4, 5, 6, 7))
  }
}
