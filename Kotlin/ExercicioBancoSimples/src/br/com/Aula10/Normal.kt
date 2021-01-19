package Aula10

class Normal(override val valor: Double): Ingresso() {
    override fun imprimeValor(){
        println("Esse ingresso normal custa $valor reais")
    }
}