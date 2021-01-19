package Aula7

class SessaoDeTreinamento {

    fun treinarA(jogador: JogadorDeFutebol){
        var experienciaInicial = jogador.experiencia

        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        jogador.experiencia ++

        println("A experiencia inicial era $experienciaInicial e a experiencia final é ${jogador.experiencia}")
    }
}