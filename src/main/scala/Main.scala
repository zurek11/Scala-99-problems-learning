import Learning.ScalaLearning

/**
  * Created by a.zurek on 7/5/2017.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val learning = new ScalaLearning[Int]()

    println(learning.p_01(List(1, 2, 3)).getOrElse())
    println(learning.p_02(List(1, 3, 5, 7, 0, 9)).getOrElse())
    println(learning.p_03(2,List(1, 3, 6)))
    println(learning.p_04(List(1, 6, 8 ,3 ,4 ,9)))
  }
}
