package com.example.rickymortyapi.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ProgressBar
import android.widget.Toast
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

    val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_home)}
    val viewModelCharacter by lazy { ViewModelProviders.of(this).get(ViewModelPersonagens::class.java)}
    lateinit var progressBar : ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar = findViewById(R.id.progressBar)
        //config recycler
        val adapterCharacter = PersonagensAdapter(results, this)
        recycler.adapter = adapterCharacter
        val layoutManager = GridLayoutManager(this, 2)
        recycler.layoutManager = layoutManager

        viewModelCharacter.listMutableCharacter.observe(this, Observer {
            it?.let { itChar -> results.addAll(itChar) }
            adapterCharacter.notifyDataSetChanged()
        })
        viewModelCharacter.loading.observe(this, Observer {
            if(it){
                progressBar.visibility = VISIBLE
            } else {
                progressBar.visibility = GONE
            }
        })
        viewModelCharacter.errorMessage.observe(this, Observer {
            it?.let {
                Toast.makeText(this, it, Toast.LENGTH_LONG).show()
            }
        })
    }
}