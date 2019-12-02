package com.github.pureone.bubblesort

import org.scalatest.FreeSpec

class BubbleSortSpec extends FreeSpec {
  "sort" - {
    "success" in {
      assert(
        BubbleSort.sort(List(5,3,1,2,4)) == List(1,2,3,4,5)
      )
    }
    "sorted" in {
      assert(
        BubbleSort.sort(List(1,2,3,4,5)) == List(1,2,3,4,5)
      )
    }
  }
}
