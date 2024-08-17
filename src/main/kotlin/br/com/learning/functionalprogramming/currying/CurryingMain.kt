package br.com.learning.functionalprogramming.currying

import org.funktionale.currying.curried

fun main() {
    /*encadeamentos de funções: pega uma função que tem vários argumentos
      e transforma em uma cadeia de funções cada uma com um argumento,
      ou seja, existe uma função por argumento
     */

    val sumThreeInts = {x:Int, y: Int, z: Int -> x+y+z}

    val curried: (Int) -> (Int) -> (Int) -> Int = sumThreeInts.curried()
    val curriedResult = curried(2)(4)(6)

    println("Curried: $curriedResult")
}