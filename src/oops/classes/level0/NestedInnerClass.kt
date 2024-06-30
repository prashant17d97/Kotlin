package oops.classes.level0

/**
 * **Nested and Inner Classes**
 *
 * Create a class [University] with a nested class Department.
 * The [Department] class should have a method to display the department name.
 * Also, create an inner class Student inside Department that can access both the department and university details.
 * */


class University(private val name: String) {
    fun displayUniversityInfo() {
        println("University name: $name")
    }

    class Department(private val department: String) {
        fun displayDepartmentInfo() {
            println("Department: $department")
        }

        inner class Student(private val studentName: String) {
            fun displayStudentInfo() {
                println("$studentName studies $department")
            }
        }
    }
}

fun main() {
    val university = University("Oxford")
    val department = University.Department("Computer Science")
    val student = department.Student("John")

    university.displayUniversityInfo()
    department.displayDepartmentInfo()
    student.displayStudentInfo()
}
