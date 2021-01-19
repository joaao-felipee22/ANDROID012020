package Aula11

fun main() {
    val foto = Foto()
    val documento = Documento()
    val contrato = Contrato()
    val impressora = Impressora()
    impressora.add(foto)
    impressora.add(documento)
    impressora.add(contrato)
    impressora.mostrarItens()
}

interface Imprimivel {
    var nome: String
    var tipoDocumento: String

    fun imprimir(){
        println("Eu sou um $nome $tipoDocumento")
    }
}

class Impressora {
    val listaImprimivel = mutableListOf<Imprimivel>()

    fun add(imprimivel: Imprimivel) {
        listaImprimivel.add(imprimivel)
    }

    fun mostrarItens() {
        for (imp in listaImprimivel) {
            imp.imprimir()
            imp.nome
            imp.tipoDocumento
        }
    }
}

class Foto : Imprimivel {
    override var nome = "selfie"
    override var tipoDocumento = "Jpg"
}

class Documento : Imprimivel {
    override var nome = "documento"
    override var tipoDocumento = "word"
}

class Contrato : Imprimivel {
    override var nome = "contrato"
    override var tipoDocumento = "muito legal"

    override fun imprimir() {
        println("No contrato eu sobreescrevi a funcao sem chamar super, deve aparecer apenas esse texto")
    }
}