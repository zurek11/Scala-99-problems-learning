import Learning.ScalaLearning
import org.scalatest.{FunSuite, Matchers}

/**
  * Created by a.zurek on 7/11/2017.
  */
class P10_test extends FunSuite with Matchers {
  val test = new ScalaLearning()

  test("that returns empty list if list is empty"){
    test.p_10(List()) should be(List())
  }

  test("that returns one tuple if list has one element"){
    test.p_10(List('a')) should be(List((1,'a')))
  }

  test("final test"){
    test.p_10(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) should
    be(List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e')))
  }
}
