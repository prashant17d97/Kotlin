package oops

/**
 * Certainly! Let's delve into the concept of functions in programming.
 *
 * Functions in Kotlin:-
 * A function is a reusable block of code that performs a specific task. Here are the key points about functions in Kotlin:
 *
 * **Function Declaration:**
 * - You define a function using the `fun` keyword, followed by the function name.
 * - You specify the function's parameters (if any) within parentheses.
 * - The return type (what the function produces) is specified after the parameters.
 *
 * **Function Parameters:**
 * - Parameters are inputs to the function. They allow you to pass data into the function.
 * - Parameters are defined within parentheses after the function name.
 *
 *  Remember that functions make your code modular, readable, and easier to maintain.
 *  They allow you to break down complex tasks into smaller, manageable pieces.
 * - Example:
 * */

fun greet(name: String) {
    println("Hello, $name!")
}

/**
 * **Function Body:**
 * - The function body contains the actual code that executes when the function is called.
 * - You write the logic inside curly braces `{ ... }`.
 * - Example:*/


fun add(a: Int, b: Int): Int {
    return a + b
}


/** **Calling a Function:**
 *- To use a function, you call it by its name and provide the required arguments.
 *- Example:*/
val result = add(5, 3)


/** **Return Type:**
 *- Functions can return a value using the `return` keyword.
 *- If a function doesn't return anything (like `println`), its return type is `Unit`.
 *- Example:*/


fun printMessage(): Unit {
    println("This is a message")
}


/**
 * **Expression Functions:**
 * - For concise functions, you can use expression syntax.
 * - Example:*/

fun multiply(a: Int, b: Int) = a * b

/**
 * **Default Arguments:**
 * - You can provide default values for function parameters.
 * - Example:
 */

fun greetDefaultArguments(name: String = "Guest") {
    println("Hello, $name!")
}


fun main() {
    greet("Prashant")
    println(result)
    printMessage()
    multiply(5, 7)
    greetDefaultArguments()
}