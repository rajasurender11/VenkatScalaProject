package com.venkat.utils

import scala.io.Source

object DemoUtils {

  def readLocalFileAsList(fileLoc: String): List[String] = {
    Source.fromFile(fileLoc, "UTF-8").getLines().toList
  }

}
