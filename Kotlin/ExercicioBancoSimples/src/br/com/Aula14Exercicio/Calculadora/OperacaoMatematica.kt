package Aula14Exercicio.Calculadora

interface OperacaoMatematica {
    val param1: Double
    val param2: Double
    val tipo: String
    fun resultado(): Double
}