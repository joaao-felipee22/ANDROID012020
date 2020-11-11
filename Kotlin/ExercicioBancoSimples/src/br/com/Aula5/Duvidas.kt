package Aula5

fun main(args: Array<String>) {
    printArray()
}

fun printArray() {
    val list = listOf(1, 2, 3, 4, 5, 6)

    //utilizando o for in range
    for (i in list) {
        print(list[i])
    }

    //utilizando for each
//    array.forEach { element -> print(element) }
}