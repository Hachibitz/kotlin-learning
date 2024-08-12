package br.com.learning.advancedresources.annotation.model
/* necessário apenas se tiver algum modificador de acesso
class Person constructor(firstName: String, lastName: String) {

}*/

/*class Person (firstName: String, lastName: String) {

    init {
        println("Created a person named: $firstName $lastName")
    }
}*/

@Deprecated("Use the Animal class instead", ReplaceWith("Animal"))
class Person internal constructor (var firstName: String, var lastName: String) { //construtor primário

    init {
        println("Created a person named: $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String): this(firstName, lastName)
}