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

  //--------------------------------------------------------------------------------------------------------------------

  def p_02(x: List[T]): Option[T] = x match {
    case Nil => None
    case _ :: Nil => None
    case lastButOne :: _ :: Nil => Some(lastButOne)
    case _ :: tail => p_02(tail)
  }

  //ALTERNATIVE WITH EXCEPTIONS
  //def p_02(x: List[Int]): Int = x(x.size-2)

  //--------------------------------------------------------------------------------------------------------------------

  def p_03(n: Int, ls: List[T]): T = (n, ls) match {
    case (0, h :: _ ) => h
    case (i, _ :: tail) if i > 0 => p_03(i - 1, tail)
    case _ => throw new NoSuchElementException
  }

  //ALTERNATIVE WITH EXCEPTIONS
  //def p_03(n: Int, x: List[Int]): Int = {
  //    if (n < x.size && n >= 0) x(n)
  //    else throw new IndexOutOfBoundsException
  //}

  //--------------------------------------------------------------------------------------------------------------------

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

  //--------------------------------------------------------------------------------------------------------------------

  def p_05(x: List[T]): List[T] = {
    x.foldLeft(List[T]()){(acc, element) => element :: acc}
  }

  //ALTERNATIVES
  //def p_05[A](x: List[A]): List[A] = x.reverse

  //def p_05[A](x: List[A]): List[A] = x match {
  //  case Nil => Nil
  //  case head :: tail => p_05(tail) ::: List(head)
  //}

  //--------------------------------------------------------------------------------------------------------------------

  def p_06(x: List[T]):Boolean = x match {
    case Nil => true
    case List(_) => true
    case list => list.head == list.last && p_06(list.tail.init)
  }

  //ALTERNATIVES
  //def p_06[A](x: List[A]):Boolean = {x==x.reverse}

  //--------------------------------------------------------------------------------------------------------------------

  def p_07(x: List[Any]): List[Any] = x flatMap {
    case temp: List[_] => p_07(temp)
    case temp => List(temp)
  }

  //ALTERNATIVES
  //  def p_07[A](x: List[A]): List[A] = x match {
  //    case Nil => Nil
  //    case (temp:List[A])::tail => p_07(temp):::p_07(tail)
  //    case (temp:A)::tail => temp::p_07(tail)
  //  }

  //--------------------------------------------------------------------------------------------------------------------

  def p_08(x: List[T]): List[T] = x match{
    case Nil => Nil
    case head :: Nil => List(head)
    case head :: tail if head == tail.head => p_08(tail)
    case head :: tail => head :: p_08(tail)
  }

  //ALTERNATIVES
  //def p_08(x: List[T]):List[T] = x.foldRight(List[T]()) {
  //  case (acc, list) if list.isEmpty || list.head != acc => acc :: list
  //  case (_, list) => list
  //}

  //--------------------------------------------------------------------------------------------------------------------

  def p_09(x: List[T]): List[List[T]] = {
    if (x.isEmpty) List()
    else {
      val (first, second) = x span(_ == x.head)
      if(second == Nil) List(first)
      else first :: p_09(second)
    }
  }

//  def p_09[A](x: List[A]):List[List[A]] = {
//    def _p_09(res: List[List[A]], rem: List[A]):List[List[A]] = rem match {
//      case Nil => res
//      case _ =>
//        val (s: List[A], r: List[A]) = rem span { _ == rem.head }
//        _p_09(res:::List(s), r)
//    }
//    _p_09(List(), x)
//  }

  //--------------------------------------------------------------------------------------------------------------------

  def p_10(x: List[Char]): List[(Int, Char)] = {
    def length(ls: List[Char]): Int = ls.foldLeft(0) { (c, _) => c + 1 }

    def pack(x: List[Char]): List[List[Char]] = {
      if (x.isEmpty) List()
      else {
        val (first, second) = x span(_ == x.head)
        if(second == Nil) List(first)
        else first :: pack(second)
      }
    }

    val packed = pack(x)
    var list : List[(Int,Char)] = List()

    for(p <- packed){
      list = list :+ ((length(p), p.head))
    }
    list
  }

  //ALTERNATIVES
  //object P10 {
  //  import p_09.pack
  //  def encode[A](ls: List[A]): List[(Int, A)] =
  //  pack(ls) map { e => (e.length, e.head) }
  //}
}
