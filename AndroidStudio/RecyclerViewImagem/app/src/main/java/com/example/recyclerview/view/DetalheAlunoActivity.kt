package com.example.recyclerview.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.recyclerview.R
import com.example.recyclerview.model.Aluno

class DetalheAlunoActivity : AppCompatActivity() {

    val toolbar by lazy { findViewById<Toolbar>(R.id.toolbar_alunos) }
    val nomeAlunotxt by lazy { findViewById<TextView>(R.id.txt_name_aluno) }
    val matriculaAlunotxt by lazy { findViewById<TextView>(R.id.txt_matricula_aluno) }
    val imagemViewAluno by lazy { findViewById<ImageView>(R.id.img_aluno) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_aluno)

        setSupportActionBar(toolbar)

        val informacoes = intent.extras

        if(informacoes != null){
            val nomeAluno = informacoes.getString("NOME")
            val matriculaAluno = informacoes.getString("MATRICULA")
            val imagemAluno = informacoes.getInt("IMAGE")
            val alunoRecebido = Aluno(nomeAluno, matriculaAluno, imagemAluno)

            nomeAlunotxt.text = alunoRecebido.nome
            matriculaAlunotxt.text = alunoRecebido.matricula
            imagemViewAluno.setImageResource(imagemAluno)
        } else {
            Toast.makeText(this, "Erro ao carregar aluno", Toast.LENGTH_LONG).show()
        }

    }

}