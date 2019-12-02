package com.github.pureone.quicksort

import org.scalatest.FreeSpec

class QuickSortSpec extends FreeSpec {
  "quick sort" - {
    "success" in {
      assert(
        QuickSort.sort(List(3, 21, 34, 0, -30, 55, 10)) == List(-30, 0, 3, 10, 21, 34, 55)
      )
    }
  }
}
