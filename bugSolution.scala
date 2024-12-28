```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
  def myMethod(): Unit = {
    println(x)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val obj1 = new MyClass(5)
    obj1.myMethod()
    val obj2 = new MyClass()
    obj2.myMethod() // This line now works as expected
  }
}
```