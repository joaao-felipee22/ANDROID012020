package Aula5

fun main(args: Array<String>) {
//    print(theGreater(100, 55, 300))
//    print(isEquals("textoA", "textoB"))
//    print(isPar(45))
//    printCemPrimeirosPosImp()
//    print(analisarNumeros(1,1,1,1))
//    printCemPrimeirosPositivos()
}

fun theGreater(numA: Int, numB: Int, numC: Int): Int {
    if (numA > numB && numA > numC) {
        return numA
    } else if (numB > numA && numB > numC) {
        return numB
    } else {
        return numC
    }
}

fun isEquals(textA: String, textB: String): Boolean {
    if (textA == textB) {
        return false
    } else return true
}

fun isPar(number: Int): Boolean {
    if (number % 2 == 0) return true else return false
}

fun printCemPrimeirosPosImp() {
    for (number in 1..100) {
        if (number % 2 != 0) print(number)
    }
}

fun analisarNumeros(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    var output: Boolean

    if (numA > numC && numA > numD) {
        return true
    } else if (numB > numC && numB > numC) {
        return true
    } else {
        return false
    }
}


fun printCemPrimeirosPositivos() {
    for (i in 1..100) {
        print(i)
    }
}

