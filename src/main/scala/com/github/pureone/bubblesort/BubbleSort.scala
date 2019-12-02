package com.github.pureone.bubblesort

object BubbleSort {
  def sort(list: List[Int]): List[Int] = {
    def go(l: List[Int], acc: List[Int]): List[Int] = l match {
      case x :: Nil => acc ::: List(x)
      case x :: xs if x > xs.head => go(acc ::: List(xs.head, x) ::: xs.tail, Nil)
      case x :: xs if x < xs.head => go(xs, acc ::: List(x))
    }
    go(list, Nil)
  }
}

