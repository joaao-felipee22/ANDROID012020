package Aula6

class CalculaFatorial(private val fator: Int) {

    init {
        print(calculaFatorial())
    }

    fun calculaFatorial(): Int {
        var number = fator
        var fatorial = 1
        while (number > 0) {
            fatorial *= number
            number--
        }

        return fatorial
    }
}