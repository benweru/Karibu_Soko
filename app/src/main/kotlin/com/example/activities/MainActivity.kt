package com.example.activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fragments.CartFragment
import com.example.fragments.HomeFragment
import com.example.fragments.OnboardingFragment
import com.example.fragments.SignInFragment
import com.example.karibusoko.R
import com.google.android.material.bottomnavigation.BottomNavigationView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(HomeFragment())


        findViewById<BottomNavigationView>(R.id.bottom_navigation).setOnItemSelectedListener { item ->

            when (item.itemId) {
                R.id.home -> {
                    replaceFragment(HomeFragment())
                }

                R.id.my_store -> {
                    replaceFragment(OnboardingFragment())
                }

                R.id.account -> {
                    replaceFragment(Fragment())
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
