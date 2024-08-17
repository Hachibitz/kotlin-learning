package br.com.learning.functionalprogramming.partial

import org.funktionale.partials.partially1
import org.funktionale.partials.partially3

fun main() {

    val prefixAndPostfix: (String, String, String) -> String =
        {prefix: String, str: String, postfix: String -> "$prefix$str$postfix"}

    val prefixAndAlert: (String, String) -> String = prefixAndPostfix.partially3("!")

    val hello: (String) -> String = prefixAndAlert.partially1("Hello, ")

    println(hello("Funktionale"))
}