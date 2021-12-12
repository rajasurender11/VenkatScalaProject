package com.venkat.demo

import com.venkat.etl.{ BaseDemo,Sample}

object DemoMain {

  def main(args: Array[String]): Unit = {
    println("Hi Welcome to scala world...")
    process()
    val id = 101
    println(id)
    println(s"value  of id  ${id}")
    process()
    Demo.demoProcess()
    Demo.demoProcess()
    Sample.processSample()
    //BaseDemo.baseProcess()

    val baseObj = new BaseDemo()
    baseObj.baseProcess()

  }

  def process(): Unit = {
//println("This is process method")
    val name = "venkat"
    Demo.demoProcess()
  }

}
