package com.github.pureone.binarysearch

trait Algorithm {
  def binarySearch(list: List[Int], target: Int): Int
}

case class AlgorithmWrapper(wrapper: Algorithm) extends Algorithm {
  def init: Unit = println("*********** START ***********")

  def binarySearch(list: List[Int], target: Int): Int = {
    init
    wrapper.binarySearch(list, target)
  }
}

object Algorithm extends Algorithm {
  def binarySearch(list: List[Int], target: Int): Int = {
    val mid: Int = list(list.size / 2)
    if(target > mid) {
      println(mid)
      binarySearch(list.filter(_ > mid), target)
    }
    else if (target < mid) {
      println(mid)
      binarySearch(list.filter(_ < mid), target)
    }
    else {
      println(mid)
      mid
    }
  }
}
