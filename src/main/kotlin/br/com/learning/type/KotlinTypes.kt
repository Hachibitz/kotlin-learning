package br.com.learning.type

fun main() {
    val myPhrase = "I'm a string"
    val myPi = 3.1415
    val myAnswer = 42

    val str: String
    val db: Double
    val emptyInt: Int

    val myDouble = 1.999
    val myFloat = 1.99f
    val myLong = 999869879859L
    val myInt = 199
    val myShort: Short = 12
    val myByte: Byte = 126

    val aLongNumber = 123_456_789 //more readable
    val sameLongNumber = 123456789

    val anInt = 7
    val aLong: Long = anInt.toLong() //a conversão precisa ser explícita no Kotlin
}