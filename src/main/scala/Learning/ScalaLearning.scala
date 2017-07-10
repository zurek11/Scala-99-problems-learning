package Learning

import scala.annotation.tailrec

/**
  * Created by a.zurek on 7/5/2017.
  */
class ScalaLearning[T]{
  def p_01(x: List[T]): Option[T] = x match {
    case Nil => None
    case head :: Nil => Some(head)
    case _ :: tail => p_01(tail)
  }

  //ALTERNATIVE WITH EXEPTIONS
  //def p_01(x: List[Int]): Int = x.last

  def p_02(x: List[T]): Option[T] = x match {
    case Nil => None
    case _ :: Nil => None
    case lastButOne :: _ :: Nil => Some(lastButOne)
    case _ :: tail => p_02(tail)
  }

  //ALTERNATIVE WITH EXCEPTIONS
  //def p_02(x: List[Int]): Int = x(x.size-2)

  def p_03[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _ ) => h
    case (i, _ :: tail) if i > 0 => p_03(i - 1, tail)
    case _ => throw new NoSuchElementException
  }

  //ALTERNATIVE WITH EXCEPTIONS
  //def p_03(n: Int, x: List[Int]): Int = {
  //    if (n < x.size && n >= 0) x(n)
  //    else throw new IndexOutOfBoundsException
  //}

  final def p_04(x: List[T]): Int = {
    @tailrec
    def sum(i: Int, xTemp: List[T]): Int = xTemp match {
      case Nil => i
      case _ :: tail => sum(i + 1, tail)
    }
    sum(0, x)

    //ALTERNATIVE USING FOLDS
    //def lengthFunctional[A](ls: List[A]): Int =
    //  ls.foldLeft(0) { (c, _) => c + 1 }
  }

  def p_05(x: List[T]): List[T] = {
    x.foldLeft(List[T]()){(acc, element) => element :: acc}
  }

  //ALTERNATIVES
  //def p_05[T](x: List[T]): List[T] = x.reverse
}
