package santander

class ContaPoupanca(val taxa: Double, cliente: Cliente) : Conta(cliente) {
    override fun sacar(valor: Double) {
        if (valor <= saldo) {
            saque(valor)
        } else {
            printSaldoInsuficiente()
        }
    }

    fun recolherJuros() {
        println("Juros no valor de ${(taxa/100) * saldo} recolhidos com sucesso")
    }
}