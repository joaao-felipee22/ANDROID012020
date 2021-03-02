package com.example.recyclerview.adapter.viewholder

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AlunoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val name by lazy { view.findViewById<TextView>(R.id.tv_name) }
    val botaoAudio by lazy { view.findViewById<FloatingActionButton>(R.id.btn_audio) }

}