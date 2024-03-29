package com.venkat.demo

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object CollectionsMain {

  def main(args: Array[String]): Unit = {
    val id = 1090
    val str = "hadoop"
    val myList = List("surender", "raja", "Ajay")
    val myNewList = List(1,"surender",1.2)
    val bufferList = myList.toBuffer
     val myList1 = List(1,2,3)
    val myArray = Array("surender", "one", "two")// immutable
    val tuple1 =  ("surender", "CHN")
    val tuple2 =  ("surender", "CHN","CHENNAI")

    myArray.foreach(println)
    //myArray.foreach(elem => println(elem))
    myArray(0) = "Hadoop"
    myArray.foreach(println)

    println(tuple1._2)

println("***********************************************")

    val myAbuffer =  ArrayBuffer("100", "101")
    myAbuffer.append("102")

    myAbuffer.foreach(println)


    val cityMap = scala.collection.mutable.Map(
      "CHN" -> "CHENNAI",
      "BNG" -> "BANGALORE",
      "HYD" -> "HYDERABAD",
      "MUM" -> "MUMBAI"
    )

cityMap("BNG") = "BENGALURU"

    cityMap.foreach(elem => println(elem._1))

    val numbersMap = scala.collection.mutable.Map(
      ("1", "one"),
      ("2", "two")
    )
    numbersMap.foreach(println)
  }

}
