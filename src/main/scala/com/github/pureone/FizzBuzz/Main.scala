package com.github.pureone.FizzBuzz

sealed trait FizzBuzz {
  def printMessage: Unit = this match {
    case n: Num => println(n.value)
    case fb => println(fb)
  }
}
case object FizzBuzz extends FizzBuzz
case object Fizz extends FizzBuzz
case object Buzz extends FizzBuzz
case class Num(value: Int) extends FizzBuzz

object Main {
  def run: Unit =
    (1 to 100)
      .map(toFizzBuzz)
      .foreach(fb => fb.printMessage)

  def toFizzBuzz(a: Int): FizzBuzz =
    if(a % 3 == 0 && a % 5 == 0)
      FizzBuzz
    else if (a % 3 == 0)
      Fizz
    else if (a % 5 == 0)
      Buzz
    else Num(a)
}
