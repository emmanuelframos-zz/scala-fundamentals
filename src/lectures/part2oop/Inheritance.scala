package lectures.part2oop

object Inheritance extends App {

  // single class inheritance
  sealed class Animal {
    val creatureType = "wild"
    def eat = println("nomnom") //private or protected
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  //cat.eat = protect allow method to be used inside subclass, but not to be invoked directly on instance
  cat.crunch


  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
    //override val creatureType: String = "domestic"
    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }

  //  class Dog(dogType: String) extends Animal {
  //    override val creatureType: String = dogType
  //  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // type substitution(broad: Polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // overRIDING vs overLOADING
  // super

  // preventing overrides
  // 1 - final on member
  // 2 - final on the entire class
  // 3 - seal the class = extend classes in THIS FILE, prevent extension in other files
}
