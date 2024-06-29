package oops.classes.level0

/**
 * **Inheritance**
 *
 * Define a base class [Animal] with properties name and age, and a method [makeSound].
 * Create subclasses [Dog] and [Cat] that inherit from Animal and override the [makeSound] method.
 * */

open class Animal(
    val name: String,
    val age: Int
) {
    open fun makeSound() {}
}

class Dog : Animal("Oggy", 10) {
    override fun makeSound() {
        println("$name is $age years old and makes sound Woof Woof.")
    }
}

class Cat : Animal("Lucy", 3) {
    override fun makeSound() {
        println("$name is $age years old and makes sound Meow Meow.")
    }

}

fun main() {
    Dog().makeSound()
    Cat().makeSound()
}