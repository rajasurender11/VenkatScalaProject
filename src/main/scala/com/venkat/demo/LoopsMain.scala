package com.venkat.demo

object LoopsMain {

  def main(args: Array[String]): Unit = {
    var i = 1
    val j = 10

    val result = {
      val m = 100
      val n = 200
      m+n

    }

    if(i > 0){
      println(" GREATER THAN 0")
      println("Value of i "+ i)
      println(s"Value of i $i")
    }
    else if(i<0) {
      println(" LESSER THAN 0")
    }
    else {
      println("ZERO")
    }



    while (i <= 10) {
      println("#1 while loop Iteration " + i)
      i = i + 1
    }

    i = 15
    while (i != 0 && i <= 20) {
      println("#2 while loop Iteration " + i)
      i = i + 1
    }

    val testList = List("CHN", "BNG", "HYD")
    val listSize = testList.size//2
    var itr = 0
    if (testList.nonEmpty || listSize > 0) {

      while (itr < listSize) {
        println("#3 while loop iteration " +  itr  +" " + testList(itr))
        itr = itr + 1
      }
    }
    for (j <- 0 to 10) {
      println("#4 for loop iteration " + j)
    }


    for (j <- 0 until 10) {
      println("#5 for loop iteration " + j)
    }

    if (testList.isEmpty || listSize > 0) {

      for (itr <- testList) {
        println("#6 for loop iteration " + itr)
      }
    }


    testList.foreach(elem => println("#7 Foreach iteration " + elem))




  }



}
