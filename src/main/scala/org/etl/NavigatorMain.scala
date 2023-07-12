package org.etl
import org.sample.NavigatorSample

object NavigatorMain {

  def main(args: Array[String]): Unit = {

    procesLocal()
    val rInt =  processReturnInt()
    println(rInt)
    val rSTRING = processReturnString()
    println(rSTRING)
    NavigatorDemo.demoMethod()
    NavigatorSample.sampleDemo()
    getData(rInt) //arguments
    getData(25)







  }

  def procesLocal():Unit= {
    println("This is procesLocal ")
    val r = processReturnInt()
    println(r)

  }

  def processReturnInt():Int = {
    println("This is processReturn ")
    val result = 10+90
    result
  }

  def processReturnString():String = {
    println("This is processReturnString ")

    "spark"
  }
  //n is paramater
  def getData(i:Int):Int ={

    i+6
  }

}
