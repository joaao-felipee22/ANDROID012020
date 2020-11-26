package Aula14

import Aula14Exercicio.Calculadora.*

fun main() {

    val pessoa = Pessoa(idade = 32, nome = "Jose", sobrenome = "Santos", anoDeNascimento = 1988)

    val sum: (Int, Int) -> Int = { x, y -> x + y }

    val soma = sum(5, 2)

    val sum2 = { x: Int, y: Int -> x + y }

    val soma2 = sum2(5,7)


    println(soma)
    println(soma2)


    val soma3 = Soma(10.0, 5.0)
    val sub = Subtracao(10.0, 5.0)
    val mul = Multiplicacao(10.0, 0.0)
    val div = Divisao(10.0, 0.0)

    val calculadora = Calculadora()

    // calculadora com interface
    calculadora.calcular(soma3)
    calculadora.calcular(sub)
    calculadora.calcular(mul)
    calculadora.calcular(div)

    println()

    //calculadora com lambda
    val soma4 = { p1: Double, p2: Double -> p1 + p2 }
    val sub2 = { p1: Double, p2: Double -> p1 - p2 }
    val mult2 = { p1: Double, p2: Double -> p1 * p2 }
    val div2 = { p1: Double, p2: Double -> p1 / p2 }

    calculadora.calcularLambda(10.0, 5.0) { p1: Double, p2: Double ->
        p1 + p2
    }
    calculadora.calcularLambda(10.0, 5.0, sub2)
    calculadora.calcularLambda(10.0, 5.0, mult2)
    calculadora.calcularLambda(10.0, 5.0, div2)
}