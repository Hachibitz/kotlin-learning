package br.com.learning.training

fun main() {
    println("Digite o valor para a função fizzBuzz():")
    val inputNumber = readln().toIntOrNull()

    if(!isNumber(inputNumber)) println("Valor inválido. Digite um número inteiro")
    else println(fizzBuzz(inputNumber!!))
}

private fun fizzBuzz(size: Int): List<String> {
    val returnList = mutableListOf<String>()
    for (number in 1 .. size) {
        when {
            isMultipleOfThree(number) && !isMultipleOfFive(number) -> returnList.add("Fizz")
            !isMultipleOfThree(number) && isMultipleOfFive(number) -> returnList.add("Buzz")
            isMultipleOfThree(number) && isMultipleOfFive(number) -> returnList.add("FizzBuzz")
            else -> returnList.add(number.toString())
        }
    }

    return returnList;
}

private fun isMultipleOfThree(number: Int) = number % 3 == 0
private fun isMultipleOfFive(number: Int) = number % 5 == 0
private fun isNumber(input: Int?) = input != null
