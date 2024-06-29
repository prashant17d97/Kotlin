package oops.classes.level0

/**
 * **Constructor Overloading**
 *
 * Create a Rectangle class with properties length and width.
 * Overload the constructor to allow creating a square by passing only one parameter for both length and width.
 * */

class Rectangle(private val length: Double, private val width: Double) {

    constructor(length: Double) : this(length, length)

    fun calculateArea() = length * width
}

fun main() {
    val rectangle = Rectangle(3.0, 8.0)
    val square = Rectangle(3.0)

    println("Area of Rectangle: ${rectangle.calculateArea()}")
    println("Area of Square: ${square.calculateArea()}")


}