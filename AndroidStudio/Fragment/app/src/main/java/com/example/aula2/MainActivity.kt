package com.example.aula2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager

        val transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.container1, FragmentExample())
        transaction.add(R.id.container2, FragmentExample2())
        transaction.commit()


        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val fragmentManager = supportFragmentManager

            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.container1,FragmentExample2() )
            transaction.replace(R.id.container2, FragmentExample())
            transaction.commit()

        }
    }
}