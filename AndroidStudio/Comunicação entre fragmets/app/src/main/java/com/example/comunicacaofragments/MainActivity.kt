package com.example.comunicacaofragments

import android.app.Activity
import android.inputmethodservice.InputMethodService
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager

class MainActivity : AppCompatActivity(), ActivityContract {
    lateinit var fragmentProfile: FragmentProfile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onFinishForm(name: String, pass: String) {
        fragmentProfile = supportFragmentManager.findFragmentById(R.id.fragment_profile) as FragmentProfile
        fragmentProfile.setData(name, pass)

        hideKeyboard()
    }

    private fun hideKeyboard() {
        val inputService = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        inputService.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
    }
}