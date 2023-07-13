package com.venkat.demo

object WhileDanger {

  def main(args: Array[String]): Unit = {

    var id = 1

    while(id <=5){
      id = id+1
      println(s"while loop with value for id ${id}")
      id = id+2
    }

    for (j <- 0 to 5) {
      println("#4 for loop iteration " + j)
    }

    for (j <- 0 until 5) {
      println("#4 for loop iteration " + j)
    }

    val myList = List("hadoop" ,"spark" , "scala")

    for (i <- myList){
      println(s"iterating $i")
          if(i.length > 5 && i.endsWith("m")){

      }

      else {

      }
    }

    val emp_details = "surender|CHN|CTS"

    val split_arr = emp_details.split("\\|")


    // Array("surender" , "CHN", "CTS")

    println(split_arr(0))
    for( i <- split_arr) {

      println(i)
    }
  }

}
