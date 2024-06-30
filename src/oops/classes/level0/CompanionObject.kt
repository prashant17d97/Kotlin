package oops.classes.level0

/**
 * **Companion Object**
 *
 * Write a class Counter with a companion object that keeps track of the number of instances of the class created.
 * */

class Counter {

    companion object {
        var count: Int = 0
        fun increment() {
            count++
        }
    }

    init {
        increment()
    }
}

fun main() {
    println("Number of instances: ${Counter.count}") // O/P: 0
    Counter()
    Counter()
    println("Number of instances: ${Counter.count}") // O/P: 2
}