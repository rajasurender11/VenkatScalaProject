package org.etl

object LateralMain {

  val m = 67

  def main(args: Array[String]): Unit = {
   println("This is main method")
    val id = 100 //type infer // immutable (
    val str = "surender"
    val str1:String = "raja"

    var data = 200
    //id = 101
    println(data)
    data = 201


    process()//invoke call
    println("main method ends ")
    print(data)

  }


  def process():Unit={
    val local_id = 50
    println("Hi, This is process ,method ")
    println("Hi, This is process ,method " + local_id)
    println(s"Hi, This is process ,method $local_id Thanks " )
    println(local_id)


  }

}
