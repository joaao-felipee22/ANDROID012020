package santander

abstract class Conta(cliente: Cliente) {
    var saldo = 0.0

    abstract fun sacar(valor: Double)

    fun depositar(valor: Double): Double{
        saldo += valor
        println("Deposito de $valor na conta. Saldo atual: $saldo")
        return saldo
    }

    protected fun saque(valor: Double): Double{
        saldo -= valor
        println("Saque de $valor na conta. Saldo atual: $saldo")
        return saldo
    }

    protected fun printSaldoInsuficiente(){
        println("Saldo insuficente")
    }
}