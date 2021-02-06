package com.example.recyclerview.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.adapter.viewholder.AlunoViewHolder
import com.example.recyclerview.model.Aluno
import com.example.recyclerview.view.DetalheAlunoActivity

class AlunosAdapter(private val alunosList: MutableList<Aluno>) : RecyclerView.Adapter<AlunoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlunoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.aluno_item, parent, false)
        return AlunoViewHolder(view)
    }

    override fun getItemCount() = alunosList.size

    override fun onBindViewHolder(holder: AlunoViewHolder, position: Int) {
        val name = holder.name
        name.text = alunosList[position].nome

        val matricula = holder.matricula
        matricula.text = alunosList[position].matricula

        val imagem = holder.imageAluno
        imagem.setImageResource(alunosList[position].image)

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetalheAlunoActivity::class.java)
            intent.putExtra("NOME", alunosList[position].nome)
            intent.putExtra("MATRICULA", alunosList[position].matricula)
            intent.putExtra("IMAGE", alunosList[position].image)
            it.context.startActivity(intent)
        }
    }

}