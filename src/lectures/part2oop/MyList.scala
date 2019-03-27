package lectures.part2oop

abstract class MyList {

  /*
    1 - head = first element of the list
    2 - tail = remainder of the list
    3 - isEmpty = is this list empty
    4 - add(int) => new list with this element added
    5 - toString => a string representation of the list
   */
  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList
  def printElements: String
  // polymorphic call
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList {
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(element: Int): MyList = new Item(element, Empty)
  def printElements: String = ""
}

class Item(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(element: Int): MyList = new Item(element, this)
  def printElements: String =
    if (t.isEmpty) "" + h
    else h + " " + t.printElements
}

object ListTest extends App {
  val list1 = new Item(1, new Item(2, new Item(3, Empty)))
  println(list1.tail.head)
  val list2 = list1.add(4)
  println(list2.toString)
  val list3 = list2.add(5)
  println(list3)
  println(list3.tail)
}