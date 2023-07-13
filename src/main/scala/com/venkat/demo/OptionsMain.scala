package com.venkat.demo

object OptionsMain {

  def main(args: Array[String]): Unit = {
    val x = Some(10)
    val y = None
    val m = 9


    println(x.getOrElse(23))

    val myList = List("Hadoop", "spark")

    val r = myList.find(elem => elem.equals("Hadoop1") )

    println(y)

    val str = "surender1"

   val patternResult =  str match {
      case "surender" => 2
      case "raja" => 4
      case _ => 5
    }
  println(patternResult)

  }

}
