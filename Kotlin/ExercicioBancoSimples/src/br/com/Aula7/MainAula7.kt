package Aula7

fun main() {
    val jogador1 = JogadorDeFutebol("José", 80, 70, 50)

//    jogador1.fazerGol()
//
//    jogador1.correr()

    val sessaoDeTreinamento = SessaoDeTreinamento()

    sessaoDeTreinamento.treinarA(jogador1)
    sessaoDeTreinamento.treinarA(jogador1)

    println("energia = ${jogador1.energia}, alegria = ${jogador1.alegria}, gols = ${jogador1.gols}, experiencia = ${jogador1.experiencia}")
}