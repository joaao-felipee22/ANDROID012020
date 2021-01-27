package com.example.viewpager.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.viewpager.R

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

    companion object {
        const val FRAGMENT_NAME = "fragment_name"
        const val BACKGROUND_COLOR = "background_color"

        @JvmStatic
        fun newInstance(name: String, backgroundColor: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putString(FRAGMENT_NAME, name)
                    putInt(BACKGROUND_COLOR, backgroundColor)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            view.findViewById<TextView>(R.id.fragment_name).text =
                it.getString(FRAGMENT_NAME, "Empty name")
            view.findViewById<ConstraintLayout>(R.id.parent).setBackgroundColor(
                ContextCompat.getColor(
                    requireContext(), it.getInt(
                        BACKGROUND_COLOR,
                        R.color.black
                    )
                )
            )
        }

        super.onViewCreated(view, savedInstanceState)
    }
}