package br.com.learning.advancedresources.destructuring

import br.com.learning.advancedresources.destructuring.model.Coordinates
import br.com.learning.advancedresources.destructuring.model.Point

fun main() {

    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1+c2
    println(c3)

    //destructuringEx.:
    /*
        na prática, duas variáveis são criadas e esses valores são extraídos da data class
        são definidas com base nas propriedades da classe de dados
        o kotlin obter o valor de cada variável de acordo com a ordem de definição do seu construtor
     */
    val (xCoordinate, yCoordinate) = c3
    println("xCoordinate: $xCoordinate, yCoordinate: $yCoordinate")
    println("xCoordinate: ${c3.component1()}, yCoordinate: ${c3.component2()}")

    /*
        para classes que não são de dados a desestruturação está disponível
        mas deve-se conectar os componentes do operador manualmente
     */

    val myPoint = Point(5000, 500, 6000)
    val (pX, pY, pZ) = myPoint
    println("pX = $pX, pY = $pY, pZ = $pZ")
}