package Aula8

abstract class Animal(val raca: String, val nomeDoAnimal: String) {

    abstract val tipo: String

    abstract fun andar()

    open fun respirar(){
        println("O animal do tipo $tipo respirou.")
    }
}
