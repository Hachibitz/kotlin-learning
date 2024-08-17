package br.com.learning.functionalprogramming.lambda

data class Student(val name: String, var age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Maria", 19),
        Student("Manuel", 24),
        Student("Ada", 32),
        Student("João", 45),
        Student("José", 17)
    )
}
