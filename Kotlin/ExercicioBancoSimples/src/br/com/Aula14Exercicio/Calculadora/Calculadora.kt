package Aula14Exercicio.Calculadora

class Calculadora {
    fun calcular(operacaoMatematica: OperacaoMatematica) {
        val resultado = operacaoMatematica.resultado()

        println("O resultado de ${operacaoMatematica.tipo} de ${operacaoMatematica.param1} e ${operacaoMatematica.param2} é $resultado")
    }

    fun calcularLambda(param1: Double, param2: Double, operacao: (Double, Double) -> Double){
        println("O resultado da operacao é ${operacao(param1, param2)}")
    }
}