package Aula10

class CamaroteSuperior(val valorAdcCamarote: Double, override val valor: Double, override val valorAdicional: Double, val cadeira: Int): Vip(valor) {

    override fun imprimeValor(){
        println("Ingresso camarote superior localizado na cadeira $cadeira, no valor de ${valorTotalDoIngresso()} ")
    }

    override fun valorTotalDoIngresso(): Double {
        return super.valorTotalDoIngresso() + valorAdcCamarote
    }
}