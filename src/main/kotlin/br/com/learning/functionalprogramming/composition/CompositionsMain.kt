package br.com.learning.functionalprogramming.composition

import org.funktionale.composition.compose
import org.funktionale.composition.forwardCompose

fun main() {

    //cria uma nova função combinando outras duas funções
    val add5 = {i: Int -> i + 5}
    val multiplyBy2 = {i: Int -> i * 2}

    //usa os resultados da segunda como parâmetros da primeira
    val multiplyBy2AndAdd5 = add5 compose multiplyBy2
    val composeResult = multiplyBy2AndAdd5(10)
    println("multiplyBy2AndAdd5(10) = $composeResult")

    //forwardCompose faz o caminho inverso, usa os resultados da primeira como parâmetros da segunda
    val add5AndMultiplyBy2 = add5 forwardCompose multiplyBy2
    val forwardComposeResult = add5AndMultiplyBy2(10)
    println("add5AndMultiplyBy2(10) = $forwardComposeResult")

}