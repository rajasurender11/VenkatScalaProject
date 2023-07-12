package com.venkat.demo

object SampleMain {

  def main(args: Array[String]): Unit = {
    val str = "surender"
    println(s"This is the main method of  SampleMain $str")

    val result1 = doProcess1() //

    println(s"result1 $result1")

    val result2 = doProcess2(100)

    println(s"result2 $result2")

    val result3 = doProcess3(100, "surender")

    println(s"result1 $result3")

    val result4 = doProcess4(9999)

    println(s"result4 $result4")

    val myList = List("Hadoop","Spark","Scala")

    val result5 = doProcess5(myList)

    println(s"result5 $result5")



  }

  def doProcess1(): Unit = {
    println("doprocess1")

  }

  def doProcess2(i: Int): Int = {
    println(s"Inside doProcess2 $i")
    val m = 98 + i
    println("98")
    m
  }

  def doProcess3(i: Int, str: String):String = {
    println(s"Inside doProcess3 $i $str")

    str.concat("HADOOP").concat("SPARK")
  }

  def doProcess4(i:Int=87):Int = {
  i
  }

  def doProcess5(li:List[String]):Int = {

    li.size
  }

}
