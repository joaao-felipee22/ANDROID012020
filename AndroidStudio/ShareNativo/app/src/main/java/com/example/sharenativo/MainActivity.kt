package com.example.sharenativo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


class MainActivity : AppCompatActivity() {

    val btnAtivar by lazy { findViewById<Button>(R.id.btn_ativar)}
    val btnDesativar by lazy { findViewById<Button>(R.id.btn_desativar)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val thread = Thread {
            btnAtivar.text = "Ta rodando"
        }

        btnAtivar.setOnClickListener {
            thread.start()
        }

        btnDesativar.setOnClickListener {
            thread.interrupt()
        }

    }

}
