package com.github.pureone.binarysearch

import org.scalatest.FreeSpec

class AlgorithmSpec extends FreeSpec {
  "binary search" - {
    val process = AlgorithmWrapper(Algorithm)
    val l = (1 to 128).toList

    "target is 50 over" in {
      assert(
        process.binarySearch(l, 70) == 70
      )
    }
    "target is 50 under" in {
      assert(
        process.binarySearch(l, 3) == 3
      )
    }
  }
}
