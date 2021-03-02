package com.example.recyclerview.adapter

import android.content.Intent
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.adapter.viewholder.AlunoViewHolder
import com.example.recyclerview.model.Audio

class AlunosAdapter(private val alunosList: MutableList<Audio>) : RecyclerView.Adapter<AlunoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlunoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.aluno_item, parent, false)
        return AlunoViewHolder(view)
    }

    override fun getItemCount() = alunosList.size

    override fun onBindViewHolder(holder: AlunoViewHolder, position: Int) {
        val name = holder.name
        name.text = alunosList[position].nome

        holder.botaoAudio.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, alunosList[position].toString())
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            it.context.startActivity(shareIntent)
        }
    }

}