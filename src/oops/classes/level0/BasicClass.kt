package oops.classes.level0

/**
 * **1. Basic Class Definition**
 *
 * Define a Person class in Kotlin with properties name and age.
 * Include a method displayInfo that prints the person's name and age.*/

class Person(private val name: String, private val age: Int) {
    fun displayInfo() {
        println("$name is $age years old.")
    }
}

fun main() {
    val person = Person("Prashant", 26)
    person.displayInfo() // O/P: Prashant is 26 years old.
}