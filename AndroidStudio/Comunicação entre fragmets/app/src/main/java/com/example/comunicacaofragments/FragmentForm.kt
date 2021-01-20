package com.example.comunicacaofragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class FragmentForm: Fragment() {
    private val nameField by lazy {  view?.findViewById<TextInputEditText>(R.id.field_name) }
    private val passField by lazy {  view?.findViewById<TextInputEditText>(R.id.field_pass) }
    private val nameInputLayout by lazy {  view?.findViewById<TextInputLayout>(R.id.input_layout_name) }
    private val passInputLayout by lazy {  view?.findViewById<TextInputLayout>(R.id.input_layout_pass) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_form, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.confirm_button)

        button.setOnClickListener {
            onFinishForm()
        }
    }

    private fun onFinishForm() {
        val activityContract = requireActivity() as ActivityContract

        val name = nameField?.text.toString()
        val pass = passField?.text.toString()

        when {
            name.isBlank() && pass.isBlank() -> {
                nameInputLayout?.error = "Required"
                passInputLayout?.error = "Required"
            }
            name.isBlank() -> {
                nameInputLayout?.error = "Required"
                passInputLayout?.error = null
            }
            pass.isBlank() -> {
                passInputLayout?.error = "Required"
                nameInputLayout?.error = null
            }
            else -> {
                nameInputLayout?.error = null
                passInputLayout?.error = null
                activityContract.onFinishForm(name, pass)
            }
        }
    }
}