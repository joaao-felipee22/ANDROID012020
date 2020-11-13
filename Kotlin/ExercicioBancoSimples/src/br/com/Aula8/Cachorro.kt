package Aula8

class Cachorro(raca: String, nome: String): Animal(raca, nome) {

    override val tipo = "Cachorro"

    override fun andar() {
        println("Anda como um cachorro")
    }

    fun latir(){

    }

    fun cavarBuraco(){

    }
}