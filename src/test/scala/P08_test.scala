import Learning.ScalaLearning
import org.scalatest.{FunSuite, Matchers}

/**
  * Created by a.zurek on 7/11/2017.
  */
class P08_test extends FunSuite with Matchers{
  val test = new ScalaLearning[Char]()

  test("that returns empty list when"){
    test.p_08(List()) should be(List())
  }

  test("that returns the same list when"){
    test.p_08(List('a')) should be(List('a'))
  }

  test("that returns single element of list when"){
    test.p_08(List('a','a')) should be(List('a'))
  }

  test("that remove sorted one-type duplicates when"){
    test.p_08(List('a','a','b')) should be(List('a','b'))
  }

  test("that remove sorted two-type duplicates when"){
    test.p_08(List('a','a','c','b','b','b')) should be(List('a','c','b'))
  }
}
