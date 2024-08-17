package br.com.learning.functionalprogramming.closure

fun closureMaker(): () -> Unit {

    //variáveis permanecem vivas depois do fim da função
    var num = 0
    return { println(num++) }
}

fun main() {

    val myCounter1 = closureMaker()
    val myCounter2 = closureMaker()

    myCounter1()
    myCounter1()
    myCounter1()
    myCounter1()
    myCounter2()
    myCounter2()
    myCounter1()
}