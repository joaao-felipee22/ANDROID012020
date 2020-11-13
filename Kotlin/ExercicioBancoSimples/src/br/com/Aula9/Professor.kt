package Aula9

class Professor(val nome: String, val RD: Int) {
    val listaDeChamada = mutableListOf<Aluno>()

    fun darAula(aula: Aula){
        println("Aula ${aula.materia.nome} dada.")
    }

    fun chamadaDeAluno(aluno: Aluno){
        listaDeChamada.add(aluno)
    }

    fun imprimirListaDeChamada(){
        for (aluno in listaDeChamada){
            println("${aluno.nome} presente.")
        }
    }
}