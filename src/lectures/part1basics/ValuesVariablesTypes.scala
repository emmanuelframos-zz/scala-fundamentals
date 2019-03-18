package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x = 42
  println(x)

  //VALS ARE IMMUTABLE

  //COMPILER CAN INFER TYPES

  val aString: String = "hello"
  val aBoolean: Boolean = true || false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 42
  val aLong: Long = 1234567891234567891L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //variables
  var aVariable: Int = 34

  aVariable = 35 // side effects

  //PREFER VALS OVER VARS
}