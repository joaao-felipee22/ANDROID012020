package Aula14Exercicio

class Fornecedor {
    private val listaDeProdutos = mutableListOf<Produto>()

    fun entrar(desc: String = "", prec: Double = 0.0){

        val produto = if (desc.isEmpty()){
            Produto(preco = prec)
        }else{
            Produto(descricao = desc, preco = prec)
        }

        listaDeProdutos.add(produto)
    }

    fun listarProdutos(imprimir: (lista: List<Produto>) -> Unit){
        imprimir(listaDeProdutos)
    }
}