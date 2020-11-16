package Aula8

class Cachorro(raca: String, nome: String): Saudavel, Animal(raca, nome) {
    override val diagnostico = "saudavel"

    override fun animalSaudavel() = false

    override val tipo = "Cachorro"

    override fun andar() {
        println("Anda como um cachorro")
    }

    fun latir(){

    }

    fun cavarBuraco(){

    }
}