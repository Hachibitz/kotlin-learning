package br.com.learning.function

fun main() {
    println("10 + 20 = ${myMathFunction(10, 20)}")
    println("15 + 25 = ${myMathFunctionExpressionBody(15, 25)}")
    println("32 + 10 = ${myMathFunctionExpressionBodyWithInference(32, 10)}")
    println("23 + 10 = ${myFunctionWithDefaults(23, 10)}")
    println("23 + 10 = ${myFunctionWithDefaults(23, 10, "Hello")}")
    println("Default sum = ${myFunctionWithDefaults(message = "HelloSetter")}")
}

fun myMathFunction(numberOne: Int, numberTwo: Int): Int {
    return numberOne+numberTwo
}

//reescrita com expressionBody
fun myMathFunctionExpressionBody(numberOne: Int, numberTwo: Int): Int = numberOne+numberTwo

//reescrita com expressionBody com inferência
fun myMathFunctionExpressionBodyWithInference(numberOne: Int, numberTwo: Int) = numberOne+numberTwo

//função com valores padrão
fun myFunctionWithDefaults(numberOne: Int = 1, numberTwo: Int = 2, message: String = "Hi"): Int {
    val result = numberOne+numberTwo
    println(message)
    return result
}