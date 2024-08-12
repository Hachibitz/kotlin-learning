package br.com.learning.advancedresources.operatoroverloading

fun main() {

    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1+c2

    println(c3)
}