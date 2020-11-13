package Aula8

class Gato(raca: String, nome: String ): Animal(raca, nome) {

    override val tipo = "Gato"

    override fun andar() {
        println("O gato silencioso")
    }

    fun miar(){

    }

    fun subirMuro(){

    }
}