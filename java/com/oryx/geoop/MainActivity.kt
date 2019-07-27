package com.oryx.geoop

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SettingsFragment.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager.adapter = AppViewPagerAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tabs, viewpager,
            TabLayoutMediator.OnConfigureTabCallback { tab, position ->
                // Styling each tab here
                tab.text = "Tab $position"
            }).attach()
    }
}
