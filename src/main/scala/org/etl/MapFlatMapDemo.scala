package org.etl

object MapFlatMapDemo {

  def main(args: Array[String]): Unit = {

    //one to one transformation on the list elements you iterate
    val myList = List(45,78,99)
    val myStringList = List("surender,hadoop,spark", "data,scala,sql")
    val mappedList = myList.map(elem => elem+1)
    val mappedList1 = myList.map(elem => elem)

    val flatmapList = myList.flatMap(elem => List(elem))

    //List(45,78,99)
    // List(List(45), List(78), List(99))
    //List(45,78,99)
    val strMap = myStringList.map(elem => elem.split(","))
    val strFlatMap = myStringList.flatMap(elem => elem.split(","))
  }

}
