package br.com.learning.oop.classes
/* necessário apenas se tiver algum modificador de acesso
class Person constructor(firstName: String, lastName: String) {

}*/

/*class Person (firstName: String, lastName: String) {

    init {
        println("Created a person named: $firstName $lastName")
    }
}*/

class Person internal constructor (firstName: String, lastName: String) { //construtor primário

    init {
        println("Created a person named: $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String): this(firstName, lastName)
}