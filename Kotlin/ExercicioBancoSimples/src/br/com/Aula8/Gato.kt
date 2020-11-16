package Aula8

class Gato(raca: String, nome: String ): Animal(raca, nome), Saudavel {
    override val diagnostico = "é saudavel"

    override fun animalSaudavel() = true

    override val tipo = "Gato"

    override fun andar() {
        println("O gato silencioso")
    }

    fun miar(){

    }

    fun subirMuro(){

    }
}