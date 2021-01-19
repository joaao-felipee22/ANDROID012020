package Aula10

class CamaroteInferior(override val valor: Double, override val valorAdicional: Double, val cadeira: Int) : Vip(valor) {

    override fun imprimeValor() {
        println("Ingresso camarote inferior localizado na cadeira $cadeira, no valor de ${valorTotalDoIngresso()} ")
    }
}