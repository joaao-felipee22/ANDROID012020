package Aula14

fun main() {

    val pessoa = Pessoa(idade = 32, nome = "Jose", sobrenome = "Santos", anoDeNascimento = 1988)

    val sum: (Int, Int) -> Int = { x, y -> x + y }

    val soma = sum(5, 2)

    val sum2 = { x: Int, y: Int -> x + y }

    val soma2 = sum2(5,7)


    println(soma)
    println(soma2)
}