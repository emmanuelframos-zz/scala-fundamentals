package lectures.part1basics

object StringOps extends App {

  val str = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumString = "45"
  val aNum = aNumString.toInt
  println('a' +: aNumString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // Scala-specific: String interpolators

  // S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old"

  println(greeting)
  println(anotherGreeting)

  // F-interpolators = similar to printf
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f hamburgers per minute"

  println(myth)

  // Raw-interpolator
  println(raw"This is a \n new line") // don't escape in raw
  val escaped = "This is a \n new line" //escape in val
  println(raw"$escaped")
}
