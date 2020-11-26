package Aula14Exercicio.Calculadora

class Multiplicacao(override val param1: Double, override val param2: Double) : OperacaoMatematica {
    override val tipo = this.javaClass.simpleName

    override fun resultado() = param1 * param2
}