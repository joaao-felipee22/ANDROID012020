package Aula9

class Aluno(val RA: Int, val nome: String, val sobreNome: String) {

    fun assistirAula(aula: Aula){
        println("Aluno $nome assitiu a aula ${aula.materia.nome}")
    }

    fun fazerLicaoDeCasa(){
        println("Aluno $nome fez a lição de casa")
    }
}