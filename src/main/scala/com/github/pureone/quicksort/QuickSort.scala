package com.github.pureone.quicksort

object QuickSort {
  def sort(list: List[Int]): List[Int] = {
    list.headOption.fold(List[Int]()){ pivot =>
      val left = list.filter(_ < pivot)
      val right = list.filter(_ > pivot)
      sort(left) ::: List(pivot) ::: sort(right)
    }
  }
}
