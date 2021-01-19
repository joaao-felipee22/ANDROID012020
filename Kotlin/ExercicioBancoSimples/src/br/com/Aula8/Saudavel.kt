package Aula8

interface Saudavel {
    val diagnostico: String

    fun animalSaudavel(): Boolean

    fun tomarMedicamento(){
        if (animalSaudavel()){
            println("Não precisa tomar medicamentos.")
        }else{
            println("Precisa tomar medicamentos.")
        }
    }
}