package Aula7

class JogadorDeFutebol(val nome: String, var energia: Int, var alegria: Int, var experiencia: Int) {
    var gols = 0

    fun fazerGol(){
        energia -= 5
        alegria += 10
        gols += 1

        println("GOOOOOL!")
    }

    fun correr(){
        energia -= 10
        println("Cansei")
    }
}