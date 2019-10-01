package com.github.pureone.FizzBuzz

import org.scalatest._

class MainSpec extends FlatSpec with Matchers {
  "toFizzBuzz" should "success" in {
    assertResult(Num(1)){
      Main.toFizzBuzz(1)
    }
    assertResult(Num(2)){
      Main.toFizzBuzz(2)
    }
    assertResult(Fizz){
      Main.toFizzBuzz(3)
    }
    assertResult(Num(4)){
      Main.toFizzBuzz(4)
    }
    assertResult(Buzz){
      Main.toFizzBuzz(5)
    }
    assertResult(FizzBuzz){
      Main.toFizzBuzz(15)
    }
  }

  "run" should "success" in {
    Main.run
  }

}
