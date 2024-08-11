package br.com.learning.conditional

fun main() {

    //IF
    val myInt = 99
    val aInt: Int = 7

    /*em java o if é uma instrução(statement) em kotlin o if é uma expressão
      instrução(statement): instruções de programa não retornam valor, não podem estar do lado direito de um sinal de igual
      expressão: instruções de programa que retornam valor, podem estar do lado direito de um sinal de igual
    */

    //o retorno de uma expressão if em kotlin pode ser atribuído a uma variável, tornando o operador ternário redundante e desnecessário

    //java: int lowest = (myInt < aInt) ? myInt : aint;

    //kotlin:
    val lowest = if ( myInt < aInt ) myInt else aInt

    val temp = 26
    val isAirConditionerOn = if(temp >= 26) {
        println("it's warm")
        true
    } else {
        println("not so warm")
        false
    }

    println("Is the air conditioner on: $isAirConditionerOn")

    //WHEN: replaces regular switch (duas forams, com argumento e sem argumento)

    //com argumento:
    val pizzasOrdered = 8

    when(pizzasOrdered) {
        0 -> println("Not hungry")
        1,2 -> println("Hungry")
        in 3 .. 5 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    //sem argumentos (poder do if-else)
    when {
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered % 2 == 1 -> println("Ordered a odd number")
        pizzasOrdered % 2 == 0 -> println("Ordered a odd number")
    }

    //while
    var x = 0

    while(x < 10) {
        println("x = $x")
        x += 3
    }

    //dowhile (executa pelo menos uma vez, verifica a condição na segunda execução
    do {
        println("x = $x")
        x -= 3
    } while(x > 0)


    //laço for
    for (item in 1 .. 10) {
        //item++ cant manipulate cause its imutable val
        println("$item, ")
    }

    for (ch in "Felipe") {
        println("$ch")
    }

    var index = 0
    for (item in 10.rangeTo(20).step(2)) {
        println("${++index} | $item, ")
    }

    println()
    println()
    for ((indx, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("${indx+1} | $item, ")
    }

    val myArray = arrayOf(10, 20, 30, 40, 50)

    println()
    println()
    for (item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }
}