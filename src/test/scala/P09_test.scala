import Learning.ScalaLearning
import org.scalatest.{FunSuite, Matchers}

/**
  * Created by a.zurek on 7/11/2017.
  */
class P09_test extends FunSuite with Matchers {
  val test = new ScalaLearning[Char]()

  test("that returns Nil if parameter is Nil List"){
    test.p_09(List()) should be(List())
  }

  test("that returns list of list if parameter is one element"){
    test.p_09(List('a')) should be(List(List('a')))
  }

  test("that returns list of list if parameter is duplicate element"){
    test.p_09(List('a','a','a')) should be(List(List('a','a','a')))
  }

  test("that returns list of list if parameter is duplicate element + one"){
    test.p_09(List('a','a','a','b')) should be(List(List('a','a','a'),List('b')))
  }

  test("that returns list of list if parameter are two duplicate elements"){
    test.p_09(List('a','a','a','b','b')) should be(List(List('a','a','a'),List('b','b')))
  }

  test("final test"){
    test.p_09(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) should
      be(List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e')))
  }
}
