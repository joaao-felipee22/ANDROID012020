package santander

fun main() {
    /**Tirar as duas barras para a funçao que quer testar, fiz assim pra não bagunçar o terminal*/

    /**Exemplos CONTA CORRENTE*/
//    saqueSemExcederSaldo()
//    saqueExcedendoSaldo()
//    saqueExcedendoSaldoEchequeEspecial()
    variosSaques()

    /**Exemplos CONTA POUPANCA*/
//    saqueSemExcederSaldoPoup()
//    saqueExcedendoSaldoPoup()
//    recolhimentoDeJuros()
}

fun saqueSemExcederSaldoPoup() {
    val cliente = Cliente(1, "Santos", "123123312", "090880809-12")
    val conta = ContaPoupanca(3.0, cliente)

    conta.depositar(200.0)
    conta.sacar(50.0)
}

fun saqueExcedendoSaldoPoup() {
    val cliente = Cliente(1, "Santos", "123123312", "090880809-12")
    val conta = ContaPoupanca(3.0, cliente)

    conta.depositar(200.0)
    conta.sacar(250.0)
}

fun recolhimentoDeJuros() {
    val cliente = Cliente(1, "Santos", "123123312", "090880809-12")
    val conta = ContaPoupanca(1.0, cliente)

    conta.depositar(200.0)
    conta.recolherJuros()
}

fun variosSaques() {
    val cliente = Cliente(1, "Santos", "123123312", "090880809-12")
    val contaCorrente = ContaCorrente(100.0, cliente)

    contaCorrente.depositar(200.0)
    contaCorrente.sacar(50.0)
    println()
    contaCorrente.sacar(200.0)
    println()
    contaCorrente.sacar(100.0)
}

fun saqueExcedendoSaldo() {
    val cliente = Cliente(1, "Santos", "123123312", "090880809-12")
    val contaCorrente = ContaCorrente(100.0, cliente)

    contaCorrente.depositar(200.0)
    contaCorrente.sacar(250.0)
}

private fun saqueSemExcederSaldo() {
    val cliente = Cliente(1, "Santos", "123123312", "090880809-12")
    val contaCorrente = ContaCorrente(100.0, cliente)

    contaCorrente.depositar(200.0)
    contaCorrente.sacar(50.0)
}

private fun saqueExcedendoSaldoEchequeEspecial() {
    val cliente = Cliente(1, "Santos", "123123312", "090880809-12")
    val contaCorrente = ContaCorrente(100.0, cliente)

    contaCorrente.depositar(200.0)
    contaCorrente.sacar(301.0)
}