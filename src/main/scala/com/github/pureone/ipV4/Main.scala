package com.github.pureone.ipV4

object Main {

  def defangIPaddr(address: String): String = {
    val p = """(\d*).(\d*).(\d*).(\d*)""".r
    address match {
      case p(b1, b2, b3, b4) => s"${b1}[.]${b2}[.]${b3}[.]${b4}"
      case _ => ""
    }
  }
}
