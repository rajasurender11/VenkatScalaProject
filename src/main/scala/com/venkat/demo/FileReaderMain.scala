package com.venkat.demo

import com.venkat.utils.DemoUtils

import scala.io.Source

object FileReaderMain {
  case class AtmTrans(account_id:String,atm_id:String,trans_dt:String,trans_amt:String,status:String)
  def main(args: Array[String]): Unit = {

    val fileLocMap = Map(
      ("accounts_profile", "C:\\surender\\hadoop_course\\4_inputfiles\\accounts_profile.txt"),
      ("atm_trans", "C:\\surender\\hadoop_course\\4_inputfiles\\atm_trans.txt"),
      ("orders", "C:\\surender\\hadoop_course\\4_inputfiles\\orders.txt")
    )

    fileLocMap.foreach(elem => {
      println("###################################")
      println(s"processing for ${elem._1}")
      val fileName = elem._1// accounts_profile
      val filePath = elem._2
      val fileData = DemoUtils.readLocalFileAsList(filePath) //arg


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
      .zipWithIndex // List((datastring,0) (datastring,1))
      .map(rec => (rec._1,rec._2+1))
      .filter(rec => rec._2%2 != 0)
      .map(rec => rec._1)


  }


  def processAtmTrans(data:List[String]):List[String] = {

    data
      .filter(rec => rec.endsWith("S"))
      .map(rec => {
        var arr = rec.split("\\|")
        AtmTrans(arr(0),arr(1),arr(2),arr(3),arr(4))
      })
      .filter(atmTrans => atmTrans.trans_amt.toInt > 3000)
      .map(atmTrans => doConcat(atmTrans.account_id,atmTrans.trans_dt,atmTrans.trans_amt))
  }

  def processOrders(data:List[String]):List[String] = {
    data
      .map(elem => elem.split(",")(3))
      .toSet
      .toList

  }

  def doConcat(s1:String,s2:String,s3:String):String = {
    s"$s1,$s2,$s3"
  }

}
