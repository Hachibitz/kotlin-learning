package br.com.learning.functionalprogramming.lambda

fun main() {

    val students = getStudents()

    val combos = students.map { a -> "${a.name} : ${a.age}" }
    println("Combos: $combos")

    //qando é um único parâmetro, pode usar o parâmetro padrão it e não precisa ser passado
    println("The oldest student is: ${students.maxByOrNull { it.age }}")

    println("Students with names greater than 5: ${students.filter { it.name.length > 5 }}")
}