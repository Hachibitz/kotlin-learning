package br.com.learning.oop.`interface`

interface Vehicle {

    val autoMakerName: String

    /*quando o corpo do método for definido funciona semelhante à herança, quando não for, precisa ser implementado na
    classe que o implementa*/
    fun start() = println("Vruuuuuuuuuuum")
    fun stop() = println("Brake noise")
    fun getKmPerLiter() = 17
    fun getDoors(): Int
}