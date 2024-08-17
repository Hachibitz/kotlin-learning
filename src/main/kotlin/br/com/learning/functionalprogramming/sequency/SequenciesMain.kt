package br.com.learning.functionalprogramming.sequency

import br.com.learning.functionalprogramming.lambda.getStudents

fun main() {

    //equivalente de kotlin para streams do java
    var students = getStudents()

    val sqStudents = students.drop(1).take(3)
    println("Sequenced students: $sqStudents")

    val numbers = generateSequence(100) { it + 1 }

    println("Numbers: ${numbers.drop(5).take(20).toList()}")

    val squares = generateSequence (1){ it + 1 }.map { it*it }
    val evenSquares = squares.filter { it % 2 == 0 }
    println("Even squares: ${evenSquares.take(5).toList()}")

    val fibonacci = generateSequence (1 to 1)
        { it.second to it.first + it.second }.map { it.first }
    println("Fibonnaci: ${fibonacci.take(15).toList()}")
}