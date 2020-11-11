package Aula6

class Pessoa(val nome: String, val idade: Int, val altura: Double = 0.0){

    init {
        println("Meu nome é $nome e minha idade é $idade\n")
    }

    constructor(nome: String, idade: Int) : this(nome, idade, 0.0)

    fun falarNome(){
        println("Meu nome é $nome")
    }

    fun falarAltura(){
        if (altura == 0.0) println("Eu não sei a minha altura.")
        else println("Minha altura é $altura")
    }
}