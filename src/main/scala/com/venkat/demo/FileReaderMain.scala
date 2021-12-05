package com.venkat.demo

import com.venkat.utils.DemoUtils

import scala.io.Source

object FileReaderMain {

  def main(args: Array[String]): Unit = {

    val fileLocMap = Map(
      ("accounts_profile", "C:\\surender\\hadoop_course\\4_inputfiles\\accounts_profile.txt"),
      ("atm_trans", "C:\\surender\\hadoop_course\\4_inputfiles\\atm_trans.txt"),
      ("orders", "C:\\surender\\hadoop_course\\4_inputfiles\\orders.txt")
    )

    fileLocMap.foreach(elem => {
      println("###################################")
      println(s"processing for ${elem._1}")
      val fileName = elem._1
      val filePath = elem._2
      val fileData = DemoUtils.readLocalFileAsList(filePath)


      val resultList = fileName.toUpperCase() match {
        case "ACCOUNTS_PROFILE" => processAccountsProfile(fileData)
        case "ATM_TRANS" => processAtmTrans(fileData)
        case "ORDERS" => processOrders(fileData)
        case _ => List("EMPTY")
      }

      resultList.foreach(println)
   })
  }

  def processAccountsProfile(data:List[String]):List[String] = {
    data
      .zipWithIndex
      .map(rec => (rec._1,rec._2+1))
      .filter(rec => rec._2%2 != 0)
      .map(rec => rec._1)


  }


  def processAtmTrans(data:List[String]):List[String] = {

    List("EMPTY")
  }

  def processOrders(data:List[String]):List[String] = {

    List("EMPTY")
  }

}
