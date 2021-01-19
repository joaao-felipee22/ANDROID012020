package Aula5

fun main() {
    retornaSomaPares(listOf(1,2,3,4,5,6,7,8))

    print(retornaSomaPares(listOf(1,2,3,4,5,6,7,8)))
}

//Escrever um programa que receba um Array e retorne a soma de todos os elementos pares do Array.
fun retornaSomaPares(valores: List<Int>): Int {
    var soma = 0

    for (elemento in valores) {
        if (elemento % 2 == 0){
            soma += elemento
        }
    }

    return soma
}

//EscrevaumprogramaquerecebaumArraydenúmeroseretorneumArray
//com todos os elementos pares dele.

