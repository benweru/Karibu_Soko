package com.example.activities

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.karibusoko.R


import com.example.fragments.ProfileFragment


class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile) // Replace with your actual layout file

        // Check if the fragment is already added
        if (supportFragmentManager.findFragmentById(R.id.ProfileFragmentContainer) == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.ProfileFragmentContainer, ProfileFragment())
                .commit()
        }
    }
}
