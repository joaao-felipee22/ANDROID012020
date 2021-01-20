package com.example.comunicacaofragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentProfile : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    fun setData(name: String, pass: String) {
        view?.let {
            it.findViewById<TextView>(R.id.tv_name).text = name
            it.findViewById<TextView>(R.id.tv_password).text = pass
        }
    }
}