package com.venkat.demo

object OptionsMain {

  def main(args: Array[String]): Unit = {
    val x = Some(10)
    val y = None

    println(x.getOrElse(23))
    println(y.get)
  }

}
