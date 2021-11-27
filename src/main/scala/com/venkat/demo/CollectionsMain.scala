package com.venkat.demo

object CollectionsMain {

  def main(args: Array[String]): Unit = {
    val id = 1090
    val str = "hadoop"
    val myList = List("surender", "raja", "Ajay")
    val myList1 = List(1,2,3)
    val myArray = Array("surender", "one", "two")
    val tuple1 =  ("surender", "CHN")
    val tuple2 =  ("surender", "CHN","CHENNAI")

    myList.foreach(elem => println(elem))

    myArray.foreach(i => println(i))


    println(tuple1._1)
    println(tuple1._2)

    println(tuple2._3)

  }

}
