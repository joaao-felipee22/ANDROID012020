package com.example.viewpager

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.ui.main.PlaceholderFragment
import com.example.viewpager.ui.main.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    val viewPager by lazy { findViewById<ViewPager2>(R.id.view_pager) }
    val tabs by lazy { findViewById<TabLayout>(R.id.tabs) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragments = getFragments()
        val sectionsPagerAdapter = SectionsPagerAdapter(fragments, this)

        viewPager.adapter = sectionsPagerAdapter
        viewPager.offscreenPageLimit = 1

        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = fragments[position].arguments?.getString(
                PlaceholderFragment.FRAGMENT_NAME,
                "Empty name"
            )
        }.attach()
    }

    private fun getFragments(): List<Fragment> {
        return listOf(
            PlaceholderFragment.newInstance(
                "First Fragment",
                R.color.design_default_color_on_secondary
            ),
            PlaceholderFragment.newInstance(
                "Second Fragment",
                R.color.design_default_color_error
            ),
            PlaceholderFragment.newInstance(
                "Third Fragment",
                R.color.design_default_color_primary
            )
        )
    }

}