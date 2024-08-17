package br.com.learning.functionalprogramming.funktionalelibrary

import org.funktionale.collections.destructured

fun main() {
    val (head, tail) = listOf(1,2,3).destructured()
    println("Head: $head, Tail: $tail")
}