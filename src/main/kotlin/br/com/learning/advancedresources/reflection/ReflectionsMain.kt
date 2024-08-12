package br.com.learning.advancedresources.reflection

import br.com.learning.oop.classes.Person

fun main() {

    //tem um custo
    //acessar informações da classe em tempo de execução
    val person = Person("Stan", "Lee")

    val kClass = person::class

    //println("Simple name of class: $kClass")
    println("Simple name of class: ${kClass.simpleName}")

    //for (field in kClass.members) {
    for (field in kClass.java.declaredFields) {
        //println("Property name: $field")
        println("Property name: ${field.name}")
    }

    for (constructor in kClass.constructors) {
        //println("Property name: $field")
        println("Property name: $constructor")
        println("Constructor return: ${constructor.returnType}")
        println("Parameters: ${constructor.parameters}")
    }
}