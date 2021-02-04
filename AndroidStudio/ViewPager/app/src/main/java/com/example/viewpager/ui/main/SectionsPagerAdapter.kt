package com.example.viewpager.ui.main


import androidx.fragment.app.*
import androidx.viewpager2.adapter.FragmentStateAdapter


class SectionsPagerAdapter(private val listaFragment: List<Fragment>,
                           fragmentActivity: FragmentActivity)
    : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return listaFragment.size
    }

    override fun createFragment(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return listaFragment[position]
    }
}