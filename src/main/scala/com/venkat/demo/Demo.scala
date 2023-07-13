package com.venkat.demo

import com.venkat.etl.BaseDemo

object Demo  extends BaseDemo{
val id = 100
  def demoProcess():Unit = {
    println("HI")
    demoProcess1()
  }


  def demoProcess1():Unit = {
    println("JJ")
    println(baseData)
    baseProcess()
  }

}
j
