package oops.classes.level1

/**
 * **Polymorphism**
 *
 * Define an interface [Shape] with a method [draw].
 * Create classes [Circle], [Square], and [Triangle] that implement this interface.
 * Each class should provide its own implementation of the draw() method.
 *
 * **Explanation of Polymorphism**
 *
 * Interface Definition ([Shape]): The Shape interface defines a method [draw], which all shapes must implement.
 * This is the core of polymorphism, as it allows different shapes to provide their own implementation of the draw() method.
 *
 * Class Implementations ([Circle], [Square], [Triangle]): Each class implements the Shape interface and
 * provides a specific implementation of the [draw] method to calculate the area of that shape.
 * This demonstrates polymorphism, where the same method ([draw]) behaves differently based on the object type.
 *
 * Main Function: In the main function, instances of Circle, Square, and Triangle are created,
 * and their draw() method is called. Polymorphism is at work here, as the correct implementation
 * of draw() is invoked for each shape, allowing the same interface method to perform shape-specific calculations.
 * */

interface Shape {
    fun draw(): Double
}

class Circle(private val radius: Double) : Shape {
    private val pi = Math.PI
    override fun draw() = pi * radius * radius
}

class Square(private val length: Double) : Shape {
    override fun draw() = length * length
}


class Triangle(private val base: Double, private val height: Double) : Shape {
    override fun draw() = 0.5f * (base * height)
}

fun main() {
    val circle = Circle(radius = 35.0)
    val square = Square(length = 35.0)
    val triangle = Triangle(base = 35.0, height = 80.0)

    println("Area of circle is: ${circle.draw()}")
    println("Area of Square is: ${square.draw()}")
    println("Area of Triangle is: ${triangle.draw()}")
}