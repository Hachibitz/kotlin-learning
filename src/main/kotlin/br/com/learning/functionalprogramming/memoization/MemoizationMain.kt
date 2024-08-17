package br.com.learning.functionalprogramming.memoization

fun main() {
    //armazenamento em cache o resultado de operações demoradas com base nas entradas

    var fibonacci: (Long) -> Long = {it}

    fibonacci = {n: Long ->
        if(n < 2) n else fibonacci(n - 1) + fibonacci(n-2)
    }
}