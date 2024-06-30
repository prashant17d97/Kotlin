package oops.classes.level0


/**
 * **Enum Class**
 *
 *
 * Create an enum class Day with values for all days of the week.
 * Write a function that takes a Day and returns whether it is a weekday or a weekend.
 * */

enum class Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

fun isWeekend(day: Day): Boolean {
    return when (day) {
        Day.SATURDAY, Day.SUNDAY -> true
        Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY -> false
    }
}

fun main() {
    val today = Day.FRIDAY
    val today2 = Day.SUNDAY
    println("Is $today a weekend? ${isWeekend(today)}")
    println("Is $today2 a weekend? ${isWeekend(today2)}")
}