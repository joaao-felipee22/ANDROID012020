package Aula9

fun main() {

    val aluno1 = Aluno(123, "Jose", "Santos")
    val aluno2 = Aluno(145, "João", "Camargo")

    val materia = Materia("Kotlin")
    val aula = Aula(materia, "19:30", "21:45")

    val professor = Professor("Danilo",12)

    professor.chamadaDeAluno(aluno1)
    professor.chamadaDeAluno(aluno2)

    professor.imprimirListaDeChamada()

    professor.darAula(aula)
}