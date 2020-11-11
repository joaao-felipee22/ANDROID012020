package Aula8

import Cachorro

fun main(args: Array<String>) {

    val cachorro = Cachorro("RND", "Bidu")
    val gato = Gato("Siames", "Mingau")

    cachorro.andar()
    cachorro.cavarBuraco()

    gato.andar()
    gato.miar()
}



