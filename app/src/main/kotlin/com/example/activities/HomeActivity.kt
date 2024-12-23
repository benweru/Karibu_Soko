package com.example.activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fragments.OnboardingFragment
import com.example.fragments.CartFragment

import com.example.fragments.HomeFragment
import com.example.fragments.MyStoreFragment
import com.example.fragments.ProfileFragment
import com.example.karibusoko.R
import com.google.android.material.bottomnavigation.BottomNavigationView



class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        replaceFragment(HomeFragment())

        findViewById<BottomNavigationView>(R.id.bottom_navigation).setOnItemSelectedListener { item ->

            when (item.itemId) {
                R.id.home -> {
                    replaceFragment(HomeFragment())
                }

                R.id.my_store -> {
                    replaceFragment(MyStoreFragment())
                }

                R.id.account -> {
                    replaceFragment(ProfileFragment())
                }
                R.id.shopping_cart -> {
                    replaceFragment(CartFragment())
                }
            }
            return@setOnItemSelectedListener true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.commit()
    }
}
