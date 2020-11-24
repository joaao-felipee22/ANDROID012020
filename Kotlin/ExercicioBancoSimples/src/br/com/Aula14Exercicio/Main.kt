package Aula14Exercicio

fun main() {

    val fornedor = Fornecedor()

    fornedor.entrar(prec = 7.65)
    fornedor.entrar("amendoim crocante 500g")

    fornedor.entrar(prec = 5.85, desc = "suco de laranja")


    fornedor.listarProdutos { listaDeProd ->
        listaDeProd.forEachIndexed { _, produto ->
            println(produto)
        }
    }
}