package com.example.recyclerview.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.adapter.AlunosAdapter
import com.example.recyclerview.model.Aluno

class MainActivity : AppCompatActivity() {
    val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_view) }
    val toolbar by lazy { findViewById<Toolbar>(R.id.toolbar) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //seta a toolbar usando o suporte para action bar(barra superior)
        setSupportActionBar(toolbar)

        val alunos = getAlunos()

        //recycler.layoutManager = GridLayoutManager(this, 3)
        recycler.layoutManager = LinearLayoutManager(this)


        val adapter  = AlunosAdapter(alunos)

        recycler.adapter = adapter
        
    }

    private fun getAlunos(): MutableList<Aluno> {
        val alunosList = mutableListOf<Aluno>()
        
        alunosList.add(Aluno("Jaum", "1", R.drawable.narutoimage))
        alunosList.add(Aluno("GodZilla", "2", R.drawable.godzilla))
        alunosList.add(Aluno("KingKong", "3", R.drawable.kong))
        alunosList.add(Aluno("Goku", "4", R.drawable.goku))

        return alunosList
    }
}