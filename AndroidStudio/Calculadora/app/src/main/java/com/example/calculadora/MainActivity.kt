package com.example.calcular

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.calculadora.R
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    //realizando findViewById
    private val primeiroNumEdit by lazy { findViewById<TextInputEditText>(R.id.primerio_num) }
    private val segundoNumEdit by lazy { findViewById<TextInputEditText>(R.id.segundo_num) }
    private val txtResultado by lazy { findViewById<TextView>(R.id.txt_resultado) }
    private val btnCalcular by lazy { findViewById<Button>(R.id.btn_calcular) }
    // by lazy : quando variavel for chamada ja ira estar inicializada

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ao clicar no botao calcular, pega os dois numeros que o usuario escreveu soma eles e insere no TextView
        btnCalcular.setOnClickListener{
            val primeiroNum = primeiroNumEdit.text.toString()
            val segundoNum = segundoNumEdit.text.toString()
            val resultado = soma(primeiroNum.toInt(), segundoNum.toInt()) // 2
            txtResultado.text = resultado

            //txtResultado.text = soma(primeiroNum.toInt(), segundoNum.toInt())
        }
    }

    //Pega dois numeros inteiros soma eles e retorna formatado para uma string
    fun soma(primeiroNum: Int, segundoNum: Int) : String {
        val resultado = primeiroNum + segundoNum //1+1 = 2
        return resultado.toString()
    }
}