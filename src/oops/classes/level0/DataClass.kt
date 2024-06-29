package oops.classes.level0

/**
 * **Data Class**
 *
 * Create a data class Book with properties title, author, and price.
 * Then, create a list of books and find the book with the highest price.
 * */

data class Book(
    val title: String,
    val author: String,
    val price: Double,
)

val books = listOf(
    Book(title = "BookA", author = "GorgeA", price = 1800.0),
    Book(title = "BookB", author = "GorgeB", price = 1860.0),
    Book(title = "BookC", author = "GorgeC", price = 1300.0),
    Book(title = "BookD", author = "GorgeD", price = 1760.0),
)

fun main() {
    val highestPriceBook = books.maxBy { it.price }
    println("\n$highestPriceBook")

}