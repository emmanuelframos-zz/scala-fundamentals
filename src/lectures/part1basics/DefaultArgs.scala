package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  def factorial(n: BigInt, acc: BigInt = 1): BigInt =
    if (n <= 1) acc
    else factorial(n-1, n*acc)

  val fac10 = factorial(100000)

  def savePicture(format: String = "jpg", width: Int = 800, height: Int = 600): Unit = println("saving picture")
  savePicture(width = 900)

  /*
    1. pass in every leading argument
    2. name the arguments
   */

  savePicture(height = 900, width = 900, format = "png")
}
