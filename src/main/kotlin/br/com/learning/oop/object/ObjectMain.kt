package br.com.learning.oop.`object`

//no kotlin, objetos não precisam de classes para criá-los, são entidades por si mesmos
fun main() {
    //como no js
    val location = object {
        var xCoordinate = 200
        var yCoordinate = 400

        //objetos podem conter métodos
        fun printIt() {
            println("Coordinates = ($xCoordinate, $yCoordinate)")
        }
    }

    println("Coordinates = (${location.xCoordinate}, ${location.yCoordinate})")
    location.printIt()

    //alterando valores
    location.xCoordinate = 3000
    location.yCoordinate = 6000
    location.printIt()

    //além do object type há o object declaration
    val temperature = mySingleton.getLastTemperature()
    println("Last temperature measured: $temperature degrees")
}

//object declaration
object mySingleton {
    var temperatures = arrayOf(12, 22, 26)

    fun getLastTemperature() = temperatures.last()
}