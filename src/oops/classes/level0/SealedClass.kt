package oops.classes.level0


/**
 * **Sealed Class**
 *
 * Define a sealed class Result with subclasses Success and Error.
 * Write a function that takes a Result object and prints a message based on whether it is Success or Error.
 * */

sealed class Result() {
    data class Success(val result: String) : Result()
    data class Error(val error: String) : Result()
}

fun main() {
    val success = Result.Success("Success Response.")
    val error = Result.Error("Error Response.")

    println(success.result)
    println(error.error)
}