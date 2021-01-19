package Aula10

abstract class Vip(override val valor: Double): Ingresso() {
    abstract val valorAdicional: Double
    override fun imprimeValor(){
        println("Esse ingresso vip custa ${valorTotalDoIngresso()} reais")
    }

    open fun valorTotalDoIngresso() = valor + valorAdicional
}