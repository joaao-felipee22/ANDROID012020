package com.example.validandoedittezt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private val floatButton by lazy { findViewById<FloatingActionButton>(R.id.btn_check) }
    private val editName by lazy { findViewById<TextInputEditText>(R.id.edit_nome) }
    private val editEmail by lazy { findViewById<TextInputEditText>(R.id.edit_email) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floatButton.setOnClickListener{
            Toast.makeText(this, "TESTE", Toast.LENGTH_LONG).show()
        }
    }

    fun validateLogin(name: String, email: String) {
        TODO("Validar nome e email estão corretos, se forem corretos subir um SnackBar dizendo 'Sucesso'")
    }
}