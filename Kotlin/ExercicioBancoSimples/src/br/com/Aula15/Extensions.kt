package Aula15

fun String.inverter(): String {
    var stringAux = ""

    for (index in this.length-1 downTo 0) {
        stringAux += this[index]
    }

    return stringAux
}

fun String.addLinhaTracejada(): String{
    return "$this-----"
}

fun String.extensaoString(): String{
    return "$this Extensao manual."
}