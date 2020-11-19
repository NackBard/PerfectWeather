package com.example.perfectweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.perfectweather.fragment.CitiesFragment
import com.example.perfectweather.fragment.TodayFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val todayFragment = TodayFragment()
        val citiesFragment = CitiesFragment()

        makeCurrentFragment(todayFragment)

        bottom_nav.setOnNavigationItemReselectedListener {
            when (it.itemId){
                R.id.action_today -> makeCurrentFragment(todayFragment)
                R.id.action_Cities -> makeCurrentFragment(citiesFragment)
            }
        }

    }
    private fun makeCurrentFragment(fragment:Fragment) = supportFragmentManager.beginTransaction().apply {
        replace(R.id.fl_wrapper,fragment)
        commit()
    }
}