package oops.classes.level0

/**
 * **Interfaces**
 *
 * Define an interface [Vehicle] with methods [start] and [stop].
 *
 * Implement this interface in classes [Car] and [Bike].
 * */

interface Vehicle {
    fun start()
    fun stop()
}

class Car:Vehicle{
    override fun start() {
        println("Car is Started")
    }

    override fun stop() {
        println("Car is Stop")
    }
}

class Bike:Vehicle{
    override fun start() {
        println("Car is Started")
    }

    override fun stop() {
        println("Car is Stop")
    }
}

fun main() {
    Car().start()
    Car().stop()

    println("\n******************************\n")

    Bike().start()
    Bike().stop()
}