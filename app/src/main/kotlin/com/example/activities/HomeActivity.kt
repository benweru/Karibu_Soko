package com.example.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.HomeFragment

import com.example.karibusoko.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Check if the fragment is already added
        if (supportFragmentManager.findFragmentById(R.id.HomeFragmentContainer) == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.HomeFragmentContainer, HomeFragment())
                .commit()
        }
    }
}
