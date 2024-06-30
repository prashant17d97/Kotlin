package oops.classes.level0

import java.util.*

/**
 * **Abstract Class**
 *
 * Create an abstract class Shape with an abstract method area().
 * Create subclasses Circle and Rectangle that provide implementations for the area() method.
 * */

abstract class Shape {
    abstract fun area(): Double
}

class Circle(private val radius: Double) : Shape() {
    override fun area() = (22 / 7) * (radius * radius)
}

class RectangleShape(private val length: Double, private val width: Double) : Shape() {
    override fun area() = length * width
}

fun main() {
    println("Area of Circle: ${String.format(Locale.getDefault(), "%2f", Circle(5.6).area())}")
    println("Area of Rectangle: ${RectangleShape(5.6, 9.3).area()}")

}