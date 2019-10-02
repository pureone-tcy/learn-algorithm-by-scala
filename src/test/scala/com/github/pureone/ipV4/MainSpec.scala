package com.github.pureone.ipV4

import org.scalatest.FlatSpec

class MainSpec extends FlatSpec {
  "defangIPaddr" should "success" in {
    assertResult("255[.]1[.]1[.]1") {
      Main.defangIPaddr("255.1.1.1")
    }
  }
}
