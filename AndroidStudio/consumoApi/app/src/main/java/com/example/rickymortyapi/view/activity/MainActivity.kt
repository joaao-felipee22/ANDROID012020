package com.example.rickymortyapi.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rickymortyapi.R
import com.example.rickymortyapi.model.Result
import com.example.rickymortyapi.view.adapter.PersonagensAdapter
import com.example.rickymortyapi.viewmodel.ViewModelPersonagens

class MainActivity : AppCompatActivity() {
    private var results = mutableListOf<Result>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recycler_home)

        //como se fosse fidby do viewModel
        val viewModelCharacter =  ViewModelProviders.of(this).get(ViewModelPersonagens::class.java)
        //config recycler
        val adapterCharacter = PersonagensAdapter(results, this)
        recycler.adapter = adapterCharacter
        val layoutManager = GridLayoutManager(this, 2)
        recycler.layoutManager = layoutManager

        viewModelCharacter.getAllCharacters()
        viewModelCharacter.listMutableCharacter.observe(this, Observer {
            it?.let { itChar -> results.addAll(itChar) }
            adapterCharacter.notifyDataSetChanged()
        })
    }
}