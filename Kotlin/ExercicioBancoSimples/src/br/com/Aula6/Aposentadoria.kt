package Aula6

class Aposentadoria(private val idade: Int, private val sexo: String, private val anosContribuicao: Int) {

    init {

    }

    fun podeAposentar(): Boolean {

        return if (sexo.equals("Masculino")){

            true
        }else{
            true
        }
    }
}