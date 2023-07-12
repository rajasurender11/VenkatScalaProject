package org.etl

object MapDemo {

  def main(args: Array[String]): Unit = {
    val id = 100
    val myList = List(45,78,99)
    for(i <- myList){
      println(i)
    }

    //implies
   val mappedList =  myList.map(elem => {
      var r = elem +4
      r+2
    }
    )

    mappedList.foreach(elem => println(elem))
   val filteredResult =  myList.filter(elem => elem > 50)
    for (elem <- filteredResult) {
      println(elem)
    }



  }



}
