package com.example.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.SignInFragment
import com.example.karibusoko.R

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // Check if the fragment is already added
        if (supportFragmentManager.findFragmentById(R.id.signInFragmentContainer) == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.signInFragmentContainer, SignInFragment())
                .commit()
        }
    }
}
