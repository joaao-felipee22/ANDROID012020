package santander

class ContaCorrente(var chequeEspecial: Double, cliente: Cliente): Conta(cliente) {

    override fun sacar(valor: Double) {
        when {
            valor <= saldo -> saque(valor)
            valor <= saldo + chequeEspecial -> sacarChequeEspecial(valor)
            else -> printSaldoInsuficiente()
        }
    }

    fun depositarCheque(cheque: Cheque): Double{
        depositar(cheque.valor)
        return saldo
    }

    private fun sacarChequeEspecial(valor: Double) {
        val excedente = valor - saldo

        saque(saldo)
        saqueChequeEspecial(excedente)
    }

    private fun saqueChequeEspecial(excedente: Double) {
        chequeEspecial -= excedente
        println("Saque de $excedente do cheque especial. Saldo do Cheque Especial: $chequeEspecial")
    }
}