package Aula8

fun main() {

    val cachorro = Cachorro("RND", "Bidu")
    val gato = Gato("Siames", "Mingau")

    executar(cachorro)
    executar(gato)
}

fun executar(animal: Animal){
    animal.andar()
    animal.respirar()
}



