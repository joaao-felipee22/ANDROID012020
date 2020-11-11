import Aula8.Animal

class Cachorro(raca: String, nome: String): Animal(raca, nome) {

    override val raca = "Buldogue"

    fun latir(){

    }

    fun cavarBuraco(){
        super.mamifero()
    }

    override fun respirar(){

        println("Executa algo antes de chamar a fun respirar da super classe Animal")
        super.respirar()
    }
}