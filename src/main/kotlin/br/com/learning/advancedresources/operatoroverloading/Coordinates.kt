package br.com.learning.advancedresources.operatoroverloading

data class Coordinates(var x: Int, var y: Int) {

    operator fun plus(other: Coordinates) : Coordinates {
        return Coordinates(x+other.x, y+other.y)
    }
}
