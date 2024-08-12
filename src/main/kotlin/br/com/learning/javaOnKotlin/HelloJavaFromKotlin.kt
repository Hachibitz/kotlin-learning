package br.com.learning.javaOnKotlin

import br.com.learning.model.Animal

fun main() {

    val cat = Animal("Garfield", "cat", 10)
    println(cat.show())
    val dog = Animal("Rex", "dog", 30)
    println(dog.show())

    cat.weight = 13
    println(cat.show())
}