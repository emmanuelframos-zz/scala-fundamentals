package lectures.part2oop

import scala.annotation.tailrec

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.age)
  person.greet("Daniel")
  person.greet()


  //constructor
  class Person(name: String, val age: Int = 0) {
    // body
    val x = 2

    println(1 + 3)

    def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

    // overloading
    def greet(): Unit = println(s"Hi, I am $name")

    // multiple constructors
    def this(name: String) = this(name, 15)

    def this() = this("John Doe")
  }

  /*
  Novel and a Writer class

  Writer: first name, surname, age
    - method fullName

 Novel: name, year of release, author
    - method authorAge
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel
 */

  class Writer(val firstName: String, val surname: String, val age: Int) {
    def fullName() = s"$firstName $surname"
  }

  class Novel(val name: String, var released: Int, val author: Writer) {
    def authorAge() = this.author.age
    def isWrittenBy() = this.author.fullName()
    def copy(newReleaseYear: Int) = this.released = newReleaseYear
  }

  val author = new Writer("John", "Doe", 33)
  println(author.fullName())

  val novel = new Novel("A Book", 2019, author)
  println(novel.authorAge())
  println(novel.isWrittenBy())
  println(novel.released)
  novel.copy(2018)
  println(novel.released)


  /*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
 */

  class Counter(val count: Int = 0){
    def inc = {
      println("incrementing")
      new Counter(count + 1) // immutability
    }
    def dec = {
      println("decrementing")
      new Counter(count - 1)
    }

    def inc(n: Int): Counter =
      if (n <= 0) this
      else inc.inc(n -1)

    def dec(n: Int): Counter =
      if (n <= 0) this
      else dec.dec(n - 1)

    def print = {
      println(count)
      this
    }
  }

  val counter = new Counter(0)
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
  counter.inc.print.dec.print

}

// class parameters are NOT FIELDS