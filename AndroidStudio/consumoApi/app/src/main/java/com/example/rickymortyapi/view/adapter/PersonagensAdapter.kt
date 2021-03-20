package com.example.rickymortyapi.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rickymortyapi.R
import com.example.rickymortyapi.model.Result
import com.squareup.picasso.Picasso

class PersonagensAdapter(
    private val list: List<Result>,
    private val context: Context
) : RecyclerView.Adapter<PersonagensViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonagensViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recycler, parent, false)
        return PersonagensViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PersonagensViewHolder, position: Int) {
        val character = list.elementAt(position)
        Picasso.get().load(character.image).into(holder.image)
        holder.name.text = character.name
    }

}
