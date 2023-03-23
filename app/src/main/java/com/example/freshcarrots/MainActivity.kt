package com.example.freshcarrots

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val supportFragmentManager = supportFragmentManager
//        val fragmentTransaction = supportFragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.content, NowPlayingMoviesFragment(), null).commit()

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        replaceFragment(NowPlayingMoviesFragment())

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.ic_films -> replaceFragment(NowPlayingMoviesFragment())
                R.id.ic_actors -> replaceFragment(NowTrendingActorsFragment())
            }
            true
        }
    }


    private fun replaceFragment(fragment: Fragment)
    {
        if(fragment != null)
        {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.content, fragment).commit()
        }
    }
}