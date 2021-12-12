package com.venkat.etl

class BaseDemo {

  val baseData = "surender"

  def baseProcess(): Unit = {
  println("This is BaseDemo")
    baseProcess2()
  }

  def baseProcess2():Unit = {
    println("This is BaseDemo : baseProcess2")
  }

}
