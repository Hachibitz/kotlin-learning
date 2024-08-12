package br.com.learning.advancedresources.destructuring.model

class Point(var x: Int, var y: Int, var z: Int) {

    operator fun component1(): Int = x
    operator fun component2(): Int = y
    operator fun component3(): Int = z
}